package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    FlowerPack pack1;
    FlowerPack pack2;

    @BeforeEach
    void setUp() {

        pack1 = new FlowerPack();
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(10.0);
        flower.setSepalLength(5.0);

        pack1.setFlower(flower);
        pack1.setAmount(100);


    }

    @Test
    void getPrice() {
        assertEquals(1000.0,pack1.getPrice());
    }

    @Test
    void getAmount() {
        assertEquals(100,pack1.getAmount());
    }

    @Test
    void getSepalLength() {
        assertEquals(5.0,pack1.getFlower().getSepalLength());
    }

//    @Test
//    void getsmth(){
//        assertEquals(2,pack1.getFlower());
//    }
}