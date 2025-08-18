import java.io.*;
class Vehicle{
    private int id;
    private String name;
    private float price;
    private int milage;

    public void accept()
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter ID of vehicle : ");
            id=Integer.parseInt(bufferedreader.readLine());
            System.out.println("enter name of vehicle : ");
            name=bufferedreader.readLine();
            System.out.println("Enter price of vehicle : ");
            price=Float.parseFloat(bufferedreader.readLine());
            System.out.println("Enter milage : ");
            milage=Integer.parseInt(bufferedreader.readLine());
        }
        catch(IOException ioe){}
    }
    public void display()
    {
        System.out.println("Vehicle ID is : "+id);
        System.out.println("Name of vehicle is : "+name);
        System.out.println("Price is : "+price);
        System.out.println("Milage is : "+milage);
    }
}

class TestVehicle{
    public static void main(String args[]){
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        int n,i;
        try{
            System.out.println("Enter how many vehicles : ");
            n=Integer.parseInt(bufferedreader.readLine());

            Vehicle vehicle[]=new Vehicle[n];
            for(i=0;i<vehicle.length;i++)
            {
                vehicle[i]=new Vehicle();
                vehicle[i].accept();
            }
            for(Vehicle t:vehicle)
                t.display();
        }
        catch(IOException ioe){}
    }

}