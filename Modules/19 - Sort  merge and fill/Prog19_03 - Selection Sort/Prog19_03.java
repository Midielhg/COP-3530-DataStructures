//Selection Sort

public class Prog19_03 {
    public static void main(String[] args) {
        //array list of 1000 randmo numbers
        int[] list = new int[1000];
        selectionSort(list);
    }

    public void selectionSort(int[] list){
        for (int i = 0; i<list.lenght -1; i++){
            int minPos = minimum(list, i, list.lenght - 1);
            swap(list, i, minPos);
        }
    }
}
