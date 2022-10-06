package com.tai.mapper;

import com.tai.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mybatis接口綁定
 */
public interface LogDemo {
    List<Log> selAll(@Param("accIn")String accIn, @Param("accOut")String AccOut);
    List<Log> selChoose(@Param("accIn")String accIn, @Param("accOut")String AccOut);
//    List<Object> upd(@Param("a")String adfk,@Param("b") String dkfjal);
}
