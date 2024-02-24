package hus.oop.lab2;
import java.util.*;
public class StringAndCharacterExercise {


    /**
     * Exercise 1.1: Reverse String
     */

    public static void testReverseString(Scanner in) {
        String intStr;
        int inStrLen;
        System.out.print("Enter a String: ");
        intStr = in.nextLine();
        inStrLen = intStr.length();
        String reversedString = reverseString(intStr, inStrLen);
        System.out.print("The reverse of String " + "\"" + intStr + "\"" + " is " + "\"" + reversedString + "\"");
    }
    public static String reverseString(String intStr, int inStrLen) {
        String reversedString = "";
        for(int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            reversedString += intStr.charAt(charIdx);
        }
        return reversedString;
    }

    /**
     * Exercise 1.2: CountVowelsDigits
     */
    public static int countVowels(String inStr) {
        int vowelsQuant = 0;
        int inStrLen = inStr.length();
        for(int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if(Character.isAlphabetic(inStr.charAt(charIdx))) {
                if(inStr.charAt(charIdx) == 'a')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'i')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'u')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'e')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'o')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'A')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'I')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'U')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'E')
                    vowelsQuant++;
                else if(inStr.charAt(charIdx) == 'O')
                    vowelsQuant++;
            }
        }
        return vowelsQuant;
    }

    public static int countDigits(String inStr) {
        int digitsQuant = 0;
        int inStrLen = inStr.length();
        for(int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if(Character.isDigit(inStr.charAt(charIdx))) {
                digitsQuant++;
            }
        }
        return digitsQuant;
    }

    public static void testCountVowelsDigit(Scanner in) {
        String inStr;
        System.out.println();
        System.out.print("Enter a String: ");
        inStr = in.nextLine();
        int inStrLen = inStr.length();
        int vowelsQuant = countVowels(inStr);
        int digitsQuant = countDigits(inStr);

        //Calculate the percentage of vowels and digits in String
        double vowelsPercentage = (double) vowelsQuant / inStrLen * 100;
        double digitsPercentage = (double) digitsQuant / inStrLen * 100;

        //Print out 
        System.out.print("Number of vowels: " + vowelsQuant);
        System.out.print(" " + "(" + vowelsPercentage + ")" + "%");
        System.out.println();
        System.out.print("Number of digits: " + digitsQuant);
        System.out.print(" " + "(" + digitsPercentage + ")" + "%");
        System.out.println();
    }


    /**
     * Exercise 1.3: PhoneKeyPad
     * */
    //Converts the string inStr to a sequence of keypad digits.
    public static String phoneKeyPad(String inStr) {
        String digitsOfKeyPad = "";
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if(inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'b' || inStr.charAt(charIdx) == 'c')
                digitsOfKeyPad += "2";
            else if(inStr.charAt(charIdx) == 'd' || inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'f')
                digitsOfKeyPad += "3";
            else if (inStr.charAt(charIdx) == 'g' || inStr.charAt(charIdx) == 'h' || inStr.charAt(charIdx) == 'i')
                digitsOfKeyPad += "4";
            else if(inStr.charAt(charIdx) == 'j' || inStr.charAt(charIdx) == 'k' || inStr.charAt(charIdx) == 'l')
                digitsOfKeyPad += "5";
            else if(inStr.charAt(charIdx) == 'm' || inStr.charAt(charIdx) == 'n' || inStr.charAt(charIdx) == 'o')
                digitsOfKeyPad += "6";
            else if(inStr.charAt(charIdx) == 'p' || inStr.charAt(charIdx) == 'q' || inStr.charAt(charIdx) == 'r' || inStr.charAt(charIdx) == 's')
                digitsOfKeyPad += "7";
            else if(inStr.charAt(charIdx) == 't' || inStr.charAt(charIdx) == 'u' || inStr.charAt(charIdx) == 'v')
                digitsOfKeyPad += "8";
            else if(inStr.charAt(charIdx) == 'w' || inStr.charAt(charIdx) == 'x' || inStr.charAt(charIdx) == 'y' || inStr.charAt(charIdx) == 'z')
                digitsOfKeyPad += "9";
        }
        return digitsOfKeyPad;
    }

    public static void testPhoneKeyPad(Scanner in) {
        System.out.print("Enter a String: ");
        String inStr = in.nextLine().toLowerCase();
        String digitsOfKeyPad = phoneKeyPad(inStr);
        System.out.println(digitsOfKeyPad);
        System.out.println();
    }

    /**
     * Exercise 1.4: Caesar's Code
     * */
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Mapping the character and its position number
    public static  String cipherCaesarCode(String inStr) {
        int shiftKey = 3;   // The different position between the original character and the replaced character
        String cipherText = ""; //Store the encrypted text
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int charPosition = ALPHABET.indexOf(inStr.charAt(charIdx)); // Find the position number of the character
                                                                        // At index "charIdx" in the input String
            int outCharValue = (shiftKey + charPosition) % 26;  //Encryption phase with shift n = En (x) = (x+n)mod 26
            char encryptedChar = ALPHABET.charAt(outCharValue);
            cipherText += encryptedChar;
        }
        return cipherText;
    }

    public static void testCipherCaesarCode(Scanner in) {
        String inStr;
        System.out.print("Enter a plaintext string: ");
        inStr = in.nextLine().toUpperCase();
        String cipherText = cipherCaesarCode(inStr);
        System.out.println("The ciphertext string is: " + cipherText);
    }

    /**
     * Exercise 1.5: Decipher Caesar's Code
     * */
    public static  String decipherCaesarCode(String inStr) {
        int shiftKey = 3;   // The different position between the original character and the replaced character
        String plaintext = ""; //Store the plaintext
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int charPosition = ALPHABET.indexOf(inStr.charAt(charIdx)); // Find the position number of the character
                                                                        // At index "charIdx" in the input String

            int outCharValue = (charPosition - shiftKey) % 26;  //Decryption phase with shift n = Dn (x) = (x-n)mod 26
            if(outCharValue < 0) {  //in case where the output value of character is negative
                outCharValue = ALPHABET.length() + outCharValue;
            }
            char plaintextChar = ALPHABET.charAt(outCharValue);
            plaintext += plaintextChar;
        }
        return plaintext;
    }

    public static void testDecipherCaesarCode(Scanner in) {
        String inStr;
        System.out.print("Enter a ciphertext string: ");
        inStr = in.nextLine().toUpperCase();
        String plaintext = decipherCaesarCode(inStr);
        System.out.println("The plaintext string is: " + plaintext);
    }

    /**
     * Exercise 1.6: CheckHexString
     * */
    public static boolean isHexString(String hexStr) {
        for(int charIdx = 0; charIdx < hexStr.length(); charIdx++) {
            if(!((hexStr.charAt(charIdx) >= '0' && hexStr.charAt(charIdx) <= '9')
                || (hexStr.charAt(charIdx) >= 'A' && hexStr.charAt(charIdx) <= 'F')
                || (hexStr.charAt(charIdx) >= 'a' && hexStr.charAt(charIdx) <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString(Scanner in) {
        String hexStr;
        System.out.println("Enter a hex string");
        hexStr = in.nextLine();
        if(isHexString(hexStr))
            System.out.println("\"" + hexStr + "\"" + "is a hex string");
        else
            System.out.println("\"" + hexStr + "\"" + "is NOT a hex string");
    }
    /**
     * Exercise 1.7: BinaryToDecimal
     * */
    public static int binaryToDecimal(String binStr) { //convert binary string to decimal number
        int decimalNum = 0;
        int power = 0;
        for(int charIdx = 0; charIdx < binStr.length(); charIdx++) {
            char digit = binStr.charAt(charIdx);
            if(digit == '1') {
                decimalNum += Math.pow(2, power);
            }
            power++;
        }
        return decimalNum;
    }

    //check if binary string is valid
    public static boolean isBinaryString(String binStr) {
        for(int charIdx = 0; charIdx < binStr.length(); charIdx++) {
            if(binStr.charAt(charIdx) != 0 && binStr.charAt(charIdx) != 1)
                return false;
        }
        return true;
    }
    public static void testBinaryToDecimal(Scanner in) {
        String binStr;
        System.out.print("Enter a Binary string: ");
        binStr = in.nextLine();
        System.out.println();
        if(isBinaryString(binStr)) {
            int decimalNum = binaryToDecimal(binStr);
            System.out.println("The equivalent decimal number for binary" + "\"" + binStr + "\"" + " is: " + decimalNum);
        } else
            System.out.println("error: invalid binary string" + "\"" + binStr + "\"");
        System.out.println();
    }

    /**
     * Exercise 1.8: HexadecimalToDecimal
     * */
    public static int hexadecimalToDecimal(String hexStr) {
        return Integer.parseInt(hexStr, 16);
    }

    public static void testHexadecimalToDecimal(Scanner in) {
        String hexStr;
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = in.nextLine();
        System.out.println();
        if(isHexString(hexStr)) {
            int decimalNum = hexadecimalToDecimal(hexStr);
            System.out.println("The equivalent decimal number for hexadecimal string" + "\"" + hexStr + "\"" + " is: " + decimalNum);
        } else {
            System.out.println("error: invalid hexadecimal string" + "\"" + hexStr + "\"");
        }
    }

    /**
     * Exercise 1.9: OctalToDecimal
     */
    public static int octalToDecimal(String octalStr) {
        return Integer.parseInt(octalStr, 8);
    }

    public static void testOctalToDecimal(Scanner in) {
        String octalStr;
        System.out.print("Enter an Octal string: ");
        octalStr = in.nextLine();
        int decimalNum = octalToDecimal(octalStr);
        System.out.println("The equivalent decimal number " + "\"" + octalStr + "\"" + " is: " + decimalNum);
    }
    /**
     * Exercise 1.10: RadixNToDecimal
     */
    public static int radixNToDecimal(String radixNStr, int radix) {
        int decimalNum = 0;
        if(radix == 2) {
            decimalNum = binaryToDecimal(radixNStr);
        } else if(radix == 8) {
            decimalNum = octalToDecimal(radixNStr);
        } else if (radix == 16) {
            decimalNum = hexadecimalToDecimal(radixNStr);
        } else {
            System.out.println("error: invalid radix number!");
        }
        return decimalNum;
    }

    public static void testRadixNToDecimal(Scanner in) {
        int decimalNum = 0;
        int radix;
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        System.out.println();
        String radixNStr;
        System.out.print("Enter the string: ");
        radixNStr = in.nextLine();
        decimalNum = radixNToDecimal(radixNStr, radix);
        System.out.println("The equivalent decimal number " + "\"" + radixNStr + "\"" + "is: " + decimalNum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testReverseString(in);
        testCountVowelsDigit(in);
        testPhoneKeyPad(in);

        testCipherCaesarCode(in);
        System.out.println();

        testDecipherCaesarCode(in);
        System.out.println();

        testHexString(in);
        System.out.println();

        testBinaryToDecimal(in);
        System.out.println();

        testHexadecimalToDecimal(in);
        System.out.println();

        testOctalToDecimal(in);
        System.out.println();


    }
}
