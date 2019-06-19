package work.jianhang.seckill.service;

import work.jianhang.seckill.service.model.UserModel;

public interface UserService {

    // 通过用户id获取用户对象的方法
    UserModel getUserById(Integer id);
}
