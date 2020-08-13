package cn.chenbonian.gulimall.order.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:28
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
