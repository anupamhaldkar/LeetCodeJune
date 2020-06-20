class Solution {
    public String validIPAddress(String IP) {
        String result = "Neither";
        if (IP.indexOf('.') > 0) {
            if (checkIpv4(IP)) {
                result = "IPv4";
            }
        } else if (checkIpv6(IP)) {
            result = "IPv6";
        }
        return result;
    }
    
	/*To check IPV4 address validity*/
    boolean checkIpv4(String ip) {
        int num  = 0;
        int i = 0;
        char sep = '.';
        boolean zeroFound = false;
        int count = 0;
        int val = -1;              // used to identify empty bytes
        boolean valid = true;
        
        while (i < ip.length() && valid) {
            char curr = ip.charAt(i++);
            if (curr == sep) {
                valid = num < 255 && ++count < 4 && val != -1;
                zeroFound = false;
                val = -1;
                num = 0;
            } else if (curr >= '0' && curr <= '9') {
                val = curr - '0';
                if (zeroFound && val >= 0) {
                    valid = false;
                } else if (num == 0 && val == 0) {
                    zeroFound = true;
                } else {
                    num = num * 10 + val;
                }
            } else {
                valid = false;
            }
        }
        valid = valid && num >= 0 && num <= 255 && count == 3 && val != -1;
        return valid;
    }
    
	/*To check IPV6 address validity */
    boolean checkIpv6(String ip) {
        int i = 0;
        int count = 0;
        int width = 0;      // used to identify empty entries
        char sep = ':';
        boolean valid = true;
        
        while (i < ip.length() && valid) {
            char curr = ip.charAt(i++);
            if (curr == sep) {
                count++;
                valid = count <= 7 && (width > 0 && width <= 4);
                width = 0;
            } else if (isHexa(curr)) {
                if (width++ == 4) {
                    valid = false;
                }
            } else {
                valid = false;
            }
        }
        valid = valid && count == 7 && width <= 4 && width > 0;
        return valid;
    }
    
    boolean isHexa(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }
}
