            package p000;
            
            public final class OIo1i1 implements OIo1Oi1l1lI {
                public final float I00000oIO;
                public final float I00000oOI;
                public final float I0000Il00O;
                public final float I0000O;

                public OIo1i1(float f, float f2, float f3, float f4) {
/* 4 */             this.I00000oIO = f;
/* 6 */             this.I00000oOI = f2;
/* 8 */             this.I0000Il00O = f3;
/* 10 */            this.I0000O = f4;
/* 45 */            if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
/* 49 */                IoliiIlI0O.I00000oIO("Padding must be non-negative");
                    }
                }

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final float I00000oOI(O0iOOoiioO o0iOOoiioO) {
                    return o0iOOoiioO == O0iOOoiioO.I00iOIl ? this.I00000oIO : this.I0000Il00O;
                }

                @Override
                public final float I0000Il00O(O0iOOoiioO o0iOOoiioO) {
                    return o0iOOoiioO == O0iOOoiioO.I00iOIl ? this.I0000Il00O : this.I00000oIO;
                }

                @Override
                public final float I0000O() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OIo1i1)) {
/* 50 */                return false;
                    }
/* 6 */             OIo1i1 oIo1i1 = (OIo1i1) obj;
                    return Iil1010O.I0000Il00O(this.I00000oIO, oIo1i1.I00000oIO) && Iil1010O.I0000Il00O(this.I00000oOI, oIo1i1.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, oIo1i1.I0000Il00O) && Iil1010O.I0000Il00O(this.I0000O, oIo1i1.I0000O);
                }

                public final int hashCode() {
/* 28 */            return Float.hashCode(this.I0000O) + OooioIOo1.I0000O(OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 3 */             String strI0000O = Iil1010O.I0000O(this.I00000oIO);
/* 9 */             String strI0000O2 = Iil1010O.I0000O(this.I00000oOI);
/* 39 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("PaddingValues(start=", strI0000O, ", top=", strI0000O2, ", end="), Iil1010O.I0000O(this.I0000Il00O), ", bottom=", Iil1010O.I0000O(this.I0000O), ")");
                }
            }
