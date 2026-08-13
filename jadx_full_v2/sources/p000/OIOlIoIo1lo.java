            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIOlIoIo1lo;", "LO1oooooIio;", "LOIOliI;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIOlIoIo1lo extends O1oooooIio {
                public float I00000oIO;
                public float I00000oOI;
                public boolean I0000Il00O;

                @Override
                public final O1ooOo I000II() {
/* 3 */             float f = this.I00000oIO;
/* 5 */             float f2 = this.I00000oOI;
/* 7 */             boolean z = this.I0000Il00O;
/* 9 */             OIOliI oIOliI = new OIOliI();
/* 12 */            oIOliI.I00o0iI0io1 = f;
/* 14 */            oIOliI.I00o0l1o1o0 = f2;
/* 16 */            oIOliI.I00o101lO = z;
/* 20 */            return oIOliI;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIOliI oIOliI = (OIOliI) o1ooOo;
/* 3 */             float f = this.I00000oIO;
/* 5 */             float f2 = this.I00000oOI;
/* 7 */             boolean z = this.I0000Il00O;
/* 15 */            if (!Iil1010O.I0000Il00O(oIOliI.I00o0iI0io1, f) || !Iil1010O.I0000Il00O(oIOliI.I00o0l1o1o0, f2) || oIOliI.I00o101lO != z) {
/* 34 */                il0lI1i1olii.I000O01llI0(oIOliI).I00Oio(false);
                    }
/* 37 */            oIOliI.I00o0iI0io1 = f;
/* 39 */            oIOliI.I00o0l1o1o0 = f2;
/* 41 */            oIOliI.I00o101lO = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 11 */            OIOlIoIo1lo oIOlIoIo1lo = obj instanceof OIOlIoIo1lo ? (OIOlIoIo1lo) obj : null;
                    return oIOlIoIo1lo != null && Iil1010O.I0000Il00O(this.I00000oIO, oIOlIoIo1lo.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, oIOlIoIo1lo.I00000oOI) && this.I0000Il00O == oIOlIoIo1lo.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return Boolean.hashCode(this.I0000Il00O) + OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI);
                }

                public final String toString() {
/* 3 */             String strI0000O = Iil1010O.I0000O(this.I00000oIO);
/* 9 */             String strI0000O2 = Iil1010O.I0000O(this.I00000oOI);
/* 27 */            return IIlIOloOOO.I0010o(IIl001iO0Io.I00111O("OffsetModifierElement(x=", strI0000O, ", y=", strI0000O2, ", rtlAware="), this.I0000Il00O, ")");
                }
            }
