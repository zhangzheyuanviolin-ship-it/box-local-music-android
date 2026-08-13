            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOO0oo0lIIO {
                /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(int i, int i2, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, boolean z) {
                    int i3;
                    boolean z2;
/* 5 */             iloI0lOlll1.I00i0O(228651258);
/* 12 */            if ((i & 6) == 0) {
/* 23 */                i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 25 */                i3 = i;
                    }
/* 26 */            int i4 = i2 & 2;
/* 30 */            if (i4 != 0) {
/* 32 */                i3 |= 48;
                    } else if ((i & 48) == 0) {
/* 49 */                i3 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 54 */            int i5 = 0;
/* 67 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 73 */                z2 = i4 != 0 ? false : z;
/* 76 */                Iii0io0OooO iii0io0OooO = new Iii0io0OooO(4);
/* 92 */                boolean z3 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
/* 94 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 98 */                if (!z3) {
                            Object obj = objI00O0i0ii;
/* 102 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 106 */                       I0IlOI1i i0IlOI1i = new I0IlOI1i(2);
/* 109 */                       i0IlOI1i.I00iiI = z2;
/* 111 */                       i0IlOI1i.I00iiO = illOOo00lI;
/* 113 */                       VarHandle.storeStoreFence();
/* 116 */                       iloI0lOlll1.I00iio(i0IlOI1i);
                                obj = i0IlOI1i;
                            }
/* 124 */                   I1IIol00oIo0 i1IIol00oIo0 = new I1IIol00oIo0(i5);
/* 127 */                   i1IIol00oIo0.I00iiO = illOOo00lI;
/* 129 */                   i1IIol00oIo0.I00iiI = z2;
/* 131 */                   VarHandle.storeStoreFence();
/* 145 */                   iOIlI11IO.I00000oIO((IllOOo00lI) obj, iii0io0OooO, iiioOl1O.I00000oOI(2037020945, i1IIol00oIo0, iloI0lOlll1), iloI0lOlll1, 432, 0);
                        }
                    } else {
/* 149 */               iloI0lOlll1.I00OilO00Il();
/* 152 */               z2 = z;
                    }
/* 153 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 157 */           if (oOloioIlI001IO000 != null) {
/* 161 */               I1IO0OIlo i1IO0OIlo = new I1IO0OIlo(0);
/* 164 */               i1IO0OIlo.I00iiO = illOOo00lI;
/* 166 */               i1IO0OIlo.I00iiI = z2;
/* 168 */               i1IO0OIlo.I00iio = i;
/* 170 */               i1IO0OIlo.I00ilI0I1 = i2;
/* 172 */               VarHandle.storeStoreFence();
/* 175 */               oOloioIlI001IO000.I0000O = i1IO0OIlo;
                    }
                }
            }
