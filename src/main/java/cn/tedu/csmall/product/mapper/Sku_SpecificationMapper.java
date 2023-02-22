package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Sku_specification;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理数据的Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface Sku_SpecificationMapper {

    /**
     * 插入相册数据
     * @param sku_specification 相册数据
     * @return 受影响的行数
     */
    int insert(Sku_specification sku_specification);

    /**
     * 批量插入相册数据
     * @param sku_specificationList 若干个相册数据的集合
     * @return 受影响的行数
     */
    int insertBatch(List<Sku_specification> sku_specificationList);

    /**
     * 根据ID删除相册数据
     * @param id 尝试删除的相册数据的ID
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个ID批量删除相册数据
     * @param ids 尝试删除的若干个相册数据的ID的数组
     * @return 受影响的行数
     */
    int deleteByIds(Long[] ids);





}
