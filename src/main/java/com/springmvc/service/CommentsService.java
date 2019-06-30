package com.springmvc.service;

import com.springmvc.pojo.Comments;

import java.util.List;

public interface CommentsService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int insert(Comments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    Comments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    List<Comments> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Comments record);
    List<Comments> selectByUserKeyWithContent(Integer uid);

    List<Comments> selectByGoodsId(Integer goodsId);

    List<Comments> searchCommentsByContent(String content);
}
