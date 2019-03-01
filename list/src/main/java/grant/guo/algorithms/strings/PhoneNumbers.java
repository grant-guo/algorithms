package grant.guo.algorithms.strings;

import java.util.*;

/**
 * Each digit, apart from 0 and 1, in a phone keypad corresponds to one of three or four
 * letters of the alphabet, asshown in Figure 7.1 on the next page. Since words are easier
 * to remember than numbers, it is natural to ask if a 7 or 10-digit phone number can
 * be represented by a word. For example, "2276696" corresponds to "ACRONYM" as
 * well as "ABPOMZN".
 */
public class PhoneNumbers {

    Map<Integer, String[]> map = new HashMap<>();

    private void init() {
        String[] array2 = {"A", "B", "C"};
        map.put(2, array2);
        String[] array3 = {"D", "E", "F"};
        map.put(3, array3);
        String[] array4 = {"G", "H", "I"};
        map.put(4, array4);
        String[] array5 = {"J", "K", "L"};
        map.put(5, array5);
        String[] array6 = {"M", "N", "O"};
        map.put(6, array6);
        String[] array7 = {"P", "Q", "R", "S"};
        map.put(7, array7);
        String[] array8 = {"T", "U", "V"};
        map.put(8, array8);
        String[] array9 = {"W", "X", "Y", "Z"};
        map.put(9, array9);
    }

    public List<String> output(String number) {
        init();
        char[] digits = number.toCharArray();
        return outputR(digits, 0);
    }

    private List<String> outputR(char[] digits, int pos) {
        if(pos == digits.length -1){
            String[] strs = map.get(Integer.parseInt(Character.toString(digits[pos])));
            List<String> ret = new ArrayList<>();
            for(int i =0;i<strs.length;i++)
                ret.add(strs[i]);
            return ret;
        }
        else {
            String[] strs = map.get(Integer.parseInt(Character.toString(digits[pos])));
            List<String> more = outputR(digits, pos  + 1);
            List<String> ret = new ArrayList<>();
            for(int i = 0;i< strs.length;i++) {
                Iterator<String> iter = more.iterator();
                while(iter.hasNext()){
                    ret.add(strs[i] + iter.next());
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        List<String> ret = new PhoneNumbers().output("2456");

        ret.stream().forEach(s -> System.out.println(s));
    }
}
