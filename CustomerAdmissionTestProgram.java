public class CustomerAdmissionTestProgram {
    public static void main(String[] args) {
        Customer c1, c2, c3, c4;
        c1 = new Customer("Bob", 17, 100);
        c2 = new Customer("Dottie", 3, 10);
        c3 = new Customer("Jane", 24, 40);
        c4 = new Customer("Sam", 72, 5);
        System.out.println("Here is the money before going into the circus:");
        System.out.println(" Bob has $" + c1.money);
        System.out.println(" Dottie has $" + c2.money);
        System.out.println(" Jane has $" + c3.money);
        System.out.println(" Sam has $" + c4.money);
        // Simulate people going into the circus
        c1.payAdmission();
        c2.payAdmission();
        c3.payAdmission();
        c4.payAdmission();
        System.out.println("Here is the money after going into the circus:");
        System.out.println(" Bob has $" + c1.money);
        System.out.println(" Dottie has $" + c2.money);

        System.out.println(" Jane has $" + c3.money);
        System.out.println(" Sam has $" + c4.money);
    }
}
