public class Customer {
    String name, name2;
    int age, age2, cfcElo;
    float money;

    public Customer(String initName, int initAge, float initMoney) {
        name = initName;
        age = initAge;
        money = initMoney;
    }

    public int computeFee() {

        if (age >= 18 && age <= 64) {
            money = money - 12;
            //hello

        }


    }

}