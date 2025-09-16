import java.io.*;
class CopyFile{
    public static void main(String args[]){
        int ch;
        if(args.length==2){
            try{
                FileReader fr=new FileReader(args[0]);
                FileWriter fw=new FileWriter(args[1]);
                while((ch=fr.read())!=-1){
                    char ch1;
                    ch1=(char)ch;
                    fw.write(ch1);
                    System.out.print(ch1);
                }
                fw.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}