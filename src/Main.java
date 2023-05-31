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
