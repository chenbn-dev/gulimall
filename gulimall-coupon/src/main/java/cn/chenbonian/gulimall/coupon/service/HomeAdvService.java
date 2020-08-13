package cn.chenbonian.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

