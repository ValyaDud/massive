public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }

        int positiv = 0;
        int negativ = 0;
        int zero = 0;
        int sumPositive = 0;
        int sumNegative = 0;
        int average = 0;

        for (int item : array) {
            if (item > 0) {
                positiv++;
                sumPositive += item;
            } else if (item < 0) {
                negativ++;
                sumNegative += item;
            } else {
                zero++;
            }
        }
        average = (sumPositive + sumNegative) / 2;

        System.out.println("Info");
        System.out.println("+: " + positiv);
        System.out.println("-: " + negativ);
        System.out.println("0 :" + zero);
        System.out.println("Sum + :" + sumPositive);
        System.out.println("Sum - :" + sumNegative);
        System.out.println("average :" + average);
    }
}
