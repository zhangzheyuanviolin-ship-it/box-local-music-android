            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOlIi1i {
                public static final void I00000oIO(IllOOo00lI illOOo00lI, OI1o1o1iO1l oI1o1o1iO1l, O1ol100o0O o1ol100o0O, IO1OIo01l1 iO1OIo01l1, IloI0lOlll1 iloI0lOlll1, int i) {
                    IO1OIo01l1 iO1OIo01l12;
                    IloI0lOlll1 iloI0lOlll12;
                    IO1OIo01l1 iO1OIo01l13;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    IloI0lOlll1 iloI0lOlll14;
                    OI10i0Il oI10i0Il2;
                    Object obj2;
/* 7 */             IloI0lOlll1 iloI0lOlll15 = iloI0lOlll1;
/* 12 */            iloI0lOlll15.I00i0O(1494104097);
/* 19 */            int i2 = 4;
/* 20 */            int i3 = 2;
/* 52 */            int i4 = i | (iloI0lOlll15.I000OOo1O(illOOo00lI) ? 4 : 2) | (iloI0lOlll15.I000OOo1O(oI1o1o1iO1l) ? 32 : 16) | (iloI0lOlll15.I000OOo1O(o1ol100o0O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | Barcode.FORMAT_UPC_E;
/* 58 */            int i5 = 0;
/* 70 */            if (iloI0lOlll15.I00OIl(i4 & 1, (i4 & 1171) != 1170)) {
/* 72 */                iloI0lOlll15.I00Ol00();
/* 77 */                if ((i & 1) == 0 || iloI0lOlll15.I001lloI()) {
/* 92 */                    Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll15);
/* 96 */                    if (oool1Ii0II00000oIO == null) {
/* 789 */                       I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 792 */                       return;
                            }
/* 122 */                   iO1OIo01l13 = (IO1OIo01l1) li1ilo1Oli.I00000oIO(OOoOl0i.I00000oIO.I00000oOI(IO1OIo01l1.class), oool1Ii0II00000oIO, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll15), li1iolIo.I00000oIO(oool1Ii0II00000oIO), iloI0lOlll15);
                        } else {
/* 86 */                    iloI0lOlll15.I00OilO00Il();
/* 89 */                    iO1OIo01l13 = iO1OIo01l1;
                        }
/* 124 */               iloI0lOlll15.I0010o();
/* 133 */               Context context = (Context) iloI0lOlll15.I000iOII(I0lloOI0oio.I00000oOI);
/* 137 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(iO1OIo01l13.I0000Il00O, iloI0lOlll15);
/* 143 */               OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(iO1OIo01l13.I0000oI00, iloI0lOlll15);
/* 147 */               Object objI00O0i0ii = iloI0lOlll15.I00O0i0ii();
/* 151 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 153 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 157 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 161 */                   iloI0lOlll15.I00iio(objI00O0i0ii);
                        }
/* 164 */               OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii;
/* 166 */               Object objI00O0i0ii2 = iloI0lOlll15.I00O0i0ii();
/* 171 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 173 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(null);
/* 177 */                   iloI0lOlll15.I00iio(objI00O0i0ii2);
                        }
/* 180 */               OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii2;
/* 182 */               Object objI00O0i0ii3 = iloI0lOlll15.I00O0i0ii();
/* 186 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 190 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO("");
/* 194 */                   iloI0lOlll15.I00iio(objI00O0i0ii3);
                        }
