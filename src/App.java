
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tamagotchi!");

        Scanner myscan = new Scanner(System.in);

        Tamagotchi theTam = new Tamagotchi();
        

        System.out.println("Pleas give your Tamagotchi a name! ");
        theTam.name = myscan.nextLine();
        System.out.println("Good, " + theTam.name + " is okey");

        while (theTam.getAlive() == true) { 
            theTam.printStats();
            System.out.println();
            System.out.println("What do you want to do now?");
            System.out.println("1. Feed " + theTam.name);
            System.out.println("2. Teach " + theTam.name + " something new");
            System.out.println("3. Talk to them");
            System.out.println("4. Sit in silence");
            int doWhat = myscan.nextInt();
            myscan.nextLine();

            if (doWhat == 1) {
                theTam.feed();
                System.out.println(theTam.name + " is fed");
            }
            else if (doWhat == 2) {
                System.out.println("What word would you like to teach " + theTam.name + "?");
                String word = myscan.nextLine();
                theTam.teach(word);
            }
            else if (doWhat == 3) {
                theTam.speak();
            }
            else if (doWhat == 4) {
                System.out.println("Doooing nooothing...");
            }
            else {
                System.out.println("Try it again and do it right this time...");
            }
            theTam.tick();
            System.out.println("Press enter to continue! ");
            myscan.nextLine();
        }
        System.out.println("Noooo! " + theTam.name + " has died!");
        System.out.println("Press enter to quit :( ");
        myscan.nextLine();

    }
}
