package org.feona.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.feona.pojo.Msgmodel;

public interface MsgmodelMapper {
    @Delete({
        "delete from msgmodel",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into msgmodel (id, data1, ",
        "data2, data3, data4, ",
        "data5, data6, data7, ",
        "data8, data9, data10, ",
        "data11, data1f, ",
        "data2f, data3f, ",
        "data4f, data5f, ",
        "data6f, data7f, ",
        "data8f, data9f, ",
        "data10f, data11f, ",
        "data1sc, data2sc, data3sc, ",
        "data4sc, data5sc, data6sc, ",
        "data7sc, data8sc, data9sc, ",
        "data10sc, data11sc, total, ",
        "data1s, data2s, ",
        "data3s, data4s, ",
        "data5s, data6s, ",
        "data7s, data8s, ",
        "data9s, data10s, ",
        "data11s, msgid, ",
        "createtime, updatetime, ",
        "status, devicename, ",
        "deviceid, accountid)",
        "values (#{id,jdbcType=INTEGER}, #{data1,jdbcType=VARCHAR}, ",
        "#{data2,jdbcType=VARCHAR}, #{data3,jdbcType=VARCHAR}, #{data4,jdbcType=VARCHAR}, ",
        "#{data5,jdbcType=VARCHAR}, #{data6,jdbcType=VARCHAR}, #{data7,jdbcType=VARCHAR}, ",
        "#{data8,jdbcType=VARCHAR}, #{data9,jdbcType=VARCHAR}, #{data10,jdbcType=VARCHAR}, ",
        "#{data11,jdbcType=VARCHAR}, #{data1f,jdbcType=TINYINT}, ",
        "#{data2f,jdbcType=TINYINT}, #{data3f,jdbcType=TINYINT}, ",
        "#{data4f,jdbcType=TINYINT}, #{data5f,jdbcType=TINYINT}, ",
        "#{data6f,jdbcType=TINYINT}, #{data7f,jdbcType=TINYINT}, ",
        "#{data8f,jdbcType=TINYINT}, #{data9f,jdbcType=TINYINT}, ",
        "#{data10f,jdbcType=TINYINT}, #{data11f,jdbcType=TINYINT}, ",
        "#{data1sc,jdbcType=REAL}, #{data2sc,jdbcType=REAL}, #{data3sc,jdbcType=REAL}, ",
        "#{data4sc,jdbcType=REAL}, #{data5sc,jdbcType=REAL}, #{data6sc,jdbcType=REAL}, ",
        "#{data7sc,jdbcType=REAL}, #{data8sc,jdbcType=REAL}, #{data9sc,jdbcType=REAL}, ",
        "#{data10sc,jdbcType=REAL}, #{data11sc,jdbcType=REAL}, #{total,jdbcType=REAL}, ",
        "#{data1s,jdbcType=VARCHAR}, #{data2s,jdbcType=VARCHAR}, ",
        "#{data3s,jdbcType=VARCHAR}, #{data4s,jdbcType=VARCHAR}, ",
        "#{data5s,jdbcType=VARCHAR}, #{data6s,jdbcType=VARCHAR}, ",
        "#{data7s,jdbcType=VARCHAR}, #{data8s,jdbcType=VARCHAR}, ",
        "#{data9s,jdbcType=VARCHAR}, #{data10s,jdbcType=VARCHAR}, ",
        "#{data11s,jdbcType=VARCHAR}, #{msgid,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{devicename,jdbcType=VARCHAR}, ",
        "#{deviceid,jdbcType=INTEGER}, #{accountid,jdbcType=INTEGER})"
    })
    int insert(Msgmodel record);

    int insertSelective(Msgmodel record);

    @Select({
        "select",
        "id, data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, ",
        "data1f, data2f, data3f, data4f, data5f, data6f, data7f, data8f, data9f, data10f, ",
        "data11f, data1sc, data2sc, data3sc, data4sc, data5sc, data6sc, data7sc, data8sc, ",
        "data9sc, data10sc, data11sc, total, data1s, data2s, data3s, data4s, data5s, ",
        "data6s, data7s, data8s, data9s, data10s, data11s, msgid, createtime, updatetime, ",
        "status, devicename, deviceid, accountid",
        "from msgmodel",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Msgmodel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgmodel record);

    @Update({
        "update msgmodel",
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
          "data1f = #{data1f,jdbcType=TINYINT},",
          "data2f = #{data2f,jdbcType=TINYINT},",
          "data3f = #{data3f,jdbcType=TINYINT},",
          "data4f = #{data4f,jdbcType=TINYINT},",
          "data5f = #{data5f,jdbcType=TINYINT},",
          "data6f = #{data6f,jdbcType=TINYINT},",
          "data7f = #{data7f,jdbcType=TINYINT},",
          "data8f = #{data8f,jdbcType=TINYINT},",
          "data9f = #{data9f,jdbcType=TINYINT},",
          "data10f = #{data10f,jdbcType=TINYINT},",
          "data11f = #{data11f,jdbcType=TINYINT},",
          "data1sc = #{data1sc,jdbcType=REAL},",
          "data2sc = #{data2sc,jdbcType=REAL},",
          "data3sc = #{data3sc,jdbcType=REAL},",
          "data4sc = #{data4sc,jdbcType=REAL},",
          "data5sc = #{data5sc,jdbcType=REAL},",
          "data6sc = #{data6sc,jdbcType=REAL},",
          "data7sc = #{data7sc,jdbcType=REAL},",
          "data8sc = #{data8sc,jdbcType=REAL},",
          "data9sc = #{data9sc,jdbcType=REAL},",
          "data10sc = #{data10sc,jdbcType=REAL},",
          "data11sc = #{data11sc,jdbcType=REAL},",
          "total = #{total,jdbcType=REAL},",
          "data1s = #{data1s,jdbcType=VARCHAR},",
          "data2s = #{data2s,jdbcType=VARCHAR},",
          "data3s = #{data3s,jdbcType=VARCHAR},",
          "data4s = #{data4s,jdbcType=VARCHAR},",
          "data5s = #{data5s,jdbcType=VARCHAR},",
          "data6s = #{data6s,jdbcType=VARCHAR},",
          "data7s = #{data7s,jdbcType=VARCHAR},",
          "data8s = #{data8s,jdbcType=VARCHAR},",
          "data9s = #{data9s,jdbcType=VARCHAR},",
          "data10s = #{data10s,jdbcType=VARCHAR},",
          "data11s = #{data11s,jdbcType=VARCHAR},",
          "msgid = #{msgid,jdbcType=INTEGER},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "devicename = #{devicename,jdbcType=VARCHAR},",
          "deviceid = #{deviceid,jdbcType=INTEGER},",
          "accountid = #{accountid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Msgmodel record);
}