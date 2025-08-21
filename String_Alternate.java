import java.util.Scanner;
class String_Alternate{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str;
        int i;
        char ch;
        System.out.print("Enter a string : ");
        str=scanner.next();
        System.out.println("Alternate characters of the string are as follows.");
        for(i=0;i<str.length();i+=2){
            ch=str.charAt(i);
            System.out.print(ch+"  ");
        }
    }
}