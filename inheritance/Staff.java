import java.util.Scanner;
abstract class Staff{
    protected int id;
    protected String name;

    Staff(int id,String name){
        this.id=id;
        this.name=name;
    }
    abstract void display();
}
class OfficeStaff extends Staff{
    private String department;

    OfficeStaff(String dept,int id,String name){
        super(id,name);
        department=dept;
    }

    void display(){
        System.out.println("Details of office staff is as follows : ");
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("DEPARTMENT : "+department);
    }
}
class TestStaff{
    public static void main(String args[]){
        int tid;
        String tname,tdept;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Id of office staff : ");
        tid=sc.nextInt();
        System.out.print("Enter Name of office staff : ");
        tname=sc.next();
        System.out.print("Enter Department of office staff : ");
        tdept=sc.next();

        OfficeStaff os=new OfficeStaff(tdept,tid,tname);
        os.display();
    }
}