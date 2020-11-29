package Part_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Possible materials for separation. Includes information about the bin position
 * where separated material goes.
 */
public enum Material {
    PAPER("papir", 0),
    GLASS("sklo", 1),
    BIO("bio", 2),
    PLASTIC("plast", 3),
    UNDEFINED("",-1);

    private String name;
    private int binPosition;

    Material(String name, int position) {
        this.name = name;
        this.binPosition = position;
    }

    public int getPosition() {
        return binPosition;
    }

    // create lookup table for reverse searching
    private static final Map<String, Material> lookup = new HashMap<>();

    static {
        for (Material material : Material.values()) {
            lookup.put(material.name, material);
        }
    }

    public static Material get(String name) {
        if (lookup.containsKey(name)) return lookup.get(name);
        return Material.UNDEFINED;
    }
}
