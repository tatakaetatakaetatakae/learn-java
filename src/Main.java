import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)  {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(1); // Adds 1 to the list
        numbersList.add(2); // Inserts 2 at index 0, shifting other elements

        System.out.println(numbersList);
    }
}