package cn.chenbonian.gulimall.coupon.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.coupon.dao.SeckillSkuRelationDao;
import cn.chenbonian.gulimall.coupon.entity.SeckillSkuRelationEntity;
import cn.chenbonian.gulimall.coupon.service.SeckillSkuRelationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl
    extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity>
    implements SeckillSkuRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SeckillSkuRelationEntity> page =
        this.page(
            new Query<SeckillSkuRelationEntity>().getPage(params),
            new QueryWrapper<SeckillSkuRelationEntity>());

    return new PageUtils(page);
  }
}
