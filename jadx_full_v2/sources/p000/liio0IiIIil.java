            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.locks.ReentrantLock;
            
            public abstract class liio0IiIIil {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(ii1iOiO ii1ioio, String str, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
                    ii1iOiO ii1ioio2;
                    OooO0l0000 oooO0l0000I00000oOI;
                    Object obj;
                    Activity activity;
/* 1 */             String str2 = str;
/* 3 */             boolean z2 = z;
/* 7 */             I0OOO1l0IoO i0OOO1l0IoO = I0OOO1l0IoO.I000O01llI0;
/* 9 */             I0OOO1l0IoO i0OOO1l0IoO2 = I0OOO1l0IoO.I000II;
/* 11 */            Object obj2 = IOl11li.I00000oIO;
/* 16 */            iloI0lOlll1.I00i0O(1574643533);
/* 25 */            int i2 = 1;
/* 45 */            int i3 = i | 2 | (true != iloI0lOlll1.I000II(str2) ? 16 : 32) | (true != iloI0lOlll1.I000O01llI0(z2) ? Barcode.FORMAT_ITF : Barcode.FORMAT_QR_CODE);
/* 61 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 63 */                iloI0lOlll1.I00Ol00();
/* 68 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 69 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 84 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll1);
/* 88 */                    if (oool1Ii0II00000oIO == null) {
/* 1106 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1109 */                      return;
                            }
/* 106 */                   ii1ioio2 = (ii1iOiO) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(ii1iOiO.class), oool1Ii0II00000oIO, null, li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll1);
                        } else {
/* 78 */                    iloI0lOlll1.I00OilO00Il();
/* 81 */                    ii1ioio2 = ii1ioio;
                        }
