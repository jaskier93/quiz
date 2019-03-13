package demo.controller;

import demo.model.Test;
import demo.model.User;
import demo.repository.TestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.UnknownServiceException;

@Scope(value = "session")

@Controller
public class TestController {

    private User user = new User();

    @Autowired
    private TestRespository testRespository;


    @GetMapping("/test/{id}/play")
    public String play(@PathVariable Integer id, ModelMap modelMap) {
        Test test = testRespository.findById(id).get();
        modelMap.addAttribute("test", test);
        modelMap.addAttribute("question", test.getQuestionList().get(0));
        return "test";
    }

}
