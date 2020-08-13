package cn.chenbonian.gulimall.order.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:28
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
