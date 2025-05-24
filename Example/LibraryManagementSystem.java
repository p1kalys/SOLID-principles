// Radable interface - Defines a contract with a read() method. The Book class implements this interface, ensuring that all books provide a reading behavior.

interface Readable {
    void read();
}

// Book and EBook - Book has attributes for title and an associated Author. EBook extends Book by adding a fileFormat attribute. The inheritance arrow (solid line with a closed arrowhead) shows that EBook is a specialized type of Book.
class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
}

class Book implements Readable {
    String title;
    Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void read() {
        System.out.println("Reading book: " + title + " by " + author.name);
    }
}

class EBook extends Book {
    String fileFormat;

    EBook(String title, Author author, String fileFormat) {
        super(title, author);
        this.fileFormat = fileFormat;
    }

    @Override
    public void read() {
        System.out.println("Reading eBook: " + title + " by " + author.name + " in format: " + fileFormat);
    }
}

// Association (Book & Author): The arrow from Book to Author indicates that every book is written by an author. This is a simple association where both objects can exist independently.

// Composition (Library & Book): The filled diamond from Library to Book indicates composition. A library is composed of books, meaning the library strongly owns its books.

// Dependency (Reader & Book): The dashed arrow from Reader to Book denotes a dependency. A reader uses a book (for example, to read), but does not own it.

// Aggregation (ReadingClub & Reader):The open diamond from ReadingClub to Reader represents aggregation. A reading club groups readers together, but readers can exist independently of the club.

class Library {
    String name;

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        System.out.println("Adding book: " + book.title + " to library: " + name);
    }
}

class Reader {
    String name;

    Reader(String name) {
        this.name = name;
    }

    void readBook(Book book) {
        System.out.println(name + " is reading: " + book.title);
        book.read();
    }
}

class ReadingClub {
    String name;

    ReadingClub(String name) {
        this.name = name;
    }

    void addReader(Reader reader) {
        System.out.println("Adding reader: " + reader.name + " to reading club: " + name);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book = new Book("Harry Potter and the Philosopher's Stone", author);
        EBook eBook = new EBook("Harry Potter and the Chamber of Secrets", author, "PDF");

        Library library = new Library("City Library");
        library.addBook(book);
        library.addBook(eBook);

        Reader reader = new Reader("Alice");
        reader.readBook(book);
        reader.readBook(eBook);

        ReadingClub readingClub = new ReadingClub("Fantasy Readers Club");
        readingClub.addReader(reader);
    }
}