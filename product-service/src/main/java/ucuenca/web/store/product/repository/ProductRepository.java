package ucuenca.web.store.product.repository;

import ucuenca.web.store.product.entity.Category;
import ucuenca.web.store.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
