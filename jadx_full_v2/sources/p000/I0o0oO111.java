            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I0o0oO111 implements Function1 {
                public final int I00iOIl;
                public ArrayList I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             int i2 = 0;
/* 8 */             ArrayList arrayList = this.I00iiI;
                    switch (i) {
                        case 0:
/* 225 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 227 */                   int size = arrayList.size();
/* 232 */                   for (int i3 = 0; i3 < size; i3++) {
/* 241 */                       OO11o0IO.I000iOII(oO11o0IO, (OO1I0001000i) arrayList.get(i3), 0, 0);
                            }
                            break;
                        case 1:
/* 200 */                   OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 202 */                   int size2 = arrayList.size();
/* 207 */                   for (int i4 = 0; i4 < size2; i4++) {
/* 216 */                       OO11o0IO.I000iOII(oO11o0IO2, (OO1I0001000i) arrayList.get(i4), 0, 0);
                            }
                            break;
                        case 2:
/* 168 */                   int iIntValue = ((Integer) obj).intValue();
/* 178 */                   if ((arrayList.get(iIntValue) instanceof Oii11i01O) || (arrayList.get(iIntValue) instanceof Oii11Ol1OOo1)) {
                                break;
                            }
                            break;
                        case 3:
/* 67 */                    OO11o0IO oO11o0IO3 = (OO11o0IO) obj;
/* 69 */                    int size3 = arrayList.size();
/* 73 */                    int i5 = 0;
/* 74 */                    while (i5 < size3) {
/* 80 */                        O1iOii1 o1iOii1 = (O1iOii1) arrayList.get(i5);
/* 82 */                        List list = o1iOii1.I00000oOI;
/* 84 */                        boolean z = o1iOii1.I000II;
/* 90 */                        if (o1iOii1.I000iOII == Integer.MIN_VALUE) {
/* 95 */                            Ioll0IliO1l.I00000oIO("position() should be called first");
                                }
/* 98 */                        int size4 = list.size();
/* 102 */                       int i6 = i2;
/* 103 */                       while (i6 < size4) {
/* 109 */                           OO1I0001000i oO1I0001000i = (OO1I0001000i) list.get(i6);
/* 125 */                           int i7 = size3;
/* 138 */                           long jI0000oI00 = IooO0O.I0000oI00((r12[r13 + 1] & 4294967295L) | (o1iOii1.I000OOo1O[i6 * 2] << 32), o1iOii1.I0000Il00O);
/* 142 */                           if (z) {
/* 144 */                               OO11o0IO.I001IIilI0O(oO11o0IO3, oO1I0001000i, jI0000oI00);
                                    } else {
/* 148 */                               OO11o0IO.I000oI1ioi(oO11o0IO3, oO1I0001000i, jI0000oI00);
                                    }
/* 151 */                           i6++;
/* 153 */                           size3 = i7;
                                }
/* 159 */                       i5++;
/* 161 */                       i2 = 0;
                            }
                            break;
                        case 4:
/* 39 */                    OO11o0IO oO11o0IO4 = (OO11o0IO) obj;
/* 41 */                    int size5 = arrayList.size();
/* 45 */                    while (i2 < size5) {
/* 58 */                        OO11o0IO.I000l1(oO11o0IO4, (OO1I0001000i) arrayList.get(i2), 0, 0, null, 12);
/* 61 */                        i2++;
                            }
                            break;
                        default:
/* 15 */                    OO11o0IO oO11o0IO5 = (OO11o0IO) obj;
/* 17 */                    int size6 = arrayList.size();
/* 22 */                    for (int i8 = 0; i8 < size6; i8++) {
/* 2 */                         oO11o0IO5.I000O01llI0((OO1I0001000i) arrayList.get(i8), 0, 0, 0.0f);
                            }
                            break;
                    }
/* 36 */            return ooiIlOl1iI;
                }
            }
