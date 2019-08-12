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

    @Test
    public void should_return_itemWithDoubleDegradesQualityMinus1SellIn_when_call_updateQuality_given_0SellIn3QualityNormalGood() {
        Item normalGood = new Item("Normal Good", 0, 3);
        Item[] items = {normalGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Normal Good, -1, 1", normalGood.toString());
    }

    @Test
    public void should_return_itemWithOneIncreaseQualityMinus1SellIn_when_call_updateQuality_given_3SellIn25QualityAgeBrieGood() {
        Item normalGood = new Item("Aged Brie", 3, 25);
        Item[] items = {normalGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Aged Brie, 2, 26", normalGood.toString());
    }
}