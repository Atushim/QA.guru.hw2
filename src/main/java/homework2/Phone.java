package homework2;

public class Phone {
    String model;
    int battery;


    public Phone(String model, int battery) {
        this.model = model;
        this.battery = battery;
    }

    void batteryStatus(){
        if(battery <=1){
            System.out.println("Ваш телефон сейчас выключится, поставьте его на зарядку");
        } else if (battery < 50){
            System.out.println("Не забудьте зарядить ваш телефон");
        } else {
            System.out.println("Ваш телефон заряжен");
        }
    }

    void recevieCall(String name){
        System.out.println("Вам звонит - " + name);
    }



}
