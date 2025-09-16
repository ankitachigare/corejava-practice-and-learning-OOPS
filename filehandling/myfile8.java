import java.io.*;
class CopyFile{
    public static void main(String args[]){
        int ch;
        if(args.length==2){
            try{
                FileReader fr= new FileReader(args[0]);
                FileWriter fw = new FileWriter(args[1]);
                while((ch=fr.read())!=-1){
                    char ch1=(char) ch;
                    if(Character.isUpperCase(ch1))
                        ch1=Character.toLowerCase(ch1);
                    else if(Character.isLowerCase(ch1))
                        ch1=Character.toUpperCase(ch1);
                    else if(Character.isDigit(ch1))
                        ch1='*';
                    else if(ch1==' ')
                        ch1='$';
                    else
                        ch1 = ch1;

                    fw.write(ch1);
                    System.out.print(ch1);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
