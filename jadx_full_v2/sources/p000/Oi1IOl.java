            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
/* 666 */   public final class Oi1IOl extends IOOl0ll {
                public static final OIiilo1Ool0o I0010I0i = new OIiilo1Ool0o(12);
                public final i001lolI1I I0000O;
                public final float I0000oI00;
                public final float I0001Ioi1lo;
                public final OoI0i1io I000II;
                public final float[] I000O01llI0;
                public final float[] I000OOo1O;
                public final float[] I000OiO;
                public final Iiio1OI0O0i I000iOII;
                public final Oi1IIIOloilO I000l1;
                public final Oi1I1O1O0o I000lI;
                public final Iiio1OI0O0i I000o00OoI0I;
                public final Oi1IIIOloilO I000oI1ioi;
                public final Oi1I1O1O0o I00100l0;
                public final boolean I00100o1O0lo;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:41:0x01f2  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x01f6  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x023a  */
                /* JADX WARN: Type inference failed for: r44v1 */
                /* JADX WARN: Type inference failed for: r44v2 */
                /* JADX WARN: Type inference failed for: r44v3 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Oi1IOl(String str, float[] fArr, i001lolI1I i001loli1i, float[] fArr2, Iiio1OI0O0i iiio1OI0O0i, Iiio1OI0O0i iiio1OI0O0i2, float f, float f2, OoI0i1io ooI0i1io, int i) {
                    ?? r44;
                    float f3;
                    float[] fArr3;
                    float f4;
                    double d;
                    boolean z;
/* 26 */            super(i, 12884901888L, str);
/* 29 */            this.I0000O = i001loli1i;
/* 31 */            this.I0000oI00 = f;
/* 33 */            this.I0001Ioi1lo = f2;
/* 37 */            this.I000II = ooI0i1io;
/* 39 */            this.I000iOII = iiio1OI0O0i;
/* 47 */            this.I000l1 = new Oi1IIIOloilO(this, 1);
/* 52 */            Oi1I1O1O0o oi1I1O1O0o = new Oi1I1O1O0o(0);
/* 55 */            oi1I1O1O0o.I00iiI = this;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            this.I000lI = oi1I1O1O0o;
/* 62 */            this.I000o00OoI0I = iiio1OI0O0i2;
/* 69 */            this.I000oI1ioi = new Oi1IIIOloilO(this, 0);
/* 73 */            Oi1I1O1O0o oi1I1O1O0o2 = new Oi1I1O1O0o(1);
/* 76 */            oi1I1O1O0o2.I00iiI = this;
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            this.I00100l0 = oi1I1O1O0o2;
/* 88 */            if (fArr.length != 6 && fArr.length != 9) {
/* 96 */                I000II.I000iOII("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
/* 99 */                throw null;
                    }
/* 102 */           if (f >= f2) {
/* 2739 */              throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
                    }
/* 104 */           float[] fArr4 = new float[6];
/* 119 */           if (fArr.length == 9) {
/* 121 */               float f5 = fArr[0];
/* 123 */               float f6 = fArr[1];
/* 129 */               float f7 = f5 + f6 + fArr[2];
/* 133 */               fArr4[0] = f5 / f7;
/* 137 */               fArr4[1] = f6 / f7;
/* 139 */               float f8 = fArr[3];
/* 141 */               float f9 = fArr[4];
/* 147 */               float f10 = f8 + f9 + fArr[5];
/* 151 */               fArr4[2] = f8 / f10;
/* 155 */               fArr4[3] = f9 / f10;
/* 157 */               float f11 = fArr[6];
/* 159 */               float f12 = fArr[7];
/* 165 */               float f13 = f11 + f12 + fArr[8];
/* 169 */               fArr4[4] = f11 / f13;
/* 173 */               fArr4[5] = f12 / f13;
                    } else {
/* 176 */               I1IoiO1l.I000o00OoI0I(fArr, fArr4, 6);
                    }
/* 179 */           this.I000O01llI0 = fArr4;
/* 181 */           if (fArr2 == null) {
/* 183 */               float f14 = fArr4[0];
/* 185 */               float f15 = fArr4[1];
/* 187 */               float f16 = fArr4[2];
/* 189 */               float f17 = fArr4[3];
/* 191 */               float f18 = fArr4[4];
/* 193 */               float f19 = fArr4[5];
/* 195 */               f3 = 1.0f;
/* 197 */               float f20 = i001loli1i.I00000oIO;
/* 199 */               r44 = 1;
/* 201 */               float f21 = i001loli1i.I00000oOI;
/* 203 */               float f22 = 1.0f - f14;
/* 205 */               float f23 = f22 / f15;
/* 207 */               float f24 = 1.0f - f16;
/* 211 */               float f25 = 1.0f - f18;
/* 217 */               float f26 = (1.0f - f20) / f21;
/* 219 */               float f27 = f14 / f15;
/* 228 */               float f28 = (f16 / f17) - f27;
/* 232 */               float f29 = (f20 / f21) - f27;
/* 234 */               float f30 = (f24 / f17) - f23;
/* 244 */               float f31 = (f18 / f19) - f27;
/* 250 */               float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
/* 256 */               float f33 = (f29 - (f31 * f32)) / f28;
/* 260 */               float f34 = (1.0f - f33) - f32;
/* 262 */               float f35 = f34 / f15;
/* 264 */               float f36 = f33 / f17;
/* 266 */               float f37 = f32 / f19;
/* 286 */               fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
/* 306 */               this.I000OOo1O = fArr3;
                    } else {
/* 309 */               r44 = 1;
/* 311 */               f3 = 1.0f;
/* 314 */               if (fArr2.length != 9) {
/* 631 */                   I000II.I000iOII(Oi010OO0.I000oI1ioi(fArr2.length, "Transform must have 9 entries! Has "));
/* 634 */                   throw null;
                        }
/* 316 */               this.I000OOo1O = fArr2;
/* 318 */               fArr3 = fArr2;
                    }
/* 323 */           this.I000OiO = iiOiII0.I0000oI00(fArr3);
/* 325 */           float fI00000oIO = lIoiio1iOI0.I00000oIO(fArr4);
/* 329 */           float[] fArr5 = IOOlIOOi0O0.I00000oIO;
/* 343 */           if (fI00000oIO / lIoiio1iOI0.I00000oIO(IOOlIOOi0O0.I00000oOI) > 0.9f) {
/* 345 */               float[] fArr6 = IOOlIOOi0O0.I00000oIO;
/* 347 */               float f38 = fArr4[0];
/* 349 */               float f39 = fArr6[0];
/* 352 */               float f40 = fArr4[r44];
/* 354 */               float f41 = fArr6[r44];
/* 357 */               float f42 = fArr4[2];
/* 359 */               float f43 = fArr6[2];
/* 363 */               float f44 = fArr4[3];
/* 365 */               float f45 = fArr6[3];
/* 369 */               float f46 = fArr4[4];
/* 371 */               float f47 = fArr6[4];
/* 375 */               float f48 = fArr4[5];
/* 377 */               float f49 = fArr6[5];
/* 381 */               f4 = 0.0f;
/* 383 */               float[] fArr7 = new float[6];
/* 385 */               fArr7[0] = f38 - f39;
/* 387 */               fArr7[r44] = f40 - f41;
/* 389 */               fArr7[2] = f42 - f43;
/* 391 */               fArr7[3] = f44 - f45;
/* 393 */               fArr7[4] = f46 - f47;
/* 395 */               fArr7[5] = f48 - f49;
/* 397 */               float f50 = fArr7[0];
/* 399 */               float f51 = fArr7[r44];
/* 413 */               if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
/* 430 */                   float f52 = fArr7[2];
/* 432 */                   float f53 = fArr7[3];
/* 446 */                   if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
/* 463 */                       float f54 = fArr7[4];
/* 465 */                       float f55 = fArr7[5];
/* 478 */                       if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                                }
                            }
                        }
