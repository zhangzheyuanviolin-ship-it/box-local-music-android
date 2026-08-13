            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.view.Choreographer;
            import android.view.Display;
            import android.view.View;
            import com.box.gallery.R;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.PriorityQueue;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 15 */    public final class IO1oIiIi1O01 implements Function3 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IO1oIiIi1O01(O11iO00I1o o11iO00I1o, Function3 function3, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 10;
/* 8 */             this.I00iiO = o11iO00I1o;
/* 10 */            this.I00iio = function3;
/* 12 */            this.I00iiI = oI10i0Il;
/* 14 */            this.I00ilI0I1 = oI10i0Il2;
                }

                private final Object I00000oIO(Object obj, Object obj2, Object obj3) {
/* 3 */             IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiO;
/* 7 */             IOoiI000 iOoiI000 = (IOoiI000) this.I00iio;
/* 12 */            Function3 function3 = (Function3) this.I00iiI;
/* 17 */            IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 20 */            IOoi1llO0Oo iOoi1llO0Oo = (IOoi1llO0Oo) obj;
/* 23 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 27 */            int iIntValue = ((Integer) obj3).intValue();
/* 33 */            if ((iIntValue & 6) == 0) {
/* 44 */                iIntValue |= iloI0lOlll1.I000II(iOoi1llO0Oo) ? 4 : 2;
                    }
/* 61 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 72 */                String str = (String) illiIl1l11O.invoke(iloI0lOlll1, 0);
/* 78 */                if (OlOoOIi0o.I001l0I00(str)) {
/* 82 */                    Ioll0IliO1l.I0000Il00O("Label must not be blank");
                        }
/* 85 */                iOoiI000.getClass();
/* 100 */               i1OliOi0o00o.I00000oIO.I00100o1O0lo(str, Boolean.TRUE, iOoi1llO0Oo, function3, illOOo00lI, iloI0lOlll1, Integer.valueOf((iIntValue << 9) & 7168));
                    } else {
/* 104 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 107 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I0000O(Object obj, Object obj2, Object obj3) {
/* 6 */             OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I00iiO;
/* 10 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 14 */            Integer num = (Integer) this.I00iio;
/* 18 */            Integer num2 = (Integer) this.I00ilI0I1;
/* 22 */            IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj;
/* 26 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 32 */            int iIntValue = ((Integer) obj3).intValue();
/* 38 */            if ((iIntValue & 6) == 0) {
/* 49 */                iIntValue |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 4 : 2;
                    }
/* 54 */            int i = 0;
/* 55 */            int i2 = 1;
/* 67 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 69 */                iolOOiI iolooii = iolOOiI.I00ilI0I1;
/* 79 */                String str = ((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI;
/* 81 */                OoOil11Ol1o ooOil11Ol1o = lolIo0.I00l0I0l0lO1;
/* 85 */                Ii0iI01 ii0iI01 = new Ii0iI01(i);
/* 88 */                ii0iI01.I00iiI = num;
/* 90 */                VarHandle.storeStoreFence();
/* 96 */                IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(606261490, ii0iI01, iloI0lOlll1);
/* 102 */               Ii0iI01 ii0iI012 = new Ii0iI01(i2);
/* 105 */               ii0iI012.I00iiI = num2;
/* 107 */               VarHandle.storeStoreFence();
/* 113 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-656679035, ii0iI012, iloI0lOlll1);
/* 121 */               I00oooO i00oooO = new I00oooO(15);
/* 124 */               i00oooO.I00iiI = oI0lOIiOIOOo;
/* 126 */               VarHandle.storeStoreFence();
/* 165 */               iolooii.I000OiO(str, illiIl1l11O, true, false, ooOil11Ol1o, oI0lOIiOIOOo, false, iOii1lI00000oOI, null, null, null, iOii1lI00000oOI2, null, null, iiioOl1O.I00000oOI(-1820282424, i00oooO, iloI0lOlll1), iloI0lOlll1, ((iIntValue << 3) & 112) | 12807552, 14158848, 57152);
                    } else {
/* 171 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 174 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v10, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v18 */
                /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v13, types: [IOlio1o, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v14 */
                private final Object I0000oI00(Object obj, Object obj2, Object obj3) {
                    OO0l00Ii10 oO0l00Ii10;
                    ArrayList<String> arrayList;
                    IlliIl1l11O illiIl1l11O;
                    String str;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    Iloi111 iloi111;
                    float f;
                    IOioOOi0I iOioOOi0I4;
                    OI10i0Il oI10i0Il;
                    int i;
                    IloI0lOlll1 iloI0lOlll1;
                    Iloi111 iloi1112;
                    OI10i0Il oI10i0Il2;
                    Object obj4;
                    OI10i0Il oI10i0Il3;
                    Object obj5;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll12;
                    OI10i0Il oI10i0Il4;
/* 5 */             OO0l00Ii10 oO0l00Ii102 = (OO0l00Ii10) this.I00iiO;
/* 9 */             ArrayList arrayList2 = (ArrayList) this.I00iio;
/* 13 */            IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00ilI0I1;
/* 17 */            OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 25 */            IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll13.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 53 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 57 */                O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 12.0f);
/* 65 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll13, 0);
/* 71 */                int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 75 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 79 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0001Ioi1lo);
/* 85 */                IOl0oi0lOl1.I000lI.getClass();
/* 88 */                iloI0lOlll13.I00i0oil();
/* 91 */                boolean z2 = iloI0lOlll13.I00O10llo;
/* 93 */                Iloi111 iloi1113 = O0iiOioolIi.I01101IOlO;
/* 95 */                if (z2) {
/* 97 */                    iloI0lOlll13.I000l1(iloi1113);
                        } else {
/* 101 */                   iloI0lOlll13.I00io1l();
                        }
/* 104 */               IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 106 */               li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 109 */               IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilO0;
/* 111 */               li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, oO0lO0l0I000lI);
/* 114 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 118 */               IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ioIO;
/* 120 */               li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll13, numValueOf);
/* 123 */               li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 126 */               IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ilI0I1;
/* 128 */               li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 131 */               String str2 = oO0l00Ii102.I0000Il00O;
/* 133 */               float f2 = oO0l00Ii102.I0000O;
/* 139 */               if (str2 != null) {
/* 144 */                   iloI0lOlll13.I00i01iIIliI(-1787074313);
/* 177 */                   OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 257 */                   iOioOOi0I2 = iOioOOi0I7;
/* 261 */                   iOioOOi0I = iOioOOi0I8;
/* 265 */                   arrayList = arrayList2;
/* 267 */                   iOioOOi0I3 = iOioOOi0I5;
/* 269 */                   iloi111 = iloi1113;
/* 271 */                   str = str2;
/* 273 */                   oO0l00Ii10 = oO0l00Ii102;
/* 275 */                   illiIl1l11O = illiIl1l11O2;
/* 277 */                   f = 6.0f;
/* 279 */                   iOioOOi0I4 = iOioOOi0I6;
/* 281 */                   oI10i0Il = oI10i0Il5;
/* 283 */                   i = 0;
/* 284 */                   Oo0i1oIIoOO.I00000oOI("Looks like " + str2 + " · " + ((int) (f2 * 100.0f)) + "% match", null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I, iloI0lOlll13, 0, 0, 131066);
/* 287 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 293 */                   lOO1OIO00.I00000oIO(iloI0lOlll14, Ol0iOOO0.I000lI(o1ooIo101ll, 6.0f));
/* 296 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll1 = iloI0lOlll14;
                        } else {
/* 301 */                   oO0l00Ii10 = oO0l00Ii102;
/* 303 */                   arrayList = arrayList2;
/* 305 */                   illiIl1l11O = illiIl1l11O2;
/* 307 */                   str = str2;
/* 309 */                   iOioOOi0I = iOioOOi0I8;
/* 311 */                   iOioOOi0I2 = iOioOOi0I7;
/* 313 */                   iOioOOi0I3 = iOioOOi0I5;
/* 314 */                   iloi111 = iloi1113;
/* 316 */                   f = 6.0f;
/* 318 */                   iOioOOi0I4 = iOioOOi0I6;
/* 320 */                   oI10i0Il = oI10i0Il5;
/* 322 */                   i = 0;
/* 326 */                   if (f2 > 0.0f) {
/* 331 */                       iloI0lOlll13.I00i01iIIliI(-1786708513);
/* 341 */                       String strI00100l0 = IIlIOloOOO.I00100l0("New face · closest existing ", (int) (f2 * 100.0f), "%");
/* 345 */                       OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 402 */                       Oo0i1oIIoOO.I00000oOI(strI00100l0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oOI.I000oI1ioi, iloI0lOlll13, 0, 0, 131066);
/* 405 */                       IloI0lOlll1 iloI0lOlll15 = iloI0lOlll13;
/* 411 */                       lOO1OIO00.I00000oIO(iloI0lOlll15, Ol0iOOO0.I000lI(o1ooIo101ll, 6.0f));
/* 414 */                       iloI0lOlll15.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll15;
                            } else {
/* 421 */                       iloI0lOlll13.I00i01iIIliI(-1786395227);
/* 424 */                       iloI0lOlll13.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll13;
                            }
                        }
/* 433 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 48);
/* 439 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 443 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 447 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 451 */               iloI0lOlll1.I00i0oil();
/* 456 */               if (iloI0lOlll1.I00O10llo) {
/* 458 */                   iloi1112 = iloi111;
/* 460 */                   iloI0lOlll1.I000l1(iloi1112);
                        } else {
/* 464 */                   iloi1112 = iloi111;
/* 466 */                   iloI0lOlll1.I00io1l();
                        }
/* 469 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 472 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, oO0lO0l0I000lI2);
/* 475 */               IOioOOi0I iOioOOi0I9 = iOioOOi0I2;
/* 477 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I9, iloI0lOlll1);
/* 480 */               IOioOOi0I iOioOOi0I10 = iOioOOi0I;
/* 482 */               li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 514 */               ioO0II.I00000oOI(new I0oO00o(oO0l00Ii10.I00000oIO), null, ii0OOOOo0i.I00000oIO(Ol0iOOO0.I000lI(o1ooIo101ll, 64.0f), OiI11O1i1.I00000oIO), IOoOIiOl1llI.I00000oIO, iloI0lOlll1, 24624, 232);
/* 523 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I000lI(o1ooIo101ll, 12.0f));
/* 530 */               String str3 = (String) oI10i0Il.getValue();
/* 537 */               O0io1O o0io1O = new O0io1O(1.0f, true);
/* 540 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 544 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 546 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 550 */                   IlI0iIl011 ilI0iIl011 = new IlI0iIl011(i);
/* 553 */                   oI10i0Il2 = oI10i0Il;
/* 555 */                   ilI0iIl011.I00iiI = oI10i0Il2;
/* 557 */                   VarHandle.storeStoreFence();
/* 560 */                   iloI0lOlll1.I00iio(ilI0iIl011);
                            obj4 = ilI0iIl011;
                        } else {
/* 564 */                   oI10i0Il2 = oI10i0Il;
                            obj4 = objI00O0i0ii;
                        }
/* 575 */               OI10i0Il oI10i0Il6 = oI10i0Il2;
/* 584 */               Iloi111 iloi1114 = iloi1112;
/* 590 */               IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 639 */               float f3 = f;
/* 643 */               OO0l00Ii10 oO0l00Ii103 = oO0l00Ii10;
/* 651 */               IOioOOi0I iOioOOi0I11 = iOioOOi0I4;
/* 655 */               l1liIOil0i1o.I00000oOI(str3, (Function1) obj4, o0io1O, false, false, null, i1OolO1i0OOI.I0000oI00, null, null, null, null, false, null, null, null, true, 0, 0, null, null, iloI0lOlll16, 1572912, 12582912, 8257464);
/* 658 */               IloI0lOlll1 iloI0lOlll17 = iloI0lOlll16;
/* 666 */               lOO1OIO00.I00000oIO(iloI0lOlll17, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 669 */               String str4 = str;
/* 689 */               boolean z3 = str4 != null && O0000Ioio00.I0000O((String) oI10i0Il6.getValue(), str4);
/* 686 */               IlliIl1l11O illiIl1l11O3 = illiIl1l11O;
/* 699 */               boolean zI000II = iloI0lOlll17.I000II(illiIl1l11O3) | iloI0lOlll17.I000OOo1O(oO0l00Ii103);
/* 700 */               Object objI00O0i0ii2 = iloI0lOlll17.I00O0i0ii();
/* 704 */               if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 715 */                   IlI0ilO00l ilI0ilO00l = new IlI0ilO00l(0);
/* 718 */                   ilI0ilO00l.I00iiI = illiIl1l11O3;
/* 720 */                   ilI0ilO00l.I00iiO = oO0l00Ii103;
/* 722 */                   oI10i0Il3 = oI10i0Il6;
/* 724 */                   ilI0ilO00l.I00iio = oI10i0Il3;
/* 726 */                   VarHandle.storeStoreFence();
/* 729 */                   iloI0lOlll17.I00iio(ilI0ilO00l);
                            obj5 = ilI0ilO00l;
                        } else {
/* 709 */                   oI10i0Il3 = oI10i0Il6;
                            obj5 = objI00O0i0ii2;
                        }
                        boolean z4 = !OlOoOIi0o.I001l0I00((String) oI10i0Il3.getValue());
/* 749 */               I1IO0lO1iI i1IO0lO1iI = new I1IO0lO1iI(2);
/* 752 */               i1IO0lO1iI.I00iiI = z3;
/* 754 */               VarHandle.storeStoreFence();
/* 782 */               OI10i0Il oI10i0Il7 = oI10i0Il3;
/* 786 */               iOiO0o0oi.I00000oIO((IllOOo00lI) obj5, null, z4, null, null, null, null, null, iiioOl1O.I00000oOI(-405109399, i1IO0lO1iI, iloI0lOlll17), iloI0lOlll17, 805306368, 506);
/* 790 */               iloI0lOlll17.I0010I0i(true);
/* 797 */               if (arrayList.isEmpty()) {
/* 1054 */                  z = true;
/* 1058 */                  iloI0lOlll17.I00i01iIIliI(-1784709819);
/* 1061 */                  iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll17;
                        } else {
/* 802 */                   iloI0lOlll17.I00i01iIIliI(-1785347923);
/* 809 */                   lOO1OIO00.I00000oIO(iloI0lOlll17, Ol0iOOO0.I000lI(o1ooIo101ll, 8.0f));
/* 812 */                   OlO1iIi1ol0 olO1iIi1ol03 = O1OoilIO.I00000oOI;
/* 870 */                   Oo0i1oIIoOO.I00000oOI("Add to existing:", null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol03)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll17.I000iOII(olO1iIi1ol03)).I00000oOI.I000oI1ioi, iloI0lOlll17, 6, 0, 131066);
/* 873 */                   IloI0lOlll1 iloI0lOlll18 = iloI0lOlll17;
/* 880 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iO0l10O.I0000Il00O(o1ooIo101ll, iO0l10O.I00000oOI(iloI0lOlll18), false);
/* 890 */                   int i2 = 6;
/* 891 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(f3), i1O01oOIoI0I.I00ll1, iloI0lOlll18, 6);
/* 897 */                   int iHashCode3 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 901 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll18.I000lI();
/* 905 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o1ooiI111iI0000Il00O3);
/* 909 */                   iloI0lOlll18.I00i0oil();
/* 914 */                   if (iloI0lOlll18.I00O10llo) {
/* 916 */                       iloI0lOlll18.I000l1(iloi1114);
                            } else {
/* 920 */                       iloI0lOlll18.I00io1l();
                            }
/* 923 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll18, oiI1iiIl1Oi0I00000oIO2);
/* 928 */                   li01Ooiio01.I0000Il00O(iOioOOi0I11, iloI0lOlll18, oO0lO0l0I000lI3);
/* 933 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll18, iOioOOi0I9, iloI0lOlll18);
/* 938 */                   li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll18, o1ooiI111iI0000Il00O4);
/* 944 */                   iloI0lOlll18.I00i01iIIliI(2080849812);
                            ?? r14 = iloI0lOlll18;
/* 955 */                   for (String str5 : arrayList) {
/* 963 */                       boolean zI000II2 = r14.I000II(str5);
/* 967 */                       ?? I00O0i0ii = r14.I00O0i0ii();
/* 971 */                       if (zI000II2 || I00O0i0ii == iOO0o0I1l) {
/* 983 */                           I00O0i0ii = new IOlio1o(2);
/* 986 */                           I00O0i0ii.I00iiI = str5;
/* 988 */                           oI10i0Il4 = oI10i0Il7;
/* 990 */                           I00O0i0ii.I00iiO = oI10i0Il4;
/* 992 */                           VarHandle.storeStoreFence();
/* 995 */                           r14.I00iio(I00O0i0ii);
                                } else {
/* 977 */                           oI10i0Il4 = oI10i0Il7;
                                }
/* 1002 */                      I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(i2);
/* 1005 */                      i0Iooi0i1l0l.I00iiI = str5;
/* 1007 */                      VarHandle.storeStoreFence();
/* 1028 */                      IloI0lOlll1 iloI0lOlll19 = r14;
/* 1039 */                      IOIIio0.I000II((IllOOo00lI) I00O0i0ii, iiioOl1O.I00000oOI(1917944053, i0Iooi0i1l0l, r14), null, false, null, null, null, null, null, null, iloI0lOlll19, 48, 4092);
/* 1042 */                      i2 = i2;
/* 1043 */                      r14 = iloI0lOlll19;
/* 1044 */                      oI10i0Il7 = oI10i0Il4;
                            }
/* 1048 */                  z = true;
/* 1049 */                  Oi010OO0.I001l0I00(r14, false, true, false);
                            iloI0lOlll12 = r14;
                        }
/* 1064 */              iloI0lOlll12.I0010I0i(z);
                    } else {
/* 1068 */              iloI0lOlll13.I00OilO00Il();
                    }
