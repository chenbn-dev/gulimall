package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
