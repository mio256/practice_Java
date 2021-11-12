package Practice.Part4;

import java.util.*;

public class Book implements Comparable<Book>, Cloneable {

    private String title;
    private Date publishDate;
    private String comment;

    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = new Book();
        book.title = this.title;
        book.publishDate = this.publishDate;
        book.comment = this.comment;
        return book;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Book) {
            Book book = (Book) obj;
            if (title.equals(book.title) && publishDate.equals(book.publishDate)) {
                return true;
            }
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String str) {
        title = str;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date date) {
        publishDate = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String str) {
        comment = str;
    }

}
