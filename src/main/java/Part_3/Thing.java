package Part_3;

/**
 * Represents things that go inside separation bins.
 */
public class Thing {
    private String type;
    private Material material;
    private Material material2 = Material.UNDEFINED;

    public Thing(String type, String material, String material2) {
        this.type = type;
        this.material = Material.get(material);
        this.material2 = Material.get(material2);
    }
    public Thing(String type, String material) {
        this.type = type;
        this.material = Material.get(material);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = Material.get(material);
    }

    public Material getMaterial2() {
        return material2;
    }

    public void setMaterial2(String material2) {
        this.material2 = Material.get(material2);
    }
}