/* 1071 */          return OoiIlOl1iI.I00000oIO;
                }

                private final Object I0001Ioi1lo(Object obj, Object obj2, Object obj3) {
/* 5 */             Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 9 */             IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iio;
/* 13 */            IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 17 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 53 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 57 */                O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 16.0f);
/* 65 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 71 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 75 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 79 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo);
/* 85 */                IOl0oi0lOl1.I000lI.getClass();
/* 88 */                iloI0lOlll1.I00i0oil();
/* 91 */                boolean z = iloI0lOlll1.I00O10llo;
/* 93 */                Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 95 */                if (z) {
/* 97 */                    iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 101 */                   iloI0lOlll1.I00io1l();
                        }
/* 104 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 106 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 109 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 111 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 114 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 118 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 120 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 123 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 126 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 128 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 133 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 141 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00ll1, iloI0lOlll1, 0);
/* 147 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 151 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 155 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 159 */               iloI0lOlll1.I00i0oil();
/* 164 */               if (iloI0lOlll1.I00O10llo) {
/* 166 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 170 */                   iloI0lOlll1.I00io1l();
                        }
/* 173 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 176 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 179 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 182 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 188 */               String strI00000oOI = lOOoli.I00000oOI(R.string.drawer_settings_label, iloI0lOlll1);
/* 195 */               String strI00000oOI2 = lOOoli.I00000oOI(R.string.drawer_settings_description, iloI0lOlll1);
/* 207 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000II(iiloOlIoIool);
/* 208 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 212 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj4 = objI00O0i0ii;
/* 214 */               if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 222 */                   I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(21);
/* 225 */                   i0iI0O1IoIoI.I00iiI = ii0110;
/* 227 */                   i0iI0O1IoIoI.I00iiO = oI10i0Il;
/* 229 */                   i0iI0O1IoIoI.I00iio = iiloOlIoIool;
/* 231 */                   VarHandle.storeStoreFence();
/* 234 */                   iloI0lOlll1.I00iio(i0iI0O1IoIoI);
                            obj4 = i0iI0O1IoIoI;
                        }
/* 238 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj4;
/* 249 */               if (1.0f <= 0.0d) {
/* 252 */                   IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                        }
/* 274 */               iO10iI0oOi1.I00000oIO(strI00000oOI, strI00000oOI2, illOOo00lI2, new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), iloI0lOlll1, 0);
/* 283 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 16.0f));
/* 289 */               String strI00000oOI3 = lOOoli.I00000oOI(R.string.drawer_models_label, iloI0lOlll1);
/* 296 */               String strI00000oOI4 = lOOoli.I00000oOI(R.string.drawer_models_description, iloI0lOlll1);
/* 313 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000II(iiloOlIoIool) | iloI0lOlll1.I000II(illOOo00lI);
/* 314 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii2;
/* 318 */               if (zI000OOo1O2 || objI00O0i0ii2 == iOO0o0I1l) {
/* 326 */                   I0iI0O1IoIoI i0iI0O1IoIoI2 = new I0iI0O1IoIoI(22);
/* 329 */                   i0iI0O1IoIoI2.I00iiI = ii0110;
/* 331 */                   i0iI0O1IoIoI2.I00iiO = iiloOlIoIool;
/* 333 */                   i0iI0O1IoIoI2.I00iio = illOOo00lI;
/* 335 */                   VarHandle.storeStoreFence();
/* 338 */                   iloI0lOlll1.I00iio(i0iI0O1IoIoI2);
                            obj5 = i0iI0O1IoIoI2;
                        }
/* 342 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj5;
/* 349 */               if (1.0f <= 0.0d) {
/* 352 */                   IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                        }
/* 370 */               iO10iI0oOi1.I00000oIO(strI00000oOI3, strI00000oOI4, illOOo00lI3, new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), iloI0lOlll1, 0);
/* 373 */               iloI0lOlll1.I0010I0i(true);
/* 376 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 380 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 383 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000II(Object obj, Object obj2, Object obj3) {
                    int i;
/* 5 */             O11iO00I1o o11iO00I1o = (O11iO00I1o) this.I00iiO;
/* 9 */             Function3 function3 = (Function3) this.I00iio;
/* 13 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 17 */            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 21 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 35 */            int iIntValue = ((Integer) obj3).intValue() & 14;
/* 37 */            O11Oio.I0001Ioi1lo(o1oIOiI11o0, o11iO00I1o, iloI0lOlll1, iIntValue);
/* 51 */            if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 56 */                iloI0lOlll1.I00i01iIIliI(502140451);
/* 59 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii;
/* 65 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 71 */                    IloIlOOIi iloIlOOIi = new IloIlOOIi(12);
/* 74 */                    iloIlOOIi.I00iiI = oI10i0Il2;
/* 76 */                    VarHandle.storeStoreFence();
/* 79 */                    iloI0lOlll1.I00iio(iloIlOOIi);
                            obj4 = iloIlOOIi;
                        }
/* 110 */               i = iIntValue;
/* 112 */               iIoOlloI.I00000oIO((IlliIl1l11O) obj4, Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f), 300.0f), Barcode.FORMAT_UPC_A, 0, false, IIo0l1.I0000Il00O, null, null, iloI0lOlll1, 438, 216);
/* 115 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 119 */               i = iIntValue;
/* 123 */               iloI0lOlll1.I00i01iIIliI(502442205);
/* 126 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 133 */           function3.invoke(o1oIOiI11o0, iloI0lOlll1, Integer.valueOf(i));
/* 136 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000O01llI0(Object obj, Object obj2, Object obj3) {
/* 3 */             OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiO;
/* 7 */             O11l1I o11l1I = (O11l1I) this.I00iio;
/* 11 */            OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiI;
/* 15 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 17 */            String str = (String) obj;
/* 21 */            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
/* 30 */            if (oOo0l0ii10l.I00iOIl) {
/* 32 */                o11l1I.I0001Ioi1lo(false);
/* 35 */                oOo0l0ii10l.I00iOIl = false;
                    }
/* 62 */            oOo0ooi.I00iOIl = OlOolloIIOl0.I000iOII(oOo0ooi.I00iOIl + str, "\\n", "\n");
/* 80 */            o11l1I.I000II(o1oIOiI11o0, ((O11l0oi0) o11l1I.I0000Il00O.I00iOIl.getValue()).I0000O, (String) oOo0ooi.I00iOIl);
/* 83 */            if (zBooleanValue) {
/* 85 */                o11l1I.I0000oI00(false);
                    }
/* 88 */            return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000OOo1O(Object obj, Object obj2, Object obj3) {
/* 5 */             List list = (List) this.I00iiO;
/* 9 */             Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 13 */            Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00iiI;
/* 17 */            IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 53 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 57 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 65 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 71 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 75 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 79 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI00);
/* 85 */                IOl0oi0lOl1.I000lI.getClass();
/* 88 */                iloI0lOlll1.I00i0oil();
/* 91 */                boolean z = iloI0lOlll1.I00O10llo;
/* 93 */                Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 95 */                if (z) {
/* 97 */                    iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 101 */                   iloI0lOlll1.I00io1l();
                        }
/* 104 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 106 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 109 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 111 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 114 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 118 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 120 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 123 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 126 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 128 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 153 */               O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
/* 163 */               OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 173 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 177 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 181 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 185 */               iloI0lOlll1.I00i0oil();
/* 190 */               if (iloI0lOlll1.I00O10llo) {
/* 192 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 196 */                   iloI0lOlll1.I00io1l();
                        }
/* 199 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 202 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 205 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 208 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 284 */               Oo0i1oIIoOO.I00000oOI(lOOoli.I00000oOI(R.string.logs_viewer_title, iloI0lOlll1), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000II, iloI0lOlll1, 0, 0, 131070);
/* 304 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000II(ol010000lo00) | iloI0lOlll1.I000II(illOOo00lI);
/* 305 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 309 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj4 = objI00O0i0ii;
/* 311 */               if (zI000OOo1O || objI00O0i0ii == iOO0o0I1l) {
/* 318 */                   I0O1111oo i0O1111oo = new I0O1111oo(3);
/* 321 */                   i0O1111oo.I00iio = ii0110;
/* 323 */                   i0O1111oo.I00iiI = ol010000lo00;
/* 325 */                   i0O1111oo.I00iiO = illOOo00lI;
/* 327 */                   VarHandle.storeStoreFence();
/* 330 */                   iloI0lOlll1.I00iio(i0O1111oo);
                            obj4 = i0O1111oo;
                        }
/* 347 */               iIo1101O.I00000oIO((IllOOo00lI) obj4, null, false, null, null, i1iI1IiII.I00000oIO, iloI0lOlll1, 1572864, 62);
/* 350 */               iloI0lOlll1.I0010I0i(true);
/* 353 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 357 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 361 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO("");
/* 365 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 368 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 374 */               String str = (String) oI10i0Il.getValue();
/* 414 */               O1ooiI111i o1ooiI111iI00000oIO = iilOllOlO1.I00000oIO(iO01II.I000OiO(iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), new IOioO0I01(29));
/* 420 */               OiI111I oiI111I = OiI11O1i1.I00000oIO;
/* 422 */               long j = IOOiio0i.I000lI;
/* 453 */               OloooOlO10oI oloooOlO10oII000OiO = iOloo0O0O.I000OiO(0L, 0L, 0L, j, j, j, iloI0lOlll1, 2147469311);
/* 459 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii3;
/* 463 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 467 */                   IlI0iIl011 ilI0iIl011 = new IlI0iIl011(29);
/* 470 */                   ilI0iIl011.I00iiI = oI10i0Il;
/* 472 */                   VarHandle.storeStoreFence();
/* 475 */                   iloI0lOlll1.I00iio(ilI0iIl011);
                            obj5 = ilI0iIl011;
                        }
/* 482 */               int i = 13;
/* 484 */               IloIlOOIi iloIlOOIi = new IloIlOOIi(i);
/* 487 */               iloIlOOIi.I00iiI = oI10i0Il;
/* 489 */               VarHandle.storeStoreFence();
/* 532 */               lOl0oiiO.I00000oIO(str, (Function1) obj5, o1ooiI111iI00000oIO, false, null, i1iI1IiII.I00000oOI, i1iI1IiII.I0000Il00O, iiioOl1O.I00000oOI(2057112729, iloIlOOIi, iloI0lOlll1), null, null, null, true, 0, 0, oiI111I, oloooOlO10oII000OiO, iloI0lOlll1, 918552624, 12582912, 1965176);
/* 537 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 541 */               if (objI00O0i0ii4 == iOO0o0I1l) {
/* 557 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(I1IoiO1l.I00IlilI0i0i(new O1I10OIO[]{O1I10OIO.I00iOIl, O1I10OIO.I00iiI, O1I10OIO.I00iiO}));
/* 561 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 564 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii4;
/* 590 */               O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
/* 598 */               I0O1IiI i0O1IiI = new I0O1IiI(i);
/* 601 */               i0O1IiI.I00iiI = oI10i0Il2;
/* 603 */               VarHandle.storeStoreFence();
/* 618 */               lO1Ii0lI.I00000oIO(o1ooiI111iI000OiO2, 0.0f, iiioOl1O.I00000oOI(-835775455, i0O1IiI, iloI0lOlll1), iloI0lOlll1, 390, 2);
/* 648 */               boolean zI000II = iloI0lOlll1.I000II((String) oI10i0Il.getValue()) | iloI0lOlll1.I000II(list) | iloI0lOlll1.I000II((Set) oI10i0Il2.getValue());
/* 649 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii5;
/* 653 */               if (zI000II || objI00O0i0ii5 == iOO0o0I1l) {
/* 662 */                   ArrayList arrayList = new ArrayList();
/* 673 */                   for (Object obj7 : list) {
/* 680 */                       O1I10Iii0l o1I10Iii0l = (O1I10Iii0l) obj7;
/* 703 */                       if (OlOoOIi0o.I000oI1ioi(o1I10Iii0l.I0000O, OlOoOIi0o.I00OIo((String) oI10i0Il.getValue()).toString(), true) && ((Set) oI10i0Il2.getValue()).contains(o1I10Iii0l.I00000oIO)) {
/* 719 */                           arrayList.add(obj7);
                                }
                            }
/* 723 */                   iloI0lOlll1.I00iio(arrayList);
                            obj6 = arrayList;
                        }
/* 726 */               List list2 = (List) obj6;
/* 745 */               O1ooiI111i o1ooiI111iI0000O = iO01II.I000O01llI0(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 0.0f, 2).I0000O(new O0io1O(1.0f, true));
/* 749 */               I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(16.0f);
/* 753 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(list2);
/* 757 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii6;
/* 761 */               if (zI000OOo1O2 || objI00O0i0ii6 == iOO0o0I1l) {
/* 767 */                   IO1IOO10oI0 iO1IOO10oI0 = new IO1IOO10oI0(1);
/* 770 */                   iO1IOO10oI0.I00iiI = list2;
/* 772 */                   VarHandle.storeStoreFence();
/* 775 */                   iloI0lOlll1.I00iio(iO1IOO10oI0);
                            obj8 = iO1IOO10oI0;
                        }
/* 796 */               l0oIiiI1O0o.I00000oIO(o1ooiI111iI0000O, null, null, i1IioII0000oI00, null, null, false, null, (Function1) obj8, iloI0lOlll1, 24576, 494);
/* 803 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I000II(o1ooIo101ll, 16.0f));
/* 807 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 811 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 814 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:44:0x0364  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000OiO(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    IloI0lOlll1 iloI0lOlll1;
                    boolean z2;
                    Object obj4;
/* 5 */             OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 9 */             Ioiol1OIol ioiol1OIol = (Ioiol1OIol) this.I00iiO;
/* 13 */            OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00iio;
/* 17 */            IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 25 */            IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll12.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 55 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 57 */                O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 20.0f);
/* 63 */                I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(16.0f);
/* 67 */                II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 70 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IioII0000oI00, iI0IlloOiO0i, iloI0lOlll12, 6);
/* 76 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 80 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 84 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0001Ioi1lo);
/* 90 */                IOl0oi0lOl1.I000lI.getClass();
/* 93 */                iloI0lOlll12.I00i0oil();
/* 96 */                boolean z3 = iloI0lOlll12.I00O10llo;
/* 98 */                Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 100 */               if (z3) {
/* 102 */                   iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 106 */                   iloI0lOlll12.I00io1l();
                        }
