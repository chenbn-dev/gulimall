package cn.chenbonian.gulimall.product.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.product.dao.AttrGroupDao;
import cn.chenbonian.gulimall.product.entity.AttrGroupEntity;
import cn.chenbonian.gulimall.product.service.AttrGroupService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity>
    implements AttrGroupService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrGroupEntity> page =
        this.page(
            new Query<AttrGroupEntity>().getPage(params), new QueryWrapper<AttrGroupEntity>());

    return new PageUtils(page);
  }
}
