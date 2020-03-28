package top.glory.service.impl;


import top.glory.dao.ProductDao;
import top.glory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.glory.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getById(Integer pid) {
        Product product = productDao.findById(pid).get();
        return product;
    }
}
