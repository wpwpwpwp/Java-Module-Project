import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int howManyPeople = 1;
        Calculate calculator = new Calculate();
        System.out.println("На сколько человек необходимо разделить счет?");
            while (true) {
                Scanner scanner = new Scanner(System.in);
                    if  (scanner.hasNextInt() == false) {
                        howManyPeople = -1;
                        System.out.println("Введите число");
                    }
                    else {
                         howManyPeople = scanner.nextInt();
                            {
                            if (howManyPeople > 1) {
                                break;
                            }
                            if (howManyPeople < 1) {
                                System.out.println("Вы ввели неверное количество человек, введите верное количество.");
                            } else {
                                System.out.println("Вы хотите поделить счет на одного человека, но зачем? Я понимаю, вы возможно одиноки, но смысла в этом нет. Введите верное количество людей.");
                            }
                        }
                    }
        }
        calculator.calculate(howManyPeople);
    }
}