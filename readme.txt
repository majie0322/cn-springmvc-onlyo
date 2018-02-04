1.spring mvc   体系结构
控制器：dispatcherServlet
                controller

 映射处理器：HanderMapping
 模型和视图组件：modleAndView
 视图解析器：ViewResolver

 spring处理流程
 1）浏览器像spring发出请求，请求交给前端控制器DispactherServlet处理
 2）控制器通过handlerMapping找到相应的Controller组件处理请求
 3）执行Controller组件约定方法处理请求，在约定方法调用模型组件完成业务处理。约定方法可以
        返回一个ModelAndView对象，封装了处理结果数据和视图名称信息
  4）控制器接受ModelAndView之后，调用ViewResolver组件，定位View（jsp）并传递数据信息，
        生成响应界面信息结果



 2.quartz corn规则
 秒 分 时 日 月 周 年
 https://www.cnblogs.com/lazyInsects/p/8075487.html

   3 <!-- 指定持久化单元名字，即JPA配置文件中指定的 -->
 <!--<property name="persistenceUnitName" value="myJPA" />
 这个配置太烦那么就配置 <property name="packagesToScan" value="cn.springmvc.onlyo.entity"></property>
则 就无需配置。


4  @Cacheable
value：缓存位置名称，不能为空，如果使用EHCache，
就是ehcache.xml中声明的cache的name, 指明将值缓存到哪个Cache中
key：缓存的key，默认为空，既表示使用方法的参数类型及参数值作为key，
支持SpEL，如果要引用参数值使用井号加参数名，如：#userId，
condition：触发条件，只有满足条件的情况才会加入缓存，默认为空，
既表示全部都加入缓存，支持SpEL


4 shiro 安全框架

1）先获取当前的subject
        Subject currentUser = SecurityUtils.getSubject();
2）测试当前的用户是否已经被认证，即是否已经登入，调用subject的isAuthenicated（）
3）若没有被认证，则把用户和密码封装为usernamePasswordToken对象
a.创建一个表单页面
b.把请求提交到springmvc的 handler
c.获取用户名和密码
4.执行登入：调用subject的login方法..login(token)
5.自定义Realm的方法 从数据库获取对应的记录，返回shiro
a 实际上需要继承org.apache.shiro.realm.AuthenticatingRealm
b 实现org.apache.shiro.realm.AuthenticatingRealm.doGetAuthenticationInfo（）方法
6 由shiro完成密码的比对
通过 AuthenticatingRealm 的 credentialsMatcher 属性来进行的密码的比对!
1. 如何把一个字符串加密为 MD5
2. 替换当前 Realm 的 credentialsMatcher 属性. 直接使用 HashedCredentialsMatcher 对象, 并设置加密算法即可.
1. 为什么使用 MD5 盐值加密:
2. 如何做到:
1). 在 doGetAuthenticationInfo 方法返回值创建 SimpleAuthenticationInfo 对象的时候, 需要使用
SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName) 构造器
2). 使用 ByteSource.Util.bytes() 来计算盐值.
3). 盐值需要唯一: 一般使用随机字符串或 user id
4). 使用 new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
来计算盐值加密后的密码的值

三。AuthenticationStrategy
AllSuccessfulStrategy
AtLeastOneSuccessfulStrategy
FirstSuccessfulStrategy
1. 授权需要继承 AuthorizingRealm 类, 并实现其 doGetAuthorizationInfo 方法
2. AuthorizingRealm 类继承自 AuthenticatingRealm, 但没有实现 AuthenticatingRealm 中的
doGetAuthenticationInfo, 所以认证和授权只需要继承 AuthorizingRealm 就可以了. 同时实现他的两个抽象方法.
