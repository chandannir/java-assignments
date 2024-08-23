public class Customer {
    String name, name2;
    int age, age2, cfcElo;
    float money;

    public Customer(String initName, int initAge, float initMoney) {
        name = initName;
        age = initAge;
        money = initMoney;
    }

    public float computeFee() {

        float fee = 0;
        float discount;
        if (age >= 18 && age <= 64) {
            fee = 12.75f;
            money = money - fee;

        } else if (age <= 3) {
            fee = 0.0f;
            money = money - fee;

        }else if(age >= 65){
            discount = 50/100;
            fee =  12.75f - (discount * 12.75f);

        } else if(age >= 4 && age <= 17){
            fee = 8.50f;
            money = money - fee;
        }
        return fee;
    }

    public boolean spend(float amount){
     money = amount - money;
     boolean overUnder;
     if(money < 0){
         overUnder = false;
     }else{
         overUnder = true;
     }

     //return money;
     return overUnder;
    }


}