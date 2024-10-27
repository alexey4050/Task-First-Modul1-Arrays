import java.util.Arrays;

public class ArrayModifier{

    public static void modifyArray(int[] array) {
        if (isSortedArray(array)) {
            for (int i = 1; i < array.length; i += 2) {
                array[i] *= 2;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0 && array[i] % 10 == 5) {
                    array[i] *= array[i];
                }
            }
        }
    }
        public static boolean isSortedArray(int[] array) {
            for (int i = 1; i < array.length; i++) {
                if(array[i] < array[i - 1]) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // Упорядоченный массив
        int[] array2 = {1, 3, 2, 4, 5}; // Неупорядоченный массив
        int[] array3 = {-5, 2, -15, 4, -55}; // Неупорядоченный массив с отрицательными элементами

        modifyArray(array1);
        modifyArray(array2);
        modifyArray(array3);
        
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        System.out.println("Массив 3: " + Arrays.toString(array3));


    }
}
