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