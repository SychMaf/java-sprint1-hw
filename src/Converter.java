public class Converter {
    double km;
    double kCall;

    Converter(double constToKM, double constToKCall){
        km=constToKM;
        kCall=constToKCall;
    }
    double ConvertToDist(double step){
        return  (step*km)/100000;
    }
    double ConvertToKCall(double step){
        return step * kCall;
    }
}
