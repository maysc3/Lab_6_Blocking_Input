import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankGal = 0;
        double fuelEfic = 0; // miles/gal
        double gasPrice = 0; // $/gal
        double hundredMilesCost = 0;
        double fullTankMileage = 0;
        boolean planTrip = false;
        boolean getTankGal = false;
        boolean getFuelEfic = false;
        boolean getGasPrice = false;
        String trash = "";
        String doneWithTripYN = "";

        do
        {
            do // get gallons in tank
            {
                System.out.print("Enter how many gallons your car's tank has: ");
                if(in.hasNextDouble())
                {
                    tankGal = in.nextDouble();
                    in.nextLine();
                    getTankGal = true;
                }
                else {
                    trash = in.nextLine();
                }

            }
            while (!getTankGal);

            do // get fuel efficiency
            {
                System.out.print("Enter fuel efficiency in miles per gallon: ");
                if(in.hasNextDouble())
                {
                    fuelEfic = in.nextDouble();
                    in.nextLine();
                    getFuelEfic = true;
                }
                else {
                    trash = in.nextLine();
                }

            }
            while (!getFuelEfic);
            do // get gas price
            {
                System.out.print("Enter the price of gas in mpg: ");
                if(in.hasNextDouble())
                {
                    gasPrice = in.nextDouble();
                    in.nextLine();
                    getGasPrice = true;
                }
                else {
                    trash = in.nextLine();
                }
            }
            while (!getGasPrice);

            hundredMilesCost = 100.0*((gasPrice *(tankGal))/(fuelEfic));
            double roundedHundredMilesCost = Math.round(hundredMilesCost * 100.0) / 100.0;
            fullTankMileage = tankGal*fuelEfic;
            System.out.println("The cost to drive 100 miles is " + roundedHundredMilesCost + "$"); // rounds price
            System.out.println("The car can go " + fullTankMileage + " miles on a full tank of gas. ");
            System.out.print("Plan another trip? [Y/N]: ");
            if (in.hasNextLine())
            {
                doneWithTripYN = in.nextLine();
                if(doneWithTripYN.equalsIgnoreCase("N"))
                {
                    planTrip = true;
                }
            }
        } while(!planTrip);
    }
}
