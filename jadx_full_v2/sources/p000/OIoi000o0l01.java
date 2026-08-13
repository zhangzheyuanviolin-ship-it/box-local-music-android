            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIoi000o0l01;", "LO1oooooIio;", "LOIoi0IIi;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIoi000o0l01 extends O1oooooIio {
                public OIoOo11 I00000oIO;
                public boolean I00000oOI;
                public I0iolI1I11l1 I0000Il00O;
                public IOoOOI1ii I0000O;
                public float I0000oI00;
                public IOOil0 I0001Ioi1lo;

                @Override
                public final O1ooOo I000II() {
/* 3 */             OIoOo11 oIoOo11 = this.I00000oIO;
/* 5 */             boolean z = this.I00000oOI;
/* 7 */             I0iolI1I11l1 i0iolI1I11l1 = this.I0000Il00O;
/* 9 */             IOoOOI1ii iOoOOI1ii = this.I0000O;
/* 11 */            float f = this.I0000oI00;
/* 13 */            IOOil0 iOOil0 = this.I0001Ioi1lo;
/* 15 */            OIoi0IIi oIoi0IIi = new OIoi0IIi();
/* 18 */            oIoi0IIi.I00o0iI0io1 = oIoOo11;
/* 20 */            oIoi0IIi.I00o0l1o1o0 = z;
/* 22 */            oIoi0IIi.I00o101lO = i0iolI1I11l1;
/* 24 */            oIoi0IIi.I00oI0i = iOoOOI1ii;
/* 26 */            oIoi0IIi.I00oII = f;
/* 28 */            oIoi0IIi.I00oIiI10 = iOOil0;
/* 55 */            return oIoi0IIi;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIoi0IIi oIoi0IIi = (OIoi0IIi) o1ooOo;
/* 3 */             OIoOo11 oIoOo11 = this.I00000oIO;
/* 5 */             boolean z = oIoi0IIi.I00o0l1o1o0;
/* 7 */             boolean z2 = this.I00000oOI;
/* 32 */            boolean z3 = z != z2 || (z2 && !Ol0i1I.I00000oOI(oIoi0IIi.I00o0iI0io1.I000OOo1O(), oIoOo11.I000OOo1O()));
/* 33 */            oIoi0IIi.I00o0iI0io1 = oIoOo11;
/* 35 */            oIoi0IIi.I00o0l1o1o0 = z2;
/* 39 */            oIoi0IIi.I00o101lO = this.I0000Il00O;
/* 43 */            oIoi0IIi.I00oI0i = this.I0000O;
/* 47 */            oIoi0IIi.I00oII = this.I0000oI00;
/* 51 */            oIoi0IIi.I00oIiI10 = this.I0001Ioi1lo;
/* 53 */            if (z3) {
/* 55 */                l0o11Oi.I00000oOI(oIoi0IIi);
                    }
/* 58 */            il1ollIO0I.I00000oIO(oIoi0IIi);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 74 */                return true;
                    }
/* 6 */             if (!(obj instanceof OIoi000o0l01)) {
/* 72 */                return false;
                    }
/* 9 */             OIoi000o0l01 oIoi000o0l01 = (OIoi000o0l01) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oIoi000o0l01.I00000oIO) && this.I00000oOI == oIoi000o0l01.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, oIoi000o0l01.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oIoi000o0l01.I0000O) && Float.compare(this.I0000oI00, oIoi000o0l01.I0000oI00) == 0 && O0000Ioio00.I0000O(this.I0001Ioi1lo, oIoi000o0l01.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 34 */            int iI0000O = OooioIOo1.I0000O((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI)) * 31)) * 31, 31, this.I0000oI00);
/* 38 */            IOOil0 iOOil0 = this.I0001Ioi1lo;
/* 48 */            return iI0000O + (iOOil0 == null ? 0 : iOOil0.hashCode());
                }

                public final String toString() {
/* 68 */            return "PainterElement(painter=" + this.I00000oIO + ", sizeToIntrinsics=" + this.I00000oOI + ", alignment=" + this.I0000Il00O + ", contentScale=" + this.I0000O + ", alpha=" + this.I0000oI00 + ", colorFilter=" + this.I0001Ioi1lo + ")";
                }
            }
