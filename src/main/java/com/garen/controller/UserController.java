package com.garen.controller;

import com.garen.dao.UserDao;
import com.garen.domain.BaseQuery;
import com.garen.domain.BaseQueryVo;
import com.garen.domain.BaseResult;
import com.garen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserDao userDao;

    @ResponseBody
    @RequestMapping("find")
    public BaseResult<User> findAllUser(BaseQuery baseQuery, User user) throws Exception {

        BaseResult<User> result = new BaseResult<>();

        BaseQueryVo<User> baseQueryVo = new BaseQueryVo<>(baseQuery, user);

        List<User> list = userDao.findAllUser(baseQueryVo);

        result.setData(list);

        result.setResult(0);

        return result;
    }

    @ResponseBody
    @RequestMapping("save")
    public String saveUser(User user) {
        try {
            userDao.saveUser(user);
            return "success";
        } catch (Exception e) {
            return "error" + e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping("saves")
    public String saveUsers(@RequestBody List<User> user) {
        try {
            for (User user1: user) {
                userDao.saveUser(user1);
            }
            return "success";
        } catch (Exception e) {
            return "error" + e.getMessage();
        }
    }

    @RequestMapping("getuserpage")
    public String getUserPage() {
        return "test";
    }
}
