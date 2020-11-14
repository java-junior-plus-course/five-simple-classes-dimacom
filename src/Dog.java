public class Dog {
    public String name, breed,address, colourDog;
    private int numId;

    public Dog(int num){
        numId = num;
    }
    public int getNumId(){
        return numId;
    }
    public void setNumId(int num){
        numId = num;
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void walk(){
        System.out.println("walk");
    }
    public void eatMeat(){
        System.out.println("eatMeat");
    }
    public void play(){
        System.out.println("play");
    }
}
