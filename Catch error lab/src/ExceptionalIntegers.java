import java.util.ArrayList;
//======================================================================================================================
public class ExceptionalIntegers {
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int i = 0;
        ArrayList<Integer> numList = new ArrayList<>();

        for (i = 0; i < args.length; ++i) {
            try {
                numList.add(inputData(args[i]));
                System.out.println("Converter says input is OK -- " + args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Argument \"" + args[i] + "\" is not an int.");
            }

        }
        System.out.println();
        System.out.println("Vector contents are: ");
        for (i = 0; i < numList.size(); i++) {
            System.out.println("Item " + i + " is " + numList.get(i));
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public static int inputData(String inputString) throws NumberFormatException {
        int numbers;
        numbers = Integer.parseInt(inputString);
        return (numbers);
    }
//----------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
