package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SpuInfoDescEntity;
import cn.chenbonian.gulimall.product.service.SpuInfoDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/spuinfodesc")
public class SpuInfoDescController {
  @Autowired private SpuInfoDescService spuInfoDescService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:spuinfodesc:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = spuInfoDescService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{spuId}")
  // @RequiresPermissions("porduct:spuinfodesc:info")
  public R info(@PathVariable("spuId") Long spuId) {
    SpuInfoDescEntity spuInfoDesc = spuInfoDescService.getById(spuId);

    return R.ok().put("spuInfoDesc", spuInfoDesc);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:spuinfodesc:save")
  public R save(@RequestBody SpuInfoDescEntity spuInfoDesc) {
    spuInfoDescService.save(spuInfoDesc);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:spuinfodesc:update")
  public R update(@RequestBody SpuInfoDescEntity spuInfoDesc) {
    spuInfoDescService.updateById(spuInfoDesc);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:spuinfodesc:delete")
  public R delete(@RequestBody Long[] spuIds) {
    spuInfoDescService.removeByIds(Arrays.asList(spuIds));

    return R.ok();
  }
}
