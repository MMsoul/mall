package com.mmm.mall.service.impl;

import com.mmm.mall.mapper.CmsPrefrenceAreaMapper;
import com.mmm.mall.model.CmsPrefrenceArea;
import com.mmm.mall.model.CmsPrefrenceAreaExample;
import com.mmm.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 * Created by mmm on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
