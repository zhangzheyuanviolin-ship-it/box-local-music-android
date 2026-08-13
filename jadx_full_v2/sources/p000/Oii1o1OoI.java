            package p000;

            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Oii1o1OoI implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public Oii1o1OoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 69 */                    ArrayList arrayList = (ArrayList) this.I00iio;
/* 73 */                    OiiI000O oiiI000O = (OiiI000O) this.I00ilO0;
/* 75 */                    int iIntValue = this.I00iiI;
/* 79 */                    ArrayList arrayList2 = (ArrayList) this.I00ilI0I1;
/* 81 */                    int i2 = this.I00iiO;
/* 83 */                    OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 85 */                    int size = arrayList.size();
/* 91 */                    for (int i3 = 0; i3 < size; i3++) {
/* 97 */                        OO1I0001000i oO1I0001000i = (OO1I0001000i) arrayList.get(i3);
/* 2 */                         oO11o0IO.I000O01llI0(oO1I0001000i, 0, (i2 - oO1I0001000i.I00iiI) / 2, 0.0f);
                            }
/* 123 */                   int iI00l0OO0IO = oO11o0IO.I00l0OO0IO(8.0f) + oO11o0IO.I00l0OO0IO(OiiI0o101O0.I0000Il00O);
/* 124 */                   I10i01 i10i01 = oiiI000O.I0000Il00O;
/* 126 */                   if (i10i01 != null) {
/* 134 */                       iIntValue = ((Number) i10i01.I0000O()).intValue();
                            }
/* 138 */                   int i4 = iI00l0OO0IO + iIntValue;
/* 139 */                   int size2 = arrayList2.size();
/* 143 */                   for (int i5 = 0; i5 < size2; i5++) {
/* 149 */                       OO1I0001000i oO1I0001000i2 = (OO1I0001000i) arrayList2.get(i5);
/* 158 */                       oO11o0IO.I000O01llI0(oO1I0001000i2, i4, (i2 - oO1I0001000i2.I00iiI) / 2, 0.0f);
                            }
                            break;
                        default:
/* 10 */                    i01iloIOIo0 i01iloioio0 = (i01iloIOIo0) this.I00iio;
/* 12 */                    int i6 = this.I00iiI;
/* 16 */                    OO1I0001000i oO1I0001000i3 = (OO1I0001000i) this.I00ilI0I1;
/* 18 */                    int i7 = this.I00iiO;
/* 63 */                    OO11o0IO.I000OiO((OO11o0IO) obj, oO1I0001000i3, ((IooO0O) i01iloioio0.I00o0l1o1o0.invoke(IooOl0ol01.I00000oIO(((i6 - oO1I0001000i3.I00iOIl) << 32) | ((i7 - oO1I0001000i3.I00iiI) & 4294967295L)), ((O1iOIoOiO0) this.I00ilO0).getLayoutDirection())).I00000oIO);
                            break;
                    }
/* 66 */            return ooiIlOl1iI;
                }
            }
