package com.hester.study.action;

import com.hester.study.entity.User;
import com.hester.study.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: wangjie27
 * @Description:
 * @Date: Created in  2017/8/10 19:34
 * @Modified By:
 */
@Controller
public class UserController {

    @Autowired
    private IUserServices userServices;

    {
        userServices = null;
    }

    public UserController() {
    }


    @RequestMapping(value="/test/{id}")
    @ResponseBody
    /**
    * @Author: wangjie27
    * @Description: url的访问路径为http://localhost:8090/test/XX
    * @Date:   15:19
    */
    public ModelAndView findUserById(@PathVariable("id") int id){
        User user=userServices.getUserfindById(id);
        ModelAndView mvc=new ModelAndView();
        mvc.setViewName("welcome");
        mvc.addObject("users",user);//方法一
       // mvc.getModel().put("users",user);方法二
        return  mvc;
    }


    @RequestMapping(value="/test")
    @ResponseBody
    /**
    * @Author: wangjie27
    * @Description:  url的访问路径为http://localhost:8090/test?id=XX
    * @Date:   15:18
    */
    public ModelAndView findUserById2(int id){
        User user=userServices.getUserfindById(id);
        ModelAndView mvc=new ModelAndView();
        mvc.setViewName("welcome");
        mvc.addObject("users",user);
        // mvc.getModel().put("users",user);
        return  mvc;
    }
}
