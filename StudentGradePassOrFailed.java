package UdemyExercises;

import java.util.Scanner;

public class Main {

        public static void main (String [] args){


                    // Get name, grades, input ng grades calculate. determine if pass, or fail display result


                    Scanner sc = new Scanner(System.in);

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();



                    System.out.print("Enter grade in English: ");
                    double grade1 = sc.nextDouble();


                    System.out.print("Enter grade in Math: ");
                    double grade2 = sc.nextDouble();

                    System.out.print("Enter grade in Filipino: ");
                    double grade3 = sc.nextDouble();

                    double average = (grade1 + grade2 + grade3) / 3;

                    if(average >= 85 && average <=90) {
                        System.out.println(" You pass");
                    }
                    else if(average >= 90 && average <=99) {
                        System.out.println("Congratulations, you are with highest honor!.");
                    }else {
                        System.out.println("Sorry, you failed");
                    }



        }

}
