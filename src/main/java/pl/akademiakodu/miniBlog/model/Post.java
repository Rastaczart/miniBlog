package pl.akademiakodu.miniBlog;

public class Post {
    public String Author;
    public String Content;
    public String tittle;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {return Author; }

    public void setAuthor(String author) {Author = author;}

    public String getContent() {return Content; }

    public void setContent(String content){ Content = content; }
    public Post(){};

    public Post(String author, String content) {
        Author = author;
        Content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Author='" + Author + " tittle"+tittle+ '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }
}
