            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Iol0oOO {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new Iloi111(16));

                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO) {
/* 1 */             if (iol100iI0lO == null) {
/* 3 */                 return o1ooiI111i;
                    }
/* 6 */             Iol0olIoO iol0olIoO = new Iol0olIoO();
/* 9 */             iol0olIoO.I00000oIO = oI0lOIiOIOOo;
/* 11 */            iol0olIoO.I00000oOI = iol100iI0lO;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            return o1ooiI111i.I0000O(iol0olIoO);
                }
            }
