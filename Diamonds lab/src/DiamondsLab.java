import java.util.Scanner;
public class DiamondsLab {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        int carats = -1;
        int value = 0;

        System.out.print("Enter the name of the girl: ");
        Girl diamondGirl = new Girl(keyboard.next());

        while (carats != 0) {
            System.out.println(diamondGirl);
            System.out.print("Enter carats and value: ");
            carats = keyboard.nextInt();
            value = keyboard.nextInt();
            Diamond nextDiamond = new Diamond(carats, value);
            diamondGirl.SetDiamond(nextDiamond);
        }

    }
}
