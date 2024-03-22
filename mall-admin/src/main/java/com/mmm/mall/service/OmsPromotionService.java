package com.mmm.mall.service;

import com.mmm.mall.portal.domain.CartPromotionItem;
import com.mmm.mall.model.OmsCartItem;

import java.util.List;

/**
 * 促销管理Service
 * Created by mmm on 2018/8/27.
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
