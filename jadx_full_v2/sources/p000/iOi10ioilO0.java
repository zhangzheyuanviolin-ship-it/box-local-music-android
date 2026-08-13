            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOi10ioilO0 {
                public static final Object I00000oIO(IiIill0O0li1 iiIill0O0li1, IllOOo00lI illOOo00lI, IOoilo iOoilo) {
                    Object obj;
                    IIlOoolol0ll iIlOoolol0ll;
/* 8 */             if (((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 13 */                O1ooOo o1ooOo = (O1ooOo) iiIill0O0li1;
/* 19 */                if (!o1ooOo.I00iOIl.I00lll10) {
/* 23 */                    IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                        }
/* 28 */                O1ooOo o1ooOo2 = o1ooOo.I00iOIl.I00ilI0I1;
/* 30 */                O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iiIill0O0li1);
                        loop0: while (true) {
/* 34 */                    obj = null;
/* 35 */                    if (o0iiOioolIiI000O01llI0 == null) {
                                break;
                            }
/* 48 */                    if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 524288) != 0) {
/* 50 */                        while (o1ooOo2 != null) {
/* 55 */                            if ((o1ooOo2.I00iiO & 524288) != 0) {
/* 57 */                                O1ooOo o1ooOoI0000Il00O = o1ooOo2;
/* 58 */                                OI110O0 oi110o0 = null;
/* 59 */                                while (o1ooOoI0000Il00O != null) {
/* 63 */                                    if (o1ooOoI0000Il00O instanceof III010o1O) {
/* 65 */                                        obj = o1ooOoI0000Il00O;
                                                break loop0;
                                            }
/* 70 */                                    if ((o1ooOoI0000Il00O.I00iiO & 524288) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 81 */                                        int i = 0;
/* 83 */                                        for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 88 */                                            if ((o1ooOo3.I00iiO & 524288) != 0) {
/* 90 */                                                i++;
/* 92 */                                                if (i == 1) {
/* 94 */                                                    o1ooOoI0000Il00O = o1ooOo3;
                                                        } else {
/* 96 */                                                    if (oi110o0 == null) {
/* 104 */                                                       oi110o0 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 107 */                                                   if (o1ooOoI0000Il00O != null) {
/* 109 */                                                       oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 112 */                                                       o1ooOoI0000Il00O = null;
                                                            }
/* 113 */                                                   oi110o0.I00000oOI(o1ooOo3);
                                                        }
                                                    }
                                                }
/* 119 */                                       if (i == 1) {
                                                }
                                            }
/* 122 */                                   o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                        }
                                    }
/* 127 */                           o1ooOo2 = o1ooOo2.I00ilI0I1;
                                }
                            }
/* 130 */                   o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 145 */                   o1ooOo2 = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                        }
/* 147 */               III010o1O iII010o1O = (III010o1O) obj;
/* 149 */               if (iII010o1O != null) {
/* 152 */                   OIIlIII0Ili oIIlIII0IliI000II = il0lI1i1olii.I000II(iiIill0O0li1);
/* 160 */                   I01ii1IIl i01ii1IIl = new I01ii1IIl(23);
/* 163 */                   i01ii1IIl.I00iiI = illOOo00lI;
/* 165 */                   i01ii1IIl.I00iiO = oIIlIII0IliI000II;
/* 167 */                   VarHandle.storeStoreFence();
/* 170 */                   Object objI00Iooi00oi = iII010o1O.I00Iooi00oi(oIIlIII0IliI000II, i01ii1IIl, iOoilo);
/* 176 */                   if (objI00Iooi00oi == Ii0111o.I00iOIl) {
/* 178 */                       return objI00Iooi00oi;
                            }
                        }
                    }
/* 179 */           return OoiIlOl1iI.I00000oIO;
                }
            }
