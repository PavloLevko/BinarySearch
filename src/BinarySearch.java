public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

// Перевіряємо, чи є середній елемент тим, що ми шукаємо
            if (array[middle] == target) {
                return middle;
            }
// Якщо шуканий елемент менший за середній
            if (array[middle] > target) {
                right = middle - 1;
            }
// Якщо шуканий елемент більший за середній
            else {
                left = middle + 1;
            }
        }
// Якщо елемент не знайдено
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 100, 122, 123, 145, 150, 155};
        int target = 23;

        int result = binarySearch(numbers, target);
        if (result == -1) {
            System.out.println("Елемент не знайдено.");
        } else {
            System.out.println("Елемент знайдено на індексі: " + result);
        }
    }
}