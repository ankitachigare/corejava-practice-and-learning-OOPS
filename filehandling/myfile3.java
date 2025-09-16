import java.util.*;
import java.io.*;
class Myfile{
    public static void main(String args[]){
        String fname;
        Scanner sc=new Scanner(System.in);
        int cnt=0;

        System.out.print("Enter a string : ");
        fname=sc.next();
        File f=new File(fname);

        if(f.isFile())
            System.out.println("It is a file.");
        else if(f.isDirectory()){
            String content []=f.list();
            for(int i=0;i<content.length;i++){
                File ff=new File(fname+"//"+content[i]);
                if(ff.isFile() && content[i].endsWith("txt")){
                    cnt++;
                    System.out.println(content[i]);
                }
            }
            System.out.println("Number of text file is : "+cnt);
        }
        else
            System.out.println("It is neither a file nor a directory.");
    }
}