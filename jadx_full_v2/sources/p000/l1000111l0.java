            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1000111l0 {
                public static final void I00000oIO(Object obj, int i, O0ll1ilooi o0ll1ilooi, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    O0ll1IIi o0ll1IIi;
/* 16 */            iloI0lOlll1.I00i0O(872548579);
/* 21 */            if ((i2 & 6) == 0) {
/* 32 */                i3 = (iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | i2;
                    } else {
/* 34 */                i3 = i2;
                    }
/* 37 */            if ((i2 & 48) == 0) {
/* 50 */                i3 |= iloI0lOlll1.I0000oI00(i) ? 32 : 16;
                    }
/* 53 */            if ((i2 & 384) == 0) {
/* 66 */                i3 |= iloI0lOlll1.I000OOo1O(o0ll1ilooi) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 69 */            if ((i2 & 3072) == 0) {
/* 82 */                i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 98 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 108 */               boolean zI000II = iloI0lOlll1.I000II(obj) | iloI0lOlll1.I000II(o0ll1ilooi);
/* 109 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 114 */               Object obj2 = IOl11li.I00000oIO;
                        Object obj3 = objI00O0i0ii;
/* 116 */               if (zI000II || objI00O0i0ii == obj2) {
/* 122 */                   O0ll1IIi o0ll1IIi2 = new O0ll1IIi();
/* 125 */                   o0ll1IIi2.I00000oIO = obj;
/* 127 */                   o0ll1IIi2.I00000oOI = o0ll1ilooi;
/* 130 */                   o0ll1IIi2.I0000Il00O = -1;
/* 136 */                   o0ll1IIi2.I000II = lOO00IiI0li.I00000oIO(null);
/* 138 */                   VarHandle.storeStoreFence();
/* 141 */                   iloI0lOlll1.I00iio(o0ll1IIi2);
                            obj3 = o0ll1IIi2;
                        }
/* 144 */               O0ll1IIi o0ll1IIi3 = (O0ll1IIi) obj3;
/* 146 */               o0ll1IIi3.I0000Il00O = i;
/* 148 */               OIooliIO0 oIooliIO0 = o0ll1IIi3.I000II;
/* 150 */               OOiIOoiOO oOiIOoiOO = OO110li0ioo.I00000oIO;
/* 156 */               O0ll1IIi o0ll1IIi4 = (O0ll1IIi) iloI0lOlll1.I000iOII(oOiIOoiOO);
/* 158 */               Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 169 */               Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 170 */               Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                        try {
/* 182 */                   if (o0ll1IIi4 != ((O0ll1IIi) oIooliIO0.getValue())) {
/* 184 */                       oIooliIO0.setValue(o0ll1IIi4);
/* 189 */                       if (o0ll1IIi3.I0000O > 0) {
/* 191 */                           O0ll1IIi o0ll1IIi5 = o0ll1IIi3.I0000oI00;
/* 193 */                           if (o0ll1IIi5 != null) {
/* 195 */                               o0ll1IIi5.I00000oOI();
                                    }
/* 201 */                           if (o0ll1IIi4 != null) {
/* 203 */                               o0ll1IIi4.I00000oIO();
/* 206 */                               o0ll1IIi = o0ll1IIi4;
                                    } else {
/* 208 */                               o0ll1IIi = null;
                                    }
/* 209 */                           o0ll1IIi3.I0000oI00 = o0ll1IIi;
                                }
                            }
/* 211 */                   iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 214 */                   boolean zI000II2 = iloI0lOlll1.I000II(o0ll1IIi3);
/* 218 */                   Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii2;
/* 222 */                   if (zI000II2 || objI00O0i0ii2 == obj2) {
/* 229 */                       O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(3);
/* 232 */                       o0l0IlolloIO.I00iiI = o0ll1IIi3;
/* 234 */                       VarHandle.storeStoreFence();
/* 237 */                       iloI0lOlll1.I00iio(o0l0IlolloIO);
                                obj4 = o0l0IlolloIO;
                            }
/* 242 */                   iIO0iiOiOl0l.I00000oOI(o0ll1IIi3, (Function1) obj4, iloI0lOlll1);
/* 256 */                   iiliio0o.I00000oIO(oOiIOoiOO.I00000oIO(o0ll1IIi3), iOii1l, iloI0lOlll1, ((i3 >> 6) & 112) | 8);
                        } catch (Throwable th) {
/* 260 */                   iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 263 */                   throw th;
                        }
                    } else {
/* 264 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 267 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 271 */           if (oOloioIlI001IO000 != null) {
/* 276 */               I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(5);
/* 279 */               i0O0Ol1O0O.I00ilI0I1 = obj;
/* 281 */               i0O0Ol1O0O.I00iiO = i;
/* 283 */               i0O0Ol1O0O.I00iiI = o0ll1ilooi;
/* 285 */               i0O0Ol1O0O.I00ilO0 = iOii1l;
/* 287 */               i0O0Ol1O0O.I00iio = i2;
/* 289 */               VarHandle.storeStoreFence();
/* 292 */               oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
                    }
                }
            }
