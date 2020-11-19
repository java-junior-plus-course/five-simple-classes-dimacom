 public  class Person {


    private String firstName;
    public String secondName;
    public byte age;
    private short height,weight;

    public Person(String name){
        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public String say(String hi)
     {
         System.out.println(hi);
         return hi;
     }
     public String say( String bye,String a)
     {
         System.out.println(bye+a);
         return bye;
     }
     public void read()

     {
         System.out.println("I read");
     }
     public void go()
     {
         System.out.println("I go");
     }

}