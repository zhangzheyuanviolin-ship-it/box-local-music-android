            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class l1ioii1I10Io {
                public static boolean I00000oIO(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static Iol01110 I00000oOI(Object obj) {
/* 4 */             Iol01110 iol01110 = new Iol01110(1);
/* 7 */             iol01110.I00iiO = obj;
/* 14 */            iol01110.I00iiI = new ArrayList();
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return iol01110;
                }
            }
