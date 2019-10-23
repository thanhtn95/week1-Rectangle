import java.util.Scanner;

public class TestingRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = 0, height = 0;
        try {
            do {
                System.out.print("Enter the width:");
                width = sc.nextDouble();
            } while (width <= 0);
            do {
                System.out.print("Enter the height:");
                height = sc.nextDouble();
            } while (height <= 0);
        } catch (Exception e) {
            System.err.println(e);
        }

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
