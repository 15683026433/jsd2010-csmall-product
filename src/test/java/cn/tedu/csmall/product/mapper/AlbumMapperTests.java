package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class AlbumMapperTests {

    @Autowired
    AlbumMapper mapper;

    @Test
    void insert() {
        Album album = new Album();
        album.setName("测试数据007");
        album.setDescription("测试数据的简介007");
        album.setSort(255); // 注意：此值必须是 [0, 255] 区间内的值

        System.out.println("插入数据之前，参数：" + album);
        int rows = mapper.insert(album);
        System.out.println("插入数据完成！受影响的行数：" + rows);
        System.out.println("插入数据之后，参数：" + album);
    }

    @Test
    void insertBatch() {
        List<Album> albumList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Album album = new Album();
            album.setName("测试数据00" + i);
            albumList.add(album);
        }

        int rows = mapper.insertBatch(albumList);
        log.debug("批量插入数据完成！受影响的行数：{}", rows);
    }

    @Test
    void update(){
        Album album = new Album();
        //album.setId(2L);
        album.setName("测试数据109");
        album.setDescription("测试数据的简介109");
        album.setSort(119);

        int rows = mapper.update(album);
        log.debug("修改数据完成!受影响的行数: {}",rows);
    }

    @Test
    void count(){
        int count = mapper.count();
        log.debug("统计结果完成!结果: {}",count);
    }

    @Test
    void countByName(){
        String name = "测试数据005";

        int count = mapper.countByName(name);
        log.debug("根据名称[{}]统计数据完成！结果：{}",name,count);
    }

    @Test
    void getStandardById(){
        Long id = 1L;
        Object queryResult = mapper.getStandardById(id);

        log.debug("根据ID={}查询数据完成!结果:{}",id,queryResult);
    }

}
