            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O0l0i1I0l implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public ArrayList I00iiO;
                public List I00iio;
                public boolean I00ilI0I1;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 69 */                    OI10i0Il oI10i0Il = this.I00iiI;
/* 71 */                    ArrayList arrayList = this.I00iiO;
/* 73 */                    List list = this.I00iio;
/* 75 */                    boolean z = this.I00ilI0I1;
/* 77 */                    OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 79 */                    oO11o0IO.I00iOIl = true;
/* 81 */                    int size = arrayList.size();
/* 86 */                    for (int i2 = 0; i2 < size; i2++) {
/* 94 */                        ((O0l0iI) arrayList.get(i2)).I000lI(oO11o0IO, z);
                            }
/* 103 */                   int size2 = list.size();
/* 108 */                   for (int i3 = 0; i3 < size2; i3++) {
/* 116 */                       ((O0l0iI) list.get(i3)).I000lI(oO11o0IO, z);
                            }
/* 122 */                   oO11o0IO.I00iOIl = false;
/* 124 */                   oI10i0Il.getValue();
                            break;
                        default:
/* 10 */                    OI10i0Il oI10i0Il2 = this.I00iiI;
/* 12 */                    ArrayList arrayList2 = this.I00iiO;
/* 14 */                    List list2 = this.I00iio;
/* 16 */                    boolean z2 = this.I00ilI0I1;
/* 18 */                    OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 20 */                    oO11o0IO2.I00iOIl = true;
/* 22 */                    int size3 = arrayList2.size();
/* 27 */                    for (int i4 = 0; i4 < size3; i4++) {
/* 35 */                        ((O0o0100I) arrayList2.get(i4)).I000o00OoI0I(oO11o0IO2, z2);
                            }
/* 44 */                    int size4 = list2.size();
/* 49 */                    for (int i5 = 0; i5 < size4; i5++) {
/* 57 */                        ((O0o0100I) list2.get(i5)).I000o00OoI0I(oO11o0IO2, z2);
                            }
/* 63 */                    oO11o0IO2.I00iOIl = false;
/* 65 */                    oI10i0Il2.getValue();
                            break;
                    }
/* 68 */            return ooiIlOl1iI;
                }
            }
