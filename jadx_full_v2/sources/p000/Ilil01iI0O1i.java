            package p000;
            
            public abstract class Ilil01iI0O1i {
                public static final float[] I00000oIO = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
                public static volatile OlIIioolI I00000oOI = new OlIIioolI(0);
                public static final Object[] I0000Il00O;

                static {
/* 18 */            Object[] objArr = new Object[0];
/* 20 */            I0000Il00O = objArr;
                    synchronized (objArr) {
/* 42 */                I00000oOI.I0000Il00O(115, new Ilil01iiO(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
/* 64 */                I00000oOI.I0000Il00O(130, new Ilil01iiO(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
/* 86 */                I00000oOI.I0000Il00O(150, new Ilil01iiO(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
/* 108 */               I00000oOI.I0000Il00O(180, new Ilil01iiO(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
/* 130 */               I00000oOI.I0000Il00O(200, new Ilil01iiO(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
                    }
/* 153 */           if ((I00000oOI.I00000oOI(0) / 100.0f) - 0.01f > 1.03f) {
/* 155 */               return;
                    }
/* 158 */           Ioliol1Ii.I00000oOI("You should only apply non-linear scaling to font scales > 1");
                }

                public static Ilil00111O I00000oIO(float f) {
                    float fI00000oOI;
                    Ilil00111O ilil01iiO;
/* 1 */             float[] fArr = I00000oIO;
/* 8 */             if (f < 1.03f) {
/* 186 */               return null;
                    }
/* 10 */            OlIIioolI olIIioolI = I00000oOI;
/* 16 */            int i = (int) (f * 100.0f);
/* 17 */            olIIioolI.getClass();
/* 24 */            Ilil00111O ilil00111O = (Ilil00111O) iO10Oii01l.I00000oIO(olIIioolI, i);
/* 26 */            if (ilil00111O != null) {
/* 28 */                return ilil00111O;
                    }
/* 29 */            OlIIioolI olIIioolI2 = I00000oOI;
/* 33 */            if (olIIioolI2.I00iOIl) {
/* 35 */                iO10Oii01l.I00000oOI(olIIioolI2);
                    }
/* 42 */            int iI00000oIO = iIIl1I0OIlO0.I00000oIO(olIIioolI2.I00iio, i, olIIioolI2.I00iiI);
/* 46 */            if (iI00000oIO >= 0) {
/* 54 */                return (Ilil00111O) I00000oOI.I0000oI00(iI00000oIO);
                    }
/* 59 */            int i2 = -(iI00000oIO + 1);
                    int i3 = i2 - 1;
/* 71 */            if (i2 >= I00000oOI.I0000O()) {
/* 83 */                Ilil01iiO ilil01iiO2 = new Ilil01iiO(new float[]{1.0f}, new float[]{f});
/* 86 */                I00000oOI(f, ilil01iiO2);
/* 89 */                return ilil01iiO2;
                    }
/* 90 */            if (i3 < 0) {
/* 94 */                ilil01iiO = new Ilil01iiO(fArr, fArr);
/* 98 */                fI00000oOI = 1.0f;
                    } else {
/* 107 */               fI00000oOI = I00000oOI.I00000oOI(i3) / 100.0f;
/* 114 */               ilil01iiO = (Ilil00111O) I00000oOI.I0000oI00(i3);
                    }
/* 123 */           float fI00000oOI2 = I00000oOI.I00000oOI(i2) / 100.0f;
/* 144 */           float fMax = (Math.max(0.0f, Math.min(1.0f, fI00000oOI == fI00000oOI2 ? 0.0f : (f - fI00000oOI) / (fI00000oOI2 - fI00000oOI))) * 1.0f) + 0.0f;
/* 151 */           Ilil00111O ilil00111O2 = (Ilil00111O) I00000oOI.I0000oI00(i2);
/* 155 */           float[] fArr2 = new float[9];
/* 157 */           for (int i4 = 0; i4 < 9; i4++) {
/* 159 */               float f2 = fArr[i4];
/* 161 */               float fI00000oOI3 = ilil01iiO.I00000oOI(f2);
/* 172 */               fArr2[i4] = ((ilil00111O2.I00000oOI(f2) - fI00000oOI3) * fMax) + fI00000oOI3;
                    }
/* 179 */           Ilil01iiO ilil01iiO3 = new Ilil01iiO(fArr, fArr2);
/* 182 */           I00000oOI(f, ilil01iiO3);
/* 185 */           return ilil01iiO3;
                }

                public static void I00000oOI(float f, Ilil01iiO ilil01iiO) {
                    synchronized (I0000Il00O) {
/* 6 */                 OlIIioolI olIIioolIClone = I00000oOI.clone();
/* 14 */                olIIioolIClone.I0000Il00O((int) (f * 100.0f), ilil01iiO);
/* 17 */                I00000oOI = olIIioolIClone;
                    }
                }
            }
