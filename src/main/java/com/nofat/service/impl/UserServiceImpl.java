package com.nofat.service.impl;

import com.nofat.dao.IUserDao;
import com.nofat.entity.DO.UserDO;
import com.nofat.entity.DTO.UserDTO;
import com.nofat.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by userDO on 2020/5/19.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserDTO> findAll() {
        List<UserDO> userDos = userDao.findAll();
        List<UserDTO> userDtos = new ArrayList<UserDTO>();

        for (UserDO user: userDos) {
            userDtos.add(new UserDTO(user));
        }


        return userDtos;
    }

    @Override
    public UserDO findById(Integer id) {
        return null;
    }

    @Override
    public Integer saveUser(UserDO userDO) {


        Date createTime = userDO.getCreateTime();

        userDao.saveUser(userDO);

        return 0;
    }

    @Override
    public Integer delUser(Integer id) {
        return 0;
    }
}
