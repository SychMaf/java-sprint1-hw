public class StepTracker {
    Converter converter = new Converter(75, 0.05);
    int cel=10000;
    MonthData[] monthToDay;

    public StepTracker() {
        monthToDay = new MonthData[12];
        for (int i = 0; i < monthToDay.length; i++)
            monthToDay[i] = new MonthData();
    }

    class MonthData {
        int[] days;
        MonthData() {
            days = new int[30];
        }
    }

    void changeStep(int month, int day, int change) {
        monthToDay[month].days[day] = change;
    }

    void statistic(int month){
        double sumStep=0;
        int k=0, max = 0;
        for (int i = 0; i<monthToDay[month].days.length; i++){
            System.out.print((i+1) + " день: " + monthToDay[month].days[i]+"; ");
            sumStep+= monthToDay[month].days[i];

            k = (monthToDay[month].days[i] >= cel) ? k+1 : 0;
            if (k>max){
                max=k;
            }
        }
        System.out.println();
        System.out.println("Общее количество шагов за месяц = " + sumStep);
        System.out.println("Среднее количество шагов за месяц = " + (sumStep / monthToDay[month].days.length));
        converter.ConvertToDist(sumStep);
        converter.ConvertToKCall(sumStep);
        System.out.println("Лучшая серия = " + max);
    }
    void changeCel(int celNew){
        cel=celNew;
    }
}