/* 497 */               if (i != 0) {
/* 503 */                   float[] fArr8 = IOOlIOOi0O0.I00000oIO;
/* 505 */                   if (fArr4 != fArr8) {
/* 509 */                       for (int i2 = 0; i2 < 6; i2++) {
/* 519 */                           if (Float.compare(fArr4[i2], fArr8[i2]) != 0 && Math.abs(fArr4[i2] - fArr8[i2]) > 0.001f) {
                                        break;
                                    }
                                }
/* 548 */                       if (iiOiII0.I0000Il00O(i001loli1i, iIo1Iiloo.I0000O)) {
/* 559 */                           float[] fArr9 = IOOlIOOi0O0.I00000oIO;
/* 561 */                           Oi1IOl oi1IOl = IOOlIOOi0O0.I0000oI00;
/* 569 */                           while (d <= 1.0d) {
                                    }
/* 499 */                           z = r44;
                                }
/* 537 */                       z = false;
                                break;
                            }
/* 548 */                   if (iiOiII0.I0000Il00O(i001loli1i, iIo1Iiloo.I0000O) && f == f4 && f2 == f3) {
/* 559 */                       float[] fArr92 = IOOlIOOi0O0.I00000oIO;
/* 561 */                       Oi1IOl oi1IOl2 = IOOlIOOi0O0.I0000oI00;
/* 569 */                       for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
/* 593 */                           if (Math.abs(iiio1OI0O0i.I0000O(d) - oi1IOl2.I000iOII.I0000O(d)) <= 0.001d && Math.abs(iiio1OI0O0i2.I0000O(d) - oi1IOl2.I000o00OoI0I.I0000O(d)) <= 0.001d) {
                                    }
                                }
/* 499 */                       z = r44;
                            }
