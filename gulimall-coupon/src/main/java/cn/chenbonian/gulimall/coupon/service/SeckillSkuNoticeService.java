package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
