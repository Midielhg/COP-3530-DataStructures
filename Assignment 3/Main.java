//Midiel Henriquez 
//Panther id 6352217

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        double duration1 = 0;//duration of algorithm 1
        double duration2 = 0;//duration of algorithm 2
        int k = 0;//number of elements in dataSource
        //create CVS file to print the results 
        String outputFilename = "output.csv";//name of the file
        PrintWriter output = null;//print writer
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex)
        {
            System.exit(1);
        }
    
        System.out.println("\nk" + "\t" + "Algorithm 1" + "\t" + "Algorithm 2 " );//print the header

        for (int j = 0; j < 50 ;j++){//loop until algorithm 2 takes less time than algorithm 1
            k++;//increment k by 1 

            int[] dataset = new int[k];//create dataset array
            SearchingAlgorithms.fillArray(dataset, 20000000);//fill the array with random numbers between 0 and sixe of dataset
            int[] dataSource = new int[20000000];//create the data source
            SearchingAlgorithms.fillArray(dataSource, 40000000);//fill the data source with random numbers between 0 and 2*size of dataset

            //Algorithm 1 
            long startTime1 = System.nanoTime();//start time for algorithm 1
                for (int i = 0; i < dataSource.length; i++) {//for loop to search the data source
                    if (SearchingAlgorithms.sequentialSearch(dataset, dataSource[i])) {//
                    }
                }
            long endTime1 = System.nanoTime();//end time for algorithm 1
            duration1 = (endTime1 - startTime1)/1000000000.0;//duration for algorithm 1

            //Algorithm 2
            long startTime2 = System.nanoTime();//start time for algorithm 2
                //call quicksort from searching algorithms class
                SearchingAlgorithms.quickSort(dataset);//sort the array
                    for (int i = 0; i < dataSource.length; i++) {//for loop to search the data source
                        if (SearchingAlgorithms.binarySearch(dataset, dataSource[i])) {
                        }
                    }
            long endTime2 = System.nanoTime();//end time for algorithm 2
            duration2 = (endTime2 - startTime2) / 1000000000.0;//duration for algorithm 2

            output.println(k + "," + duration1 + "," + duration2);//print the results to the .CVS file
            System.out.println(k + "\t" + duration1 + "\t" + duration2);//print the results to the console            
        }

    //close output stream
    output.close();
    }
}