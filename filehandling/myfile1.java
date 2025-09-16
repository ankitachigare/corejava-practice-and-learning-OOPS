import java.util.Scanner;
import java.io.*;
class Myfile{
    public static void main(String args[]){
        String fname;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string : ");
        fname=sc.next();

        File f=new File(fname);
        if(f.isFile())
            System.out.println("It is a file.");
        else if (f.isDirectory())
            System.out.println("It is a directory.");
        else
            System.out.println("It is neither file nor directory.");
    }
}