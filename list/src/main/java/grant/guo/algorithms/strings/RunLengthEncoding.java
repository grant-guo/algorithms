package grant.guo.algorithms.strings;

public class RunLengthEncoding {

    public static void main(String[] args) {
        String target = "aaaaadddderfeeeebcccaa";

        char[] array = target.toCharArray();

        int size = array.length;
        int num = 1;
        int curr = 1;
        int segment = 0;

        StringBuffer buffer = new StringBuffer();

        while(curr < size) {
            if(array[curr] == array[segment]){
                num++;
            }
            else {
                buffer.append(num);
                buffer.append(array[segment]);
                num=1;
                segment = curr;
            }
            curr++;
        }
        buffer.append(num);
        buffer.append(array[segment]);
        System.out.println(buffer.toString());

        char[] encoded = buffer.toString().toCharArray();
        buffer = new StringBuffer();
        curr = 0;
        while(curr < encoded.length) {
            int high = Integer.parseInt(Character.toString(encoded[curr]));
            for(int i = 0;i<high;i++){
                buffer.append(encoded[curr+1]);
            }
            curr+=2;
        }

        System.out.println(buffer.toString());
    }
}
