            package p000;

            import android.util.Rational;
            import java.util.ArrayList;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class II1liooilI implements Comparator {
                public final int I00iOIl;
                public Object I00iiI;

                public II1liooilI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 458 */                   int iCompare = ((IliIiio1) this.I00iiI).compare(obj, obj2);
/* 462 */                   if (iCompare != 0) {
/* 507 */                       return iCompare;
                            }
/* 465 */                   IiOoOOO iiOoOOO = (IiOoOOO) obj2;
/* 484 */                   IiOoOOO iiOoOOO2 = (IiOoOOO) obj;
/* 503 */                   return iii1OiiIi.I00000oIO(Float.valueOf(iiOoOOO.I0000Il00O.height() * iiOoOOO.I0000Il00O.width()), Float.valueOf(iiOoOOO2.I0000Il00O.height() * iiOoOOO2.I0000Il00O.width()));
                        case 1:
/* 435 */                   OIoO1Ol oIoO1Ol = (OIoO1Ol) this.I00iiI;
/* 449 */                   return iii1OiiIi.I00000oIO((Comparable) oIoO1Ol.invoke(obj), (Comparable) oIoO1Ol.invoke(obj2));
                        case 2:
/* 410 */                   List list = (List) this.I00iiI;
/* 414 */                   int iIndexOf = list.indexOf(((Io0OIllo0o0) obj).I00000oIO);
/* 420 */                   int iIndexOf2 = list.indexOf(((Io0OIllo0o0) obj2).I00000oIO);
/* 424 */                   if (iIndexOf < iIndexOf2) {
/* 426 */                       return -1;
                            }
                            return iIndexOf == iIndexOf2 ? 0 : 1;
                        case 3:
/* 379 */                   Function1 function1 = (Function1) this.I00iiI;
/* 399 */                   return iii1OiiIi.I00000oIO(function1.invoke((O0iIl1) obj).toString(), function1.invoke((O0iIl1) obj2).toString());
                        case 4:
/* 342 */                   OI0o0olO1 oI0o0olO1 = (OI0o0olO1) this.I00iiI;
/* 370 */                   return iii1OiiIi.I00000oIO(Float.valueOf(oI0o0olO1.I0000Il00O(((Map.Entry) obj2).getKey())), Float.valueOf(oI0o0olO1.I0000Il00O(((Map.Entry) obj).getKey())));
                        case 5:
/* 307 */                   String str = ((O1oIOiI11o0) obj2).I00000oIO;
/* 311 */                   String str2 = (String) this.I00iiI;
/* 333 */                   return iii1OiiIi.I00000oIO(Boolean.valueOf(O0000Ioio00.I0000O(str, str2)), Boolean.valueOf(O0000Ioio00.I0000O(((O1oIOiI11o0) obj).I00000oIO, str2)));
                        case 6:
/* 262 */                   Rational rational = (Rational) obj2;
/* 266 */                   Rational rational2 = (Rational) this.I00iiI;
/* 268 */                   float fFloatValue = ((Rational) obj).floatValue();
/* 272 */                   float fFloatValue2 = rational2.floatValue();
/* 282 */                   float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
/* 284 */                   float fFloatValue3 = rational.floatValue();
/* 288 */                   float fFloatValue4 = rational2.floatValue();
/* 300 */                   return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
                        case 7:
/* 225 */                   long jLongValue = ((Number) obj).longValue();
/* 231 */                   OI0ll0OIiO oI0ll0OIiO = (OI0ll0OIiO) this.I00iiI;
/* 255 */                   return iii1OiiIi.I00000oIO(Integer.valueOf(oI0ll0OIiO.I0000Il00O(jLongValue)), Integer.valueOf(oI0ll0OIiO.I0000Il00O(((Number) obj2).longValue())));
                        case 8:
/* 170 */                   int iCompare2 = ((Comparator) this.I00iiI).compare(obj, obj2);
/* 174 */                   if (iCompare2 != 0) {
/* 222 */                       return iCompare2;
                            }
/* 179 */                   O0iiOioolIi o0iiOioolIi = ((Oil000) obj).I0000Il00O;
/* 183 */                   O0iiOioolIi o0iiOioolIi2 = ((Oil000) obj2).I0000Il00O;
                            return o0iiOioolIi.I001iOo1i0O() == o0iiOioolIi2.I001iOo1i0O() ? O0000Ioio00.I0000oI00(o0iiOioolIi.I001i1O0Ol(), o0iiOioolIi2.I001i1O0Ol()) : Float.compare(o0iiOioolIi.I001iOo1i0O(), o0iiOioolIi2.I001iOo1i0O());
                        case 9:
/* 138 */                   int iCompare3 = ((II1liooilI) this.I00iiI).compare(obj, obj2);
                            return iCompare3 != 0 ? iCompare3 : iii1OiiIi.I00000oIO(Integer.valueOf(((Oil000) obj).I0001Ioi1lo), Integer.valueOf(((Oil000) obj2).I0001Ioi1lo));
                        default:
/* 11 */                    ArrayList arrayList = ((OlOO00iI0lI) this.I00iiI).I00io1l;
/* 17 */                    Iterator it = ((OlOIo0) obj).I000l1.iterator();
/* 25 */                    if (it.hasNext()) {
/* 37 */                        Integer numValueOf = Integer.valueOf(arrayList.indexOf((IIo1loI0) it.next()));
/* 45 */                        while (it.hasNext()) {
/* 57 */                            Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((IIo1loI0) it.next()));
/* 65 */                            if (numValueOf.compareTo(numValueOf2) > 0) {
/* 67 */                                numValueOf = numValueOf2;
                                    }
                                }
/* 73 */                        Iterator it2 = ((OlOIo0) obj2).I000l1.iterator();
/* 81 */                        if (it2.hasNext()) {
/* 93 */                            Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((IIo1loI0) it2.next()));
/* 101 */                           while (it2.hasNext()) {
/* 113 */                               Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((IIo1loI0) it2.next()));
/* 121 */                               if (numValueOf3.compareTo(numValueOf4) > 0) {
/* 123 */                                   numValueOf3 = numValueOf4;
                                        }
                                    }
/* 125 */                           return iii1OiiIi.I00000oIO(numValueOf, numValueOf3);
                                }
                            }
/* 130 */                   IoOOl0iOl1io.I00000oOI();
/* 3 */                     return 0;
                    }
                }
            }
