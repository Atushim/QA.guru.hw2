package homework2;

public class PhoneWork {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Iphone",50);
        Phone phone2 = new Phone("Huawei",1);

        //Проверяем заряд телефона
        phone1.batteryStatus();
        phone2.batteryStatus();

        //Входящий звонок
        phone1.recevieCall("Anna");
        phone2.recevieCall("Den");

    }
}
