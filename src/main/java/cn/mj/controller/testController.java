package cn.mj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "controller")
@Api(value = "知识点", description = "图谱相关知识点", position = 2)
public class testController {

    @RequestMapping(value = "test")
    @ResponseBody
    @ApiOperation(value = "通过id查找知识点的信息")
    public String test() {
        return "helloword";
    }

    @RequestMapping(value = "test1")
    @ResponseBody
    public String test1() {
        return "helloword1";
    }
}
