import java.util.Scanner;

class Square{
    private int side;
    private int area;
    private int perimeter;

    public Square(int side){
        this.side=side;
    }

    public int calArea(){
        this.area=this.side*this.side;
        return this.area;
    }

    public int calPeri(){
        this.perimeter=4*this.side;
        return this.perimeter;
    }
}

class Rectangle{
    private int length;
    private int breadth;
    private int area;
    private int perimeter;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int calArea(){
        this.area=this.length*this.breadth;
        return this.area;
    }

    public int calPeri(){
        this.perimeter=2*(this.length+this.breadth);
        return this.perimeter;
    }
}

class Circle{
    private float radius;
    private float area;
    private float circumference;
   
    public Circle(float radius){
        this.radius=radius;
    }

    public float calArea(){
        this.area=3.14f*this.radius*this.radius;
        return this.area;
    }

    public float calPeri(){
        this.circumference=2*3.14f*this.radius;
        return this.circumference;
    }
}

class Cylinder{
    private float radius;
    private float height;
    private float surfacearea;
    private float volume;

    public Cylinder(float radius,float height){
        this.radius=radius;
        this.height=height;
    }

    public float calArea(){
        this.surfacearea=(2*3.14f*this.radius*this.height)+(2*3.14f*this.radius*this.radius);
        return this.surfacearea;
    }

    public float calVol(){
        this.volume=3.14f*this.radius*this.radius*this.height;
        return volume;
    }
}

class Cone{
    private float radius;
    private float height;
    private float volume;

    public Cone(float radius,float height){
        this.radius=radius;
        this.height=height;
    }

    public float calVol(){
        this.volume=3.14f*this.radius*this.radius*this.radius*(this.height/3);
        return this.volume;
    }
}

class TestShapes{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int choice1,choice2,x,y;
        float r,h;
        do{
            System.out.println("1.Square.");
            System.out.println("2.Rectangel.");
            System.out.println("3.Circle.");
            System.out.println("4.Cylinder.");
            System.out.println("5.Cone.");
            System.out.println("6.Exit.");
            System.out.print("Enter your choice.");
            choice1=scanner.nextInt();
            {
                switch(choice1){
                    case 1:System.out.print("Enter measurement side of square : ");
                           x=scanner.nextInt();
                           Square square=new Square(x);
                           do{
                                System.out.println("1.Calculate area.");
                                System.out.println("2.Calculate perimeter.");
                                System.out.println("3.Exit.");
                                System.out.println("Enter your choice.");
                                choice2=scanner.nextInt();

                                switch(choice2){
                                    case 1:System.out.println("Area of square is : "+square.calArea());
                                            break;
                                    case 2:System.out.println("Perimeter of square is : "+square.calPeri());
                                            break;
                                }
                           }while(choice2!=3);
                           break;
                    
                    case 2:System.out.print("Enter length of rectamgle : ");
                           x=scanner.nextInt(); 
                           System.out.print("Enter breadth of rectangle : ");
                           y=scanner.nextInt();
                           Rectangle rectangle=new Rectangle(x,y);

                           do{

                                System.out.println("1.Calculate area.");
                                System.out.println("2.Calculate perimeter.");
                                System.out.println("3.Exit.");
                                System.out.print("Enter your choice : ");
                                choice2=scanner.nextInt();
                                switch(choice2){
                                    case 1:System.out.println("Area of rectangle is : "+rectangle.calArea());
                                            break;
                                    case 2:System.out.println("Perimeter of rectangle is : "+rectangle.calPeri());
                                            break;
                                }
                           }while(choice2!=3);
                           break; 
                    case 3:System.out.print("Enter radius of cirle : ");
                            r=scanner.nextFloat();
                            Circle circle = new Circle(r);
                            do{
                                System.out.println("1.Calculate area.");
                                System.out.println("2.Calculate circumference.");
                                System.out.println("3.Exit.");
                                System.out.print("Enter your choice : ");
                                choice2=scanner.nextInt();
                                switch(choice2){
                                    case 1:System.out.println("Area of circle is : "+circle.calArea());
                                        break;
                                
                                    case 2:System.out.println("Perimeter of circle is : "+circle.calPeri());
                                        break;
                                }
                            }while(choice2!=3);
                            break;

                    case 4:System.out.print("Enter radius of cylinder :");
                            r=scanner.nextFloat();
                            System.out.println("Enter height of cylinder : ");
                            h=scanner.nextFloat();
                            Cylinder cylinder=new Cylinder(r,h);

                            do{
                                System.out.println("1.Calculate area .");
                                System.out.println("2.Calculate volume.");
                                System.out.println("3.Exit.");
                                System.out.print("Ente your choice : ");
                                choice2=scanner.nextInt();

                                switch(choice2){
                                    case 1:System.out.println("Area of cylinder is : "+cylinder.calArea());
                                            break;
                                    
                                    case 2:System.out.println("Volume of cylinder is : "+cylinder.calVol());
                                            break;
                                }
                            }while(choice2!=3);
                            break;

                    case 5:System.out.print("Enter radius of cone : ");
                            r=scanner.nextFloat();
                            System.out.print("Enter height of cone : ");
                            h=scanner.nextFloat();

                            Cone cone = new Cone(r,h);

                            do{
                                System.out.println("1.Calculate volume.");
                                System.out.println("2.Exit.");
                                System.out.print("Enter your choice : ");
                                choice2=scanner.nextInt();

                                switch(choice2){

                                    case 1:System.out.println("Volume of cone is : "+cone.calVol());
                                            break;
                                }
                            }while(choice2!=2);
                            break;
                }
            }
        }while(choice1!=6);
    }
}