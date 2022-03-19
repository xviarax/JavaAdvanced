package BookCom;



public class Main {
    public static void main(String[] args) {
        Book firstB = new Book("Viara", 2000, "Viara Marinova");
       Book secB = new Book("VM", 2000, "Viara M.");
        Book thirdB = new Book("VMar", 2000, "Viara M.");


        BookComparator bookComparator = new BookComparator();
        bookComparator.compare(firstB, secB);
    }
}
