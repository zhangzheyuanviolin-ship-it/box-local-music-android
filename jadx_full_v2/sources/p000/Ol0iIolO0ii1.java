            package p000;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOl0iIolO0ii1;", "LO1oooooIio;", "LOl0iOOio1O1;", "foundation-layout"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
/* 25 */    final class Ol0iIolO0ii1 extends O1oooooIio {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;
                public final boolean I0000oI00;

                public Ol0iIolO0ii1(float f, float f2, float f3, float f4, boolean z, int i) {
/* 23 */            this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ol0iOOio1O1 ol0iOOio1O1 = new Ol0iOOio1O1();
/* 8 */             ol0iOOio1O1.I00o0iI0io1 = this.I00000oIO;
/* 12 */            ol0iOOio1O1.I00o0l1o1o0 = this.I00000oOI;
/* 16 */            ol0iOOio1O1.I00o101lO = this.I0000Il00O;
/* 20 */            ol0iOOio1O1.I00oI0i = this.I0000O;
/* 24 */            ol0iOOio1O1.I00oII = this.I0000oI00;
/* 55 */            return ol0iOOio1O1;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             Ol0iOOio1O1 ol0iOOio1O1 = (Ol0iOOio1O1) o1ooOo;
/* 5 */             ol0iOOio1O1.I00o0iI0io1 = this.I00000oIO;
/* 9 */             ol0iOOio1O1.I00o0l1o1o0 = this.I00000oOI;
/* 13 */            ol0iOOio1O1.I00o101lO = this.I0000Il00O;
/* 17 */            ol0iOOio1O1.I00oI0i = this.I0000O;
/* 21 */            ol0iOOio1O1.I00oII = this.I0000oI00;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 63 */                return true;
                    }
/* 6 */             if (!(obj instanceof Ol0iIolO0ii1)) {
/* 61 */                return false;
                    }
/* 9 */             Ol0iIolO0ii1 ol0iIolO0ii1 = (Ol0iIolO0ii1) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, ol0iIolO0ii1.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, ol0iIolO0ii1.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, ol0iIolO0ii1.I0000Il00O) && Iil1010O.I0000Il00O(this.I0000O, ol0iIolO0ii1.I0000O) && this.I0000oI00 == ol0iIolO0ii1.I0000oI00;
                }

                public final int hashCode() {
/* 34 */            return Boolean.hashCode(this.I0000oI00) + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O);
                }

/* 26 */        public Ol0iIolO0ii1(float f, float f2, float f3, float f4, boolean z) {
/* 28 */            this.I00000oIO = f;
/* 29 */            this.I00000oOI = f2;
/* 30 */            this.I0000Il00O = f3;
/* 31 */            this.I0000O = f4;
/* 32 */            this.I0000oI00 = z;
                }
            }
