import Part_1.Solution;
import Part_2.YearInfo;
import Part_3.Separation;
import Part_3.Thing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //System.out.println(sol.solution("abc", "bc"));

        YearInfo info = new YearInfo();
        int year = 2015;
        //System.out.println(info.getUnluckyDaysInAYear(year));

        Separation separation = new Separation();
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("jablka", "bio"));
        things.add(new Thing("jogurt", "bio", "plast"));
        things.add(new Thing("lahev_na_vino", "sklo", "papir"));
        things.add(new Thing("krabice", "papir"));
        things.add(new Thing("pivni_lahev", "sklo", "papir"));

        List<List<String>> separationBins = separation.separate(things);
        /*for (List<String> bin : separationBins) {
            String items = bin.stream().collect(Collectors.joining(", ", "[ ", " ]"));
            System.out.println(items);
        }*/
    }
}
