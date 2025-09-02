import java.util.Scanner;
class TestVehicle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i=0;
        String choice;
        System.out.println("Enter how many vehicles : ");
        n=sc.nextInt();
        Vehicle v[]=new Vehicle[n];
        while(true){
            System.out.println("Enter "+(i+1)+" vehicle information : ");
            System.out.println("Enter which type of vehicle LMV/HMV : ");
            choice=sc.next();
            if(choice.equalsIgnoreCase("lmv")){
                v[i]=new LMV();
                v[i].accept();
                n--;
                i++;
            }
            else if(choice.equalsIgnoreCase("hmv")){
                v[i]=new HMV();
                v[i].accept();
                i++;
                n--;
            }
            else
                System.out.println("Invalid choice.");

            if(n==0)
                break;
        }
        System.out.println("C_NAME\t\tPRICE\t\tMILAGE or C_IN_TONS");
        for(i=0;i<v.length;i++)
            v[i].display();
    }
}