package cn.chenbonian.gulimall.coupon.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.HomeSubjectSpuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 专题商品
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