/* 197 */               OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii3;
/* 225 */               boolean zI000II = iloI0lOlll15.I000II((List) oI10i0IlI00000oOI.getValue()) | iloI0lOlll15.I000II((String) oI10i0Il5.getValue());
/* 226 */               Object objI00O0i0ii4 = iloI0lOlll15.I00O0i0ii();
/* 230 */               if (zI000II || objI00O0i0ii4 == iOO0o0I1l) {
/* 236 */                   I0IlOO10Ii1 i0IlOO10Ii1 = new I0IlOO10Ii1(i2);
/* 239 */                   i0IlOO10Ii1.I00iiI = oI10i0Il5;
/* 241 */                   i0IlOO10Ii1.I00iiO = oI10i0IlI00000oOI;
/* 243 */                   VarHandle.storeStoreFence();
/* 246 */                   objI00O0i0ii4 = Ol1llolil.I00000oOI(i0IlOO10Ii1);
/* 250 */                   iloI0lOlll15.I00iio(objI00O0i0ii4);
                        }
/* 253 */               OlO01l1oOil olO01l1oOil = (OlO01l1oOil) objI00O0i0ii4;
/* 255 */               Object objI00O0i0ii5 = iloI0lOlll15.I00O0i0ii();
/* 259 */               if (objI00O0i0ii5 == iOO0o0I1l) {
/* 261 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 265 */                   iloI0lOlll15.I00iio(objI00O0i0ii5);
                        }
