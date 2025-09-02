import java.io.*;
public class Vehicle{
    private String cname;
    private float price;

    public void accept(){
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter company name : ");
            cname=bf.readLine();
            System.out.println("Enter price : ");
            price=Float.parseFloat(bf.readLine());

        }catch(IOException ioe)
        {
            System.out.println("Exception handled.");
        }
    }

    public void display(){
        System.out.print(cname+"\t\t"+price+"\t\t");
    }
}