import java.util.Scanner;
abstract class Order{
    protected int id;
    protected String discription;
    Scanner sc=new Scanner(System.in);

    abstract void accept();
    abstract void display();
}
class PurchaseOrder extends Order{
    private String cname;
    private String vname;

    public void accept(){
        System.out.println("Enter details of Purchase Order.");
        System.out.print("Enter order Id : ");
        id=sc.nextInt();
        System.out.print("Enter customer name : ");
        cname=sc.next();
        System.out.print("Enter vendor name : ");
        vname=sc.next();
        System.out.print("Enter order discription : ");
        discription=sc.next();
    }

    public void display(){
        System.out.println("Details odf purchase order is as follows.");
        System.out.println("Id : "+id);
        System.out.println("Customer Name : "+cname);
        System.out.println("Vendor Name : "+vname);
        System.out.println("Discription : "+discription);
    }
}
class SalesOrder extends Order{
    private String cname;
    private String vname;
    public void accept(){
        System.out.println("Enter details of Sales Order.");
        System.out.print("Enter order Id : ");
        id=sc.nextInt();
        System.out.print("Enter customer name : ");
        cname=sc.next();
        System.out.print("Enter vendor name : ");
        vname=sc.next();
        System.out.print("Enter order discription : ");
        discription=sc.next();
    }

    public void display(){
        System.out.println("Details of sales order is as follows.");
        System.out.println("Id : "+id);
        System.out.println("Customer Name : "+cname);
        System.out.println("Vendor Name : "+vname);
        System.out.println("Discription : "+discription);
    }
}
class TestOrder{
    public static void main(String args[]){
        PurchaseOrder p1=new PurchaseOrder();
        p1.accept();
        p1.display();

        PurchaseOrder p2=new PurchaseOrder();
        p2.accept();
        p2.display();

        PurchaseOrder p3=new PurchaseOrder();
        p3.accept();
        p3.display();

        SalesOrder s1=new SalesOrder();
        s1.accept();
        s1.display();

        SalesOrder s2=new SalesOrder();
        s2.accept();
        s2.display();

        SalesOrder s3=new SalesOrder();
        s3.accept();
        s3.display();
    }
}