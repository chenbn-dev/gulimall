package cn.chenbonian.gulimall.product.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 品牌
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
public interface BrandService extends IService<BrandEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
