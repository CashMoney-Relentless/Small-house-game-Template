import java.util.Scanner;
import javax.swing.*;
public class mongolianpirates {
    static Scanner scanner = new Scanner(System.in);
    static int guess;
    static boolean playing = false;
    static int strike = 0;
    static int crowbar = 0;
    public static void main(String[] args) {
        promt();
        while (playing) {
            welcomeTo();
        }
    }

    public static void promt() {
        System.out.println("Welcome to my House!");
        System.out.println("1. Play");
        System.out.println("2. Settings");
        System.out.println("3. Quit");
        System.out.println("4. idk");
        guess = scanner.nextInt();
        if (guess == 1) {
            playing = true;
        }
        if (guess == 2) {
            settings();
        }
        if (guess == 3) {
            playing = false;
        }


    }

    public static void settings() {
        System.out.println("nothing here");
        System.out.println("playing");
        System.out.println("go play");
        System.out.println("4. idk");
       guess = scanner.nextInt();
        if (guess == 4) {
            promt();
        }
    }

    public static void welcomeTo() {
        System.out.println("Welcome to my House!");
        System.out.println("1. walk in");
        System.out.println("2. knock");
        System.out.println("3. leave");
        System.out.println("4. go through the window");
        guess = scanner.nextInt();
        if (guess == 1) {
            int chance = (int) (Math.random() * 2) + 1;
            if (chance == 1) {
                onceIn();
            }
            else
                System.out.println("Locked :(");
            delay();
                welcomeTo();
        }
        if (guess == 2) {
            System.out.println("knock, knock...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("anyone home?");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            welcomeTo();
        }
        if (guess == 3) {
            promt();
        }
        if (guess == 4) {
            System.out.println("Um no one home i guess");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            onceIn();
            strike++;
        }
    }
    public static void onceIn() {
        System.out.println("Welcome to the inside of my house!");
        System.out.println("1. go to the kitchen");
        System.out.println("2. go to the living room");
        System.out.println("3. go upstairs");
        System.out.println("4. go into the hallway");
        guess = scanner.nextInt();
        if (guess == 1) {
kitchen();
        }
        if (guess == 2) {
livingroom();
        }
        if (guess == 3) {
upstairs();
        }
        if (guess == 4) {
hallway();
        }
    }
    public static void kitchen() {
        System.out.println("Welcome to the kitchen!");
        System.out.println("1. go to the garage");
        System.out.println("2. go to the living room");
        System.out.println("3. raid the fridge");
        System.out.println("4. go back to front door");
        guess = scanner.nextInt();
        if (guess == 1) {
garage();
        }
        if (guess == 2) {
livingroom();
        }
        if (guess == 3) {
            System.out.println("Player: hmm stocked with old food, i dont want to eat that...");
            delay();
            strike++;
            kitchen();
        }
        if (guess == 4) {
            onceIn();
        }
    }
        public static void livingroom() {
            System.out.println("Welcome to the Living Room!");
            System.out.println("1. turn on the tv");
            System.out.println("2. go to the kitchen");
            System.out.println("3. take a nap on the couch");
            System.out.println("4. open the window");
            guess = scanner.nextInt();
            if (guess == 1) {
                System.out.println("Welcome to Fox 45!");
                delay();
                System.out.println("Today the weather is 839 degrees with a stage 4 hurricane....");
                delay();
                System.out.println("Player: intersting....");
                delay();
                livingroom();
            }
            if (guess == 2) {
kitchen();
            }
            if (guess == 3) {
                System.out.println("Player: im tired i should take a nap");
                delay();
                System.out.println("Player: what time is it?");
                delay();
                System.out.println("Player: He inst here yet?, intersting....");
                delay();
            }
            if (guess == 4) {
                System.out.println("Player: its hot outside, im going to close it.");
                delay();
                livingroom();
            }
        }
        public static void delay() {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        public static void garage() {

            System.out.println("Welcome to the Garage!");
            System.out.println("1. look around");
            System.out.println("2. go look at the tool box");
            System.out.println("3. open garage");
            System.out.println("4. go back to kitchen");
            guess = scanner.nextInt();
            if (guess == 1) {
                System.out.println("Player: Hmm, his car is still here but he isnt home...");
                delay();
                System.out.println("Player: intersting....");
                delay();
                garage();
            }
            if (guess == 2) {
                System.out.println("Player: tools, expected, ill grab a crowbar just in case something funny is going on.");
                delay();
                garage();
                crowbar++;
            }
            if (guess == 3) {
                System.out.println("Player: hmm, doesnt open");
                delay();
                garage();
            }
            if (guess == 4) {
                System.out.println("Player: i should go back to the kitchen");
                delay();
                kitchen();
            }
        }
    public static void prestong() {
        System.out.println("I know its you, you have 3 seconds to close this app or i will inject a rat on your new computer");
        delay();
        System.out.println("I");
        delay();
        System.out.println("II");
        delay();
        System.out.println("III");

    }
    public static void hallway() {

        System.out.println("Welcome to the Hallway!");
        System.out.println("1. look around");
        System.out.println("2. go in the basement");
        System.out.println("3. goto the kitchen");
        System.out.println("4. go back to the front door");
        guess = scanner.nextInt();
        if (guess == 1) {
            System.out.println("Player: Hmm, basic");
            delay();
            hallway();
        }
        if (guess == 2) {
            System.out.println("what is the basement?");
            delay();
            System.out.println("heavy locks...");
           basement();
        }
        if (guess == 3) {
            System.out.println("Player: hmm, doesnt open");
            delay();
            garage();
        }
        if (guess == 4) {
            System.out.println("Player: i should go back to the front door");
            delay();
            kitchen();
        }
    }
    public static void upstairs() {
        System.out.println("Welcome to the upstairs!");
        System.out.println("1. go to the bedroom");
        System.out.println("2. go back down stairs");
        System.out.println("3. wait");
        System.out.println("4. learn math");
        guess = scanner.nextInt();
        if (guess == 1) {
            bedroom();
        }
        if (guess == 2) {
            onceIn();
        }
        if (guess == 3) {
            System.out.println("Player: hmm silent...");
            delay();
            upstairs();
        }
        if (guess == 4) {
            mathmrsk();
            System.out.println("Player: hmm...");
        }
    }
    public static void mathmrsk() {
        System.out.println("Welcome to math");
        int chance1 = (int) (Math.random() * 20) + 1;
        int chance2 = (int) (Math.random() * 50) + 1;
        System.out.println("what is"+chance1+"+"+chance2);
        guess = scanner.nextInt();
        if (guess == chance1+chance2) {
            System.out.print("goodjob, goodbye!");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        upstairs();
    }
    public static void bedroom() {
        System.out.println("Welcome to the bedroom!");
        System.out.println("1. go back to the upstairs");
        System.out.println("2. open closet");
        System.out.println("3. take a nap");
        System.out.println("4. look around");
        guess = scanner.nextInt();
        if (guess == 1) {
            upstairs();
        }
        if (guess == 2) {
            System.out.println("Player: wow pretty basic, only 3 white shirts");
        }
        if (guess == 3) {
            System.out.println("Player: im tired i should take a nap");
            delay();
            System.out.println("Player: what time is it?");
            delay();
            System.out.println("Player: He inst here yet?, intersting....");
        }
        if (guess == 4) {
            System.out.println("Player: looks like a bomb went off in here, intersting....");
            delay();
            System.out.println("Player:....");
            delay();
            bedroom();
        }
    }
    public static void basement() {
        System.out.println("Welcome to the basement!");
        System.out.println("1. go back to upstairs");
        System.out.println("2. open a door");
        System.out.println("3. wait");
        System.out.println("4. look around");
        guess = scanner.nextInt();
        if (guess == 1) {
            hallway();
        }
        if (guess == 2) {
            System.out.println("opens");
        }
        if (guess == 3) {
            System.out.println("boring");
            delay();
            System.out.println("stop waiting");
            delay();
            System.out.println("do something");
            delay();
            basement();
        }
        if (guess == 4) {
            System.out.println("Player: empty");
            delay();
            System.out.println("Player:....");
            delay();
            basement();
        }
    }
}

