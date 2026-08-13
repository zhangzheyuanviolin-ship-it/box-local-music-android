            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class Oii0OIi11oli {
                public static final Oii0OIi11oli I00000oOI;
                public HashMap I00000oIO;

                static {
/* 3 */             Oii0OIi11oli oii0OIi11oli = new Oii0OIi11oli();
/* 8 */             HashMap map = new HashMap();
/* 11 */            oii0OIi11oli.I00000oIO = map;
/* 15 */            HashMap map2 = new HashMap();
/* 26 */            if (map.containsKey("Standard")) {
/* 66 */                I000II.I001IO000("The security handler name is already registered");
/* 113 */               return;
                    }
/* 30 */            map.put("Standard", OlIlo1.class);
/* 35 */            map2.put(OlIlo0iio0.class, OlIlo1.class);
/* 44 */            if (map.containsKey("Adobe.PubSec")) {
/* 62 */                I000II.I001IO000("The security handler name is already registered");
/* 65 */                return;
                    }
/* 48 */            map.put("Adobe.PubSec", OOiiO0ooIII.class);
/* 53 */            map2.put(OOiiO01O1lo.class, OOiiO0ooIII.class);
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            I00000oOI = oii0OIi11oli;
                }
            }
