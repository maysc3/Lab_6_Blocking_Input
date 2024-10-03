import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cTemp = 0;
        double fTemp = 0;
        String trash = "";
        String continueYN = "";
        boolean tempDone = false;
        boolean conversions = false;

        do
        {
            do
            {
                System.out.print("Enter a valid temperature in celsius: ");

                if (in.hasNextDouble())
                {
                    cTemp = in.nextDouble();
                    in.nextLine(); // clears buffer
                    tempDone = true;
                }
                else
                {
                    trash = in.nextLine();
                }
            }
            while (!tempDone);
            fTemp = (9.0 / 5.0 * cTemp) + 32;
            System.out.println("The temperature " + cTemp + "C in fahrenheit is " + fTemp + "F");
            System.out.println("Do you have another conversion? [Y/N]");
            if (in.hasNextLine())
            {
                continueYN = in.nextLine();
                if (continueYN.equalsIgnoreCase("N"))
                    conversions = true;
            }
        }
        while (!conversions);
    }
}