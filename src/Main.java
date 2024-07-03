import encapsulation.Gamer;

public class Main {

    public static void main(String[] args) {
        Gamer[] gamers = new Gamer[5];
        gamers[0] = new Gamer("CoolMan",true);
        gamers[1] = new Gamer("Bubble",false);
        gamers[2] = new Gamer("HoneyPot43",false);
        gamers[3] = new Gamer("RedDed",true);
        gamers[4] = new Gamer("Droid24",false);

        for (Gamer g: gamers){
            if(g.getActive()) System.out.println(g.getNickname());
        }

    }
}
