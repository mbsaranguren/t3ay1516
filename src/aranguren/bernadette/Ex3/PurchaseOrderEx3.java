package aranguren.bernadette.Ex3;

public class PurchaseOrderEx3 {
    private int poNumber;
    private String item;

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    private int quantity;
    private String uom;

    public PurchaseOrderEx3(String item, int quantity, int poNumber, String uom) {

        this.item = item;
        this.quantity = quantity;
        this.poNumber = poNumber;
        this.uom = uom;

    }


}