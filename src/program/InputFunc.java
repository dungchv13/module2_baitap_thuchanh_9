package program;

import java.util.Scanner;

public class InputFunc {

    private static Scanner input = new Scanner(System.in);
    private static Validate val = new Validate();

    public static String inputString(String regex) {
        String result = input.nextLine();
        if (!val.isValidate(regex, result)) {
            System.out.println("your input is not match!");
            System.out.print("please re-enter: ");
            result = inputString(regex);
        }
        return result;
    }
    public static String inputDate(){
        String result = input.nextLine();
        if (!val.isValidateDate(result)) {
            System.out.println("your input is not match!");
            System.out.print("please re-enter: ");
            result = inputDate();
        }
        return result;
    }



}
