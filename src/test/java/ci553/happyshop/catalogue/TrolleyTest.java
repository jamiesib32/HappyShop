package ci553.happyshop.catalogue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrolleyTest {

    @Test
    void addProduct()
    {
        Product p1 = new Product("0001", "TV",562.32,0);
        Product p2=new Product("0002","Toaster",568.53,0);

        Trolley t = new Trolley();
        t.addProduct(p1);
        t.addProduct(p2);
        assertEquals(2,t.getProducts().size(),1);
        assertEquals("0001",t.getProducts().get(0).getProductId());
        assertEquals("0002",t.getProducts().get(1).getProductId());
    }
}