package com.welfare.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 资源申请表单
 */
public class ApplyResource implements Serializable {
    private String applyId;// 申请单编号
    private String applyWeId;//申请者微信号
    private String applicant;//申请者姓名
    private String applyPhone;//申请者联系电话
    private String applyReason;//申请理由
    private Date startUseDate;//开始使用时间
    private Date endUseDate;//结束使用时间
    private Date applyDate;//申请时间
    private String approvalFirst;//初审人
    private String approvalSecond;//终审人
    private String approvalFirstIdea;//初审意见
    private String approvalSecondIdea;//终审意见
    private String applyResult;//审批结论
    private String applyState;//终审意见
    private Date applyFinalDate;//最终审批时间

    public ApplyResource() {
    }

    public ApplyResource(String applyId, String applyWeId, String applicant, String applyPhone, String applyReason, Date startUseDate, Date endUseDate, Date applyDate, String approvalFirst, String approvalSecond, String approvalFirstIdea, String approvalSecondIdea, String applyResult, String applyState, Date applyFinalDate) {
        this.applyId = applyId;
        this.applyWeId = applyWeId;
        this.applicant = applicant;
        this.applyPhone = applyPhone;
        this.applyReason = applyReason;
        this.startUseDate = startUseDate;
        this.endUseDate = endUseDate;
        this.applyDate = applyDate;
        this.approvalFirst = approvalFirst;
        this.approvalSecond = approvalSecond;
        this.approvalFirstIdea = approvalFirstIdea;
        this.approvalSecondIdea = approvalSecondIdea;
        this.applyResult = applyResult;
        this.applyState = applyState;
        this.applyFinalDate = applyFinalDate;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyWeId() {
        return applyWeId;
    }

    public void setApplyWeId(String applyWeId) {
        this.applyWeId = applyWeId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplyPhone() {
        return applyPhone;
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public Date getStartUseDate() {
        return startUseDate;
    }

    public void setStartUseDate(Date startUseDate) {
        this.startUseDate = startUseDate;
    }

    public Date getEndUseDate() {
        return endUseDate;
    }

    public void setEndUseDate(Date endUseDate) {
        this.endUseDate = endUseDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApprovalFirst() {
        return approvalFirst;
    }

    public void setApprovalFirst(String approvalFirst) {
        this.approvalFirst = approvalFirst;
    }

    public String getApprovalSecond() {
        return approvalSecond;
    }

    public void setApprovalSecond(String approvalSecond) {
        this.approvalSecond = approvalSecond;
    }

    public String getApprovalFirstIdea() {
        return approvalFirstIdea;
    }

    public void setApprovalFirstIdea(String approvalFirstIdea) {
        this.approvalFirstIdea = approvalFirstIdea;
    }

    public String getApprovalSecondIdea() {
        return approvalSecondIdea;
    }

    public void setApprovalSecondIdea(String approvalSecondIdea) {
        this.approvalSecondIdea = approvalSecondIdea;
    }

    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    public Date getApplyFinalDate() {
        return applyFinalDate;
    }

    public void setApplyFinalDate(Date applyFinalDate) {
        this.applyFinalDate = applyFinalDate;
    }
}
