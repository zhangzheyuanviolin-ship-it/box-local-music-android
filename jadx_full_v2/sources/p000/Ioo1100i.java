            package p000;

            import android.graphics.Path;
            import kotlin.jvm.functions.Function1;
            
            public final class Ioo1100i implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public int I00iio;

                public Ioo1100i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2 */                     ((OO11o0IO) obj).I000O01llI0((OO1I0001000i) this.I00iiO, this.I00iiI, this.I00iio, 0.0f);
                            break;
                        case 1:
/* 145 */                   int i2 = this.I00iiI;
/* 2 */                     ((OO11o0IO) obj).I000O01llI0((OO1I0001000i) this.I00iiO, O1OooO0IlOo.I000II((i2 - r2.I00iOIl) / 2.0f), O1OooO0IlOo.I000II((this.I00iio - r2.I00iiI) / 2.0f), 0.0f);
                            break;
                        case 2:
/* 2 */                     ((OO11o0IO) obj).I000O01llI0((OO1I0001000i) this.I00iiO, this.I00iiI, this.I00iio, 0.0f);
                            break;
                        default:
/* 10 */                    I0ol0lI i0ol0lI = (I0ol0lI) this.I00iiO;
/* 12 */                    int i3 = this.I00iiI;
/* 14 */                    int i4 = this.I00iio;
/* 16 */                    OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) obj;
/* 18 */                    I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 20 */                    int iI0000O = oIoiIo0o1O.I0000O(i3);
/* 24 */                    int iI0000O2 = oIoiIo0o1O.I0000O(i4);
/* 28 */                    CharSequence charSequence = i0oilIol11i.I0000O;
/* 30 */                    if (iI0000O < 0 || iI0000O > iI0000O2 || iI0000O2 > charSequence.length()) {
/* 41 */                        int length = charSequence.length();
/* 51 */                        StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("start(", iI0000O, ") or end(", iI0000O2, ") is out of range [0..");
/* 55 */                        sbI0010I0i.append(length);
/* 60 */                        sbI0010I0i.append("], or start > end!");
/* 67 */                        Ioliol.I00000oIO(sbI0010I0i.toString());
                            }
/* 72 */                    Path path = new Path();
/* 75 */                    Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 79 */                    oo0iOioO.I0001Ioi1lo.getSelectionPath(iI0000O, iI0000O2, path);
/* 82 */                    int i5 = oo0iOioO.I000O01llI0;
/* 85 */                    if (i5 != 0 && !path.isEmpty()) {
/* 94 */                        path.offset(0.0f, i5);
                            }
/* 99 */                    I0ol0lI i0ol0lI2 = new I0ol0lI(path);
/* 102 */                   float f = oIoiIo0o1O.I0001Ioi1lo;
/* 124 */                   i0ol0lI2.I000OiO((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
/* 127 */                   I0ol0lI.I00000oIO(i0ol0lI, i0ol0lI2);
                            break;
                    }
/* 130 */           return ooiIlOl1iI;
                }
            }
