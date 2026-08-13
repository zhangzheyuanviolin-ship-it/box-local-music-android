            package p000;

            import java.util.Arrays;
            
            public final class Ilil01iiO implements Ilil00111O {
                public final float[] I00000oIO;
                public final float[] I00000oOI;

                public Ilil01iiO(float[] fArr, float[] fArr2) {
/* 6 */             if (fArr.length != fArr2.length || fArr.length == 0) {
/* 18 */                I000II.I000iOII("Array lengths must match and be nonzero");
/* 37 */                throw null;
                    }
/* 11 */            this.I00000oIO = fArr;
/* 13 */            this.I00000oOI = fArr2;
                }

                @Override
                public final float I00000oIO(float f) {
/* 5 */             return iliiiIoIoI.I00000oIO(f, this.I00000oOI, this.I00000oIO);
                }

                @Override
                public final float I00000oOI(float f) {
/* 5 */             return iliiiIoIoI.I00000oIO(f, this.I00000oIO, this.I00000oOI);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof Ilil01iiO)) {
/* 36 */                return false;
                    }
/* 12 */            Ilil01iiO ilil01iiO = (Ilil01iiO) obj;
                    return Arrays.equals(this.I00000oIO, ilil01iiO.I00000oIO) && Arrays.equals(this.I00000oOI, ilil01iiO.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return Arrays.hashCode(this.I00000oOI) + (Arrays.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("FontScaleConverter{fromSpValues=", Arrays.toString(this.I00000oIO), ", toDpValues=", Arrays.toString(this.I00000oOI), "}");
                }
            }
