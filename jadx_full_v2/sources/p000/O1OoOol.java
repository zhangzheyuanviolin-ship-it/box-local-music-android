            package p000;

            import android.graphics.RectF;
            
            public final class O1OoOol extends ilOiiolOolll {
                public int I00000oIO;

                @Override
                public final float I00000oIO(O1Ooi0 o1Ooi0) {
/* 1 */             float[] fArr = o1Ooi0.I00oliIiO01i;
/* 3 */             if (fArr != null) {
/* 7 */                 return fArr[this.I00000oIO];
                    }
/* 10 */            return 0.0f;
                }

                @Override
                public final void I00000oOI(O1Ooi0 o1Ooi0, float f) {
                    float fI00000oIO;
/* 1 */             float[] fArr = o1Ooi0.I00oliIiO01i;
/* 3 */             if (fArr != null) {
/* 5 */                 int i = this.I00000oIO;
/* 11 */                if (fArr[i] != f) {
/* 13 */                    fArr[i] = f;
/* 15 */                    I0IOIlIOIII i0IOIlIOIII = o1Ooi0.I00ooIo0;
/* 17 */                    if (i0IOIlIOIII != null) {
/* 19 */                        OOoo1il oOoo1il = o1Ooi0.I00oI0i;
/* 23 */                        if (fArr != null) {
/* 40 */                            fI00000oIO = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                                } else {
/* 42 */                            RectF rectFI0000O = o1Ooi0.I0000O();
/* 48 */                            OioOlIlii1il oioOlIlii1il = o1Ooi0.I00iiI.I00000oIO;
/* 50 */                            oOoo1il.getClass();
/* 92 */                            fI00000oIO = (((o1Ooi0.I00iiI.I00000oIO.I000O01llI0.I00000oIO(rectFI0000O) + oioOlIlii1il.I0000oI00.I00000oIO(rectFI0000O)) - o1Ooi0.I00iiI.I00000oIO.I000II.I00000oIO(rectFI0000O)) - o1Ooi0.I00iiI.I00000oIO.I0001Ioi1lo.I00000oIO(rectFI0000O)) / 2.0f;
                                }
/* 96 */                        O1OllOiIo1I o1OllOiIo1I = (O1OllOiIo1I) i0IOIlIOIII.I00iiI;
/* 102 */                       int i2 = (int) (fI00000oIO * 0.11f);
/* 105 */                       if (o1OllOiIo1I.I00oOio10iI1 != i2) {
/* 107 */                           o1OllOiIo1I.I00oOio10iI1 = i2;
/* 109 */                           o1OllOiIo1I.I000II();
/* 112 */                           o1OllOiIo1I.invalidate();
                                }
                            }
/* 115 */                   o1Ooi0.invalidateSelf();
                        }
                    }
                }
            }
