package flowerstore;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class FlowerMain {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];

        int[] color = {127, 0, 0};

        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].SetColor(color);
        }

    }
}