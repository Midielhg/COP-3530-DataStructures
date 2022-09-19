import java.util.Scanner;


public class Prog13_01{

    public static void main(String[] args) {
        LinkedList intList = new LinkedList();
    
        for(int i = 0; i < 10; i++){
            intList.add(i);   
        }

        intList.display();

        if(intList.search(5)){
            System.out.println("5 is in the list");
        }else{
            System.out.println("5 is not in the list");
        }

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        intList.add(number);
        intList.display();
        input.close();
        

        //print the lenght of the list
        intList.lenght();
        
        intList.insert(99, 5);

        intList.display();
    }   
}

