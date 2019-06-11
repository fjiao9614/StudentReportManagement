package cn.ac.iie.stu.mapper;

import cn.ac.iie.stu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 用户名密码检验
     */
    Long login(@Param("stu_id") String stu_id,@Param("passwd") String passwd) throws Exception;

    User getUserById(@Param("user_id") Long user_id) throws Exception;

    void changePasswd(@Param("user_id") Long user_id, @Param("old_passwd") String old_passwd, @Param("new_passwd") String new_passwd) throws Exception;
}
