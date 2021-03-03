package job4j.loop;

public class Mortgage {
        public static int year(int amount, int salary, double percent) {
            int year = 0;
            int summa = amount;
            while (summa > 0) {
                summa = (int) (summa + (summa / 100 * percent));
                summa = summa - salary;
                year++;
            }
            return year;
        }
}
