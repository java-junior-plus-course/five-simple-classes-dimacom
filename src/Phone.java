public class Phone {
    public String model, colour,kit;
    public int accumulator;
    private int price;

    public Phone(int cost){
        price = cost;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int cost){
        price=cost;
    }
    public void call(){
        System.out.println("call");
    }
    public void msg(){
        System.out.println("msg");
    }
    public void chargeUp(){
        System.out.println("chargeUp");
    }
    private void reload(){
        System.out.println("reload");
    }
}
