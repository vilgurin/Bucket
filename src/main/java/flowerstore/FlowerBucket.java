package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();


    public void addPack(FlowerPack pack){
        flowerPacks.add(pack);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    public int getSize(){
        return flowerPacks.size();
    }
}


