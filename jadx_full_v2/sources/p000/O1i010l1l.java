            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class O1i010l1l {
                public float[] I00000oIO;

                public static final O1i010l1l I00000oIO(float[] fArr) {
/* 3 */             O1i010l1l o1i010l1l = new O1i010l1l();
/* 6 */             o1i010l1l.I00000oIO = fArr;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return o1i010l1l;
                }

                public static float[] I00000oOI() {
/* 3 */             return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
                }

                public static final long I0000Il00O(long j, float[] fArr) {
/* 4 */             if (fArr.length < 16) {
/* 6 */                 return j;
                    }
/* 8 */             float f = fArr[0];
/* 11 */            float f2 = fArr[1];
/* 14 */            float f3 = fArr[3];
/* 17 */            float f4 = fArr[4];
/* 20 */            float f5 = fArr[5];
/* 23 */            float f6 = fArr[7];
/* 27 */            float f7 = fArr[12];
/* 31 */            float f8 = fArr[13];
/* 35 */            float f9 = fArr[15];
/* 42 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 53 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 63 */            float f10 = 1.0f / (((f6 * fIntBitsToFloat2) + (f3 * fIntBitsToFloat)) + f9);
/* 74 */            if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
/* 77 */                f10 = 0.0f;
                    }
/* 84 */            float f11 = f5 * fIntBitsToFloat2;
/* 100 */           return (Float.floatToRawIntBits((((f4 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits((f11 + (f2 * fIntBitsToFloat) + f8) * f10) & 4294967295L);
                }

                public static final void I0000O(float[] fArr, II1i0i0ilO iI1i0i0ilO) {
/* 8 */             if (fArr.length < 16) {
/* 10 */                return;
                    }
/* 12 */            float f = fArr[0];
/* 15 */            float f2 = fArr[1];
/* 18 */            float f3 = fArr[3];
/* 21 */            float f4 = fArr[4];
/* 24 */            float f5 = fArr[5];
/* 27 */            float f6 = fArr[7];
/* 31 */            float f7 = fArr[12];
/* 35 */            float f8 = fArr[13];
/* 39 */            float f9 = fArr[15];
/* 41 */            float f10 = iI1i0i0ilO.I00000oOI;
/* 43 */            float f11 = iI1i0i0ilO.I0000Il00O;
/* 45 */            float f12 = iI1i0i0ilO.I0000O;
/* 47 */            float f13 = iI1i0i0ilO.I0000oI00;
/* 49 */            float f14 = f3 * f10;
/* 51 */            float f15 = f6 * f11;
/* 59 */            float f16 = 1.0f / ((f14 + f15) + f9);
/* 78 */            if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
/* 81 */                f16 = 0.0f;
                    }
/* 83 */            float f17 = f * f10;
/* 85 */            float f18 = f4 * f11;
/* 91 */            float f19 = (f17 + f18 + f7) * f16;
/* 93 */            float f20 = f10 * f2;
/* 94 */            float f21 = f11 * f5;
/* 101 */           float f22 = (f20 + f21 + f8) * f16;
/* 103 */           float f23 = f6 * f13;
/* 107 */           float f24 = 1.0f / ((f14 + f23) + f9);
/* 121 */           if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
/* 124 */               f24 = 0.0f;
                    }
/* 126 */           float f25 = f4 * f13;
/* 130 */           float f26 = (f17 + f25 + f7) * f24;
/* 131 */           float f27 = f5 * f13;
/* 134 */           float f28 = (f20 + f27 + f8) * f24;
/* 135 */           float f29 = f3 * f12;
/* 140 */           float f30 = 1.0f / ((f15 + f29) + f9);
/* 150 */           if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
/* 153 */               f30 = 0.0f;
                    }
/* 155 */           float f31 = f * f12;
/* 161 */           float f32 = (f31 + f18 + f7) * f30;
/* 163 */           float f33 = f12 * f2;
/* 167 */           float f34 = (f21 + f33 + f8) * f30;
/* 171 */           float f35 = 1.0f / ((f29 + f23) + f9);
/* 181 */           float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
/* 187 */           float f37 = (f31 + f25 + f7) * f36;
/* 191 */           float f38 = (f33 + f27 + f8) * f36;
/* 205 */           iI1i0i0ilO.I00000oOI = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
/* 219 */           iI1i0i0ilO.I0000Il00O = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
/* 233 */           iI1i0i0ilO.I0000O = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
/* 247 */           iI1i0i0ilO.I0000oI00 = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
                }

                public static final void I0000oI00(float[] fArr) {
/* 4 */             if (fArr.length < 16) {
/* 6 */                 return;
                    }
/* 10 */            fArr[0] = 1.0f;
/* 14 */            fArr[1] = 0.0f;
/* 17 */            fArr[2] = 0.0f;
/* 20 */            fArr[3] = 0.0f;
/* 23 */            fArr[4] = 0.0f;
/* 26 */            fArr[5] = 1.0f;
/* 29 */            fArr[6] = 0.0f;
/* 32 */            fArr[7] = 0.0f;
/* 36 */            fArr[8] = 0.0f;
/* 40 */            fArr[9] = 0.0f;
/* 44 */            fArr[10] = 1.0f;
/* 48 */            fArr[11] = 0.0f;
/* 52 */            fArr[12] = 0.0f;
/* 56 */            fArr[13] = 0.0f;
/* 60 */            fArr[14] = 0.0f;
/* 64 */            fArr[15] = 1.0f;
                }

                public static final void I0001Ioi1lo(float[] fArr, float f, float f2) {
/* 4 */             if (fArr.length < 16) {
/* 6 */                 return;
                    }
/* 11 */            fArr[0] = fArr[0] * f;
/* 17 */            fArr[1] = fArr[1] * f;
/* 23 */            fArr[2] = fArr[2] * f;
/* 29 */            fArr[3] = fArr[3] * f;
/* 35 */            fArr[4] = fArr[4] * f2;
/* 41 */            fArr[5] = fArr[5] * f2;
/* 47 */            fArr[6] = fArr[6] * f2;
/* 53 */            fArr[7] = fArr[7] * f2;
/* 62 */            fArr[8] = fArr[8] * 1.0f;
/* 69 */            fArr[9] = fArr[9] * 1.0f;
/* 76 */            fArr[10] = fArr[10] * 1.0f;
/* 83 */            fArr[11] = fArr[11] * 1.0f;
                }

                public static final void I000II(float[] fArr, float[] fArr2) {
/* 8 */             if (fArr.length >= 16 && fArr2.length >= 16) {
/* 16 */                float f = fArr[0];
/* 18 */                float f2 = fArr2[0];
/* 23 */                float f3 = fArr[1];
/* 26 */                float f4 = fArr2[4];
/* 32 */                float f5 = fArr[2];
/* 36 */                float f6 = fArr2[8];
/* 38 */                float f7 = f5 * f6;
/* 42 */                float f8 = fArr[3];
/* 46 */                float f9 = fArr2[12];
/* 48 */                float f10 = f8 * f9;
/* 50 */                float f11 = f10 + f7 + (f3 * f4) + (f * f2);
/* 52 */                float f12 = fArr2[1];
/* 58 */                float f13 = fArr2[5];
/* 66 */                float f14 = fArr2[9];
/* 68 */                float f15 = f5 * f14;
/* 74 */                float f16 = fArr2[13];
/* 76 */                float f17 = f8 * f16;
/* 78 */                float f18 = f17 + f15 + (f3 * f13) + (f * f12);
/* 80 */                float f19 = fArr2[2];
/* 86 */                float f20 = fArr2[6];
/* 94 */                float f21 = fArr2[10];
/* 96 */                float f22 = f5 * f21;
/* 102 */               float f23 = fArr2[14];
/* 104 */               float f24 = f8 * f23;
/* 106 */               float f25 = f24 + f22 + (f3 * f20) + (f * f19);
/* 108 */               float f26 = fArr2[3];
/* 114 */               float f27 = fArr2[7];
/* 121 */               float f28 = fArr2[11];
/* 123 */               float f29 = f5 * f28;
/* 128 */               float f30 = fArr2[15];
/* 130 */               float f31 = f8 * f30;
/* 131 */               float f32 = f31 + f29 + (f3 * f27) + (f * f26);
/* 132 */               float f33 = fArr[4];
/* 136 */               float f34 = fArr[5];
/* 142 */               float f35 = fArr[6];
/* 146 */               float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
/* 148 */               float f37 = fArr[7];
/* 152 */               float f38 = (f37 * f9) + f36;
/* 166 */               float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
/* 180 */               float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
/* 188 */               float f41 = f35 * f28;
/* 192 */               float f42 = f37 * f30;
/* 194 */               float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
/* 196 */               float f44 = fArr[8];
/* 200 */               float f45 = fArr[9];
/* 206 */               float f46 = fArr[10];
/* 210 */               float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
/* 212 */               float f48 = fArr[11];
/* 216 */               float f49 = (f48 * f9) + f47;
/* 230 */               float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
/* 244 */               float f51 = (f48 * f23) + (f46 * f21) + (f45 * f20) + (f44 * f19);
/* 252 */               float f52 = f46 * f28;
/* 256 */               float f53 = f48 * f30;
/* 258 */               float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
/* 260 */               float f55 = fArr[12];
/* 263 */               float f56 = fArr[13];
/* 267 */               float f57 = (f4 * f56) + (f2 * f55);
/* 268 */               float f58 = fArr[14];
/* 271 */               float f59 = (f6 * f58) + f57;
/* 272 */               float f60 = fArr[15];
/* 276 */               float f61 = (f9 * f60) + f59;
/* 283 */               float f62 = f14 * f58;
/* 287 */               float f63 = f16 * f60;
/* 289 */               float f64 = f63 + f62 + (f13 * f56) + (f12 * f55);
/* 297 */               float f65 = f21 * f58;
/* 301 */               float f66 = f23 * f60;
/* 303 */               float f67 = f66 + f65 + (f20 * f56) + (f19 * f55);
/* 311 */               float f68 = f58 * f28;
/* 315 */               float f69 = f60 * f30;
/* 317 */               fArr[0] = f11;
/* 319 */               fArr[1] = f18;
/* 321 */               fArr[2] = f25;
/* 323 */               fArr[3] = f32;
/* 325 */               fArr[4] = f38;
/* 327 */               fArr[5] = f39;
/* 329 */               fArr[6] = f40;
/* 331 */               fArr[7] = f43;
/* 333 */               fArr[8] = f49;
/* 335 */               fArr[9] = f50;
/* 337 */               fArr[10] = f51;
/* 339 */               fArr[11] = f54;
/* 341 */               fArr[12] = f61;
/* 343 */               fArr[13] = f64;
/* 345 */               fArr[14] = f67;
/* 347 */               fArr[15] = f69 + f68 + (f56 * f27) + (f55 * f26);
                    }
                }

                public static final void I000O01llI0(float[] fArr, float f, float f2) {
/* 4 */             if (fArr.length < 16) {
/* 6 */                 return;
                    }
/* 27 */            float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
/* 47 */            float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
/* 67 */            float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
/* 87 */            float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
/* 88 */            fArr[12] = f3;
/* 90 */            fArr[13] = f4;
/* 92 */            fArr[14] = f5;
/* 94 */            fArr[15] = f6;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O1i010l1l) && O0000Ioio00.I0000O(this.I00000oIO, ((O1i010l1l) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             float[] fArr = this.I00000oIO;
/* 6 */             float f = fArr[0];
/* 9 */             float f2 = fArr[1];
/* 12 */            float f3 = fArr[2];
/* 15 */            float f4 = fArr[3];
/* 18 */            float f5 = fArr[4];
/* 21 */            float f6 = fArr[5];
/* 24 */            float f7 = fArr[6];
/* 27 */            float f8 = fArr[7];
/* 31 */            float f9 = fArr[8];
/* 35 */            float f10 = fArr[9];
/* 39 */            float f11 = fArr[10];
/* 43 */            float f12 = fArr[11];
/* 47 */            float f13 = fArr[12];
/* 51 */            float f14 = fArr[13];
/* 55 */            float f15 = fArr[14];
/* 59 */            float f16 = fArr[15];
/* 69 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("\n            |", f, " ", f2, " ");
/* 73 */            sbI00100l0.append(f3);
/* 76 */            sbI00100l0.append(" ");
/* 79 */            sbI00100l0.append(f4);
/* 84 */            sbI00100l0.append("|\n            |");
/* 87 */            sbI00100l0.append(f5);
/* 90 */            sbI00100l0.append(" ");
/* 93 */            sbI00100l0.append(f6);
/* 96 */            sbI00100l0.append(" ");
/* 99 */            sbI00100l0.append(f7);
/* 102 */           sbI00100l0.append(" ");
/* 105 */           sbI00100l0.append(f8);
/* 108 */           sbI00100l0.append("|\n            |");
/* 111 */           sbI00100l0.append(f9);
/* 114 */           sbI00100l0.append(" ");
/* 117 */           sbI00100l0.append(f10);
/* 120 */           sbI00100l0.append(" ");
/* 123 */           sbI00100l0.append(f11);
/* 126 */           sbI00100l0.append(" ");
/* 129 */           sbI00100l0.append(f12);
/* 132 */           sbI00100l0.append("|\n            |");
/* 135 */           sbI00100l0.append(f13);
/* 138 */           sbI00100l0.append(" ");
/* 141 */           sbI00100l0.append(f14);
/* 144 */           sbI00100l0.append(" ");
/* 149 */           sbI00100l0.append(f15);
/* 152 */           sbI00100l0.append(" ");
/* 157 */           sbI00100l0.append(f16);
/* 162 */           sbI00100l0.append("|\n        ");
/* 169 */           return OlOoOOooiIll.I0000Il00O(sbI00100l0.toString());
                }
            }
