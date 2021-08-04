import java.util.ArrayList;
import java.util.List;

public class Icecream {
    private List<Flavor> flavors;
    private int flavorCount;

    public Icecream() {
        this.flavors = new ArrayList<>();
        this.flavorCount = 0;
    }

    public void addScoop(Flavor flavor) {
        if (!this.contains(flavor.getName())) flavorCount += 1;
        this.flavors.add(flavor);
    }

    public void removeScoop() {
        if (this.flavors.size() == 0) return;
        Flavor top = this.flavors.get(this.flavors.size() - 1);
        this.flavors.remove(this.flavors.size() - 1);
        if (!this.contains(top.getName())) flavorCount -= 1;
    }

    public int getScoopCount() {
        return this.flavors.size();
    }

    public boolean contains(String name) {
        for (Flavor flavor : this.flavors)
            if (flavor.getName().equals(name))
                return true;
        return false;
    }

    public int getFlavorCount() {
        return this.flavorCount;
    }
}