/* 268 */               OI10i0Il oI10i0Il6 = (OI10i0Il) objI00O0i0ii5;
/* 272 */               O1i0oIO o1i0oIO = new O1i0oIO(i3);
/* 275 */               o1i0oIO.I00iiI = illOOo00lI;
/* 277 */               o1i0oIO.I00iiO = iO1OIo01l13;
/* 279 */               o1i0oIO.I00iio = context;
/* 281 */               o1i0oIO.I00ilI0I1 = oI10i0IlI00000oOI;
/* 283 */               o1i0oIO.I00ilO0 = oI10i0Il5;
/* 285 */               o1i0oIO.I00io1l = oI10i0Il3;
/* 287 */               VarHandle.storeStoreFence();
/* 293 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(245877213, o1i0oIO, iloI0lOlll15);
/* 299 */               IO1IlI1 iO1IlI1 = new IO1IlI1(i5);
/* 302 */               iO1IlI1.I00iiO = oI10i0IlI00000oOI;
/* 304 */               iO1IlI1.I00io1l = olO01l1oOil;
/* 306 */               iO1IlI1.I00ioIO = iO1OIo01l13;
/* 308 */               iO1IlI1.I00iiI = o1ol100o0O;
/* 310 */               iO1IlI1.I00l0I0l0lO1 = oI1o1o1iO1l;
/* 312 */               iO1IlI1.I00iio = oI10i0Il5;
/* 314 */               iO1IlI1.I00ilI0I1 = oI10i0Il4;
/* 316 */               iO1IlI1.I00ilO0 = oI10i0Il6;
/* 318 */               VarHandle.storeStoreFence();
/* 366 */               iO1OIo01l12 = iO1OIo01l13;
/* 370 */               lO0l01iI0i.I00000oIO(null, iOii1lI00000oOI, null, null, null, 0, 0L, 0L, null, iiioOl1O.I00000oOI(1411236594, iO1IlI1, iloI0lOlll15), iloI0lOlll15, 805306416, 509);
/* 383 */               if (((Boolean) oI10i0Il3.getValue()).booleanValue()) {
/* 388 */                   iloI0lOlll15.I00i01iIIliI(2118559465);
/* 391 */                   Object objI00O0i0ii6 = iloI0lOlll15.I00O0i0ii();
/* 395 */                   if (objI00O0i0ii6 == iOO0o0I1l) {
/* 401 */                       I1ol0OoiOI1o i1ol0OoiOI1o = new I1ol0OoiOI1o(17);
/* 404 */                       oI10i0Il2 = oI10i0Il3;
/* 406 */                       i1ol0OoiOI1o.I00iiI = oI10i0Il2;
/* 408 */                       VarHandle.storeStoreFence();
/* 411 */                       iloI0lOlll15.I00iio(i1ol0OoiOI1o);
                                obj2 = i1ol0OoiOI1o;
                            } else {
/* 415 */                       oI10i0Il2 = oI10i0Il3;
                                obj2 = objI00O0i0ii6;
                            }
/* 421 */                   int i6 = 20;
/* 423 */                   I0Il0I1o i0Il0I1o = new I0Il0I1o(i6);
/* 426 */                   i0Il0I1o.I00iiO = iO1OIo01l12;
/* 428 */                   i0Il0I1o.I00iiI = oI10i0Il2;
/* 430 */                   VarHandle.storeStoreFence();
/* 436 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(787234414, i0Il0I1o, iloI0lOlll15);
/* 442 */                   I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(i6);
/* 445 */                   i0Il1IoilolI.I00iiI = oI10i0Il2;
/* 447 */                   VarHandle.storeStoreFence();
/* 481 */                   iOIil10l.I00000oIO((IllOOo00lI) obj2, iOii1lI00000oOI2, null, iiioOl1O.I00000oOI(1690154992, i0Il1IoilolI, iloI0lOlll15), null, i1OiooO.I000OiO, i1OiooO.I000iOII, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 484 */                   IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 486 */                   z = false;
/* 487 */                   iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 491 */                   z = false;
/* 495 */                   iloI0lOlll15.I00i01iIIliI(2119289825);
/* 498 */                   iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 505 */               Conversation conversation = (Conversation) oI10i0Il6.getValue();
/* 507 */               if (conversation == null) {
/* 512 */                   iloI0lOlll13.I00i01iIIliI(2119368347);
/* 515 */                   iloI0lOlll13.I0010I0i(z);
                            iloI0lOlll14 = iloI0lOlll13;
                        } else {
/* 523 */                   iloI0lOlll13.I00i01iIIliI(2119368348);
/* 530 */                   boolean zI000II2 = iloI0lOlll13.I000II(conversation.getId());
/* 534 */                   Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
/* 538 */                   if (zI000II2 || objI00O0i0ii7 == iOO0o0I1l) {
/* 546 */                       objI00O0i0ii7 = lOO00IiI0li.I00000oIO(conversation.getTitle());
/* 550 */                       iloI0lOlll13.I00iio(objI00O0i0ii7);
                            }
/* 553 */                   OI10i0Il oI10i0Il7 = (OI10i0Il) objI00O0i0ii7;
/* 555 */                   Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
/* 559 */                   if (objI00O0i0ii8 == iOO0o0I1l) {
/* 565 */                       I1ol0OoiOI1o i1ol0OoiOI1o2 = new I1ol0OoiOI1o(18);
/* 568 */                       oI10i0Il = oI10i0Il6;
/* 570 */                       i1ol0OoiOI1o2.I00iiI = oI10i0Il;
/* 572 */                       VarHandle.storeStoreFence();
/* 575 */                       iloI0lOlll13.I00iio(i1ol0OoiOI1o2);
                                obj = i1ol0OoiOI1o2;
                            } else {
/* 579 */                       oI10i0Il = oI10i0Il6;
                                obj = objI00O0i0ii8;
                            }
/* 587 */                   O11iol o11iol = new O11iol(9);
/* 590 */                   o11iol.I00iiI = iO1OIo01l12;
/* 592 */                   o11iol.I00iiO = conversation;
/* 594 */                   o11iol.I00iio = oI10i0Il7;
/* 596 */                   o11iol.I00ilI0I1 = oI10i0Il;
/* 598 */                   VarHandle.storeStoreFence();
/* 604 */                   IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(35039269, o11iol, iloI0lOlll13);
/* 612 */                   I0Il1IoilolI i0Il1IoilolI2 = new I0Il1IoilolI(21);
/* 615 */                   i0Il1IoilolI2.I00iiI = oI10i0Il;
/* 617 */                   VarHandle.storeStoreFence();
/* 623 */                   IOii1l iOii1lI00000oOI4 = iiioOl1O.I00000oOI(-200234269, i0Il1IoilolI2, iloI0lOlll13);
/* 631 */                   I0Il1IoilolI i0Il1IoilolI3 = new I0Il1IoilolI(22);
/* 634 */                   i0Il1IoilolI3.I00iiI = oI10i0Il7;
/* 636 */                   VarHandle.storeStoreFence();
/* 668 */                   iOIil10l.I00000oIO((IllOOo00lI) obj, iOii1lI00000oOI3, null, iOii1lI00000oOI4, null, i1OiooO.I000o00OoI0I, iiioOl1O.I00000oOI(-553144576, i0Il1IoilolI3, iloI0lOlll13), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 671 */                   IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 674 */                   iloI0lOlll17.I0010I0i(false);
                            iloI0lOlll14 = iloI0lOlll17;
                        }
/* 683 */               if (((Conversation) oI10i0Il4.getValue()) != null) {
/* 688 */                   iloI0lOlll14.I00i01iIIliI(2120378979);
/* 695 */                   Conversation conversation2 = (Conversation) oI10i0Il4.getValue();
/* 701 */                   List list = (List) oI10i0IlI00000oOI2.getValue();
/* 703 */                   Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
                            Object obj3 = objI00O0i0ii9;
/* 707 */                   if (objI00O0i0ii9 == iOO0o0I1l) {
/* 713 */                       I1ol0OoiOI1o i1ol0OoiOI1o3 = new I1ol0OoiOI1o(16);
/* 718 */                       i1ol0OoiOI1o3.I00iiI = oI10i0Il4;
/* 720 */                       VarHandle.storeStoreFence();
/* 723 */                       iloI0lOlll14.I00iio(i1ol0OoiOI1o3);
                                obj3 = i1ol0OoiOI1o3;
                            }
/* 726 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj3;
/* 736 */                   boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(iO1OIo01l12) | iloI0lOlll14.I000OOo1O(context);
/* 737 */                   Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
                            Object obj4 = objI00O0i0ii10;
/* 741 */                   if (zI000OOo1O || objI00O0i0ii10 == iOO0o0I1l) {
/* 749 */                       I0Il0I1o i0Il0I1o2 = new I0Il0I1o(19);
/* 752 */                       i0Il0I1o2.I00iiO = iO1OIo01l12;
/* 754 */                       i0Il0I1o2.I00iiI = context;
/* 756 */                       VarHandle.storeStoreFence();
/* 759 */                       iloI0lOlll14.I00iio(i0Il0I1o2);
                                obj4 = i0Il0I1o2;
                            }
/* 768 */                   I0000O(conversation2, list, illOOo00lI2, (IlliIl1l11O) obj4, iloI0lOlll14, 384);
/* 772 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll14;
                        } else {
/* 780 */                   iloI0lOlll14.I00i01iIIliI(2120653825);
/* 783 */                   iloI0lOlll14.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll14;
                        }
                    } else {
/* 793 */               iloI0lOlll15.I00OilO00Il();
/* 796 */               iO1OIo01l12 = iO1OIo01l1;
                        iloI0lOlll12 = iloI0lOlll15;
                    }
/* 798 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 802 */           if (oOloioIlI001IO000 != null) {
/* 808 */               O11iol o11iol2 = new O11iol(8);
/* 813 */               o11iol2.I00iiI = illOOo00lI;
/* 817 */               o11iol2.I00iiO = oI1o1o1iO1l;
/* 821 */               o11iol2.I00iio = o1ol100o0O;
/* 823 */               o11iol2.I00ilI0I1 = iO1OIo01l12;
/* 825 */               VarHandle.storeStoreFence();
/* 828 */               oOloioIlI001IO000.I0000O = o11iol2;
                    }
                }

                public static final void I00000oOI(Conversation conversation, IllOOo00lI illOOo00lI, Function1 function1, Function1 function12, IloI0lOlll1 iloI0lOlll1, int i) {
/* 6 */             iloI0lOlll1.I00i0O(-259296178);
/* 42 */            int i2 = (iloI0lOlll1.I000II(conversation) ? 4 : 2) | i | (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(function12) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 59 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 61 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 67 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 77 */                    objI00O0i0ii = new SimpleDateFormat("MMM d, h:mm a", Locale.getDefault());
/* 80 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 96 */                O1ooiI111i o1ooiI111iI00000oOI = i1Ioo1o0.I00000oOI(Ol0iOOO0.I0000oI00(O1ooIo101ll.I00000oIO, 1.0f), false, null, illOOo00lI, 15);
/* 102 */               OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(12.0f);
/* 118 */               IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00IioO0OiOi, iloI0lOlll1);
/* 125 */               IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(5);
/* 128 */               iO1oIiIi1O01.I00iiO = conversation;
/* 130 */               iO1oIiIi1O01.I00iio = (SimpleDateFormat) objI00O0i0ii;
/* 132 */               iO1oIiIi1O01.I00iiI = function12;
/* 134 */               iO1oIiIi1O01.I00ilI0I1 = function1;
/* 136 */               VarHandle.storeStoreFence();
/* 155 */               iOl111l1l.I00000oOI(o1ooiI111iI00000oOI, oiI111II00000oOI, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(-1171921728, iO1oIiIi1O01, iloI0lOlll1), iloI0lOlll1, 196608, 24);
                    } else {
/* 159 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 162 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 166 */           if (oOloioIlI001IO000 != null) {
/* 171 */               O11iol o11iol = new O11iol(7);
/* 174 */               o11iol.I00iiI = conversation;
/* 176 */               o11iol.I00iiO = illOOo00lI;
/* 178 */               o11iol.I00iio = function1;
/* 180 */               o11iol.I00ilI0I1 = function12;
/* 182 */               VarHandle.storeStoreFence();
/* 185 */               oOloioIlI001IO000.I0000O = o11iol;
                    }
                }

                public static final void I0000Il00O(Message message, IloI0lOlll1 iloI0lOlll1, int i) {
                    boolean z;
                    long j;
                    long j2;
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(-2108846302);
/* 21 */            int i2 = i | (iloI0lOlll12.I000II(message) ? 4 : 2);
/* 37 */            if (iloI0lOlll12.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 45 */                boolean zI0000O = O0000Ioio00.I0000O(message.getRole(), "user");
/* 51 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 53 */                O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 66 */                IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, zI0000O ? i1O01oOIoI0I.I00o101lO : i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 72 */                int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 76 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 80 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000oI00);
/* 86 */                IOl0oi0lOl1.I000lI.getClass();
/* 89 */                iloI0lOlll12.I00i0oil();
/* 92 */                boolean z2 = iloI0lOlll12.I00O10llo;
/* 94 */                Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 96 */                if (z2) {
/* 98 */                    iloI0lOlll12.I000l1(iloi111);
                        } else {
/* 102 */                   iloI0lOlll12.I00io1l();
                        }
/* 105 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 107 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll12, iOOlo1O01OI00000oIO);
/* 110 */               IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 112 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll12, oO0lO0l0I000lI);
/* 115 */               Integer numValueOf = Integer.valueOf(iHashCode);
/* 119 */               IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 121 */               li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll12, numValueOf);
/* 124 */               li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 127 */               IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 129 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 137 */               String str = zI0000O ? "You" : "Assistant";
/* 143 */               Oo0lloOiiIOI oo0lloOiiIOI = liIoOiiO1Oi.I000OOo1O(iloI0lOlll12).I000oI1ioi;
/* 247 */               Oo0i1oIIoOO.I00000oOI(str, iO01II.I000II(o1ooIo101ll, 4.0f, 2.0f), IOOiio0i.I0000Il00O(0.6f, liIoOiiO1Oi.I000O01llI0(iloI0lOlll12).I0010o), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll1, 48, 0, 131064);
/* 270 */               O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(o1ooIo101ll, OiI11O1i1.I0000Il00O(16.0f, 16.0f, zI0000O ? 4.0f : 16.0f, zI0000O ? 16.0f : 4.0f));
/* 274 */               if (zI0000O) {
/* 279 */                   iloI0lOlll1.I00i01iIIliI(637951880);
/* 286 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0000Il00O;
/* 288 */                   z = false;
/* 289 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 293 */                   z = false;
/* 297 */                   iloI0lOlll1.I00i01iIIliI(637954060);
/* 304 */                   j = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00IO1oi11O;
/* 306 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 326 */               O1ooiI111i o1ooiI111iI0000oI002 = Ol0iOOO0.I0000oI00(iO01II.I000II(i0I1I0.I00000oOI(o1ooiI111iI00000oIO, j, iO0ioilo.I00000oIO), 14.0f, 10.0f), 0.85f);
/* 332 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, z);
/* 338 */               int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 342 */               OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 346 */               O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000oI002);
/* 350 */               iloI0lOlll1.I00i0oil();
/* 355 */               if (iloI0lOlll1.I00O10llo) {
/* 359 */                   iloI0lOlll1.I000l1(iloi111);
                        } else {
/* 365 */                   iloI0lOlll1.I00io1l();
                        }
