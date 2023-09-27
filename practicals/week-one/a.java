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
        case 2: 
          Main.two();
          break;
        case 3:
          Main.three();
          break;
        case 4:
          Main.four();
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
    int tom = 38, gina = 22, bruce = 28, alice = 39;
    var total = tom + gina + bruce + alice;
    var average = total / 4;
    System.out.println(">> The average score is " + average);
  }

  private static void two() {
    int n = 10, ppi = 20;
    var subtotal = n * ppi;
    var tax = subtotal * (8/100);
    var total = subtotal + tax;
    System.out.println(">> The total (with tax) is " + total);
  }

  private static void three() {
    int hoursWorked = 60, basePay = 500, overtimeRate = 10;
    var overtimePay = hoursWorked * overtimeRate;
    var totalWeeklySalary = basePay + overtimePay;
    System.out.println(">> The weekly pay is £" + totalWeeklySalary);
  }

  private static void four() {
    final int MONTHS = 12;
    var savingsGoal = 1000;
    var monthlySavings = savingsGoal / MONTHS;
    System.out.println(">> The monthly saving target to meet is £" + monthlySavings);
  }
}
