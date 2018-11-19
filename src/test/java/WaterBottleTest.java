import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }


    //    test value of volume at start (expect 100)
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }


//    test value of volume after drinking - each drink decreases by 10
    @Test
    public void drinkingDecreasesVolumeBy10(){
        assertEquals(90, waterBottle.drink());
    }

//    only drink what remains if volume < 10
    @Test
    public void dontDrinkLessThan10(){
        WaterBottle lowWater = new WaterBottle(5);
        assertEquals(5, lowWater.drink());
    }

// shouldn't drink if value is < 0
    @Test
    public void DontDrinkIf0(){
        WaterBottle emptyBottle = new WaterBottle(0);
        assertEquals(0,emptyBottle.drink());
    }

//    empty and test value is 0
    @Test
    public void emptyWaterBottle(){
        assertEquals(0, waterBottle.empty());
    }


    @Test
    public void emptyLessThanFullBottle(){
//        waterBottle.drink();
        WaterBottle lowWater = new WaterBottle(5);
        assertEquals(0, lowWater.empty());
    }


//    fill and test value is 100
    @Test
    public void fillWaterBottle(){
        assertEquals(100, waterBottle.fill());
    }


    @Test
    public void fillLessFullWaterBottle(){
        WaterBottle lowWater = new WaterBottle(55);
        assertEquals(100, lowWater.fill());
    }


}
