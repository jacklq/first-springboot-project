新建一个springboot项目：
从浏览器输入数据，返回处理结果
https://www.cnblogs.com/EggKiller/p/9055592.html

2020-9-4更新
增加异步执行，和单元测试（可能没成功，没有实现异步执行）
2020-9-4更新
增加mybatis查询数据库
建表语句
        CREATE TABLE `test` (
          `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
          `magic_id` varchar(32) NOT NULL,
          `first_name` varchar(32) NOT NULL,
          `last_name` varchar(32) NOT NULL,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
2020-9-10更新
增加postman发送报文，参数非空校验 ，接收参数查询数据库返回报文