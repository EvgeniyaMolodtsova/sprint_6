import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class TestLion {

    @Mock
    Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);

        feline.getKittens();
        Mockito.verify(feline).getKittens();

        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(feline.getKittens(), 1);
        Assert.assertEquals(lion.getKittens(), 1);

        Mockito.when(feline.getKittens()).thenReturn(189);
        Assert.assertEquals(feline.getKittens(), 1);
        Assert.assertEquals(lion.getKittens(), 1);
    }


    @Test
    public void checkLionEatMeat() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        List<String>  noFood = List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        feline.eatMeat();
        Mockito.verify(feline).eatMeat();

        Mockito.when(feline.eatMeat()).thenReturn(food);
        Assert.assertEquals(feline.eatMeat(), food);
        Assert.assertEquals(lion.getFood(), food);

        Mockito.when(feline.eatMeat()).thenReturn(noFood);
        Assert.assertEquals(feline.eatMeat(), food);
        Assert.assertEquals(lion.getFood(), food);
    }
}

