package pl.akademiakodu.miniBlog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comment {

    @OneToMany(mappedBy = "post")
    private List<Comment> comments =new ArrayList<>();


@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String author;
    private String content;
    @OneToOne
    private Post post;

    public Integer getId() {return id; }
    public void setId(Integer id) {this.id = id; }

    public String getAuthor() {return author;}
    public void setAuthor(String author) { this.author = author; }

    public String getContent() {return content; }
    public void setContent(String content) { this.content = content; }

    public Post getPost() {return post; }
    public void setPost(Post post) {this.post = post; }

    public Comment() {}
}
