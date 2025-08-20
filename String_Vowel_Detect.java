import java.util.*;
class String_Vowel_Detect{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String word;
        int i;
        System.out.print("Enter a  word : ");
        word=scanner.next();

        System.out.println("All the vowels are as follows : ");
        for(i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
                System.out.println(ch);
        }
    }
}