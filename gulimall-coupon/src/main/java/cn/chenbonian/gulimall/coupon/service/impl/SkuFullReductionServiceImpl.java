package cn.chenbonian.gulimall.coupon.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.coupon.dao.SkuFullReductionDao;
import cn.chenbonian.gulimall.coupon.entity.SkuFullReductionEntity;
import cn.chenbonian.gulimall.coupon.service.SkuFullReductionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl
    extends ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity>
    implements SkuFullReductionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuFullReductionEntity> page =
        this.page(
            new Query<SkuFullReductionEntity>().getPage(params),
            new QueryWrapper<SkuFullReductionEntity>());

    return new PageUtils(page);
  }
}
