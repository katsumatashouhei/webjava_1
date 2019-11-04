package com.example.demo.application.controller;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.application.model.Item;
import com.example.demo.application.model.ListForm;
import com.example.demo.application.model.ListService;

@Controller
public class ShopController {

  @Autowired
  HttpSession session;

  ListService listService;

 @RequestMapping(value="/toraShop" )
 public String list(HttpSession session, Model model,
     @RequestParam(name = "name", required = false) String name) {

   listService = new ListService();
   Map<Integer, Item> toraMap = listService.getItemList();

   model.addAttribute("toras" ,toraMap);

   return "toraShop";

   }

 public String order(ListForm listForm) {

   int itemId = listForm.getItemId();
   

   return "cartConfirm";
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
