package cn.chenbonian.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

