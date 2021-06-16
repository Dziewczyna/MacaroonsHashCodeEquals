import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Runner {
  public static void main(String[] args) {
    Colour yellow = new Colour("yellow");
    Colour pink = new Colour("pink");
    Colour ecru = new Colour("ecru");
    Colour green = new Colour("green");
    Ingredients ingredientsYellow = new Ingredients("20", "yellow");
    Ingredients ingredientsPink = new Ingredients("25", "pink");
    Ingredients ingredientsEcru = new Ingredients("18", "ecru");
    Ingredients ingredientsGreen = new Ingredients("21", "green");

    Macaroon yellowMacaroon1 = new Macaroon(yellow, ingredientsYellow);
    Macaroon yellowMacaroon2 = new Macaroon(yellow, ingredientsYellow);
    Macaroon yellowMacaroon3 = new Macaroon(yellow, ingredientsYellow);
    Macaroon yellowMacaroon4 = new Macaroon(yellow, ingredientsYellow);
    Macaroon pinkMacaroon1 = new Macaroon(pink, ingredientsPink);
    Macaroon pinkMacaroon2 = new Macaroon(pink, ingredientsPink);
    Macaroon ecruMacaroon1 = new Macaroon(ecru, ingredientsEcru);
    Macaroon ecruMacaroon2 = new Macaroon(ecru, ingredientsEcru);
    Macaroon ecruMacaroon3 = new Macaroon(ecru, ingredientsEcru);
    Macaroon greenMacaroon1 = new Macaroon(green, ingredientsGreen);
    Macaroon greenMacaroon2 = new Macaroon(green, ingredientsGreen);
    Macaroon greenMacaroon3 = new Macaroon(green, ingredientsGreen);
    Macaroon greenMacaroon4 = new Macaroon(green, ingredientsGreen);

    System.out.println(yellowMacaroon1 == yellowMacaroon2);
    System.out.println(yellowMacaroon2 == yellowMacaroon3);
    System.out.println(yellowMacaroon3 == yellowMacaroon4);

    System.out.println("-------------------------");

    System.out.println(yellowMacaroon1.equals(yellowMacaroon2));
    System.out.println(yellowMacaroon2.equals(yellowMacaroon3));
    System.out.println(yellowMacaroon3.equals(yellowMacaroon4));

    System.out.println(yellowMacaroon1.hashCode());
    System.out.println(yellowMacaroon2.hashCode());
    System.out.println(yellowMacaroon3.hashCode());

    Map<String, Integer> macaroonMap = new HashMap<>();
    macaroonMap.put("Yellow macaroon 1", yellowMacaroon1.hashCode());
    macaroonMap.put("Yellow macaroon 2", yellowMacaroon2.hashCode());
    macaroonMap.put("Yellow macaroon 3", yellowMacaroon2.hashCode());
    macaroonMap.put("Yellow macaroon 4", yellowMacaroon2.hashCode());
    macaroonMap.put("Pink macaroon 1", pinkMacaroon1.hashCode());
    macaroonMap.put("Pink macaroon 2", pinkMacaroon2.hashCode());
    macaroonMap.put("Ecru macaroon 1", ecruMacaroon1.hashCode());
    macaroonMap.put("Ecru macaroon 2", ecruMacaroon2.hashCode());
    macaroonMap.put("Ecru macaroon 3", ecruMacaroon3.hashCode());
    macaroonMap.put("Green macaroon 1", greenMacaroon1.hashCode());
    macaroonMap.put("Green macaroon 2", greenMacaroon2.hashCode());
    macaroonMap.put("Green macaroon 3", greenMacaroon3.hashCode());
    macaroonMap.put("Green macaroon 4", greenMacaroon4.hashCode());
    macaroonMap.put("Green macaroon 5", greenMacaroon4.hashCode());

    int yellowHashCode = yellowMacaroon1.hashCode();
    int pinkHashCode = pinkMacaroon1.hashCode();
    int ecruHashCode = ecruMacaroon1.hashCode();
    int greenHashCode = greenMacaroon1.hashCode();

    int yellowCounter = 0;
    int pinkCounter = 0;
    int ecruCounter = 0;
    int greenCounter = 0;
    for(String key: macaroonMap.keySet()){
      if(macaroonMap.get(key)==yellowHashCode)
        yellowCounter++;
      else if(macaroonMap.get(key)==pinkHashCode)
        pinkCounter++;
      else if(macaroonMap.get(key)==ecruHashCode)
        ecruCounter++;
      else if(macaroonMap.get(key)==greenHashCode)
        greenCounter++;
    }

    System.out.println("Amount of yellow macaroons: "+yellowCounter);
    System.out.println("Amount of pink macaroons: "+pinkCounter);
    System.out.println("Amount of ecru macaroons: "+ecruCounter);
    System.out.println("Amount of green macaroons: "+greenCounter);
  }
}
