            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import java.util.TreeMap;
            
            public abstract class lIolIIooo0 {
                public static Oi1oO0O0 I00000oIO(OlilI1O olilI1O) {
                    Oi1oO0O0 oi1oO0O0;
/* 1 */             String strI00OOll1 = olilI1O.I00OOll1();
/* 5 */             int iI00IOO = olilI1O.I00IOO();
/* 9 */             TreeMap treeMap = Oi1oO0O0.I00ioIO;
                    synchronized (treeMap) {
/* 16 */                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(iI00IOO));
/* 20 */                if (entryCeilingEntry != null) {
/* 26 */                    treeMap.remove(entryCeilingEntry.getKey());
/* 33 */                    oi1oO0O0 = (Oi1oO0O0) entryCeilingEntry.getValue();
/* 35 */                    oi1oO0O0.I00iOIl = strI00OOll1;
/* 37 */                    oi1oO0O0.I00io1l = iI00IOO;
                        } else {
/* 46 */                    oi1oO0O0 = new Oi1oO0O0();
/* 49 */                    int i = iI00IOO + 1;
/* 53 */                    oi1oO0O0.I00ilO0 = new int[i];
/* 57 */                    oi1oO0O0.I00iiI = new long[i];
/* 61 */                    oi1oO0O0.I00iiO = new double[i];
/* 65 */                    oi1oO0O0.I00iio = new String[i];
/* 69 */                    oi1oO0O0.I00ilI0I1 = new byte[i][];
/* 71 */                    VarHandle.storeStoreFence();
/* 74 */                    oi1oO0O0.I00iOIl = strI00OOll1;
/* 76 */                    oi1oO0O0.I00io1l = iI00IOO;
                        }
                    }
/* 80 */            IllOIIOooolo illOIIOooolo = new IllOIIOooolo();
/* 83 */            illOIIOooolo.I00iiI = oi1oO0O0;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            olilI1O.I00iOIl(illOIIOooolo);
/* 91 */            return oi1oO0O0;
                }
            }
