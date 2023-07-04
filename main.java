import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class WPM{

    static String[] words = {"phone","computer","mouse","idiot","java","antelope","elephant","calcutta","bigboss","generations"};
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("3");
        // TimeUnit.SECONDS.sleep(1);

        // System.out.println("2");
        // TimeUnit.SECONDS.sleep(1);

        // System.out.println("1");
        // TimeUnit.SECONDS.sleep(1);

        // System.out.println("GO -->");
        // TimeUnit.SECONDS.sleep(1);
        System.out.print("\n------------------------------------------------------------------------------------------\n");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(9)]+" ");   
        }
        System.out.print("\n------------------------------------------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);

        double startTimer = LocalTime.now().toNanoOfDay();

        String typedWords = sc.nextLine();
        int typedL = typedWords.length();
        

        double endTimer = LocalTime.now().toNanoOfDay();
        double totalTime = (int)(endTimer-startTimer)/1000000000.0;
        int wpm = (int)((double)(typedL/5) / totalTime)*10;
        System.out.println("WPM : "+wpm);
        System.out.println("Time Taken to type : "+(totalTime));



    }
}