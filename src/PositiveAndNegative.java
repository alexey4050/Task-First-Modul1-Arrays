// Дан массив целых чисел. Верно ли, что массив является знакочередующимся.
public class PositiveAndNegative {
    public static boolean isAlternating(int[] array) {
        if(array.length < 2) {
            return true;
        }
        boolean isPositive = array[0] > 0;
        for (int i = 1; i < array.length; i++) {
            if(isPositive) {
                if(array[i] <= 0) {
                    isPositive = false;
                } else {
                    return false;
                }
            } else {
                if (array[i] >= 0) {
                    isPositive = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, -4, 5};
        int[] array2 = {1, 2, -3, 4, -5};
        int[] array3 = {1, -2, 3, 4, -5};
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {-1, 2, -3, 4, -5};
        int[] array6 = {1};
        int[] array7 = {};

        System.out.println("Массив 1 знакочередующийся: " + isAlternating(array1));
        System.out.println("Массив 2 знакочередующийся: " + isAlternating(array2));
        System.out.println("Массив 3 знакочередующийся: " + isAlternating(array3));
        System.out.println("Массив 4 знакочередующийся: " + isAlternating(array4));
        System.out.println("Массив 5 знакочередующийся: " + isAlternating(array5));
        System.out.println("Массив 6 знакочередующийся: " + isAlternating(array6));
        System.out.println("Массив 7 знакочередующийся: " + isAlternating(array7));
    }
}
