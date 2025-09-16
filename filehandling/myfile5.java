import java.io.*;
class MyFile{
    public static void main(String args[]){
        int ch;
        if(args.length==1){
            try{
                FileReader fr = new FileReader(args[0]);
                while((ch=fr.read())!=-1){
                    char ch1;
                    ch1=(char)ch;
                    System.out.print(ch1);
                }
            }catch(FileNotFoundException fe){
                System.out.println(fe);
            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }
    }
}