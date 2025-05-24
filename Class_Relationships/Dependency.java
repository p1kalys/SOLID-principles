class Printer {
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class Document {
    String content;

    Document(String content) {
        this.content = content;
    }

    void printDocument(Printer printer) {
        printer.print(content);
    }
}

public class Dependency {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Document document = new Document("Hello, World!");
        
        document.printDocument(printer); // Output: Printing: Hello, World!
    }
}