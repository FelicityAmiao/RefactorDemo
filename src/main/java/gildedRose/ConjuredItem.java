package gildedRose;

public class ConjuredItem extends DealItem{

    public ConjuredItem(GildedRose gildedRose) {
        super(gildedRose);
    }

    @Override
    public void dealItem() {
        gildedRose.Decrese1SellIn();
        if(gildedRose.isQualityFloorValid()) {
            gildedRose.decrese1Quality();
            gildedRose.decrese1Quality();
        }
        if (gildedRose.isSellInOverDue()) {
            gildedRose.decrese1Quality();
            gildedRose.decrese1Quality();
        }
    }
}
