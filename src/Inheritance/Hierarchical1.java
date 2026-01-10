package Inheritance;

import org.w3c.dom.ls.LSOutput;

import java.net.SocketOption;

class vehicle{
    void start(){
        System.out.println(" vehicle start");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println(" vehicle run");
    }

}
class sportbike extends bike{
}
public class Hierarchical1 {
    public static void main(String[] args) {
        sportbike s=new sportbike();
        s.start();
        s.run();
    }
}
