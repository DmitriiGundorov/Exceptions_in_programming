package HomeWork_2;

// Задание 2. Найти ошибку
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//    }

public class Task_2 {
    public static void main(String[] args) throws Exception {
        int[] Array = new int[]{4, 5, 6, 1, 5, 6, 7, 8, 9, 3};
        try {
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
