            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ol10i1Oooo implements Function1 {
                public final int I00iOIl;
                public Ol111o0 I00iiI;

                public Ol10i1Oooo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ol111o0 ol111o0 = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 70 */                    float fFloatValue = ((Float) obj).floatValue();
/* 74 */                    IOO1O00oI iOO1O00oI = ol111o0.I0000Il00O;
/* 76 */                    OIooO1iiliI oIooO1iiliI = ol111o0.I0000O;
/* 78 */                    float f = iOO1O00oI.I00000oIO;
/* 80 */                    float f2 = iOO1O00oI.I00000oOI;
/* 82 */                    float fI00000oOI = lIiioliIlo.I00000oOI(fFloatValue, f, f2);
/* 86 */                    int i3 = ol111o0.I00000oIO;
/* 88 */                    boolean z = false;
/* 90 */                    if (i3 > 0 && (i = i3 + 1) >= 0) {
/* 95 */                        float fAbs = fI00000oOI;
/* 96 */                        float f3 = fAbs;
/* 97 */                        int i4 = 0;
                                while (true) {
/* 103 */                           float fI00000oOI2 = l1I1Il.I00000oOI(iOO1O00oI.I00000oIO, f2, i4 / i);
/* 107 */                           float f4 = fI00000oOI2 - fI00000oOI;
/* 115 */                           if (Math.abs(f4) <= fAbs) {
/* 117 */                               fAbs = Math.abs(f4);
/* 121 */                               f3 = fI00000oOI2;
                                    }
/* 122 */                           if (i4 != i) {
/* 124 */                               i4++;
                                    } else {
/* 127 */                               fI00000oOI = f3;
                                    }
                                }
                            }
/* 134 */                   if (fI00000oOI != oIooO1iiliI.I000II()) {
/* 143 */                       if (fI00000oOI != oIooO1iiliI.I000II()) {
/* 146 */                           Function1 function1 = ol111o0.I0001Ioi1lo;
/* 148 */                           if (function1 != null) {
/* 154 */                               function1.invoke(Float.valueOf(fI00000oOI));
                                    } else {
/* 158 */                               ol111o0.I0000O(fI00000oOI);
                                    }
                                }
/* 161 */                       IllOOo00lI illOOo00lI = ol111o0.I00000oOI;
/* 163 */                       if (illOOo00lI != null) {
/* 165 */                           illOOo00lI.invoke();
                                }
/* 168 */                       z = true;
                            }
                            break;
                        case 1:
/* 50 */                    Float f5 = (Float) obj;
/* 52 */                    float fFloatValue2 = f5.floatValue();
/* 56 */                    Function1 function12 = ol111o0.I0001Ioi1lo;
/* 58 */                    if (function12 == null) {
/* 64 */                        ol111o0.I0000O(fFloatValue2);
                                break;
                            } else {
/* 60 */                        function12.invoke(f5);
                                break;
                            }
                        case 2:
/* 22 */                    IooOl0ol01 iooOl0ol01 = (IooOl0ol01) obj;
/* 32 */                    ol111o0.I000lI.I000O01llI0((int) (iooOl0ol01.I00000oIO >> 32));
/* 46 */                    ol111o0.I000o00OoI0I.I000O01llI0((int) (iooOl0ol01.I00000oIO & 4294967295L));
                            break;
                        default:
/* 13 */                    ol111o0.I00000oIO(0.0f);
/* 18 */                    ol111o0.I00100o1O0lo.invoke();
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }
            }
