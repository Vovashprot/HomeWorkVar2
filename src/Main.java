public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task4(){
        byte bottlesPM = 16 / 2;
        int bottles20M = bottlesPM * 20;
        int bottles1D = bottlesPM * 60 * 24;
        int bottles3D = bottles1D * 3;
        int bottles1Month = bottles1D * 30;
        System.out.println("За 20 минут машина произвела " + bottles20M + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottles1D + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottles3D + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottles1Month + " штук бутылок");

    }
    public static void task5(){
        byte paintGlob = 120;
        byte whiteForClass = 2;
        byte brownForClass = 4;
        int paintForClass = whiteForClass + brownForClass;
        int classN = paintGlob / paintForClass;
        int brownGlob = brownForClass * classN;
        int whiteGlob = whiteForClass * classN;
        System.out.println("В школе, где " + classN + " классов, нужно " + whiteGlob + " банок белой краски и " + brownGlob + " банок коричневой краски");
    }
}