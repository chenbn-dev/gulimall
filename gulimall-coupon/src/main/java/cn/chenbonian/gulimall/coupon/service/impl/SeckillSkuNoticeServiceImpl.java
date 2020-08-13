package cn.chenbonian.gulimall.coupon.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.coupon.dao.SeckillSkuNoticeDao;
import cn.chenbonian.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import cn.chenbonian.gulimall.coupon.service.SeckillSkuNoticeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl
    extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity>
    implements SeckillSkuNoticeService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SeckillSkuNoticeEntity> page =
        this.page(
            new Query<SeckillSkuNoticeEntity>().getPage(params),
            new QueryWrapper<SeckillSkuNoticeEntity>());

    return new PageUtils(page);
  }
}
