package com.example.demo.application.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

  @Autowired
  HttpSession session;

 @RequestMapping(value="/toraShop")
 public String viewTop(HttpSession session, Model model,
     @RequestParam(name = "name", required = false) String name) {

   return "toraShop";

   }
//  public ModelAndView index(ModelAndView mav) {
//    //View
//
//      UserForm userForm = (UserForm) session.getAttribute("form");
//      session.removeAttribute("form");
//      if(userForm != null) {
//        mav.addObject("message", userForm.getName() + "を保存した。");

//      mav.addObject("userForm", new UserForm());
//
//      List<User> users = (List<User>)session.getAttribute("userList");
//      if( users == null) {
//        users = new ArrayList<User>();
//        session.setAttribute("userList", users);
//      }
//      mav.addObject("users", users);
//
//      BindingResult bindingResult = (BindingResult)session.getAttribute("result");
//      if(bindingResult !=  null) {
//        mav.addObject("bindingResult", bindingResult);
//      }
//
//      //Viewのテンプレート名を設定
//      mav.setViewName("userlist");
//
//    return mav;
//  }



}
