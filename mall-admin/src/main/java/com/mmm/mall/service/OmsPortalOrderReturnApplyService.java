package com.mmm.mall.service;


import com.mmm.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 前台订单退货管理Service
 * Created by mmm on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
