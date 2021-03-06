package com.jsu.dao.bak;

import com.jsu.bean.bak.Card;
import com.jsu.bean.bak.CardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    long countByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int deleteByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int insert(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int insertSelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    List<Card> selectByExample(CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    Card selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int updateByPrimaryKeySelective(Card record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card
     *
     * @mbg.generated Tue Apr 07 17:26:29 CST 2020
     */
    int updateByPrimaryKey(Card record);
}