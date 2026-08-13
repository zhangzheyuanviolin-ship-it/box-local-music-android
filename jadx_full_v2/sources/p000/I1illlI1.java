            package p000;
            
            public final class I1illlI1 {
                public int I00000oIO;
                public I1io1I I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1illlI1)) {
/* 37 */                return false;
                    }
/* 8 */             I1illlI1 i1illlI1 = (I1illlI1) obj;
/* 18 */            if (!IIlIOloOOO.I00000oOI(this.I00000oIO, i1illlI1.I00000oIO)) {
/* 37 */                return false;
                    }
/* 20 */            I1io1I i1io1I = this.I00000oOI;
/* 22 */            I1io1I i1io1I2 = i1illlI1.I00000oOI;
                    return i1io1I == null ? i1io1I2 == null : i1io1I.equals(i1io1I2);
                }

                public final int hashCode() {
/* 11 */            int iI001lIiIIo1O = (IIlIOloOOO.I001lIiIIo1O(this.I00000oIO) ^ 1000003) * 1000003;
/* 12 */            I1io1I i1io1I = this.I00000oOI;
/* 22 */            return (i1io1I == null ? 0 : i1io1I.hashCode()) ^ iI001lIiIIo1O;
                }

                public final String toString() {
/* 32 */            return "CameraState{type=" + IIl001iO0Io.I001lllioOl(this.I00000oIO) + ", error=" + this.I00000oOI + "}";
                }
            }
