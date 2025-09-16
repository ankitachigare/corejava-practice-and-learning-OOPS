import java.util.*;
import java.io.*;
class Myfile{
    public static void main(String args[]){
        String fname,choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        fname=sc.next();

        File f=new File(fname);
        if(f.isFile())
            System.out.println("It is a file.");
        else if(f.isDirectory()){
            String content[]=f.list();
            for(int i=0;i<content.length;i++){
                File ff=new File(fname+"//"+content[i]);
                if(ff.isFile() && content[i].endsWith("txt")){
                    System.out.println("Do you want to delete yes/no ?"+content[i]);
                    choice=sc.next();
                    if(choice.equalsIgnoreCase("yes"))
                        ff.delete();
                }
            }
        }
        else
            System.out.println("It is neither file not directory.");
    }
}