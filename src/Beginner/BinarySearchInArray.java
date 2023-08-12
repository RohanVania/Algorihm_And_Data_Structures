/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beginner;

/**
 *
 * Given an array of integers nums which is sorted in ascending order, 
 * and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 1 <= nums.length <= 104
 * -104 < nums[i], 
 * target < 104 
 * All the integers in nums are unique. 
 * nums is sorted in ascending order.
 * 
 */

public class BinarySearchInArray {
    public static int binarySearch(int []array,int target){
        int index=-1;
        int left=0;
        int right=array.length-1;
        while(left<=right){
            // To Avoid Overflow
           int mid=left+(right-left)/2;
           if(array[mid]==target){
               index=mid;
               break;
           }
           else{
               if(array[mid]<target){
                   left=mid+1;
               }
               else{
                   right=mid-1;
               }
           }
        }
        return index;
        
    }
    
    public static void main(String[] args) {
        int target=1;
        int []a={-1,0,3,5,9,12};
        int index=binarySearch(a,target);
        System.out.print(index);
        int x=130303000;
        int y=Integer.MAX_VALUE;
        System.out.println(x+y/2);
    }
}
