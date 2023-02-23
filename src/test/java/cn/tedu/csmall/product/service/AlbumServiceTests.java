package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AlbumServiceTests {

    @Autowired
    IAlbumService service;

    @Test
    void addNew() {
        AlbumAddNewDTO albumAddNewDTO = new AlbumAddNewDTO();
        albumAddNewDTO.setName("测试数据0003");
        albumAddNewDTO.setDescription("测试数据的简介0003");
        albumAddNewDTO.setSort(1);

        try {
            service.addNew(albumAddNewDTO);
            log.debug("添加数据成功！");
        } catch (ServiceException e) {
            log.debug("添加数据失败，名称已经被占用！");
        } catch (Throwable e) {
            log.debug("程序运行过程中出现错误！");
            e.printStackTrace();
        }
    }

    @Test
    void delete() {
        Long id = 4L;

        try {
            service.delete(id);
            log.debug("删除数据成功！");
        } catch (ServiceException e) {
            log.debug("删除数据失败，数据不存在！");
        } catch (Throwable e) {
            log.debug("程序运行过程中出现错误！");
            e.printStackTrace();
        }
    }

}
