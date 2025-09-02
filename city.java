import java.io.*;
class Country{
    private String countryname;

    Country(String c){
        countryname=c;
    }
    public void display(){
        System.out.println("Name Of Country Is : "+countryname);
    }
}
class State extends Country{
    private String statename;

    State(String s,String c){
        super(c);
        statename=s;
    }
    public void display(){
        super.display();
        System.out.println("Name Of State Is : "+statename);
    }
}
class City extends State{
    private String cityname;

    City(String c,String s,String country){
        super(s,country);
        cityname=c;
    }
    public void display(){
        super.display();
        System.out.println("Name Of City Is : "+cityname);
    }
}
class TestCity{
    public static void main(String args[]){
        try{
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            String tc,ts,tcon;
    
            System.out.print("Enter country name : ");
            tcon=b.readLine();

            System.out.print("Enter state name : ");
            ts=b.readLine();

            System.out.print("Enter city name : ");
            tc=b.readLine();
            City c=new City(tc,ts,tcon);
            c.display();
            
        }catch(IOException ioe){
            System.out.println("Exception Handled.");
        }
    }
}