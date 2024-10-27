//Дан массив целых чисел.
// Найти количество пар соседних элементов, где первый элемент вдвое больше второго.

public class NumberPairsElements {
    public static int countPairsElements(int[] array) {
        int countPairs = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == 2 * array[i + 1]) {
                countPairs += 1;
            }
        }
        return countPairs;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 8, 4, 9, 3};
        System.out.println("Количество пар: " + countPairsElements(array));
    }
}
