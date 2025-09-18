package Ass10_Home_Work;

import java.util.*;

public class ReferenceBook extends book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher, String id, String title, double baseprice) {
        super(id, title, baseprice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addbook() {
        super.addbook();
        Scanner sc = new Scanner(System.in);
        System.out.println("publisher:");
        this.publisher = sc.nextLine();
    }

    @Override
    public void displaydetail() {
        super.displaydetail();
        System.out.println("publisher:" + publisher);

    }

    @Override
    public boolean updatebyid(String id) {
        if (super.updatebyid(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New publisher: ");
            publisher = sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public double calculate() {
        return getBaseprice() * 1.10;
    }

}
