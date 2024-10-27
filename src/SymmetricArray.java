//Дан массив целых чисел. Верно ли, что массив является симметричным.
public class SymmetricArray {
    public static boolean isSymmetric(int[] array) {
        if(array.length <= 1) {
            return true;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[array.length - 1 - i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 2, 1};
        int[] array3 = {1, 2, 3, 4, 5};
        int[] array4 = {};
        int[] array5 = {1};

        System.out.println("Массив 1 симметричный: " + isSymmetric(array1));
        System.out.println("Массив 2 симметричный: " + isSymmetric(array2));
        System.out.println("Массив 3 симметричный: " + isSymmetric(array3));
        System.out.println("Массив 4 симметричный: " + isSymmetric(array4));
        System.out.println("Массив 5 симметричный: " + isSymmetric(array5));
    }
}
