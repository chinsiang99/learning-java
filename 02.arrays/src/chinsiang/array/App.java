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

        Clothing item1 = new Clothing("white shirt", 5, "M");
        Clothing item2 = new Clothing("blue shirt", 10, "S");
        Clothing item3 = new Clothing("green scarf", 5, "S");
        Clothing item4 = new Clothing("blue t-shirt", 10.5, "S");
        Clothing[] items = {item1, item2};

        final double tax = 0.2;
        // double total = (cloth1.getPrice() + cloth2.getPrice()) * (1 + tax);
        double total = 0.0;

        for (Clothing clothing : items) {
            if(customer.getSize().equals(clothing.getSize())){
                total += clothing.getPrice();
                System.out.println(clothing.getDescription() + ": " + clothing.getPrice());
                if(total > 15){
                    break;
                }
            }
        }

        System.out.println("total" + ": " + total);
    }
}
