package cn.chenbonian.gulimall.coupon.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.coupon.entity.SeckillSkuRelationEntity;
import cn.chenbonian.gulimall.coupon.service.SeckillSkuRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
@RestController
@RequestMapping("/coupon/seckillskurelation")
public class SeckillSkuRelationController {
  @Autowired private SeckillSkuRelationService seckillSkuRelationService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:seckillskurelation:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = seckillSkuRelationService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:seckillskurelation:info")
  public R info(@PathVariable("id") Long id) {
    SeckillSkuRelationEntity seckillSkuRelation = seckillSkuRelationService.getById(id);

    return R.ok().put("seckillSkuRelation", seckillSkuRelation);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:seckillskurelation:save")
  public R save(@RequestBody SeckillSkuRelationEntity seckillSkuRelation) {
    seckillSkuRelationService.save(seckillSkuRelation);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:seckillskurelation:update")
  public R update(@RequestBody SeckillSkuRelationEntity seckillSkuRelation) {
    seckillSkuRelationService.updateById(seckillSkuRelation);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:seckillskurelation:delete")
  public R delete(@RequestBody Long[] ids) {
    seckillSkuRelationService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
