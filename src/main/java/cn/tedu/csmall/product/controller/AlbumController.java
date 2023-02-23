package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.handler.GlobalExceptionHandler;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.service.IAlbumService;
import cn.tedu.csmall.product.web.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    // http://localhost:8080/album/add-new?name=test001&description=hahahaha&sort=100
    // http://localhost:8080/album/add-new
    @RequestMapping("/album/add-new")
    public JsonResult addNew(AlbumAddNewDTO albumAddNewDTO){
            albumService.addNew(albumAddNewDTO);
            return JsonResult.ok();
    }

    // http://localhost:8080/album/delete?id=1
    @RequestMapping("/album/delete")
    public JsonResult delete(Long id) {
            albumService.delete(id);
            return JsonResult.ok();
    }



}
