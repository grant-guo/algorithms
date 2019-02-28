package grant.guo.algorithms.list;

import java.util.Arrays;

/**
 * if the array is not sorted, sort it first
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        int[] array = {70, 10, 20,20,30,40, 20,40,40, 90,50,60,70,70,70,80,70,70,80, 40,90};

        Arrays.sort(array);
        int pre = 0;
        int curr = 1;
        while(curr < array.length) {
            if(array[pre] != array[curr]){
                pre++;
                if(pre != curr)
                    array[pre] = array[curr];
            }
            curr++;

        }

        int[] newArray = new int[pre+1];
        for(int i = 0;i < newArray.length;i++)
            System.out.println(array[i]);


    }

}
