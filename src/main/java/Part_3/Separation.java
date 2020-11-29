package Part_3;

import java.util.ArrayList;
import java.util.List;

public class Separation {
    private static final int NUMBER_OF_BINS = Material.values().length - 1;

    /**
     * Separate list of things into separation bins according to their material
     * or materials. Position of bins is determined by the Material enum.
     * @param things
     * @return
     */
    public List<List<String>> separate(List<Thing> things) {
        List<List<String>> bins = new ArrayList<>();
        for (int i = 1; i <= NUMBER_OF_BINS; i++) bins.add(new ArrayList<String>());

        for (Thing thing : things) {
            Material material = thing.getMaterial();
            Material material2 = thing.getMaterial2();

            if (!material.equals(Material.UNDEFINED)) {
                bins.get(material.getPosition()).add(thing.getType());
            }
            if (!material2.equals(Material.UNDEFINED)) {
                bins.get(material2.getPosition()).add(thing.getType());
            }
        }

        return bins;
    }
}