/* 537 */                   z = false;
                            break;
                        }
/* 499 */               z = r44;
/* 621 */               this.I00100o1O0lo = z;
                    }
/* 493 */           f4 = 0.0f;
/* 495 */           int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
/* 497 */           if (i != 0) {
                    }
/* 621 */           this.I00100o1O0lo = z;
                }

                @Override
                public final float I00000oIO(int i) {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public final float I00000oOI(int i) {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00100o1O0lo;
                }

                @Override
                public final long I0000O(float f, float f2, float f3) {
                    double d = f;
/* 2 */             Oi1I1O1O0o oi1I1O1O0o = this.I00100l0;
/* 8 */             float fI0000O = (float) oi1I1O1O0o.I0000O(d);
/* 14 */            float fI0000O2 = (float) oi1I1O1O0o.I0000O(f2);
/* 20 */            float fI0000O3 = (float) oi1I1O1O0o.I0000O(f3);
/* 21 */            float[] fArr = this.I000OOo1O;
/* 26 */            if (fArr.length < 9) {
/* 28 */                return 0L;
                    }
/* 44 */            float f4 = (fArr[6] * fI0000O3) + (fArr[3] * fI0000O2) + (fArr[0] * fI0000O);
/* 58 */            float f5 = (fArr[7] * fI0000O3) + (fArr[4] * fI0000O2) + (fArr[1] * fI0000O);
/* 79 */            return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
                }

                @Override
                public final float I0000oI00(float f, float f2, float f3) {
                    double d = f;
/* 2 */             Oi1I1O1O0o oi1I1O1O0o = this.I00100l0;
/* 8 */             float fI0000O = (float) oi1I1O1O0o.I0000O(d);
/* 14 */            float fI0000O2 = (float) oi1I1O1O0o.I0000O(f2);
/* 20 */            float fI0000O3 = (float) oi1I1O1O0o.I0000O(f3);
/* 22 */            float[] fArr = this.I000OOo1O;
/* 37 */            return (fArr[8] * fI0000O3) + (fArr[5] * fI0000O2) + (fArr[2] * fI0000O);
                }

                @Override
                public final long I0001Ioi1lo(float f, float f2, float f3, float f4, IOOl0ll iOOl0ll) {
/* 2 */             float[] fArr = this.I000OiO;
/* 16 */            float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
/* 30 */            float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
/* 45 */            float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
/* 47 */            Oi1I1O1O0o oi1I1O1O0o = this.I000lI;
/* 66 */            return iiO01ll11o1l.I00000oIO((float) oi1I1O1O0o.I0000O(f5), (float) oi1I1O1O0o.I0000O(f6), (float) oi1I1O1O0o.I0000O(f7), f4, iOOl0ll);
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || Oi1IOl.class != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 24 */            Oi1IOl oi1IOl = (Oi1IOl) obj;
/* 34 */            if (Float.compare(oi1IOl.I0000oI00, this.I0000oI00) != 0 || Float.compare(oi1IOl.I0001Ioi1lo, this.I0001Ioi1lo) != 0 || !O0000Ioio00.I0000O(this.I0000O, oi1IOl.I0000O) || !Arrays.equals(this.I000O01llI0, oi1IOl.I000O01llI0)) {
/* 5 */                 return false;
                    }
/* 70 */            OoI0i1io ooI0i1io = oi1IOl.I000II;
/* 72 */            OoI0i1io ooI0i1io2 = this.I000II;
/* 74 */            if (ooI0i1io2 != null) {
/* 76 */                return O0000Ioio00.I0000O(ooI0i1io2, ooI0i1io);
                    }
/* 81 */            if (ooI0i1io == null) {
/* 1 */                 return true;
                    }
/* 92 */            if (O0000Ioio00.I0000O(this.I000iOII, oi1IOl.I000iOII)) {
/* 99 */                return O0000Ioio00.I0000O(this.I000o00OoI0I, oi1IOl.I000o00OoI0I);
                    }
/* 5 */             return false;
                }

                @Override
                public final int hashCode() {
/* 23 */            int iHashCode = (Arrays.hashCode(this.I000O01llI0) + ((this.I0000O.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
/* 25 */            float f = this.I0000oI00;
/* 40 */            int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
/* 42 */            float f2 = this.I0001Ioi1lo;
/* 55 */            int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
/* 57 */            OoI0i1io ooI0i1io = this.I000II;
/* 65 */            int iHashCode2 = iFloatToIntBits2 + (ooI0i1io != null ? ooI0i1io.hashCode() : 0);
/* 66 */            if (ooI0i1io != null) {
/* 110 */               return iHashCode2;
                    }
/* 85 */            return this.I000o00OoI0I.hashCode() + ((this.I000iOII.hashCode() + (iHashCode2 * 31)) * 31);
                }

/* 667 */       public Oi1IOl(String str, float[] fArr, i001lolI1I i001loli1i, OoI0i1io ooI0i1io, int i) {
                    double d;
                    Oi1I1o oi1I1o;
                    Oi1I1o oi1I1o2;
/* 668 */           double d2 = ooI0i1io.I00000oIO;
                    int i2 = 0;
                    int i3 = 1;
                    boolean z = d2 == -3.0d;
/* 669 */           double d3 = ooI0i1io.I000II;
                    double d4 = ooI0i1io.I0001Ioi1lo;
                    if (z) {
                        d = -3.0d;
/* 670 */               oi1I1o = new Oi1I1o(4);
                        oi1I1o.I00iiI = ooI0i1io;
                        VarHandle.storeStoreFence();
                    } else {
                        d = -3.0d;
                        if (d2 == -2.0d) {
/* 671 */                   oi1I1o = new Oi1I1o(5);
                            oi1I1o.I00iiI = ooI0i1io;
                            VarHandle.storeStoreFence();
                        } else if (d4 == 0.0d && d3 == 0.0d) {
/* 672 */                   oi1I1o = new Oi1I1o(6);
                            oi1I1o.I00iiI = ooI0i1io;
                            VarHandle.storeStoreFence();
                        } else {
/* 673 */                   oi1I1o = new Oi1I1o(7);
                            oi1I1o.I00iiI = ooI0i1io;
                            VarHandle.storeStoreFence();
                        }
                    }
                    if (d2 == d) {
/* 674 */               oi1I1o2 = new Oi1I1o(i2);
                        oi1I1o2.I00iiI = ooI0i1io;
                        VarHandle.storeStoreFence();
                    } else if (d2 == -2.0d) {
/* 675 */               oi1I1o2 = new Oi1I1o(i3);
                        oi1I1o2.I00iiI = ooI0i1io;
                        VarHandle.storeStoreFence();
                    } else if (d4 == 0.0d && d3 == 0.0d) {
/* 676 */               oi1I1o2 = new Oi1I1o(2);
                        oi1I1o2.I00iiI = ooI0i1io;
                        VarHandle.storeStoreFence();
                    } else {
/* 677 */               oi1I1o2 = new Oi1I1o(3);
                        oi1I1o2.I00iiI = ooI0i1io;
                        VarHandle.storeStoreFence();
                    }
/* 678 */           this(str, fArr, i001loli1i, null, oi1I1o, oi1I1o2, 0.0f, 1.0f, ooI0i1io, i);
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [OIiilo1Ool0o] */
                /* JADX WARN: Type inference failed for: r3v2, types: [Oi1I1llilO] */
                /* JADX WARN: Type inference failed for: r3v3 */
/* 678 */       public Oi1IOl(String str, float[] fArr, i001lolI1I i001loli1i, double d, float f, float f2, int i) {
                    Oi1I1llilO oi1I1llilO;
/* 679 */           ?? oi1I1llilO2 = I0010I0i;
                    if (d == 1.0d) {
                        oi1I1llilO = oi1I1llilO2;
                    } else {
/* 680 */               Oi1I1llilO oi1I1llilO3 = new Oi1I1llilO(0);
                        oi1I1llilO3.I00iiI = d;
                        VarHandle.storeStoreFence();
                        oi1I1llilO = oi1I1llilO3;
                    }
                    if (d != 1.0d) {
/* 681 */               oi1I1llilO2 = new Oi1I1llilO(1);
                        oi1I1llilO2.I00iiI = d;
                        VarHandle.storeStoreFence();
                    }
                    Iiio1OI0O0i iiio1OI0O0i = oi1I1llilO2;
/* 683 */           this(str, fArr, i001loli1i, null, oi1I1llilO, iiio1OI0O0i, f, f2, new OoI0i1io(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
                }
            }
