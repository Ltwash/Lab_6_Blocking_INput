import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double cost;
double distance;
boolean repeat=false;

do {
    System.out.println("Please enter the number of gallons in the tank");
    double gas= in.nextDouble();



    System.out.println("Please enter the miles per gallon");
    double miles = in.nextDouble();

    System.out.println("Please enter the price per gallon");
    double price = in.nextDouble();


    cost = 100/miles * price;
    System.out.println("The cost to drive 100 miles would be " + cost);

    distance = gas*miles;
    System.out.println("On a full tank of gas your car could go "+distance +" miles");

    repeat = true;









}
while (!repeat);



    }
}