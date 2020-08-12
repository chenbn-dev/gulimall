package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.CategoryEntity;
import cn.chenbonian.gulimall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/category")
public class CategoryController {
  @Autowired private CategoryService categoryService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:category:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = categoryService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{catId}")
  // @RequiresPermissions("porduct:category:info")
  public R info(@PathVariable("catId") Long catId) {
    CategoryEntity category = categoryService.getById(catId);

    return R.ok().put("category", category);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:category:save")
  public R save(@RequestBody CategoryEntity category) {
    categoryService.save(category);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:category:update")
  public R update(@RequestBody CategoryEntity category) {
    categoryService.updateById(category);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:category:delete")
  public R delete(@RequestBody Long[] catIds) {
    categoryService.removeByIds(Arrays.asList(catIds));

    return R.ok();
  }
}
