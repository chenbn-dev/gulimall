package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.CategoryBrandRelationEntity;
import cn.chenbonian.gulimall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("porduct/categorybrandrelation")
public class CategoryBrandRelationController {
  @Autowired private CategoryBrandRelationService categoryBrandRelationService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:categorybrandrelation:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = categoryBrandRelationService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:categorybrandrelation:info")
  public R info(@PathVariable("id") Long id) {
    CategoryBrandRelationEntity categoryBrandRelation = categoryBrandRelationService.getById(id);

    return R.ok().put("categoryBrandRelation", categoryBrandRelation);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:categorybrandrelation:save")
  public R save(@RequestBody CategoryBrandRelationEntity categoryBrandRelation) {
    categoryBrandRelationService.save(categoryBrandRelation);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:categorybrandrelation:update")
  public R update(@RequestBody CategoryBrandRelationEntity categoryBrandRelation) {
    categoryBrandRelationService.updateById(categoryBrandRelation);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:categorybrandrelation:delete")
  public R delete(@RequestBody Long[] ids) {
    categoryBrandRelationService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
