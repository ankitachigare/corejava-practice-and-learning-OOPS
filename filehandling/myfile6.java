import java.io.*;
class TestFile{
    public static void main(String args[]){
        int cc=0,wc=0,lc=0;
        int ch;
        if(args.length==1){
            try{
                FileReader fr = new FileReader(args[0]);
                while((ch=fr.read())!=-1){
                    char ch1;
                    ch1=(char)ch;

                    if(ch==' ')
                        wc++;
                    
                    if(ch=='\n'){
                        wc++;
                        lc++;
                    }

                    cc++;
                }
                System.out.println("Number of character in file : "+cc);
                System.out.println("Nuer of words in file : "+wc);
                System.out.println("Number of lines in file : "+lc);
            }catch(FileNotFoundException fe){
                System.out.println(fe);
            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }
    }
}