package gildedRose;

public class GildedRose {
    Item[] items;
    int i = 0;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (; i < items.length; i++) {
            if (!isSpecifiedItem("Aged Brie")
                    && !isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
                if (isQualityFloorValid()) {
                    if (!isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                        if (isSpecifiedItem("Conjured Good")) {
                            decrese1Quality();
                        }
                        decrese1Quality();
                    }
                }
            } else {
                if (isQualityCeilValid()) {
                    increase1Quality();

                    if (isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
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
                }
            }

            if (!isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                Decrese1SellIn();
            }

            if (items[i].sellIn < 0) {
                if (!isSpecifiedItem("Aged Brie")) {
                    if (!isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
                        if (isQualityFloorValid()) {
                            if (!isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                                if (isSpecifiedItem("Conjured Good")) {
                                    decrese1Quality();
                                }
                                decrese1Quality();
                            }
                        }
                    } else {
                        setQuality0();
                    }
                } else {
                    if (isQualityCeilValid()) {
                        increase1Quality();
                    }
                }
            }
        }
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