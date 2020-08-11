package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.AttrEntity;
import cn.chenbonian.gulimall.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 商品属性
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:50
 */
@RestController
@RequestMapping("porduct/attr")
public class AttrController {
  @Autowired private AttrService attrService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:attr:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = attrService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{attrId}")
  // @RequiresPermissions("porduct:attr:info")
  public R info(@PathVariable("attrId") Long attrId) {
    AttrEntity attr = attrService.getById(attrId);

    return R.ok().put("attr", attr);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:attr:save")
  public R save(@RequestBody AttrEntity attr) {
    attrService.save(attr);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:attr:update")
  public R update(@RequestBody AttrEntity attr) {
    attrService.updateById(attr);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:attr:delete")
  public R delete(@RequestBody Long[] attrIds) {
    attrService.removeByIds(Arrays.asList(attrIds));

    return R.ok();
  }
}
