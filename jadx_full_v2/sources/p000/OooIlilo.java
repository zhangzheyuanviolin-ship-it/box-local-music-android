            package p000;
            
/* 62 */    public final class OooIlilo {
                public final boolean I00000oIO;
                public final OooIOlo0iOiI I00000oOI;
                public final int I0000Il00O;
                public final Ii1I0iO000o[] I0000O;
                public int I0000oI00;
                public final float[] I0001Ioi1lo;
                public final float[] I000II;
                public final float[] I000O01llI0;

                public OooIlilo(boolean z, OooIOlo0iOiI oooIOlo0iOiI) {
                    int i;
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = oooIOlo0iOiI;
/* 9 */             if (z && oooIOlo0iOiI.equals(OooIOlo0iOiI.I00iOIl)) {
/* 22 */                I000II.I001IO000("Lsq2 not (yet) supported for differential axes");
/* 25 */                throw null;
                    }
/* 26 */            int iOrdinal = oooIOlo0iOiI.ordinal();
/* 31 */            if (iOrdinal == 0) {
/* 42 */                i = 3;
                    } else {
/* 34 */                if (iOrdinal != 1) {
/* 38 */                    I000II.I00000oIO();
/* 41 */                    throw null;
                        }
/* 36 */                i = 2;
                    }
/* 43 */            this.I0000Il00O = i;
/* 49 */            this.I0000O = new Ii1I0iO000o[20];
/* 53 */            this.I0001Ioi1lo = new float[20];
/* 57 */            this.I000II = new float[20];
/* 61 */            this.I000O01llI0 = new float[3];
                }

                public final void I00000oIO(float f, long j) {
/* 5 */             int i = (this.I0000oI00 + 1) % 20;
/* 7 */             this.I0000oI00 = i;
/* 9 */             Ii1I0iO000o[] ii1I0iO000oArr = this.I0000O;
/* 11 */            Ii1I0iO000o ii1I0iO000o = ii1I0iO000oArr[i];
/* 13 */            if (ii1I0iO000o != null) {
/* 27 */                ii1I0iO000o.I00000oIO = j;
/* 29 */                ii1I0iO000o.I00000oOI = f;
                    } else {
/* 17 */                Ii1I0iO000o ii1I0iO000o2 = new Ii1I0iO000o();
/* 20 */                ii1I0iO000o2.I00000oIO = j;
/* 22 */                ii1I0iO000o2.I00000oOI = f;
/* 24 */                ii1I0iO000oArr[i] = ii1I0iO000o2;
                    }
                }

                public final float I00000oOI() {
                    boolean z;
                    OooIOlo0iOiI oooIOlo0iOiI;
                    float[] fArr;
                    int i;
                    float[] fArr2;
                    int i2;
                    float f;
                    float f2;
                    float fSignum;
/* 3 */             int i3 = this.I0000oI00;
/* 5 */             Ii1I0iO000o[] ii1I0iO000oArr = this.I0000O;
/* 7 */             Ii1I0iO000o ii1I0iO000o = ii1I0iO000oArr[i3];
/* 9 */             if (ii1I0iO000o == null) {
/* 11 */                return 0.0f;
                    }
/* 14 */            int i4 = 0;
/* 15 */            Ii1I0iO000o ii1I0iO000o2 = ii1I0iO000o;
/* 93 */            do {
/* 16 */                Ii1I0iO000o ii1I0iO000o3 = ii1I0iO000oArr[i3];
/* 18 */                z = this.I00000oIO;
/* 20 */                oooIOlo0iOiI = this.I00000oOI;
/* 22 */                float[] fArr3 = this.I0001Ioi1lo;
/* 24 */                fArr = this.I000II;
/* 26 */                if (ii1I0iO000o3 == null) {
/* 28 */                    i = i4;
/* 30 */                    fArr2 = fArr3;
/* 32 */                    i2 = 1;
/* 33 */                    f = 0.0f;
                        } else {
/* 35 */                    long j = ii1I0iO000o.I00000oIO;
/* 37 */                    i = i4;
/* 39 */                    f = 0.0f;
/* 40 */                    long j2 = ii1I0iO000o3.I00000oIO;
/* 42 */                    float f3 = j - j2;
/* 44 */                    fArr2 = fArr3;
/* 46 */                    i2 = 1;
/* 50 */                    float fAbs = Math.abs(j2 - ii1I0iO000o2.I00000oIO);
/* 64 */                    ii1I0iO000o2 = (oooIOlo0iOiI == OooIOlo0iOiI.I00iOIl || z) ? ii1I0iO000o3 : ii1I0iO000o;
/* 69 */                    if (f3 <= 100.0f && fAbs <= 40.0f) {
/* 80 */                        fArr2[i] = ii1I0iO000o3.I00000oOI;
/* 83 */                        fArr[i] = -f3;
/* 87 */                        if (i3 == 0) {
/* 89 */                            i3 = 20;
                                }
/* 90 */                        i3--;
/* 91 */                        i4 = i + 1;
                            }
                        }
/* 96 */                i4 = i;
                        break;
/* 93 */            } while (i4 < 20);
/* 100 */           if (i4 < this.I0000Il00O) {
/* 245 */               return f;
                    }
/* 102 */           int iOrdinal = oooIOlo0iOiI.ordinal();
/* 106 */           if (iOrdinal == 0) {
                        try {
/* 197 */                   float[] fArr4 = this.I000O01llI0;
/* 201 */                   li1OoIoi01oI.I00000oOI(fArr, fArr2, i4, fArr4);
/* 205 */                   f2 = fArr4[1];
                        } catch (IllegalArgumentException unused) {
/* 208 */                   f2 = f;
                        }
/* 209 */               fSignum = f2;
                    } else {
/* 108 */               if (iOrdinal != i2) {
/* 193 */                   I000II.I00000oIO();
/* 196 */                   return f;
                        }
/* 110 */               int i5 = i4 - i2;
/* 111 */               float f4 = fArr[i5];
/* 113 */               int i6 = i5;
/* 114 */               float f5 = f;
/* 117 */               while (i6 > 0) {
                            int i7 = i6 - 1;
/* 121 */                   float f6 = fArr[i7];
/* 125 */                   if (f4 != f6) {
/* 141 */                       float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
/* 165 */                       float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
/* 166 */                       if (i6 == i5) {
/* 170 */                           fAbs2 *= 0.5f;
                                }
/* 171 */                       f5 = fAbs2;
                            }
                            i6--;
/* 174 */                   f4 = f6;
                        }
/* 191 */               fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
                    }
/* 212 */           return fSignum * 1000.0f;
                }

                public final float I0000Il00O(float f) {
/* 4 */             if (f <= 0.0f) {
/* 21 */                IolioOO1.I0000Il00O("maximumVelocity should be a positive value. You specified=" + f);
                    }
/* 24 */            float fI00000oOI = I00000oOI();
/* 30 */            if (fI00000oOI == 0.0f || Float.isNaN(fI00000oOI)) {
/* 1 */                 return 0.0f;
                    }
/* 42 */            if (fI00000oOI <= 0.0f) {
/* 49 */                float f2 = -f;
/* 52 */                if (fI00000oOI < f2) {
/* 54 */                    return f2;
                        }
                    } else if (fI00000oOI > f) {
/* 48 */                return f;
                    }
/* 77 */            return fI00000oOI;
                }

/* 63 */        public OooIlilo() {
/* 64 */            this(false, OooIOlo0iOiI.I00iOIl);
                }

/* 64 */        public OooIlilo(boolean z) {
/* 65 */            this(z, OooIOlo0iOiI.I00iiI);
                }
            }
