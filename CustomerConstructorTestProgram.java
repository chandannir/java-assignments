public class CustomerConstructorTestProgram {
    public static void main(String[] args) {
        Customer c1, c2, c3;

        c1 = new Customer("Bob", 17, 10);
        //c1. name = "Bob";
        //c1. age = 17;
        //. money = 10;

        c2 = new Customer("Dottie", 3, 0 );
        //    c2. name = "Dottie";
    //        c2. age = 3;
    //        c. money = 0;


        c3 = new Customer("Jane", 0, 0 );

        System.out.println("Bob looks like this: " + c1.name + ", " + c1.age + ",  " + c1.money);
        System.out.println("Dottie looks like this: " +  c2.name + ", " + c2.age + ", " + c2.money);
        System.out.println("Customer 3 looks like this: " + c3.name + ", " + c3.age + ", "  + c3.money);
    }

}
