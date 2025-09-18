
package Ass10_Home_Work;

import java.util.*;

public class textBook extends book {
     private String subject;

    public textBook() {
    }

    public textBook(String subject, String id, String title, double baseprice) {
        super(id, title, baseprice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

 

    @Override
    public void addbook() {
        super.addbook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject: ");
        subject = sc.nextLine();
    }

    @Override
    public boolean updatebyid(String id) {
        if (super.updatebyid(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New subject: ");
            subject = sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public void displaydetail() {
        super.displaydetail();
        System.out.println("Subject: " + subject);
    }

    @Override
    public double calculate() {
       
        return getBaseprice() * 1.20;
    }
}
