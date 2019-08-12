package gildedRose;

public class NormalGood {
    private GildedRose gildedRose;

    public NormalGood(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

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
