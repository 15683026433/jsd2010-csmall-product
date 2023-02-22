package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AlbumMapper;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO){

        log.debug("开始处理【添加相册】的业务，参数：{}",albumAddNewDTO);
        String name = albumAddNewDTO.getName();

        int count = albumMapper.countByName(name);
        log.debug("根据名称统计数量，结果：{}", count);

        if (count>0){
            log.warn("添加相册失败，相册名称【{}】已经被占用！", name);
            throw new ServiceException();
        }

        // 创建Album对象
        Album album = new Album();
        // 调用BeanUtils.copyProperties(源,目标)将参数对象中的属性复制到Album对象中
        BeanUtils.copyProperties(albumAddNewDTO, album);
        // 调用Mapper对象的insert()执行插入相册数据
        log.debug("即将执行插入数据，参数：{}", album);
        albumMapper.insert(album);
    }
}
