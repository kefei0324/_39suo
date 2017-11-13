package org.feona.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.feona.pojo.Msg;

public interface MsgMapper {
    @Delete({
        "delete from msg",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into msg (id, data1, ",
        "data2, data3, data4, ",
        "data5, data6, data7, ",
        "data8, data9, data10, ",
        "data11, createtime, ",
        "updatetime, deviceid, ",
        "accountid, status, ",
        "devicename)",
        "values (#{id,jdbcType=INTEGER}, #{data1,jdbcType=VARCHAR}, ",
        "#{data2,jdbcType=VARCHAR}, #{data3,jdbcType=VARCHAR}, #{data4,jdbcType=VARCHAR}, ",
        "#{data5,jdbcType=VARCHAR}, #{data6,jdbcType=VARCHAR}, #{data7,jdbcType=VARCHAR}, ",
        "#{data8,jdbcType=VARCHAR}, #{data9,jdbcType=VARCHAR}, #{data10,jdbcType=VARCHAR}, ",
        "#{data11,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{updatetime,jdbcType=TIMESTAMP}, #{deviceid,jdbcType=INTEGER}, ",
        "#{accountid,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{devicename,jdbcType=VARCHAR})"
    })
    int insert(Msg record);

    int insertSelective(Msg record);

    @Select({
        "select",
        "id, data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, ",
        "createtime, updatetime, deviceid, accountid, status, devicename",
        "from msg",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Msg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msg record);

    @Update({
        "update msg",
        "set data1 = #{data1,jdbcType=VARCHAR},",
          "data2 = #{data2,jdbcType=VARCHAR},",
          "data3 = #{data3,jdbcType=VARCHAR},",
          "data4 = #{data4,jdbcType=VARCHAR},",
          "data5 = #{data5,jdbcType=VARCHAR},",
          "data6 = #{data6,jdbcType=VARCHAR},",
          "data7 = #{data7,jdbcType=VARCHAR},",
          "data8 = #{data8,jdbcType=VARCHAR},",
          "data9 = #{data9,jdbcType=VARCHAR},",
          "data10 = #{data10,jdbcType=VARCHAR},",
          "data11 = #{data11,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "deviceid = #{deviceid,jdbcType=INTEGER},",
          "accountid = #{accountid,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "devicename = #{devicename,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Msg record);
}