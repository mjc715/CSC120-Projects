import java.util.Scanner;
//=================================================================================
public class miamiPhone {
//---------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final String AREA_CODE = "305";
    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int phoneNumber;
        String origNumber;
        String code;

        //---- Gets user input, 7 digits only
        do {

            System.out.println("Please enter your 7 digit 305 number: ");
            phoneNumber = keyboard.nextInt();

        } while (phoneNumber >= 10000000 || phoneNumber < 1000000);

        //---- Stores originally entered number with area code added on front
        origNumber = AREA_CODE + phoneNumber;

        //---- Entered phone number is put into the code generator
        code = encodeNumber(phoneNumber);

        //---- Area code is scrambled then added to front of code
        phoneNumber = 305;
        code = encodeNumber(phoneNumber) + code;

        System.out.println("The phone number " + origNumber + " can be written" +
                " as " + code + ".");
    }
//---------------------------------------------------------------------------------
    private static String encodeNumber(int phoneNumber) {

        int i, number;
        double random;
        String code = "";
        char[] firstLetters = new char[10];
        int [] numLetters = {1,1,3,3,3,3,3,4,3,4};


        for (i = 0; i < 6; ++i) {
            firstLetters[i + 2] = ((char) (3 * i + 65));
        }

        firstLetters[8] = 'T';
        firstLetters[9] = 'W';
        firstLetters[0] = '0';
        firstLetters[1] = '1';



        while (phoneNumber > 0) {

            number = phoneNumber % 10;
            random = Math.floor(Math.random() * numLetters[number]);
            code = (char)((int)(firstLetters[number]) + random) + code;
            phoneNumber = phoneNumber / 10;

        }



        return (code);
    }
//-----------------------------------------------------------------------------------

    }
//===================================================================================



