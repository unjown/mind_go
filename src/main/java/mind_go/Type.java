package mind_go;

import arc.struct.ObjectMap;
import mindustry.content.UnitTypes;
import mindustry.type.UnitType;

public class Type {

    public static int tier = 1;
    public static ObjectMap<Class, UnitType[]> map = new ObjectMap<>();

    public static void init() {
        map.put(Class.Main, new UnitType[]{UnitTypes.dagger, UnitTypes.mace, UnitTypes.fortress, UnitTypes.scepter, UnitTypes.reign});
        map.put(Class.Spiders, new UnitType[]{UnitTypes.crawler, UnitTypes.atrax, UnitTypes.spiroct, UnitTypes.arkyid, UnitTypes.toxopid});
        map.put(Class.Support, new UnitType[]{UnitTypes.nova, UnitTypes.pulsar, UnitTypes.quasar, UnitTypes.vela, UnitTypes.corvus});
        map.put(Class.Naval, new UnitType[]{UnitTypes.risso, UnitTypes.minke, UnitTypes.bryde, UnitTypes.sei, UnitTypes.omura});
        map.put(Class.Air, new UnitType[]{UnitTypes.flare, UnitTypes.horizon, UnitTypes.zenith, UnitTypes.antumbra, UnitTypes.eclipse});
        // mono, oct unplayable bruh
        map.put(Class.AirSupport, new UnitType[]{UnitTypes.mega, UnitTypes.poly, UnitTypes.mega, UnitTypes.quad, UnitTypes.quad});
    }

    public static UnitType get(Class class1) {
        return map.get(class1)[tier];
    }
}
