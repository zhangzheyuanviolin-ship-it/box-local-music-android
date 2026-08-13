            package p000;
            
            public final class I10011 {
                public OioOIi1o0I I00000oIO;
                public long I00000oOI;
                public O0iOOoiioO I0000Il00O;
                public float I0000O;

                public I10011(OioOIi1o0I oioOIi1o0I, long j, O0iOOoiioO o0iOOoiioO, float f, OioOII0OOOI1 oioOII0OOOI1) {
/* 4 */             this.I00000oIO = oioOIi1o0I;
/* 6 */             this.I00000oOI = j;
/* 8 */             this.I0000Il00O = o0iOOoiioO;
/* 10 */            this.I0000O = f;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 60 */                return true;
                    }
/* 6 */             if (!(obj instanceof I10011)) {
/* 58 */                return false;
                    }
/* 9 */             I10011 i10011 = (I10011) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i10011.I00000oIO) && Ol0i1I.I00000oOI(this.I00000oOI, i10011.I00000oOI) && this.I0000Il00O == i10011.I0000Il00O && Float.compare(this.I0000O, i10011.I0000O) == 0 && O0000Ioio00.I0000O(null, null);
                }

                public final int hashCode() {
/* 26 */            return OooioIOo1.I0000O((this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31, 31, this.I0000O);
                }

                public final String toString() {
/* 61 */            return "ShadowKey(shape=" + this.I00000oIO + ", size=" + Ol0i1I.I000II(this.I00000oOI) + ", layoutDirection=" + this.I0000Il00O + ", density=" + this.I0000O + ", shadow=" + ((Object) null) + ")";
                }
            }
