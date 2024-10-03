import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankCapacity = 0;
        double mpg = 0; // miles/gal
        double gasPrice = 0; // $/gal
        double hundredMilesCost = 0;
        double fullTankMileage = 0;
        boolean done = false;
        boolean doneTankGal = false;
        boolean doneFuelEfic = false;
        boolean doneGasPrice = false;
        String trash = "";
        String doneWithTripYN = "";

        do
        {
            do // get gallons in tank
            {
                System.out.print("Enter how many gallons your car's tank has: ");
                if(in.hasNextDouble())
                {
                    tankCapacity = in.nextDouble();
                    in.nextLine();
                    if (tankCapacity > 0)
                    {
                        doneTankGal = true;
                    }
                }
                else {
                    trash = in.nextLine();
                }

            }
            while (!doneTankGal);

            do // get fuel efficiency
            {
                System.out.print("Enter fuel efficiency in miles per gallon: ");
                if(in.hasNextDouble())
                {
                    mpg = in.nextDouble();
                    in.nextLine();

                    if (mpg > 0)
                    {
                        doneFuelEfic = true;
                    }
                }
                else {
                    trash = in.nextLine();
                }

            }
            while (!doneFuelEfic);
            do // get gas price
            {
                System.out.print("Enter the price of gas in mpg: ");
                if(in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    in.nextLine();
                    if (gasPrice > 0)
                    {
                    doneGasPrice = true;
                    }
                }
                else {
                    trash = in.nextLine();
                }
            }
            while (!doneGasPrice);

            hundredMilesCost = 100.0*((gasPrice *(tankCapacity))/(mpg));
            double roundedHundredMilesCost = Math.round(hundredMilesCost * 100.0) / 100.0;
            fullTankMileage = tankCapacity * mpg;
            System.out.println("The cost to drive 100 miles is " + roundedHundredMilesCost + "$"); // rounds price
            System.out.println("The car can go " + fullTankMileage + " miles on a full tank of gas. ");
            System.out.print("Plan another trip? [Y/N]: ");
            if (in.hasNextLine())
            {
                doneWithTripYN = in.nextLine();
                if(doneWithTripYN.equalsIgnoreCase("N"))
                {
                    done = true;
                }
            }
        } while(!done);
    }
}
