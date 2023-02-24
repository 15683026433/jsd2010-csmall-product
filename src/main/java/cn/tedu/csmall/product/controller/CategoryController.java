package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.web.JsonResult;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Api(tags = "02,类别管理模块")
public class CategoryController {

    @PostMapping("/delete")
    public JsonResult delete() {
        return null;
    }

}
