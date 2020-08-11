package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.AttrDao;
import cn.chenbonian.gulimall.product.entity.AttrEntity;
import cn.chenbonian.gulimall.product.service.AttrService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrEntity> page =
        this.page(new Query<AttrEntity>().getPage(params), new QueryWrapper<AttrEntity>());

    return new PageUtils(page);
  }
}
