package work.jianhang.seckill.controller.viewobject;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemVO {

    private Integer id;
    // 商品名称
    private String title;

    // 商品价格
    private BigDecimal price;

    // 商品库存
    private Integer stock;

    // 商品描述
    private String description;

    // 商品销量
    private Integer sales;

    // 商品描述图片url
    private String imgUrl;
}
