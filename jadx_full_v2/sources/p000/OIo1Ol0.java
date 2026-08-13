            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIo1Ol0 extends Ioo0liiIOl {
                public OIo1Oi1l1lI I00o101lO;

                @Override
                public final i00O0OOIlOO I010l1O(i00O0OOIlOO i00o0ooiloo) {
/* 1 */             OIo1Oi1l1lI oIo1Oi1l1lI = this.I00o101lO;
/* 5 */             OIo1i1OOio oIo1i1OOio = new OIo1i1OOio();
/* 8 */             oIo1i1OOio.I00000oIO = oIo1Oi1l1lI;
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            I0O1oloII i0O1oloII = new I0O1oloII();
/* 18 */            i0O1oloII.I00000oIO = i00o0ooiloo;
/* 20 */            i0O1oloII.I00000oOI = oIo1i1OOio;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return i0O1oloII;
                }
            }
