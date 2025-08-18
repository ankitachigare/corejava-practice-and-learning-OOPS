import java.util.Scanner;

class MultiplicationTable{
    private int num;

    public MultiplicationTable(int num){
        this.num=num;
    }

    public void printTable(){
        System.out.println("Multiplication table of "+num+" is as follows.");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }

}

class SumOfDigits{
    private int num;

    public SumOfDigits(int num){
        this.num=num;
    }

    public void calculate(){
        int sum=0,d,num1=num;
        while(num>0){
            d=num%10;
            sum=sum+d;
            num=num/10;
        }

        System.out.println("Sum of digits in "+num1+" is : "+sum);
    }
}

class Factorial{
    private int num;

    public Factorial(int num){
        this.num=num;
    }

    public void calculate(){
        int ans=1;
        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
        }
        System.out.println("Factorial of is : "+ans);
    }
}

class Power{
    private int num;
    private int powerv;

    public Power(int num,int powerv)
    {
        this.num=num;
        this.powerv=powerv;
    }

    public void calculate(){
        int ans=1;
        for(int i=1;i<=powerv;i++)
        {
            ans=ans*num;
        }
        System.out.println(num+" ^ "+powerv+" is = "+ans);
    }
}

class Armstrong{
    private int num;

    public Armstrong(int num){
        this.num=num;
    }

    public void calculate(){
        int ans=0,d,num1=num;
        while(num>0)
        {
            d=num%10;
            ans=ans+d*d*d;
            num=num/10;
        }

        if(ans==num1)
            System.out.println(num1+" is a armstrong number.");
        else
            System.out.println(num1+" is Not an armstrong number.");
    }
}

class ReverseNum{
    private int num;

    public ReverseNum(int num){
        this.num=num;
    }

    public void reverse(){
        int sum=0,d;
        while(num>0)
        {
            d=num%10;
            sum=(sum*10)+d;
            num=num/10;
        }

        System.out.println("Reversed of "+num+" is = "+sum);
    }
}

class CountAllDigits{
    private int num;
    
    public CountAllDigits(int num){
        this.num=num;
    }

    public void count(){
        int cnt=0,d;
        while(num>0)
        {
            d=num%10;
            cnt++;
            num=num/10;
        }
        System.out.println("Total number of digits are = "+cnt);
    }
}

class Prime{
    private int num;

    public Prime(int num){
        this.num=num;
    }

    public void calculate(){
        boolean x=true;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                x=false;
            }
            else
                break;
        }

        if(x==true)
            System.out.println(num+" is a prime number.");
        else
            System.out.println(num+" is not primr number.");
    }
}

class Perfect{
    private int num;

    public Perfect(int num){
        this.num=num;
    }

    public void calculate(){
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }

        if(num==sum)
            System.out.println(num+" is s perfect number.");
        else    
            System.out.println(num+" is not a perfect number.");
    }
}

class TestNumber{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int choice,no,x;

        System.out.print("Enter a number : ");
        no=scanner.nextInt();

        do{

            System.out.println("1.Multiplication table.");
            System.out.println("2.Sum of digits.");
            System.out.println("3.Count all digits.");
            System.out.println("4.Reverse the number.");
            System.out.println("5.Factorial of number.");
            System.out.println("6.Power of number.");
            System.out.println("7.Check prime or not.");
            System.out.println("8.Check perfect or not.");
            System.out.println("9.Check Armstrong or not.");
            System.out.println("10.Exit.");

            System.out.print("Enter your choice : ");
            choice=scanner.nextInt();
            switch(choice){
                case 1:MultiplicationTable m=new MultiplicationTable(no);
                        m.printTable();
                    break;

                case 2:SumOfDigits s=new SumOfDigits(no);
                        s.calculate();
                    break;

                case 3:CountAllDigits c=new CountAllDigits(no);
                        c.count();
                    break;

                case 4:ReverseNum r=new ReverseNum(no);
                        r.reverse();
                    break;

                case 5:Factorial f=new Factorial(no);
                        f.calculate();
                    break;

                case 6:System.out.print("Enter exponential : ");
                        x=scanner.nextInt();
                        Power p=new Power(no,x);
                        p.calculate();
                    break;

                case 7:Prime pr=new Prime(no);
                        pr.calculate();
                    break;

                case 8:Perfect pe=new Perfect(no);
                        pe.calculate();
                    break;

                case 9:Armstrong a=new Armstrong(no);
                        a.calculate();
                    break;
            }
        }while(choice!=10);
    }

}