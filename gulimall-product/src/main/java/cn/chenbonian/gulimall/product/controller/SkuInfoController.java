package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SkuInfoEntity;
import cn.chenbonian.gulimall.product.service.SkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * sku信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:50
 */
@RestController
@RequestMapping("porduct/skuinfo")
public class SkuInfoController {
  @Autowired private SkuInfoService skuInfoService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:skuinfo:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = skuInfoService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{skuId}")
  // @RequiresPermissions("porduct:skuinfo:info")
  public R info(@PathVariable("skuId") Long skuId) {
    SkuInfoEntity skuInfo = skuInfoService.getById(skuId);

    return R.ok().put("skuInfo", skuInfo);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:skuinfo:save")
  public R save(@RequestBody SkuInfoEntity skuInfo) {
    skuInfoService.save(skuInfo);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:skuinfo:update")
  public R update(@RequestBody SkuInfoEntity skuInfo) {
    skuInfoService.updateById(skuInfo);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:skuinfo:delete")
  public R delete(@RequestBody Long[] skuIds) {
    skuInfoService.removeByIds(Arrays.asList(skuIds));

    return R.ok();
  }
}
