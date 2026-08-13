            package p000;

            import java.lang.invoke.VarHandle;
            
            public class Ioo11Oooi0Il extends Ioo0liiIOl implements O0iOoioOoI {
                public i00O0OOIlOO I00o101lO;

                public Ioo11Oooi0Il(i00O0OOIlOO i00o0ooiloo) {
/* 4 */             this.I00o101lO = i00o0ooiloo;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 21 */            int iI0000O = this.I00o0l1o1o0.I0000O(o1iOIoOiO0, o1iOIoOiO0.getLayoutDirection()) - this.I00o0iI0io1.I0000O(o1iOIoOiO0, o1iOIoOiO0.getLayoutDirection());
/* 34 */            int iI00000oIO = this.I00o0l1o1o0.I00000oIO(o1iOIoOiO0) - this.I00o0iI0io1.I00000oIO(o1iOIoOiO0);
/* 69 */            int iI00000oOI = (this.I00o0l1o1o0.I00000oOI(o1iOIoOiO0, o1iOIoOiO0.getLayoutDirection()) - this.I00o0iI0io1.I00000oOI(o1iOIoOiO0, o1iOIoOiO0.getLayoutDirection())) + iI0000O;
/* 70 */            int iI0000Il00O = (this.I00o0l1o1o0.I0000Il00O(o1iOIoOiO0) - this.I00o0iI0io1.I0000Il00O(o1iOIoOiO0)) + iI00000oIO;
/* 77 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000OOo1O(j, -iI00000oOI, -iI0000Il00O));
/* 84 */            int iI000II = IOo0olo.I000II(oO1I0001000iI001lllioOl.I00iOIl + iI00000oOI, j);
/* 91 */            int iI0001Ioi1lo = IOo0olo.I0001Ioi1lo(oO1I0001000iI001lllioOl.I00iiI + iI0000Il00O, j);
/* 98 */            Ioo1100i ioo1100i = new Ioo1100i(0);
/* 101 */           ioo1100i.I00iiO = oO1I0001000iI001lllioOl;
/* 103 */           ioo1100i.I00iiI = iI0000O;
/* 105 */           ioo1100i.I00iio = iI00000oIO;
/* 107 */           VarHandle.storeStoreFence();
/* 112 */           return o1iOIoOiO0.I001i1lo1io(iI000II, iI0001Ioi1lo, Il011I1OiO0I.I00iOIl, ioo1100i);
                }

                @Override
                public final i00O0OOIlOO I010l1O(i00O0OOIlOO i00o0ooiloo) {
/* 3 */             return iO1OO0i0i.I00000oOI(i00o0ooiloo, this.I00o101lO);
                }

                @Override
                public final void I010l1ol111() {
/* 1 */             super.I010l1ol111();
/* 4 */             l0o11Oi.I00000oOI(this);
                }
            }
