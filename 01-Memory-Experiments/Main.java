public class Main {
    public static void main(String[] args) {

        //STACK MEM test
        int number = 15;
        change(number);
        System.out.println("number control: " + number);

        //HEAP MEM test
        MyCar a1 = new MyCar("White");
        a1.setColor("Green");
        System.out.println("is it change? "+a1.color);
    }

    public static void change(int s) {
        s = 100;
    }
}
