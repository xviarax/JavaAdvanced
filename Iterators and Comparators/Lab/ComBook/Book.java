package ComBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    @Override
    public int compareTo(Book o) {
        if (this.getTitle().compareTo(o.getTitle()) == 0){
            return Integer.compare(this.getYear(), o.getYear());
        }
        return this.getTitle().compareTo(o.getTitle());
    }







    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }


}
