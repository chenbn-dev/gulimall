package cn.chenbonian.gulimall.ware.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.ware.dao.WareSkuDao;
import cn.chenbonian.gulimall.ware.entity.WareSkuEntity;
import cn.chenbonian.gulimall.ware.service.WareSkuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity>
    implements WareSkuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<WareSkuEntity> page =
        this.page(new Query<WareSkuEntity>().getPage(params), new QueryWrapper<WareSkuEntity>());

    return new PageUtils(page);
  }
}
