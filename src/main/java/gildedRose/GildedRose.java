package gildedRose;

public class GildedRose {
    Item[] items;
    int i = 0;
    DealItem dealItem;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void setDealItem(DealItem dealItem) {
        this.dealItem = dealItem;
    }

    public void updateQuality() {
        for (; i < items.length; i++) {
            dealItem.dealItem();
        }
    }

    protected boolean isSellInOverDue() {
        return items[i].sellIn < 0;
    }

    protected boolean isBackstagePassesSellInLessThanSix() {
        return items[i].sellIn < 6;
    }

    protected boolean isBackstagePassesSellInLessThan11() {
        return items[i].sellIn < 11;
    }

    protected void Decrese1SellIn() {
        items[i].sellIn = items[i].sellIn - 1;
    }

    protected boolean isQualityCeilValid() {
        return items[i].quality < 50;
    }

    protected boolean isQualityFloorValid() {
        return items[i].quality > 0;
    }

    protected void setQuality0() {
        items[i].quality = 0;
    }

    protected void increase1Quality() {
        items[i].quality = items[i].quality + 1;
    }

    protected void decrese1Quality() {
        items[i].quality = items[i].quality - 1;
    }

    private boolean isSpecifiedItem(String itemName) {
        return items[i].name.equals(itemName);
    }
}