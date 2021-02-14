package printer;

public class Printer implements PrinterInterface{
    @Override
    public void print(String content) {
        System.out.println("Imprimindo: " + content);
    }
}
