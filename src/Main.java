public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1");
        byte shrek = 50;
        int fry = 100000;
        short sick = 20000;
        long letMeDoItForYou = 222222222;
        float boat = 222.22F;
        double hehe = 2222.2222;
        System.out.println("Значение переменной shrek с типом byte равно " + shrek);
        System.out.println("Значение переменной fry с типом int равно " + fry);
        System.out.println("Значение переменной sick с типом short равно " + sick);
        System.out.println("Значение переменной letMeDoItForYou с типом long равно " + letMeDoItForYou);
        System.out.println("Значение переменной boat с типом float равно " + boat);
        System.out.println("Значение переменной hehe с типом double равно " + hehe);
    }
    public static void task2(){
        float banana = 27.12f;
        long kiwi = 987678965549l;
        float orange = 2.786f;
        short leg = 569;
        short arm = -159;
        short torso = 27897;
        byte apple = 67;
    }
    public static void task3(){
        byte studL = 23;
        byte studA = 27;
        byte studE = 30;
        short paper = 480;
        int paperEach = paper / (studA + studE + studL);
        System.out.println("На каждого ученика рассчитано " + paperEach + " истов бумаги");

    }
}