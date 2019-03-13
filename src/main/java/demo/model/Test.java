package demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Test {

    public Test() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questionList = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(String name) {
        this.name = name;
    }

    public void addQuestion(Question question) {
        question.setTest(this);
        questionList.add(question);
    }

}
