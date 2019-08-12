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
                if (items[i].quality > 0) {
                    if (!isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                        if (isSpecifiedItem("Conjured Good")) {
                            decrese1Quality();
                        }
                        decrese1Quality();
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    increase1Quality();

                    if (isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                increase1Quality();
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                increase1Quality();
                            }
                        }
                    }
                }
            }

            if (!isSpecifiedItem("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isSpecifiedItem("Aged Brie")) {
                    if (!isSpecifiedItem("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
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
                    if (items[i].quality < 50) {
                        increase1Quality();
                    }
                }
            }
        }
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