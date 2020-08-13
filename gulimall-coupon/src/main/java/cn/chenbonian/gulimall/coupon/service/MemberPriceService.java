package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
