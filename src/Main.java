import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StepTracker stepTrack = new StepTracker();

        while (true){
            printMenu();
            int command = scan.nextInt();

            if (command ==1){
                System.out.println("За какой месяц(0<=X<=11)?");
                int month =scan.nextInt();
                System.out.println("За какой день(1<=X<=30)?");
                int day =scan.nextInt();
                System.out.println("Сколько шагов(0<=X)?");
                int step =scan.nextInt();
                if (month>=0 && month<12 && day>0 && day<=30 && step>=0)
                    stepTrack.changeStep(month,day-1,step);
                else
                    System.out.println("Введено(-ы) некорректное значение.");

            } else if (command == 2) {
                System.out.println("Введите месяц за который хотите просмотреть статистику(0<=X<=11):");
                int month = scan.nextInt();
                if (month>=0 && month<12)
                    stepTrack.statistic(month);
                else
                    System.out.println("Введенно некорректное значение.");
            } else if (command == 3) {
                System.out.println("Введите цель которой хотите задаться(0<=X):");
                int cel=scan.nextInt();
                if (cel>=0)
                    stepTrack.changeCel(cel);
                else
                    System.out.println("Введено некорректное значение.");

            } else if (command == 0) {
                System.out.println("Выход.");
                break;
            } else
                System.out.println("Введенно некорректное значение.");
        }
    }
    public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Ввести количество шагов за определённый месяц и день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения");
    }
}
