package cn.tedu.csmall.product.service.impl;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.mapper.AlbumMapper;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import cn.tedu.csmall.product.service.IAlbumService;
import cn.tedu.csmall.product.web.ServiceCode;
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
            String message = "添加相册失败，相册名称【{}】已经被占用！";
            log.warn(message);
            throw new ServiceException(ServiceCode.ERROR_CONFLICT, message);
        }

        // 创建Album对象
        Album album = new Album();
        // 调用BeanUtils.copyProperties(源,目标)将参数对象中的属性复制到Album对象中
        BeanUtils.copyProperties(albumAddNewDTO, album);
        // 调用Mapper对象的insert()执行插入相册数据
        log.debug("即将执行插入数据，参数：{}", album);
        albumMapper.insert(album);
    }

    @Override
    public void delete(Long id) {
        log.debug("开始处理【根据ID删除相册】的业务，参数：{}", id);
        // 调用Mapper对象的getStandardById()执行查询
        AlbumStandardVO album = albumMapper.getStandardById(id);
        log.debug("根据ID={}检查相册数据是否存在，查询结果：{}", id, album);
        // 判断查询结果是否为null
        if (album == null) {
            // 是：数据不存在，抛出异常
            String message = "尝试删除的相册数据不存在，即将抛出异常";
            log.warn(message);
            throw new ServiceException(ServiceCode.ERROR_NOT_FOUND, message);
        }

        // 调用Mapper对象的deleteById()方法执行删除
        log.debug("即将执行删除，参数：{}", id);
        albumMapper.deleteById(id);
    }
}