/* 109 */               iloI0lOlll1.I0010o();
/* 112 */               if (z2) {
/* 117 */                   iloI0lOlll1.I00i01iIIliI(572838453);
/* 120 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(ii1ioio2);
/* 124 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 128 */                   if (zI000OOo1O || objI00O0i0ii == obj2) {
/* 136 */                       objI00O0i0ii = new I1iOI0oo(ii1ioio2, iOoil1iiIilo, 27);
/* 139 */                       iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 144 */                   iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii, iloI0lOlll1, ii1ioio2);
/* 147 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 154 */                   iloI0lOlll1.I00i01iIIliI(572899957);
/* 157 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 160 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 164 */               if (objI00O0i0ii2 == obj2) {
/* 166 */                   OI1oloo0OoO[] oI1oloo0OoOArr = {li0iO0i0Ii.I00000oIO};
/* 174 */                   Ol1o0O0O0 ol1o0O0O0 = new Ol1o0O0O0();
/* 183 */                   ol1o0O0O0.addAll(I1IoiO1l.I00IioO0OiOi(oI1oloo0OoOArr));
/* 186 */                   iloI0lOlll1.I00iio(ol1o0O0O0);
/* 189 */                   objI00O0i0ii2 = ol1o0O0O0;
                        }
/* 190 */               Ol1o0O0O0 ol1o0O0O02 = (Ol1o0O0O0) objI00O0i0ii2;
/* 195 */               iloI0lOlll1.I00i01iIIliI(280825064);
/* 220 */               int i4 = 32;
/* 228 */               long jI00100o1O0lo = ((IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0)).I00100o1O0lo(l000O1l.I00000oOI(((O0oI1IIioO0) ((i00Ii11100lo) iloI0lOlll1.I000iOII(IOlO0o100i1i.I001IIilI0O))).I00000oIO()));
/* 232 */               iloI0lOlll1.I0010I0i(false);
/* 235 */               List list = i010IoOillo.I0000Il00O;
/* 237 */               Set set = Iil1iiOIOO.I00000oIO;
/* 239 */               Set set2 = Iil10o1O1oO.I00000oIO;
/* 247 */               ArrayList arrayList = new ArrayList();
/* 258 */               for (Object obj3 : set) {
/* 260 */                   int i5 = i4;
/* 266 */                   int i6 = i2;
/* 281 */                   if (Iil1010O.I00000oOI(Iil1iI01I0O0.I00000oOI(jI00100o1O0lo), ((Iil1010O) obj3).I00iOIl) >= 0) {
/* 283 */                       arrayList.add(obj3);
                            }
/* 286 */                   i4 = i5;
/* 288 */                   i2 = i6;
                        }
/* 292 */               int i7 = i2;
/* 294 */               int i8 = i4;
/* 296 */               Iterator it = arrayList.iterator();
/* 304 */               if (!it.hasNext()) {
/* 1100 */                  IoOOl0iOl1io.I00000oOI();
/* 1103 */                  return;
                        }
/* 312 */               float fMax = ((Iil1010O) it.next()).I00iOIl;
/* 318 */               while (it.hasNext()) {
/* 328 */                   fMax = Math.max(fMax, ((Iil1010O) it.next()).I00iOIl);
                        }
/* 337 */               ArrayList arrayList2 = new ArrayList();
/* 348 */               for (Object obj4 : set2) {
/* 367 */                   if (Iil1010O.I00000oOI(Iil1iI01I0O0.I00000oIO(jI00100o1O0lo), ((Iil1010O) obj4).I00iOIl) >= 0) {
/* 369 */                       arrayList2.add(obj4);
                            }
                        }
/* 374 */               Iterator it2 = arrayList2.iterator();
/* 382 */               if (!it2.hasNext()) {
/* 1096 */                  IoOOl0iOl1io.I00000oOI();
/* 1099 */                  return;
                        }
/* 390 */               float fMax2 = ((Iil1010O) it2.next()).I00iOIl;
/* 396 */               while (it2.hasNext()) {
/* 406 */                   fMax2 = Math.max(fMax2, ((Iil1010O) it2.next()).I00iOIl);
                        }
/* 415 */               i010IoOillo i010iooillo = new i010IoOillo((int) fMax, (int) fMax2);
/* 424 */               Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 426 */               boolean zI000II = iloI0lOlll1.I000II(context);
/* 430 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 436 */               if (zI000II || objI00O0i0ii3 == obj2) {
/* 446 */                   i00Io1IOlo0.I00Ol10.getClass();
/* 455 */                   Object obj5 = (i00I1il0) i00Io0OIliIo.I00000oOI.getValue();
/* 457 */                   if (obj5 == null) {
/* 459 */                       Ol0I1O ol0I1O = Ol0I1O.I0000Il00O;
/* 463 */                       if (Ol0I1O.I0000Il00O == null) {
/* 465 */                           ReentrantLock reentrantLock = Ol0I1O.I0000O;
/* 467 */                           reentrantLock.lock();
                                    try {
/* 472 */                               if (Ol0I1O.I0000Il00O == null) {
                                            try {
/* 474 */                                       oooO0l0000I00000oOI = Ol0I000O1i1.I00000oOI();
                                            } catch (Throwable unused) {
                                            }
/* 478 */                                   if (oooO0l0000I00000oOI != null && ((BigInteger) oooO0l0000I00000oOI.I00ilI0I1.getValue()).compareTo((BigInteger) OooO0l0000.I00ilO0.I00ilI0I1.getValue()) >= 0) {
/* 507 */                                       Ol0I0o1OI1i ol0I0o1OI1i = new Ol0I0o1OI1i(context);
/* 514 */                                       if (!ol0I0o1OI1i.I0000oI00()) {
/* 516 */                                           ol0I0o1OI1i = null;
                                                }
/* 519 */                                       Ol0I1O ol0I1O2 = new Ol0I1O();
/* 522 */                                       ol0I1O2.I00000oIO = ol0I0o1OI1i;
/* 529 */                                       ol0I1O2.I00000oOI = new CopyOnWriteArrayList();
/* 531 */                                       if (ol0I0o1OI1i != null) {
/* 535 */                                           iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 538 */                                           iiolilo0iiil.I00iOIl = ol0I1O2;
/* 540 */                                           VarHandle.storeStoreFence();
/* 543 */                                           ol0I0o1OI1i.I0000O(iiolilo0iiil);
                                                }
/* 546 */                                       VarHandle.storeStoreFence();
/* 549 */                                       Ol0I1O.I0000Il00O = ol0I1O2;
                                            }
                                        }
                                    } finally {
/* 558 */                               reentrantLock.unlock();
                                    }
                                }
/* 562 */                       obj5 = Ol0I1O.I0000Il00O;
                            }
/* 606 */                   IOOi1I.I00000oIO(Integer.valueOf(i7), 2, 4, 8, 16, Integer.valueOf(i8), 64, Integer.valueOf(Barcode.FORMAT_ITF));
/* 609 */                   Il1oii1olOoi.I00000oIO();
/* 615 */                   Oi1ol0llI oi1ol0llI = new Oi1ol0llI(20, false);
/* 618 */                   oi1ol0llI.I00iiI = obj5;
/* 620 */                   VarHandle.storeStoreFence();
/* 625 */                   i00Io0OIliIo.I0000Il00O.getClass();
/* 634 */                   IIiOO0o iIiOO0oI00000oIO = ilOl0O00Il0i.I00000oIO(new i00Iooii0i(oi1ol0llI, context, (IOoil1iiIilo) null, 0));
/* 638 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 642 */                   IlOil1ii ilOil1iiI00000oOI = ilOlOoO1lO.I00000oOI(iIiOO0oI00000oIO, O1OI1l011OO1.I00000oIO);
/* 648 */                   I10OIo i10OIo = new I10OIo(0);
/* 651 */                   i10OIo.I00iiI = ilOil1iiI00000oOI;
/* 653 */                   VarHandle.storeStoreFence();
/* 656 */                   iloI0lOlll1.I00iio(i10OIo);
                            obj = i10OIo;
                        } else {
                            obj = objI00O0i0ii3;
                        }
/* 673 */               List list2 = (List) lOIoiooI1i01.I00000oIO((IlOil1ii) obj, Il01100l.I00iOIl, iloI0lOlll1, 48, 2).getValue();
/* 675 */               IliIlOOIoIo iliIlOOIoIo = IliIlOOIoIo.I00iio;
/* 677 */               IIlIi0lIii iIlIi0lIii = IIlIi0lIii.I00io1l;
/* 681 */               ArrayList arrayList3 = new ArrayList();
/* 686 */               Iterator it3 = list2.iterator();
/* 694 */               while (it3.hasNext()) {
/* 700 */                   Io1IIIi01 io1IIIi01 = (Io1IIIi01) it3.next();
/* 702 */                   II1i0o0 iI1i0o0 = io1IIIi01.I00000oIO;
/* 712 */                   if (iI1i0o0.I00000oOI() > iI1i0o0.I00000oIO()) {
                            }
/* 717 */                   II1i0o0 iI1i0o02 = io1IIIi01.I00000oIO;
/* 719 */                   Iterator it4 = it3;
/* 721 */                   IIlIi0lIii iIlIi0lIii2 = io1IIIi01.I0000Il00O;
/* 729 */                   I0OOO1l0IoO i0OOO1l0IoO3 = i0OOO1l0IoO;
/* 731 */                   OOo0IO oOo0IOI0000Il00O = lIiool1i00.I0000Il00O(iI1i0o02.I0000Il00O());
/* 743 */                   boolean z3 = iIlIi0lIii2 != IIlIi0lIii.I00ilO0 ? 0 : i7;
/* 745 */                   II1i0o0 iI1i0o03 = io1IIIi01.I00000oIO;
/* 767 */                   boolean z4 = (iI1i0o03.I00000oOI() > iI1i0o03.I00000oIO() ? i0OOO1l0IoO3 : i0OOO1l0IoO2) != i0OOO1l0IoO2 ? 0 : i7;
/* 769 */                   I0OooiI1I i0OooiI1I = io1IIIi01.I00000oOI;
/* 784 */                   boolean z5 = (i0OooiI1I == I0OooiI1I.I00io1l || (i0OooiI1I == I0OooiI1I.I00ilO0 && iIlIi0lIii2 == iIlIi0lIii)) ? i7 : 0;
/* 807 */                   boolean z6 = ((iI1i0o02.I00000oOI() == 0 || iI1i0o02.I00000oIO() == 0) ? IliIlOOIoIo.I00iiO : iliIlOOIoIo) != iliIlOOIoIo ? 0 : i7;
/* 809 */                   Io1ilii01l io1ilii01l = new Io1ilii01l();
/* 812 */                   io1ilii01l.I00000oIO = oOo0IOI0000Il00O;
/* 814 */                   io1ilii01l.I00000oOI = z3;
/* 816 */                   io1ilii01l.I0000Il00O = z4;
/* 818 */                   io1ilii01l.I0000O = z5;
/* 820 */                   io1ilii01l.I0000oI00 = z6;
/* 822 */                   VarHandle.storeStoreFence();
/* 825 */                   arrayList3.add(io1ilii01l);
/* 832 */                   it3 = it4;
/* 834 */                   i0OOO1l0IoO = i0OOO1l0IoO3;
                        }
/* 840 */               boolean zI000II2 = iloI0lOlll1.I000II(i010iooillo);
/* 844 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii4;
/* 848 */               if (zI000II2 || objI00O0i0ii4 == obj2) {
/* 854 */                   i1liolI i1lioli = new i1liolI();
/* 857 */                   i1lioli.I00000oIO = i010iooillo;
/* 859 */                   VarHandle.storeStoreFence();
/* 862 */                   iloI0lOlll1.I00iio(i1lioli);
                            obj6 = i1lioli;
                        }
/* 865 */               i1liolI i1lioli2 = (i1liolI) obj6;
/* 873 */               Context baseContext = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
                        while (true) {
/* 877 */                   if (!(baseContext instanceof ContextWrapper)) {
/* 894 */                       activity = null;
                                break;
                            } else {
/* 881 */                       if (baseContext instanceof Activity) {
/* 884 */                           activity = (Activity) baseContext;
                                    break;
                                }
/* 889 */                       baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            }
                        }
/* 895 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii5;
/* 899 */               if (objI00O0i0ii5 == obj2) {
/* 905 */                   iOOiOoooII iooiooooii = new iOOiOoooII(i7);
/* 908 */                   iooiooooii.I00iiI = ol1o0O0O02;
/* 910 */                   VarHandle.storeStoreFence();
/* 913 */                   iloI0lOlll1.I00iio(iooiooooii);
                            obj7 = iooiooooii;
                        }
/* 916 */               IllOOo00lI illOOo00lI = (IllOOo00lI) obj7;
/* 918 */               List listSingletonList = Collections.singletonList(i1lioli2);
/* 925 */               iloI0lOlll1.I00i01iIIliI(1403966270);
/* 932 */               I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(11);
/* 940 */               i1I0i0Ilo1Oi.I00iiI = new LinkedHashMap();
/* 947 */               i1I0i0Ilo1Oi.I00iiO = new LinkedHashMap();
/* 949 */               VarHandle.storeStoreFence();
/* 952 */               Boolean bool = Boolean.TRUE;
/* 956 */               Map mapSingletonMap = Collections.singletonMap("ListDetailScene-List", bool);
/* 963 */               Oo1IOioIl oo1IOioIl = new Oo1IOioIl(1);
/* 966 */               oo1IOioIl.I00iiO = ii1ioio2;
/* 970 */               oo1IOioIl.I00iio = str;
/* 972 */               oo1IOioIl.I00ilI0I1 = activity;
/* 976 */               oo1IOioIl.I00iiI = z;
/* 978 */               oo1IOioIl.I00ilO0 = ol1o0O0O02;
/* 980 */               VarHandle.storeStoreFence();
/* 986 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(1354652440, oo1IOioIl, iloI0lOlll1);
/* 990 */               OoOi1I011O ooOi1I011O = OoOi1I011O.I00ioIO;
/* 992 */               OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 996 */               O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(li0iO0i0Ii.class);
/* 1003 */              iIl1lOlllo1 iil1lolllo1 = new iIl1lOlllo1(0);
/* 1006 */              iil1lolllo1.I00iiI = mapSingletonMap;
/* 1008 */              VarHandle.storeStoreFence();
/* 1011 */              i1I0i0Ilo1Oi.I0000Il00O(o0IOli0o0I00000oOI, ooOi1I011O, iil1lolllo1, iOii1lI00000oOI);
/* 1016 */              Map mapSingletonMap2 = Collections.singletonMap("ListDetailScene-Detail", bool);
/* 1023 */              I1oii000Ooi i1oii000Ooi = new I1oii000Ooi(3);
/* 1026 */              i1oii000Ooi.I00iiI = ii1ioio2;
/* 1028 */              i1oii000Ooi.I00iiO = ol1o0O0O02;
/* 1030 */              VarHandle.storeStoreFence();
/* 1036 */              IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-88863884, i1oii000Ooi, iloI0lOlll1);
/* 1040 */              OoOi1I011O ooOi1I011O2 = OoOi1I011O.I00l0I0l0lO1;
/* 1044 */              O0IOli0o0 o0IOli0o0I00000oOI2 = oOoOl1001II.I00000oOI(iliOO0l.class);
/* 1051 */              iIl1lOlllo1 iil1lolllo12 = new iIl1lOlllo1(1);
/* 1054 */              iil1lolllo12.I00iiI = mapSingletonMap2;
/* 1056 */              VarHandle.storeStoreFence();
/* 1059 */              i1I0i0Ilo1Oi.I0000Il00O(o0IOli0o0I00000oOI2, ooOi1I011O2, iil1lolllo12, iOii1lI00000oOI2);
/* 1065 */              Iil1olo iil1olo = new Iil1olo(4);
/* 1068 */              iil1olo.I00iiI = i1I0i0Ilo1Oi;
/* 1070 */              VarHandle.storeStoreFence();
/* 1074 */              iloI0lOlll1.I0010I0i(false);
/* 1086 */              z2 = z;
/* 1090 */              str2 = str;
/* 1092 */              l1iO1O1ill1.I0000Il00O(ol1o0O0O02, null, null, illOOo00lI, null, listSingletonList, null, null, null, null, iil1olo, iloI0lOlll1, 3078);
                    } else {
/* 1110 */              iloI0lOlll1.I00OilO00Il();
/* 1113 */              ii1ioio2 = ii1ioio;
                    }
/* 1115 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1119 */          if (oOloioIlI001IO000 != null) {
/* 1123 */              iO1i1l0IO io1i1l0io = new iO1i1l0IO();
/* 1126 */              io1i1l0io.I00iOIl = ii1ioio2;
/* 1128 */              io1i1l0io.I00iiI = str2;
/* 1130 */              io1i1l0io.I00iiO = z2;
/* 1132 */              VarHandle.storeStoreFence();
/* 1135 */              oOloioIlI001IO000.I0000O = io1i1l0io;
                    }
                }
            }
