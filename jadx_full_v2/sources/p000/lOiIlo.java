            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public abstract class lOiIlo {
                public static OliiillO I00000oIO(OliiillO oliiillO) {
/* 3 */             if ((oliiillO instanceof Oliil11I1iO) || (oliiillO instanceof Oliil01)) {
/* 9 */                 return oliiillO;
                    }
/* 12 */            if (oliiillO instanceof Serializable) {
/* 16 */                Oliil01 oliil01 = new Oliil01();
/* 24 */                oliil01.I00iOIl = new Object();
/* 26 */                oliiillO.getClass();
/* 29 */                oliil01.I00iiI = oliiillO;
/* 31 */                VarHandle.storeStoreFence();
/* 34 */                return oliil01;
                    }
/* 37 */            Oliil11I1iO oliil11I1iO = new Oliil11I1iO();
/* 45 */            oliil11I1iO.I00iOIl = new Object();
/* 47 */            oliiillO.getClass();
/* 50 */            oliil11I1iO.I00iiI = oliiillO;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            return oliil11I1iO;
                }

                public static Oliil1oo1Io I00000oOI(Object obj) {
/* 3 */             Oliil1oo1Io oliil1oo1Io = new Oliil1oo1Io();
/* 6 */             oliil1oo1Io.I00iOIl = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oliil1oo1Io;
                }
            }
