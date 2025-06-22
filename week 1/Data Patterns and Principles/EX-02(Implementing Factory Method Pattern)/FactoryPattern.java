public class FactoryPattern {
    interface Document {
        void create();
        void open();
        void print();
    }

    static class WordDocument implements Document {
        public void create() {
            System.out.println("Creating Word Document");
        }
        public void open() {
            System.out.println("Opening Word Document");
        }
        public void print() {
            System.out.println("Printing Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void create() {
            System.out.println("Creating PDF Document");
        }
        public void open() {
            System.out.println("Opening PDF Document");
        }
        public void print() {
            System.out.println("Printing PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void create() {
            System.out.println("Creating Excel Document");
        }
        public void open() {
            System.out.println("Opening Excel Document");
        }
        public void print() {
            System.out.println("Printing Excel Document");
        }
    }

    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.create();
        word.open();
        word.print();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.create();
        pdf.open();
        pdf.print();

        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.create();
        excel.open();
        excel.print();
    }
}
