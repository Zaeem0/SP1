public class InterestCalculator
{
    public static double interestOn(double balance)
    {
        double interest = balance * 0.05;
        return interest;
    }
    public static void main()
    {
        double initialBalance=10000;
        System.out.println("The initial balance at year 0 is : " + initialBalance + " which gains 5% interest per year");
        double currentBalance=initialBalance+interestOn(initialBalance);
        System.out.println("Year 1: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 2: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 3: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 4: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 5: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 6: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 7: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 8: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 9: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 10: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 11: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 12: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 13: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 14: " + currentBalance);
        currentBalance=currentBalance+interestOn(currentBalance);
        System.out.println("Year 15: " + currentBalance);
        //Now the initial balance has doubled
        System.out.println("The initial balance :" + initialBalance + " , has now doubled to :" + currentBalance);
    }
}