/* 109 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 111 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 114 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 116 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 119 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 123 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 125 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 128 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 131 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 133 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 136 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 265 */               Oo0i1oIIoOO.I00000oOI("Import Model", iO01II.I000OiO(o1ooIo101ll, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000II, iloI0lOlll12, 54, 0, 131068);
/* 276 */               int length = ((String) oI10i0Il.getValue()).length();
/* 282 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 284 */               if (length == 0) {
/* 289 */                   iloI0lOlll12.I00i01iIIliI(1717592253);
/* 298 */                   IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(4.0f), iI0IlloOiO0i, iloI0lOlll12, 6);
/* 304 */                   int iHashCode2 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 308 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll12.I000lI();
/* 314 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 318 */                   iloI0lOlll12.I00i0oil();
/* 323 */                   if (iloI0lOlll12.I00O10llo) {
/* 327 */                       iloI0lOlll12.I000l1(iloi111);
                            } else {
/* 331 */                       iloI0lOlll12.I00io1l();
                            }
/* 334 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO2);
/* 337 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI2);
/* 340 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 345 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 356 */                   int i = 3;
/* 426 */                   Oo0i1oIIoOO.I00000oOI(Oi010OO0.I001IIilI0O(ioiol1OIol.I0010I0i(), " (", OollloolI.I00000oOI(3, ioiol1OIol.I0010o()), ")"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000oI1ioi, iloI0lOlll12, 0, 0, 131070);
/* 429 */                   IloI0lOlll1 iloI0lOlll13 = iloI0lOlll12;
/* 431 */                   Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 435 */                   if (objI00O0i0ii == iOO0o0I1l) {
/* 438 */                       objI00O0i0ii = O1OI1ll1Il0i.I00000oIO(0.0f);
/* 442 */                       iloI0lOlll13.I00iio(objI00O0i0ii);
                            }
/* 445 */                   I10i01 i10i01 = (I10i01) objI00O0i0ii;
/* 447 */                   boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(i10i01);
/* 451 */                   Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 455 */                   if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 464 */                       z2 = true;
/* 465 */                       Iil00I1Oil0I iil00I1Oil0I = new Iil00I1Oil0I(1);
/* 468 */                       iil00I1Oil0I.I00iiI = i10i01;
/* 470 */                       VarHandle.storeStoreFence();
/* 473 */                       iloI0lOlll13.I00iio(iil00I1Oil0I);
                                obj4 = iil00I1Oil0I;
                            } else {
/* 460 */                       z2 = true;
                                obj4 = objI00O0i0ii2;
                            }
/* 510 */                   boolean z4 = z2;
/* 513 */                   OOO0iOio0oil.I0000Il00O((IllOOo00lI) obj4, iO01II.I000OiO(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, 0, 0.0f, null, iloI0lOlll13, 48, 124);
/* 520 */                   Float fValueOf = Float.valueOf(oIooO1iiliI.I000II());
/* 524 */                   boolean zI000OOo1O2 = iloI0lOlll13.I000OOo1O(i10i01);
/* 528 */                   Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 532 */                   if (zI000OOo1O2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 541 */                       objI00O0i0ii3 = new O1iIlllIoo(i10i01, oIooO1iiliI, null, i);
/* 544 */                       iloI0lOlll13.I00iio(objI00O0i0ii3);
                            }
/* 549 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll13, fValueOf);
/* 552 */                   iloI0lOlll13.I0010I0i(z4);
/* 556 */                   iloI0lOlll13.I0010I0i(false);
/* 559 */                   z = z4;
                            iloI0lOlll1 = iloI0lOlll13;
                        } else {
/* 576 */                   iloI0lOlll12.I00i01iIIliI(1718280515);
/* 579 */                   II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00ll1;
/* 589 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(6.0f), iI0O000iIl, iloI0lOlll12, 54);
/* 595 */                   int iHashCode3 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 599 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll12.I000lI();
/* 603 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 607 */                   iloI0lOlll12.I00i0oil();
/* 612 */                   if (iloI0lOlll12.I00O10llo) {
/* 614 */                       iloI0lOlll12.I000l1(iloi111);
                            } else {
/* 618 */                       iloI0lOlll12.I00io1l();
                            }
/* 621 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 624 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI3);
/* 627 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll12, iOioOOi0I3, iloI0lOlll12);
/* 630 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O3);
/* 633 */                   IoiOolO1iOo ioiOolO1iOoI00000oIO = ilIOIIl.I00000oIO();
/* 640 */                   String strI00000oOI = lOOoli.I00000oOI(R.string.cd_error, iloI0lOlll12);
/* 652 */                   long j = ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I001i1O0Ol;
/* 671 */                   z = true;
/* 673 */                   IoOoiI1II00i.I00000oIO(ioiOolO1iOoI00000oIO, strI00000oOI, null, j, iloI0lOlll12, 0, 4);
/* 786 */                   Oo0i1oIIoOO.I00000oOI((String) oI10i0Il.getValue(), iO01II.I000OiO(o1ooIo101ll, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000oI1ioi, iloI0lOlll12, 48, 0, 131064);
/* 789 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll12;
/* 791 */                   iloI0lOlll14.I0010I0i(true);
/* 796 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 803 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oOI, iI0O000iIl, iloI0lOlll14, 6);
/* 809 */                   int iHashCode4 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 813 */                   OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll14.I000lI();
/* 817 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll14, o1ooiI111iI0000oI00);
/* 821 */                   iloI0lOlll14.I00i0oil();
/* 826 */                   if (iloI0lOlll14.I00O10llo) {
/* 828 */                       iloI0lOlll14.I000l1(iloi111);
                            } else {
/* 832 */                       iloI0lOlll14.I00io1l();
                            }
/* 835 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll14, oiI1iiIl1Oi0I00000oIO2);
/* 840 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll14, oO0lO0l0I000lI4);
/* 845 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll14, iOioOOi0I3, iloI0lOlll14);
/* 850 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll14, o1ooiI111iI0000Il00O4);
/* 855 */                   boolean zI000II = iloI0lOlll14.I000II(illOOo00lI);
/* 859 */                   Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 863 */                   if (!zI000II) {
                                Object obj5 = objI00O0i0ii4;
/* 867 */                       if (objI00O0i0ii4 == iOO0o0I1l) {
/* 873 */                           I0O1OI i0o1oi = new I0O1OI(13);
/* 876 */                           i0o1oi.I00iiI = illOOo00lI;
/* 878 */                           VarHandle.storeStoreFence();
/* 881 */                           iloI0lOlll14.I00iio(i0o1oi);
                                    obj5 = i0o1oi;
                                }
/* 900 */                       iOiO0o0oi.I00000oIO((IllOOo00lI) obj5, null, false, null, null, null, null, null, i1io00.I0000Il00O, iloI0lOlll14, 805306368, 510);
/* 903 */                       iloI0lOlll14.I0010I0i(true);
/* 907 */                       iloI0lOlll14.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll14;
                            }
                        }
/* 910 */               iloI0lOlll1.I0010I0i(z);
                    } else {
/* 914 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 917 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I000iOII(Object obj, Object obj2, Object obj3) {
                    String strI00111O;
                    long jI0000Il00O;
/* 6 */             IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 10 */            IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iio;
/* 14 */            OOio1iliiii oOio1iliiii = (OOio1iliiii) this.I00iiI;
/* 18 */            String str = (String) this.I00ilI0I1;
/* 26 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 32 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 53 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 67 */                O1ooiI111i o1ooiI111iI000OOo1O = iO01II.I000OOo1O(Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f), 16.0f, 12.0f, 8.0f, 12.0f);
/* 77 */                OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, i1O01oOIoI0I.I00lli11, iloI0lOlll1, 48);
/* 83 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 87 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 91 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OOo1O);
/* 97 */                IOl0oi0lOl1.I000lI.getClass();
/* 100 */               iloI0lOlll1.I00i0oil();
/* 103 */               boolean z = iloI0lOlll1.I00O10llo;
/* 105 */               Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 107 */               if (z) {
/* 109 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 113 */                   iloI0lOlll1.I00io1l();
                        }
/* 116 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 118 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 121 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 123 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 126 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 130 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 132 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 135 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 138 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 140 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 143 */               IoiOolO1iOo ioiOolO1iOoI00000oIO = il0oOiiOoO1.I00000oIO();
/* 149 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, 32.0f);
/* 153 */               OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 197 */               IoOoiI1II00i.I00000oIO(ioiOolO1iOoI00000oIO, null, o1ooiI111iI000lI, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I00000oIO, iloI0lOlll1, 432, 0);
/* 205 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 12.0f));
/* 213 */               O0io1O o0io1O = new O0io1O(1.0f, true);
/* 221 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll1, 0);
/* 227 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 231 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 235 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o0io1O);
/* 239 */               iloI0lOlll1.I00i0oil();
/* 244 */               if (iloI0lOlll1.I00O10llo) {
/* 246 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 250 */                   iloI0lOlll1.I00io1l();
                        }
/* 253 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 256 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 259 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 264 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 267 */               String str2 = oOio1iliiii.I00000oOI;
/* 269 */               int i = oOio1iliiii.I0000oI00;
/* 341 */               Oo0i1oIIoOO.I00000oOI(str2, null, 0L, null, 0L, null, IlilIIiIiO.I00l0OO0IO, null, 0L, null, 0L, 2, false, 2, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000OOo1O, iloI0lOlll1, 1572864, 24960, 110526);
/* 346 */               if (i == 0) {
/* 352 */                   strI00111O = Oi010OO0.I00111O(str, " · No text found — may be a scanned PDF");
                        } else {
/* 380 */                   strI00111O = str + " · " + i + " chunks";
                        }
/* 392 */               Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000oI1ioi;
/* 394 */               if (i == 0) {
/* 399 */                   iloI0lOlll1.I00i01iIIliI(-1161750934);
/* 415 */                   jI0000Il00O = IOOiio0i.I0000Il00O(0.8f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I001i1O0Ol);
/* 419 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 426 */                   iloI0lOlll1.I00i01iIIliI(-1161748440);
/* 437 */                   jI0000Il00O = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oIO.I0010o;
/* 439 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 477 */               Oo0i1oIIoOO.I00000oOI(strI00111O, null, jI0000Il00O, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, 0, 0, 131066);
/* 482 */               iloI0lOlll1.I0010I0i(true);
/* 491 */               lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 4.0f));
/* 506 */               iIo1101O.I00000oIO(illOOo00lI, null, false, null, null, i1oIli1o0ilo.I0000oI00, iloI0lOlll1, 1572864, 62);
/* 522 */               iIo1101O.I00000oIO(illOOo00lI2, null, false, null, null, i1oIli1o0ilo.I0001Ioi1lo, iloI0lOlll1, 1572864, 62);
/* 526 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 530 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 533 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:64:0x05e6  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0632  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0647  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0674  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0678  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000lI(Object obj, Object obj2, Object obj3) {
                    char c;
                    Iloi111 iloi111;
                    int i;
                    Iloi111 iloi1112;
                    Iloi111 iloi1113;
                    IOioOOi0I iOioOOi0I;
                    Ool01o0 ool01o0;
                    IOioOOi0I iOioOOi0I2;
                    IloI0lOlll1 iloI0lOlll1;
                    IOO0o0I1l iOO0o0I1l;
                    OI10i0Il oI10i0Il;
                    Object obj4;
                    IOO0o0I1l iOO0o0I1l2;
                    IloI0lOlll1 iloI0lOlll12;
                    Object objI00O0i0ii;
/* 5 */             Context context = (Context) this.I00iiO;
/* 9 */             OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 13 */            Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 17 */            OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 25 */            IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 31 */            ((Integer) obj3).getClass();
/* 36 */            I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(16.0f);
/* 40 */            II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 43 */            IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IioII0000oI00, iI0IlloOiO0i, iloI0lOlll13, 6);
/* 49 */            int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 53 */            OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 57 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 59 */            O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 65 */            IOl0oi0lOl1.I000lI.getClass();
/* 68 */            iloI0lOlll13.I00i0oil();
/* 71 */            boolean z = iloI0lOlll13.I00O10llo;
/* 73 */            Iloi111 iloi1114 = O0iiOioolIi.I01101IOlO;
/* 75 */            if (z) {
/* 77 */                iloI0lOlll13.I000l1(iloi1114);
                    } else {
/* 81 */                iloI0lOlll13.I00io1l();
                    }
/* 84 */            IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00io1l;
/* 86 */            li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 89 */            IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilO0;
/* 91 */            li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, oO0lO0l0I000lI);
/* 94 */            Integer numValueOf = Integer.valueOf(iHashCode);
/* 98 */            IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ioIO;
/* 100 */           li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll13, numValueOf);
/* 103 */           li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 106 */           IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilI0I1;
/* 108 */           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 113 */           O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 117 */           Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 123 */           IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 125 */           if (objI00O0i0ii2 == iOO0o0I1l3) {
/* 129 */               objI00O0i0ii2 = new OiioI1Io0o(6);
/* 132 */               iloI0lOlll13.I00iio(objI00O0i0ii2);
                    }
/* 138 */           O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI00, true, (Function1) objI00O0i0ii2);
/* 142 */           I1IiOIiOli i1IiOIiOli = I1IiooiI1IlO.I0000Il00O;
/* 145 */           IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll13, 0);
/* 153 */           int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 157 */           OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 161 */           O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI);
/* 165 */           iloI0lOlll13.I00i0oil();
/* 172 */           if (iloI0lOlll13.I00O10llo) {
/* 174 */               iloI0lOlll13.I000l1(iloi1114);
                    } else {
/* 178 */               iloI0lOlll13.I00io1l();
                    }
/* 181 */           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO2);
/* 184 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, oO0lO0l0I000lI2);
/* 187 */           IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I5, iloI0lOlll13);
/* 192 */           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 199 */           Oo0lloOiiIOI oo0lloOiiIOI = liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000OOo1O;
/* 201 */           IlilIIiIiO ililIIiIiO = IlilIIiIiO.I00l0I0l0lO1;
/* 317 */           Oo0i1oIIoOO.I00000oOI("Privacy", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(oo0lloOiiIOI, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll13, 6, 0, 131070);
/* 342 */           Oo0i1oIIoOO.I00000oOI("Box is a privacy-focused fork of Google AI Edge Gallery. Chat history is encrypted with SQLCipher. Biometric authentication protects app access. Not affiliated with Google.", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000l1, iloI0lOlll13, 0, 0, 131066);
/* 347 */           iloI0lOlll13.I0010I0i(true);
/* 354 */           O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 358 */           Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
/* 364 */           if (objI00O0i0ii3 == iOO0o0I1l3) {
/* 368 */               c = 6;
/* 369 */               objI00O0i0ii3 = new OiioI1Io0o(6);
/* 372 */               iloI0lOlll13.I00iio(objI00O0i0ii3);
                    } else {
/* 376 */               c = 6;
                    }
/* 379 */           O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI002, true, (Function1) objI00O0i0ii3);
/* 386 */           IOOlo1O01O iOOlo1O01OI00000oIO3 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll13, 0);
/* 392 */           int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 396 */           OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 400 */           O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI2);
/* 404 */           iloI0lOlll13.I00i0oil();
/* 409 */           if (iloI0lOlll13.I00O10llo) {
/* 411 */               iloi111 = iloi1114;
/* 413 */               iloI0lOlll13.I000l1(iloi111);
                    } else {
/* 417 */               iloi111 = iloi1114;
/* 419 */               iloI0lOlll13.I00io1l();
                    }
/* 422 */           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO3);
/* 425 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, oO0lO0l0I000lI3);
/* 428 */           IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I5, iloI0lOlll13);
/* 433 */           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 497 */           Iloi111 iloi1115 = iloi111;
/* 531 */           Oo0i1oIIoOO.I00000oOI("Third-party libraries", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000OOo1O, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll13, 6, 0, 131070);
/* 538 */           boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(context);
/* 542 */           Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                    Object obj5 = objI00O0i0ii4;
/* 546 */           if (zI000OOo1O || objI00O0i0ii4 == iOO0o0I1l3) {
/* 554 */               I000OOo1O i000OOo1O = new I000OOo1O(10);
/* 557 */               i000OOo1O.I00iiI = context;
/* 559 */               VarHandle.storeStoreFence();
/* 562 */               iloI0lOlll13.I00iio(i000OOo1O);
                        obj5 = i000OOo1O;
                    }
/* 588 */           iOiO0o0oi.I0000Il00O((IllOOo00lI) obj5, null, false, null, null, null, null, iII11Ii.I000OOo1O, iloI0lOlll13, 805306368, 510);
/* 593 */           iloI0lOlll13.I0010I0i(true);
/* 600 */           O1ooiI111i o1ooiI111iI0000oI003 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 604 */           Object objI00O0i0ii5 = iloI0lOlll13.I00O0i0ii();
/* 608 */           if (objI00O0i0ii5 == iOO0o0I1l3) {
/* 612 */               i = 6;
/* 613 */               objI00O0i0ii5 = new OiioI1Io0o(6);
/* 616 */               iloI0lOlll13.I00iio(objI00O0i0ii5);
                    } else {
/* 620 */               i = 6;
                    }
/* 623 */           O1ooiI111i o1ooiI111iI00000oOI3 = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI003, true, (Function1) objI00O0i0ii5);
/* 633 */           IOOlo1O01O iOOlo1O01OI00000oIO4 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(4.0f), iI0IlloOiO0i, iloI0lOlll13, i);
/* 639 */           int iHashCode4 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 643 */           OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll13.I000lI();
/* 647 */           O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI3);
/* 651 */           iloI0lOlll13.I00i0oil();
/* 656 */           if (iloI0lOlll13.I00O10llo) {
/* 658 */               iloi1112 = iloi1115;
/* 660 */               iloI0lOlll13.I000l1(iloi1112);
                    } else {
/* 664 */               iloi1112 = iloi1115;
/* 666 */               iloI0lOlll13.I00io1l();
                    }
/* 669 */           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO4);
/* 672 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, oO0lO0l0I000lI4);
/* 675 */           IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll13, iOioOOi0I5, iloI0lOlll13);
/* 680 */           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, o1ooiI111iI0000Il00O4);
/* 727 */           int i2 = i;
/* 731 */           Iloi111 iloi1116 = iloi1112;
/* 766 */           Oo0i1oIIoOO.I00000oOI("About", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000OOo1O, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll13, 6, 0, 131070);
/* 789 */           Oo0i1oIIoOO.I00000oOI("Developed by Jegly", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000l1, iloI0lOlll13, 6, 0, 131066);
/* 809 */           Oo0i1oIIoOO.I00000oOI("Jesse Edwin Gordon Li-Yates", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000l1, iloI0lOlll13, 6, 0, 131066);
/* 831 */           Oo0i1oIIoOO.I00000oOI("Box v3.3.3", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll13).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000l1, iloI0lOlll13, 0, 0, 131066);
/* 858 */           ii0IlolIi.I00000oIO("https://github.com/jegly", "github.com/jegly", iO01II.I000OiO(o1ooIo101ll, 0.0f, 2.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll13, 438, 24);
/* 877 */           ii0IlolIi.I00000oIO("https://www.jegly.xyz", "www.jegly.xyz", iO01II.I000OiO(o1ooIo101ll, 0.0f, 2.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll13, 438, 24);
/* 881 */           iloI0lOlll13.I0010I0i(true);
/* 886 */           O1ooiI111i o1ooiI111iI0000oI004 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 890 */           Object objI00O0i0ii6 = iloI0lOlll13.I00O0i0ii();
/* 894 */           if (objI00O0i0ii6 == iOO0o0I1l3) {
/* 898 */               objI00O0i0ii6 = new OiioI1Io0o(i2);
/* 901 */               iloI0lOlll13.I00iio(objI00O0i0ii6);
                    }
/* 906 */           O1ooiI111i o1ooiI111iI00000oOI4 = OiioloIlOlIi.I00000oOI(o1ooiI111iI0000oI004, true, (Function1) objI00O0i0ii6);
/* 914 */           IOOlo1O01O iOOlo1O01OI00000oIO5 = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(4.0f), iI0IlloOiO0i, iloI0lOlll13, i2);
/* 920 */           int iHashCode5 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 924 */           OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll13.I000lI();
/* 928 */           O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI00000oOI4);
/* 932 */           iloI0lOlll13.I00i0oil();
/* 937 */           if (iloI0lOlll13.I00O10llo) {
/* 939 */               iloi1113 = iloi1116;
/* 941 */               iloI0lOlll13.I000l1(iloi1113);
                    } else {
/* 945 */               iloi1113 = iloi1116;
/* 947 */               iloI0lOlll13.I00io1l();
                    }
