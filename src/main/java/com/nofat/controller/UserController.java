package com.nofat.controller;

import com.nofat.entity.DO.UserDO;
import com.nofat.entity.DTO.UserDTO;
import com.nofat.entity.JsonResult;
import com.nofat.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xsir on 2020/05/19.
 * @author xsir
 * @date 2020/05/19
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping("/save")
    @ResponseBody
    public void saveUser(UserDO userDO) {
        System.out.println("保存用户...");
        service.saveUser(userDO);

        System.out.println(userDO);
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public JsonResult findAll() {
        List<UserDTO> users = service.findAll();
        JsonResult<List<UserDTO>> result = new JsonResult<>();

        if(users.size() == 0) {
            result.fail("查询失败！");
        } else {
            result.ok(users);
        }

        return result;
    }

}
