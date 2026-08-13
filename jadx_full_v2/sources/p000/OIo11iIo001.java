            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOIo11iIo001;", "LO1oooooIio;", "LOIo1O01lO1;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class OIo11iIo001 extends O1oooooIio {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;

                public OIo11iIo001(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
/* 15 */            boolean z = true;
/* 58 */            boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
/* 61 */            if (f4 < 0.0f && !Float.isNaN(f4)) {
/* 70 */                z = false;
                    }
/* 73 */            if (!z2 || !z) {
/* 77 */                IoliiIlI0O.I00000oIO("Padding must be non-negative");
                    }
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             OIo1O01lO1 oIo1O01lO1 = new OIo1O01lO1();
/* 8 */             oIo1O01lO1.I00o0iI0io1 = this.I00000oIO;
/* 12 */            oIo1O01lO1.I00o0l1o1o0 = this.I00000oOI;
/* 16 */            oIo1O01lO1.I00o101lO = this.I0000Il00O;
/* 20 */            oIo1O01lO1.I00oI0i = this.I0000O;
/* 23 */            oIo1O01lO1.I00oII = true;
/* 55 */            return oIo1O01lO1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             OIo1O01lO1 oIo1O01lO1 = (OIo1O01lO1) o1ooOo;
/* 5 */             oIo1O01lO1.I00o0iI0io1 = this.I00000oIO;
/* 9 */             oIo1O01lO1.I00o0l1o1o0 = this.I00000oOI;
/* 13 */            oIo1O01lO1.I00o101lO = this.I0000Il00O;
/* 17 */            oIo1O01lO1.I00oI0i = this.I0000O;
/* 20 */            oIo1O01lO1.I00oII = true;
                }

                public final boolean equals(Object obj) {
/* 8 */             OIo11iIo001 oIo11iIo001 = obj instanceof OIo11iIo001 ? (OIo11iIo001) obj : null;
                    return oIo11iIo001 != null && Iil1010O.I0000Il00O(this.I00000oIO, oIo11iIo001.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, oIo11iIo001.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, oIo11iIo001.I0000Il00O) && Iil1010O.I0000Il00O(this.I0000O, oIo11iIo001.I0000O);
                }

                public final int hashCode() {
/* 33 */            return Boolean.hashCode(true) + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }
            }
