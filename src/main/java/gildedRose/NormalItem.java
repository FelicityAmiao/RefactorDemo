package gildedRose;

public class NormalItem extends DealItem{

    public NormalItem(GildedRose gildedRose) {
        super(gildedRose);
    }

    @Override
    public void dealItem() {
        gildedRose.Decrese1SellIn();
        if (gildedRose.isQualityFloorValid()) {
            gildedRose.decrese1Quality();
            if (gildedRose.isSellInOverDue()) {
                gildedRose.decrese1Quality();
            }
        }
    }
}
