package com.springmvc.dao;

import com.springmvc.pojo.User;
import org.apache.ibatis.annotations.Param;
import sun.nio.cs.US_ASCII;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(User record);

    int updateLastLoginByPrimaryKey(User record);

    int updateByPrimaryKeySelective(User record);

    User getUserByPhone(@Param("phone") String phone);

    List<User> getUserList();

    int updateGoodsNum(@Param("id") Integer id, @Param("goodsNum") Integer goodsNum);

    int updateImgUrl(@Param("id") Integer id, @Param("url") String url);

    Integer checkUserByPhone(@Param("phone") String phone);

    int updatePasswordByPrimaryKey(@Param("uid") Integer uid, @Param("password") String password);

    int updatePowerByPrimaryKey(@Param("uid") Integer uid, @Param("power") Integer power);

    List<User> searchUserByNameOrPhone(@Param("name") String name, @Param("phone") String phone);

}