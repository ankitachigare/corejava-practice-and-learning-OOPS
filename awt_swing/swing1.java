import javax.swing.*;
class A extends JFrame{
    A(){
        setTitle("Demo swing frame");
        setBounds(300,300,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class TestA{
    public static void main(String args[]){
        A ob=new A();
    }
}