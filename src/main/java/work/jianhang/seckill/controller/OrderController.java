package work.jianhang.seckill.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.jianhang.seckill.error.BusinessException;
import work.jianhang.seckill.error.EmBusinessError;
import work.jianhang.seckill.response.CommonReturnType;
import work.jianhang.seckill.service.OrderService;
import work.jianhang.seckill.service.model.OrderModel;
import work.jianhang.seckill.service.model.UserModel;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
@Slf4j
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class OrderController extends BaseController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private OrderService orderService;

    // 封装下单请求
    @RequestMapping(value = "/create", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType createOrder(@RequestParam(name = "itemId") Integer itemId,
                                       @RequestParam(name = "amount") Integer amount,
                                       @RequestParam(name = "promoId", required = false) Integer promoId) throws BusinessException {
        Boolean isLogin = (Boolean) httpServletRequest.getSession().getAttribute("IS_LOGIN");
        if (isLogin == null || !isLogin.booleanValue()) {
            throw new BusinessException(EmBusinessError.USER_NOT_LOGIN, "用户还未登录，不能下单.");
        }
        // 获取用户的登录信息
        UserModel userModel = (UserModel) httpServletRequest.getSession().getAttribute("LOGIN_USER");

        OrderModel orderModel = orderService.createOrder(userModel.getId(), itemId, amount, promoId);
        return CommonReturnType.create(null);
    }
}
