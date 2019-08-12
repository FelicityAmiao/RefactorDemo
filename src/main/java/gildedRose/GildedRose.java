package gildedRose;

public class GildedRose {
    Item[] items;
    int i = 0;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (; i < items.length; i++) {
            if (isSpecifiedItem("Aged Brie")) {
                dealAgedBrieGood();
                return;
            }
            if (isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
                dealBackstageGood();
                return;
            }
            if (isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                return;
            }
            if (isSpecifiedItem("Conjured Good")) {
                dealConjuredGood();
                return;
            }
            Decrese1SellIn();
            if (isQualityFloorValid()) {
                decrese1Quality();
                if (isSellInOverDue()) {
                    decrese1Quality();
                }
            }
        }
    }

    private void dealConjuredGood() {
        Decrese1SellIn();
        if(isQualityFloorValid()) {
            decrese1Quality();
            decrese1Quality();
        }
        if (isSellInOverDue()) {
            decrese1Quality();
            decrese1Quality();
        }
    }

    private void dealBackstageGood() {
        if (isQualityCeilValid()) {
            increase1Quality();
            if (isBackstagePassesSellInLessThan11()) {
                if (isQualityCeilValid()) {
                    increase1Quality();
                }
            }
            if (isBackstagePassesSellInLessThanSix()) {
                if (isQualityCeilValid()) {
                    increase1Quality();
                }
            }
        }
        Decrese1SellIn();
        if (isSellInOverDue()) {
            setQuality0();
        }
        return;
    }

    private void dealAgedBrieGood() {
        if (isQualityCeilValid()) {
            increase1Quality();
        }
        Decrese1SellIn();
        if (isSellInOverDue() && isQualityCeilValid()) {
            increase1Quality();
        }
        return;
    }

    private boolean isSellInOverDue() {
        return items[i].sellIn < 0;
    }

    private boolean isBackstagePassesSellInLessThanSix() {
        return items[i].sellIn < 6;
    }

    private boolean isBackstagePassesSellInLessThan11() {
        return items[i].sellIn < 11;
    }

    private void Decrese1SellIn() {
        items[i].sellIn = items[i].sellIn - 1;
    }

    private boolean isQualityCeilValid() {
        return items[i].quality < 50;
    }

    private boolean isQualityFloorValid() {
        return items[i].quality > 0;
    }

    private void setQuality0() {
        items[i].quality = 0;
    }

    private void increase1Quality() {
        items[i].quality = items[i].quality + 1;
    }

    private void decrese1Quality() {
        items[i].quality = items[i].quality - 1;
    }

    private boolean isSpecifiedItem(String itemName) {
        return items[i].name.equals(itemName);
    }
}