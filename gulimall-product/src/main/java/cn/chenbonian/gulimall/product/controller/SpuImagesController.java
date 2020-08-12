package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SpuImagesEntity;
import cn.chenbonian.gulimall.product.service.SpuImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * spu图片
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/spuimages")
public class SpuImagesController {
  @Autowired private SpuImagesService spuImagesService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:spuimages:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = spuImagesService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:spuimages:info")
  public R info(@PathVariable("id") Long id) {
    SpuImagesEntity spuImages = spuImagesService.getById(id);

    return R.ok().put("spuImages", spuImages);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:spuimages:save")
  public R save(@RequestBody SpuImagesEntity spuImages) {
    spuImagesService.save(spuImages);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:spuimages:update")
  public R update(@RequestBody SpuImagesEntity spuImages) {
    spuImagesService.updateById(spuImages);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:spuimages:delete")
  public R delete(@RequestBody Long[] ids) {
    spuImagesService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
