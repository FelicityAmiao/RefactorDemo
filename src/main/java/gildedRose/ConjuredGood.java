package gildedRose;

public class ConjuredGood {
    private GildedRose gildedRose;

    public ConjuredGood(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

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
