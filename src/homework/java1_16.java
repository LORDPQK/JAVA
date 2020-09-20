package homework;
import java.util.*;
import java.io.*;


public class java1_16 {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a = cin.nextInt();
        Circle circle1 = new Circle();
        System.out.println("1<：让太阳下山");

        if (a<1)
        circle1.sunset(a);

    }
}
