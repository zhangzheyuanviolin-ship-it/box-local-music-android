            package p000;

            import android.content.Context;
            import android.view.View;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO1IOIoilO {
                public static final void I00000oIO(String str, OoI1lOl ooI1lOl, boolean z, O1ooiI111i o1ooiI111i, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
/* 9 */             iloI0lOlll1.I00i0O(788446540);
/* 61 */            int i2 = i | (iloI0lOlll1.I000II(ooI1lOl) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z) ? 256 : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(function1) ? 16384 : 8192);
/* 79 */            int i3 = 3;
/* 80 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 82 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 86 */                Object obj = IOl11li.I00000oIO;
/* 88 */                if (objI00O0i0ii == obj) {
/* 92 */                    objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 96 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 99 */                OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii;
/* 107 */               boolean zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 113 */               boolean z2 = (i2 & 896) == 256;
/* 116 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 120 */               if (z2 || objI00O0i0ii2 == obj) {
/* 127 */                   I1loII i1loII = new I1loII(6);
/* 130 */                   i1loII.I00iiI = z;
/* 132 */                   i1loII.I00iiO = oI10i0Il;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   iloI0lOlll1.I00iio(i1loII);
                            obj2 = i1loII;
                        }
/* 144 */               OoIII0Iil ooIII0Iil = new OoIII0Iil();
/* 147 */               ooIII0Iil.I00iOIl = ooI1lOl;
/* 149 */               ooIII0Iil.I00iiI = z;
/* 151 */               ooIII0Iil.I00iiO = str;
/* 153 */               ooIII0Iil.I00iio = oI10i0Il;
/* 155 */               ooIII0Iil.I00ilI0I1 = function1;
/* 157 */               VarHandle.storeStoreFence();
/* 177 */               ilIoOii1l.I00000oIO(zBooleanValue, (Function1) obj2, o1ooiI111i, iiioOl1O.I00000oOI(-1078573322, ooIII0Iil, iloI0lOlll1), iloI0lOlll1, ((i2 >> 3) & 896) | 3072, 0);
                    } else {
/* 181 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 184 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 188 */           if (oOloioIlI001IO000 != null) {
/* 192 */               O11I0O0i o11I0O0i = new O11I0O0i(i3);
/* 195 */               o11I0O0i.I00ilI0I1 = str;
/* 197 */               o11I0O0i.I00ilO0 = ooI1lOl;
/* 199 */               o11I0O0i.I00iiI = z;
/* 201 */               o11I0O0i.I00iiO = o1ooiI111i;
/* 203 */               o11I0O0i.I00iio = function1;
/* 205 */               VarHandle.storeStoreFence();
/* 208 */               oOloioIlI001IO000.I0000O = o11I0O0i;
                    }
                }

                public static final void I00000oOI(String str, boolean z, boolean z2, boolean z3, O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    IIIi0O0I1Oo iIIi0O0I1OoI00000oOI;
/* 18 */            iloI0lOlll1.I00i0O(1529862457);
/* 91 */            int i2 = i | (iloI0lOlll1.I000II(str) ? 4 : 2) | (iloI0lOlll1.I000O01llI0(z) ? 32 : 16) | (iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000O01llI0(z3) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000II(o1ooiI111i) ? 16384 : 8192) | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 131072 : 65536);
/* 113 */           if (iloI0lOlll1.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 122 */               boolean z4 = z3 || z;
/* 125 */               O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(o1ooiI111i, 56.0f);
/* 129 */               if (z) {
/* 134 */                   iloI0lOlll1.I00i01iIIliI(-2060158916);
/* 137 */                   OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 155 */                   iIIi0O0I1OoI00000oOI = IIIi0o0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I001i1O0Ol, 0L, iloI0lOlll1, 14);
/* 159 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 167 */                   iloI0lOlll1.I00i01iIIliI(-2060046324);
/* 170 */                   OIo1i1 oIo1i12 = IIIi0o0.I00000oIO;
/* 182 */                   iIIi0O0I1OoI00000oOI = IIIi0o0.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO);
/* 186 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 162 */               IIIi0O0I1Oo iIIi0O0I1Oo = iIIi0O0I1OoI00000oOI;
/* 192 */               OoII110oOII0 ooII110oOII0 = new OoII110oOII0();
/* 195 */               ooII110oOII0.I00iOIl = z;
/* 197 */               ooII110oOII0.I00iiI = z2;
/* 199 */               ooII110oOII0.I00iiO = str;
/* 201 */               VarHandle.storeStoreFence();
/* 230 */               iOiO0o0oi.I00000oIO(illOOo00lI, o1ooiI111iI000II, z4, null, iIIi0O0I1Oo, null, null, null, iiioOl1O.I00000oOI(-1332181719, ooII110oOII0, iloI0lOlll1), iloI0lOlll1, ((i2 >> 15) & 14) | 805306368, 488);
                    } else {
/* 234 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 237 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 241 */           if (oOloioIlI001IO000 != null) {
/* 245 */               OoII1OO ooII1OO = new OoII1OO();
/* 248 */               ooII1OO.I00iOIl = str;
/* 250 */               ooII1OO.I00iiI = z;
/* 252 */               ooII1OO.I00iiO = z2;
/* 254 */               ooII1OO.I00iio = z3;
/* 256 */               ooII1OO.I00ilI0I1 = o1ooiI111i;
/* 258 */               ooII1OO.I00ilO0 = illOOo00lI;
/* 260 */               VarHandle.storeStoreFence();
/* 263 */               oOloioIlI001IO000.I0000O = ooII1OO;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:108:0x0563  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0568  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x057d  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x05bb  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x05f7  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x0652  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x0685  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x068d  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x06c7  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x06d4  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x06d6  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x06e9  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x071d  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x0727  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x076a  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0778  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0783  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0785  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0799  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x07c1  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x07ef  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x081c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000Il00O(O1ol100o0O o1ol100o0O, OoIO11oiiiil ooIO11oiiiil, IloI0lOlll1 iloI0lOlll1, int i) {
                    OoIO11oiiiil ooIO11oiiiil2;
                    IloI0lOlll1 iloI0lOlll12;
                    OoIO11oiiiil ooIO11oiiiil3;
                    OI10i0Il oI10i0Il;
                    O1oIOiI11o0 o1oIOiI11o0;
                    IOO0i0o1O0l iOO0i0o1O0l;
                    OI10i0Il oI10i0Il2;
                    IOO0o0I1l iOO0o0I1l;
                    IOioOOi0I iOioOOi0I;
                    boolean z;
                    float f;
                    Context context;
                    OoII00OiO ooII00OiO;
                    boolean z2;
                    char c;
                    Object obj;
                    Iloi111 iloi111;
                    IOO0o0I1l iOO0o0I1l2;
                    boolean z3;
                    Object obj2;
                    O0o0I1i0O o0o0I1i0OI00000oIO;
                    OI10i0Il oI10i0Il3;
                    boolean zI000II;
                    Object objI00O0i0ii;
                    IOO0i0o1O0l iOO0i0o1O0l2;
                    boolean zI000II2;
                    Object obj3;
                    OI10i0Il oI10i0Il4;
                    IOO0o0I1l iOO0o0I1l3;
                    boolean z4;
                    IloI0lOlll1 iloI0lOlll13;
                    OoII00OiO ooII00OiO2;
                    OI10i0Il oI10i0Il5;
                    boolean zI000II3;
                    IOO0o0I1l iOO0o0I1l4;
                    OiI1l0 oiI1l0;
                    OI10i0Il oI10i0Il6;
                    Object obj4;
                    OI10i0Il oI10i0Il7;
                    boolean zI000II4;
                    Object obj5;
                    boolean zI000OOo1O;
                    Object obj6;
/* 3 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 8 */             iloI0lOlll14.I00i0O(1342849373);
/* 22 */            int i2 = i | (iloI0lOlll14.I000OOo1O(o1ol100o0O) ? 4 : 2) | 16;
/* 40 */            if (iloI0lOlll14.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 42 */                iloI0lOlll14.I00Ol00();
/* 47 */                if ((i & 1) == 0 || iloI0lOlll14.I001lloI()) {
/* 62 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll14);
/* 66 */                    if (oool1Ii0II00000oIO == null) {
/* 2100 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 2103 */                      return;
                            }
/* 92 */                    ooIO11oiiiil3 = (OoIO11oiiiil) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(OoIO11oiiiil.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll14), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll14);
                        } else {
/* 56 */                    iloI0lOlll14.I00OilO00Il();
/* 59 */                    ooIO11oiiiil3 = ooIO11oiiiil;
                        }
/* 95 */                iloI0lOlll14.I0010o();
/* 100 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(ooIO11oiiiil3.I0000Il00O, iloI0lOlll14);
/* 116 */               O1oIOiI11o0 o1oIOiI11o02 = ((O1oiOloOo) lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll14).getValue()).I000II;
/* 125 */               boolean z5 = o1oIOiI11o02.I00IlilI0i0i != null;
/* 133 */               Context context2 = (Context) iloI0lOlll14.I000iOII(I0lloOI0oio.I00000oOI);
/* 141 */               IOO0i0o1O0l iOO0i0o1O0l3 = (IOO0i0o1O0l) iloI0lOlll14.I000iOII(IOlO0o100i1i.I0000oI00);
/* 151 */               boolean zI000OOo1O2 = iloI0lOlll14.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll14.I000OOo1O(context2);
/* 152 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 156 */               IOO0o0I1l iOO0o0I1l5 = IOl11li.I00000oIO;
/* 159 */               if (zI000OOo1O2 || objI00O0i0ii2 == iOO0o0I1l5) {
/* 167 */                   objI00O0i0ii2 = new Ol0Oli(ooIO11oiiiil3, context2, (IOoil1iiIilo) null, 11);
/* 170 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 175 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 177 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii2, iloI0lOlll14, ooiIlOl1iI);
/* 186 */               View view = (View) iloI0lOlll14.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 188 */               boolean zI000OOo1O3 = iloI0lOlll14.I000OOo1O(view);
/* 194 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
                        Object obj7 = objI00O0i0ii3;
/* 198 */               if (zI000OOo1O3 || objI00O0i0ii3 == iOO0o0I1l5) {
/* 204 */                   II1iO0iiI iI1iO0iiI = new II1iO0iiI(1);
/* 207 */                   iI1iO0iiI.I00iiI = view;
/* 209 */                   VarHandle.storeStoreFence();
/* 212 */                   iloI0lOlll14.I00iio(iI1iO0iiI);
                            obj7 = iI1iO0iiI;
                        }
/* 217 */               iIO0iiOiOl0l.I00000oOI(ooiIlOl1iI, (Function1) obj7, iloI0lOlll14);
/* 220 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 224 */               if (objI00O0i0ii4 == iOO0o0I1l5) {
/* 226 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(null);
/* 230 */                   iloI0lOlll14.I00iio(objI00O0i0ii4);
                        }
/* 233 */               OI10i0Il oI10i0Il8 = (OI10i0Il) objI00O0i0ii4;
/* 238 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 255 */               boolean zI000OOo1O4 = iloI0lOlll14.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll14.I000OOo1O(context2) | iloI0lOlll14.I000OOo1O(o1oIOiI11o02);
/* 257 */               Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                        Object obj8 = objI00O0i0ii5;
/* 261 */               if (zI000OOo1O4 || objI00O0i0ii5 == iOO0o0I1l5) {
/* 269 */                   I0O1IO i0o1io = new I0O1IO(28);
/* 272 */                   i0o1io.I00iiI = ooIO11oiiiil3;
/* 274 */                   i0o1io.I00iiO = context2;
/* 276 */                   i0o1io.I00iio = o1oIOiI11o02;
/* 278 */                   i0o1io.I00ilI0I1 = oI10i0Il8;
/* 280 */                   VarHandle.storeStoreFence();
/* 283 */                   iloI0lOlll14.I00iio(i0o1io);
                            obj8 = i0o1io;
                        }
/* 288 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj8, iloI0lOlll14, 0);
/* 296 */               O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(Ol0iOOO0.I0000Il00O, 16.0f);
/* 309 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(12.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll14, 6);
/* 315 */               int iHashCode = Long.hashCode(iloI0lOlll14.I00OI1);
/* 319 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll14.I000lI();
/* 323 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0001Ioi1lo);
/* 329 */               IOl0oi0lOl1.I000lI.getClass();
/* 332 */               iloI0lOlll14.I00i0oil();
/* 335 */               boolean z6 = iloI0lOlll14.I00O10llo;
/* 339 */               Iloi111 iloi1112 = O0iiOioolIi.I01101IOlO;
/* 341 */               if (z6) {
/* 343 */                   iloI0lOlll14.I000l1(iloi1112);
                        } else {
/* 347 */                   iloI0lOlll14.I00io1l();
                        }
/* 350 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00io1l;
/* 352 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, iOOlo1O01OI00000oIO);
/* 355 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ilO0;
/* 357 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll14, oO0lO0l0I000lI);
/* 360 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 366 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ioIO;
/* 368 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, numValueOf);
/* 371 */               li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 374 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
/* 376 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, o1ooiI111iI0000Il00O);
/* 379 */               if (z5) {
/* 450 */                   oI10i0Il = oI10i0IlI00000oOI;
/* 452 */                   o1oIOiI11o0 = o1oIOiI11o02;
/* 454 */                   iOO0i0o1O0l = iOO0i0o1O0l3;
/* 456 */                   oI10i0Il2 = oI10i0Il8;
/* 458 */                   iOO0o0I1l = iOO0o0I1l5;
/* 460 */                   iOioOOi0I = iOioOOi0I3;
/* 461 */                   z = false;
/* 462 */                   f = 16.0f;
/* 464 */                   context = context2;
/* 468 */                   iloI0lOlll14.I00i01iIIliI(1239180783);
/* 471 */                   iloI0lOlll14.I0010I0i(false);
                        } else {
/* 384 */                   iloI0lOlll14.I00i01iIIliI(1238634935);
/* 391 */                   I0iII1i10I i0iII1i10I = new I0iII1i10I(26);
/* 394 */                   i0iII1i10I.I00iiI = o1oIOiI11o02;
/* 396 */                   VarHandle.storeStoreFence();
/* 422 */                   iOO0i0o1O0l = iOO0i0o1O0l3;
/* 428 */                   iOO0o0I1l = iOO0o0I1l5;
/* 430 */                   iOioOOi0I = iOioOOi0I3;
/* 432 */                   oI10i0Il = oI10i0IlI00000oOI;
/* 434 */                   o1oIOiI11o0 = o1oIOiI11o02;
/* 436 */                   context = context2;
/* 438 */                   oI10i0Il2 = oI10i0Il8;
/* 440 */                   f = 16.0f;
/* 442 */                   iOl111l1l.I00000oOI(null, null, null, null, null, iiioOl1O.I00000oOI(1137578016, i0iII1i10I, iloI0lOlll14), iloI0lOlll14, 196608, 31);
/* 445 */                   z = false;
/* 446 */                   iloI0lOlll14.I0010I0i(false);
                        }
/* 476 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 480 */               II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 484 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(i1IioII0000oI00, iI0O000iIl, iloI0lOlll14, 54);
/* 490 */               int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 494 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 498 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 500 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooIo101ll);
/* 504 */               iloI0lOlll14.I00i0oil();
/* 509 */               if (iloI0lOlll14.I00O10llo) {
/* 511 */                   iloI0lOlll14.I000l1(iloi1112);
                        } else {
/* 515 */                   iloI0lOlll14.I00io1l();
                        }
/* 518 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO);
/* 521 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oO0lO0l0I000lI2);
/* 524 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll14, iOioOOi0I4, iloI0lOlll14);
/* 527 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll14, o1ooiI111iI0000Il00O2);
/* 536 */               OoI1lOl ooI1lOl = ((OoIIo0oOI1) oI10i0Il.getValue()).I00000oIO;
/* 544 */               OoII00OiO ooII00OiO3 = ((OoIIo0oOI1) oI10i0Il.getValue()).I0000Il00O;
/* 546 */               OoII00OiO ooII00OiO4 = OoII00OiO.I00iOIl;
/* 548 */               if (ooII00OiO3 == ooII00OiO4) {
/* 550 */                   ooII00OiO = ooII00OiO4;
/* 551 */                   z2 = true;
                        } else {
/* 553 */                   ooII00OiO = ooII00OiO4;
/* 554 */                   z2 = z;
                        }
/* 555 */               OiI1l0 oiI1l02 = OiI1l0.I00000oIO;
/* 559 */               OoII00OiO ooII00OiO5 = ooII00OiO;
/* 563 */               O1ooiI111i o1ooiI111iI00000oOI = oiI1l02.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 575 */               boolean zI000OOo1O5 = iloI0lOlll14.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll14.I000OOo1O(context);
/* 577 */               Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
/* 583 */               IOO0o0I1l iOO0o0I1l6 = iOO0o0I1l;
                        Object obj9 = objI00O0i0ii6;
/* 585 */               if (zI000OOo1O5 || objI00O0i0ii6 == iOO0o0I1l6) {
/* 591 */                   OoII0lo0l ooII0lo0l = new OoII0lo0l(1);
/* 594 */                   ooII0lo0l.I00iiI = ooIO11oiiiil3;
/* 596 */                   ooII0lo0l.I00iiO = context;
/* 598 */                   VarHandle.storeStoreFence();
/* 601 */                   iloI0lOlll14.I00iio(ooII0lo0l);
                            obj9 = ooII0lo0l;
                        }
/* 610 */               IOioOOi0I iOioOOi0I6 = iOioOOi0I;
/* 625 */               I00000oIO("Person A", ooI1lOl, z2, o1ooiI111iI00000oOI, (Function1) obj9, iloI0lOlll1, 6);
/* 637 */               boolean zI000OOo1O6 = iloI0lOlll1.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll1.I000OOo1O(context);
/* 638 */               Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj10 = objI00O0i0ii7;
/* 642 */               if (zI000OOo1O6 || objI00O0i0ii7 == iOO0o0I1l6) {
/* 649 */                   OlolIi000l ololIi000l = new OlolIi000l(4);
/* 652 */                   ololIi000l.I00iiO = ooIO11oiiiil3;
/* 654 */                   ololIi000l.I00iiI = context;
/* 656 */                   VarHandle.storeStoreFence();
/* 659 */                   iloI0lOlll1.I00iio(ololIi000l);
                            obj10 = ololIi000l;
                        }
/* 706 */               iIo1101O.I00000oIO((IllOOo00lI) obj10, null, ((OoIIo0oOI1) oI10i0Il.getValue()).I0000Il00O == ooII00OiO5, null, null, iIIOIi0O.I00000oIO, iloI0lOlll1, 1572864, 58);
/* 715 */               OoI1lOl ooI1lOl2 = ((OoIIo0oOI1) oI10i0Il.getValue()).I00000oOI;
/* 732 */               boolean z7 = ((OoIIo0oOI1) oI10i0Il.getValue()).I0000Il00O == ooII00OiO5;
/* 735 */               O1ooiI111i o1ooiI111iI00000oOI2 = oiI1l02.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 747 */               boolean zI000OOo1O7 = iloI0lOlll1.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll1.I000OOo1O(context);
/* 748 */               Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj11 = objI00O0i0ii8;
/* 752 */               if (zI000OOo1O7 || objI00O0i0ii8 == iOO0o0I1l6) {
/* 759 */                   OoII0lo0l ooII0lo0l2 = new OoII0lo0l(2);
/* 762 */                   ooII0lo0l2.I00iiI = ooIO11oiiiil3;
/* 764 */                   ooII0lo0l2.I00iiO = context;
/* 766 */                   VarHandle.storeStoreFence();
/* 769 */                   iloI0lOlll1.I00iio(ooII0lo0l2);
                            obj11 = ooII0lo0l2;
                        }
/* 779 */               I00000oIO("Person B", ooI1lOl2, z7, o1ooiI111iI00000oOI2, (Function1) obj11, iloI0lOlll1, 6);
/* 784 */               iloI0lOlll1.I0010I0i(true);
/* 795 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(f), iI0O000iIl, iloI0lOlll1, 54);
/* 801 */               int iHashCode3 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 805 */               OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll1.I000lI();
/* 809 */               O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 813 */               iloI0lOlll1.I00i0oil();
/* 818 */               if (iloI0lOlll1.I00O10llo) {
/* 820 */                   iloI0lOlll1.I000l1(iloi1112);
                        } else {
/* 826 */                   iloI0lOlll1.I00io1l();
                        }
/* 830 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO2);
/* 835 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, oO0lO0l0I000lI3);
/* 840 */               IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 845 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O3);
/* 854 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO3 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(6.0f), iI0O000iIl, iloI0lOlll1, 54);
/* 862 */               int iHashCode4 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 866 */               OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll1.I000lI();
/* 870 */               O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 874 */               iloI0lOlll1.I00i0oil();
/* 881 */               if (iloI0lOlll1.I00O10llo) {
/* 883 */                   iloI0lOlll1.I000l1(iloi1112);
                        } else {
/* 887 */                   iloI0lOlll1.I00io1l();
                        }
/* 890 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO3);
/* 893 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, oO0lO0l0I000lI4);
/* 896 */               IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 901 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O4);
/* 910 */               boolean z8 = ((OoIIo0oOI1) oI10i0Il.getValue()).I000II;
/* 920 */               boolean zI000OOo1O8 = iloI0lOlll1.I000OOo1O(ooIO11oiiiil3) | iloI0lOlll1.I000OOo1O(context);
/* 921 */               Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
/* 925 */               if (zI000OOo1O8 || objI00O0i0ii9 == iOO0o0I1l6) {
/* 934 */                   c = 3;
/* 935 */                   OoII0lo0l ooII0lo0l3 = new OoII0lo0l(3);
/* 938 */                   ooII0lo0l3.I00iiI = ooIO11oiiiil3;
/* 940 */                   ooII0lo0l3.I00iiO = context;
/* 942 */                   VarHandle.storeStoreFence();
/* 945 */                   iloI0lOlll1.I00iio(ooII0lo0l3);
                            obj = ooII0lo0l3;
                        } else {
/* 930 */                   c = 3;
                            obj = objI00O0i0ii9;
                        }