/* 950 */           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO5);
/* 953 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, oO0lO0l0I000lI5);
/* 958 */           IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll13, iOioOOi0I5, iloI0lOlll13);
/* 963 */           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll13, o1ooiI111iI0000Il00O5);
/* 1012 */          Iloi111 iloi1117 = iloi1113;
/* 1049 */          Oo0i1oIIoOO.I00000oOI("App updates", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll13).I000OOo1O, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll13, 6, 0, 131070);
/* 1052 */          IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 1058 */          Ool01o0 ool01o02 = (Ool01o0) oI10i0Il2.getValue();
/* 1062 */          if (ool01o02 instanceof Ool00l) {
/* 1067 */              iloI0lOlll14.I00i01iIIliI(546582819);
/* 1141 */              iOioOOi0I = iOioOOi0I5;
/* 1143 */              ool01o0 = ool01o02;
/* 1145 */              Oo0i1oIIoOO.I00000oOI("You're up to date", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll14).I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll14).I000l1, iloI0lOlll14, 6, 0, 131066);
/* 1148 */              IloI0lOlll1 iloI0lOlll15 = iloI0lOlll14;
/* 1151 */              iloI0lOlll15.I0010I0i(false);
/* 1154 */              iOioOOi0I2 = iOioOOi0I4;
                        iloI0lOlll1 = iloI0lOlll15;
                    } else {
/* 1159 */              iOioOOi0I = iOioOOi0I5;
/* 1161 */              ool01o0 = ool01o02;
/* 1165 */              if (ool01o0 instanceof Ool01lI1) {
/* 1170 */                  iloI0lOlll14.I00i01iIIliI(546850287);
/* 1238 */                  iOioOOi0I2 = iOioOOi0I4;
/* 1242 */                  Oo0i1oIIoOO.I00000oOI(IlIi0I0.I000lI("v", ((Ool01lI1) ool01o0).I00000oIO, " is available"), null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll14).I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll14).I000l1, iloI0lOlll14, 0, 0, 131066);
/* 1245 */                  IloI0lOlll1 iloI0lOlll16 = iloI0lOlll14;
/* 1247 */                  iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll1 = iloI0lOlll16;
                        } else {
/* 1251 */                  iOioOOi0I2 = iOioOOi0I4;
/* 1256 */                  if (ool01o0 instanceof Ool00Ill1OOi) {
/* 1261 */                      iloI0lOlll14.I00i01iIIliI(547126404);
/* 1315 */                      Oo0i1oIIoOO.I00000oOI(((Ool00Ill1OOi) ool01o0).I00000oIO, null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll14).I001i1O0Ol, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll14).I000l1, iloI0lOlll14, 0, 0, 131066);
/* 1318 */                      IloI0lOlll1 iloI0lOlll17 = iloI0lOlll14;
/* 1320 */                      iloI0lOlll17.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll17;
                            } else {
/* 1327 */                      iloI0lOlll14.I00i01iIIliI(547317116);
/* 1330 */                      iloI0lOlll14.I0010I0i(false);
                                iloI0lOlll1 = iloI0lOlll14;
                            }
                        }
                    }
/* 1343 */          OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll1, 54);
/* 1349 */          int iHashCode6 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 1353 */          OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll1.I000lI();
/* 1357 */          O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 1361 */          iloI0lOlll1.I00i0oil();
/* 1366 */          if (iloI0lOlll1.I00O10llo) {
/* 1368 */              iloI0lOlll1.I000l1(iloi1117);
                    } else {
/* 1372 */              iloI0lOlll1.I00io1l();
                    }
/* 1375 */          li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 1378 */          IOioOOi0I iOioOOi0I7 = iOioOOi0I2;
/* 1380 */          li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll1, oO0lO0l0I000lI6);
/* 1383 */          IOioOOi0I iOioOOi0I8 = iOioOOi0I;
/* 1385 */          IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll1, iOioOOi0I8, iloI0lOlll1);
/* 1390 */          li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll1, o1ooiI111iI0000Il00O6);
/* 1395 */          boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(ii0110);
/* 1399 */          Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 1403 */          if (!zI000OOo1O2) {
/* 1405 */              iOO0o0I1l = iOO0o0I1l3;
/* 1407 */              if (objI00O0i0ii7 != iOO0o0I1l) {
/* 1410 */                  oI10i0Il = oI10i0Il3;
                            obj4 = objI00O0i0ii7;
                        }
                        boolean z2 = !((Boolean) oI10i0Il.getValue()).booleanValue();
/* 1456 */              I0O1IiI i0O1IiI = new I0O1IiI(28);
/* 1459 */              i0O1IiI.I00iiI = oI10i0Il;
/* 1461 */              VarHandle.storeStoreFence();
/* 1483 */              IloI0lOlll1 iloI0lOlll18 = iloI0lOlll1;
/* 1486 */              iOO0o0I1l2 = iOO0o0I1l;
/* 1503 */              iOiO0o0oi.I0000Il00O((IllOOo00lI) obj4, null, z2, null, null, null, null, iiioOl1O.I00000oOI(-140481860, i0O1IiI, iloI0lOlll1), iloI0lOlll18, 805306368, 506);
/* 1506 */              IloI0lOlll1 iloI0lOlll19 = iloI0lOlll18;
/* 1509 */              if (ool01o0 instanceof Ool01lI1) {
/* 1591 */                  iloI0lOlll19.I00i01iIIliI(723370840);
/* 1594 */                  iloI0lOlll19.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll19;
                        } else {
/* 1514 */                  iloI0lOlll19.I00i01iIIliI(723110409);
/* 1527 */                  boolean zI000OOo1O3 = iloI0lOlll19.I000OOo1O(context) | iloI0lOlll19.I000II(ool01o0);
/* 1528 */                  Object objI00O0i0ii8 = iloI0lOlll19.I00O0i0ii();
                            Object obj6 = objI00O0i0ii8;
/* 1532 */                  if (zI000OOo1O3 || objI00O0i0ii8 == iOO0o0I1l2) {
/* 1542 */                      O1l110o o1l110o = new O1l110o(21);
/* 1545 */                      o1l110o.I00iiI = context;
/* 1547 */                      o1l110o.I00iiO = (Ool01lI1) ool01o0;
/* 1549 */                      VarHandle.storeStoreFence();
/* 1552 */                      iloI0lOlll19.I00iio(o1l110o);
                                obj6 = o1l110o;
                            }
/* 1575 */                  iOiO0o0oi.I00000oIO((IllOOo00lI) obj6, null, false, null, null, null, null, null, iII11Ii.I000OiO, iloI0lOlll19, 805306368, 510);
/* 1578 */                  IloI0lOlll1 iloI0lOlll110 = iloI0lOlll19;
/* 1580 */                  iloI0lOlll110.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll110;
                        }
/* 1598 */              O1ooiI111i o1ooiI111iI000l1 = Oi010OO0.I000l1(iloI0lOlll12, true, true, o1ooIo101ll, 1.0f);
/* 1602 */              objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 1606 */              if (objI00O0i0ii == iOO0o0I1l2) {
/* 1611 */                  objI00O0i0ii = new OiioI1Io0o(6);
/* 1614 */                  iloI0lOlll12.I00iio(objI00O0i0ii);
                        }
/* 1619 */              O1ooiI111i o1ooiI111iI00000oOI5 = OiioloIlOlIi.I00000oOI(o1ooiI111iI000l1, true, (Function1) objI00O0i0ii);
/* 1628 */              IOOlo1O01O iOOlo1O01OI00000oIO6 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll12, 0);
/* 1634 */              int iHashCode7 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 1638 */              OO0lO0l0 oO0lO0l0I000lI7 = iloI0lOlll12.I000lI();
/* 1642 */              O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oOI5);
/* 1646 */              iloI0lOlll12.I00i0oil();
/* 1651 */              if (iloI0lOlll12.I00O10llo) {
/* 1657 */                  iloI0lOlll12.I00io1l();
                        } else {
/* 1653 */                  iloI0lOlll12.I000l1(iloi1117);
                        }
/* 1660 */              li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, iOOlo1O01OI00000oIO6);
/* 1665 */              li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll12, oO0lO0l0I000lI7);
/* 1670 */              IIl001iO0Io.I001IIilI0O(iHashCode7, iloI0lOlll12, iOioOOi0I8, iloI0lOlll12);
/* 1675 */              li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll12, o1ooiI111iI0000Il00O7);
/* 1717 */              IloI0lOlll1 iloI0lOlll111 = iloI0lOlll12;
/* 1743 */              Oo0i1oIIoOO.I00000oOI("Privacy & Legal", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll12).I000OOo1O, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll111, 6, 0, 131070);
/* 1776 */              ii0IlolIi.I00000oIO("https://ai.google.dev/gemma/terms", lOOoli.I00000oOI(R.string.tos_dialog_title_gemma, iloI0lOlll111), iO01II.I000OiO(o1ooIo101ll, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll111, 390, 24);
/* 1801 */              ii0IlolIi.I00000oIO("https://ai.google.dev/gemma/prohibited_use_policy", lOOoli.I00000oOI(R.string.settings_dialog_gemma_prohibited_use_policy, iloI0lOlll111), iO01II.I000OiO(o1ooIo101ll, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll111, 390, 24);
/* 1805 */              iloI0lOlll111.I0010I0i(true);
/* 1808 */              iloI0lOlll111.I0010I0i(true);
/* 1811 */              return OoiIlOl1iI.I00000oIO;
                    }
/* 1413 */          iOO0o0I1l = iOO0o0I1l3;
/* 1419 */          O1oiilO o1oiilO = new O1oiilO(14);
/* 1422 */          o1oiilO.I00iiI = ii0110;
/* 1424 */          oI10i0Il = oI10i0Il3;
/* 1426 */          o1oiilO.I00iiO = oI10i0Il;
/* 1430 */          o1oiilO.I00iio = oI10i0Il2;
/* 1432 */          VarHandle.storeStoreFence();
/* 1435 */          iloI0lOlll1.I00iio(o1oiilO);
                    obj4 = o1oiilO;
                    boolean z22 = !((Boolean) oI10i0Il.getValue()).booleanValue();
/* 1456 */          I0O1IiI i0O1IiI2 = new I0O1IiI(28);
/* 1459 */          i0O1IiI2.I00iiI = oI10i0Il;
/* 1461 */          VarHandle.storeStoreFence();
/* 1483 */          IloI0lOlll1 iloI0lOlll182 = iloI0lOlll1;
/* 1486 */          iOO0o0I1l2 = iOO0o0I1l;
/* 1503 */          iOiO0o0oi.I0000Il00O((IllOOo00lI) obj4, null, z22, null, null, null, null, iiioOl1O.I00000oOI(-140481860, i0O1IiI2, iloI0lOlll1), iloI0lOlll182, 805306368, 506);
/* 1506 */          IloI0lOlll1 iloI0lOlll192 = iloI0lOlll182;
/* 1509 */          if (ool01o0 instanceof Ool01lI1) {
                    }
/* 1598 */          O1ooiI111i o1ooiI111iI000l12 = Oi010OO0.I000l1(iloI0lOlll12, true, true, o1ooIo101ll, 1.0f);
/* 1602 */          objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
/* 1606 */          if (objI00O0i0ii == iOO0o0I1l2) {
                    }
/* 1619 */          O1ooiI111i o1ooiI111iI00000oOI52 = OiioloIlOlIi.I00000oOI(o1ooiI111iI000l12, true, (Function1) objI00O0i0ii);
/* 1628 */          IOOlo1O01O iOOlo1O01OI00000oIO62 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll12, 0);
/* 1634 */          int iHashCode72 = Long.hashCode(iloI0lOlll12.I00OI1);
/* 1638 */          OO0lO0l0 oO0lO0l0I000lI72 = iloI0lOlll12.I000lI();
/* 1642 */          O1ooiI111i o1ooiI111iI0000Il00O72 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oOI52);
/* 1646 */          iloI0lOlll12.I00i0oil();
/* 1651 */          if (iloI0lOlll12.I00O10llo) {
                    }
