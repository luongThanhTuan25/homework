package Ass10_Home_Work;

import java.util.*;

public abstract class book implements Ibook {

    private String id;
    private String title;
    double baseprice;

    public book() {
    }

    public book(String id, String title, double baseprice) {
        this.id = id;
        this.title = title;
        this.baseprice = baseprice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    @Override
    public void addbook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        this.id = sc.nextLine();
        sc.nextLine();
        System.out.println("\n title:");
        this.title = sc.nextLine();
        sc.nextLine();
        System.out.println("\n base price:");
        this.baseprice = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void displaydetail() {
        System.out.println("name" + title);
        System.out.println("\nid" + id);
        System.out.println("\nprice" + baseprice);
    }

    @Override
    public boolean updatebyid(String id) {

        if (this.id.equals(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("New title: ");
            this.title = sc.nextLine();
            System.out.print("New base price: ");
            this.baseprice = sc.nextDouble();
            sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public double calculate() {
        return 0;
    }
}
