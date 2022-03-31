import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {

        String[][] xArray = new String[10][10];
        String x = "X";

        for (int i = 0; i < xArray.length; i++)
        {
            xArray[i][i] = x;
            xArray[i][xArray.length - i - 1] = x;
        }
        System.out.println(xArray.length);

        for (int i = 0; i < xArray.length; i++)
        {
            System.out.println(Arrays.toString(xArray[i]));
        }

    }
}
