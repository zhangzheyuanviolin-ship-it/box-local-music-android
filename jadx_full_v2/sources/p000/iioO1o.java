            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iioO1o {
                public static final void I00000oIO(Oiill0lI1il1 oiill0lI1il1, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-954926513);
/* 16 */            int i2 = i | (iloI0lOlll1.I000OOo1O(oiill0lI1il1) ? 4 : 2);
/* 21 */            int i3 = 1;
/* 33 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 37 */                iiOolOooOi.I00000oIO(oiill0lI1il1, iOii1l, iloI0lOlll1, i2 & 126);
                    } else {
/* 41 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 44 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 48 */            if (oOloioIlI001IO000 != null) {
/* 52 */                IOi0i1lli1oo iOi0i1lli1oo = new IOi0i1lli1oo(i3);
/* 55 */                iOi0i1lli1oo.I00iiI = oiill0lI1il1;
/* 57 */                iOi0i1lli1oo.I00iiO = iOii1l;
/* 59 */                VarHandle.storeStoreFence();
/* 62 */                oOloioIlI001IO000.I0000O = iOi0i1lli1oo;
                    }
                }

                public static final void I00000oOI(Oo0IOoOi01 oo0IOoOi01, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(2080741862);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(oo0IOoOi01) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 59 */                iiOolOooOi.I00000oOI(oo0IOoOi01, iOii1l, iloI0lOlll1, i2 & 126);
                    } else {
/* 63 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 66 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 70 */            if (oOloioIlI001IO000 != null) {
/* 74 */                IOi0i1il iOi0i1il = new IOi0i1il(1);
/* 77 */                iOi0i1il.I00iiI = oo0IOoOi01;
/* 79 */                iOi0i1il.I00iiO = iOii1l;
/* 81 */                iOi0i1il.I00iio = i;
/* 83 */                VarHandle.storeStoreFence();
/* 86 */                oOloioIlI001IO000.I0000O = iOi0i1il;
                    }
                }
            }
