public class Car {
    private short regNum;
    public int colour, engineType, wheelSize;
    public String gearType;

    public Car(short num){
        regNum = num;
    }
    public short getRegNum(){
        return regNum;
    }
    public void setRegNum(short num){
        regNum=num;
    }
    public int drive(int fast){
        System.out.println(fast+"km/h");
        return fast;
    }
    public int drive(int slow,int a){
        System.out.println(slow +"km/h");
        return slow;
    }
    public void gearSelect(){
        System.out.println("i have five position");
    }
    public int fillCar(int l){
        System.out.println("i need"+l+"litre of petrol");
        return l;
    }
}
