            package p000;
            
            public abstract class lIilli1IoOII {
                public static void I00000oIO(l1I0oI l1i0oi) {
                    OlO0OIIl1 olO0OIIl1;
                    OO0oo1 oO0oo1;
                    OO0oo1 oO0oo12;
/* 119 */           do {
/* 1 */                 olO0OIIl1 = OOloolilI11i.I001l0I00;
/* 7 */                 oO0oo1 = (OO0oo1) olO0OIIl1.getValue();
/* 9 */                 OO0lili oO0liliI000OOo1O = oO0oo1.I00iiO;
/* 15 */                O100ll1iO0il o100ll1iO0il = (O100ll1iO0il) oO0liliI000OOo1O.get(l1i0oi);
/* 17 */                if (o100ll1iO0il == null) {
/* 19 */                    oO0oo12 = oO0oo1;
                        } else {
/* 21 */                    Object obj = o100ll1iO0il.I00000oIO;
/* 23 */                    Object obj2 = o100ll1iO0il.I00000oOI;
/* 25 */                    OoIiIlIo ooIiIlIo = oO0liliI000OOo1O.I00iOIl;
/* 36 */                    OoIiIlIo ooIiIlIoI001IO000 = ooIiIlIo.I001IO000(l1i0oi, l1i0oi != null ? l1i0oi.hashCode() : 0, 0);
/* 40 */                    if (ooIiIlIo != ooIiIlIoI001IO000) {
/* 54 */                        oO0liliI000OOo1O = ooIiIlIoI001IO000 == null ? OO0lili.I00iiO : new OO0lili(ooIiIlIoI001IO000, oO0liliI000OOo1O.I00iiI - 1);
                            }
/* 58 */                    l1I0oI l1i0oi2 = l1I0oI.I00iio;
/* 60 */                    if (obj != l1i0oi2) {
/* 75 */                        oO0liliI000OOo1O = oO0liliI000OOo1O.I000OOo1O(obj, new O100ll1iO0il(((O100ll1iO0il) oO0liliI000OOo1O.get(obj)).I00000oIO, obj2));
                            }
/* 79 */                    if (obj2 != l1i0oi2) {
/* 94 */                        oO0liliI000OOo1O = oO0liliI000OOo1O.I000OOo1O(obj2, new O100ll1iO0il(obj, ((O100ll1iO0il) oO0liliI000OOo1O.get(obj2)).I00000oOI));
                            }
/* 103 */                   Object obj3 = obj != l1i0oi2 ? oO0oo1.I00iOIl : obj2;
/* 104 */                   if (obj2 != l1i0oi2) {
/* 106 */                       obj = oO0oo1.I00iiI;
                            }
/* 110 */                   oO0oo12 = new OO0oo1(obj3, obj, oO0liliI000OOo1O);
                        }
/* 113 */               if (oO0oo1 == oO0oo12) {
/* 168 */                   return;
                        }
/* 119 */           } while (!olO0OIIl1.I000iOII(oO0oo1, oO0oo12));
                }
            }
