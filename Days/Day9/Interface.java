package Days.Day9;

public class Interface {
    public static void main(String[] args)
{
 device d= new device();
 d.display();
}
}


interface Computer{
 void display();
}
 class device implements Computer{
public void display(){
    System.out.println("This device has a screen");
}
    
}
