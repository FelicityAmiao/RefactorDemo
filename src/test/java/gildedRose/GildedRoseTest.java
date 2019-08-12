package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_itemWithDegradesByOneDay_when_call_updateQuality_given_normal_good() {
        Item normalGood = new Item("Normal Good", 4, 3);
        Item[] items = {normalGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Normal Good, 3, 2", normalGood.toString());
    }
}