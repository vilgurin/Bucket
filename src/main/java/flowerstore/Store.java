package flowerstore;
import java.util.ArrayList;
import java.util.List;
public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    List<FlowerBucket> foundFlowers = new ArrayList<FlowerBucket>();

    public void addBucket(FlowerBucket bucket){
        flowerBuckets.add(bucket);
    }

    public int search(double desiredPrice){
        for (int i = 0; i<flowerBuckets.size();i++){
            FlowerBucket sBucket = flowerBuckets.get(i);
            if (sBucket.getPrice() == desiredPrice){
                foundFlowers.add(sBucket);
            }
        }
        if (foundFlowers.size() == 0){
            return 0;
        }
        return 1;
    }
}
