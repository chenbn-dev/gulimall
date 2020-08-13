package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:24
 */
public interface CouponService extends IService<CouponEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
