public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.0;
        double lattePrice = 2.0;
        double cappuccinoPrice = 5.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }


        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(String.format("Your total is $%.2f", cappuccinoPrice));
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }


        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(String.format("Your total is $%.2f", lattePrice+lattePrice));
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
