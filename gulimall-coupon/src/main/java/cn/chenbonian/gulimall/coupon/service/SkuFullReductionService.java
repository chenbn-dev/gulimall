package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:22
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