/* 974 */               OllI1oooIo1o.I00000oIO(z8, (Function1) obj, null, false, null, iloI0lOlll1, 0, 124);
/* 978 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 1031 */              Context context3 = context;
/* 1036 */              OoIO11oiiiil ooIO11oiiiil4 = ooIO11oiiiil3;
/* 1092 */              Oo0i1oIIoOO.I00000oOI("Auto conversation", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 6, 0, 131070);
/* 1097 */              iloI0lOlll1.I0010I0i(true);
/* 1108 */              OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO4 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(6.0f), iI0O000iIl, iloI0lOlll1, 54);
/* 1114 */              int iHashCode5 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 1118 */              OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll1.I000lI();
/* 1124 */              O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 1128 */              iloI0lOlll1.I00i0oil();
/* 1133 */              if (iloI0lOlll1.I00O10llo) {
/* 1135 */                  iloi111 = iloi1112;
/* 1137 */                  iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 1143 */                  iloi111 = iloi1112;
/* 1145 */                  iloI0lOlll1.I00io1l();
                        }
/* 1149 */              li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO4);
/* 1154 */              li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, oO0lO0l0I000lI5);
/* 1159 */              IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll1, iOioOOi0I4, iloI0lOlll1);
/* 1164 */              li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll1, o1ooiI111iI0000Il00O5);
/* 1173 */              boolean z9 = ((OoIIo0oOI1) oI10i0Il.getValue()).I000O01llI0;
/* 1187 */              boolean zI000OOo1O9 = iloI0lOlll1.I000OOo1O(ooIO11oiiiil4) | iloI0lOlll1.I000OOo1O(context3);
/* 1188 */              Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
/* 1192 */              if (zI000OOo1O9) {
/* 1201 */                  iOO0o0I1l2 = iOO0o0I1l6;
                        } else {
/* 1194 */                  iOO0o0I1l2 = iOO0o0I1l6;
/* 1196 */                  if (objI00O0i0ii10 != iOO0o0I1l2) {
/* 1199 */                      z3 = false;
                                obj2 = objI00O0i0ii10;
                            }
/* 1229 */                  IOO0o0I1l iOO0o0I1l7 = iOO0o0I1l2;
/* 1247 */                  OllI1oooIo1o.I00000oIO(z9, (Function1) obj2, null, false, null, iloI0lOlll1, 0, 124);
/* 1288 */                  Iloi111 iloi1113 = iloi111;
/* 1333 */                  Oo0i1oIIoOO.I00000oOI("Speak", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 6, 0, 131070);
/* 1338 */                  iloI0lOlll1.I0010I0i(true);
/* 1341 */                  iloI0lOlll1.I0010I0i(true);
/* 1344 */                  o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll1);
/* 1360 */                  Integer numValueOf2 = Integer.valueOf(((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00.size());
/* 1376 */                  OoIIliIIII0 ooIIliIIII0 = (OoIIliIIII0) IOOi0Ool1i.I00IoIO0lI(((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00);
/* 1385 */                  String str = ooIIliIIII0 == null ? ooIIliIIII0.I0001Ioi1lo : null;
/* 1382 */                  oI10i0Il3 = oI10i0Il;
/* 1395 */                  zI000II = iloI0lOlll1.I000II(oI10i0Il3) | iloI0lOlll1.I000II(o0o0I1i0OI00000oIO);
/* 1396 */                  objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 1402 */                  if (!zI000II || objI00O0i0ii == iOO0o0I1l7) {
/* 1409 */                      objI00O0i0ii = new OOl101(o0o0I1i0OI00000oIO, oI10i0Il3, null, 1);
/* 1412 */                      iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 1417 */                  iIO0iiOiOl0l.I0000oI00(numValueOf2, str, (IlliIl1l11O) objI00O0i0ii, iloI0lOlll1);
/* 1427 */                  O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(new O0io1O(1.0f, true), 1.0f);
/* 1431 */                  I1IioI i1IioII0000oI002 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 1446 */                  iOO0i0o1O0l2 = iOO0i0o1O0l;
/* 1459 */                  zI000II2 = iloI0lOlll1.I000II(oI10i0Il3) | iloI0lOlll1.I000OOo1O(ooIO11oiiiil4) | iloI0lOlll1.I000OOo1O(iOO0i0o1O0l2) | iloI0lOlll1.I000OOo1O(context3);
/* 1460 */                  Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                            obj3 = objI00O0i0ii11;
/* 1464 */                  if (!zI000II2 || objI00O0i0ii11 == iOO0o0I1l7) {
/* 1472 */                      I0O1IO i0o1io2 = new I0O1IO(27);
/* 1475 */                      i0o1io2.I00ilI0I1 = oI10i0Il3;
/* 1477 */                      i0o1io2.I00iiI = ooIO11oiiiil4;
/* 1479 */                      i0o1io2.I00iiO = iOO0i0o1O0l2;
/* 1481 */                      i0o1io2.I00iio = context3;
/* 1483 */                      VarHandle.storeStoreFence();
/* 1486 */                      iloI0lOlll1.I00iio(i0o1io2);
                                obj3 = i0o1io2;
                            }
/* 1510 */                  l0oIiiI1O0o.I00000oIO(o1ooiI111iI0000oI00, o0o0I1i0OI00000oIO, null, i1IioII0000oI002, null, null, false, null, (Function1) obj3, iloI0lOlll1, 24576, 492);
/* 1513 */                  IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 1526 */                  if (((OoIIo0oOI1) oI10i0Il3.getValue()).I0001Ioi1lo.length() <= 0) {
/* 1531 */                      iloI0lOlll15.I00i01iIIliI(1242264229);
/* 1603 */                      oI10i0Il4 = oI10i0Il3;
/* 1605 */                      iOO0o0I1l3 = iOO0o0I1l7;
/* 1609 */                      Oo0i1oIIoOO.I00000oOI(((OoIIo0oOI1) oI10i0Il3.getValue()).I0001Ioi1lo, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oIO.I0001Ioi1lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll15.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 0, 0, 131066);
/* 1612 */                      IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 1614 */                      z4 = false;
/* 1615 */                      iloI0lOlll16.I0010I0i(false);
                                iloI0lOlll13 = iloI0lOlll16;
                            } else {
/* 1619 */                      oI10i0Il4 = oI10i0Il3;
/* 1621 */                      iOO0o0I1l3 = iOO0o0I1l7;
/* 1623 */                      z4 = false;
/* 1627 */                      iloI0lOlll15.I00i01iIIliI(1242437519);
/* 1630 */                      iloI0lOlll15.I0010I0i(false);
                                iloI0lOlll13 = iloI0lOlll15;
                            }
/* 1643 */                  OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO5 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(10.0f), iI0O000iIl, iloI0lOlll13, 54);
/* 1649 */                  int iHashCode6 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 1653 */                  OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll13.I000lI();
/* 1659 */                  O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 1663 */                  iloI0lOlll13.I00i0oil();
/* 1668 */                  if (iloI0lOlll13.I00O10llo) {
/* 1678 */                      iloI0lOlll13.I00io1l();
                            } else {
/* 1672 */                      iloI0lOlll13.I000l1(iloi1113);
                            }
/* 1682 */                  li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO5);
/* 1687 */                  li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, oO0lO0l0I000lI6);
/* 1692 */                  IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 1697 */                  li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, o1ooiI111iI0000Il00O6);
/* 1708 */                  String str2 = ((OoIIo0oOI1) oI10i0Il4.getValue()).I00000oIO.I00000oIO;
/* 1716 */                  OoII00OiO ooII00OiO6 = ((OoIIo0oOI1) oI10i0Il4.getValue()).I0000Il00O;
/* 1718 */                  ooII00OiO2 = OoII00OiO.I00iiI;
/* 1736 */                  boolean z10 = (ooII00OiO6 == ooII00OiO2 || ((OoIIo0oOI1) oI10i0Il4.getValue()).I0000O != OoIIOoO.I00iOIl) ? z4 : true;
/* 1751 */                  boolean z11 = ((OoIIo0oOI1) oI10i0Il4.getValue()).I0000Il00O == ooII00OiO5 ? true : z4;
/* 1770 */                  boolean z12 = (z5 || ((OoIIo0oOI1) oI10i0Il4.getValue()).I0000Il00O != ooII00OiO5) ? z4 : true;
/* 1772 */                  O1ooiI111i o1ooiI111iI00000oOI3 = oiI1l02.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 1776 */                  oI10i0Il5 = oI10i0Il4;
/* 1798 */                  O1oIOiI11o0 o1oIOiI11o03 = o1oIOiI11o0;
/* 1812 */                  zI000II3 = iloI0lOlll13.I000II(oI10i0Il5) | iloI0lOlll13.I000OOo1O(ooIO11oiiiil4) | iloI0lOlll13.I000OOo1O(context3) | iloI0lOlll13.I000OOo1O(o1oIOiI11o03) | iloI0lOlll13.I000OOo1O(o1OIi1I00000oIO);
/* 1816 */                  Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
/* 1820 */                  if (zI000II3) {
/* 1822 */                      iOO0o0I1l4 = iOO0o0I1l3;
/* 1824 */                      if (objI00O0i0ii12 != iOO0o0I1l4) {
/* 1827 */                          oiI1l0 = oiI1l02;
/* 1829 */                          oI10i0Il6 = oI10i0Il2;
                                    obj4 = objI00O0i0ii12;
                                }
/* 1867 */                      IOO0o0I1l iOO0o0I1l8 = iOO0o0I1l4;
/* 1869 */                      oI10i0Il7 = oI10i0Il6;
/* 1871 */                      ooIO11oiiiil2 = ooIO11oiiiil4;
/* 1876 */                      I00000oOI(str2, z10, z11, z12, o1ooiI111iI00000oOI3, (IllOOo00lI) obj4, iloI0lOlll13, 0);
/* 1887 */                      String str3 = ((OoIIo0oOI1) oI10i0Il5.getValue()).I00000oOI.I00000oIO;
/* 1913 */                      boolean z13 = ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO2 && ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000O == OoIIOoO.I00iiI;
/* 1926 */                      boolean z14 = ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO5;
/* 1946 */                      boolean z15 = !z5 && ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO5;
/* 1948 */                      O1ooiI111i o1ooiI111iI00000oOI4 = oiI1l0.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 1975 */                      zI000II4 = iloI0lOlll13.I000II(oI10i0Il5) | iloI0lOlll13.I000OOo1O(ooIO11oiiiil2) | iloI0lOlll13.I000OOo1O(context3) | iloI0lOlll13.I000OOo1O(o1oIOiI11o03) | iloI0lOlll13.I000OOo1O(o1OIi1I00000oIO);
/* 1976 */                      Object objI00O0i0ii13 = iloI0lOlll13.I00O0i0ii();
                                obj5 = objI00O0i0ii13;
/* 1982 */                      if (!zI000II4 || objI00O0i0ii13 == iOO0o0I1l8) {
/* 1989 */                          OoII0olI1 ooII0olI1 = new OoII0olI1(1);
/* 1992 */                          ooII0olI1.I00iiI = ooIO11oiiiil2;
/* 1994 */                          ooII0olI1.I00iiO = oI10i0Il5;
/* 1996 */                          ooII0olI1.I00iio = context3;
/* 1998 */                          ooII0olI1.I00ilI0I1 = o1oIOiI11o03;
/* 2000 */                          ooII0olI1.I00ilO0 = o1OIi1I00000oIO;
/* 2004 */                          ooII0olI1.I00io1l = oI10i0Il7;
/* 2006 */                          VarHandle.storeStoreFence();
/* 2009 */                          iloI0lOlll13.I00iio(ooII0olI1);
                                    obj5 = ooII0olI1;
                                }
/* 2017 */                      I00000oOI(str3, z13, z14, z15, o1ooiI111iI00000oOI4, (IllOOo00lI) obj5, iloI0lOlll13, 0);
/* 2020 */                      zI000OOo1O = iloI0lOlll13.I000OOo1O(ooIO11oiiiil2);
/* 2024 */                      Object objI00O0i0ii14 = iloI0lOlll13.I00O0i0ii();
                                obj6 = objI00O0i0ii14;
/* 2028 */                      if (!zI000OOo1O || objI00O0i0ii14 == iOO0o0I1l8) {
/* 2036 */                          OlOi0iollo olOi0iollo = new OlOi0iollo(12);
/* 2039 */                          olOi0iollo.I00iiI = ooIO11oiiiil2;
/* 2041 */                          VarHandle.storeStoreFence();
/* 2044 */                          iloI0lOlll13.I00iio(olOi0iollo);
                                    obj6 = olOi0iollo;
                                }
/* 2087 */                      iIo1101O.I00000oIO((IllOOo00lI) obj6, null, ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000oI00.isEmpty() && ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO5, null, null, iIIOIi0O.I00000oOI, iloI0lOlll13, 1572864, 58);
/* 2091 */                      iloI0lOlll13.I0010I0i(true);
/* 2094 */                      iloI0lOlll13.I0010I0i(true);
                                iloI0lOlll12 = iloI0lOlll13;
                            } else {
/* 1832 */                      iOO0o0I1l4 = iOO0o0I1l3;
                            }
/* 1836 */                  oiI1l0 = oiI1l02;
/* 1839 */                  OoII0olI1 ooII0olI12 = new OoII0olI1(0);
/* 1842 */                  ooII0olI12.I00iiI = ooIO11oiiiil4;
/* 1844 */                  ooII0olI12.I00iiO = oI10i0Il5;
/* 1846 */                  ooII0olI12.I00iio = context3;
/* 1848 */                  ooII0olI12.I00ilI0I1 = o1oIOiI11o03;
/* 1850 */                  ooII0olI12.I00ilO0 = o1OIi1I00000oIO;
/* 1852 */                  oI10i0Il6 = oI10i0Il2;
/* 1854 */                  ooII0olI12.I00io1l = oI10i0Il6;
/* 1856 */                  VarHandle.storeStoreFence();
/* 1859 */                  iloI0lOlll13.I00iio(ooII0olI12);
                            obj4 = ooII0olI12;
/* 1867 */                  IOO0o0I1l iOO0o0I1l82 = iOO0o0I1l4;
/* 1869 */                  oI10i0Il7 = oI10i0Il6;
/* 1871 */                  ooIO11oiiiil2 = ooIO11oiiiil4;
/* 1876 */                  I00000oOI(str2, z10, z11, z12, o1ooiI111iI00000oOI3, (IllOOo00lI) obj4, iloI0lOlll13, 0);
/* 1887 */                  String str32 = ((OoIIo0oOI1) oI10i0Il5.getValue()).I00000oOI.I00000oIO;
/* 1913 */                  if (((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO2) {
/* 1926 */                      if (((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO5) {
                                }
/* 1946 */                      if (z5) {
/* 1948 */                          O1ooiI111i o1ooiI111iI00000oOI42 = oiI1l0.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 1975 */                          zI000II4 = iloI0lOlll13.I000II(oI10i0Il5) | iloI0lOlll13.I000OOo1O(ooIO11oiiiil2) | iloI0lOlll13.I000OOo1O(context3) | iloI0lOlll13.I000OOo1O(o1oIOiI11o03) | iloI0lOlll13.I000OOo1O(o1OIi1I00000oIO);
/* 1976 */                          Object objI00O0i0ii132 = iloI0lOlll13.I00O0i0ii();
                                    obj5 = objI00O0i0ii132;
/* 1982 */                          if (!zI000II4) {
/* 1989 */                              OoII0olI1 ooII0olI13 = new OoII0olI1(1);
/* 1992 */                              ooII0olI13.I00iiI = ooIO11oiiiil2;
/* 1994 */                              ooII0olI13.I00iiO = oI10i0Il5;
/* 1996 */                              ooII0olI13.I00iio = context3;
/* 1998 */                              ooII0olI13.I00ilI0I1 = o1oIOiI11o03;
/* 2000 */                              ooII0olI13.I00ilO0 = o1OIi1I00000oIO;
/* 2004 */                              ooII0olI13.I00io1l = oI10i0Il7;
/* 2006 */                              VarHandle.storeStoreFence();
/* 2009 */                              iloI0lOlll13.I00iio(ooII0olI13);
                                        obj5 = ooII0olI13;
/* 2017 */                              I00000oOI(str32, z13, z14, z15, o1ooiI111iI00000oOI42, (IllOOo00lI) obj5, iloI0lOlll13, 0);
/* 2020 */                              zI000OOo1O = iloI0lOlll13.I000OOo1O(ooIO11oiiiil2);
/* 2024 */                              Object objI00O0i0ii142 = iloI0lOlll13.I00O0i0ii();
                                        obj6 = objI00O0i0ii142;
/* 2028 */                              if (!zI000OOo1O) {
/* 2036 */                                  OlOi0iollo olOi0iollo2 = new OlOi0iollo(12);
/* 2039 */                                  olOi0iollo2.I00iiI = ooIO11oiiiil2;
/* 2041 */                                  VarHandle.storeStoreFence();
/* 2044 */                                  iloI0lOlll13.I00iio(olOi0iollo2);
                                            obj6 = olOi0iollo2;
                                            if (((OoIIo0oOI1) oI10i0Il5.getValue()).I0000oI00.isEmpty()) {
/* 2087 */                                      iIo1101O.I00000oIO((IllOOo00lI) obj6, null, ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000oI00.isEmpty() && ((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO5, null, null, iIIOIi0O.I00000oOI, iloI0lOlll13, 1572864, 58);
/* 2091 */                                      iloI0lOlll13.I0010I0i(true);
/* 2094 */                                      iloI0lOlll13.I0010I0i(true);
                                                iloI0lOlll12 = iloI0lOlll13;
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 1205 */              z3 = false;
/* 1206 */              OoII0lo0l ooII0lo0l4 = new OoII0lo0l(0);
/* 1209 */              ooII0lo0l4.I00iiI = ooIO11oiiiil4;
/* 1211 */              ooII0lo0l4.I00iiO = context3;
/* 1213 */              VarHandle.storeStoreFence();
/* 1216 */              iloI0lOlll1.I00iio(ooII0lo0l4);
                        obj2 = ooII0lo0l4;
/* 1229 */              IOO0o0I1l iOO0o0I1l72 = iOO0o0I1l2;
/* 1247 */              OllI1oooIo1o.I00000oIO(z9, (Function1) obj2, null, false, null, iloI0lOlll1, 0, 124);
/* 1288 */              Iloi111 iloi11132 = iloi111;
/* 1333 */              Oo0i1oIIoOO.I00000oOI("Speak", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000l1, iloI0lOlll1, 6, 0, 131070);
/* 1338 */              iloI0lOlll1.I0010I0i(true);
/* 1341 */              iloI0lOlll1.I0010I0i(true);
/* 1344 */              o0o0I1i0OI00000oIO = O0o0i1Oo010.I00000oIO(iloI0lOlll1);
/* 1360 */              Integer numValueOf22 = Integer.valueOf(((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00.size());
/* 1376 */              OoIIliIIII0 ooIIliIIII02 = (OoIIliIIII0) IOOi0Ool1i.I00IoIO0lI(((OoIIo0oOI1) oI10i0Il.getValue()).I0000oI00);
/* 1385 */              if (ooIIliIIII02 == null) {
                        }
/* 1382 */              oI10i0Il3 = oI10i0Il;
/* 1395 */              zI000II = iloI0lOlll1.I000II(oI10i0Il3) | iloI0lOlll1.I000II(o0o0I1i0OI00000oIO);
/* 1396 */              objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 1402 */              if (!zI000II) {
/* 1409 */                  objI00O0i0ii = new OOl101(o0o0I1i0OI00000oIO, oI10i0Il3, null, 1);
/* 1412 */                  iloI0lOlll1.I00iio(objI00O0i0ii);
/* 1417 */                  iIO0iiOiOl0l.I0000oI00(numValueOf22, str, (IlliIl1l11O) objI00O0i0ii, iloI0lOlll1);
/* 1427 */                  O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(new O0io1O(1.0f, true), 1.0f);
/* 1431 */                  I1IioI i1IioII0000oI0022 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 1446 */                  iOO0i0o1O0l2 = iOO0i0o1O0l;
/* 1459 */                  zI000II2 = iloI0lOlll1.I000II(oI10i0Il3) | iloI0lOlll1.I000OOo1O(ooIO11oiiiil4) | iloI0lOlll1.I000OOo1O(iOO0i0o1O0l2) | iloI0lOlll1.I000OOo1O(context3);
/* 1460 */                  Object objI00O0i0ii112 = iloI0lOlll1.I00O0i0ii();
                            obj3 = objI00O0i0ii112;
/* 1464 */                  if (!zI000II2) {
/* 1472 */                      I0O1IO i0o1io22 = new I0O1IO(27);
/* 1475 */                      i0o1io22.I00ilI0I1 = oI10i0Il3;
/* 1477 */                      i0o1io22.I00iiI = ooIO11oiiiil4;
/* 1479 */                      i0o1io22.I00iiO = iOO0i0o1O0l2;
/* 1481 */                      i0o1io22.I00iio = context3;
/* 1483 */                      VarHandle.storeStoreFence();
/* 1486 */                      iloI0lOlll1.I00iio(i0o1io22);
                                obj3 = i0o1io22;
/* 1510 */                      l0oIiiI1O0o.I00000oIO(o1ooiI111iI0000oI002, o0o0I1i0OI00000oIO, null, i1IioII0000oI0022, null, null, false, null, (Function1) obj3, iloI0lOlll1, 24576, 492);
/* 1513 */                      IloI0lOlll1 iloI0lOlll152 = iloI0lOlll1;
/* 1526 */                      if (((OoIIo0oOI1) oI10i0Il3.getValue()).I0001Ioi1lo.length() <= 0) {
                                }
/* 1643 */                      OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO52 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(10.0f), iI0O000iIl, iloI0lOlll13, 54);
/* 1649 */                      int iHashCode62 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 1653 */                      OO0lO0l0 oO0lO0l0I000lI62 = iloI0lOlll13.I000lI();
/* 1659 */                      O1ooiI111i o1ooiI111iI0000Il00O62 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 1663 */                      iloI0lOlll13.I00i0oil();
/* 1668 */                      if (iloI0lOlll13.I00O10llo) {
                                }
/* 1682 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO52);
/* 1687 */                      li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, oO0lO0l0I000lI62);
/* 1692 */                      IIl001iO0Io.I001IIilI0O(iHashCode62, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 1697 */                      li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, o1ooiI111iI0000Il00O62);
/* 1708 */                      String str22 = ((OoIIo0oOI1) oI10i0Il4.getValue()).I00000oIO.I00000oIO;
/* 1716 */                      OoII00OiO ooII00OiO62 = ((OoIIo0oOI1) oI10i0Il4.getValue()).I0000Il00O;
/* 1718 */                      ooII00OiO2 = OoII00OiO.I00iiI;
/* 1736 */                      if (ooII00OiO62 == ooII00OiO2) {
/* 1751 */                          if (((OoIIo0oOI1) oI10i0Il4.getValue()).I0000Il00O == ooII00OiO5) {
                                    }
/* 1770 */                          if (z5) {
/* 1772 */                              O1ooiI111i o1ooiI111iI00000oOI32 = oiI1l02.I00000oOI(o1ooIo101ll, 1.0f, true);
/* 1776 */                              oI10i0Il5 = oI10i0Il4;
/* 1798 */                              O1oIOiI11o0 o1oIOiI11o032 = o1oIOiI11o0;
/* 1812 */                              zI000II3 = iloI0lOlll13.I000II(oI10i0Il5) | iloI0lOlll13.I000OOo1O(ooIO11oiiiil4) | iloI0lOlll13.I000OOo1O(context3) | iloI0lOlll13.I000OOo1O(o1oIOiI11o032) | iloI0lOlll13.I000OOo1O(o1OIi1I00000oIO);
/* 1816 */                              Object objI00O0i0ii122 = iloI0lOlll13.I00O0i0ii();
/* 1820 */                              if (zI000II3) {
                                        }
/* 1836 */                              oiI1l0 = oiI1l02;
/* 1839 */                              OoII0olI1 ooII0olI122 = new OoII0olI1(0);
/* 1842 */                              ooII0olI122.I00iiI = ooIO11oiiiil4;
/* 1844 */                              ooII0olI122.I00iiO = oI10i0Il5;
/* 1846 */                              ooII0olI122.I00iio = context3;
/* 1848 */                              ooII0olI122.I00ilI0I1 = o1oIOiI11o032;
/* 1850 */                              ooII0olI122.I00ilO0 = o1OIi1I00000oIO;
/* 1852 */                              oI10i0Il6 = oI10i0Il2;
/* 1854 */                              ooII0olI122.I00io1l = oI10i0Il6;
/* 1856 */                              VarHandle.storeStoreFence();
/* 1859 */                              iloI0lOlll13.I00iio(ooII0olI122);
                                        obj4 = ooII0olI122;
/* 1867 */                              IOO0o0I1l iOO0o0I1l822 = iOO0o0I1l4;
/* 1869 */                              oI10i0Il7 = oI10i0Il6;
/* 1871 */                              ooIO11oiiiil2 = ooIO11oiiiil4;
/* 1876 */                              I00000oOI(str22, z10, z11, z12, o1ooiI111iI00000oOI32, (IllOOo00lI) obj4, iloI0lOlll13, 0);
/* 1887 */                              String str322 = ((OoIIo0oOI1) oI10i0Il5.getValue()).I00000oOI.I00000oIO;
/* 1913 */                              if (((OoIIo0oOI1) oI10i0Il5.getValue()).I0000Il00O == ooII00OiO2) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
/* 2104 */              iloI0lOlll14.I00OilO00Il();
/* 2107 */              ooIO11oiiiil2 = ooIO11oiiiil;
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 2109 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 2113 */          if (oOloioIlI001IO000 != null) {
/* 2118 */              Oo00iIooiI oo00iIooiI = new Oo00iIooiI(3);
/* 2123 */              oo00iIooiI.I00iiI = o1ol100o0O;
/* 2125 */              oo00iIooiI.I00iiO = ooIO11oiiiil2;
/* 2127 */              VarHandle.storeStoreFence();
/* 2130 */              oOloioIlI001IO000.I0000O = oo00iIooiI;
                    }
                }

                public static final void I0000O(OoIIliIIII0 ooIIliIIII0, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    long j;
/* 5 */             iloI0lOlll1.I00i0O(1521071403);
/* 41 */            int i2 = (iloI0lOlll1.I000II(ooIIliIIII0) ? 4 : 2) | i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 47 */            int i3 = 0;
/* 58 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 68 */                boolean z = ooIIliIIII0.I00000oOI == OoIIOoO.I00iOIl;
/* 71 */                boolean z2 = ooIIliIIII0.I000II && ooIIliIIII0.I000O01llI0 == null && ooIIliIIII0.I0001Ioi1lo.length() > 0;
/* 98 */                O1ooiI111i o1ooiI111iI00000oOI = i1Ioo1o0.I00000oOI(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f), z2, null, illOOo00lI, 14);
/* 102 */               if (z) {
/* 107 */                   iloI0lOlll1.I00i01iIIliI(1460752665);
/* 120 */                   j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010I0i;
/* 122 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 129 */                   iloI0lOlll1.I00i01iIIliI(1460754653);
/* 142 */                   j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I000O01llI0;
/* 144 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 147 */               IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(j, iloI0lOlll1);
/* 153 */               OoIIO0 ooIIO0 = new OoIIO0();
/* 156 */               ooIIO0.I00iOIl = z2;
/* 158 */               ooIIO0.I00iiI = illOOo00lI2;
/* 160 */               ooIIO0.I00iiO = z;
/* 162 */               ooIIO0.I00iio = ooIIliIIII0;
/* 164 */               VarHandle.storeStoreFence();
/* 182 */               iOl111l1l.I00000oOI(o1ooiI111iI00000oOI, null, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(-521070599, ooIIO0, iloI0lOlll1), iloI0lOlll1, 196608, 26);
                    } else {
/* 186 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 189 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 193 */           if (oOloioIlI001IO000 != null) {
/* 197 */               OoIIO0O1lII ooIIO0O1lII = new OoIIO0O1lII(i3);
/* 200 */               ooIIO0O1lII.I00iiI = ooIIliIIII0;
/* 202 */               ooIIO0O1lII.I00iiO = illOOo00lI;
/* 204 */               ooIIO0O1lII.I00iio = illOOo00lI2;
/* 206 */               VarHandle.storeStoreFence();
/* 209 */               oOloioIlI001IO000.I0000O = ooIIO0O1lII;
                    }
                }
            }
