package text1;

class circle
{
    public static double pi = 3.14;
    private double radius;

    circle (double Radius)
    {
        radius = Radius ;
    }

    public double area (double a)
    {
        return 3.14*a*a;
    }
}

class trapezoid
{
    private double top_length;
    private double bottom_length;
    private double height;

    trapezoid ( double Top_length , double Bottom_length , double Height )
    {
        top_length = Top_length ;
        bottom_length = Bottom_length ;
        height =Height ;
    }

    public double area ( double top , double bottom , double height )
    {
        return ( top + bottom ) * height / 2 ;
    }
}




public class text1_1 {
    public static void main(String[] args) {
        circle circle1 = new circle(3);
        System.out.print("circle area is "+circle1.area(3));

        trapezoid s = new trapezoid(2,2,2);
        System.out.print(" s area is "+s.area(2,2,2));


    }
}
