            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class OiOiiIo0l extends O1ooOo implements O0iOoioOoI, OiiooOl {
                public OiOl01il10lO I00o0iI0io1;
                public boolean I00o0l1o1o0;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 10 */            iOliIII.I00000oIO(j, this.I00o0l1o1o0 ? OIilII.I00iOIl : OIilII.I00iiI);
/* 44 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, this.I00o0l1o1o0 ? IOo0oO11ll1O.I000OiO(j) : Integer.MAX_VALUE, 0, this.I00o0l1o1o0 ? Integer.MAX_VALUE : IOo0oO11ll1O.I000OOo1O(j), 5));
/* 48 */            int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 50 */            int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 54 */            if (i > iI000OiO) {
/* 56 */                i = iI000OiO;
                    }
/* 57 */            int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 59 */            int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 63 */            if (i2 > iI000OOo1O) {
/* 65 */                i2 = iI000OOo1O;
                    }
/* 68 */            int i3 = oO1I0001000iI001lllioOl.I00iiI - i2;
/* 71 */            int i4 = oO1I0001000iI001lllioOl.I00iOIl - i;
/* 74 */            if (!this.I00o0l1o1o0) {
/* 77 */                i3 = i4;
                    }
/* 78 */            OiOl01il10lO oiOl01il10lO = this.I00o0iI0io1;
/* 80 */            OIooi1iOiOol oIooi1iOiOol = oiOl01il10lO.I0001Ioi1lo;
/* 82 */            OIooi1iOiOol oIooi1iOiOol2 = oiOl01il10lO.I00000oIO;
/* 84 */            oIooi1iOiOol.I000O01llI0(i3);
/* 87 */            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 98 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 99 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 107 */               if (oIooi1iOiOol2.I000II() > i3) {
/* 109 */                   oIooi1iOiOol2.I000O01llI0(i3);
                        }
/* 116 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 130 */               this.I00o0iI0io1.I00000oOI.I000O01llI0(this.I00o0l1o1o0 ? i2 : i);
/* 146 */               this.I00o0iI0io1.I0000Il00O.I000O01llI0(this.I00o0l1o1o0 ? oO1I0001000iI001lllioOl.I00iiI : oO1I0001000iI001lllioOl.I00iOIl);
/* 155 */               this.I00o0iI0io1.I0000O.setValue(Boolean.FALSE);
/* 161 */               II0oo1oO1 iI0oo1oO1 = new II0oo1oO1(2);
/* 164 */               iI0oo1oO1.I00iio = this;
/* 166 */               iI0oo1oO1.I00iiI = i3;
/* 168 */               iI0oo1oO1.I00iiO = oO1I0001000iI001lllioOl;
/* 170 */               VarHandle.storeStoreFence();
/* 175 */               return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, iI0oo1oO1);
                    } catch (Throwable th) {
/* 180 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 408 */               throw th;
                    }
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             if (this.I00o0l1o1o0) {
/* 5 */                 i = Integer.MAX_VALUE;
                    }
/* 8 */             return o1iIo0ll.I001iOo1i0O(i);
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             if (!this.I00o0l1o1o0) {
/* 6 */                 i = Integer.MAX_VALUE;
                    }
/* 9 */             return o1iIo0ll.I0000Il00O(i);
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             if (!this.I00o0l1o1o0) {
/* 6 */                 i = Integer.MAX_VALUE;
                    }
/* 9 */             return o1iIo0ll.I00OI1(i);
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             if (this.I00o0l1o1o0) {
/* 5 */                 i = Integer.MAX_VALUE;
                    }
/* 8 */             return o1iIo0ll.I000l1(i);
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
/* 1 */             Oil0Io.I000lI(oil0O0I);
/* 9 */             OiOiOIiIOI oiOiOIiIOI = new OiOiOIiIOI(0);
/* 12 */            oiOiOIiIOI.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 20 */            OiOiOIiIOI oiOiOIiIOI2 = new OiOiOIiIOI(1);
/* 23 */            oiOiOIiIOI2.I00iiI = this;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            OiOi0l oiOi0l = new OiOi0l(oiOiOIiIOI, oiOiOIiIOI2);
/* 33 */            if (this.I00o0l1o1o0) {
/* 35 */                Oil0IoooOio oil0IoooOio = Oil0I1O.I001i1O0Ol;
/* 41 */                O0O00I1Ili o0O00I1Ili = Oil0Io.I00000oIO[13];
/* 43 */                oil0IoooOio.getClass();
/* 46 */                oil0O0I.I00000oOI(oil0IoooOio, oiOi0l);
/* 49 */                return;
                    }
/* 50 */            Oil0IoooOio oil0IoooOio2 = Oil0I1O.I001IO000;
/* 56 */            O0O00I1Ili o0O00I1Ili2 = Oil0Io.I00000oIO[12];
/* 58 */            oil0IoooOio2.getClass();
/* 61 */            oil0O0I.I00000oOI(oil0IoooOio2, oiOi0l);
                }
            }
