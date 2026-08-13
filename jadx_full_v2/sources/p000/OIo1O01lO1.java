            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIo1O01lO1 extends O1ooOo implements O0iOoioOoI {
                public float I00o0iI0io1;
                public float I00o0l1o1o0;
                public float I00o101lO;
                public float I00oI0i;
                public boolean I00oII;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 13 */            int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(this.I00o101lO) + o1iOIoOiO0.I00l0OO0IO(this.I00o0iI0io1);
/* 26 */            int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(this.I00oI0i) + o1iOIoOiO0.I00l0OO0IO(this.I00o0l1o1o0);
/* 33 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000OOo1O(j, -iI00l0OO0IO, -iI00l0OO0IO2));
/* 40 */            int iI000II = IOo0olo.I000II(oO1I0001000iI001lllioOl.I00iOIl + iI00l0OO0IO, j);
/* 47 */            int iI0001Ioi1lo = IOo0olo.I0001Ioi1lo(oO1I0001000iI001lllioOl.I00iiI + iI00l0OO0IO2, j);
/* 55 */            O1lIIi o1lIIi = new O1lIIi(15);
/* 58 */            o1lIIi.I00iiI = this;
/* 60 */            o1lIIi.I00iiO = oO1I0001000iI001lllioOl;
/* 62 */            VarHandle.storeStoreFence();
/* 67 */            return o1iOIoOiO0.I001i1lo1io(iI000II, iI0001Ioi1lo, Il011I1OiO0I.I00iOIl, o1lIIi);
                }
            }
