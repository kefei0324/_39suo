package org.feona.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.feona.pojo.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    @Delete({
        "delete from account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into account (id, name, ",
        "pwd, status, createtime, ",
        "updatetime, deviceid)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{pwd,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{updatetime,jdbcType=TIMESTAMP}, #{deviceid,jdbcType=INTEGER})"
    })
    int insert(Account record);

    int insertSelective(Account record);

    @Select({
        "select",
        "id, name, pwd, status, createtime, updatetime, deviceid",
        "from account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    @Update({
        "update account",
        "set name = #{name,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "deviceid = #{deviceid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Account record);
}