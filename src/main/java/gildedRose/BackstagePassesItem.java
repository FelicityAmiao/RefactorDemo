package gildedRose;

public class BackstagePassesItem {
    private GildedRose gildedRose;

    public BackstagePassesItem(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

    public void dealItem() {
        if (gildedRose.isQualityCeilValid()) {
            gildedRose.increase1Quality();
            if (gildedRose.isBackstagePassesSellInLessThan11()) {
                if (gildedRose.isQualityCeilValid()) {
                    gildedRose.increase1Quality();
                }
            }
            if (gildedRose.isBackstagePassesSellInLessThanSix()) {
                if (gildedRose.isQualityCeilValid()) {
                    gildedRose.increase1Quality();
                }
            }
        }
        gildedRose.Decrese1SellIn();
        if (gildedRose.isSellInOverDue()) {
            gildedRose.setQuality0();
        }
    }
}
