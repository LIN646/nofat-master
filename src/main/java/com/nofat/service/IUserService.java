package com.nofat.service;

import com.nofat.entity.DO.UserDO;
import com.nofat.entity.DTO.UserDTO;

import java.util.List;

/**
 * Created by user on 2020/5/19.
 */
public interface IUserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<UserDTO> findAll();

    /**
     * 根据id查询指定用户信息
     * @param id id
     * @return User对象
     */
    public UserDO findById(Integer id);

    /**
     * 保存用户信息
     * @param userDO  用户
     * @return 返回受影响的行数
     */
    public Integer saveUser(UserDO userDO);

    /**
     * 根据id删除指定用户
     * @param id id
     * @return 返回受影响的行数
     */
    public Integer delUser(Integer id);

}
