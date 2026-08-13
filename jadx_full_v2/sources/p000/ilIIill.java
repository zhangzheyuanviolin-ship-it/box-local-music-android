            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class ilIIill {
                public static final void I00000oIO(String str, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    IllOOo00lI illOOo00lI2;
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(-140809211);
/* 16 */            int i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
/* 19 */            if ((i & 48) == 0) {
/* 32 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 49 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 53 */                Il0oOOll1 il0oOOll1 = new Il0oOOll1(0);
/* 56 */                il0oOOll1.I00iiO = str;
/* 58 */                il0oOOll1.I00iiI = illOOo00lI;
/* 60 */                VarHandle.storeStoreFence();
/* 78 */                illOOo00lI2 = illOOo00lI;
/* 79 */                iloI0lOlll12 = iloI0lOlll1;
/* 80 */                iOIlI11IO.I00000oIO(illOOo00lI2, null, iiioOl1O.I00000oOI(-1974812722, il0oOOll1, iloI0lOlll1), iloI0lOlll12, ((i2 >> 3) & 14) | 384, 2);
                    } else {
/* 84 */                illOOo00lI2 = illOOo00lI;
/* 85 */                iloI0lOlll12 = iloI0lOlll1;
/* 86 */                iloI0lOlll12.I00OilO00Il();
                    }
/* 89 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 93 */            if (oOloioIlI001IO000 != null) {
/* 99 */                I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(13);
/* 102 */               i0O0llIiIlOO.I00iio = str;
/* 104 */               i0O0llIiIlOO.I00iiO = illOOo00lI2;
/* 106 */               i0O0llIiIlOO.I00iiI = i;
/* 108 */               VarHandle.storeStoreFence();
/* 111 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }
            }
