//Дан массив целых чисел.
// Найти сумму элементов, у которых последняя и предпоследняя цифры равны.

public class SumElementsAreEqual {
    public static int sumElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[array.length - 1] == array[array.length - 2]) {
                sum = array[array.length - 1] + array[array.length - 2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arrays = new int[] {2, 4, 5, 4, 5};
        System.out.println(sumElements(arrays));

    }
}
