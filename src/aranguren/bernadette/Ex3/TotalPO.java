package aranguren.bernadette.Ex3;

public class TotalPO {

        public static void main (String[] args){

            ItemEx3 supplies = new ItemEx3(23, "cream bowl", 25.4, "EA");

            PurchaseOrderEx3 PO = new PurchaseOrderEx3(2, 2314);

            System.out.println("PO NUMBER       : " + PO.getPoNumber());
            System.out.println("ITEM            : " + supplies.getItemname());
            System.out.println("QUANTITY        : " + PO.getQuantity());
            System.out.println("UNIT OF MEASURE : " + supplies.getUom() + "\n");

            System.out.println("YOUR ORDER IS:");
            System.out.println("ITEM ID          : " + supplies.getItemID());
            System.out.println("PRICE PER UNIT   : " + "PHP " + supplies.getPrice() + "\n");

            System.out.println("TOTAL PRICE      : " + "PHP " + supplies.getPrice()*PO.getQuantity());

        }
    }



