package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理相册数据的Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface AlbumMapper {

    /**
     * 插入相册数据
     * @param album 相册数据
     * @return 受影响的行数
     */
    int insert(Album album);

    /**
     * 批量插入相册数据
     * @param albumList 若干个相册数据的集合
     * @return 受影响的行数
     */
    int insertBatch(List<Album> albumList);

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
     * @param album 封装了被修改的相册数据的ID和新数据的对象
     * @return
     */
    int update(Album album);

    /**
     * 统计相册数据的数量
     * @return 相册数据的数量
     */
    int count();

    /**
     * 根据相册名称统计相册数据的数量
     * @param name 相册名称
     * @return 匹配名称的相册数据的数量
     */
    int countByName(String name);

    /**
     * /根据名称和“非此id”统计数量,此方法将用于“有没有别的数据使用此名称”
     * @param id
     * @param name
     * @return
     */
    int countByNameAndNotId(@Param("id") Long id, @Param("name") String name);

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
