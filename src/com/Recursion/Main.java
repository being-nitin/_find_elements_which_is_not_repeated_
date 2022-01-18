package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	find the unique element in an array i'e whose duplicate element is not there:
	 */
     int[] arr = {1,3,5,7,3,1,5};
        System.out.println(unique(arr));

    }
    private static int unique(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum = sum^arr[i];
        }
        return sum;
    }
}
/*
as we all know operators follow associate law and we also know that a^a = 0 and a^0 = a
that means exor of a number with same number gives 0 and an exor of a number with 0 gives the number itself.
 */

