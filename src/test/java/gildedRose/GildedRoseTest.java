package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_itemWithDegradesByOneDay_when_call_updateQuality_given_normal_good() {
        Item normalGood = new Item("Normal Good", 4, 3);
        Item[] items = {normalGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new NormalItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Normal Good, 3, 2", normalGood.toString());
    }

    @Test
    public void should_return_itemWithDoubleDegradesQualityMinus1SellIn_when_call_updateQuality_given_0SellIn3QualityNormalGood() {
        Item normalGood = new Item("Normal Good", 0, 3);
        Item[] items = {normalGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new NormalItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Normal Good, -1, 1", normalGood.toString());
    }

    @Test
    public void should_return_itemWithOneIncreaseQualityMinus1SellIn_when_call_updateQuality_given_3SellIn25QualityAgeBrieGood() {
        Item agedBrieGood = new Item("Aged Brie", 3, 25);
        Item[] items = {agedBrieGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new AgedBrieItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Aged Brie, 2, 26", agedBrieGood.toString());
    }

    @Test
    public void should_return_itemWithOneIncreaseQualityMinus1SellIn_when_call_updateQuality_given_0SellIn25QualityAgeBrieGood() {
        Item agedBrieGood = new Item("Aged Brie", 0, 25);
        Item[] items = {agedBrieGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new AgedBrieItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Aged Brie, -1, 27", agedBrieGood.toString());
    }

    @Test
    public void should_return_itemWithoutChange_when_call_updateQuality_given_20SellIn80QualitySulfurasGood() {
        Item sulfurasGood = new Item("Sulfuras, Hand of Ragnaros", 20, 80);
        Item[] items = {sulfurasGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new SulfurasItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 20, 80", sulfurasGood.toString());
    }

    @Test
    public void should_return_itemNormalIncreaseQuality_when_call_updateQuality_given_20SellIn30QualityBackstagePassesGood() {
        Item backstagePassesGood = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 30);
        Item[] items = {backstagePassesGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new BackstagePassesItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 19, 31", backstagePassesGood.toString());
    }

    @Test
    public void should_return_itemDoubleIncreaseQuality_when_call_updateQuality_given_7SellIn30QualityBackstagePassesGood() {
        Item backstagePassesGood = new Item("Backstage passes to a TAFKAL80ETC concert", 7, 30);
        Item[] items = {backstagePassesGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new BackstagePassesItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 6, 32", backstagePassesGood.toString());
    }

    @Test
    public void should_return_item3IncreaseQuality_when_call_updateQuality_given_5SellIn30QualityBackstagePassesGood() {
        Item backstagePassesGood = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30);
        Item[] items = {backstagePassesGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new BackstagePassesItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 33", backstagePassesGood.toString());
    }

    @Test
    public void should_return_itemReset0Quality_when_call_updateQuality_given_0SellIn30QualityBackstagePassesGood() {
        Item backstagePassesGood = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30);
        Item[] items = {backstagePassesGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new BackstagePassesItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstagePassesGood.toString());
    }

    @Test
    public void should_return_itemDoubleDecreaseQuality_when_call_updateQuality_given_4SellIn3QualityConjuredGood() {
        Item conjuredGood = new Item("Conjured Good", 4, 3);
        Item[] items = {conjuredGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new ConjuredItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Conjured Good, 3, 1", conjuredGood.toString());
    }

    @Test
    public void should_return_item4DecreaseQuality_when_call_updateQuality_given_0SellIn5QualityConjuredGood() {
        Item conjuredGood = new Item("Conjured Good", 0, 5);
        Item[] items = {conjuredGood};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.setDealItem(new ConjuredItem(gildedRose));
        gildedRose.updateQuality();

        assertEquals("Conjured Good, -1, 1", conjuredGood.toString());
    }
}