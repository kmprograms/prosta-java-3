/*
    Napisz program, w którym dla przykładowej tablicy liczb całkowitych
    obliczysz sumę tych elementów, które znajdują się pod parzystym indeksem.
*/

public class App {
    static int sumEvenIdxNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        var sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        var numbers = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(sumEvenIdxNumbers(numbers));
    }
}
