### 使用步骤（Google Chrome）

1. 修改 application.yml 文件的<strong> swagger.url </strong>为Swagger Json资源的url地址。 
2. 服务启动后：访问 http://host(主机):port(端口)/，进页面输入目标url  
3. 可以看到网页上生成的类似 word 文档的页面，右键另存为 xxx.doc 文件即可。

#### 版本： SwaggerToWord 1.0 （2019-07-25）
1. 一个Swagger API 文档转 Word 文档的工具项目 
2. 项目想法和说明可以参考：[http://www.cnblogs.com/jmcui/p/8298823.html](http://www.cnblogs.com/jmcui/p/8298823.html)
3. SpringBoot 
4. thymeleaf 
5. 响应参数从 Swagger Json 文件中直接读取  
6. 针对 application/json 请求方式的入参做渲染     
7. 对于文字过多导致 HTML table 变形做适配   

