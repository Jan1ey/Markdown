# SpringBoot秒杀项目实战
## ·项目介绍
    ·商品列表页获取秒杀商品列表
    ·进入商品详情页获取秒杀商品详情
    ·秒杀开始后进入下单确认页下单并支付成功
## ·项目设计
    ·使用IDEA+Maven搭建SpringBoot开发环境
    ·集成MyBatis操作数据库
    ·实现秒杀项目
## ·项目流程
### 1.使用IDEA+Maven搭建SpringBoot开发环境
    ·使用idea创建一个新的maven项目
    ·在maven项目中的pom.xml引入SpringBoot相关依赖
    ·在/src/main/java中的app文件中，加入SpringBoot对应的@EnableAutoConfiguration，开启基于SpringBoot的自动化配置
    ·添加mybatis相关的依赖与插件
    ·配置mysql数据库，添加user_info表和user_password表