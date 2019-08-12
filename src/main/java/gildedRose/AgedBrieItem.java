package gildedRose;

public class AgedBrieItem {
    private GildedRose gildedRose;

    public AgedBrieItem(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

    void dealItem() {
        if (gildedRose.isQualityCeilValid()) {
            gildedRose.increase1Quality();
        }
        gildedRose.Decrese1SellIn();
        if (gildedRose.isSellInOverDue() && gildedRose.isQualityCeilValid()) {
            gildedRose.increase1Quality();
        }
    }
}
