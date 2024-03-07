package Aplicatii;

public class Aplicatie1 {
    public static void main(String[] args){

        String random = "Caraca$i$a";
        System.out.println(random.replace("$","t"));

        String secondRandom = "   serenity   ";
        System.out.println(secondRandom.trim());

        Leguma rosie = new Leguma("dulce","rosu",5,'C');
        rosie.metoda1();
        rosie.metoda2();

        System.out.println(rosie.getDimensiune());
        System.out.println(rosie.getGust());

        Fruct banana = new Fruct("dulce","galben",15,'B');
        banana.frufru1();
        banana.frufru2();

        System.out.println(banana.getCuloare());
        System.out.println(banana.getVitamine());


    }
}
