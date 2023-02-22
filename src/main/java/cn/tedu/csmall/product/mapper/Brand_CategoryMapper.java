package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand_Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理数据的Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface Brand_CategoryMapper {

    /**
     * 插入相册数据
     * @param brand_category 相册数据
     * @return 受影响的行数
     */
    int insert(Brand_Category brand_category);

    /**
     * 批量插入相册数据
     * @param brand_categoryList 若干个相册数据的集合
     * @return 受影响的行数
     */
    int insertBatch(List<Brand_Category> brand_categoryList);

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