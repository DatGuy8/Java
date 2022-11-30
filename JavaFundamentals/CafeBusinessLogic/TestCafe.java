import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args){

        CafeUtil cafeBot = new CafeUtil();
        

        System.out.println("==========Streak GOAL TEST ============");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeBot.getStreakGoal());

        System.out.printf("Purchases needed by week %s: %s \n\n" , 56 , cafeBot.getStreakGoal(56));
        


        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", cafeBot.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        menu.add("pumpkin latte");
        cafeBot.displayMenu(menu);
    

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafeBot.addCustomer(customers);
            System.out.println("\n");

        cafeBot.printPriceChart("Coffee Grounds Blended", 14.5, 4);

    }
}
}