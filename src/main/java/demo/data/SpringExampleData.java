package demo.data;

import demo.controller.TestRepository;
import demo.model.Question;
import demo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringExampleData implements CommandLineRunner {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {

        Test test = new Test("Test wiedzy z Javy");
        test.addQuestion((new Question("Czy java ma Klasy?", true)));
        test.addQuestion((new Question("Czy  Java ma interfejsy", true)));
        test.addQuestion((new Question("Czy Java ma Klasę integer?", false)));
        test.addQuestion((new Question("Czy Java ma destruktor?", false)));
        testRepository.save(test);

        Test test2 = new Test("Test z piłki nożnej");
        test2.addQuestion((new Question("Czy Leo Messi gra w FC Barcelonie?", true)));
        test2.addQuestion((new Question("Czy Lukas Podolski grał w Polskiej reprezentacji?", false)));
        test2.addQuestion((new Question("Czy Raul Gonzales grał w Bayernie Monachium?", false)));
        test2.addQuestion((new Question("Czy Jacek Gmoch był trenerem?", true)));
        testRepository.save(test2);

        Test test3 = new Test("Test o superbohaterach");
        test3.addQuestion((new Question("Czy Superman walczył kiedyś z Batmanem?", true)));
        test3.addQuestion((new Question("Czy Zielona Latarnia wystąpił w Avengersach?", false)));
        test3.addQuestion((new Question("Czy Aquaman był królem Atlantydy?", true)));
        test3.addQuestion((new Question("Czy Flash jest super-szybki?", true)));
        testRepository.save(test3);
    }

}
