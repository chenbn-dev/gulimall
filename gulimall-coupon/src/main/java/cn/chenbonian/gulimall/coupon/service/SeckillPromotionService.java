package cn.chenbonian.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

