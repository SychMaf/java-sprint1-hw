public class Converter {
    double km;
    double kCall;

    Converter(double constToKM, double constToKCall){
        km=constToKM;
        kCall=constToKCall;
    }
    void ConvertToDist(double step){
        System.out.println("Пройденное расстояние (км) = " + (step*km)/100000);
    }
    void ConvertToKCall(double step){
        System.out.println("Количество соженных килокалорий = " + step * kCall);
    }
}
