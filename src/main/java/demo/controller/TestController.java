package demo.controller;

import demo.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.UnknownServiceException;

@Scope(value = "session")
@Controller
public class TestController {
private User user=new User();

    @ResponseBody
    @GetMapping("/test/{id}/play")
    public String play(@PathVariable Integer id) {
       user.addPoints();
        return "" + user.getNumberOfPoints();
}

}
