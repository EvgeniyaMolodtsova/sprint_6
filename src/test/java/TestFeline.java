import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.Random;

public class TestFeline {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(feline.eatMeat(), food);
    }

    @Test
    public void checkEatMeatNegative() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of();

        Assert.assertNotEquals(feline.eatMeat(), food);
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();

        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void checkGetFamilyNegative() {
        Feline feline = new Feline();

        Assert.assertNotEquals(feline.getFamily(), "");
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();

        Assert.assertEquals(feline.getKittens(), 1);
    }

    @Test
    public void checkGetKittensNegative() {
        Feline feline = new Feline();

        Assert.assertNotEquals(feline.getKittens(), 3);
    }

    @Test
    public void checkGetKittensCount() {
        Feline feline = new Feline();
        Random rand = new Random();
        int count = rand.nextInt(100);

        Assert.assertEquals(feline.getKittens(count), count);
    }
}
