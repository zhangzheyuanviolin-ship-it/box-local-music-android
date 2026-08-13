            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO1IIloiOoiO {
                public static final Oo011oIOO1 I00000oIO = new Oo011oIOO1(16);

                public static final void I00000oIO(OoI1Oi0l1I0o ooI1Oi0l1I0o, OoI1O1OIoI ooI1O1OIoI, Object obj, Object obj2, IlIoO1ilo1 ilIoO1ilo1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(867041821);
/* 9 */             int i3 = 4;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000II(ooI1Oi0l1I0o) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000II(ooI1O1OIoI) ? 32 : 16;
                    }
/* 42 */            if ((i & 384) == 0) {
/* 64 */                i2 |= (i & Barcode.FORMAT_UPC_A) == 0 ? iloI0lOlll1.I000II(obj) : iloI0lOlll1.I000OOo1O(obj) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 67 */            if ((i & 3072) == 0) {
/* 89 */                i2 |= (i & Barcode.FORMAT_AZTEC) == 0 ? iloI0lOlll1.I000II(obj2) : iloI0lOlll1.I000OOo1O(obj2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 92 */            if ((i & 24576) == 0) {
/* 116 */               i2 |= (32768 & i) == 0 ? iloI0lOlll1.I000II(ilIoO1ilo1) : iloI0lOlll1.I000OOo1O(ilIoO1ilo1) ? 16384 : 8192;
                    }
/* 132 */           if (!iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 149 */               iloI0lOlll1.I00OilO00Il();
                    } else if (ooI1Oi0l1I0o.I000OOo1O()) {
/* 140 */               ooI1O1OIoI.I000II(obj, obj2, ilIoO1ilo1);
                    } else {
/* 145 */               ooI1O1OIoI.I000O01llI0(obj2, ilIoO1ilo1, null, null);
                    }
/* 152 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 156 */           if (oOloioIlI001IO000 != null) {
/* 160 */               I1olloiiiOi i1olloiiiOi = new I1olloiiiOi(i3);
/* 163 */               i1olloiiiOi.I00ilI0I1 = ooI1Oi0l1I0o;
/* 165 */               i1olloiiiOi.I00iiO = ooI1O1OIoI;
/* 167 */               i1olloiiiOi.I00ilO0 = obj;
/* 169 */               i1olloiiiOi.I00io1l = obj2;
/* 171 */               i1olloiiiOi.I00iiI = ilIoO1ilo1;
/* 173 */               i1olloiiiOi.I00iio = i;
/* 175 */               VarHandle.storeStoreFence();
/* 178 */               oOloioIlI001IO000.I0000O = i1olloiiiOi;
                    }
                }

                public static final OoI1iOl0IoI I00000oOI(OoI1Oi0l1I0o ooI1Oi0l1I0o, Object obj, Object obj2, String str, IloI0lOlll1 iloI0lOlll1, int i) {
/* 3 */             int i2 = (i & 14) ^ 6;
/* 5 */             boolean z = true;
/* 22 */            boolean z2 = (i2 > 4 && iloI0lOlll1.I000II(ooI1Oi0l1I0o)) || (i & 6) == 4;
/* 23 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 27 */            Object obj3 = IOl11li.I00000oIO;
/* 29 */            if (z2 || objI00O0i0ii == obj3) {
/* 62 */                objI00O0i0ii = new OoI1iOl0IoI(new OI10ooOi(obj), ooI1Oi0l1I0o, ooI1Oi0l1I0o.I0000Il00O + " > " + str);
/* 65 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 68 */            OoI1iOl0IoI ooI1iOl0IoI = (OoI1iOl0IoI) objI00O0i0ii;
/* 70 */            if ((i2 <= 4 || !iloI0lOlll1.I000II(ooI1Oi0l1I0o)) && (i & 6) != 4) {
/* 83 */                z = false;
                    }
/* 88 */            boolean zI000II = iloI0lOlll1.I000II(ooI1iOl0IoI) | z;
/* 89 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj4 = objI00O0i0ii2;
/* 93 */            if (zI000II || objI00O0i0ii2 == obj3) {
/* 101 */               OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(21);
/* 104 */               oiOi011iI1ol.I00iiI = ooI1Oi0l1I0o;
/* 106 */               oiOi011iI1ol.I00iiO = ooI1iOl0IoI;
/* 108 */               VarHandle.storeStoreFence();
/* 111 */               iloI0lOlll1.I00iio(oiOi011iI1ol);
                        obj4 = oiOi011iI1ol;
                    }
/* 116 */           iIO0iiOiOl0l.I00000oOI(ooI1iOl0IoI, (Function1) obj4, iloI0lOlll1);
/* 123 */           if (ooI1Oi0l1I0o.I000OOo1O()) {
/* 125 */               ooI1iOl0IoI.I000lI(obj, obj2);
/* 128 */               return ooI1iOl0IoI;
                    }
/* 129 */           ooI1iOl0IoI.I00111O(obj2);
/* 136 */           ooI1iOl0IoI.I000l1.setValue(Boolean.FALSE);
/* 685 */           return ooI1iOl0IoI;
                }

                public static final OoI1I1i1 I0000Il00O(OoI1Oi0l1I0o ooI1Oi0l1I0o, OoIoOiiO1 ooIoOiiO1, String str, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    OoI11o1OI ooI11o1OI;
/* 1 */             boolean zI000II = iloI0lOlll1.I000II(ooI1Oi0l1I0o);
/* 5 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 9 */             Object obj = IOl11li.I00000oIO;
                    Object obj2 = objI00O0i0ii;
/* 11 */            if (zI000II || objI00O0i0ii == obj) {
/* 17 */                OoI1I1i1 ooI1I1i1 = new OoI1I1i1();
/* 20 */                ooI1I1i1.I0000Il00O = ooI1Oi0l1I0o;
/* 22 */                ooI1I1i1.I00000oIO = ooIoOiiO1;
/* 29 */                ooI1I1i1.I00000oOI = lOO00IiI0li.I00000oIO(null);
/* 31 */                VarHandle.storeStoreFence();
/* 34 */                iloI0lOlll1.I00iio(ooI1I1i1);
                        obj2 = ooI1I1i1;
                    }
/* 37 */            OoI1I1i1 ooI1I1i12 = (OoI1I1i1) obj2;
/* 47 */            boolean zI000II2 = iloI0lOlll1.I000II(ooI1Oi0l1I0o) | iloI0lOlll1.I000OOo1O(ooI1I1i12);
/* 48 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj3 = objI00O0i0ii2;
/* 52 */            if (zI000II2 || objI00O0i0ii2 == obj) {
/* 60 */                OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(22);
/* 63 */                oiOi011iI1ol.I00iiI = ooI1Oi0l1I0o;
/* 65 */                oiOi011iI1ol.I00iiO = ooI1I1i12;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                iloI0lOlll1.I00iio(oiOi011iI1ol);
                        obj3 = oiOi011iI1ol;
                    }
/* 75 */            iIO0iiOiOl0l.I00000oOI(ooI1I1i12, (Function1) obj3, iloI0lOlll1);
/* 82 */            if (ooI1Oi0l1I0o.I000OOo1O() && (ooI11o1OI = (OoI11o1OI) ooI1I1i12.I00000oOI.getValue()) != null) {
/* 94 */                OoI1Oi0l1I0o ooI1Oi0l1I0o2 = ooI1I1i12.I0000Il00O;
/* 138 */               ooI11o1OI.I00iOIl.I000II(ooI11o1OI.I00iiO.invoke(ooI1Oi0l1I0o2.I0001Ioi1lo().I00000oOI()), ooI11o1OI.I00iiO.invoke(ooI1Oi0l1I0o2.I0001Ioi1lo().I0000oI00()), (IlIoO1ilo1) ooI11o1OI.I00iiI.invoke(ooI1Oi0l1I0o2.I0001Ioi1lo()));
                    }
/* 685 */           return ooI1I1i12;
                }

                public static final OoI1O1OIoI I0000O(OoI1Oi0l1I0o ooI1Oi0l1I0o, Object obj, Object obj2, IlIoO1ilo1 ilIoO1ilo1, OoIoOiiO1 ooIoOiiO1, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object obj3;
                    Object obj4;
/* 7 */             int i2 = i & 14;
/* 9 */             int i3 = i2 ^ 6;
/* 11 */            boolean z = true;
/* 28 */            boolean z2 = (i3 > 4 && iloI0lOlll1.I000II(ooI1Oi0l1I0o)) || (i & 6) == 4;
/* 29 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 33 */            Object obj5 = IOl11li.I00000oIO;
/* 35 */            if (z2 || objI00O0i0ii == obj5) {
/* 45 */                Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 56 */                Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 57 */                Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                        try {
/* 65 */                    obj3 = obj2;
/* 71 */                    I110ooool i110ooool = (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj3);
/* 73 */                    i110ooool.I0000O();
/* 76 */                    obj4 = obj;
/* 78 */                    Object ooI1O1OIoI = new OoI1O1OIoI(ooI1Oi0l1I0o, obj4, i110ooool, ooIoOiiO1);
/* 81 */                    iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 84 */                    iloI0lOlll1.I00iio(ooI1O1OIoI);
/* 87 */                    objI00O0i0ii = ooI1O1OIoI;
                        } catch (Throwable th) {
/* 173 */                   iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 965 */                   throw th;
                        }
                    } else {
/* 40 */                obj4 = obj;
/* 42 */                obj3 = obj2;
                    }
/* 89 */            OoI1O1OIoI ooI1O1OIoI2 = (OoI1O1OIoI) objI00O0i0ii;
/* 93 */            int i4 = (i >> 3) & 8;
/* 98 */            int i5 = i << 3;
/* 119 */           I00000oIO(ooI1Oi0l1I0o, ooI1O1OIoI2, obj4, obj3, ilIoO1ilo1, iloI0lOlll1, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
/* 122 */           if ((i3 <= 4 || !iloI0lOlll1.I000II(ooI1Oi0l1I0o)) && (i & 6) != 4) {
/* 135 */               z = false;
                    }
/* 140 */           boolean zI000II = iloI0lOlll1.I000II(ooI1O1OIoI2) | z;
/* 141 */           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj6 = objI00O0i0ii2;
/* 145 */           if (zI000II || objI00O0i0ii2 == obj5) {
/* 153 */               OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(19);
/* 156 */               oiOi011iI1ol.I00iiI = ooI1Oi0l1I0o;
/* 158 */               oiOi011iI1ol.I00iiO = ooI1O1OIoI2;
/* 160 */               VarHandle.storeStoreFence();
/* 163 */               iloI0lOlll1.I00iio(oiOi011iI1ol);
                        obj6 = oiOi011iI1ol;
                    }
/* 168 */           iIO0iiOiOl0l.I00000oOI(ooI1O1OIoI2, (Function1) obj6, iloI0lOlll1);
/* 171 */           return ooI1O1OIoI2;
                }

                public static final OoI1Oi0l1I0o I0000oI00(I01O1lIi i01O1lIi, String str, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 str = null;
                    }
/* 9 */             int i3 = (i & 14) ^ 6;
/* 11 */            boolean z = true;
/* 28 */            boolean z2 = (i3 > 4 && iloI0lOlll1.I000II(i01O1lIi)) || (i & 6) == 4;
/* 29 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 33 */            Object obj = IOl11li.I00000oIO;
/* 35 */            if (z2 || objI00O0i0ii == obj) {
/* 39 */                Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 50 */                Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 51 */                Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                        try {
/* 57 */                    Object ooI1iOl0IoI = new OoI1iOl0IoI(i01O1lIi, null, str);
/* 60 */                    iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 63 */                    iloI0lOlll1.I00iio(ooI1iOl0IoI);
/* 66 */                    objI00O0i0ii = ooI1iOl0IoI;
                        } catch (Throwable th) {
/* 250 */                   iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 399 */                   throw th;
                        }
                    }
/* 67 */            OoI1Oi0l1I0o ooI1Oi0l1I0o = (OoI1Oi0l1I0o) objI00O0i0ii;
/* 71 */            if (i01O1lIi instanceof Oii110oOoO) {
/* 76 */                iloI0lOlll1.I00i01iIIliI(-1357398105);
/* 79 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 83 */                if (objI00O0i0ii2 == obj) {
/* 85 */                    objI00O0i0ii2 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 89 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 92 */                Object obj2 = (Ii0110) objI00O0i0ii2;
/* 113 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2) | ((i3 > 4 && iloI0lOlll1.I000II(i01O1lIi)) || (i & 6) == 4);
/* 114 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii3;
/* 118 */               if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 126 */                   OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(20);
/* 129 */                   oiOi011iI1ol.I00iiI = i01O1lIi;
/* 131 */                   oiOi011iI1ol.I00iiO = obj2;
/* 133 */                   VarHandle.storeStoreFence();
/* 136 */                   iloI0lOlll1.I00iio(oiOi011iI1ol);
                            obj3 = oiOi011iI1ol;
                        }
/* 141 */               iIO0iiOiOl0l.I00000oOI(obj2, (Function1) obj3, iloI0lOlll1);
/* 145 */               Oii110oOoO oii110oOoO = (Oii110oOoO) i01O1lIi;
/* 149 */               Object value = oii110oOoO.I00iiO.getValue();
/* 155 */               Object value2 = oii110oOoO.I00iiI.getValue();
/* 159 */               if ((i3 <= 4 || !iloI0lOlll1.I000II(i01O1lIi)) && (i & 6) != 4) {
/* 172 */                   z = false;
                        }
/* 173 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 177 */               if (z || objI00O0i0ii4 == obj) {
/* 185 */                   objI00O0i0ii4 = new OO11OilO(i01O1lIi, iOoil1iiIilo, 25);
/* 188 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 193 */               iIO0iiOiOl0l.I0000oI00(value, value2, (IlliIl1l11O) objI00O0i0ii4, iloI0lOlll1);
/* 196 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 203 */               iloI0lOlll1.I00i01iIIliI(-1356407283);
/* 210 */               ooI1Oi0l1I0o.I00000oIO(i01O1lIi.I00oliIiO01i(), iloI0lOlll1, 0);
/* 213 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 216 */           boolean zI000II = iloI0lOlll1.I000II(ooI1Oi0l1I0o);
/* 220 */           Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                    Object obj4 = objI00O0i0ii5;
/* 224 */           if (zI000II || objI00O0i0ii5 == obj) {
/* 232 */               Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(13);
/* 235 */               ol1OiIli00Ii.I00iiI = ooI1Oi0l1I0o;
/* 237 */               VarHandle.storeStoreFence();
/* 240 */               iloI0lOlll1.I00iio(ol1OiIli00Ii);
                        obj4 = ol1OiIli00Ii;
                    }
/* 245 */           iIO0iiOiOl0l.I00000oOI(ooI1Oi0l1I0o, (Function1) obj4, iloI0lOlll1);
/* 248 */           return ooI1Oi0l1I0o;
                }

                public static final OoI1iOl0IoI I0001Ioi1lo(Object obj, String str, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 str = null;
                    }
/* 7 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 11 */            Object obj2 = IOl11li.I00000oIO;
/* 13 */            if (objI00O0i0ii == obj2) {
/* 22 */                objI00O0i0ii = new OoI1iOl0IoI(new OI10ooOi(obj), null, str);
/* 25 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 28 */            OoI1iOl0IoI ooI1iOl0IoI = (OoI1iOl0IoI) objI00O0i0ii;
/* 37 */            ooI1iOl0IoI.I00000oIO(obj, iloI0lOlll1, (i & 8) | 48 | (i & 14));
/* 40 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj3 = objI00O0i0ii2;
/* 44 */            if (objI00O0i0ii2 == obj2) {
/* 50 */                Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(12);
/* 53 */                ol1OiIli00Ii.I00iiI = ooI1iOl0IoI;
/* 55 */                VarHandle.storeStoreFence();
/* 58 */                iloI0lOlll1.I00iio(ol1OiIli00Ii);
                        obj3 = ol1OiIli00Ii;
                    }
/* 63 */            iIO0iiOiOl0l.I00000oOI(ooI1iOl0IoI, (Function1) obj3, iloI0lOlll1);
/* 399 */           return ooI1iOl0IoI;
                }
            }
