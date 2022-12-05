import java.util.ArrayList;


class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
    }


    public Order addItem(Item item){
        this.items.add(item);

        return this;
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal(){
        double sum = 0;
        for(int i = 0; i < this.items.size(); i++){
            sum += this.items.get(i).getPrice();
        }
        System.out.printf("Your Total is $%.2f\n", sum);
        return sum;

    }

    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(int i = 0;i < this.items.size(); i++){
            System.out.printf("%s - $%.2f\n",this.items.get(i).getName(), this.items.get(i).getPrice());
        }
        System.out.printf("Total: $%.2f\n",this.getOrderTotal());
        
    }

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //getter
    public boolean isReady(){
        return ready;
    }

    //setter
    public void setReady(boolean readiness){
        this.ready = readiness;
    }

    //getter
    public void showOrderItems(){
        
    } 

}


