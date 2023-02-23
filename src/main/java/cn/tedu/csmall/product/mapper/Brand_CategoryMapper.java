package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.entity.Brand_Category;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.apache.ibatis.annotations.Param;
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

    /**
     * 修改相册数据
     * @param brand_category 封装了被修改的相册数据的ID和新数据的对象
     * @return
     */
    int update(Brand_Category brand_category);

    /**
     * 统计相册数据的数量
     * @return 相册数据的数量
     */
    int count();

    /**
     * 根据品牌ID统计数量
     * @param brandId
     * @return
     */
    int countByBrand(Long brandId);

    /**
     * 根据类别ID统计数量
     * @param categoryId 类别ID
     * @return
     */
    int countByCategory(Long categoryId);

    /**
     * 根据品牌ID和类别ID统计数量
     * @param brandId 匹配ID
     * @param categoryId 类别ID
     * @return
     */
    int countByBrandAndCategory(@Param("brandId") Long brandId, @Param("categoryId") Long categoryId);

    /**
     * 根据ID查询数据的详情
     * @param id 相册ID
     * @return 匹配的相册数据的详情，如果没有匹配的数据，则返回null
     */
    AlbumStandardVO getStandardById(Long id);

    /**
     * 查询相册列表
     *
     * @return 相册列表
     */
    List<AlbumListItemVO> list();





}
