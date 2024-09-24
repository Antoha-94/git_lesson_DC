package computerdatabase;

public class ForMaksim {
        public static void ForMaksim(String[] args) {
        int a = 5;
        int b = 7;
        int result = sum(a, b);
        System.out.println("Сумма: " + result);  // Вывод: Сумма: 12
    }

    // Функция для вычисления суммы двух чисел
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
