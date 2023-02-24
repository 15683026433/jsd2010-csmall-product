package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.handler.GlobalExceptionHandler;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.service.IAlbumService;
import cn.tedu.csmall.product.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/album")
@Api(tags = "01,相册管理模块")
@Validated
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    // http://localhost:8080/album/add-new?name=test001&description=hahahaha&sort=100
    // http://localhost:8080/album/add-new
    @RequestMapping("/add-new")
    @ApiOperation(("添加相册"))
    @ApiOperationSupport(order = 100)
    public JsonResult addNew(@Valid AlbumAddNewDTO albumAddNewDTO){
            albumService.addNew(albumAddNewDTO);
            return JsonResult.ok();
    }

    // http://localhost:8080/album/delete?id=1
    @RequestMapping("/delete")
    @ApiOperation("根据ID删除相册")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "相册ID",required = true,dataType = "long"),
            @ApiImplicitParam(name = "username",value = "用户名",required = true)
    })
    public JsonResult delete(@RequestParam @Range(min = 1) Long id, String username) {
            albumService.delete(id);
            return JsonResult.ok();
    }



}
