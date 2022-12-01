import java.util.ArrayList;


class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this("Guest");
    }

    public Order(String name){
        this.name = name;
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


