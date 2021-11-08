package groceries;

public class Item {

    public String name;
    public String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getItemName() {
        return this.name;
    }

    public String getItemCategory() {
        return this.category;
    }
}
