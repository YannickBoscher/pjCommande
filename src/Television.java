public class Television extends Product{
    private int size;
    private String slabType;
    public Television(String name, String description, double price,int size,String slabtype) {
        super(name, description, price);
        this.size=size;
        this.slabType=slabtype;
    }

    public int getSize() {
        return size;
    }

    public String getSlabtype() {
        return slabType;
    }

    @Override
    public void look() {
        super.look();
        System.out.println("la taille de l'ecran est de " + this.size + " et le slabtype est " + this.slabType);
    }
}
