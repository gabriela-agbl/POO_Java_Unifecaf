public class Main {
    public static void main(String[] args) {
        RelatorioFactory fabricaPDF = new PDFFactory();

        fabricaPDF.processarRelatorio();
    }
}
