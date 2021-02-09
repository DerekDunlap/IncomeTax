import java.util.*;//Imports scanner object
import java.util.Random;//Imports Random numbers object

public class IncomeTax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randNumb = new Random();//Generates instance of Random class called randNumb.
        int people = randNumb.nextInt(15);//Generates random numbers in the range of 0-15.

        int i = 0;//Creates i and assigns default value of 0.
        double amount;//Creates amount and assigns 0 as default value.
        double percent = 0.01;//Creates percent and assigns default value of 0.01.
        double maxAmount;//Creates maxAmount and assigns 0.0.
        double tax;//Creates tax and assigns 0.0

        //While-loop: Continues to executes so long as condition is met.
        while (i <= people) {
            System.out.print("Enter the amount of taxable income for each person: $");//Displays message on console for user provide input.
            double income = input.nextDouble();//Accepts user input and assigns to double variable named income.

            //If Statement: Test if condition is met.
            if (income >= 0 && income <= 750) {
                maxAmount = 7.50;//Assigns 7.50 to maxAmount
                amount = (income * percent);//Calculates the tax amount owed by the individual.
                System.out.printf("Tax Due: $%.2f\n\n", amount);//Displays the Tax Due for the individual.
                if(amount==maxAmount){
                    i+=1;
                    System.out.println("Person "+i+" has a maximum tax value.");//Displays the following message if the person has a max tax amount.
                    System.out.println();//Added for readability.
                }
                //If Statement: Test if condition is met.
            } else if (income > 750 && income <= 2500) {
                tax = 7.50;//Assigns 7.50 to tax.
                maxAmount = 42.50;//Assigns 42.50 to maxAmount
                amount = tax + ((income - 750) * (percent * 2));//Calculates the tax amount owed by the individual.
                System.out.printf("Tax Due: $%.2f\n\n", amount);//Displays the Tax Due for the individual.
                if(amount==maxAmount){
                    i+=1;
                    System.out.println("Person "+i+" has a maximum tax value.");//Displays the following message if the person has a max tax amount.
                    System.out.println();//Added for readability.
                }
                //If Statement: Test if condition is met.
            } else if (income > 2500 && income <= 5000) {
                tax = 82.50;//Assigns 82.50 to tax.
                maxAmount = 182.50;//Assigns 182.50 to maxAmount
                amount = tax + ((income - 2500) * (percent * 4));//Calculates the tax amount owed by the individual.
                System.out.printf("Tax Due: $%.2f\n\n", amount);//Displays the Tax Due for the individual.
                if(amount==maxAmount){
                    i+=1;
                    System.out.println("Person "+i+" has a maximum tax value.");//Displays the following message if the person has a max tax amount.
                    System.out.println();//Added for readability.
                }
                //If Statement: Test if condition is met.
            } else if (income > 5000 && income <= 8000) {
                tax = 142.50;//Assigns 142.50 to tax.
                maxAmount = 292.50;//Assigns 292.50 to maxAmount
                amount = tax + ((income - 5000) * (percent * 5));//Calculates the tax amount owed by the individual.
                System.out.printf("Tax Due: $%.2f\n\n", amount);//Displays the Tax Due for the individual.
                if(amount==maxAmount){
                    i+=1;
                    System.out.println("Person "+i+" has a maximum tax value.");//Displays the following message if the person has a max tax amount.
                    System.out.println();//Added for readability.
                }
                //If Statement: Test if condition is met.
            } else if (income > 8000) {
                tax = 230.00;//Assigns 230.00 to tax.
                amount = tax + ((income - 8000) * (percent * 6));//Calculates the tax amount owed by the individual.
                System.out.printf("Tax Due: $%.2f\n\n", amount);//Displays the Tax Due for the individual.
                i+=1;
                System.out.println("Person "+i+" has a maximum tax value.");//Displays the following message if the person has a max tax amount.
                System.out.println();//Added for readability.
            } else {
                System.out.print("Error!");//Displays error message.
            }
            i++;//Iterates to the next person.
        }
        input.close();//Closes Scanner.
    }
}