/* 1660 */          li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, iOOlo1O01OI00000oIO62);
/* 1665 */          li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll12, oO0lO0l0I000lI72);
/* 1670 */          IIl001iO0Io.I001IIilI0O(iHashCode72, iloI0lOlll12, iOioOOi0I8, iloI0lOlll12);
/* 1675 */          li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll12, o1ooiI111iI0000Il00O72);
/* 1717 */          IloI0lOlll1 iloI0lOlll1112 = iloI0lOlll12;
/* 1743 */          Oo0i1oIIoOO.I00000oOI("Privacy & Legal", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, Oo0lloOiiIOI.I00000oOI(liIoOiiO1Oi.I000OOo1O(iloI0lOlll12).I000OOo1O, 0L, 0L, ililIIiIiO, null, 0L, 0L, null, 16777211), iloI0lOlll1112, 6, 0, 131070);
/* 1776 */          ii0IlolIi.I00000oIO("https://ai.google.dev/gemma/terms", lOOoli.I00000oOI(R.string.tos_dialog_title_gemma, iloI0lOlll1112), iO01II.I000OiO(o1ooIo101ll, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll1112, 390, 24);
/* 1801 */          ii0IlolIi.I00000oIO("https://ai.google.dev/gemma/prohibited_use_policy", lOOoli.I00000oOI(R.string.settings_dialog_gemma_prohibited_use_policy, iloI0lOlll1112), iO01II.I000OiO(o1ooIo101ll, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0, iloI0lOlll1112, 390, 24);
/* 1805 */          iloI0lOlll1112.I0010I0i(true);
/* 1808 */          iloI0lOlll1112.I0010I0i(true);
/* 1811 */          return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v1, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v2, types: [Oio1o1iIliO, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v3 */
                private final Object I000o00OoI0I(Object obj, Object obj2, Object obj3) {
/* 5 */             ArrayList arrayList = (ArrayList) this.I00iiO;
/* 9 */             Context context = (Context) this.I00iio;
/* 13 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 17 */            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 25 */            ?? r12 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 50 */            if (r12.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 52 */                Iterator it = arrayList.iterator();
/* 60 */                while (it.hasNext()) {
/* 68 */                    int iIntValue2 = ((Number) it.next()).intValue();
/* 75 */                    O1l1llo o1l1llo = new O1l1llo(2);
/* 78 */                    o1l1llo.I00iiI = iIntValue2;
/* 80 */                    VarHandle.storeStoreFence();
/* 86 */                    IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-795785115, o1l1llo, r12);
/* 98 */                    boolean zI0000oI00 = r12.I0000oI00(iIntValue2) | r12.I000OOo1O(context);
/* 99 */                    IllOOo00lI illOOo00lII00O0i0ii = r12.I00O0i0ii();
/* 103 */                   if (zI0000oI00 || illOOo00lII00O0i0ii == IOl11li.I00000oIO) {
/* 111 */                       illOOo00lII00O0i0ii = new Oio1o1iIliO(1);
/* 114 */                       illOOo00lII00O0i0ii.I00iiI = oI10i0Il;
/* 116 */                       illOOo00lII00O0i0ii.I00iiO = iIntValue2;
/* 118 */                       illOOo00lII00O0i0ii.I00iio = context;
/* 120 */                       illOOo00lII00O0i0ii.I00ilI0I1 = oI10i0Il2;
/* 122 */                       VarHandle.storeStoreFence();
/* 125 */                       r12.I00iio(illOOo00lII00O0i0ii);
                            }
/* 139 */                   iOIliO1I1i.I00000oOI(iOii1lI00000oOI, illOOo00lII00O0i0ii, null, null, false, null, null, r12, 6, 508);
                        }
                    } else {
/* 143 */               r12.I00OilO00Il();
                    }
/* 146 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v1, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v2, types: [OioI1O, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v3 */
                private final Object I000oI1ioi(Object obj, Object obj2, Object obj3) {
/* 5 */             OOOIIIIl oOOIIIIl = (OOOIIIIl) this.I00iiO;
/* 9 */             Function1 function1 = (Function1) this.I00iio;
/* 13 */            OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 17 */            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 25 */            ?? r12 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 37 */            int i = 1;
/* 38 */            int i2 = 16;
/* 50 */            if (r12.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 54 */                Iterator it = oOOIIIIl.I0000Il00O.iterator();
/* 62 */                while (it.hasNext()) {
/* 68 */                    String str = (String) it.next();
/* 72 */                    I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(i2);
/* 75 */                    i0Iooi0i1l0l.I00iiI = str;
/* 77 */                    VarHandle.storeStoreFence();
/* 83 */                    IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1249223680, i0Iooi0i1l0l, r12);
/* 95 */                    boolean zI000II = r12.I000II(str) | r12.I000II(function1);
/* 96 */                    ?? I00O0i0ii = r12.I00O0i0ii();
/* 100 */                   if (zI000II || I00O0i0ii == IOl11li.I00000oIO) {
/* 108 */                       I00O0i0ii = new OioI1O(i);
/* 111 */                       I00O0i0ii.I00iio = str;
/* 113 */                       I00O0i0ii.I00ilI0I1 = function1;
/* 115 */                       I00O0i0ii.I00iiI = oI10i0Il;
/* 117 */                       I00O0i0ii.I00iiO = oI10i0Il2;
/* 119 */                       VarHandle.storeStoreFence();
/* 122 */                       r12.I00iio(I00O0i0ii);
                            }
/* 137 */                   iOIliO1I1i.I00000oOI(iOii1lI00000oOI, (IllOOo00lI) I00O0i0ii, null, null, false, null, null, r12, 6, 508);
/* 140 */                   i2 = i2;
                        }
                    } else {
/* 142 */               r12.I00OilO00Il();
                    }
/* 145 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I00100l0(Object obj, Object obj2, Object obj3) {
                    O1ooIo101ll o1ooIo101ll;
/* 6 */             IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 10 */            Ol0ioI1iI ol0ioI1iI = (Ol0ioI1iI) this.I00iio;
/* 15 */            IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00iiI;
/* 19 */            IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00ilI0I1;
/* 27 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 33 */            ((Integer) obj3).getClass();
/* 36 */            II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 41 */            O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 49 */            O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(o1ooIo101ll2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
/* 57 */            OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, iI0O000iIl, iloI0lOlll1, 54);
/* 63 */            int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 67 */            OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 71 */            O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000OiO);
/* 77 */            IOl0oi0lOl1.I000lI.getClass();
/* 80 */            iloI0lOlll1.I00i0oil();
/* 85 */            if (iloI0lOlll1.I00O10llo) {
/* 89 */                iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                    } else {
/* 93 */                iloI0lOlll1.I00io1l();
                    }
/* 98 */            li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, oiI1iiIl1Oi0I00000oIO);
/* 103 */           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 112 */           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 115 */           li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 120 */           li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 136 */           O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(Ol0iOOO0.I000II(o1ooIo101ll2, 32.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
/* 140 */           OIo1i1 oIo1i1 = Ol0lllilO0Ol.I00000oOI;
/* 162 */           float f = 32.0f;
/* 167 */           iOiO0o0oi.I00000oOI(illOOo00lI, o1ooiI111iI000OiO2, false, null, null, null, oIo1i1, iII1I0Io0oo.I000iOII, iloI0lOlll1, 817889328, 380);
/* 176 */           if (ol0ioI1iI.I001i1lo1io()) {
/* 181 */               iloI0lOlll1.I00i01iIIliI(-2141159662);
/* 197 */               o1ooIo101ll = o1ooIo101ll2;
/* 209 */               f = 32.0f;
/* 217 */               iOiO0o0oi.I00000oOI(illOOo00lI2, iO01II.I000OiO(Ol0iOOO0.I000II(o1ooIo101ll2, 32.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), false, null, null, null, oIo1i1, iII1I0Io0oo.I000l1, iloI0lOlll1, 817889328, 380);
/* 220 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 224 */               o1ooIo101ll = o1ooIo101ll2;
/* 228 */               iloI0lOlll1.I00i01iIIliI(-2140482157);
/* 231 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 238 */           if (ol0ioI1iI.I0010I0i()) {
/* 278 */               iloI0lOlll1.I00i01iIIliI(-2139729229);
/* 281 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 243 */               iloI0lOlll1.I00i01iIIliI(-2140379826);
/* 268 */               iOiO0o0oi.I0000Il00O(illOOo00lI3, Ol0iOOO0.I000II(o1ooIo101ll, f), false, null, null, null, oIo1i1, iII1I0Io0oo.I000lI, iloI0lOlll1, 817889328, 380);
/* 271 */               iloI0lOlll1.I0010I0i(false);
                    }
/* 285 */           iloI0lOlll1.I0010I0i(true);
/* 288 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I00111O(Object obj, Object obj2, Object obj3) {
/* 5 */             Object obj4 = (Ol1OiolO0) this.I00iiO;
/* 9 */             Ol1OiolO0 ol1OiolO0 = (Ol1OiolO0) this.I00iio;
/* 13 */            Object obj5 = (IlI1ooiil1lo) this.I00iiI;
/* 17 */            Object obj6 = (String) this.I00ilI0I1;
/* 21 */            IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 31 */            int iIntValue = ((Integer) obj3).intValue();
/* 37 */            if ((iIntValue & 6) == 0) {
/* 48 */                iIntValue |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 4 : 2;
                    }
/* 66 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 19) != 18)) {
/* 68 */                boolean zI0000O = O0000Ioio00.I0000O(obj4, ol1OiolO0);
/* 74 */                IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 86 */                boolean zI000II = iloI0lOlll1.I000II(obj4) | iloI0lOlll1.I000OOo1O(obj5);
/* 87 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 91 */                Object obj7 = IOl11li.I00000oIO;
                        Object obj8 = objI00O0i0ii;
/* 93 */                if (zI000II || objI00O0i0ii == obj7) {
/* 101 */                   O1l110o o1l110o = new O1l110o(25);
/* 104 */                   o1l110o.I00iiI = obj4;
/* 106 */                   o1l110o.I00iiO = obj5;
/* 108 */                   VarHandle.storeStoreFence();
/* 111 */                   iloI0lOlll1.I00iio(o1l110o);
                            obj8 = o1l110o;
                        }
/* 115 */               IllOOo00lI illOOo00lI = (IllOOo00lI) obj8;
/* 117 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 123 */               if (objI00O0i0ii2 == obj7) {
/* 130 */                   objI00O0i0ii2 = O1OI1ll1Il0i.I00000oIO(!zI0000O ? 1.0f : 0.0f);
/* 134 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 138 */               I10i01 i10i01 = (I10i01) objI00O0i0ii2;
/* 140 */               Boolean boolValueOf = Boolean.valueOf(zI0000O);
/* 162 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(i10i01) | iloI0lOlll1.I000O01llI0(zI0000O) | iloI0lOlll1.I000OOo1O(ilIoO1ilo1I00000oOI) | iloI0lOlll1.I000II(illOOo00lI);
/* 163 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 167 */               if (zI000OOo1O || objI00O0i0ii3 == obj7) {
/* 175 */                   objI00O0i0ii3 = new I1o0o1(i10i01, zI0000O, ilIoO1ilo1I00000oOI, illOOo00lI, (IOoil1iiIilo) null);
/* 178 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 183 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii3, iloI0lOlll1, boolValueOf);
/* 186 */               I110IiI1I1 i110IiI1I1 = i10i01.I0000Il00O;
/* 190 */               Object objI00000oOI = l1i1II.I00000oOI(OI0I0o.I00iiI, iloI0lOlll1);
/* 194 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 198 */               if (objI00O0i0ii4 == obj7) {
/* 206 */                   objI00O0i0ii4 = O1OI1ll1Il0i.I00000oIO(zI0000O ? 0.8f : 1.0f);
/* 210 */                   iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 214 */               I10i01 i10i012 = (I10i01) objI00O0i0ii4;
/* 216 */               Boolean boolValueOf2 = Boolean.valueOf(zI0000O);
/* 233 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(i10i012) | iloI0lOlll1.I000O01llI0(zI0000O) | iloI0lOlll1.I000OOo1O(objI00000oOI);
/* 234 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 238 */               if (zI000OOo1O2 || objI00O0i0ii5 == obj7) {
/* 247 */                   objI00O0i0ii5 = new II1lO00lOl(i10i012, zI0000O, objI00000oOI, (IOoil1iiIilo) null, 5);
/* 250 */                   iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 255 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii5, iloI0lOlll1, boolValueOf2);
/* 258 */               I110IiI1I1 i110IiI1I12 = i10i012.I0000Il00O;
/* 311 */               O1ooiI111i o1ooiI111iI00000oOI = iIlll1lo.I00000oOI(O1ooIo101ll.I00000oIO, ((Number) i110IiI1I12.I00iiI.getValue()).floatValue(), ((Number) i110IiI1I12.I00iiI.getValue()).floatValue(), ((Number) i110IiI1I1.I00iiI.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, null, false, 1048568);
/* 328 */               boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(zI0000O) | iloI0lOlll1.I000II(obj4) | iloI0lOlll1.I000II(obj6);
/* 329 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj9 = objI00O0i0ii6;
/* 333 */               if (zI000O01llI0 || objI00O0i0ii6 == obj7) {
/* 340 */                   Iii0IOio iii0IOio = new Iii0IOio(3);
/* 343 */                   iii0IOio.I00iiI = zI0000O;
/* 345 */                   iii0IOio.I00iiO = obj6;
/* 347 */                   iii0IOio.I00iio = obj4;
/* 349 */                   VarHandle.storeStoreFence();
/* 352 */                   iloI0lOlll1.I00iio(iii0IOio);
                            obj9 = iii0IOio;
                        }
/* 357 */               O1ooiI111i o1ooiI111iI00000oOI2 = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oOI, false, (Function1) obj9);
/* 363 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 369 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 373 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 377 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 383 */               IOl0oi0lOl1.I000lI.getClass();
/* 386 */               iloI0lOlll1.I00i0oil();
/* 391 */               if (iloI0lOlll1.I00O10llo) {
/* 395 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 399 */                   iloI0lOlll1.I00io1l();
                        }
/* 404 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 409 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 418 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 421 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 426 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 435 */               illiIl1l11O.invoke(iloI0lOlll1, Integer.valueOf(iIntValue & 14));
/* 438 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 442 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 445 */           return OoiIlOl1iI.I00000oIO;
                }

                private final Object I001IIilI0O(Object obj, Object obj2, Object obj3) {
                    OliiOl0 oliiOl0;
                    int i;
                    OlO1iIi1ol0 olO1iIi1ol0;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll1;
                    Iloi111 iloi111;
                    OI10i0Il oI10i0Il;
                    Object obj4;
/* 5 */             OliiOl0 oliiOl02 = (OliiOl0) this.I00iiO;
/* 10 */            Function1 function1 = (Function1) this.I00iio;
/* 14 */            OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiI;
/* 18 */            Function1 function12 = (Function1) this.I00ilI0I1;
/* 26 */            IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 32 */            int iIntValue = ((Integer) obj3).intValue();
/* 51 */            if (iloI0lOlll12.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 55 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 57 */                O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooIo101ll, 16.0f);
/* 70 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000oI00(8.0f), i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 6);
/* 76 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 80 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 84 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0001Ioi1lo);
/* 90 */                IOl0oi0lOl1.I000lI.getClass();
/* 93 */                iloI0lOlll12.I00i0oil();
/* 96 */                boolean z2 = iloI0lOlll12.I00O10llo;
/* 98 */                Iloi111 iloi1112 = O0iiOioolIi.I01101IOlO;
/* 100 */               if (z2) {
/* 102 */                   iloI0lOlll12.I000l1(iloi1112);
                        } else {
/* 106 */                   iloI0lOlll12.I00io1l();
                        }
/* 109 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 111 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 114 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 116 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 119 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 123 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 125 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 128 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 131 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 133 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 136 */               OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 246 */               Oo0i1oIIoOO.I00000oOI("Settings", null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol02)).I00000oIO.I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol02)).I00000oOI.I000o00OoI0I, iloI0lOlll12, 6, 0, 131066);
/* 249 */               IloI0lOlll1 iloI0lOlll13 = iloI0lOlll12;
/* 251 */               int i2 = oliiOl02.I0000oI00;
/* 253 */               boolean z3 = oliiOl02.I00000oOI;
/* 255 */               if (i2 > 1) {
/* 260 */                   iloI0lOlll13.I00i01iIIliI(-2043223101);
/* 267 */                   O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 277 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll13, 54);
/* 283 */                   int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 287 */                   OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 291 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000oI00);
/* 295 */                   iloI0lOlll13.I00i0oil();
/* 300 */                   if (iloI0lOlll13.I00O10llo) {
/* 302 */                       iloi111 = iloi1112;
/* 304 */                       iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 308 */                       iloi111 = iloi1112;
/* 310 */                       iloI0lOlll13.I00io1l();
                            }
/* 313 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 316 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 319 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 324 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 356 */                   Iloi111 iloi1113 = iloi111;
/* 401 */                   z = z3;
/* 414 */                   olO1iIi1ol0 = olO1iIi1ol02;
/* 418 */                   Oo0i1oIIoOO.I00000oOI("Voice", null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol02)).I00000oOI.I000iOII, iloI0lOlll13, 6, 0, 131070);
/* 426 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 432 */                   int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 436 */                   OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 440 */                   O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 444 */                   iloI0lOlll13.I00i0oil();
/* 449 */                   if (iloI0lOlll13.I00O10llo) {
/* 451 */                       iloI0lOlll13.I000l1(iloi1113);
                            } else {
/* 455 */                       iloI0lOlll13.I00io1l();
                            }
/* 458 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 461 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI3);
/* 464 */                   IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I3, iloI0lOlll13);
/* 469 */                   li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 472 */                   Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
/* 476 */                   IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 478 */                   if (objI00O0i0ii == iOO0o0I1l) {
/* 484 */                       Ol0ioi ol0ioi = new Ol0ioi(10);
/* 487 */                       oI10i0Il = oI10i0Il2;
/* 489 */                       ol0ioi.I00iiI = oI10i0Il;
/* 491 */                       VarHandle.storeStoreFence();
/* 494 */                       iloI0lOlll13.I00iio(ol0ioi);
                                obj4 = ol0ioi;
                            } else {
/* 498 */                       oI10i0Il = oI10i0Il2;
                                obj4 = objI00O0i0ii;
                            }
/* 509 */                   I0iII1i10I i0iII1i10I = new I0iII1i10I(23);
/* 512 */                   oliiOl0 = oliiOl02;
/* 514 */                   i0iII1i10I.I00iiI = oliiOl0;
/* 516 */                   VarHandle.storeStoreFence();
/* 542 */                   iOiO0o0oi.I0000Il00O((IllOOo00lI) obj4, null, !z, null, null, null, null, iiioOl1O.I00000oOI(-1378023691, i0iII1i10I, iloI0lOlll13), iloI0lOlll13, 805306374, 506);
/* 552 */                   boolean zBooleanValue = ((Boolean) oI10i0Il.getValue()).booleanValue();
/* 556 */                   Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
/* 560 */                   int i3 = 11;
                            Object obj5 = objI00O0i0ii2;
/* 562 */                   if (objI00O0i0ii2 == iOO0o0I1l) {
/* 566 */                       Ol0ioi ol0ioi2 = new Ol0ioi(11);
/* 569 */                       ol0ioi2.I00iiI = oI10i0Il;
/* 571 */                       VarHandle.storeStoreFence();
/* 574 */                       iloI0lOlll13.I00iio(ol0ioi2);
                                obj5 = ol0ioi2;
                            }
/* 581 */                   I1iO0OloOl i1iO0OloOl = new I1iO0OloOl(i3);
/* 584 */                   i1iO0OloOl.I00iiI = oliiOl0;
/* 588 */                   i1iO0OloOl.I00iiO = function12;
/* 590 */                   i1iO0OloOl.I00iio = oI10i0Il;
/* 592 */                   VarHandle.storeStoreFence();
/* 618 */                   iOIliO1I1i.I00000oIO(zBooleanValue, (IllOOo00lI) obj5, null, 0L, null, null, null, 0L, 0.0f, iiioOl1O.I00000oOI(1230513570, i1iO0OloOl, iloI0lOlll13), iloI0lOlll13, 48);
/* 621 */                   IloI0lOlll1 iloI0lOlll14 = iloI0lOlll13;
/* 623 */                   i = 1;
/* 624 */                   Oi010OO0.I001l0I00(iloI0lOlll14, true, true, false);
                            iloI0lOlll1 = iloI0lOlll14;
                        } else {
/* 629 */                   oliiOl0 = oliiOl02;
/* 630 */                   i = 1;
/* 631 */                   olO1iIi1ol0 = olO1iIi1ol02;
/* 633 */                   z = z3;
/* 639 */                   iloI0lOlll13.I00i01iIIliI(-2042097770);
/* 642 */                   iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll1 = iloI0lOlll13;
                        }
/* 696 */               IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 721 */               Oo0i1oIIoOO.I00000oOI(IlIi0I0.I000lI("Speed: ", String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(oliiOl0.I0000O)}, i)), "×"), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(olO1iIi1ol0)).I00000oOI.I000iOII, iloI0lOlll15, 0, 0, 131070);
/* 748 */               Ol10ooO01IO.I00000oIO(oliiOl0.I0000O, function1, null, !z, lIiioliIlo.I0001Ioi1lo(0.5f, 2.0f), 0, null, null, null, iloI0lOlll15, 0, 484);
/* 751 */               iloI0lOlll15.I0010I0i(true);
                    } else {
/* 755 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 758 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:114:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x03d2  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x03eb  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0452  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x04de  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x0558  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x0bb3  */
                /* JADX WARN: Type inference failed for: r6v5, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r9v18, types: [OOI1lioOOo0] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float refreshRate;
                    Object obj4;
                    boolean z;
                    List list;
                    IOO0o0I1l iOO0o0I1l;
                    Object obj5;
                    IloI0lOlll1 iloI0lOlll1;
                    IloI0lOlll1 iloI0lOlll12;
/* 3 */             int i = this.I00iOIl;
/* 5 */             II1oili iI1oili = II1oili.I00000oIO;
/* 7 */             I1IiOIiOli i1IiOIiOli = I1IiooiI1IlO.I0000Il00O;
/* 9 */             IOIIoiI1oi1 iOIIoiI1oi1 = iO0ioilo.I00000oIO;
/* 14 */            boolean z2 = false;
/* 17 */            Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 19 */            O1ooiI111i o1ooiI111iI0000Il00O = O1ooIo101ll.I00000oIO;
/* 21 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 23 */            IOO0o0I1l iOO0o0I1l2 = IOl11li.I00000oIO;
/* 25 */            boolean z3 = true;
                    switch (i) {
                        case 0:
/* 3172 */                  OIo1Oi1l1lI oIo1Oi1l1lI = (OIo1Oi1l1lI) this.I00iiO;
/* 3176 */                  OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00iio;
/* 3180 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 3184 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 3192 */                  IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj2;
/* 3198 */                  ((Integer) obj3).getClass();
/* 3201 */                  int iI000II = oIooi1iOiOol.I000II();
/* 3205 */                  Object objI00O0i0ii = iloI0lOlll13.I00O0i0ii();
                            Object obj6 = objI00O0i0ii;
/* 3209 */                  if (objI00O0i0ii == iOO0o0I1l2) {
/* 3215 */                      I1ol0OoiOI1o i1ol0OoiOI1o = new I1ol0OoiOI1o(24);
/* 3218 */                      i1ol0OoiOI1o.I00iiI = oI10i0Il;
/* 3220 */                      VarHandle.storeStoreFence();
/* 3223 */                      iloI0lOlll13.I00iio(i1ol0OoiOI1o);
                                obj6 = i1ol0OoiOI1o;
                            }
/* 3231 */                  IiI0O1Io iiI0O1IoI00000oOI = OIoIol.I00000oOI(iI000II, (IllOOo00lI) obj6, iloI0lOlll13, 384, 2);
/* 3235 */                  Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                            Object obj7 = objI00O0i0ii2;
/* 3239 */                  if (objI00O0i0ii2 == iOO0o0I1l2) {
/* 3243 */                      OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 3247 */                      iloI0lOlll13.I00iio(oIooliIO0I00000oIO);
                                obj7 = oIooliIO0I00000oIO;
                            }
/* 3250 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) obj7;
/* 3252 */                  IlIl1Io0lii1 ilIl1Io0lii1 = Ol0iOOO0.I0000Il00O;
/* 3266 */                  O1ooiI111i o1ooiI111iI000OiO = iO01II.I000OiO(ilIl1Io0lii1, 0.0f, oIo1Oi1l1lI.I0000O(), 0.0f, 0.0f, 13);
/* 3275 */                  O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 3281 */                  int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 3285 */                  OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 3289 */                  O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000OiO);
/* 3295 */                  IOl0oi0lOl1.I000lI.getClass();
/* 3298 */                  iloI0lOlll13.I00i0oil();
/* 3303 */                  if (iloI0lOlll13.I00O10llo) {
/* 3305 */                      iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 3309 */                      iloI0lOlll13.I00io1l();
                            }
/* 3314 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 3319 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll13, oO0lO0l0I000lI);
/* 3328 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll13, Integer.valueOf(iHashCode));
/* 3331 */                  li01Ooiio01.I00000oOI(iloI0lOlll13);
/* 3336 */                  li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 3345 */                  boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 3358 */                  O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(ilIl1Io0lii1, IOOiio0i.I0000Il00O(0.95f, IOOiio0i.I00000oOI), iOIIoiI1oi1);
/* 3365 */                  IloIllo1i0 iloIllo1i0 = new IloIllo1i0(2);
/* 3368 */                  iloIllo1i0.I00iiI = oI10i0Il;
/* 3370 */                  iloIllo1i0.I00iiO = iiI0O1IoI00000oOI;
/* 3372 */                  VarHandle.storeStoreFence();
/* 3404 */                  l1loiOIllii.I00000oIO(48, 16124, null, null, null, iiioOl1O.I00000oOI(96976299, iloIllo1i0, iloI0lOlll13), iloI0lOlll13, o1ooiI111iI00000oOI, null, null, iiI0O1IoI00000oOI, null, null, zBooleanValue);
/* 3409 */                  int i2 = IoOo1I0lIl.I00000oIO;
/* 3435 */                  IoOo11l0iI ioOo11l0iII00000oOI = IoOo1I0lIl.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010I0i, 0L, 0L, 0L, iloI0lOlll13, 14);
/* 3449 */                  O1ooiI111i o1ooiI111iI00000oOI2 = iI1oili.I00000oOI(iO0100loIol.I00000oOI(o1ooiI111iI0000Il00O, -8.0f, 8.0f), i1O01oOIoI0I.I00ilI0I1);
/* 3453 */                  Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                            Object obj8 = objI00O0i0ii3;
/* 3457 */                  if (objI00O0i0ii3 == iOO0o0I1l2) {
/* 3463 */                      I1ol0OoiOI1o i1ol0OoiOI1o2 = new I1ol0OoiOI1o(25);
/* 3466 */                      i1ol0OoiOI1o2.I00iiI = oI10i0Il2;
/* 3468 */                      VarHandle.storeStoreFence();
/* 3471 */                      iloI0lOlll13.I00iio(i1ol0OoiOI1o2);
                                obj8 = i1ol0OoiOI1o2;
                            }
