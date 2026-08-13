            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0lI1oIiI implements IllOOo00lI {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public Il0lI1oIiI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 70 */                    int i2 = this.I00iiI;
/* 74 */                    String str = (String) this.I00iiO;
/* 78 */                    Il0lIiOiO1i il0lIiOiO1i = (Il0lIiOiO1i) this.I00iio;
/* 80 */                    OilOloI[] oilOloIArr = new OilOloI[i2];
/* 84 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 115 */                       oilOloIArr[i3] = lO1o10lllO0I.I00000oOI(str + '.' + il0lIiOiO1i.I0000oI00[i3], Oli00oo0l.I0000oI00, new OilOloI[0], new OiioI1Io0o(5));
                            }
                            break;
                        case 1:
/* 51 */                    int i4 = this.I00iiI;
/* 55 */                    OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iiO;
/* 59 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 61 */                    oIooi1iOiOol.I000O01llI0(i4);
/* 66 */                    oI10i0Il.setValue("");
                            break;
                        case 2:
/* 47 */                    ((IlliIl1l11O) this.I00iiO).invoke(((IO1OoiOlOO) this.I00iio).I000II, Integer.valueOf(this.I00iiI));
                            break;
                        default:
/* 10 */                    Function1 function1 = (Function1) this.I00iiO;
/* 12 */                    int i5 = this.I00iiI;
/* 20 */                    ((OI10i0Il) this.I00iio).setValue(Boolean.FALSE);
/* 27 */                    function1.invoke(Integer.valueOf(i5));
                            break;
                    }
/* 30 */            return ooiIlOl1iI;
                }
            }
