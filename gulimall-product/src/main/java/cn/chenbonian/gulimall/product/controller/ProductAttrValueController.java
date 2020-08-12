package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.ProductAttrValueEntity;
import cn.chenbonian.gulimall.product.service.ProductAttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * spu属性值
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/productattrvalue")
public class ProductAttrValueController {
  @Autowired private ProductAttrValueService productAttrValueService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:productattrvalue:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = productAttrValueService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:productattrvalue:info")
  public R info(@PathVariable("id") Long id) {
    ProductAttrValueEntity productAttrValue = productAttrValueService.getById(id);

    return R.ok().put("productAttrValue", productAttrValue);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:productattrvalue:save")
  public R save(@RequestBody ProductAttrValueEntity productAttrValue) {
    productAttrValueService.save(productAttrValue);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:productattrvalue:update")
  public R update(@RequestBody ProductAttrValueEntity productAttrValue) {
    productAttrValueService.updateById(productAttrValue);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:productattrvalue:delete")
  public R delete(@RequestBody Long[] ids) {
    productAttrValueService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
