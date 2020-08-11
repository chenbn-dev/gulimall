package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SkuSaleAttrValueEntity;
import cn.chenbonian.gulimall.product.service.SkuSaleAttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("porduct/skusaleattrvalue")
public class SkuSaleAttrValueController {
  @Autowired private SkuSaleAttrValueService skuSaleAttrValueService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:skusaleattrvalue:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = skuSaleAttrValueService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:skusaleattrvalue:info")
  public R info(@PathVariable("id") Long id) {
    SkuSaleAttrValueEntity skuSaleAttrValue = skuSaleAttrValueService.getById(id);

    return R.ok().put("skuSaleAttrValue", skuSaleAttrValue);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:skusaleattrvalue:save")
  public R save(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue) {
    skuSaleAttrValueService.save(skuSaleAttrValue);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:skusaleattrvalue:update")
  public R update(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue) {
    skuSaleAttrValueService.updateById(skuSaleAttrValue);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:skusaleattrvalue:delete")
  public R delete(@RequestBody Long[] ids) {
    skuSaleAttrValueService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
