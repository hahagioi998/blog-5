package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Attention;
import life.majiang.community.model.AttentionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AttentionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    long countByExample(AttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int deleteByExample(AttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int insert(Attention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int insertSelective(Attention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    List<Attention> selectByExampleWithRowbounds(AttentionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    List<Attention> selectByExample(AttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    Attention selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int updateByPrimaryKeySelective(Attention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention
     *
     * @mbg.generated Tue Mar 31 13:07:27 CST 2020
     */
    int updateByPrimaryKey(Attention record);
}