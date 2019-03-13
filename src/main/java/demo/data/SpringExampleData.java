package demo.data;

import demo.model.Question;
import demo.model.Test;
import demo.repository.TestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringExampleData implements CommandLineRunner {

    @Autowired
    private TestRespository testRespository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
        Test test = new Test("Test wiedzy z Javy");
        test.addQuestion((new Question("Czy java ma Klasy?", true)));
        test.addQuestion((new Question("Czy  Java ma interfejsy", true)));
        test.addQuestion((new Question("Czy Java ma Klasę integer?", false)));
        test.addQuestion((new Question("Czy Java ma destruktor?", false)));
        testRespository.save(test);
    }

}