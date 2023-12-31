/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dependencies;
import java.util.*;

/*
 * Instructions:
 * Part A - Fix the modeling to reduce dependencies, and print to terminal what is "sounds" like.
 * 
 * Part B - Using TDD, design an app that prints each animal as ASCII art.
 * Each animal should render (as ASCII) four different ways:
 * - default drawing
 * - drawing depicting a hungry animal
 * - drawing depicting a sleepy animal
 * - drawing depicting an annoyed / upset animal
 */
public class App {
    public static void main(String[] args) {
        System.out.println("part A...");
        // Part A
        List<Object> animals = new ArrayList<>();
        animals.add(new Dog());

        animals.forEach(a -> { // sound off!    
            if (a instanceof Dog) ((Dog)(a)).bark();
            if (a instanceof Cat) ((Cat)(a)).meow();
            if (a instanceof Bird) ((Bird)(a)).tweet();
            if (a instanceof Cow) ((Cow)(a)).moo();
            if (a instanceof Human) ((Human)(a)).supYo();
        });

        // Part B
        System.out.println("part B...");
        animals.forEach(a -> { // print
            Object asDrawn = null;
            printAnimal(asDrawn);
            printAnimalAsHungry(asDrawn);
            printAnimalAsSleepy(asDrawn);
            printAnimalAsAnnoyed(asDrawn);
        });

    }

    static void printAnimal(Object a) {
        if (a instanceof Dog) {
            a = ((Dog)(a)) ;
        }
        if (a instanceof Cat){
            a = ((Cat)(a)) ;
        }
        if (a instanceof Bird) {
            a = ((Bird)(a)) ;
        }
        if (a instanceof Cow) {
            a = ((Cow)(a)) ;
        }
        if (a instanceof Human) {
            a = ((Human)(a)) ;
        }

        System.out.println("???");
    }

    static void printAnimalAsHungry(Object a) {
        if (a instanceof Dog) {
            a = ((Dog)(a)) ;
        }
        if (a instanceof Cat){
            a = ((Cat)(a)) ;
        }
        if (a instanceof Bird) {
            a = ((Bird)(a)) ;
        }
        if (a instanceof Cow) {
            a = ((Cow)(a)) ;
        }
        if (a instanceof Human) {
            a = ((Human)(a)) ;
        }

        System.out.println("???");
    }

    static void printAnimalAsSleepy(Object a) {
        if (a instanceof Dog) {
            a = ((Dog)(a)) ;
        }
        if (a instanceof Cat){
            a = ((Cat)(a)) ;
        }
        if (a instanceof Bird) {
            a = ((Bird)(a)) ;
        }
        if (a instanceof Cow) {
            a = ((Cow)(a)) ;
        }
        if (a instanceof Human) {
            a = ((Human)(a)) ;
        }

        System.out.println("???");
    }

    static void printAnimalAsAnnoyed(Object a) {
        if (a instanceof Dog) {
            a = ((Dog)(a));
        }
        if (a instanceof Cat){
            a = ((Cat)(a)) ;
        }
        if (a instanceof Bird) {
            a = ((Bird)(a)) ;
        }
        if (a instanceof Cow) {
            a = ((Cow)(a)) ;
        }
        if (a instanceof Human) {
            a = ((Human)(a)) ;
        }

        System.out.println("???");
    }
}
