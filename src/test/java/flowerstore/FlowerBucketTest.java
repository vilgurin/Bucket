package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    FlowerBucket bucket;
    FlowerPack pack1;
    FlowerPack pack2;
    Flower flower;
    Flower flower1;

    @BeforeEach
    void setUp() {
        pack1 = new FlowerPack();
        flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(10.0);
        flower.setSepalLength(5.0);

        pack1.setFlower(flower);
        pack1.setAmount(100);

        pack2 = new FlowerPack();
        flower1 = new Flower();
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setPrice(10.0);
        flower1.setSepalLength(5.0);

        pack2.setFlower(flower1);
        pack2.setAmount(100);

        bucket = new FlowerBucket();
        bucket.addPack(pack1);
        bucket.addPack(pack2);
    }

    @Test
    void add() {
        assertEquals(2,bucket.getSize());
    }

    @Test
    void getPrice() {
        assertEquals(2000.0,bucket.getPrice());
    }
}