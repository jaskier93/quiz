package demo.model;

import javax.persistence.*;

@Entity
public class Question {

    private String content;
    private boolean correct;

    public Question(boolean correct) {
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question(String content) {
        this.content = content;
    }

    public Question(String content, boolean correct, Test test) {
        this.content = content;
        this.correct = correct;
        this.test = test;
    }

    public Question() {
    }

    @ManyToOne
    private Test test;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Question(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

}
