import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * findPrimeNumbers
 */
public class findPrimeNumbers {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Mobile Programming\\tpp\\JavaCodes\\17-12-2021\\primeNumbers.txt");

        try {
            FileWriter fOutput = new FileWriter(
                    "C:\\Users\\Mobile Programming\\tpp\\JavaCodes\\17-12-2021\\outputPrimeNumbers.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int myNewVal = Integer.parseInt(val);
                System.out.println(myNewVal);

                boolean flag = false;
                for (int i = 2; i <= myNewVal / 2; ++i) {
                    // condition for nonprime number
                    if (myNewVal % i == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    System.out.println(myNewVal + " is a prime number.");
                    String result = String.valueOf(myNewVal);
                    fOutput.write(result + " is a prime number." + '\n');
                } else
                    System.out.println(myNewVal + " is not a prime number.");
            }
            sc.close();
            fOutput.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}