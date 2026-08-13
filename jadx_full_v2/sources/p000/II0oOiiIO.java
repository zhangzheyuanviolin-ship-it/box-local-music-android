            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II0oOiiIO extends O1ooOo implements O0iOoioOoI, OiiooOl {
                public Function1 I00o0iI0io1;

                public II0oOiiIO(Function1 function1) {
/* 4 */             this.I00o0iI0io1 = function1;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 5 */             int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 7 */             int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 13 */            I00o101lO i00o101lO = new I00o101lO(19);
/* 16 */            i00o101lO.I00iiI = oO1I0001000iI001lllioOl;
/* 18 */            i00o101lO.I00iiO = this;
/* 20 */            VarHandle.storeStoreFence();
/* 25 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i00o101lO);
                }

                @Override
                public final boolean I000O01llI0() {
/* 1 */             return false;
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
                    OioOIi1o0I oioOIi1o0I;
                    boolean z;
/* 2 */             OIIlIII0Ili oIIlIII0IliI0000oI00 = il0lI1i1olii.I0000oI00(this, 2);
/* 8 */             if (oIIlIII0IliI0000oI00.I010l1O) {
/* 75 */                oioOIi1o0I = oIIlIII0IliI0000oI00.I010iIIOlo;
/* 77 */                z = oIIlIII0IliI0000oI00.I010l10O;
                    } else {
/* 10 */                Oi11lOiIoi oi11lOiIoi = iIlll1lo.I00000oIO;
/* 12 */                if (oi11lOiIoi == null) {
/* 19 */                    iIlll1lo.I00000oIO = new Oi11lOiIoi();
                        } else {
/* 22 */                    oi11lOiIoi.I00000oOI();
                        }
/* 25 */                Oi11lOiIoi oi11lOiIoi2 = iIlll1lo.I00000oIO;
/* 31 */                oi11lOiIoi2.I00oIiI10 = oIIlIII0IliI0000oI00.I00oO101o.I00oliIiO01i;
/* 39 */                oi11lOiIoi2.I00oI0i = l000O1l.I00000oOI(oIIlIII0IliI0000oI00.I00iiO);
/* 41 */                Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 52 */                Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 53 */                Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                        try {
/* 59 */                    this.I00o0iI0io1.invoke(oi11lOiIoi2);
/* 62 */                    iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 65 */                    oioOIi1o0I = oi11lOiIoi2.I00o0iI0io1;
/* 67 */                    z = oi11lOiIoi2.I00o0l1o1o0;
                        } catch (Throwable th) {
/* 71 */                    iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 74 */                    throw th;
                        }
                    }
/* 79 */            if (z) {
/* 82 */                Oil0Io.I000iOII(oil0O0I, oioOIi1o0I);
                    }
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final String toString() {
/* 18 */            return "BlockGraphicsLayerModifier(block=" + this.I00o0iI0io1 + ")";
                }
            }
