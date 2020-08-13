package cn.chenbonian.gulimall.coupon.service.impl;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.Query;
import cn.chenbonian.gulimall.coupon.dao.CouponDao;
import cn.chenbonian.gulimall.coupon.entity.CouponEntity;
import cn.chenbonian.gulimall.coupon.service.CouponService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity>
    implements CouponService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CouponEntity> page =
        this.page(new Query<CouponEntity>().getPage(params), new QueryWrapper<CouponEntity>());

    return new PageUtils(page);
  }
}
