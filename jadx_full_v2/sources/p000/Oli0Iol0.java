            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOli0Iol0;", "LO1oooooIio;", "LOli0oiO;", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class Oli0Iol0 extends O1oooooIio {
                public OI10olol1i I00000oIO;
                public Oli01I0I01 I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OI10olol1i oI10olol1i = this.I00000oIO;
/* 5 */             Oli01I0I01 oli01I0I01 = this.I00000oOI;
/* 7 */             Oli0oiO oli0oiO = new Oli0oiO();
/* 10 */            oli0oiO.I00oI0i = oli01I0I01;
/* 14 */            Oi0iOio oi0iOio = new Oi0iOio();
/* 19 */            oi0iOio.I00iOIl = 1.0f;
/* 21 */            OoioI1Io10oo ooioI1Io10oo = OoioI1Io10oo.I00000oIO;
/* 23 */            oi0iOio.I00ll1 = ooioI1Io10oo;
/* 25 */            oi0iOio.I00lli11 = ooioI1Io10oo;
/* 27 */            oli0oiO.I00oII = oi0iOio;
/* 34 */            oli0oiO.I00oIiI10 = new Oli100iIoOOO();
/* 43 */            oli0oiO.I00olI = new I1ii1o0(5, false);
/* 45 */            if (oI10olol1i == null) {
/* 50 */                oI10olol1i = new OI10olol1i(null);
                    }
/* 53 */            oli0oiO.I00oli = oI10olol1i;
/* 60 */            oli0oiO.I00ooIo0 = 9205357640488583168L;
/* 62 */            VarHandle.storeStoreFence();
/* 110 */           return oli0oiO;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Oli0oiO oli0oiO = (Oli0oiO) o1ooOo;
/* 5 */             oli0oiO.I00oI0i = this.I00000oOI;
/* 8 */             oli0oiO.I01101olii(false);
/* 11 */            OI10olol1i oI10olol1i = this.I00000oIO;
/* 13 */            if (oI10olol1i == null) {
/* 18 */                oI10olol1i = new OI10olol1i(null);
                    }
/* 27 */            if (O0000Ioio00.I0000O(oli0oiO.I00oli, oI10olol1i)) {
/* 77 */                return;
                    }
/* 29 */            oli0oiO.I00oli = oI10olol1i;
/* 31 */            oli0oiO.I01101olii(false);
/* 34 */            Oli0iol0o0 oli0iol0o0 = oli0oiO.I00o101lO;
/* 36 */            if (oli0iol0o0 != null) {
/* 38 */                l0o11Oi.I00000oIO(oli0iol0o0);
                    } else {
/* 44 */                I000II.I001IO000("StyleOuterNode with no corresponding StyleInnerNode");
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
/* 5 */             if (!(obj instanceof Oli0Iol0)) {
/* 30 */                return false;
                    }
/* 7 */             Oli0Iol0 oli0Iol0 = (Oli0Iol0) obj;
                    return O0000Ioio00.I0000O(oli0Iol0.I00000oOI, this.I00000oOI) && O0000Ioio00.I0000O(oli0Iol0.I00000oIO, this.I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oOI.hashCode();
                }

                public final String toString() {
/* 28 */            return "StyleElement(styleState=" + this.I00000oIO + ", style=" + this.I00000oOI + ")";
                }
            }
