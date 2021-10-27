package midTerm.question2;

public class Printer {
    private static Printer _instance;

    private Printer() {
    }

    public static Printer getInstance() {
        if(_instance == null) {
            synchronized (Printer.class){
                if(_instance == null){
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public void getConnection() {
        System.out.println("Your Printer is working");
    }
}
