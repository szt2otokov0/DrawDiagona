import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        int lineLength = 0;
        Runnable drawPercent = () -> System.out.print('%');
        Runnable drawSpace = () -> System.out.print(' ');
        Scanner scn = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int length = scn.nextInt();

        for (int i = 0; i < length; i++) {
            drawPercent.run();
            lineLength++;
        }
        System.out.print('\n');
        for (int i = 0; i < length-2; i++) {
            lineLength = 0;
            drawPercent.run();
            lineLength++;
            for (int j = 0; j < i; j++) {
                drawSpace.run();
                lineLength++;
            }
            drawPercent.run();
            lineLength++;
            for (int j = 0; j < length-(lineLength+1); j++) {
                drawSpace.run();
            }
            drawPercent.run();
            System.out.print('\n');
            lineLength++;
        }
        for (int i = 0; i < length; i++) {
            drawPercent.run();
            lineLength++;
        }
    }
}