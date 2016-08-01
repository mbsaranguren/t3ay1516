package aranguren.bernadette.Ex3;


public class ItemEx3 {
    private int itemID;
    private String itemname;
    private double price;
    private String uom;

    public ItemEx3(int itemID, String itemname, double price, String uom) {
        this.itemID = itemID;
        this.itemname = itemname;
        this.price = price;
        this.uom = uom;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }




    }






