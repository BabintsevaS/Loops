import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      for (int i = 0; i < 6; i++) {
//          System.out.println("Hello");
//      }
//
//      for (int i = 0; i < 10 ; i = i + 1) {
//            System.out.println(i);
//
//            if (i > 5) {
//                break;
//            }
//        }

//        for (int i = 0; i < 10; i = i + 1) {
//
//            if (i == 2) {
//                continue;
//            }
//
//            System.out.println(i);
//        }

      //String color = "ghfjkghfjkg";
      System.out.println("Enter the color of traffic light that you see: ");
      Scanner scanner = new Scanner(System.in);
      String color = scanner.nextLine();

      if (color.equals("red")) {
          System.out.println("You cannot cross the road! Wait!");
      } else if (color.equals("yellow")) {
          System.out.println("Wait!");
      } else if (color.equals("green")) {
          System.out.println("You can cross the road");
      } else System.out.println("The traffic light is broken!");
/*
      int i = 0;
      while (i < 10) {
          System.out.println(i);
          i = i + 2;
      }
*/
/*
      int i = 0;
      do {
          i = i + 2;
          System.out.println(i);
      } while (i < 10);
*/
    }
}
