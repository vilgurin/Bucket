package flowerstore;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private FlowerBucket bucket1;
    private FlowerBucket bucket2;
    private FlowerPack pack1;
    private FlowerPack pack2;
    private FlowerPack pack3;
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;


    @BeforeEach
    void setUp() {

        store = new Store();
        bucket1 = new FlowerBucket();
        bucket2 = new FlowerBucket();
        pack1 = new FlowerPack();
        pack2 = new FlowerPack();
        pack3 = new FlowerPack();
        flower1 = new Flower();
        flower2 = new Flower();
        flower3 = new Flower();

        flower1.setPrice(15.0);
        flower2.setPrice(20.0);
        flower3.setPrice(25.0);

        pack1.setFlower(flower1);
        pack1.setAmount(100);
        pack2.setFlower(flower2);
        pack2.setAmount(200);
        pack3.setFlower(flower3);
        pack3.setAmount(300);

        bucket1.addPack(pack1);
        bucket1.addPack(pack2);
        bucket1.addPack(pack3);

        bucket2.addPack(pack3);

        store.addBucket(bucket1);
        store.addBucket(bucket2);

    }

    @Test
    void search() {
        assertEquals(0,store.search(750));

    }
}