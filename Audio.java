import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner=new Scanner(System.in);

        File file = new File("Hozier-Too Sweet.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
       
        System.out.println("        <)) Audio Player 1.0 ((>        \n");
        String response="";

        while (!response.equals("Q")) {

            System.out.println("P = Play | S = Stop | R = Reset | Q = Quit");
            System.out.print("Enter your Choice: ");
            response=scanner.nextLine().toUpperCase();
            System.out.println();

            switch (response) {
                case "P":clip.start();
                    break;
                case "S":clip.stop();
                    break;
                case "R":clip.setMicrosecondPosition(0);
                    break;
                case "Q":clip.close();
                    break;
                default:System.out.println("Invalid input");
                    break;
            }
        }

        System.out.println();
        System.out.println("        <)) Good Bye Hommies !! ((>        \n");
    }
}