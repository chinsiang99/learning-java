public class Customer {
    private String name;
    private String size = "S";

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void printName(){
        System.out.println(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSize(String size){
        this.size = size;
    }
}
