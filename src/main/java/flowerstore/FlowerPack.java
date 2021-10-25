package flowerstore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlowerPack {
    private Flower flower;
    private int amount;


    public double getPrice(){
        return flower.getPrice() * amount;
    }
}