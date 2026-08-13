            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOOloioiO {
                public static final void I00000oIO(boolean z, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-1339183247);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 43 */            int i3 = 0;
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 59 */                iOOloIo.I00000oIO(i2 & 126, 0, illOOo00lI, iloI0lOlll1, z);
                    } else {
/* 63 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 66 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 70 */            if (oOloioIlI001IO000 != null) {
/* 74 */                I1loOIIo0ii1 i1loOIIo0ii1 = new I1loOIIo0ii1(i3);
/* 77 */                i1loOIIo0ii1.I00iiI = z;
/* 79 */                i1loOIIo0ii1.I00iio = illOOo00lI;
/* 81 */                i1loOIIo0ii1.I00iiO = i;
/* 83 */                VarHandle.storeStoreFence();
/* 86 */                oOloioIlI001IO000.I0000O = i1loOIIo0ii1;
                    }
                }

                public static final void I00000oOI(boolean z, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1437916225);
/* 28 */            int i2 = i | (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16);
/* 33 */            int i3 = 0;
/* 45 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 49 */                lIII1O.I00000oIO(z, illiIl1l11O, iloI0lOlll1, i2 & 126);
                    } else {
/* 53 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 56 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 60 */            if (oOloioIlI001IO000 != null) {
/* 64 */                I1loOO i1loOO = new I1loOO(i3);
/* 67 */                i1loOO.I00iiI = z;
/* 69 */                i1loOO.I00iiO = illiIl1l11O;
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                oOloioIlI001IO000.I0000O = i1loOO;
                    }
                }
            }
