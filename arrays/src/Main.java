import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();

//1) Создайте массив из 10 целых чисел и заполните его числами от 1 до 10. Выведите массив на экран.
        System.out.print("10 целых чисел: ");
        {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//2) Найдите сумму элементов массива. Создайте массив из 5 элементов и вычислите сумму всех чисел в массиве.
        {
            int[] arr = new int[]{24, 78, 41, 16, 59};
            int summa = 0;
            for (int i = 0; i < arr.length; i++) {
                summa = summa + arr[i];
            }
            System.out.println("Сумма всех чисел: " + summa);
        }
//3) Найдите максимальный элемент массива. Создайте массив из 10 целых чисел и найдите максимальное значение.
        {
            int[] arr = new int[]{82, 28, 95, 41, 73, 107, 69, 56, 15, 34};
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Максимальное значение: " + max);
        }
//4) Найдите минимальный элемент массива. Создайте массив из 10 целых чисел и найдите минимальное значение.
        {
            int[] arr = new int[]{53, 94, 26, 7, 15, 61, 13, 88, 20, 93};
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Минимальное значение: " + min);
        }
//5) Посчитайте количество чётных чисел в массиве.
        {
            int[] arr = new int[]{16, 57, 80, 45, 56, 35, 76, 34, 25, 86};
            int chet = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    chet++;
                }
            }
            System.out.println("Количество чётных чисел: " + chet);
        }
//6) Посчитайте количество нечётных чисел в массиве.
        {
            int[] arr = new int[]{85, 17, 11, 45, 53, 76, 89, 91, 4, 50};
            int nechet = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    nechet++;
                }
            }
            System.out.println("Количество нечётных чисел: " + nechet);
        }
//7) Посчитайте среднее арифметическое всех элементов массива.
        {
            int[] arr = new int[]{10, 25, 34, 48, 53, 61, 70, 85, 19, 105};
            int arifmetic = 0;
            for (int i = 0; i < arr.length; i++) {
                arifmetic += arr[i];
            }
            System.out.println("Среднее арифметическое: " + (arifmetic / arr.length));
        }
//8) Выведите все элементы массива в обратном порядке.
        System.out.print("Элементы массива в обратном порядке: ");
        {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arr.length; i++) {
                int reverse = arr.length - i - 1;
                System.out.print(arr[reverse] + " ");
            }
            System.out.println();
        }
//9) Заполните массив случайными числами от 1 до 100 и выведите его на экран.
        System.out.print("Случайные числа: ");
        {
            int[] arr = new int[101];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(101);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//10) Поменяйте местами первый и последний элементы массива.
        System.out.print("Смена мест: ");
        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int first = arr[0];
            int last = arr[arr.length - 1];
            arr[0] = last;
            arr[arr.length - 1] = first;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
//11) Найдите разницу между максимальным и минимальным элементами массива.
        {
            int[] arr = new int[]{713, 57, 33, 86, 325, 856, 43, 89, 956, 567};
            int max = arr[0];
            int min = arr[0];
            int difference;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            difference = max - min;
            System.out.println("Разница: " + difference);
        }
//12) Посчитайте количество элементов, больше среднего арифметического.
        {
            int[] arr = new int[]{64, 78, 98, 477, 87, 876, 79, 50, 943, 267};
            int elements = 0;
            int elements2 = arr.length;
            for (int i = 0; i < arr.length; i++) {
                elements = elements + arr[i];
                elements2 = elements / arr.length;
            }
            int quantity = 0;
            for (int d = 0; d < arr.length; d++) {
                if (arr[d] > elements2) {
                    quantity++;
                }
            }
            System.out.println("Количество элементов, больше среднего арифметического: " + quantity);
        }
//13) Создайте массив и заполните его квадратами чисел от 1 до 10.
        System.out.print("Квадраты чисел: ");
        {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}