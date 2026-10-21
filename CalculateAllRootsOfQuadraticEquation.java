package UdemyExercises;

public class CalculateAllRootsOfQuadraticEquation {


    // Function to calculate the discriminant of a quadratic equation
    public static double calculateDiscriminant(double a, double b, double c) {


        double discriminant = b * b - 4 * a * c;
        return discriminant;
    }


    // Function to find all roots of a quadratic equation
    public static String findRoots(double a, double b, double c) {

        double discriminant = calculateDiscriminant(a, b, c);

        String result;

        if (a == 0) {
            result = "Not a quadratic equation (a cannot be zero).";
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = String.format("Roots are real and distinct: %.2f, %.2f", x1, x2);
            //("Roots are real and distinct: " + "root1: " + x1 + ", root2: " + x2);
        } else if (discriminant < 0) {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            result =  String.format("Roots are complex: %.2f + %.2fi, %.2f - %.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
            //("Roots are complex: "+ realPart + " + " + imaginaryPart + "i" + realPart + " - " + imaginaryPart + "i");    // same code need is 2 decimal lang
        } else {//(discriminant == 0) {
            double x = -b / (2 * a);
            result =  String.format("Roots are real and equal: %.2f", x);
            // "Roots are real and equal: " + x;
        }

        return result;

    }


//Insert to Main
    /* public static String findRoots(double a, double b, double c) {

        double discriminant = calculateDiscriminant(a, b, c);

        String result;

        if (a == 0) {
            result = "Not a quadratic equation (a cannot be zero).";
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = String.format("Roots are real and distinct: %.2f, %.2f", x1, x2);
            //("Roots are real and distinct: " + "root1: " + x1 + ", root2: " + x2);
        } else if (discriminant < 0) {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            result =  String.format("Roots are complex: %.2f + %.2fi, %.2f - %.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
            //("Roots are complex: "+ realPart + " + " + imaginaryPart + "i" + realPart + " - " + imaginaryPart + "i");    // same code need is 2 decimal lang
        } else {//(discriminant == 0) {
            double x = -b / (2 * a);
            result =  String.format("Roots are real and equal: %.2f", x);
            // "Roots are real and equal: " + x;
        }

        return result;

    }   */



}
