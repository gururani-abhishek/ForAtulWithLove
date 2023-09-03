import exception.GalatFileDhundRaheHoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BoxWithNuts {
    String color;
    boolean nuts;

    public void shakeShake() {
        // will do something
    }

    // constructor style,
    public BoxWithNuts(int x) {
        System.out.println("constructor being called");
    }
}

class TwoIntegers {
    int x;
    int y;
}

// q for atul => can a class be inside another class? if yes how.
public class Application {
    public static void main(String[] args) {
//        System.out.println("hey jude");
//
//        // reference variable
//        BoxWithNuts variable1 = new BoxWithNuts(5);
//        variable1.color = "Red";
//
//        // dog cherry = new dog();
//        // human jayesh = new dog();
//
//
////        UKCoolBoy abhishek = pointsAtMe;
//        // int x = 4;
//
//        // process data, or you store data....
//        // primitive ways to store data -> primitive data types.
////        int x = 1;
//        char y = 'x';
//        System.out.println((int)'A');
//        // ascii chart 'A' -> 65
//
//
//        // user defined data-type
//        // in java we create user-defined data-type using class
//
//        boolean husband = true;
//
//        if(husband) {
//            boolean wife = true;
//        }
//
//        System.out.println(wife);




//        int x = 0; // because it is a good habit
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//
//        if(y % 2 == 0) {
//            // if y is even
//            x = x + 2;
//        } else {
//            x  = x + 3;
//        }

        // in a file there cannot be more than one variable with the same name.
//        System.out.println(x);

        // create a variable x
        // create a variable y, take input from the user for variable y
        // if y is odd, add 3 to x
        // if y is even, add 2 to x


        // flow of program was from 1..2..3..4..5..6


        // pillars of oops is nothing but just a way to utilize classes and objects.

        // abstraction is nothing but hiding details, and covering complexity.

        // read about different access modifiers -> public, private, protected, default(do questions on this)
        // sanfoundry.com

        // referencing class object using a variable of type class.
//        DrinkChai obj = new AtulDrinkingChai();
        // pressing 1 on remote ->
//        obj.drinkChai();
//        obj.AtulDrink();
        // why should I use a reference of type class?
        // here comes the concept of abstraction
        // let us implement interface.

        // step 1 -> create interface
        // step 2 -> implement interface
        // step 3 -> use it


        // everything is not interconnected by default, but is available by default using import statments.
        // read about compilation of a java program.

//        DrinkChai objAtul = new AtulDrinkingChai();
//        DrinkChai objSneha = new SnehaDrinkingChai();

        // inheritance -> let's not reinvent the wheels.

        // user buys a fhd tv
//        FullHDTelevision myFhdTV = new FullHDTelevision();

        // user tries to play fhd videos
//        myFhdTV.playFHDVideos();

        // user tries to play hd videos
//        myFhdTV.playHDVideo();


        // "direct access nahi hai aapke paas" ~ Atul on Encapsulation

        // encapsulation hasn't been performed...
//        Capsule objCapsule = new Capsule();
//        System.out.println(objCapsule.pen);


        // how to achieve encapsulation
        // step 1-> make variable private
        // step 2 -> create and use setter
        // step 3 -> create and use getter


        Capsule objCapsule = new Capsule();
//        objCapsule.pen = "ant-shant";
//        System.out.println(objCapsule.pen);

//        System.out.println(objCapsule.capsulePenDe());
//        objCapsule.capsulePenSetKr("voilet");
//        System.out.println(objCapsule.capsulePenDe());

        // polymorphism = "poly" and "morphism" = "many" "forms"
        // methodOverloading(compile time), methodOverriding(run time)

//        System.out.println('a');
//        System.out.println(4);
//        System.out.println(5.45);
//        System.out.println("atul");

        // read criteria for method overloading...
//        Food foodObj = new Food();
//        foodObj.makeFood(true, true);
//        foodObj.makeFood(true, true, true);

//        Food objFood = new ChineseFood();
//        objFood.makeFood();

//        Map<Integer, Integer> mp = new HashMap<>();
//        mp.put(5, 0);
//        mp.put(6, 0);
//
//        int y = mp.get(5);


        // access modifiers ->
//        public
//        private
//        protected
//        -> default

        // exception handling ->
        // you might know as a programmer but not as a program.

        // connect with db
        // ask for list of notes
        // use those notes

        // try, catch, finally, throw, throws
        // checked and unchecked


//        FileReader file = new FileReader("C:\\test\\a.txt");
//        BufferedReader fileInput = new BufferedReader(file);
//
//        String n = null;
//        System.out.println(n.length());
    // one try must have at least one catch...
    // one try can have multiple catch blocks...

    // to save a program from crashing we use try - catch...
        // class is not a place to perform bare operations...
    // you can write try - finally without catch


//        try {
//            String n = null;
//            System.out.println(n.length());

//            System.out.println("hey sir");
//            FileReader file = new FileReader("C:\\test\\a.txt");
//            BufferedReader fileInput = new BufferedReader(file);

//            int i = 5/0;

//        } catch (NullPointerException eObject) {
//            System.out.println("hey atul");
//
//        } finally {
//            System.out.println("hey ekam");
//        }
//
//
//        System.out.println("hey abhishek");


            Food objFood = new Food();

            try {
                objFood.makeFood();
            } catch(GalatFileDhundRaheHoException eObject) {
                System.out.println(eObject.getMessage());
            }


        // using throw with unchecked exception is meaningless





    }
}
