import java.io.*;
public class HMV extends Vehicle{
    private float cintons;

    public void accept(){
        super.accept();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter capacitty in tons : ");
            cintons=Float.parseFloat(bf.readLine());
        }catch(IOException ioe){
            System.out.println("Exception handled.");
        }
    }

    public void display(){
        super.display();
        System.out.println(cintons);
    }
}