import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[0]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        System.out.println("Задача 1");
        int[] boxApples = new int[3];
        boxApples[0] = 1;
        boxApples[1] = 2;
        boxApples[2] = 3;

        double[] apple = {1.57, 7.654, 9.986};

        int[] random = {1, 3, 2, 4, 5, 6, 8, 10, 9, 0, 7};
        random[0] = 7;
        int randomPower = random[0];
        System.out.println(randomPower);

        System.out.println("Задача 2");
        int[] boxApples1 = new int[3];
        boxApples1[0] = 1;
        boxApples1[1] = 2;
        boxApples1[2] = 3;
        int apples = 0;
        for (int i = 0; i < boxApples1.length; i++) {
            System.out.print(boxApples1[i]);
            if (i != boxApples1.length - 1) {
                System.out.print(", ");

            }
        }
        System.out.println();

        double[] apple1 = {1.57, 7.654, 9.986};
        double applesRed = apple1[0];
        for (int i = 0; i < apple1.length; i++) {
            System.out.print(apple1[i]);
            if (i != apple1.length - 1) {
                System.out.print(", ");
            }
        }


        System.out.println();

        int[] random1 = {1, 3, 2, 4, 5, 6, 8, 10, 9, 0, 7};
        int powerRandom = random1[0];
        for (int r = 0; r < random1.length; r++) {
            System.out.print(random1[r]);
            if (r != random1.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("Задача 3");
        int[] boxApples2 = new int[3];
        boxApples2[0] = 1;
        boxApples2[1] = 2;
        boxApples2[2] = 3;
        for (int i = boxApples2.length - 1; i >= 0; i--) {
            System.out.print(boxApples2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] apple2 = {1.57, 7.654, 9.986};
        for (int i = apple2.length - 1; i >= 0; i--) {
            System.out.print(apple2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] random2 = {1, 3, 2, 4, 5, 6, 8, 10, 9, 0, 7};
        for (int r = random2.length - 1; r >= 0; r--) {
            System.out.print(random2[r]);
            if (r > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] fish = new int[]{1, 2, 3};
        for (int i = 0; i < fish.length; i++) {
            if (fish[i] % 2 != 0) {
                fish[i] = fish[i] + 1;
            }
        }
        System.out.println(Arrays.toString(fish));


    }
}