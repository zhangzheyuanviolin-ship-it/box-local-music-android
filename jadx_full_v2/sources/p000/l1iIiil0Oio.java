            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l1iIiil0Oio {
                public static final void I00000oIO(boolean z, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1818896922);
/* 28 */            int i2 = i | (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16);
/* 33 */            if ((i2 & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 42 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 48 */                lIII1O.I00000oIO(z, illiIl1l11O, iloI0lOlll1, i2 & 126);
                    }
/* 51 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 55 */            if (oOloioIlI001IO000 != null) {
/* 60 */                I1loOO i1loOO = new I1loOO(1);
/* 63 */                i1loOO.I00iiI = z;
/* 65 */                i1loOO.I00iiO = illiIl1l11O;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                oOloioIlI001IO000.I0000O = i1loOO;
                    }
                }
            }
