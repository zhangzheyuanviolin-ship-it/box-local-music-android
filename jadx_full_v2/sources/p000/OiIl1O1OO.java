            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class OiIl1O1OO implements OiIiol10, OiIoOoIi01 {
                public OiIl0IIi0 I00iOIl;
                public O0oiiOll0O1 I00iiI;
                public IIlio101Io I00iiO;

                @Override
                public final OiIiloli0I I00000oIO(String str, IllOOo00lI illOOo00lI) {
/* 3 */             return this.I00iOIl.I00000oIO(str, illOOo00lI);
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 3 */             return this.I00iOIl.I0000Il00O(obj);
                }

                @Override
                public final Map I0000O() {
/* 3 */             return this.I00iOIl.I0000O();
                }

                @Override
                public final Object I0000oI00(String str) {
/* 3 */             return this.I00iOIl.I0000oI00(str);
                }

                public final IIlio101Io I0001Ioi1lo(Bundle bundle) {
/* 1 */             IIlio101Io iIlio101Io = this.I00iiO;
/* 3 */             if (iIlio101Io != null) {
/* 168 */               return iIlio101Io;
                    }
/* 11 */            OIOo1iiI oIOo1iiI = new OIOo1iiI(21);
/* 14 */            oIOo1iiI.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            II1oo0l11IOI iI1oo0l11IOI = new II1oo0l11IOI();
/* 22 */            iI1oo0l11IOI.I0000O = this;
/* 24 */            iI1oo0l11IOI.I0000oI00 = oIOo1iiI;
/* 33 */            iI1oo0l11IOI.I0001Ioi1lo = new lolOiIoiillI(15);
/* 40 */            iI1oo0l11IOI.I000II = new LinkedHashMap();
/* 43 */            iI1oo0l11IOI.I0000Il00O = true;
/* 45 */            VarHandle.storeStoreFence();
/* 52 */            IIlio101Io iIlio101Io2 = new IIlio101Io(24);
/* 55 */            iIlio101Io2.I00iiI = iI1oo0l11IOI;
/* 61 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(25);
/* 64 */            i1I0i0Ilo1Oi.I00iiI = iI1oo0l11IOI;
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            iIlio101Io2.I00iiO = i1I0i0Ilo1Oi;
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            this.I00iiO = iIlio101Io2;
/* 76 */            iIlio101Io2.I00oo1iO0ll(bundle);
/* 79 */            return iIlio101Io2;
                }

                @Override
                public final I1I0i0Ilo1Oi I000O01llI0() {
/* 8 */             return (I1I0i0Ilo1Oi) I0001Ioi1lo(null).I00iiO;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             O0oiiOll0O1 o0oiiOll0O1 = this.I00iiI;
/* 3 */             if (o0oiiOll0O1 != null) {
/* 20 */                return o0oiiOll0O1;
                    }
/* 8 */             O0oiiOll0O1 o0oiiOll0O12 = new O0oiiOll0O1(this, false);
/* 11 */            this.I00iiI = o0oiiOll0O12;
/* 20 */            return o0oiiOll0O12;
                }
            }
