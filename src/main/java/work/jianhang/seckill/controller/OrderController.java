package work.jianhang.seckill.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.jianhang.seckill.error.BusinessException;
import work.jianhang.seckill.response.CommonReturnType;
import work.jianhang.seckill.service.OrderService;
import work.jianhang.seckill.service.model.OrderModel;

@RestController
@RequestMapping("/order")
@Slf4j
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    // 封装下单请求
    @RequestMapping(value = "/create", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType createOrder(@RequestParam(name = "itemId") Integer itemId,
                                       @RequestParam(name = "amount") Integer amount) throws BusinessException {
        OrderModel orderModel = orderService.createOrder(null, itemId, amount);
        return CommonReturnType.create(null);
    }
}
