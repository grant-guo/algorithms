package grant.guo.algorithms.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * For example, if the mangled string is "19216811" then two corresponding IP ad¬
 * dresses are 192.168.1.1 and 19.216.81.1. (There are seven other possible IP addresses
 * for this string.)
 */
public class AllValidIPAddresses {

    public static void main(String[] args) {
        List<String> ret = getAllIPs("19216811");
        ret.stream().forEach(s -> System.out.println(s));
    }

    private static List<String> getAllIPs(String input) {
        return getAllIPsR(input, 1);
    }

    private static List<String> getAllIPsR(String input, int currPart) {
        if(currPart == 4) {
            List<String> ret = new ArrayList<>();
            if(Long.parseLong(input) < 255)
                ret.add(input);
            return ret;
        }
        else {

            List<String> ret = new ArrayList<>();

            if(input.length() > 1){
                List<String> ret1 = getAllIPsR(input.substring(1), currPart + 1);
                if(ret1.size() != 0) {
                    ret1.stream().map(s -> input.substring(0,1) + "." + s).forEach(s -> ret.add(s));
                }
            }

            if(input.length() > 2) {
                List<String> ret2 = getAllIPsR(input.substring(2), currPart + 1);
                if(ret2.size() != 0) {
                    ret2.stream().map(s -> input.substring(0,2) + "." + s).forEach(s -> ret.add(s));
                }
            }

            if(input.length() > 3) {
                int value = Integer.parseInt(input.substring(0, 3));
                if(value < 255) {
                    List<String> ret3 = getAllIPsR(input.substring(3), currPart + 1);
                    if(ret3.size() != 0) {
                        ret3.stream().map(s -> input.substring(0,3) + "." + s).forEach(s -> ret.add(s));
                    }
                }
            }

            return ret;
        }
    }
}
