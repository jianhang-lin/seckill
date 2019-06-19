package work.jianhang.seckill.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.jianhang.seckill.controller.viewobject.UserVO;
import work.jianhang.seckill.service.UserService;
import work.jianhang.seckill.service.model.UserModel;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public UserVO getUser(@RequestParam(name = "id") Integer id) {
        // 调用service服务获取对应id的用户对象并返回给前端
        UserModel userModel = userService.getUserById(id);
        //将核心领域模型用户对象转化为可供ui使用的viewobject
        return convertFromModel(userModel);
    }

    private UserVO convertFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }
}
