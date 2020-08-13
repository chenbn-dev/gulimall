package cn.chenbonian.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:24
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

