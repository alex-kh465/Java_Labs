import java.util.Scanner;

public class Program1 {
    String c_no;
    int valid;
    public Program1() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the credit card number: ");
            this.c_no = scanner.nextLine();
            scanner.close();
            if ( c_no.length() >= 8 && c_no.length() <= 9 ){
                valid = 1;
            }
            else{
    
                valid = 0;
            }
            switch (valid) {
                case 1:
                    
                    //remove the last digit
                    String temp = c_no.substring(0, c_no.length() - 1);
                    //reverse the string
                    String reversed = new StringBuilder(temp).reverse().toString();
                    //double the odd positions
                    // Iterate through the input string
                    StringBuilder output = new StringBuilder();  // To store the result
                    int totalSum = 0;  // Variable to store the sum of all digits

                    // Iterate through the input string
                    for (int i = 0; i < reversed.length(); i++) {
                        char ch = reversed.charAt(i);  // Get the character at position i

                        // Convert the character to an integer digit
                        int digit = Character.getNumericValue(ch);

                        // Check if the current position is odd (1st, 3rd, 5th, etc.)
                        if (i % 2 != 0) {
                            // Double the digit at the odd position
                            digit *= 2;

                            // If the doubled value is two digits (>= 10), sum the digits
                            if (digit >= 10) {
                                digit = (digit / 10) + (digit % 10);  // Sum the digits of a two-digit number
                            }
                        }

                        // Append the processed digit to the output
                        output.append(digit);

                        // Add the digit to the total sum
                        totalSum += digit;
                    }

                    // Get the last digit of the sum
                    int lastDigitOfSum = totalSum % 10;

                    // Subtract the last digit of the sum from 10
                    int result = 10 - lastDigitOfSum;

                    // Get the last character of the string
                    char lastChar = c_no.charAt(c_no.length() - 1);

                    // Convert the last character to an integer
                    int lastDigit = Character.getNumericValue(lastChar);

                    if (result == lastDigit){
                        System.out.println("Valid");
                    }
                    else{
                        System.err.println("Invalid");
                    }


                    
                    
                    break;
                default:
                    System.out.print("Invalid");;
            }
        }
    public void display() {
        
    }
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.display();
        
        
    }
}

