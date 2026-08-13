            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ill10o0 {
                public static final void I00000oIO(String str, String str2, Function1 function1, String str3, Function1 function12, String str4, Function1 function13, IllOOo00lI illOOo00lI, Function1 function14, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 15 */            IllOOo00lI illOOo00lI2 = illOOo00lI;
/* 26 */            iloI0lOlll1.I00i0O(-2134651955);
/* 32 */            if ((i & 6) == 0) {
/* 43 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 45 */                i2 = i;
                    }
/* 48 */            if ((i & 48) == 0) {
/* 61 */                i2 |= iloI0lOlll1.I000II(str2) ? 32 : 16;
                    }
/* 64 */            if ((i & 384) == 0) {
/* 77 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 80 */            if ((i & 3072) == 0) {
/* 93 */                i2 |= iloI0lOlll1.I000II(str3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 96 */            if ((i & 24576) == 0) {
/* 109 */               i2 |= iloI0lOlll1.I000OOo1O(function12) ? 16384 : 8192;
                    }
/* 113 */           if ((196608 & i) == 0) {
/* 126 */               i2 |= iloI0lOlll1.I000II(str4) ? 131072 : 65536;
                    }
/* 130 */           if ((1572864 & i) == 0) {
/* 143 */               i2 |= iloI0lOlll1.I000OOo1O(function13) ? 1048576 : 524288;
                    }
/* 147 */           if ((12582912 & i) == 0) {
/* 160 */               i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 8388608 : 4194304;
                    }
/* 164 */           if ((100663296 & i) == 0) {
/* 177 */               i2 |= iloI0lOlll1.I000OOo1O(function14) ? 67108864 : 33554432;
                    }
/* 199 */           if (iloI0lOlll1.I00OIl(i2 & 1, (38347923 & i2) != 38347922)) {
/* 202 */               Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll1);
/* 206 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 210 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 212 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 214 */                   objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 218 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 221 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 229 */               IOO0IOIll iOO0IOIll = (IOO0IOIll) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0001Ioi1lo);
/* 265 */               boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
/* 267 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 271 */               if (z || objI00O0i0ii2 == iOO0o0I1l) {
/* 278 */                   objI00O0i0ii2 = new I0O0il1iIl(str2, function1, str, (IOoil1iiIilo) null);
/* 281 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 286 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll1, str);
/* 292 */               IlooOlII0 ilooOlII0 = new IlooOlII0(0);
/* 295 */               ilooOlII0.I00ilO0 = str2;
/* 297 */               ilooOlII0.I00iiI = function1;
/* 299 */               ilooOlII0.I00io1l = str3;
/* 301 */               ilooOlII0.I00l0I0l0lO1 = function12;
/* 303 */               ilooOlII0.I00ioIO = str4;
/* 305 */               ilooOlII0.I00l0OO0IO = function13;
/* 307 */               ilooOlII0.I00iiO = ii0110;
/* 309 */               ilooOlII0.I00ll1 = iOO0IOIll;
/* 311 */               ilooOlII0.I00li1OI = function14;
/* 313 */               ilooOlII0.I00iio = ol010000lo00I00000oOI;
/* 317 */               ilooOlII0.I00ilI0I1 = illOOo00lI;
/* 319 */               VarHandle.storeStoreFence();
/* 354 */               illOOo00lI2 = illOOo00lI;
/* 358 */               l1OloIOiO01.I00000oIO(illOOo00lI2, null, ol010000lo00I00000oOI, 0.0f, false, null, 0L, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(-1488641237, ilooOlII0, iloI0lOlll1), iloI0lOlll1, (i2 >> 21) & 14, 3072, 8186);
                    } else {
/* 362 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 365 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 369 */           if (oOloioIlI001IO000 != null) {
/* 373 */               IlooOlooI ilooOlooI = new IlooOlooI();
/* 376 */               ilooOlooI.I00iOIl = str;
/* 378 */               ilooOlooI.I00iiI = str2;
/* 380 */               ilooOlooI.I00iiO = function1;
/* 382 */               ilooOlooI.I00iio = str3;
/* 384 */               ilooOlooI.I00ilI0I1 = function12;
/* 386 */               ilooOlooI.I00ilO0 = str4;
/* 388 */               ilooOlooI.I00io1l = function13;
/* 390 */               ilooOlooI.I00ioIO = illOOo00lI2;
/* 394 */               ilooOlooI.I00l0I0l0lO1 = function14;
/* 398 */               ilooOlooI.I00l0OO0IO = i;
/* 400 */               VarHandle.storeStoreFence();
/* 403 */               oOloioIlI001IO000.I0000O = ilooOlooI;
                    }
                }
            }
