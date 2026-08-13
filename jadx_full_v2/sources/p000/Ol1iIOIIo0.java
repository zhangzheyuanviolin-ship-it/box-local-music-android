            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol1iIOIIo0 implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public OOo0lO I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public Ol1iIOIIo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 280 */                   float f = this.I00iiI;
/* 282 */                   OOo0lO oOo0lO = this.I00iiO;
/* 286 */                   OiOiliiO oiOiliiO = (OiOiliiO) this.I00iio;
/* 290 */                   Function1 function1 = (Function1) this.I00ilI0I1;
/* 292 */                   I110IIooo i110IIooo = (I110IIooo) obj;
/* 306 */                   float fAbs = Math.abs(((Number) i110IIooo.I0000oI00.getValue()).floatValue());
/* 310 */                   float fAbs2 = Math.abs(f);
/* 316 */                   OIooliIO0 oIooliIO0 = i110IIooo.I0000oI00;
/* 318 */                   if (fAbs < fAbs2) {
/* 360 */                       lOIo00oi1i.I00000oOI(i110IIooo, oiOiliiO, function1, ((Number) oIooliIO0.getValue()).floatValue() - oOo0lO.I00iOIl);
/* 373 */                       oOo0lO.I00iOIl = ((Number) oIooliIO0.getValue()).floatValue();
                                break;
                            } else {
/* 330 */                       float fI0000O = lOIo00oi1i.I0000O(((Number) oIooliIO0.getValue()).floatValue(), f);
/* 338 */                       lOIo00oi1i.I00000oOI(i110IIooo, oiOiliiO, function1, fI0000O - oOo0lO.I00iOIl);
/* 341 */                       i110IIooo.I00000oIO();
/* 344 */                       oOo0lO.I00iOIl = fI0000O;
                                break;
                            }
                        case 1:
/* 194 */                   float f2 = this.I00iiI;
/* 196 */                   OOo0lO oOo0lO2 = this.I00iiO;
/* 200 */                   OiOiliiO oiOiliiO2 = (OiOiliiO) this.I00iio;
/* 204 */                   Function1 function12 = (Function1) this.I00ilI0I1;
/* 206 */                   I110IIooo i110IIooo2 = (I110IIooo) obj;
/* 220 */                   float fI0000O2 = lOIo00oi1i.I0000O(((Number) i110IIooo2.I0000oI00.getValue()).floatValue(), f2);
/* 226 */                   float f3 = fI0000O2 - oOo0lO2.I00iOIl;
                            try {
/* 228 */                       fI00000oIO = oiOiliiO2.I00000oIO(f3);
                            } catch (CancellationException unused) {
/* 233 */                       i110IIooo2.I00000oIO();
                            }
/* 240 */                   function12.invoke(Float.valueOf(fI00000oIO));
/* 252 */                   if (Math.abs(f3 - fI00000oIO) > 0.5f || fI0000O2 != ((Number) i110IIooo2.I0000oI00.getValue()).floatValue()) {
/* 271 */                       i110IIooo2.I00000oIO();
                            }
                            oOo0lO2.I00iOIl += fI00000oIO;
                            break;
                        default:
/* 9 */                     float f4 = this.I00iiI;
/* 11 */                    OOo0lO oOo0lO3 = this.I00iiO;
/* 15 */                    I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) this.I00iio;
/* 19 */                    OOo0lO oOo0lO4 = (OOo0lO) this.I00ilI0I1;
/* 21 */                    I110IIooo i110IIooo3 = (I110IIooo) obj;
/* 23 */                    OIooliIO0 oIooliIO02 = i110IIooo3.I0000oI00;
/* 37 */                    if ((((Number) oIooliIO02.getValue()).floatValue() < f4 && oOo0lO3.I00iOIl > f4) || (((Number) oIooliIO02.getValue()).floatValue() > f4 && oOo0lO3.I00iOIl < f4)) {
/* 71 */                        float fFloatValue = ((Number) oIooliIO02.getValue()).floatValue();
/* 75 */                        I01OoIoio00O i01OoIoio00O = I0l0lIoOIoIi.I00000oIO;
/* 79 */                        if (f4 == 0.0f) {
/* 81 */                            f4 = 0.0f;
                                } else if (f4 <= 0.0f ? fFloatValue >= f4 : fFloatValue <= f4) {
/* 97 */                            f4 = fFloatValue;
                                }
/* 108 */                       i0l1I0I0i10I.I00000oIO(f4, ((Number) i110IIooo3.I00000oOI()).floatValue());
/* 138 */                       oOo0lO4.I00iOIl = Float.isNaN(((Number) i110IIooo3.I00000oOI()).floatValue()) ? 0.0f : ((Number) i110IIooo3.I00000oOI()).floatValue();
/* 140 */                       oOo0lO3.I00iOIl = f4;
/* 142 */                       i110IIooo3.I00000oIO();
                                break;
                            } else {
/* 166 */                       i0l1I0I0i10I.I00000oIO(((Number) oIooliIO02.getValue()).floatValue(), ((Number) i110IIooo3.I00000oOI()).floatValue());
/* 179 */                       oOo0lO4.I00iOIl = ((Number) i110IIooo3.I00000oOI()).floatValue();
/* 191 */                       oOo0lO3.I00iOIl = ((Number) oIooliIO02.getValue()).floatValue();
                                break;
                            }
                            break;
                    }
/* 193 */           return ooiIlOl1iI;
                }
            }
