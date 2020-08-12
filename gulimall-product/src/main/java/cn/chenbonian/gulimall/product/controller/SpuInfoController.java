package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SpuInfoEntity;
import cn.chenbonian.gulimall.product.service.SpuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * spu信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/spuinfo")
public class SpuInfoController {
  @Autowired private SpuInfoService spuInfoService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:spuinfo:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = spuInfoService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:spuinfo:info")
  public R info(@PathVariable("id") Long id) {
    SpuInfoEntity spuInfo = spuInfoService.getById(id);

    return R.ok().put("spuInfo", spuInfo);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:spuinfo:save")
  public R save(@RequestBody SpuInfoEntity spuInfo) {
    spuInfoService.save(spuInfo);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:spuinfo:update")
  public R update(@RequestBody SpuInfoEntity spuInfo) {
    spuInfoService.updateById(spuInfo);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:spuinfo:delete")
  public R delete(@RequestBody Long[] ids) {
    spuInfoService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
