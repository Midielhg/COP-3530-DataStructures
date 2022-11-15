//design and implement an algorithm that determines whether or not a given array of elements, list2, is completely contained within another given array of elementsm list1

//Consider two different scenation:
    //both arrays are unsorted 
    //both arrays are sorted

public class Prog20_03 {
    
        public static void main(String[] args) {
            //array list of 100 sorted numbers
            int[] list1 = new int[100];
            int[] list2 = new int[5];
            fillArray(list1);
            fillArray(list2);
            sortList(list1);
   
            binarySearch(list1, list2);

            System.out.println("List 1: ");
            printArray(list1);
            System.out.println("List 2: ");
            printArray(list2);
        }
    
        //fill array with consecutive random numbers
        public static void fillArray(int[] list) {
            for (int i = 0; i < list.length; i++) {
                list[i] = (int)(Math.random() * 100);
            }
        }
      

        public static void sortList(int[] list) {
            for (int i = 0; i < list.length; i++) {
                int currentMin = list[i];
                int currentMinIndex = i;
                for (int j = i + 1; j < list.length; j++) {
                    if (currentMin > list[j]) {
                        currentMin = list[j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    list[currentMinIndex] = list[i];
                    list[i] = currentMin;
                }
            }
        }

      
        public static void printArray(int[] list) {
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        }

        public static int binarySearch(int[] a, int key){
            int low = 0;
            int high = a.length - 1;
            int mid;
            while (low <= high)
            {
                mid = (low + high) / 2;
                if (key == a[mid])
                    return mid;
                else if (key < a[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            return -1;
        }

        public static void binarySearch(int[] list1, int[] list2){
            for (int i = 0; i < list2.length; i++){
                if (binarySearch(list1, list2[i]) == -1){
                    System.out.println("list2 is not completely contained within list1");
                    return;
                }
            }
            System.out.println("list2 is completely contained within list1");
        }


    
}
