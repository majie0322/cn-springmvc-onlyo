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