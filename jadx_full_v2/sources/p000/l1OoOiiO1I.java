            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1OoOiiO1I {
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, boolean z, IllOOo00lI illOOo00lI, Function1 function1, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    O1ooiI111i o1ooiI111i2;
/* 13 */            String str = oloIl1l1oOii.I00000oIO;
/* 18 */            iloI0lOlll1.I00i0O(-80507648);
/* 83 */            int i3 = i | (iloI0lOlll1.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(o1ol100o0O) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 2048 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(function1) ? 16384 : 8192) | 196608;
/* 104 */           if (iloI0lOlll1.I00OIl(i3 & 1, (74899 & i3) != 74898)) {
/* 106 */               String str2 = oloIl1l1oOii.I00000oOI;
/* 108 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 112 */               Object obj = IOl11li.I00000oIO;
/* 114 */               if (objI00O0i0ii == obj) {
/* 118 */                   Io1olIi io1olIi = new Io1olIi(3);
/* 121 */                   io1olIi.I00iiI = oloIl1l1oOii;
/* 123 */                   VarHandle.storeStoreFence();
/* 126 */                   objI00O0i0ii = Ol1llolil.I00000oOI(io1olIi);
/* 130 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 133 */               OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii;
/* 145 */               Integer numValueOf = Integer.valueOf(((Number) olO01l1oOil.getValue()).intValue());
/* 149 */               int i4 = i3 & 7168;
/* 156 */               boolean z2 = i4 == 2048;
/* 158 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 162 */               if (z2 || objI00O0i0ii2 == obj) {
/* 171 */                   objI00O0i0ii2 = new O00lOIIO(illOOo00lI, olO01l1oOil, null, 17);
/* 174 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 179 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, numValueOf);
/* 201 */               boolean z3 = O0000Ioio00.I0000O(str, "whisper") || O0000Ioio00.I0000O(str, "tts");
/* 205 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(6);
/* 216 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oloIl1l1oOii) | iloI0lOlll1.I000OOo1O(o1ol100o0O);
/* 217 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii3;
/* 221 */               if (zI000OOo1O || objI00O0i0ii3 == obj) {
/* 228 */                   O1lIIi o1lIIi = new O1lIIi(5);
/* 231 */                   o1lIIi.I00iiI = oloIl1l1oOii;
/* 233 */                   o1lIIi.I00iiO = o1ol100o0O;
/* 235 */                   VarHandle.storeStoreFence();
/* 238 */                   iloI0lOlll1.I00iio(o1lIIi);
                            obj2 = o1lIIi;
                        }
/* 243 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll1, 0);
/* 253 */               boolean z4 = i4 == 2048;
/* 254 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii4;
/* 258 */               if (z4 || objI00O0i0ii4 == obj) {
/* 266 */                   I0O1OI i0o1oi = new I0O1OI(15);
/* 269 */                   i0o1oi.I00iiI = illOOo00lI;
/* 271 */                   VarHandle.storeStoreFence();
/* 274 */                   iloI0lOlll1.I00iio(i0o1oi);
                            obj3 = i0o1oi;
                        }
/* 280 */               iOOloIo.I00000oIO(0, 1, (IllOOo00lI) obj3, iloI0lOlll1, false);
/* 286 */               Il0oOOll1 il0oOOll1 = new Il0oOOll1(2);
/* 289 */               il0oOOll1.I00iiO = str2;
/* 291 */               il0oOOll1.I00iiI = illOOo00lI;
/* 293 */               VarHandle.storeStoreFence();
/* 299 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1432562236, il0oOOll1, iloI0lOlll1);
/* 305 */               O1oiO0i0 o1oiO0i0 = new O1oiO0i0();
/* 308 */               o1oiO0i0.I00iOIl = oloIl1l1oOii;
/* 310 */               o1oiO0i0.I00iiI = o1ol100o0O;
/* 312 */               o1oiO0i0.I00iiO = z;
/* 314 */               o1oiO0i0.I00iio = function1;
/* 316 */               o1oiO0i0.I00ilI0I1 = z3;
/* 318 */               o1oiO0i0.I00ilO0 = o1OIi1I00000oIO;
/* 320 */               VarHandle.storeStoreFence();
/* 326 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-432356465, o1oiO0i0, iloI0lOlll1);
/* 335 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 349 */               i2 = 3;
/* 350 */               lO0l01iI0i.I00000oIO(o1ooiI111i2, iOii1lI00000oOI, null, null, null, 0, 0L, 0L, null, iOii1lI00000oOI2, iloI0lOlll1, 805306422, 508);
                    } else {
/* 354 */               i2 = 3;
/* 355 */               iloI0lOlll1.I00OilO00Il();
/* 358 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 360 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 364 */           if (oOloioIlI001IO000 != null) {
/* 368 */               IO0i1IlOoI iO0i1IlOoI = new IO0i1IlOoI(i2);
/* 371 */               iO0i1IlOoI.I00ilI0I1 = oloIl1l1oOii;
/* 373 */               iO0i1IlOoI.I00ilO0 = o1ol100o0O;
/* 375 */               iO0i1IlOoI.I00iio = z;
/* 377 */               iO0i1IlOoI.I00iiI = illOOo00lI;
/* 381 */               iO0i1IlOoI.I00io1l = function1;
/* 383 */               iO0i1IlOoI.I00iiO = o1ooiI111i2;
/* 385 */               VarHandle.storeStoreFence();
/* 388 */               oOloioIlI001IO000.I0000O = iO0i1IlOoI;
                    }
                }
            }