/* 3491 */                  iIo1101O.I00000oIO((IllOOo00lI) obj8, o1ooiI111iI00000oOI2, false, ioOo11l0iII00000oOI, null, i1OlIOi.I00000oIO, iloI0lOlll13, 1572870, 52);
/* 3495 */                  iloI0lOlll13.I0010I0i(true);
/* 3498 */                  return ooiIlOl1iI;
                        case 1:
/* 2722 */                  O0llioI1 o0llioI1 = (O0llioI1) this.I00iiO;
/* 2726 */                  O1ooiI111i o1ooiI111i = (O1ooiI111i) this.I00iio;
/* 2730 */                  O0liioil o0liioil = (O0liioil) this.I00ilI0I1;
/* 2734 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 2738 */                  OiIii0 oiIii0 = (OiIii0) obj;
/* 2742 */                  ?? r6 = (IloI0lOlll1) obj2;
/* 2748 */                  ((Integer) obj3).getClass();
/* 2751 */                  Object objI00O0i0ii4 = r6.I00O0i0ii();
                            Object obj9 = objI00O0i0ii4;
/* 2755 */                  if (objI00O0i0ii4 == iOO0o0I1l2) {
/* 2763 */                      IloOi11lo iloOi11lo = new IloOi11lo(29);
/* 2766 */                      iloOi11lo.I00iiI = oI10i0Il4;
/* 2768 */                      VarHandle.storeStoreFence();
/* 2771 */                      O0liI0l o0liI0l = new O0liI0l();
/* 2774 */                      o0liI0l.I00000oIO = oiIii0;
/* 2776 */                      o0liI0l.I00000oOI = iloOi11lo;
/* 2778 */                      long[] jArr = OiO10oio.I00000oIO;
/* 2785 */                      o0liI0l.I0000Il00O = new OI10I1IoI0Ol();
/* 2787 */                      VarHandle.storeStoreFence();
/* 2790 */                      r6.I00iio(o0liI0l);
                                obj9 = o0liI0l;
                            }
/* 2793 */                  O0liI0l o0liI0l2 = (O0liI0l) obj9;
/* 2795 */                  Object objI00O0i0ii5 = r6.I00O0i0ii();
                            Object obj10 = objI00O0i0ii5;
/* 2799 */                  if (objI00O0i0ii5 == iOO0o0I1l2) {
/* 2807 */                      IoloOio0I ioloOio0I = new IoloOio0I(18);
/* 2810 */                      ioloOio0I.I00iiI = o0liI0l2;
/* 2812 */                      OI0o11I1 oI0o11I1 = OIOi1iO01.I00000oIO;
/* 2819 */                      ioloOio0I.I00iiO = new OI0o11I1();
/* 2821 */                      VarHandle.storeStoreFence();
/* 2824 */                      Oli1o0i oli1o0i = new Oli1o0i(ioloOio0I);
/* 2827 */                      r6.I00iio(oli1o0i);
                                obj10 = oli1o0i;
                            }
/* 2830 */                  Oli1o0i oli1o0i2 = (Oli1o0i) obj10;
/* 2832 */                  int i3 = 13;
/* 2834 */                  if (o0llioI1 != null) {
/* 2839 */                      r6.I00i01iIIliI(1743490539);
/* 2845 */                      r6.I00i01iIIliI(887527095);
/* 2848 */                      String str = Build.FINGERPRINT;
/* 2850 */                      if (str == null || !str.equals("robolectric")) {
/* 2891 */                          r6.I00i01iIIliI(1345729441);
/* 2900 */                          View view = (View) r6.I000iOII(I0lloOI0oio.I0001Ioi1lo);
/* 2902 */                          boolean zI000II = r6.I000II(view);
/* 2906 */                          Object objI00O0i0ii6 = r6.I00O0i0ii();
/* 2910 */                          if (zI000II || objI00O0i0ii6 == iOO0o0I1l2) {
/* 2917 */                              Object tag = view.getTag(R.id.compose_prefetch_scheduler);
/* 2926 */                              I0oo0lloI i0oo0lloI = tag instanceof OOI1lioOOo0 ? (OOI1lioOOo0) tag : null;
/* 2928 */                              if (i0oo0lloI == null) {
/* 2932 */                                  i0oo0lloI = new I0oo0lloI();
/* 2935 */                                  i0oo0lloI.I00iOIl = view;
/* 2950 */                                  i0oo0lloI.I00iiI = new PriorityQueue(11, new I0oloIO0(0));
/* 2956 */                                  i0oo0lloI.I00iio = Choreographer.getInstance();
/* 2963 */                                  i0oo0lloI.I00ilI0I1 = new I0oo0IlI01li();
/* 2971 */                                  if (I0oo0lloI.I00ioIO == 0) {
/* 2973 */                                      Display display = view.getDisplay();
/* 2981 */                                      if (view.isInEditMode() || display == null) {
/* 2996 */                                          refreshRate = 60.0f;
/* 3003 */                                          I0oo0lloI.I00ioIO = (long) (1.0E9f / refreshRate);
                                                } else {
/* 2985 */                                          refreshRate = display.getRefreshRate();
/* 2993 */                                          if (refreshRate < 30.0f) {
                                                    }
/* 3003 */                                          I0oo0lloI.I00ioIO = (long) (1.0E9f / refreshRate);
                                                }
                                            }
/* 3005 */                                  view.addOnAttachStateChangeListener(i0oo0lloI);
/* 3012 */                                  if (view.isAttachedToWindow()) {
/* 3015 */                                      i0oo0lloI.I00ilO0 = true;
                                            }
/* 3017 */                                  VarHandle.storeStoreFence();
/* 3020 */                                  view.setTag(R.id.compose_prefetch_scheduler, i0oo0lloI);
                                        }
/* 3023 */                              objI00O0i0ii6 = i0oo0lloI;
/* 3024 */                              r6.I00iio(objI00O0i0ii6);
                                    }
/* 3028 */                          obj4 = (OOI1lioOOo0) objI00O0i0ii6;
/* 3030 */                          z = false;
/* 3031 */                          r6.I0010I0i(false);
                                } else {
/* 2863 */                          r6.I00i01iIIliI(1345548711);
/* 2866 */                          Object objI00O0i0ii7 = r6.I00O0i0ii();
/* 2870 */                          if (objI00O0i0ii7 == iOO0o0I1l2) {
/* 2874 */                              objI00O0i0ii7 = new OOI1o1iioi();
/* 2877 */                              r6.I00iio(objI00O0i0ii7);
                                    }
/* 2880 */                          obj4 = (OOI1o1iioi) objI00O0i0ii7;
/* 2882 */                          z = false;
/* 2883 */                          r6.I0010I0i(false);
                                }
/* 3034 */                      r6.I0010I0i(z);
/* 3037 */                      Object[] objArr = {o0llioI1, o0liI0l2, oli1o0i2, obj4};
/* 3059 */                      boolean zI000II2 = r6.I000II(o0llioI1) | r6.I000OOo1O(o0liI0l2) | r6.I000OOo1O(oli1o0i2) | r6.I000OOo1O(obj4);
/* 3060 */                      Object objI00O0i0ii8 = r6.I00O0i0ii();
                                Object obj11 = objI00O0i0ii8;
/* 3064 */                      if (zI000II2 || objI00O0i0ii8 == iOO0o0I1l2) {
/* 3070 */                          I0O1IO i0o1io = new I0O1IO(i3);
/* 3073 */                          i0o1io.I00iiI = o0llioI1;
/* 3075 */                          i0o1io.I00iiO = o0liI0l2;
/* 3077 */                          i0o1io.I00iio = oli1o0i2;
/* 3079 */                          i0o1io.I00ilI0I1 = obj4;
/* 3081 */                          VarHandle.storeStoreFence();
/* 3084 */                          r6.I00iio(i0o1io);
                                    obj11 = i0o1io;
                                }
/* 3089 */                      iIO0iiOiOl0l.I0000Il00O(objArr, (Function1) obj11, r6);
/* 3093 */                      r6.I0010I0i(false);
                            } else {
/* 3101 */                      r6.I00i01iIIliI(1744076749);
/* 3104 */                      r6.I0010I0i(false);
                            }
/* 3107 */                  int i4 = O0lllIllOOoo.I00000oIO;
/* 3109 */                  if (o0llioI1 != null) {
/* 3113 */                      OoIOoi ooIOoi = new OoIOoi();
/* 3116 */                      ooIOoi.I00000oIO = o0llioI1;
/* 3118 */                      VarHandle.storeStoreFence();
/* 3121 */                      O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(ooIOoi);
/* 3125 */                      if (o1ooiI111iI0000O != null) {
/* 3128 */                          o1ooiI111i = o1ooiI111iI0000O;
                                }
                            }
/* 3137 */                  boolean zI000II3 = r6.I000II(o0liI0l2) | r6.I000II(o0liioil);
/* 3138 */                  Object objI00O0i0ii9 = r6.I00O0i0ii();
                            Object obj12 = objI00O0i0ii9;
/* 3142 */                  if (zI000II3 || objI00O0i0ii9 == iOO0o0I1l2) {
/* 3148 */                      Ilo0lI ilo0lI = new Ilo0lI(i3);
/* 3151 */                      ilo0lI.I00iiI = o0liI0l2;
/* 3153 */                      ilo0lI.I00iiO = o0liioil;
/* 3155 */                      VarHandle.storeStoreFence();
/* 3158 */                      r6.I00iio(ilo0lI);
                                obj12 = ilo0lI;
                            }
/* 3165 */                  Oli1lii10.I00000oOI(oli1o0i2, o1ooiI111i, (IlliIl1l11O) obj12, r6, 8);
/* 3168 */                  return ooiIlOl1iI;
                        case 2:
/* 2428 */                  IO1ii1lol0Il iO1ii1lol0Il = (IO1ii1lol0Il) this.I00iiO;
/* 2432 */                  Ii0110 ii0110 = (Ii0110) this.I00iio;
/* 2436 */                  Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ilI0I1;
/* 2440 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00iiI;
/* 2448 */                  IloI0lOlll1 iloI0lOlll14 = (IloI0lOlll1) obj2;
/* 2454 */                  int iIntValue = ((Integer) obj3).intValue();
/* 2474 */                  if (iloI0lOlll14.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 2476 */                      IlIl1Io0lii1 ilIl1Io0lii12 = Ol0iOOO0.I0000Il00O;
/* 2481 */                      O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 2487 */                      int iHashCode2 = Long.hashCode(iloI0lOlll14.I00OI1);
/* 2491 */                      OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll14.I000lI();
/* 2495 */                      O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll14, ilIl1Io0lii12);
/* 2501 */                      IOl0oi0lOl1.I000lI.getClass();
/* 2504 */                      iloI0lOlll14.I00i0oil();
/* 2509 */                      if (iloI0lOlll14.I00O10llo) {
/* 2511 */                          iloI0lOlll14.I000l1(iloi111);
                                } else {
/* 2515 */                          iloI0lOlll14.I00io1l();
                                }
/* 2520 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll14, o1iOIl0o10I0000Il00O2);
/* 2525 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll14, oO0lO0l0I000lI2);
/* 2534 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll14, Integer.valueOf(iHashCode2));
/* 2537 */                      li01Ooiio01.I00000oOI(iloI0lOlll14);
/* 2542 */                      li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll14, o1ooiI111iI0000Il00O3);
/* 2571 */                      ill0oOiOO0Ii.I00000oIO(ilIl1Io0lii12, iO1ii1lol0Il.I000II, iO1ii1lol0Il.I000O01llI0, true, true, null, null, null, iloI0lOlll14, 27654, 480);
/* 2576 */                      int i5 = IoOo1I0lIl.I00000oIO;
/* 2578 */                      OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 2600 */                      IoOo11l0iI ioOo11l0iII00000oOI2 = IoOo1I0lIl.I00000oOI(((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I00IO1, 0L, 0L, 0L, iloI0lOlll14, 14);
/* 2634 */                      II1IOloil iI1IOloil = new II1IOloil(IoOo1I0lIl.I0000Il00O(true, iloI0lOlll14).I00000oIO, new OlI00IIlOO(IOOiio0i.I0000Il00O(0.5f, ((O1OoiOIi1ooi) iloI0lOlll14.I000iOII(olO1iIi1ol0)).I00000oIO.I001lllioOl)));
/* 2650 */                      O1ooiI111i o1ooiI111iI000OiO2 = iO01II.I000OiO(iI1oili.I00000oOI(o1ooiI111iI0000Il00O, i1O01oOIoI0I.I00ilI0I1), 0.0f, 8.0f, 8.0f, 0.0f, 9);
/* 2662 */                      boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(ii0110) | iloI0lOlll14.I000II(ol010000lo00);
/* 2663 */                      Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
                                Object obj13 = objI00O0i0ii10;
/* 2667 */                      if (zI000OOo1O || objI00O0i0ii10 == iOO0o0I1l2) {
/* 2674 */                          II00oOO11l iI00oOO11l = new II00oOO11l(1);
/* 2677 */                          iI00oOO11l.I00iiI = ii0110;
/* 2679 */                          iI00oOO11l.I00iiO = ol010000lo00;
/* 2681 */                          iI00oOO11l.I00iio = oI10i0Il5;
/* 2683 */                          VarHandle.storeStoreFence();
/* 2686 */                          iloI0lOlll14.I00iio(iI00oOO11l);
                                    obj13 = iI00oOO11l;
                                }
/* 2707 */                      iIo1101O.I0000Il00O((IllOOo00lI) obj13, o1ooiI111iI000OiO2, false, null, ioOo11l0iII00000oOI2, iI1IOloil, i1iIiIii.I0000Il00O, iloI0lOlll14, 12582912, 76);
/* 2711 */                      iloI0lOlll14.I0010I0i(true);
                            } else {
/* 2716 */                      iloI0lOlll14.I00OilO00Il();
                            }
/* 2719 */                  return ooiIlOl1iI;
                        case 3:
/* 2161 */                  String str2 = (String) this.I00iiO;
/* 2165 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiI;
/* 2169 */                  List list2 = (List) this.I00iio;
/* 2173 */                  Function1 function1 = (Function1) this.I00ilI0I1;
/* 2177 */                  Il1ii01 il1ii01 = (Il1ii01) obj;
/* 2181 */                  IloI0lOlll1 iloI0lOlll15 = (IloI0lOlll1) obj2;
/* 2187 */                  int iIntValue2 = ((Integer) obj3).intValue();
/* 2193 */                  if ((iIntValue2 & 6) == 0) {
/* 2213 */                      iIntValue2 |= (iIntValue2 & 8) == 0 ? iloI0lOlll15.I000II(il1ii01) : iloI0lOlll15.I000OOo1O(il1ii01) ? 4 : 2;
                            }
/* 2229 */                  if (iloI0lOlll15.I00OIl(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
/* 2231 */                      if (str2 == null) {
/* 2233 */                          str2 = "";
                                }
/* 2235 */                      String str3 = str2;
/* 2245 */                      O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(Il1ii01.I00000oOI(il1ii01, "PrimaryEditable"), 1.0f);
/* 2249 */                      Object objI00O0i0ii11 = iloI0lOlll15.I00O0i0ii();
                                Object obj14 = objI00O0i0ii11;
/* 2254 */                      if (objI00O0i0ii11 == iOO0o0I1l2) {
/* 2258 */                          I01OoIoio00O i01OoIoio00O = new I01OoIoio00O(6);
/* 2261 */                          iloI0lOlll15.I00iio(i01OoIoio00O);
                                    obj14 = i01OoIoio00O;
                                }
/* 2266 */                      Function1 function12 = (Function1) obj14;
/* 2272 */                      I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(8);
/* 2275 */                      i0Il1IoilolI.I00iiI = oI10i0Il6;
/* 2277 */                      VarHandle.storeStoreFence();
/* 2329 */                      l1liIOil0i1o.I00000oOI(str3, function12, o1ooiI111iI0000oI00, false, true, null, i1O1i1.I000OOo1O, null, null, iiioOl1O.I00000oOI(84129267, i0Il1IoilolI, iloI0lOlll15), null, false, null, null, null, false, 0, 0, null, null, iloI0lOlll15, 806903856, 0, 8388008);
/* 2340 */                      boolean zBooleanValue2 = ((Boolean) oI10i0Il6.getValue()).booleanValue();
/* 2344 */                      Object objI00O0i0ii12 = iloI0lOlll15.I00O0i0ii();
                                Object obj15 = objI00O0i0ii12;
/* 2348 */                      if (objI00O0i0ii12 == iOO0o0I1l2) {
/* 2354 */                          I0Il0000oli i0Il0000oli = new I0Il0000oli(15);
/* 2357 */                          i0Il0000oli.I00iiI = oI10i0Il6;
/* 2359 */                          VarHandle.storeStoreFence();
/* 2362 */                          iloI0lOlll15.I00iio(i0Il0000oli);
                                    obj15 = i0Il0000oli;
                                }
/* 2372 */                      I0O0O11i0lio i0O0O11i0lio = new I0O0O11i0lio(0);
/* 2375 */                      i0O0O11i0lio.I00iiI = list2;
/* 2377 */                      i0O0O11i0lio.I00iiO = function1;
/* 2379 */                      i0O0O11i0lio.I00iio = oI10i0Il6;
/* 2381 */                      VarHandle.storeStoreFence();
/* 2415 */                      il1ii01.I00000oIO(zBooleanValue2, (IllOOo00lI) obj15, null, null, false, null, 0L, 0.0f, iiioOl1O.I00000oOI(-1328556084, i0O0O11i0lio, iloI0lOlll15), iloI0lOlll15, 48, 6 | ((iIntValue2 << 3) & 112));
                            } else {
/* 2421 */                      iloI0lOlll15.I00OilO00Il();
                            }
/* 2424 */                  return ooiIlOl1iI;
                        case 4:
/* 1394 */                  List list3 = (List) this.I00iiO;
/* 1398 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 1402 */                  Conversation conversation = (Conversation) this.I00iiI;
/* 1408 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilI0I1;
/* 1416 */                  IloI0lOlll1 iloI0lOlll16 = (IloI0lOlll1) obj2;
/* 1422 */                  int iIntValue3 = ((Integer) obj3).intValue();
/* 1442 */                  if (iloI0lOlll16.I00OIl(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
/* 1445 */                      O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(o1ooiI111iI0000Il00O, 16.0f, 0.0f, 2);
/* 1449 */                      II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 1452 */                      IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll16, 0);
/* 1458 */                      int iHashCode3 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 1462 */                      OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll16.I000lI();
/* 1466 */                      O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI000O01llI0);
/* 1472 */                      IOl0oi0lOl1.I000lI.getClass();
/* 1475 */                      iloI0lOlll16.I00i0oil();
/* 1480 */                      if (iloI0lOlll16.I00O10llo) {
/* 1482 */                          iloI0lOlll16.I000l1(iloi111);
                                } else {
/* 1486 */                          iloI0lOlll16.I00io1l();
                                }
/* 1489 */                      IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 1491 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll16, iOOlo1O01OI00000oIO);
/* 1494 */                      IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 1496 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll16, oO0lO0l0I000lI3);
/* 1499 */                      Integer numValueOf = Integer.valueOf(iHashCode3);
/* 1503 */                      IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 1505 */                      li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll16, numValueOf);
/* 1508 */                      li01Ooiio01.I00000oOI(iloI0lOlll16);
/* 1511 */                      IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 1513 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll16, o1ooiI111iI0000Il00O4);
/* 1518 */                      O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(o1ooiI111iI0000Il00O, 1.0f);
/* 1530 */                      OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, i1O01oOIoI0I.I00lli11, iloI0lOlll16, 54);
/* 1538 */                      int iHashCode4 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 1542 */                      OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll16.I000lI();
/* 1546 */                      O1ooiI111i o1ooiI111iI0000Il00O5 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI0000oI002);
/* 1550 */                      iloI0lOlll16.I00i0oil();
/* 1557 */                      if (iloI0lOlll16.I00O10llo) {
/* 1559 */                          iloI0lOlll16.I000l1(iloi111);
                                } else {
/* 1563 */                          iloI0lOlll16.I00io1l();
                                }
