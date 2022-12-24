import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //DoNotTerminate.forbitExit();
        try{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        
        String str = Integer.toString(n);
        
        if(n == Integer.parseInt(str)){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        }
        catch(Exception e){
            System.out.println("Unsucessful Termination!");
        }
    }
}
