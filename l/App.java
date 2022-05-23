package l;

public class App {
    
    public static void main(String[] args) {
        RoboSam roboSam = new RoboSam("cafe", "acucar");
        RoboEden roboFilhoDeSam = new RoboEden("agua", "acucar");

        String cafe = pegarCafe(roboSam);
        String cafe2 = pegarCafe(roboFilhoDeSam);
    }

    private static String pegarCafe(RoboSam robo) {
        return robo.fazerCafe();
    }

}
