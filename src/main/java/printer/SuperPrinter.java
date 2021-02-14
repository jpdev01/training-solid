package printer;

public class SuperPrinter implements PrinterInterface, FaxInterface, PrinterDuplexInterface, ScannerInterface{
    @Override
    public void sendFax(String content) {
        System.out.println("Enviando fax: " + content);
    }

    @Override
    public void printDuplex(String content) {
        System.out.println("Imprimindo em dois lados: " + content);
    }

    @Override
    public void print(String content) {
        System.out.println("Imprimindo: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Escaneando: " + content);
    }
}
