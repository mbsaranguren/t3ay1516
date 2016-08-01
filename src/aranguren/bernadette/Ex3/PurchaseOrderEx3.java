package aranguren.bernadette.Ex3;

public class PurchaseOrderEx3 {
    private int poNumber;
    private int quantity;

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public PurchaseOrderEx3(int quantity, int poNumber) {

        this.quantity = quantity;
        this.poNumber = poNumber;

    }


}