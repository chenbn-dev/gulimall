package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SkuImagesEntity;
import cn.chenbonian.gulimall.product.service.SkuImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * sku图片
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:50
 */
@RestController
@RequestMapping("/porduct/skuimages")
public class SkuImagesController {
  @Autowired private SkuImagesService skuImagesService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:skuimages:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = skuImagesService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:skuimages:info")
  public R info(@PathVariable("id") Long id) {
    SkuImagesEntity skuImages = skuImagesService.getById(id);

    return R.ok().put("skuImages", skuImages);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:skuimages:save")
  public R save(@RequestBody SkuImagesEntity skuImages) {
    skuImagesService.save(skuImages);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:skuimages:update")
  public R update(@RequestBody SkuImagesEntity skuImages) {
    skuImagesService.updateById(skuImages);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:skuimages:delete")
  public R delete(@RequestBody Long[] ids) {
    skuImagesService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
