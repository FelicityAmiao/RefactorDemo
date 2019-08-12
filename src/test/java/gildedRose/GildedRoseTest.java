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
        Item agedBrieGood = new Item("Aged Brie", 3, 25);
        Item[] items = {agedBrieGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Aged Brie, 2, 26", agedBrieGood.toString());
    }

    @Test
    public void should_return_itemWithOneIncreaseQualityMinus1SellIn_when_call_updateQuality_given_0SellIn25QualityAgeBrieGood() {
        Item agedBrieGood = new Item("Aged Brie", 0, 25);
        Item[] items = {agedBrieGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Aged Brie, -1, 27", agedBrieGood.toString());
    }

    @Test
    public void should_return_itemWithoutChange_when_call_updateQuality_given_20SellIn80QualitySulfurasGood() {
        Item sulfurasGood = new Item("Sulfuras, Hand of Ragnaros", 20, 80);
        Item[] items = {sulfurasGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 20, 80", sulfurasGood.toString());
    }

    @Test
    public void should_return_itemNormalIncreaseQuality_when_call_updateQuality_given_20SellIn30QualityBackstagePassesGood() {
        Item backstagePassesGood = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 30);
        Item[] items = {backstagePassesGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 19, 31", backstagePassesGood.toString());
    }
}