/* 1566 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll16, oiI1iiIl1Oi0I00000oIO);
/* 1569 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll16, oO0lO0l0I000lI4);
/* 1572 */                      IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll16, iOioOOi0I3, iloI0lOlll16);
/* 1575 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll16, o1ooiI111iI0000Il00O5);
/* 1583 */                      O0io1O o0io1O = new O0io1O(1.0f, true);
/* 1587 */                      IOOlo1O01O iOOlo1O01OI00000oIO2 = IOOlio0Io0.I00000oIO(i1IiOIiOli, iI0IlloOiO0i, iloI0lOlll16, 0);
/* 1593 */                      int iHashCode5 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 1597 */                      OO0lO0l0 oO0lO0l0I000lI5 = iloI0lOlll16.I000lI();
/* 1601 */                      O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o0io1O);
/* 1605 */                      iloI0lOlll16.I00i0oil();
/* 1610 */                      if (iloI0lOlll16.I00O10llo) {
/* 1612 */                          iloI0lOlll16.I000l1(iloi111);
                                } else {
/* 1616 */                          iloI0lOlll16.I00io1l();
                                }
/* 1619 */                      li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll16, iOOlo1O01OI00000oIO2);
/* 1622 */                      li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll16, oO0lO0l0I000lI5);
/* 1625 */                      IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll16, iOioOOi0I3, iloI0lOlll16);
/* 1628 */                      li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll16, o1ooiI111iI0000Il00O6);
/* 1631 */                      String title = conversation.getTitle();
/* 1635 */                      OlO1iIi1ol0 olO1iIi1ol02 = O1OoilIO.I00000oOI;
/* 1688 */                      Oo0i1oIIoOO.I00000oOI(title, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol02)).I00000oOI.I000O01llI0, iloI0lOlll16, 0, 24960, 110590);
/* 1699 */                      if (conversation.getModelName().length() > 0) {
/* 1704 */                          iloI0lOlll16.I00i01iIIliI(-259298596);
/* 1772 */                          Oo0i1oIIoOO.I00000oOI(conversation.getModelName(), null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol02)).I00000oIO.I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol02)).I00000oOI.I000l1, iloI0lOlll16, 0, 0, 131066);
/* 1776 */                          iloI0lOlll16.I0010I0i(false);
                                } else {
/* 1785 */                          iloI0lOlll16.I00i01iIIliI(-259052859);
/* 1788 */                          iloI0lOlll16.I0010I0i(false);
                                }
/* 1792 */                      iloI0lOlll16.I0010I0i(true);
/* 1803 */                      if (list3.isEmpty()) {
/* 1882 */                          list = list3;
/* 1888 */                          iloI0lOlll16.I00i01iIIliI(-683265477);
/* 1891 */                          iloI0lOlll16.I0010I0i(false);
                                } else {
/* 1808 */                          iloI0lOlll16.I00i01iIIliI(-683475936);
/* 1820 */                          list = list3;
/* 1826 */                          boolean zI000II4 = iloI0lOlll16.I000II(illiIl1l11O) | iloI0lOlll16.I000II(conversation) | iloI0lOlll16.I000OOo1O(list);
/* 1827 */                          Object objI00O0i0ii13 = iloI0lOlll16.I00O0i0ii();
                                    Object obj16 = objI00O0i0ii13;
/* 1831 */                          if (zI000II4 || objI00O0i0ii13 == iOO0o0I1l2) {
/* 1839 */                              I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(10);
/* 1842 */                              i0iI0O1IoIoI.I00iiI = illiIl1l11O;
/* 1844 */                              i0iI0O1IoIoI.I00iiO = conversation;
/* 1846 */                              i0iI0O1IoIoI.I00iio = list;
/* 1848 */                              VarHandle.storeStoreFence();
/* 1851 */                              iloI0lOlll16.I00iio(i0iI0O1IoIoI);
                                        obj16 = i0iI0O1IoIoI;
                                    }
/* 1874 */                          iIo1101O.I00000oIO((IllOOo00lI) obj16, null, false, null, null, i1OiooO.I00100o1O0lo, iloI0lOlll16, 1572864, 62);
/* 1878 */                          iloI0lOlll16.I0010I0i(false);
                                }
/* 1910 */                      iIo1101O.I00000oIO(illOOo00lI, null, false, null, null, i1OiooO.I0010I0i, iloI0lOlll16, 1572864, 62);
/* 1914 */                      iloI0lOlll16.I0010I0i(true);
/* 1925 */                      lOO1OIO00.I00000oIO(iloI0lOlll16, Ol0iOOO0.I000II(o1ooiI111iI0000Il00O, 12.0f));
/* 1932 */                      if (list.isEmpty()) {
/* 1937 */                          iloI0lOlll16.I00i01iIIliI(-1377961384);
/* 1948 */                          O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooiI111iI0000Il00O, 1.0f), 200.0f);
/* 1955 */                          O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 1961 */                          int iHashCode6 = Long.hashCode(iloI0lOlll16.I00OI1);
/* 1965 */                          OO0lO0l0 oO0lO0l0I000lI6 = iloI0lOlll16.I000lI();
/* 1969 */                          O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(iloI0lOlll16, o1ooiI111iI000II);
/* 1973 */                          iloI0lOlll16.I00i0oil();
/* 1978 */                          if (iloI0lOlll16.I00O10llo) {
/* 1980 */                              iloI0lOlll16.I000l1(iloi111);
                                    } else {
/* 1984 */                              iloI0lOlll16.I00io1l();
                                    }
/* 1987 */                          li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll16, o1iOIl0o10I0000Il00O3);
/* 1990 */                          li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll16, oO0lO0l0I000lI6);
/* 1993 */                          IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll16, iOioOOi0I3, iloI0lOlll16);
/* 1996 */                          li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll16, o1ooiI111iI0000Il00O7);
/* 2052 */                          Oo0i1oIIoOO.I00000oOI("Loading messages...", null, ((O1OoiOIi1ooi) iloI0lOlll16.I000iOII(olO1iIi1ol02)).I00000oIO.I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll16, 6, 0, 262138);
/* 2056 */                          iloI0lOlll16.I0010I0i(true);
/* 2060 */                          iloI0lOlll16.I0010I0i(false);
                                } else {
/* 2068 */                          iloI0lOlll16.I00i01iIIliI(-1377517557);
/* 2079 */                          O1ooiI111i o1ooiI111iI000II2 = Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooiI111iI0000Il00O, 1.0f), 400.0f);
/* 2085 */                          I1IioI i1IioII0000oI00 = I1IiooiI1IlO.I0000oI00(8.0f);
/* 2093 */                          OIo1i1 oIo1i1I00000oOI = iO01II.I00000oOI(0.0f, 0.0f, 32.0f, 7);
/* 2097 */                          boolean zI000OOo1O2 = iloI0lOlll16.I000OOo1O(list);
/* 2101 */                          Object objI00O0i0ii14 = iloI0lOlll16.I00O0i0ii();
                                    Object obj17 = objI00O0i0ii14;
/* 2105 */                          if (zI000OOo1O2 || objI00O0i0ii14 == iOO0o0I1l2) {
/* 2112 */                              IO1IOO10oI0 iO1IOO10oI0 = new IO1IOO10oI0(0);
/* 2115 */                              iO1IOO10oI0.I00iiI = list;
/* 2117 */                              VarHandle.storeStoreFence();
/* 2120 */                              iloI0lOlll16.I00iio(iO1IOO10oI0);
                                        obj17 = iO1IOO10oI0;
                                    }
/* 2143 */                          l0oIiiI1O0o.I00000oIO(o1ooiI111iI000II2, null, oIo1i1I00000oOI, i1IioII0000oI00, null, null, false, null, (Function1) obj17, iloI0lOlll16, 24966, 490);
/* 2147 */                          iloI0lOlll16.I0010I0i(false);
                                }
/* 2151 */                      iloI0lOlll16.I0010I0i(true);
                            } else {
/* 2155 */                      iloI0lOlll16.I00OilO00Il();
                            }
/* 2158 */                  return ooiIlOl1iI;
                        case 5:
/* 364 */                   Conversation conversation2 = (Conversation) this.I00iiO;
/* 368 */                   SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.I00iio;
/* 372 */                   Function1 function13 = (Function1) this.I00iiI;
/* 376 */                   Function1 function14 = (Function1) this.I00ilI0I1;
/* 384 */                   IloI0lOlll1 iloI0lOlll17 = (IloI0lOlll1) obj2;
/* 390 */                   int iIntValue4 = ((Integer) obj3).intValue();
/* 407 */                   if (iloI0lOlll17.I00OIl(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
/* 409 */                       O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooiI111iI0000Il00O, 16.0f);
/* 413 */                       II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 415 */                       I1IiOI0 i1IiOI0 = I1IiooiI1IlO.I00000oIO;
/* 419 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll17, 48);
/* 427 */                       int iHashCode7 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 431 */                       OO0lO0l0 oO0lO0l0I000lI7 = iloI0lOlll17.I000lI();
/* 435 */                       O1ooiI111i o1ooiI111iI0000Il00O8 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooiI111iI0001Ioi1lo);
/* 441 */                       IOl0oi0lOl1.I000lI.getClass();
/* 444 */                       iloI0lOlll17.I00i0oil();
/* 449 */                       if (iloI0lOlll17.I00O10llo) {
/* 451 */                           iloI0lOlll17.I000l1(iloi111);
                                } else {
/* 455 */                           iloI0lOlll17.I00io1l();
                                }
/* 458 */                       IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00io1l;
/* 460 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll17, oiI1iiIl1Oi0I00000oIO2);
/* 463 */                       IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ilO0;
/* 465 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll17, oO0lO0l0I000lI7);
/* 468 */                       Integer numValueOf2 = Integer.valueOf(iHashCode7);
/* 472 */                       IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ioIO;
/* 474 */                       li01Ooiio01.I0000Il00O(iOioOOi0I7, iloI0lOlll17, numValueOf2);
/* 477 */                       li01Ooiio01.I00000oOI(iloI0lOlll17);
/* 480 */                       IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00ilI0I1;
/* 482 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll17, o1ooiI111iI0000Il00O8);
/* 509 */                       O1ooiI111i o1ooiI111iI00000oOI3 = i0I1I0.I00000oOI(ii0OOOOo0i.I00000oIO(Ol0iOOO0.I000lI(o1ooiI111iI0000Il00O, 44.0f), OiI11O1i1.I00000oIO), liIoOiiO1Oi.I000O01llI0(iloI0lOlll17).I0000Il00O, iOIIoiI1oi1);
/* 516 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O4 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 522 */                       int iHashCode8 = Long.hashCode(iloI0lOlll17.I00OI1);
/* 526 */                       OO0lO0l0 oO0lO0l0I000lI8 = iloI0lOlll17.I000lI();
/* 530 */                       O1ooiI111i o1ooiI111iI0000Il00O9 = iilOllOlO1.I0000Il00O(iloI0lOlll17, o1ooiI111iI00000oOI3);
/* 534 */                       iloI0lOlll17.I00i0oil();
/* 539 */                       if (iloI0lOlll17.I00O10llo) {
/* 541 */                           iloI0lOlll17.I000l1(iloi111);
                                } else {
/* 545 */                           iloI0lOlll17.I00io1l();
                                }
/* 548 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll17, o1iOIl0o10I0000Il00O4);
/* 551 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll17, oO0lO0l0I000lI8);
/* 554 */                       IIl001iO0Io.I001IIilI0O(iHashCode8, iloI0lOlll17, iOioOOi0I7, iloI0lOlll17);
/* 557 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll17, o1ooiI111iI0000Il00O9);
/* 571 */                       String upperCase = OlOoOIi0o.I00OIl(1, conversation2.getModelName()).toUpperCase(Locale.ROOT);
/* 579 */                       if (upperCase.length() == 0) {
/* 581 */                           upperCase = "B";
                                }
/* 638 */                       Oo0i1oIIoOO.I00000oOI(upperCase, null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll17).I0000O, null, 0L, null, IlilIIiIiO.I00l0I0l0lO1, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll17).I000O01llI0, iloI0lOlll17, 1572864, 0, 131002);
/* 641 */                       IloI0lOlll1 iloI0lOlll18 = iloI0lOlll17;
/* 644 */                       iloI0lOlll18.I0010I0i(true);
/* 653 */                       lOO1OIO00.I00000oIO(iloI0lOlll18, Ol0iOOO0.I00100o1O0lo(o1ooiI111iI0000Il00O, 12.0f));
/* 665 */                       if (1.0f <= 0.0d) {
/* 668 */                           IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                }
/* 689 */                       O0io1O o0io1O2 = new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
/* 695 */                       IOOlo1O01O iOOlo1O01OI00000oIO3 = IOOlio0Io0.I00000oIO(i1IiOIiOli, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll18, 0);
/* 701 */                       int iHashCode9 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 705 */                       OO0lO0l0 oO0lO0l0I000lI9 = iloI0lOlll18.I000lI();
/* 709 */                       O1ooiI111i o1ooiI111iI0000Il00O10 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o0io1O2);
/* 713 */                       iloI0lOlll18.I00i0oil();
/* 718 */                       if (iloI0lOlll18.I00O10llo) {
/* 720 */                           iloI0lOlll18.I000l1(iloi111);
                                } else {
/* 724 */                           iloI0lOlll18.I00io1l();
                                }
/* 727 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll18, iOOlo1O01OI00000oIO3);
/* 730 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll18, oO0lO0l0I000lI9);
/* 733 */                       IIl001iO0Io.I001IIilI0O(iHashCode9, iloI0lOlll18, iOioOOi0I7, iloI0lOlll18);
/* 736 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll18, o1ooiI111iI0000Il00O10);
/* 743 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO3 = OiI1iOo.I00000oIO(i1IiOI0, iI0O000iIl, iloI0lOlll18, 48);
/* 749 */                       int iHashCode10 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 753 */                       OO0lO0l0 oO0lO0l0I000lI10 = iloI0lOlll18.I000lI();
/* 757 */                       O1ooiI111i o1ooiI111iI0000Il00O11 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o1ooiI111iI0000Il00O);
/* 761 */                       iloI0lOlll18.I00i0oil();
/* 766 */                       if (iloI0lOlll18.I00O10llo) {
/* 768 */                           iloI0lOlll18.I000l1(iloi111);
                                } else {
/* 772 */                           iloI0lOlll18.I00io1l();
                                }
