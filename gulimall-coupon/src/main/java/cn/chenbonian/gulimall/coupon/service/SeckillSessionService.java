package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