/* 369 */               li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 374 */               li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 379 */               IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 384 */               li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 387 */               String content = message.getContent();
/* 395 */               Oo0lloOiiIOI oo0lloOiiIOI2 = liIoOiiO1Oi.I000OOo1O(iloI0lOlll1).I000iOII;
/* 397 */               if (zI0000O) {
/* 402 */                   iloI0lOlll1.I00i01iIIliI(-1249584880);
/* 409 */                   j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0000O;
/* 412 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 420 */                   iloI0lOlll1.I00i01iIIliI(-1249582777);
/* 427 */                   j2 = liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00100o1O0lo;
/* 429 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 466 */               Oo0i1oIIoOO.I00000oOI(content, null, j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI2, iloI0lOlll1, 0, 0, 131066);
/* 469 */               iloI0lOlll12 = iloI0lOlll1;
/* 472 */               iloI0lOlll12.I0010I0i(true);
/* 475 */               iloI0lOlll12.I0010I0i(true);
                    } else {
/* 479 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 482 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 486 */           if (oOloioIlI001IO000 != null) {
/* 492 */               I00oooO i00oooO = new I00oooO(9);
/* 497 */               i00oooO.I00iiI = message;
/* 499 */               VarHandle.storeStoreFence();
/* 502 */               oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }

                public static final void I0000O(Conversation conversation, List list, IllOOo00lI illOOo00lI, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 14 */            iloI0lOlll1.I00i0O(-1563708213);
/* 21 */            int i2 = 4;
/* 52 */            int i3 = i | (iloI0lOlll1.I000II(conversation) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(list) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 68 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 80 */                long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100l0;
/* 84 */                IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(i2);
/* 87 */                iO1oIiIi1O01.I00iiO = list;
/* 89 */                iO1oIiIi1O01.I00iio = illiIl1l11O;
/* 91 */                iO1oIiIi1O01.I00iiI = conversation;
/* 93 */                iO1oIiIi1O01.I00ilI0I1 = illOOo00lI;
/* 95 */                VarHandle.storeStoreFence();
/* 126 */               l1OloIOiO01.I00000oIO(illOOo00lI, null, null, 0.0f, false, null, j, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(-1419551699, iO1oIiIi1O01, iloI0lOlll1), iloI0lOlll1, 6, 3072, 8126);
                    } else {
/* 130 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 133 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 137 */           if (oOloioIlI001IO000 != null) {
/* 142 */               O11iol o11iol = new O11iol(6);
/* 145 */               o11iol.I00iiI = conversation;
/* 147 */               o11iol.I00iiO = list;
/* 149 */               o11iol.I00iio = illOOo00lI;
/* 153 */               o11iol.I00ilI0I1 = illiIl1l11O;
/* 155 */               VarHandle.storeStoreFence();
/* 158 */               oOloioIlI001IO000.I0000O = o11iol;
                    }
                }
            }
