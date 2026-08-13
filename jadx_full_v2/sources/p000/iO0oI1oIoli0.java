            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0oI1oIoli0 {
                public static final void I00000oIO(String str, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-824207615);
/* 17 */            int i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
/* 31 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 33 */                OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 43 */                long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I000O01llI0;
/* 53 */                long j2 = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I000OOo1O;
/* 63 */                OiI111I oiI111I = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I0000Il00O.I00000oOI;
/* 69 */                I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(12);
/* 72 */                i0Iooi0i1l0l.I00iiI = str;
/* 74 */                VarHandle.storeStoreFence();
/* 93 */                OlioioOl0O.I00000oIO(null, oiI111I, j, j2, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(1992356166, i0Iooi0i1l0l, iloI0lOlll1), iloI0lOlll1, 12582912, 113);
                    } else {
/* 97 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 100 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 104 */           if (oOloioIlI001IO000 != null) {
/* 110 */               I0Iooi0i1l0l i0Iooi0i1l0l2 = new I0Iooi0i1l0l(13);
/* 113 */               i0Iooi0i1l0l2.I00iiI = str;
/* 115 */               VarHandle.storeStoreFence();
/* 118 */               oOloioIlI001IO000.I0000O = i0Iooi0i1l0l2;
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public static final void I00000oOI(p000.O1ol100o0O r57, p000.OilIlo r58, p000.IloI0lOlll1 r59, int r60) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 2197
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.iO0oI1oIoli0.I00000oOI(O1ol100o0O, OilIlo, IloI0lOlll1, int):void");
                }

                public static final void I0000Il00O(String str, boolean z, boolean z2, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    int i3;
/* 7 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 14 */            iloI0lOlll12.I00i0O(-1886695573);
/* 28 */            int i4 = (iloI0lOlll12.I000O01llI0(z) ? 32 : 16) | i;
/* 31 */            if ((i & 384) == 0) {
/* 44 */                i4 |= iloI0lOlll12.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 56 */            int i5 = i4 | (iloI0lOlll12.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 73 */            if (iloI0lOlll12.I00OIl(i5 & 1, (i5 & 1171) != 1170)) {
/* 79 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f);
/* 89 */                OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll12, 54);
/* 95 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 99 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 103 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000oI00);
/* 109 */               IOl0oi0lOl1.I000lI.getClass();
/* 112 */               iloI0lOlll12.I00i0oil();
/* 117 */               if (iloI0lOlll12.I00O10llo) {
/* 121 */                   iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 125 */                   iloI0lOlll12.I00io1l();
                        }
/* 130 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 135 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 144 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 147 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 152 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 228 */               Oo0i1oIIoOO.I00000oOI(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000iOII, iloI0lOlll1, 6, 0, 131070);
/* 252 */               iloI0lOlll12 = iloI0lOlll1;
/* 254 */               i3 = i;
/* 256 */               OllI1oooIo1o.I00000oIO(z, function1, null, z2, null, iloI0lOlll12, ((i5 >> 3) & 14) | ((i5 >> 6) & 112) | (57344 & (i5 << 6)), 108);
/* 259 */               i2 = 1;
/* 260 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 264 */               i2 = 1;
/* 265 */               i3 = i;
/* 266 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 269 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 273 */           if (oOloioIlI001IO000 != null) {
/* 277 */               IloOIOoo0Il1 iloOIOoo0Il1 = new IloOIOoo0Il1(i2);
/* 282 */               iloOIOoo0Il1.I00ilI0I1 = str;
/* 284 */               iloOIOoo0Il1.I00iiI = z;
/* 286 */               iloOIOoo0Il1.I00iiO = z2;
/* 288 */               iloOIOoo0Il1.I00ilO0 = function1;
/* 290 */               iloOIOoo0Il1.I00iio = i3;
/* 292 */               VarHandle.storeStoreFence();
/* 295 */               oOloioIlI001IO000.I0000O = iloOIOoo0Il1;
                    }
                }

                public static final void I0000O(OilIl00O1o oilIl00O1o, Function1 function1, Function1 function12, Function1 function13, Function1 function14, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object next;
                    String str;
/* 7 */             iloI0lOlll1.I00i0O(-46366259);
/* 68 */            int i2 = i | (iloI0lOlll1.I000OOo1O(oilIl00O1o) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(function1) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(function12) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(function13) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(function14) ? 16384 : 8192);
/* 84 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 86 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 92 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 96 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 100 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 103 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 109 */               Iterator it = Oil1lO.I00000oOI.iterator();
                        while (true) {
/* 117 */                   if (!it.hasNext()) {
/* 137 */                       next = null;
                                break;
                            } else {
/* 119 */                       next = it.next();
/* 134 */                       if (O0000Ioio00.I0000O(((OIoi0IIoi) next).I00iOIl, oilIl00O1o.I0000oI00)) {
                                    break;
                                }
                            }
                        }
/* 138 */               OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) next;
/* 140 */               if (oIoi0IIoi == null || (str = (String) oIoi0IIoi.I00iiI) == null) {
/* 148 */                   str = "Auto-detect";
                        }
/* 154 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f);
/* 161 */               II011lliOioI iI011lliOioI = new II011lliOioI(3);
/* 164 */               iI011lliOioI.I00iiO = oilIl00O1o;
/* 166 */               iI011lliOioI.I00iio = function12;
/* 168 */               iI011lliOioI.I00ilI0I1 = function13;
/* 170 */               iI011lliOioI.I00ilO0 = function14;
/* 172 */               iI011lliOioI.I00iiI = oI10i0Il;
/* 174 */               iI011lliOioI.I00io1l = str;
/* 176 */               iI011lliOioI.I00ioIO = function1;
/* 178 */               VarHandle.storeStoreFence();
/* 196 */               iOl111l1l.I0000oI00(o1ooiI111iI0000oI00, null, null, null, null, iiioOl1O.I00000oOI(1803023169, iI011lliOioI, iloI0lOlll1), iloI0lOlll1, 196614);
                    } else {
/* 200 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 203 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 207 */           if (oOloioIlI001IO000 != null) {
/* 213 */               O11l0o011lO1 o11l0o011lO1 = new O11l0o011lO1(12);
/* 216 */               o11l0o011lO1.I00iiI = oilIl00O1o;
/* 218 */               o11l0o011lO1.I00iiO = function1;
/* 220 */               o11l0o011lO1.I00iio = function12;
/* 222 */               o11l0o011lO1.I00ilI0I1 = function13;
/* 224 */               o11l0o011lO1.I00ilO0 = function14;
/* 226 */               VarHandle.storeStoreFence();
/* 229 */               oOloioIlI001IO000.I0000O = o11l0o011lO1;
                    }
                }

                public static final void I0000oI00(Oil1oo000i oil1oo000i, boolean z, boolean z2, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1867544654);
/* 11 */            int i2 = 2;
/* 65 */            int i3 = (iloI0lOlll1.I000II(oil1oo000i) ? 4 : 2) | i | (iloI0lOlll1.I000O01llI0(z) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 16384 : 8192);
/* 81 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 9363) != 9362)) {
/* 87 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f);
/* 93 */                OilI0ol oilI0ol = new OilI0ol();
/* 96 */                oilI0ol.I00iOIl = oil1oo000i;
/* 98 */                oilI0ol.I00iiI = illOOo00lI;
/* 100 */               oilI0ol.I00iiO = illOOo00lI2;
/* 102 */               oilI0ol.I00iio = z;
/* 104 */               oilI0ol.I00ilI0I1 = z2;
/* 106 */               VarHandle.storeStoreFence();
/* 124 */               iOl111l1l.I0000oI00(o1ooiI111iI0000oI00, null, null, null, null, iiioOl1O.I00000oOI(2082708314, oilI0ol, iloI0lOlll1), iloI0lOlll1, 196614);
                    } else {
/* 128 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 131 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 135 */           if (oOloioIlI001IO000 != null) {
/* 139 */               OIl0oOo1OI oIl0oOo1OI = new OIl0oOo1OI(i2);
/* 142 */               oIl0oOo1OI.I00iio = oil1oo000i;
/* 144 */               oIl0oOo1OI.I00iiI = z;
/* 146 */               oIl0oOo1OI.I00iiO = z2;
/* 148 */               oIl0oOo1OI.I00ilI0I1 = illOOo00lI;
/* 150 */               oIl0oOo1OI.I00ilO0 = illOOo00lI2;
/* 152 */               VarHandle.storeStoreFence();
/* 155 */               oOloioIlI001IO000.I0000O = oIl0oOo1OI;
                    }
                }

                public static final String I0001Ioi1lo(String str) {
                    String strValueOf;
/* 1 */             Locale locale = Locale.ROOT;
/* 3 */             String lowerCase = str.toLowerCase(locale);
/* 11 */            if (lowerCase.length() <= 0) {
/* 168 */               return lowerCase;
                    }
/* 15 */            StringBuilder sb = new StringBuilder();
/* 19 */            char cCharAt = lowerCase.charAt(0);
/* 28 */            if (Character.isLowerCase(cCharAt)) {
/* 34 */                strValueOf = String.valueOf(cCharAt).toUpperCase(locale);
/* 42 */                if (strValueOf.length() <= 1) {
/* 81 */                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        } else if (cCharAt != 329) {
/* 72 */                    strValueOf = strValueOf.charAt(0) + strValueOf.substring(1).toLowerCase(locale);
                        }
                    } else {
/* 86 */                strValueOf = String.valueOf(cCharAt);
                    }
/* 90 */            sb.append((Object) strValueOf);
/* 97 */            sb.append(lowerCase.substring(1));
/* 100 */           return sb.toString();
                }
            }
