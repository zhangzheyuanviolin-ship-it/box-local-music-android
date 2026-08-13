            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i01iloIOIo0 extends O1ooOo implements O0iOoioOoI {
                public Iii1I1O0 I00o0iI0io1;
                public IlliIl1l11O I00o0l1o1o0;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 37 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I00000oIO(this.I00o0iI0io1 != Iii1I1O0.I00iOIl ? 0 : IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000OiO(j), this.I00o0iI0io1 == Iii1I1O0.I00iiI ? IOo0oO11ll1O.I000iOII(j) : 0, IOo0oO11ll1O.I000OOo1O(j)));
/* 51 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(oO1I0001000iI001lllioOl.I00iOIl, IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000OiO(j));
/* 65 */            int iI0000Il00O2 = lIiioliIlo.I0000Il00O(oO1I0001000iI001lllioOl.I00iiI, IOo0oO11ll1O.I000iOII(j), IOo0oO11ll1O.I000OOo1O(j));
/* 72 */            Oii1o1OoI oii1o1OoI = new Oii1o1OoI(1);
/* 75 */            oii1o1OoI.I00iio = this;
/* 77 */            oii1o1OoI.I00iiI = iI0000Il00O;
/* 79 */            oii1o1OoI.I00ilI0I1 = oO1I0001000iI001lllioOl;
/* 81 */            oii1o1OoI.I00iiO = iI0000Il00O2;
/* 83 */            oii1o1OoI.I00ilO0 = o1iOIoOiO0;
/* 85 */            VarHandle.storeStoreFence();
/* 90 */            return o1iOIoOiO0.I001i1lo1io(iI0000Il00O, iI0000Il00O2, Il011I1OiO0I.I00iOIl, oii1o1OoI);
                }
            }
