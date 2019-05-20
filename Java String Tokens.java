import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
           if(s.trim().length()!=0){
                String delims = "[ .,'?!@_]+";
                String[] tokens = s.trim().split(delims);
                    System.out.println(tokens.length);
                for(int i=0;i<tokens.length;i++){
                    System.out.println(tokens[i]);
                }
            }else{
                System.out.print("0");
            }
        
        scan.close();
    }
}

