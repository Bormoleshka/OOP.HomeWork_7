public class CalcLogger extends Loggable {
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}
