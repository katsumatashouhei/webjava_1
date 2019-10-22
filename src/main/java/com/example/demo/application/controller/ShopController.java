package controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

  @Autowired
  HttpSession session;

  @RequestMapping(value="/toraShop", method = RequestMethod.GET)
  public ModelAndView index(ModelAndView mav) {
    //View

//      UserForm userForm = (UserForm) session.getAttribute("form");
//      session.removeAttribute("form");


    return null;
  }

  public String viewTop() {

    return "toraShop";

    }

}
