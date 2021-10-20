package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={8,3,4,12,5,6};
     int ans[] = MergeSOrt(arr);
        System.out.println(ans);
    }

       static int[] MergeSOrt(int[] arr) {
        if (arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left= MergeSOrt(Arrays.copyOfRange(arr,0,mid));
        int[] right= MergeSOrt(Arrays.copyOfRange(arr,mid,arr.length));
        return  merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;
         int []mix=new int[left.length+ right.length];
        while (i< left.length && j< right.length)
        {
            if (left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        // copy remaing element

        while (i< left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }

}
