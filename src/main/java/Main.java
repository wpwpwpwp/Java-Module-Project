import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate calculator = new Calculate();
        System.out.println("На сколько человек необходимо разделить счет?");
        int howManyPeople = scanner.nextInt();
        while (true) {
                 if (howManyPeople > 1) {
                break;
                 }
                if (howManyPeople < 1) {
                System.out.println("Вы ввели неверное количество человек, введите верное количество.");
                howManyPeople = scanner.nextInt();
                 } else {
                System.out.println("Вы хотите поделить счет на одного человека, но зачем? Я понимаю, вы возможно одиноки, но смысла в этом нет. Введите верное количество людей.");
                howManyPeople = scanner.nextInt();
                }
        }
        System.out.println("Какой товар Вы хотите добавить?");
        calculator.calculate(howManyPeople);
    }
}