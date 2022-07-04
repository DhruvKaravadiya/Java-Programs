/*Declare a class called book having author_name as private data member. Extend book 
class to have two sub classes called book_publication & paper_publication. Each of 
these classes have private member called title. Write a complete program to show 
usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
publications of given author.Use command line arguments for inputting data.*/

class book {
    private String author_name;
    book(String Aname) {
        this.author_name = Aname;
    }
    void print() {
        System.out.println("Author name = " + author_name);
    }
}

class book_publication extends book {
    private String title;
    book_publication(String BookPub) {
        super("");
        this.title = BookPub;
    }
    void print() {
        System.out.println("Book name = " + title);
    }
}

class paper_publication extends book {
    private String title;
    paper_publication(String PaperPub) {
        super("");
        this.title = PaperPub;
    }
    void print() {
        System.out.println("Paper name = " + title);
    }
}

public class lab_2 {
    public static void main(String[] args) {
        book_publication pub1 = new book_publication(args[0]);
        book author1 = new book(args[1]);
        paper_publication paper1 = new paper_publication(args[2]);

        pub1.print();
        author1.print();
        paper1.print();
    }
}
