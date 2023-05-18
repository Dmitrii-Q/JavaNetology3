public class Main {
  public static void main(String[] args) {
  
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта, 
    // суммы пополнения и тп
    
    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
  }
}

public class Main {
    public static void main(String[] args) {
        int sum = 100;
        int addend = 1200;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int total = sum + addend + bonus;

        System.out.println("Итоговый счет - " + total);
        System.out.println("Бонусная часть - " + bonus);
    }
}
Итоговый счет - 1312
Бонусная часть - 12

Process finished with exit code 0
