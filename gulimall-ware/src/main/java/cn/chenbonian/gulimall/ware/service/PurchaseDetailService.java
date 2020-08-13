package cn.chenbonian.gulimall.ware.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.ware.entity.PurchaseDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:52:48
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
