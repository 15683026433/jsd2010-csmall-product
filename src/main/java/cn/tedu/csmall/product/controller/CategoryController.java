package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.web.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PostMapping("/delete")
    public JsonResult delete() {
        return null;
    }

}
