package mvccalculator;

public class MVCcalculator {
    public static void main(String[] args) {
        View guiView = new View();
        new Controller(guiView);
    }
}