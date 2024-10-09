import java.awt.font.TextHitInfo;
import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    String name;
    private Random generator = new Random();

    public Tamagotchi(){
        isAlive = true;
        words.add("Hello!");
    }

    public boolean getAlive(){
        return isAlive;
    }

    public void tick(){
        hunger++;
        boredom++;

        if (hunger >= 10 && boredom >=10 || hunger >= 10 || boredom >=10 ){
            isAlive = false;
            System.out.println("You have neglected " + name + " To death :( ");
        }
        else {
            isAlive = true;
        }
    }

    public void feed(){
        hunger = hunger - generator();
    }

    private void reduceBoredom(){
        boredom = boredom - 2;
    }

    public void speak(){
        System.out.println(name + " says " + words.get(generator.nextInt(words.size())));
        reduceBoredom();
    }

    public void teach(String word){
        System.out.println(name + " learns " + word);
        words.add(word);
        reduceBoredom();
    }

    public void printStats(){
        System.out.println("Hunger: " + hunger);
        System.out.println("Boredom: " + boredom);
        System.out.println(name + " is alive");
    }
}
