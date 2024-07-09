package ArrayPP;

import java.util.Arrays;

public class TwoArraysEqu {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4};
        boolean ans = checkTwoArrayEqual(arr1,arr2);
        System.out.println(ans);
    }

    //METHOD 1
//    public static boolean checkTwoArrayEqual(int[] arr1, int[] arr2){
//        //After that, Arrays.equal() function is called to check whether the two arrays are equal or not
//        boolean result = Arrays.equals(arr1,arr2);
//        return result;
//    }


    //METHOD 2
    public static boolean checkTwoArrayEqual(int[] arr1, int[] arr2){
        boolean result = true;
        if(arr1.length == arr2.length){
            for(int i = 0;i< arr1.length;i++){
                if(arr1[i] == arr2[i]){
                    result = true;
                }
            }
        }
        else{
            result = false;
        }
        return result;
    }

}
