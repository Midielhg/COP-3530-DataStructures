/*
 * Consider the following problem. A large set of integers, stored in an array named dataset, must be 
searched continuously to determine the presence of values coming from a certain source dataSource. It 
is understood that the set of values in dataset will not change ever. Suppose that after careful analysis, 
you are left with two final candidates for algorithms: 
 
Algorithm A1: For each value of dataSource, search for its presence in dataset using linear search. 
Algorithm A2: Sort dataset with quicksort once, and then search each value of dataSource in dataset, 
using binary search for each. 
 
Task: design and implement an experiment to empirically estimate the number of elements k in 
dataSource, so that the running time of Algorithm 2 outperforms Algorithm 1 for any number of values 
in dataSource greater than or equal to k. 
 
In the example below (the numbers are not taken from a real example; they are offered to illustrate the 
problem), such a k would be 145. Note that the values under the second and third columns represent 
seconds. 
 */

import java.util.Scanner;
import java.util.Random;

public class dataSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[] dataset = new int[1000000];
        int[] dataSource = new int[1000000];
        int k = 0;
        int i = 0;
        int j = 0;
        