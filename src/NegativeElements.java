//Дан массив целых чисел.
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class NegativeElements {
    public static void replaceNegativeElements(int[] array) {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if(number >= 10 && number <= 99) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                array[i] = sumIndex;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12, -5, 34, -8, 76, -1, 23};
        replaceNegativeElements(array);
        System.out.println("Измененный массив: ");
        for(int element : array) {
            System.out.print(element + " ");
        }

    }
}
