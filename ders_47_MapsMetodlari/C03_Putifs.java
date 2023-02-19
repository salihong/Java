package ders_47_MapsMetodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_Putifs {
    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        if (mp1.containsKey("C")){
            mp1.put("C", mp1.get("C")+3);
            System.out.println(mp1);

            mp1.computeIfPresent("B",(k,v)->2*v);
            mp1.computeIfPresent("A",(k,v)->v-5);
            System.out.println(mp1);

            mp1.putIfAbsent("P",7);
            mp1.computeIfAbsent("Z",v->1);
            if (!mp1.containsKey("D")){
                mp1.put("D",11);



            }
            System.out.println(mp1);

        }
    }
}
