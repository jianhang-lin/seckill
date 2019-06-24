-- auto-generated definition
-- auto-generated definition
create table user_info
(
    id             int auto_increment comment '用户id'
        primary key,
    name           varchar(64) default '' not null comment '用户名称',
    gender         tinyint     default 0  not null comment '1代表男性，2代表女性',
    age            int         default 0  not null comment '年龄',
    telphone       varchar(16) default '' not null comment '电话号码',
    register_mode  varchar(32) default '' not null comment '通过手机号、微信、淘宝注册',
    third_party_id varchar(64) default '' not null comment '第三方账号id',
    UNIQUE KEY 'telphone_unique_index' ('telphone') USING BTREE
)
    comment '用户信息表';
-- auto-generated definition
create table user_password
(
    id              int auto_increment comment '用户密码id'
        primary key,
    encrpt_password varchar(128) default '' not null comment '密文',
    user_id         int          default 0  not null comment '用户id'
)
    comment '用户密码表';

-- auto-generated definition
create table item
(
    id          int auto_increment comment '商品id'
        primary key,
    title       varchar(64)  default '' not null comment '商品名称',
    price       double       default 0  not null comment '商品价格',
    description varchar(512) default '' not null comment '商品描述',
    sales       int          default 0  not null comment '商品销量',
    img_url     varchar(512) default '' not null comment '商品描述图片url'
)
    comment '商品表';

-- auto-generated definition
create table item_stock
(
    id      int auto_increment comment '商品库存id'
        primary key,
    stock   int default 0 not null comment '商品库存',
    item_id int default 0 not null comment '商品id'
)
    comment '商品库存表';

-- auto-generated definition
create table order_info
(
    id          varchar(32) default '' not null comment '交易id'
        primary key,
    user_id     int         default 0  not null comment '用户id',
    item_id     int         default 0  not null comment '商品id',
    item_price  double      default 0  not null comment '商品单价',
    amount      int         default 0  not null comment '购买数量',
    order_price double      default 0  not null comment '购买金额'
)
    comment '交易表';

-- auto-generated definition
create table sequence_info
(
    name          varchar(255)  not null comment 'sequence名字'
        primary key,
    current_value int default 0 not null comment '当前值',
    step          int default 0 not null comment '步长'
)
    comment 'sequence表';

INSERT INTO seckill.sequence_info (name, current_value, step) VALUES ('order_info', 0, 1);

-- auto-generated definition
create table promo
(
    id               int auto_increment comment '秒杀活动id'
        primary key,
    promo_name       varchar(255) default ''                    not null comment '秒杀活动名称',
    start_date       datetime     default '1970-01-01 08:00:01' not null comment '秒杀活动的开始时间',
    item_id          int          default 0                     not null comment '秒杀活动的适用商品',
    promo_item_price double       default 0                     not null comment '秒杀活动的商品价格'
)
    comment '秒杀活动';

INSERT INTO seckill.promo (id, promo_name, start_date, item_id, promo_item_price) VALUES (1, 'iphone X抢购活动', '2019-06-25 09:55:59', 5, 4400);


