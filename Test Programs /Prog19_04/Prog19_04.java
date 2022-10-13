/*
 * Write a java program that meregs two sorted lists. Each list is stored in an array. Write the resulting sorted list in a new array
 */

public class Prog19_04 {
    public static void main(String[] args) {
        //array list of 100 sorted numbers
        int[] list = new int[100];
        int[] list2 = new int[100];
        int[] list3 = new int[200];
        fillArray(list);
        fillArray(list2);
        sortList(list);
        sortList(list2);
        listMerge(list, list2, list3);
        printArray(list, list2, list3);
    }

    public static void fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000);
        }
    }

    //print the 3 arrays in a table view 
    public static void printArray(int[] list, int[] list2, int[] list3) {
        System.out.println("List 3");
        for (int i = 0; i < list3.length; i++) {
            System.out.println(list3[i]);
        }
    }

    public static void sortList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }


    public static void listMerge(int[] list1, int[] list2, int[] list3){
        int p1=0; //pointer to traverse list 1
        int p2 = 0; //pointer to traverse list2
        int p3 = 0; //pointer to traverse list 3
        while (p1 != list1.length && p2 != list2.length){
            if (list1[p1] < list2[p2]){
                list3[p3] = list1[p1];
                p1++;
            } else {
                list3[p3] = list2[p2];
                p2++;
            }
                p3++;
            
        }
        
        if (p1 == list1.length)
            while (p2 != list2.length){ 
                list3[p3] = list2[p2];
                p2++;
                p3++;
            }
        if (p2 == list2.length){
            while (p1 != list1.length){
                list3[p3] = list1[p1];
                p1++;
                p3++;
            }
        }   
    }
    
    
}
