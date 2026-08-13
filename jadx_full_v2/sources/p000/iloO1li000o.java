            package p000;

            import android.content.Context;
            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iloO1li000o {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r7v12 */
                /* JADX WARN: Type inference failed for: r7v13, types: [int] */
                /* JADX WARN: Type inference failed for: r7v15 */
                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, Io1o01Ol0i01 io1o01Ol0i01, Function1 function1, Function1 function12, boolean z, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
                    OI10i0Il oI10i0Il;
                    boolean z2;
                    Object obj;
/* 13 */            IloI0lOlll1 iloI0lOlll13 = iloI0lOlll1;
/* 18 */            iloI0lOlll13.I00i0O(39827100);
/* 80 */            int i2 = i | (iloI0lOlll13.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | (iloI0lOlll13.I000OOo1O(io1o01Ol0i01) ? 32 : 16) | (iloI0lOlll13.I000OOo1O(function1) ? 256 : Barcode.FORMAT_ITF) | (iloI0lOlll13.I000OOo1O(function12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll13.I000O01llI0(z) ? 16384 : 8192);
/* 99 */            if (iloI0lOlll13.I00OIl(i2 & 1, (74899 & i2) != 74898)) {
/* 103 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(io1o01Ol0i01.I0000Il00O, iloI0lOlll13);
/* 107 */               Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 111 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 113 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 117 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 121 */                   iloI0lOlll13.I00iio(objI00O0i0ii);
                        }
/* 124 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii;
/* 132 */               Context context = (Context) iloI0lOlll13.I000iOII(I0lloOI0oio.I00000oOI);
/* 137 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 140 */               Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 144 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 150 */                   IlI0iIl011 ilI0iIl011 = new IlI0iIl011(27);
/* 153 */                   ilI0iIl011.I00iiI = oI10i0Il2;
/* 155 */                   VarHandle.storeStoreFence();
/* 158 */                   iloI0lOlll13.I00iio(ilI0iIl011);
                            obj2 = ilI0iIl011;
                        }
/* 165 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj2, iloI0lOlll13, 48);
/* 177 */               boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(context) | iloI0lOlll13.I000OOo1O(o1OIi1I00000oIO);
/* 178 */               Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 182 */               if (zI000OOo1O || objI00O0i0ii3 == iOO0o0I1l) {
/* 200 */                   oI10i0Il = oI10i0Il2;
/* 202 */                   objI00O0i0ii3 = new Io1lioIl(context, o1OIi1I00000oIO, oI10i0Il, null, 0);
/* 207 */                   iloI0lOlll13.I00iio(objI00O0i0ii3);
                        } else {
/* 187 */                   oI10i0Il = oI10i0Il2;
                        }
/* 212 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 214 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll13, ooiIlOl1iI);
/* 227 */               if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 232 */                   iloI0lOlll13.I00i01iIIliI(1079248491);
/* 235 */                   O1ooiI111i o1ooiI111iI00000oIO = O1ooIo101ll.I00000oIO;
/* 237 */                   if (z) {
/* 242 */                       iloI0lOlll13.I00i01iIIliI(1079318210);
/* 266 */                       boolean zI000OOo1O2 = ((i2 & 896) == 256) | iloI0lOlll13.I000OOo1O(io1o01Ol0i01) | ((i2 & 7168) == 2048);
/* 267 */                       Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                Object obj3 = objI00O0i0ii4;
/* 271 */                       if (zI000OOo1O2 || objI00O0i0ii4 == iOO0o0I1l) {
/* 278 */                           II1ilOl1I iI1ilOl1I = new II1ilOl1I(1);
/* 281 */                           iI1ilOl1I.I00000oOI = io1o01Ol0i01;
/* 283 */                           iI1ilOl1I.I0000Il00O = function1;
/* 285 */                           iI1ilOl1I.I0000O = function12;
/* 287 */                           VarHandle.storeStoreFence();
/* 290 */                           iloI0lOlll13.I00iio(iI1ilOl1I);
                                    obj3 = iI1ilOl1I;
                                }
/* 295 */                       o1ooiI111iI00000oIO = Oll10I.I00000oIO(o1ooiI111iI00000oIO, ooiIlOl1iI, (PointerInputEventHandler) obj3);
/* 300 */                       iloI0lOlll13.I0010I0i(false);
                            } else {
/* 308 */                       iloI0lOlll13.I00i01iIIliI(1080067232);
/* 311 */                       iloI0lOlll13.I0010I0i(false);
                            }
/* 320 */                   O1ooiI111i o1ooiI111iI00000oIO2 = ii0OOOOo0i.I00000oIO(o1ooiI111i.I0000O(o1ooiI111iI00000oIO), OiI11O1i1.I00000oIO);
/* 334 */                   boolean z3 = (i2 & 57344) == 16384;
/* 335 */                   Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 339 */                   if (z3 || objI00O0i0ii5 == iOO0o0I1l) {
/* 348 */                       z2 = 1;
/* 349 */                       II1ilOO1OIi iI1ilOO1OIi = new II1ilOO1OIi(1);
/* 352 */                       iI1ilOO1OIi.I00iiI = z;
/* 354 */                       VarHandle.storeStoreFence();
/* 357 */                       iloI0lOlll13.I00iio(iI1ilOO1OIi);
                                obj = iI1ilOO1OIi;
                            } else {
/* 344 */                       z2 = 1;
                                obj = objI00O0i0ii5;
                            }
/* 386 */                   O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(i0I1I0.I00000oOI(iIlll1lo.I00000oIO(o1ooiI111iI00000oIO2, (Function1) obj), ((IOOiio0i) iiOl0IlIlll.I00000oIO(oloIl1l1oOii, iloI0lOlll13).get(z2)).I00000oIO, iO0ioilo.I00000oIO), 48.0f);
/* 393 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 399 */                   int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 403 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 407 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000II);
/* 413 */                   IOl0oi0lOl1.I000lI.getClass();
/* 416 */                   iloI0lOlll13.I00i0oil();
/* 421 */                   if (iloI0lOlll13.I00O10llo) {
/* 425 */                       iloI0lOlll13.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 429 */                       iloI0lOlll13.I00io1l();
                            }
/* 434 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 439 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 448 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 451 */                   li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 456 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 545 */                   Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(((Io1loIilO10I) oI10i0IlI00000oOI.getValue()).I00000oIO ? R.string.listening : R.string.hold_down_to_talk, iloI0lOlll13), null, IOOiio0i.I0001Ioi1lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll1, 384, 0, 262138);
/* 548 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 550 */                   iloI0lOlll14.I0010I0i(z2);
/* 553 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 561 */                   iloI0lOlll13.I00i01iIIliI(1080504518);
/* 564 */                   iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll13;
                        }
                    } else {
/* 568 */               iloI0lOlll13.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll13;
                    }
/* 571 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 575 */           if (oOloioIlI001IO000 != null) {
/* 580 */               IO0i1IlOoI iO0i1IlOoI = new IO0i1IlOoI(2);
/* 583 */               iO0i1IlOoI.I00iiI = oloIl1l1oOii;
/* 585 */               iO0i1IlOoI.I00ilI0I1 = io1o01Ol0i01;
/* 587 */               iO0i1IlOoI.I00ilO0 = function1;
/* 589 */               iO0i1IlOoI.I00io1l = function12;
/* 593 */               iO0i1IlOoI.I00iio = z;
/* 597 */               iO0i1IlOoI.I00iiO = o1ooiI111i;
/* 599 */               VarHandle.storeStoreFence();
/* 602 */               oOloioIlI001IO000.I0000O = iO0i1IlOoI;
                    }
                }
            }
