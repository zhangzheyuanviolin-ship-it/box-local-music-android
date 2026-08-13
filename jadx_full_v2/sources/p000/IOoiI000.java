            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class IOoiI000 {
                public Ol1o0O0O0 I00000oIO;

                public static void I00000oOI(IOoiI000 iOoiI000, IlliIl1l11O illiIl1l11O, IOii1l iOii1l, IllOOo00lI illOOo00lI, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 iOii1l = null;
                    }
/* 6 */             Ol1o0O0O0 ol1o0O0O0 = iOoiI000.I00000oIO;
/* 11 */            IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(6);
/* 14 */            iO1oIiIi1O01.I00iiO = illiIl1l11O;
/* 16 */            iO1oIiIi1O01.I00iio = iOoiI000;
/* 18 */            iO1oIiIi1O01.I00iiI = iOii1l;
/* 20 */            iO1oIiIi1O01.I00ilI0I1 = illOOo00lI;
/* 22 */            VarHandle.storeStoreFence();
/* 34 */            ol1o0O0O0.add(new IOii1l(-1789283891, iO1oIiIi1O01, true));
                }

                public final void I00000oIO(IOoi1llO0Oo iOoi1llO0Oo, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-798501095);
/* 28 */            int i2 = i | (iloI0lOlll1.I000II(iOoi1llO0Oo) ? 4 : 2) | (iloI0lOlll1.I000II(this) ? 32 : 16);
/* 45 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 47 */                Ol1o0O0O0 ol1o0O0O0 = this.I00000oIO;
/* 49 */                int size = ol1o0O0O0.size();
/* 53 */                for (int i3 = 0; i3 < size; i3++) {
/* 67 */                    ((Function3) ol1o0O0O0.get(i3)).invoke(iOoi1llO0Oo, iloI0lOlll1, Integer.valueOf(i2 & 14));
                        }
                    } else {
/* 73 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 76 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 80 */            if (oOloioIlI001IO000 != null) {
/* 86 */                I0Il0I1o i0Il0I1o = new I0Il0I1o(21);
/* 89 */                i0Il0I1o.I00iiO = this;
/* 91 */                i0Il0I1o.I00iiI = iOoi1llO0Oo;
/* 93 */                VarHandle.storeStoreFence();
/* 96 */                oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }
            }
