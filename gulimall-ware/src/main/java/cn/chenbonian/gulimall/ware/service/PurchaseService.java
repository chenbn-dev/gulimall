package cn.chenbonian.gulimall.ware.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 采购信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:52:48
 */
public interface PurchaseService extends IService<PurchaseEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
