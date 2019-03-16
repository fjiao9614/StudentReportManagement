package cn.ac.iie.stu.service.impl;

import cn.ac.iie.stu.domain.User;
import cn.ac.iie.stu.mapper.UserMapper;
import cn.ac.iie.stu.service.SqlSessionServices;
import cn.ac.iie.stu.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService {
    private static SqlSessionFactory factory = SqlSessionServices.getFactory();

    @Override
    public Long login(String stu_id, String passwd) throws Exception {
        try(SqlSession session = factory.openSession(true)) {
            return session.getMapper(UserMapper.class).login(stu_id, passwd);
        }
    }

    @Override
    public User getUserById(Long user_id) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            return session.getMapper(UserMapper.class).getUserById(user_id);
        }
    }

    @Override
    public void changePasswd(Long user_id, String old_passed, String new_passwd) throws Exception {
        try(SqlSession session = factory.openSession(true)){
            session.getMapper(UserMapper.class).changePasswd(user_id,old_passed,new_passwd);
        }
    }

}
