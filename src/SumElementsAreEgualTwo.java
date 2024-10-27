public class SumElementsAreEgualTwo {
    public static int sumElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if(number >= 100){
                int lastDigit = number % 10;
                int secondLastDigit = (number / 10) % 10;

                if(lastDigit == secondLastDigit) {
                    sum += number;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {121, 234, 435, 442, 111, 111};
        int sum = sumElements(array);
        System.out.println("Сумма последней и предпоследней цифр при их равности " + sum);
    }
}
