import com.foo.Factory;
import com.foo.IProduct;

public class App {
    public static void main(String[] args) {
        Factory.listProducts().forEach(IProduct::work);
    }
}