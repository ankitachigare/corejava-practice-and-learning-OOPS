import java.util.Scanner;
interface Operations{
    public static final double PI =3.14;
    
    void area();
    void volume();
}
class Cylinder implements Operations{
    private double radius;
    private double height;

    Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    public void area(){
        double area=0.0;
        area=(2*PI*radius*height)+(2*PI*radius*radius);
        System.out.println("Area of cylinder is : "+area);
    }

    public void volume(){
        double volume;
        volume=(PI*radius*radius*height);
        System.out.println("Volume of cylinder is : "+volume);
    }
}
class TestOperations{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double tr,th;

        System.out.println("Enter radius of cylinder : ");
        tr=sc.nextDouble();

        System.out.println("Enter height of cylinder : ");
        th=sc.nextDouble();

        Cylinder c=new Cylinder(tr,th);
        c.area();
        c.volume();
    }
}