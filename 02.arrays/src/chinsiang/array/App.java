public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int measurement = 3;
        Customer customer = new Customer("Pinky");

        switch(measurement){
            case 1:
            case 2:
            case 3:
                customer.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                customer.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                customer.setSize("L");
                break;
            default:
                customer.setSize("X");
                break;
        }
    }
}
