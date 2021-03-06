package com.lyj.dao;

import com.lyj.pojo.Book;
import com.lyj.pojo.BookKey;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BookKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    Book selectByPrimaryKey(BookKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mybook
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Book record);
}