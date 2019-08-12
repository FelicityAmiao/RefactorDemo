package gildedRose;

public class AgedBrieItem extends DealItem {

    public AgedBrieItem(GildedRose gildedRose) {
        super(gildedRose);
    }

    @Override
    void dealItem() {
        gildedRose.Decrese1SellIn();
        if (gildedRose.isQualityCeilValid()) {
            gildedRose.increase1Quality();
            if (gildedRose.isSellInOverDue()) gildedRose.increase1Quality();
        }
    }
}
