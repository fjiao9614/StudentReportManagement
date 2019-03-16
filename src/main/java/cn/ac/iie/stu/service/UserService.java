package cn.ac.iie.stu.service;

import cn.ac.iie.stu.domain.User;

public interface UserService {
    /**
     * 用户密   */
    Long login(String stu_id,String passwd) throws Exception;

    /**
     * 通过用户ID（user_id）获取用户
     * @param user_id
     * @return
     * @throws Exception
     */
    User getUserById(Long user_id) throws Exception;

    /**
     * 根据用户ID（user_id）和旧密码 修改密码
     * @param user_id
     * @param old_passed
     * @param new_passwd
     * @throws Exception
     */
    void changePasswd(Long user_id,String old_passed,String new_passwd)throws Exception;

}
