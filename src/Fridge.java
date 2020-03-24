public class Fridge extends Product {
    private int liter;
    private boolean freezer;
    public Fridge(String name, String description, double price,int liter,boolean freezer) {
        super(name, description, price);
        this.liter=liter;
        this.freezer=freezer;
    }

    public int getLitter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }

    @Override
    public void look(){
        super.look();
        System.out.println("mon contenant est de "+  this.liter + " l'indicateur congélateur est a  " + this.freezer);
    }
}
