import java.util.Scanner;
public class LMV extends Vehicle{
    private float milage;

    public void accept(){
        super.accept();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter milage : ");
        milage=sc.nextFloat();
    }

    public void display(){
        super.display();
        System.out.println(milage);
    }
}