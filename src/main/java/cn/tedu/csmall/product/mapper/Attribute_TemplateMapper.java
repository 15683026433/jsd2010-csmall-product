package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.entity.Attribute_Template;
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
public interface Attribute_TemplateMapper {

    /**
     * 插入相册数据
     * @param attribute_template 相册数据
     * @return 受影响的行数
     */
    int insert(Attribute_Template attribute_template);

    /**
     * 批量插入相册数据
     * @param attribute_templateList 若干个相册数据的集合
     * @return 受影响的行数
     */
    int insertBatch(List<Attribute_Template> attribute_templateList);

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
     * @param attribute_template 封装了被修改的相册数据的ID和新数据的对象
     * @return
     */
    int update(Attribute_Template attribute_template);

    /**
     * 统计相册数据的数量
     * @return 相册数据的数量
     */
    int count();

    /**
     * 根据名称统计数量
     * @param name
     * @return
     */
    int countByName(String name);

    /**
     * 根据名称和“非此id”统计数量
     * @param name
     * @param id
     * @return
     */
    int countByNameAndNotId(@Param("name") String name,@Param("id") Long id);

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
