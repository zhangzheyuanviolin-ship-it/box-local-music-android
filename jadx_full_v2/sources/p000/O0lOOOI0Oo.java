            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0lOOOI0Oo extends O1ooOo implements O0iOoioOoI {
                public static final O0lOIl I00oI0i = new O0lOIl();
                public O0lOOii I00o0iI0io1;
                public Oi1ol0llI I00o0l1o1o0;
                public OIilII I00o101lO;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 5 */             int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 7 */             int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 13 */            I0li0o i0li0o = new I0li0o(8);
/* 16 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                public final boolean I010l1O(O0lO1lilIooO o0lO1lilIooO, int i) {
/* 4 */             if (i != 5 && i != 6) {
/* 18 */                if (i == 3 || i == 4) {
/* 28 */                    if (this.I00o101lO != OIilII.I00iOIl) {
                            }
                        } else if (i != 1 && i != 2) {
/* 63 */                    I000II.I001IO000("Lazy list does not support beyond bounds layout for the specified direction");
/* 2 */                     return false;
                        }
/* 41 */                if (I010l1ol111(i) ? o0lO1lilIooO.I00000oIO > 0 : o0lO1lilIooO.I00000oOI < this.I00o0iI0io1.I00000oIO() - 1) {
/* 3 */                     return true;
                        }
                    } else if (this.I00o101lO != OIilII.I00iiI) {
/* 41 */                if (I010l1ol111(i)) {
                        }
                    }
/* 2 */             return false;
                }

                public final boolean I010l1ol111(int i) {
/* 3 */             if (i == 1) {
/* 1 */                 return false;
                    }
/* 7 */             if (i == 2) {
/* 2 */                 return true;
                    }
/* 11 */            if (i == 5) {
/* 1 */                 return false;
                    }
/* 15 */            if (i == 6) {
/* 2 */                 return true;
                    }
/* 19 */            if (i == 3) {
/* 27 */                int iOrdinal = il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll.ordinal();
/* 31 */                if (iOrdinal == 0) {
/* 1 */                     return false;
                        }
/* 33 */                if (iOrdinal == 1) {
/* 2 */                     return true;
                        }
/* 36 */                I000II.I00000oIO();
/* 39 */                return false;
                    }
/* 43 */            if (i != 4) {
/* 67 */                I000II.I001IO000("Lazy list does not support beyond bounds layout for the specified direction");
/* 39 */                return false;
                    }
/* 51 */            int iOrdinal2 = il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll.ordinal();
/* 55 */            if (iOrdinal2 == 0) {
/* 2 */                 return true;
                    }
/* 57 */            if (iOrdinal2 == 1) {
/* 1 */                 return false;
                    }
/* 60 */            I000II.I00000oIO();
/* 39 */            return false;
                }
            }
