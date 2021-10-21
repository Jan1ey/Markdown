# Maven

## · 文件结构：  

    ·bin: mvn clean/build/package 存放可执行二进制文件
    ·boot：类加载器
    ·conf：存放配置文件. settings.xml配置jdk版本和依赖仓库信息等
    ·lib：存放maven自身的jar包
    ·usrlibs：管理本地仓库使用的各种依赖.  
## ·仓库Repository

    ·远程仓库：MAVEN_HOME/conf/settings.xml：mirrors>mirror  
    ·本地仓库：MAVEN_HOME/conf/settings.xml:localRepository 
    ·私有服务器
  ·配置本地仓库时，在windows环境下出现文件目录错误  
  ·原因：使用复制的win10属性中的路径，路径前有不可见符号，手动输入路径后解决.
## ·配置文件

    ·全局配置：settings.xml
    ·项目配置：pom.xml 
    ·用户配置：settings.xmlnote
    ·优先级：pom.xml > settings.xmlnote > settings.xml
  [pom.xml配置描述文件](http://r0k8todwk.hd-bkt.clouddn.com/pom_sample.xml)  
## ·gav坐标
    ·groupId: 项目ID, 当前项目和其他项目的唯一标志.
    ·artifactId：组件ID, 当前项目中的子应用或者子组件的唯一标志.
    ·version：版本号, 迭代开发时标志的产品版本信息.
### ·Maven命令操作
    ·mvn --version:查看当前mvn版本
    ·mvn archetype:generate: 构建项目
    ·mvn clean:项目清理,清理target目录下项目中编译生成的文件数据
    ·mvn compile:项目编译,将java源代码文件编译成字节文件并将文件存储到target目录中
    ·mvn package:项目打包, 打包编写的项目，生成对应的jar包或var包，存储到target目录中，方便后期使用
    ·mvn tomcat:run:使用tomcat插件运行项目
    ·mvn test:自动执行test目录中的测试案例并生成对应的测试报告文档
    ·mvn site:生成报表数据
    ·mvn dependency:tree:查看当前的依赖树
    ·mvn install:将打包好的jar包或war包添加到本地仓库中
    ·mvn deploy:将安装在本地的jar包或war包发布到私有服务器或镜像仓库
## ·生命周期
    ·clean lifecycle:项目构建之前的清理环节
    ·default lifecycle:项目编译和打包环节
    ·site lifecycle:项目报告、站点信息、发布环节
## ·archetype项目骨架加载慢的问题
    ·下载[archetype-catalog.xml](http://r0k8todwk.hd-bkt.clouddn.com/archetype-catalog.xml)  
    ·将archetype-catalog.xml文件放到本地仓库中的/org/apache/maven/archetype/archetype-catalog/版本号/文件夹下.
    ·IDEA中setting->Build->Build Tools->Maven->Runner，添加VM Options参数：-DarchetypeCatalog=local,apply即可
## ·依赖的范围管理
    ·compile范围：编译、运行、测试、打包都依赖的jar包,如开发项目时对spring-core的依赖就是compile范围
    ·provided范围：只在编译和运行时有效，打包时不会包含这样的jar包，如servlet-api容器相关的依赖
    ·test范围：只在测试时有效，在编译和运行以及打包时都不会使用，如测试使用的junit依赖就是test范围
    ·runtime范围：只在运行时有效，但是打包时会将对应的jar包包含进来，如jdbc驱动在编译时是不需要参加的，但是运行时是需要具体的第三方实现的jar包
    ·system范围：本地jar包，作用范围和provided一致，但是必须配合systemPath指定本地依赖的路径才能使用（应用较少）
## ·父子项目依赖传递
    ·
## ·项目聚合统一管理
    ·
## ·常见插件的使用
    ·
## ·搭建私有服务器
    ·
## ·创建私有仓库
    ·
## ·依赖下载和项目发布
    ·
## ·Maven依赖直接冲突的问题
    ·
## ·Maven依赖传递冲突的问题
    ·
    