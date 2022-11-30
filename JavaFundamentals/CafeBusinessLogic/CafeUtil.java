import java.util.ArrayList;

public class CafeUtil {


    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
            
        }
        return sum;
    }

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
            
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(double item: prices){
            sum += item;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu){
        String coffees;
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + ": " + menu.get(i));

        }

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName +"!");
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);

    }

    public void printPriceChart(String product, double price, int maxQuality){
        System.out.println(product);
        double sum = 0;
        for(int i = 1; i <= maxQuality; i++){
            sum += price;
            System.out.printf("%s - $%.2f \n", i , sum);
        }

    }
}