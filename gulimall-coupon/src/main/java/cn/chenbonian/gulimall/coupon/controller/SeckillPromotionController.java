package cn.chenbonian.gulimall.coupon.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.coupon.entity.SeckillPromotionEntity;
import cn.chenbonian.gulimall.coupon.service.SeckillPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 秒杀活动
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
@RestController
@RequestMapping("/coupon/seckillpromotion")
public class SeckillPromotionController {
  @Autowired private SeckillPromotionService seckillPromotionService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:seckillpromotion:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = seckillPromotionService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:seckillpromotion:info")
  public R info(@PathVariable("id") Long id) {
    SeckillPromotionEntity seckillPromotion = seckillPromotionService.getById(id);

    return R.ok().put("seckillPromotion", seckillPromotion);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:seckillpromotion:save")
  public R save(@RequestBody SeckillPromotionEntity seckillPromotion) {
    seckillPromotionService.save(seckillPromotion);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:seckillpromotion:update")
  public R update(@RequestBody SeckillPromotionEntity seckillPromotion) {
    seckillPromotionService.updateById(seckillPromotion);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:seckillpromotion:delete")
  public R delete(@RequestBody Long[] ids) {
    seckillPromotionService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
