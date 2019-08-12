package gildedRose;

public class AgedBrieItem extends DealItem{

    public AgedBrieItem(GildedRose gildedRose) {
        super(gildedRose);
    }

    @Override
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