/* 775 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll18, oiI1iiIl1Oi0I00000oIO3);
/* 778 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll18, oO0lO0l0I000lI10);
/* 781 */                       IIl001iO0Io.I001IIilI0O(iHashCode10, iloI0lOlll18, iOioOOi0I7, iloI0lOlll18);
/* 784 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll18, o1ooiI111iI0000Il00O11);
/* 787 */                       String title2 = conversation2.getTitle();
/* 795 */                       Oo0lloOiiIOI oo0lloOiiIOI = liIoOiiO1Oi.I000OOo1O(iloI0lOlll18).I000OOo1O;
/* 802 */                       if (1.0f <= 0.0d) {
/* 805 */                           IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                                }
/* 865 */                       Oo0i1oIIoOO.I00000oOI(title2, new O0io1O(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, oo0lloOiiIOI, iloI0lOlll18, 0, 24960, 110588);
/* 876 */                       boolean zI000II5 = iloI0lOlll18.I000II(function14) | iloI0lOlll18.I000II(conversation2);
/* 877 */                       Object objI00O0i0ii15 = iloI0lOlll18.I00O0i0ii();
/* 881 */                       if (zI000II5) {
/* 888 */                           iOO0o0I1l = iOO0o0I1l2;
                                } else {
/* 883 */                           iOO0o0I1l = iOO0o0I1l2;
                                    obj5 = objI00O0i0ii15;
/* 885 */                           if (objI00O0i0ii15 == iOO0o0I1l) {
                                    }
/* 931 */                           iIo1101O.I00000oIO((IllOOo00lI) obj5, Ol0iOOO0.I000lI(o1ooiI111iI0000Il00O, 28.0f), false, null, null, i1OiooO.I000oI1ioi, iloI0lOlll18, 1572912, 60);
/* 935 */                           iloI0lOlll18.I0010I0i(true);
/* 944 */                           lOO1OIO00.I00000oIO(iloI0lOlll18, Ol0iOOO0.I000II(o1ooiI111iI0000Il00O, 2.0f));
/* 950 */                           OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO4 = OiI1iOo.I00000oIO(i1IiOI0, i1O01oOIoI0I.I00ll1, iloI0lOlll18, 0);
/* 956 */                           int iHashCode11 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 960 */                           OO0lO0l0 oO0lO0l0I000lI11 = iloI0lOlll18.I000lI();
/* 964 */                           O1ooiI111i o1ooiI111iI0000Il00O12 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o1ooiI111iI0000Il00O);
/* 968 */                           iloI0lOlll18.I00i0oil();
/* 973 */                           if (iloI0lOlll18.I00O10llo) {
/* 979 */                               iloI0lOlll18.I00io1l();
                                    } else {
/* 975 */                               iloI0lOlll18.I000l1(iloi111);
                                    }
/* 982 */                           li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll18, oiI1iiIl1Oi0I00000oIO4);
/* 985 */                           li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll18, oO0lO0l0I000lI11);
/* 988 */                           IIl001iO0Io.I001IIilI0O(iHashCode11, iloI0lOlll18, iOioOOi0I7, iloI0lOlll18);
/* 991 */                           li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll18, o1ooiI111iI0000Il00O12);
/* 1002 */                          if (conversation2.getModelName().length() <= 0) {
/* 1007 */                              iloI0lOlll18.I00i01iIIliI(1314523824);
/* 1067 */                              Oo0i1oIIoOO.I00000oOI(conversation2.getModelName(), null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll18).I00000oIO, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll18).I000l1, iloI0lOlll18, 0, 24576, 114682);
/* 1097 */                              Oo0i1oIIoOO.I00000oOI(" · ", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll18).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll18).I000l1, iloI0lOlll18, 6, 0, 131066);
/* 1100 */                              IloI0lOlll1 iloI0lOlll19 = iloI0lOlll18;
/* 1103 */                              iloI0lOlll19.I0010I0i(false);
                                        iloI0lOlll1 = iloI0lOlll19;
                                    } else {
/* 1111 */                              iloI0lOlll18.I00i01iIIliI(1315074477);
/* 1114 */                              iloI0lOlll18.I0010I0i(false);
                                        iloI0lOlll1 = iloI0lOlll18;
                                    }
/* 1187 */                          IloI0lOlll1 iloI0lOlll110 = iloI0lOlll1;
/* 1191 */                          Oo0i1oIIoOO.I00000oOI(conversation2.getMessageCount() + " messages", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll110, 0, 0, 131066);
/* 1195 */                          iloI0lOlll1.I0010I0i(true);
/* 1234 */                          Oo0i1oIIoOO.I00000oOI(simpleDateFormat.format(new Date(conversation2.getUpdatedAt())), null, IOOiio0i.I0000Il00O(0.7f, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll110, 0, 0, 131066);
/* 1245 */                          if (conversation2.getModelName().length() <= 0) {
/* 1250 */                              iloI0lOlll1.I00i01iIIliI(-1224729517);
/* 1259 */                              lOO1OIO00.I00000oIO(iloI0lOlll1, Ol0iOOO0.I000II(o1ooiI111iI0000Il00O, 8.0f));
/* 1272 */                              boolean zI000II6 = iloI0lOlll1.I000II(function13) | iloI0lOlll1.I000II(conversation2);
/* 1273 */                              Object objI00O0i0ii16 = iloI0lOlll1.I00O0i0ii();
                                        Object obj18 = objI00O0i0ii16;
/* 1277 */                              if (zI000II6 || objI00O0i0ii16 == iOO0o0I1l) {
/* 1284 */                                  IO1Ii1OO iO1Ii1OO = new IO1Ii1OO(1);
/* 1287 */                                  iO1Ii1OO.I00iiI = function13;
/* 1289 */                                  iO1Ii1OO.I00iiO = conversation2;
/* 1291 */                                  VarHandle.storeStoreFence();
/* 1294 */                                  iloI0lOlll1.I00iio(iO1Ii1OO);
                                            obj18 = iO1Ii1OO;
                                        }
/* 1301 */                              O1ooiI111i o1ooiI111iI0000oI003 = Ol0iOOO0.I0000oI00(o1ooiI111iI0000Il00O, 1.0f);
/* 1305 */                              OIo1i1 oIo1i1 = IIIi0o0.I00000oIO;
/* 1321 */                              IloI0lOlll1 iloI0lOlll111 = iloI0lOlll1;
/* 1358 */                              iOiO0o0oi.I00000oIO((IllOOo00lI) obj18, o1ooiI111iI0000oI003, false, null, IIIi0o0.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oIO, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oOI, iloI0lOlll111, 12), null, null, null, i1OiooO.I00100l0, iloI0lOlll111, 805306416, 492);
/* 1361 */                              IloI0lOlll1 iloI0lOlll112 = iloI0lOlll111;
/* 1364 */                              iloI0lOlll112.I0010I0i(false);
                                        iloI0lOlll12 = iloI0lOlll112;
                                    } else {
/* 1373 */                              iloI0lOlll1.I00i01iIIliI(-1224125048);
/* 1376 */                              iloI0lOlll1.I0010I0i(false);
                                        iloI0lOlll12 = iloI0lOlll1;
                                    }
/* 1380 */                          iloI0lOlll12.I0010I0i(true);
/* 1383 */                          iloI0lOlll12.I0010I0i(true);
                                }
/* 893 */                       IO1Ii1OO iO1Ii1OO2 = new IO1Ii1OO(0);
/* 896 */                       iO1Ii1OO2.I00iiI = function14;
/* 898 */                       iO1Ii1OO2.I00iiO = conversation2;
/* 900 */                       VarHandle.storeStoreFence();
/* 903 */                       iloI0lOlll18.I00iio(iO1Ii1OO2);
                                obj5 = iO1Ii1OO2;
/* 931 */                       iIo1101O.I00000oIO((IllOOo00lI) obj5, Ol0iOOO0.I000lI(o1ooiI111iI0000Il00O, 28.0f), false, null, null, i1OiooO.I000oI1ioi, iloI0lOlll18, 1572912, 60);
/* 935 */                       iloI0lOlll18.I0010I0i(true);
/* 944 */                       lOO1OIO00.I00000oIO(iloI0lOlll18, Ol0iOOO0.I000II(o1ooiI111iI0000Il00O, 2.0f));
/* 950 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO42 = OiI1iOo.I00000oIO(i1IiOI0, i1O01oOIoI0I.I00ll1, iloI0lOlll18, 0);
/* 956 */                       int iHashCode112 = Long.hashCode(iloI0lOlll18.I00OI1);
/* 960 */                       OO0lO0l0 oO0lO0l0I000lI112 = iloI0lOlll18.I000lI();
/* 964 */                       O1ooiI111i o1ooiI111iI0000Il00O122 = iilOllOlO1.I0000Il00O(iloI0lOlll18, o1ooiI111iI0000Il00O);
/* 968 */                       iloI0lOlll18.I00i0oil();
/* 973 */                       if (iloI0lOlll18.I00O10llo) {
                                }
/* 982 */                       li01Ooiio01.I0000Il00O(iOioOOi0I5, iloI0lOlll18, oiI1iiIl1Oi0I00000oIO42);
/* 985 */                       li01Ooiio01.I0000Il00O(iOioOOi0I6, iloI0lOlll18, oO0lO0l0I000lI112);
/* 988 */                       IIl001iO0Io.I001IIilI0O(iHashCode112, iloI0lOlll18, iOioOOi0I7, iloI0lOlll18);
/* 991 */                       li01Ooiio01.I0000Il00O(iOioOOi0I8, iloI0lOlll18, o1ooiI111iI0000Il00O122);
/* 1002 */                      if (conversation2.getModelName().length() <= 0) {
                                }
/* 1187 */                      IloI0lOlll1 iloI0lOlll1102 = iloI0lOlll1;
/* 1191 */                      Oo0i1oIIoOO.I00000oOI(conversation2.getMessageCount() + " messages", null, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll1102, 0, 0, 131066);
/* 1195 */                      iloI0lOlll1.I0010I0i(true);
/* 1234 */                      Oo0i1oIIoOO.I00000oOI(simpleDateFormat.format(new Date(conversation2.getUpdatedAt())), null, IOOiio0i.I0000Il00O(0.7f, liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000l1, iloI0lOlll1102, 0, 0, 131066);
/* 1245 */                      if (conversation2.getModelName().length() <= 0) {
                                }
/* 1380 */                      iloI0lOlll12.I0010I0i(true);
/* 1383 */                      iloI0lOlll12.I0010I0i(true);
                            } else {
/* 1388 */                      iloI0lOlll17.I00OilO00Il();
                            }
/* 1391 */                  return ooiIlOl1iI;
                        case 6:
/* 357 */                   return I00000oIO(obj, obj2, obj3);
                        case 7:
/* 352 */                   return I0000O(obj, obj2, obj3);
                        case 8:
/* 347 */                   return I0000oI00(obj, obj2, obj3);
                        case 9:
/* 342 */                   return I0001Ioi1lo(obj, obj2, obj3);
                        case 10:
/* 337 */                   return I000II(obj, obj2, obj3);
                        case 11:
/* 332 */                   return I000O01llI0(obj, obj2, obj3);
                        case 12:
/* 327 */                   return I000OOo1O(obj, obj2, obj3);
                        case 13:
/* 322 */                   return I000OiO(obj, obj2, obj3);
                        case 14:
/* 317 */                   return I000iOII(obj, obj2, obj3);
                        case 15:
/* 312 */                   return I000lI(obj, obj2, obj3);
                        case 16:
/* 307 */                   return I000o00OoI0I(obj, obj2, obj3);
                        case 17:
/* 302 */                   return I000oI1ioi(obj, obj2, obj3);
                        case PoseLandmark.RIGHT_PINKY:
/* 297 */                   return I00100l0(obj, obj2, obj3);
                        case PoseLandmark.LEFT_INDEX:
/* 292 */                   return I00111O(obj, obj2, obj3);
                        case PoseLandmark.RIGHT_INDEX:
/* 287 */                   return I001IIilI0O(obj, obj2, obj3);
                        default:
/* 32 */                    III11l1I iII11l1I = (III11l1I) this.I00iiO;
/* 36 */                    O0oIlOolIO o0oIlOolIO = (O0oIlOolIO) this.I00iio;
/* 40 */                    Oo0OI01Il oo0OI01Il = (Oo0OI01Il) this.I00iiI;
/* 44 */                    OIOlOI oIOlOI = (OIOlOI) this.I00ilI0I1;
/* 48 */                    O1ooiI111i o1ooiI111i2 = (O1ooiI111i) obj;
/* 52 */                    IloI0lOlll1 iloI0lOlll113 = (IloI0lOlll1) obj2;
/* 58 */                    ((Integer) obj3).getClass();
/* 64 */                    iloI0lOlll113.I00i01iIIliI(-84507373);
/* 75 */                    boolean zBooleanValue3 = ((Boolean) iloI0lOlll113.I000iOII(IOlO0o100i1i.I001iOo1i0O)).booleanValue();
/* 79 */                    boolean zI000O01llI0 = iloI0lOlll113.I000O01llI0(zBooleanValue3);
/* 83 */                    Object objI00O0i0ii17 = iloI0lOlll113.I00O0i0ii();
                            Object obj19 = objI00O0i0ii17;
/* 87 */                    if (zI000O01llI0 || objI00O0i0ii17 == iOO0o0I1l2) {
/* 93 */                        Ii0i1Iolo ii0i1Iolo = new Ii0i1Iolo();
/* 96 */                        ii0i1Iolo.I00000oIO = zBooleanValue3;
/* 103 */                       ii0i1Iolo.I00000oOI = new AtomicReference(null);
/* 110 */                       ii0i1Iolo.I0000Il00O = new OIooO1iiliI(0.0f);
/* 112 */                       VarHandle.storeStoreFence();
/* 115 */                       iloI0lOlll113.I00iio(ii0i1Iolo);
                                obj19 = ii0i1Iolo;
                            }
/* 118 */                   Ii0i1Iolo ii0i1Iolo2 = (Ii0i1Iolo) obj19;
/* 122 */                   if ((iII11l1I instanceof OlI00IIlOO) && ((OlI00IIlOO) iII11l1I).I00000oIO == 16) {
/* 135 */                       z3 = false;
                            }
/* 150 */                   if (((O0oI1IIioO0) ((i00Ii11100lo) iloI0lOlll113.I000iOII(IOlO0o100i1i.I001IIilI0O))).I00000oOI() && o0oIlOolIO.I00000oOI() && Oo0lI00l.I0000O(oo0OI01Il.I00000oOI) && z3) {
/* 171 */                       iloI0lOlll113.I00i01iIIliI(-707487962);
/* 174 */                       I1111OO10i i1111OO10i = oo0OI01Il.I00000oIO;
/* 178 */                       Oo0lI00l oo0lI00lI00000oIO = Oo0lI00l.I00000oIO(oo0OI01Il.I00000oOI);
/* 182 */                       boolean zI000OOo1O3 = iloI0lOlll113.I000OOo1O(ii0i1Iolo2);
/* 186 */                       Object objI00O0i0ii18 = iloI0lOlll113.I00O0i0ii();
                                Object obj20 = objI00O0i0ii18;
/* 190 */                       if (zI000OOo1O3 || objI00O0i0ii18 == iOO0o0I1l2) {
/* 198 */                           O1iOlO o1iOlO = new O1iOlO((Object) ii0i1Iolo2, (IOoil1iiIilo) (z2 ? 1 : 0), 9);
/* 201 */                           iloI0lOlll113.I00iio(o1iOlO);
                                    obj20 = o1iOlO;
                                }
/* 206 */                       iIO0iiOiOl0l.I0000oI00(i1111OO10i, oo0lI00lI00000oIO, (IlliIl1l11O) obj20, iloI0lOlll113);
/* 232 */                       boolean zI000OOo1O4 = iloI0lOlll113.I000OOo1O(ii0i1Iolo2) | iloI0lOlll113.I000OOo1O(oIOlOI) | iloI0lOlll113.I000II(oo0OI01Il) | iloI0lOlll113.I000OOo1O(o0oIlOolIO) | iloI0lOlll113.I000II(iII11l1I);
/* 233 */                       Object objI00O0i0ii19 = iloI0lOlll113.I00O0i0ii();
                                Object obj21 = objI00O0i0ii19;
/* 237 */                       if (zI000OOo1O4 || objI00O0i0ii19 == iOO0o0I1l2) {
/* 245 */                           I0IO1io0I i0IO1io0I = new I0IO1io0I(14);
/* 248 */                           i0IO1io0I.I00iiO = ii0i1Iolo2;
/* 250 */                           i0IO1io0I.I00iio = oIOlOI;
/* 252 */                           i0IO1io0I.I00ilI0I1 = oo0OI01Il;
/* 254 */                           i0IO1io0I.I00ilO0 = o0oIlOolIO;
/* 256 */                           i0IO1io0I.I00iiI = iII11l1I;
/* 258 */                           VarHandle.storeStoreFence();
/* 261 */                           iloI0lOlll113.I00iio(i0IO1io0I);
                                    obj21 = i0IO1io0I;
                                }
/* 266 */                       o1ooiI111iI0000Il00O = iIO01l11OlO.I0000Il00O(o1ooiI111i2, (Function1) obj21);
/* 270 */                       iloI0lOlll113.I0010I0i(false);
                            } else {
/* 277 */                       iloI0lOlll113.I00i01iIIliI(-705473241);
/* 280 */                       iloI0lOlll113.I0010I0i(false);
                            }
/* 283 */                   iloI0lOlll113.I0010I0i(false);
/* 286 */                   return o1ooiI111iI0000Il00O;
                    }
                }

/* 16 */        public IO1oIiIi1O01(int i) {
/* 17 */            this.I00iOIl = i;
                }
            }
