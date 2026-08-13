            package p000;

            import java.util.Arrays;
            
            public abstract class l0oiI1li {
                public static final OI0l1iiooO I00000oIO(O0liilOIOii o0liilOIOii, O0ll1ilooi o0ll1ilooi, Oi1ol0llI oi1ol0llI) {
                    int iMin;
/* 1 */             Ol1o0O0O0 ol1o0O0O0 = o0ll1ilooi.I00iOIl;
/* 11 */            I01Io11IiiiO i01Io11IiiiO = ((OlO0o0) Ol1l1lI1Ili.I0010o(ol1o0O0O0.I00iOIl, ol1o0O0O0)).I0000Il00O;
/* 15 */            OI110O0 oi110o0 = (OI110O0) oi1ol0llI.I00iiI;
/* 20 */            int i = 1;
/* 26 */            if (!(oi110o0.I00iiO != 0) && i01Io11IiiiO.isEmpty()) {
/* 34 */                return IooIo0.I00000oIO;
                    }
/* 39 */            OI0l1iiooO oI0l1iiooO = new OI0l1iiooO();
/* 48 */            if (((OI110O0) oi1ol0llI.I00iiI).I00iiO != 0) {
/* 50 */                int i2 = oi110o0.I00iiO;
/* 55 */                if (i2 == 0) {
/* 130 */                   OIiilo1Ool0o.I000II("MutableVector is empty.");
/* 52 */                    return null;
                        }
/* 57 */                Object[] objArr = oi110o0.I00iOIl;
/* 63 */                int i3 = ((O0lO1lilIooO) objArr[0]).I00000oIO;
/* 66 */                for (int i4 = 0; i4 < i2; i4++) {
/* 72 */                    int i5 = ((O0lO1lilIooO) objArr[i4]).I00000oIO;
/* 74 */                    if (i5 < i3) {
/* 76 */                        i3 = i5;
                            }
                        }
/* 80 */                if (i3 < 0) {
/* 85 */                    Ioll0IliO1l.I00000oIO("negative minIndex");
                        }
/* 88 */                int i6 = oi110o0.I00iiO;
/* 90 */                if (i6 == 0) {
/* 126 */                   OIiilo1Ool0o.I000II("MutableVector is empty.");
/* 52 */                    return null;
                        }
/* 92 */                Object[] objArr2 = oi110o0.I00iOIl;
/* 98 */                int i7 = ((O0lO1lilIooO) objArr2[0]).I00000oOI;
/* 101 */               for (int i8 = 0; i8 < i6; i8++) {
/* 107 */                   int i9 = ((O0lO1lilIooO) objArr2[i8]).I00000oOI;
/* 109 */                   if (i9 > i7) {
/* 111 */                       i7 = i9;
                            }
                        }
/* 120 */               iMin = Math.min(i7, o0liilOIOii.I00000oIO() - 1);
/* 124 */               i = i3;
                    } else {
/* 134 */               iMin = 0;
                    }
/* 135 */           int iI00000oOI = i01Io11IiiiO.I00000oOI();
/* 140 */           for (int i10 = 0; i10 < iI00000oOI; i10++) {
/* 146 */               O0ll1IIi o0ll1IIi = (O0ll1IIi) i01Io11IiiiO.get(i10);
/* 152 */               int iI00000oIO = l0oo1l.I00000oIO(o0liilOIOii, o0ll1IIi.I00000oIO, o0ll1IIi.I0000Il00O);
/* 156 */               if ((i > iI00000oIO || iI00000oIO > iMin) && iI00000oIO >= 0 && iI00000oIO < o0liilOIOii.I00000oIO()) {
/* 169 */                   oI0l1iiooO.I00000oIO(iI00000oIO);
                        }
                    }
/* 175 */           if (i <= iMin) {
                        while (true) {
/* 177 */                   oI0l1iiooO.I00000oIO(i);
/* 180 */                   if (i == iMin) {
                                break;
                            }
/* 182 */                   i++;
                        }
                    }
/* 185 */           int i11 = oI0l1iiooO.I00000oOI;
/* 187 */           if (i11 == 0) {
/* 189 */               return oI0l1iiooO;
                    }
/* 192 */           Arrays.sort(oI0l1iiooO.I00000oIO, 0, i11);
/* 408 */           return oI0l1iiooO;
                }
            }
