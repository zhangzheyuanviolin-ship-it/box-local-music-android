            package p000;

            import android.graphics.PointF;
            import java.util.Arrays;
            
/* 13 */    public final class O1OoooIi1Ol0 implements Cloneable {
                public float[] I00iOIl;

                public O1OoooIi1Ol0() {
/* 11 */            this.I00iOIl = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                }

                public static O1OoooIi1Ol0 I0000Il00O(IIOoOiOI iIOoOiOI) {
/* 3 */             if (!(iIOoOiOI instanceof IIOoIilO)) {
/* 7 */                 return new O1OoooIi1Ol0();
                    }
/* 11 */            IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOI;
/* 20 */            if (iIOoIilO.I00iOIl.size() < 6) {
/* 24 */                return new O1OoooIi1Ol0();
                    }
/* 30 */            for (int i = 0; i < 6; i++) {
/* 38 */                if (!(iIOoIilO.I00lll10(i) instanceof IIi0IoOo)) {
/* 42 */                    return new O1OoooIi1Ol0();
                        }
                    }
/* 51 */            O1OoooIi1Ol0 o1OoooIi1Ol0 = new O1OoooIi1Ol0();
/* 56 */            float[] fArr = new float[9];
/* 58 */            o1OoooIi1Ol0.I00iOIl = fArr;
/* 70 */            fArr[0] = ((IIi0IoOo) iIOoIilO.I00lll10(0)).I00ioIO();
/* 85 */            o1OoooIi1Ol0.I00iOIl[1] = ((IIi0IoOo) iIOoIilO.I00lll10(1)).I00ioIO();
/* 101 */           o1OoooIi1Ol0.I00iOIl[3] = ((IIi0IoOo) iIOoIilO.I00lll10(2)).I00ioIO();
/* 116 */           o1OoooIi1Ol0.I00iOIl[4] = ((IIi0IoOo) iIOoIilO.I00lll10(3)).I00ioIO();
/* 130 */           o1OoooIi1Ol0.I00iOIl[6] = ((IIi0IoOo) iIOoIilO.I00lll10(4)).I00ioIO();
/* 146 */           o1OoooIi1Ol0.I00iOIl[7] = ((IIi0IoOo) iIOoIilO.I00lll10(5)).I00ioIO();
/* 154 */           o1OoooIi1Ol0.I00iOIl[8] = 1.0f;
/* 186 */           return o1OoooIi1Ol0;
                }

                public static O1OoooIi1Ol0 I0000oI00(float f, float f2) {
/* 11 */            return new O1OoooIi1Ol0(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
                }

                public static boolean I000O01llI0(float f) {
                    return Math.abs(f) <= Float.MAX_VALUE;
                }

                public final O1OoooIi1Ol0 clone() {
/* 11 */            return new O1OoooIi1Ol0((float[]) this.I00iOIl.clone());
                }

                public final I0i110Oli0 I00000oOI() {
/* 3 */             float[] fArr = this.I00iOIl;
/* 6 */             float f = fArr[0];
/* 9 */             float f2 = fArr[1];
/* 12 */            float f3 = fArr[3];
/* 15 */            float f4 = fArr[4];
/* 18 */            float f5 = fArr[6];
/* 21 */            float f6 = fArr[7];
/* 23 */            I0i110Oli0 i0i110Oli0 = new I0i110Oli0();
/* 27 */            i0i110Oli0.I00iOIl = f;
/* 30 */            i0i110Oli0.I00iiI = f2;
/* 33 */            i0i110Oli0.I00iiO = f3;
/* 36 */            i0i110Oli0.I00iio = f4;
/* 39 */            i0i110Oli0.I00ilI0I1 = f5;
/* 42 */            i0i110Oli0.I00ilO0 = f6;
/* 113 */           return i0i110Oli0;
                }

                public final float I0000O() {
/* 1 */             float[] fArr = this.I00iOIl;
/* 10 */            if (fArr[1] == 0.0f) {
/* 37 */                return fArr[0];
                    }
/* 35 */            return (float) Math.sqrt(Math.pow(this.I00iOIl[1], 2.0d) + Math.pow(fArr[0], 2.0d));
                }

                public final float I0001Ioi1lo() {
/* 4 */             return this.I00iOIl[6];
                }

                public final float I000II() {
/* 4 */             return this.I00iOIl[7];
                }

                public final O1OoooIi1Ol0 I000OOo1O(O1OoooIi1Ol0 o1OoooIi1Ol0, O1OoooIi1Ol0 o1OoooIi1Ol02) {
/* 18 */            float[] fArr = (o1OoooIi1Ol02 == null || o1OoooIi1Ol02 == o1OoooIi1Ol0 || o1OoooIi1Ol02 == this) ? new float[9] : o1OoooIi1Ol02.I00iOIl;
/* 20 */            float[] fArr2 = this.I00iOIl;
/* 22 */            float[] fArr3 = o1OoooIi1Ol0.I00iOIl;
/* 29 */            float f = fArr2[0] * fArr3[0];
/* 31 */            float f2 = fArr2[1];
/* 34 */            float f3 = fArr3[3];
/* 40 */            float f4 = fArr2[2];
/* 43 */            float f5 = fArr3[6];
/* 47 */            float f6 = (f4 * f5) + (f2 * f3) + f;
/* 48 */            fArr[0] = f6;
/* 50 */            float f7 = fArr2[0];
/* 54 */            float f8 = fArr3[1] * f7;
/* 57 */            float f9 = fArr3[4];
/* 63 */            float f10 = fArr3[7];
/* 69 */            fArr[1] = (f4 * f10) + (f2 * f9) + f8;
/* 73 */            float f11 = f7 * fArr3[2];
/* 74 */            float f12 = fArr2[1];
/* 78 */            float f13 = fArr3[5];
/* 85 */            float f14 = fArr3[8];
/* 90 */            fArr[2] = (f4 * f14) + (f12 * f13) + f11;
/* 92 */            float f15 = fArr2[3];
/* 94 */            float f16 = fArr3[0];
/* 97 */            float f17 = fArr2[4];
/* 100 */           float f18 = (f3 * f17) + (f15 * f16);
/* 101 */           float f19 = fArr2[5];
/* 107 */           fArr[3] = (f19 * f5) + f18;
/* 109 */           float f20 = fArr2[3];
/* 111 */           float f21 = fArr3[1];
/* 123 */           fArr[4] = (f19 * f10) + (f17 * f9) + (f20 * f21);
/* 125 */           float f22 = fArr3[2];
/* 138 */           fArr[5] = (f19 * f14) + (fArr2[4] * f13) + (f20 * f22);
/* 142 */           float f23 = fArr2[6] * f16;
/* 143 */           float f24 = fArr2[7];
/* 148 */           float f25 = (fArr3[3] * f24) + f23;
/* 149 */           float f26 = fArr2[8];
/* 153 */           fArr[6] = (f5 * f26) + f25;
/* 155 */           float f27 = fArr2[6];
/* 168 */           fArr[7] = (f10 * f26) + (f24 * fArr3[4]) + (f21 * f27);
/* 180 */           fArr[8] = (f26 * f14) + (fArr2[7] * fArr3[5]) + (f27 * f22);
/* 186 */           if (!I000O01llI0(f6) || !I000O01llI0(fArr[1]) || !I000O01llI0(fArr[2]) || !I000O01llI0(fArr[3]) || !I000O01llI0(fArr[4]) || !I000O01llI0(fArr[5]) || !I000O01llI0(fArr[6]) || !I000O01llI0(fArr[7]) || !I000O01llI0(fArr[8])) {
/* 265 */               I000II.I000iOII("Multiplying two matrices produces illegal values");
/* 268 */               return null;
                    }
/* 252 */           if (o1OoooIi1Ol02 == null) {
/* 256 */               return new O1OoooIi1Ol0(fArr);
                    }
/* 260 */           o1OoooIi1Ol02.I00iOIl = fArr;
/* 5 */             return o1OoooIi1Ol02;
                }

                public final PointF I000OiO(float f, float f2) {
/* 1 */             float[] fArr = this.I00iOIl;
/* 4 */             float f3 = fArr[0];
/* 7 */             float f4 = fArr[1];
/* 10 */            float f5 = fArr[3];
/* 13 */            float f6 = fArr[4];
/* 31 */            return new PointF((f5 * f2) + (f3 * f) + fArr[6], (f2 * f6) + (f * f4) + fArr[7]);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj != null && O1OoooIi1Ol0.class == obj.getClass()) {
/* 24 */                return Arrays.equals(this.I00iOIl, ((O1OoooIi1Ol0) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("[");
/* 13 */            sb.append(this.I00iOIl[0]);
/* 18 */            sb.append(",");
/* 26 */            sb.append(this.I00iOIl[1]);
/* 29 */            sb.append(",");
/* 37 */            sb.append(this.I00iOIl[3]);
/* 40 */            sb.append(",");
/* 48 */            sb.append(this.I00iOIl[4]);
/* 51 */            sb.append(",");
/* 59 */            sb.append(this.I00iOIl[6]);
/* 62 */            sb.append(",");
/* 72 */            return Oi010OO0.I001i1O0Ol(sb, this.I00iOIl[7], "]");
                }

/* 14 */        public O1OoooIi1Ol0(float[] fArr) {
/* 16 */            this.I00iOIl = fArr;
                }

/* 16 */        public O1OoooIi1Ol0(float f, float f2, float f3, float f4, float f5, float f6) {
/* 18 */            this.I00iOIl = new float[]{f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 1.0f};
                }
            }
