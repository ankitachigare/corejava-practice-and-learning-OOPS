import java.util.Scanner;
import java.io.*;
class MyFile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fname;
        
        System.out.print("Enter a string : ");
        fname=sc.next();

        File f=new File(fname);
        if(f.isFile()){
            System.out.println("Name : "+f.getName());
            System.out.println("Path : "+f.getPath());
            System.out.println("Absolute Path : "+f.getAbsolutePath());
            System.out.println("Is Readable? : "+f.canRead());
            System.out.println("Is Writable? : "+f.canWrite());
            System.out.println("Is Hidden? : "+f.isHidden());
            System.out.println("Nuber of Characters : "+f.length());
        }
        else if(f.isDirectory()){
            String content[]=f.list();
            for(int i=0;i<content.length;i++){
                System.out.println(content[i]);
            }
        }
        else
            System.out.println("It is neither a file not a directory.");
    }
}
