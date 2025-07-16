package pl.projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(addSubtract(getNumbers(sc)));
    }

    public static double addSubtract(double[] nums){
        double result = 0;
        if(nums== null){
            System.out.println("Input number is invalid");
        }else{
            for (double num : nums) {
                result += num;
            }
            return result;
        }
        return result;
    }

    public static double[] getNumbers(Scanner sc) {
        System.out.println("Enter several double numbers, separated by commas, e.g. 3.14, 2.0, 5.67");
        String input = sc.nextLine();
        String[] numbers = input.split(",");
        double[] numberArray = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            try {
                numberArray[i] = Double.parseDouble(numbers[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + numbers[i]);
                return null;
            }
        }
        return numberArray;
    }
}