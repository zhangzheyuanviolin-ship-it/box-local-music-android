            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OiIl0oI {
                public static final OlO1iIi1ol0 I00000oIO = new OlO1iIi1ol0(new Oi1O00OI(7));

                public static final OiIl0IIi0 I00000oIO(Map map, Function1 function1) {
                    OI10I1IoI0Ol oI10I1IoI0Ol;
/* 3 */             OiIl0IIi0 oiIl0IIi0 = new OiIl0IIi0();
/* 6 */             oiIl0IIi0.I00iOIl = function1;
/* 8 */             if (map == null || map.isEmpty()) {
/* 58 */                oI10I1IoI0Ol = null;
                    } else {
/* 23 */                oI10I1IoI0Ol = new OI10I1IoI0Ol(map.size());
/* 38 */                for (Map.Entry entry : map.entrySet()) {
/* 54 */                    oI10I1IoI0Ol.I000lI(entry.getKey(), entry.getValue());
                        }
                    }
/* 59 */            oiIl0IIi0.I00iiI = oI10I1IoI0Ol;
/* 61 */            VarHandle.storeStoreFence();
/* 106 */           return oiIl0IIi0;
                }
            }
