//Дан массив целых чисел.
// Найти количество положительных элементов, расположенных на позициях не кратных 3.
public class PositiveElements {
    public static int countPositiveElements(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 3 != 0 && array[i] > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 4, 5, 6, 7, 45, 45};
        System.out.println(countPositiveElements(array));
    }
}
