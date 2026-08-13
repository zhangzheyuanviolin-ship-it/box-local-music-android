            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class i000I00 {
                public static final OoIoO0I0oOI I00000oIO = iOO01lio0.I0000O(500, 2, OI0I100IO.I0000O);
                public static final OoIoO0I0oOI I00000oOI = iOO01lio0.I0000O(500, 2, OI0I100IO.I00000oIO);

                /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, long j, long j2, OlOooI0l0011 olOooI0l0011, OlOooI0l0011 olOooI0l00112, float f, float f2, Function1 function1, float f3, float f4, IloI0lOlll1 iloI0lOlll1, int i) {
                    OlOooI0l0011 olOooI0l00113;
                    OlOooI0l0011 olOooI0l00114;
                    float f5;
                    float f6;
                    Function1 function12;
                    float f7;
                    float f8;
                    float f9;
                    int i2;
/* 14 */            iloI0lOlll1.I00i0O(2019304030);
/* 68 */            int i3 = i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | (iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16) | (iloI0lOlll1.I0001Ioi1lo(j) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I0001Ioi1lo(j2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | 306782208;
/* 88 */            if (iloI0lOlll1.I00OIl(i3 & 1, (306783379 & i3) != 306783378)) {
/* 90 */                iloI0lOlll1.I00Ol00();
/* 98 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 129 */                   float f10 = i0001OOI.I00000oIO;
/* 131 */                   OOiIOoiOO oOiIOoiOO = IOlO0o100i1i.I000O01llI0;
/* 171 */                   olOooI0l00113 = new OlOooI0l0011(((IiIooOOOI) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00i0ilIl0i(4.0f), 0.0f, 1, 0, null, 26);
/* 212 */                   olOooI0l00114 = new OlOooI0l0011(((IiIooOOOI) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00i0ilIl0i(4.0f), 0.0f, 1, 0, null, 26);
/* 217 */                   f5 = i0001OOI.I0000oI00;
/* 219 */                   float f11 = i0001OOI.I0000O;
/* 221 */                   function12 = i0001OOI.I0001Ioi1lo;
/* 223 */                   f7 = i0001OOI.I00000oIO;
/* 230 */                   f9 = f7;
/* 225 */                   i2 = i3 & (-2147475457);
/* 234 */                   f6 = f11;
                        } else {
/* 107 */                   iloI0lOlll1.I00OilO00Il();
/* 111 */                   olOooI0l00113 = olOooI0l0011;
/* 113 */                   olOooI0l00114 = olOooI0l00112;
/* 115 */                   f5 = f;
/* 117 */                   function12 = function1;
/* 119 */                   f7 = f3;
/* 121 */                   f9 = f4;
/* 110 */                   i2 = i3 & (-2147475457);
/* 125 */                   f6 = f2;
                        }
/* 236 */               iloI0lOlll1.I0010o();
/* 241 */               O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(I01olIOo10.I00000oOI);
/* 252 */               boolean z = (i2 & 14) == 4;
/* 254 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 258 */               if (!z) {
                            Object obj = objI00O0i0ii;
/* 262 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 268 */                       I11i0ol0l0 i11i0ol0l0 = new I11i0ol0l0(16);
/* 271 */                       i11i0ol0l0.I00iiI = illOOo00lI;
/* 273 */                       VarHandle.storeStoreFence();
/* 276 */                       iloI0lOlll1.I00iio(i11i0ol0l0);
                                obj = i11i0ol0l0;
                            }
/* 294 */                   O1ooiI111i o1ooiI111iI00000oOI = ii0OOOOo0i.I00000oOI(Ol0iOOO0.I000o00OoI0I(OiioloIlOlIi.I00000oOI(o1ooiI111iI0000O, true, (Function1) obj), i0001OOI.I0000Il00O, i0001OOI.I00000oOI));
/* 300 */                   IiOoOOlI iiOoOOlI = new IiOoOOlI();
/* 303 */                   iiOoOOlI.I00000oIO = illOOo00lI;
/* 305 */                   iiOoOOlI.I00000oOI = function12;
/* 307 */                   iiOoOOlI.I0000Il00O = j;
/* 309 */                   iiOoOOlI.I0000O = j2;
/* 311 */                   iiOoOOlI.I0000oI00 = olOooI0l00113;
/* 313 */                   iiOoOOlI.I0001Ioi1lo = olOooI0l00114;
/* 315 */                   iiOoOOlI.I000II = f5;
/* 317 */                   iiOoOOlI.I000O01llI0 = f6;
/* 319 */                   iiOoOOlI.I000OOo1O = f7;
/* 321 */                   f8 = f9;
/* 323 */                   iiOoOOlI.I000OiO = f8;
/* 325 */                   VarHandle.storeStoreFence();
/* 332 */                   lOO1OIO00.I00000oIO(iloI0lOlll1, o1ooiI111iI00000oOI.I0000O(iiOoOOlI));
                        }
                    } else {
/* 336 */               iloI0lOlll1.I00OilO00Il();
/* 339 */               olOooI0l00113 = olOooI0l0011;
/* 341 */               olOooI0l00114 = olOooI0l00112;
/* 343 */               f5 = f;
/* 345 */               f6 = f2;
/* 347 */               function12 = function1;
/* 349 */               f7 = f3;
/* 351 */               f8 = f4;
                    }
/* 353 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 357 */           if (oOloioIlI001IO000 != null) {
/* 361 */               i0001oOI0I i0001ooi0i = new i0001oOI0I();
/* 364 */               i0001ooi0i.I00iOIl = illOOo00lI;
/* 366 */               i0001ooi0i.I00iiI = o1ooiI111i;
/* 368 */               i0001ooi0i.I00iiO = j;
/* 370 */               i0001ooi0i.I00iio = j2;
/* 372 */               i0001ooi0i.I00ilI0I1 = olOooI0l00113;
/* 374 */               i0001ooi0i.I00ilO0 = olOooI0l00114;
/* 376 */               i0001ooi0i.I00io1l = f5;
/* 378 */               i0001ooi0i.I00ioIO = f6;
/* 380 */               i0001ooi0i.I00l0I0l0lO1 = function12;
/* 382 */               i0001ooi0i.I00l0OO0IO = f7;
/* 384 */               i0001ooi0i.I00li1OI = f8;
/* 386 */               VarHandle.storeStoreFence();
/* 389 */               oOloioIlI001IO000.I0000O = i0001ooi0i;
                    }
                }
            }
