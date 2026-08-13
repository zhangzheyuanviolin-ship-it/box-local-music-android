            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIo1iIIOO extends O1ooOo implements O0iOoioOoI {
                public OIo1Oi1l1lI I00o0iI0io1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 7 */             float fI00000oOI = this.I00o0iI0io1.I00000oOI(o1iOIoOiO0.getLayoutDirection());
/* 13 */            float fI0000O = this.I00o0iI0io1.I0000O();
/* 23 */            float fI0000Il00O = this.I00o0iI0io1.I0000Il00O(o1iOIoOiO0.getLayoutDirection());
/* 29 */            float fI00000oIO = this.I00o0iI0io1.I00000oIO();
/* 74 */            if (!((Iil1010O.I00000oOI(fI00000oOI, 0.0f) >= 0) & (Iil1010O.I00000oOI(fI0000O, 0.0f) >= 0) & (Iil1010O.I00000oOI(fI0000Il00O, 0.0f) >= 0) & (Iil1010O.I00000oOI(fI00000oIO, 0.0f) >= 0))) {
/* 78 */                IoliiIlI0O.I00000oIO("Padding must be non-negative");
                    }
/* 81 */            int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(fI00000oOI);
/* 89 */            int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(fI0000Il00O) + iI00l0OO0IO;
/* 90 */            int iI00l0OO0IO3 = o1iOIoOiO0.I00l0OO0IO(fI0000O);
/* 98 */            int iI00l0OO0IO4 = o1iOIoOiO0.I00l0OO0IO(fI00000oIO) + iI00l0OO0IO3;
/* 105 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000OOo1O(j, -iI00l0OO0IO2, -iI00l0OO0IO4));
/* 112 */           int iI000II = IOo0olo.I000II(oO1I0001000iI001lllioOl.I00iOIl + iI00l0OO0IO2, j);
/* 119 */           int iI0001Ioi1lo = IOo0olo.I0001Ioi1lo(oO1I0001000iI001lllioOl.I00iiI + iI00l0OO0IO4, j);
/* 126 */           Ioo1100i ioo1100i = new Ioo1100i(2);
/* 129 */           ioo1100i.I00iiO = oO1I0001000iI001lllioOl;
/* 131 */           ioo1100i.I00iiI = iI00l0OO0IO;
/* 133 */           ioo1100i.I00iio = iI00l0OO0IO3;
/* 135 */           VarHandle.storeStoreFence();
/* 140 */           return o1iOIoOiO0.I001i1lo1io(iI000II, iI0001Ioi1lo, Il011I1OiO0I.I00iOIl, ioo1100i);
                }
            }
