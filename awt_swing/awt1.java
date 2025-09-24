import java.awt.*;
class A extends Frame{
    A(){
        setTitle("Demo Frame.");
        setBounds(300,300,300,300);
        setBackground(Color.blue);
        setVisible(true);
    }
}

class TestA{
    public static void main(String args[]){
        A ob=new A();
    }
}