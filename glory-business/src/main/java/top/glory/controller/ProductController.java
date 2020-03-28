package top.glory.controller;

import com.alibaba.fastjson.JSON;
import top.glory.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.glory.entity.Product;
import top.glory.utils.GsonUtils;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    //商品信息
    @RequestMapping("/product/{pid}")
    public Product getProduct(@PathVariable("pid") Integer pid){

        log.info("接下来要进行{}号订单的查询",pid);

        Product product = productService.getById(pid);

        String o = JSON.toJSONString(product);
        log.info("商品信息查询成功，内容{}", o);
        String s = GsonUtils.objectToJsonStr(product);
        log.info("商品信息查询成功,内容为{}", s);

        return product;
    }
}
