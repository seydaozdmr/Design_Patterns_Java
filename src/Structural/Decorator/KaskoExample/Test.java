package Structural.Decorator.KaskoExample;

public class Test {
    public static void main(String[] args) {
        Kasko kasko=new KaskoExample("Araç Kaskosu",1000);
        kasko=new UserAge("kullanıcı yaşı",kasko,300,45);
        kasko=new CarOld("araç yaşı",kasko,100,3);
        printKasko(kasko);

    }

    private static void printKasko(Kasko kasko){
        for(Kasko base:kasko.primList()){
            System.out.println(base);
        }
    }
}
