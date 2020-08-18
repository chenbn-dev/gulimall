package cn.chenbonian.gulimall.product;

import cn.chenbonian.gulimall.product.entity.BrandEntity;
import cn.chenbonian.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// @Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

  @Autowired BrandService brandService;

  //  @Autowired CategoryService categoryService;

  //  @Test
  //  public void testFindPath() {
  //    Long[] catelogPath = categoryService.findCatelogPath(225L);
  //    log.info("完整路径：{}", Arrays.asList(catelogPath));
  //  }

  @Test
  public void contextLoads() {
    BrandEntity brandEntity = new BrandEntity();
    brandEntity.setDescript("你好");
    brandEntity.setName("你好");
    brandService.save(brandEntity);
    System.out.println("保存成功....");
    brandService.updateById(brandEntity);
  }
}
