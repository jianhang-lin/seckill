package work.jianhang.seckill.service;

import work.jianhang.seckill.error.BusinessException;
import work.jianhang.seckill.service.model.OrderModel;

public interface OrderService {

    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;
}
