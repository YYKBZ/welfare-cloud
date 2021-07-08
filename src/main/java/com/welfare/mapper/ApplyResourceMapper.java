package com.welfare.mapper;

import com.welfare.entity.ApplyResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ApplyResourceMapper {
    /**
     * 申请信息列表-A301
     *
     * @return
     */
    @Select("select applyId,applyWeId,applicant,applyPhone,applyReason,startUseDate," +
            "endUseDate,applyDate,approvalFirst,approvalSecond," +
            "approvalFirstIdea,approvalSecondIdea,applyResult,applyState,applyFinalDate " +
            "from tb_apply_resource")
    List<ApplyResource> selectAllApplyResource();


    /**
     * 初审-A302
     *
     * @return
     */
    @Update("update tb_apply_resource set applyState=#{applyState} where applyId=#{applyId}")
    Integer updateFirstState(ApplyResource applyResource);

    /**
     * @param applyResource
     * @return
     */
    @Update("update tb_apply_resource set applyState=#{applyState} where applyId=#{applyId}")
    Integer updateSecondState(ApplyResource applyResource);

    /**
     * 申请查询-A304
     *
     * @return
     */

    @Select("<script>select applyId,applyWeId,applicant,applyPhone,applyReason,startUseDate," +
            "endUseDate,applyDate,approvalFirst,approvalSecond," +
            "approvalFirstIdea,approvalSecondIdea,applyResult,applyState,applyFinalDate " +
            "from tb_apply_resource " +
            "<where>\n" +
            "<if test=\"applyDate != null\">\n" +
            "         applyDate = #{applyDate} \n" +
            "</if>\n" +
            "<if test=\"applyResult !=null and applyResult !='' \">\n" +
            "        and applyResult = #{applyResult} \n" +
            "</if>\n" +
            "</where></script>")
    List<ApplyResource> selectDateAndState(ApplyResource applyResource);
}