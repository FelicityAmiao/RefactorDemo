package gildedRose;

public abstract class DealItem {

    protected GildedRose gildedRose;

    public DealItem(GildedRose gildedRose) {
        this.gildedRose = gildedRose;
    }

    abstract void dealItem();
}
