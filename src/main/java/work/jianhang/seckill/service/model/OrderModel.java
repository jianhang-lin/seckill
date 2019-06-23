package work.jianhang.seckill.service.model;

import lombok.Data;

import java.math.BigDecimal;

// 用户下单的交易模型
@Data
public class OrderModel {
    // 201909101992374
    private String id;

    // 购买的用户id
    private Integer userId;

    // 购买的商品id
    private Integer itemId;

    // 购买的商品单价
    private BigDecimal itemPrice;

    // 购买数量
    private Integer amount;

    // 购买金额
    private BigDecimal orderPrice;
}
