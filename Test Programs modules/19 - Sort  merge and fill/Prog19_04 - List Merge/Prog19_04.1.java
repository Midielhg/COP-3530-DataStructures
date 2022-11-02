/**
* Merges two sorted array lists to obtain a new sorted list; resulting
* list is stored in an array.
* @param list1 input sorted array
* @param list2 input sorted array
*
@param list3 output sorted array
*/

public static void listMerge(int[] list1, int[] list2, int[] list3){
    int p1=0; //pointer to traverse list 1
    int p2 = 0; //pointer to traverse list2
    int p3 = 0; //pointer to traverse list 3
    while (pl != list1.length && p2 != list2.length){
        if (list1[p1] < list2[p2]){
            list3[p3] = list1[p1l;
            pl++;
        } else {
            list3[p3] = listz[p21;
            p2++;
        }
            p3++;
    {
    
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
