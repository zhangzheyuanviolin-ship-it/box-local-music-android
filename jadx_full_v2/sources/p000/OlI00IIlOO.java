            package p000;

            import android.graphics.Shader;
            
            public final class OlI00IIlOO extends III11l1I implements Iooo0ilooO0 {
                public final long I00000oIO;

                public OlI00IIlOO(long j) {
/* 4 */             this.I00000oIO = j;
                }

                @Override
                public final void I00000oIO(float f, long j, I0oiil10Ili i0oiil10Ili) {
/* 3 */             i0oiil10Ili.I00100l0(1.0f);
/* 8 */             long jI0000Il00O = this.I00000oIO;
/* 10 */            if (f != 1.0f) {
/* 18 */                jI0000Il00O = IOOiio0i.I0000Il00O(IOOiio0i.I0000O(jI0000Il00O) * f, jI0000Il00O);
                    }
/* 22 */            i0oiil10Ili.I0010o(jI0000Il00O);
/* 29 */            if (((Shader) i0oiil10Ili.I00iio) != null) {
/* 32 */                i0oiil10Ili.I001i1O0Ol(null);
                    }
                }

                @Override
                public final Object I00000oOI(Object obj, float f) {
/* 1 */             if (obj == null) {
/* 5 */                 int i = IOOiio0i.I000oI1ioi;
/* 9 */                 obj = new OlI00IIlOO(IOOiio0i.I000lI);
                    }
/* 14 */            if (!(obj instanceof OlI00IIlOO)) {
/* 32 */                return null;
                    }
/* 28 */            return new OlI00IIlOO(iiO01ll11o1l.I000II(f, this.I00000oIO, ((OlI00IIlOO) obj).I00000oIO));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 25 */                return true;
                    }
/* 6 */             if (!(obj instanceof OlI00IIlOO)) {
/* 23 */                return false;
                    }
/* 11 */            long j = ((OlI00IIlOO) obj).I00000oIO;
/* 13 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j);
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 5 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("SolidColor(value=", IOOiio0i.I000OOo1O(this.I00000oIO), ")");
                }
            }
