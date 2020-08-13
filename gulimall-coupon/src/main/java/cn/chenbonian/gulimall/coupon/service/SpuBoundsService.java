package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:22
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
