            package p000;
            
            public interface IiIooOOOI {
                float I00000oIO();

                default long I00100l0(float f) {
/* 1 */             float[] fArr = Ilil01iI0O1i.I00000oIO;
/* 17 */            if (I00Ol00() < 1.03f) {
/* 50 */                return lOlilO1lOIO.I0000oI00(f / I00Ol00(), 4294967296L);
                    }
/* 23 */            Ilil00111O ilil00111OI00000oIO = Ilil01iI0O1i.I00000oIO(I00Ol00());
/* 40 */            return lOlilO1lOIO.I0000oI00(ilil00111OI00000oIO != null ? ilil00111OI00000oIO.I00000oIO(f) : f / I00Ol00(), 4294967296L);
                }

                default long I00100o1O0lo(long j) {
/* 8 */             if (j != 9205357640488583168L) {
/* 38 */                return il1llI.I00000oIO(I00OIO1(Float.intBitsToFloat((int) (j >> 32))), I00OIO1(Float.intBitsToFloat((int) (j & 4294967295L))));
                    }
/* 1 */             return 9205357640488583168L;
                }

                default float I001lIiIIo1O(long j) {
/* 14 */            if (!Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 4294967296L)) {
/* 18 */                Ioliol1Ii.I00000oOI("Only Sp can convert to Px");
                    }
/* 21 */            float[] fArr = Ilil01iI0O1i.I00000oIO;
/* 32 */            if (I00Ol00() < 1.03f) {
/* 71 */                return I00Ol00() * Oo0o1OiIo.I0000O(j);
                    }
/* 38 */            Ilil00111O ilil00111OI00000oIO = Ilil01iI0O1i.I00000oIO(I00Ol00());
/* 42 */            if (ilil00111OI00000oIO != null) {
/* 58 */                return ilil00111OI00000oIO.I00000oOI(Oo0o1OiIo.I0000O(j));
                    }
/* 52 */            return I00Ol00() * Oo0o1OiIo.I0000O(j);
                }

                default long I00IioO0OiOi(int i) {
/* 5 */             return I00100l0(I00O0o1oo(i));
                }

                default long I00Io1o110i(float f) {
/* 5 */             return I00100l0(I00OIO1(f));
                }

                default float I00O0o1oo(int i) {
/* 6 */             return i / I00000oIO();
                }

                default float I00OIO1(float f) {
/* 5 */             return f / I00000oIO();
                }

                float I00Ol00();

                default float I00i0ilIl0i(float f) {
/* 5 */             return I00000oIO() * f;
                }

                default int I00iio(long j) {
/* 5 */             return Math.round(I00oO101o(j));
                }

                default int I00l0OO0IO(float f) {
/* 1 */             float fI00i0ilIl0i = I00i0ilIl0i(f);
/* 9 */             if (Float.isInfinite(fI00i0ilIl0i)) {
/* 11 */                return Integer.MAX_VALUE;
                    }
/* 15 */            return Math.round(fI00i0ilIl0i);
                }

                default long I00oI0i(long j) {
/* 8 */             if (j == 9205357640488583168L) {
/* 1 */                 return 9205357640488583168L;
                    }
/* 14 */            float fI00i0ilIl0i = I00i0ilIl0i(Iil1iI01I0O0.I00000oOI(j));
/* 22 */            float fI00i0ilIl0i2 = I00i0ilIl0i(Iil1iI01I0O0.I00000oIO(j));
/* 46 */            return (Float.floatToRawIntBits(fI00i0ilIl0i) << 32) | (Float.floatToRawIntBits(fI00i0ilIl0i2) & 4294967295L);
                }

                default float I00oO101o(long j) {
/* 14 */            if (!Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 4294967296L)) {
/* 18 */                Ioliol1Ii.I00000oOI("Only Sp can convert to Px");
                    }
/* 25 */            return I00i0ilIl0i(I001lIiIIo1O(j));
                }
            }
