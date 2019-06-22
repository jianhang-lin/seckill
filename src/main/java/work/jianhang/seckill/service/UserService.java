package work.jianhang.seckill.service;

import work.jianhang.seckill.error.BusinessException;
import work.jianhang.seckill.service.model.UserModel;

public interface UserService {

    // 通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
