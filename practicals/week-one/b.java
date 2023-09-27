
import java.io.*;

class Main {
  public static void main(String[] args) {
    mainLoop:
    for (;;) {
      switch (Main.getQuestion()) {
        case 0:
          System.out.println("Exiting...");
          break mainLoop;
        case 1:
          Main.one();
          break;
        default:
          System.out.println("No question found");
          break mainLoop;
      }
    }
  }

  private static int getQuestion() {
    try {
      System.out.println("What question do you want to execute?");
      Console console = System.console();
      if (console == null) {
        System.out.println("Couldn't get Console instance, this program must be run from the command line/terminal");
        System.exit(0);
      }
      return Integer.parseInt(System.console().readLine());
    } catch (NumberFormatException e) {
      System.out.println("Input is not a valid integer!");
      return 0;
    }
  }

  private static void one() {
    int a = 26, b = 48, c = 98;
    float avg = a + b + c / 3;
    System.out.println(">> Average is " + String.format("%.2f", avg));
  }
}
