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
