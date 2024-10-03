import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double diagonal = 0;
        String trash = "";
        boolean doneW = false;
        boolean doneL = false;


        do
        {
            System.out.print("Enter the width of the triangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0)
                {
                    doneW = true;
                }
            }
            else
            {
                trash = in.nextLine();
            }
        }while(!doneW);
        do
        {   System.out.print("Enter the length of the triangle: ");
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if (length > 0)
                {
                    doneL = true;
                }
            }
            else
            {
                trash = in.nextLine();
            }
        }while(!doneL);
        diagonal = Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
        System.out.println("The length of the diagonal is " + diagonal);
    }
}
