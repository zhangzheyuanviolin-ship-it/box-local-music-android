            package p000;

            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I0O0l00olII {
                public static final List I00000oIO = IOOi1I.I000O01llI0("Info", "Scripts");
                public static final String I00000oOI = "- [fieldName]: [Data type (String, Number, Array)] - [short description]";
                public static final String I0000Il00O = "- [fieldName]: [Data type (String, Number, Array)] - [short description]";

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v14 */
                /* JADX WARN: Type inference failed for: r4v15 */
                public static final void I00000oIO(Ol0o1OiOIIIl ol0o1OiOIIIl, int i, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    IllOOo00lI illOOo00lI3;
                    IllOOo00lI illOOo00lI4;
                    int i4;
                    ?? r4;
                    IloI0lOlll1 iloI0lOlll12;
                    IOO0o0I1l iOO0o0I1l;
                    OI10i0Il oI10i0Il;
                    Ol0ioI1iI ol0ioI1iI;
                    OI10i0Il oI10i0Il2;
                    Ii0110 ii0110;
                    Ol1OlloIO ol1OlloIO;
                    OI10i0Il oI10i0Il3;
                    OI10i0Il oI10i0Il4;
                    Ol1o1llOII ol1o1llOII;
                    Ol0ioI1iI ol0ioI1iI2;
                    Ol010000lo00 ol010000lo00;
                    int i5;
                    OI10i0Il oI10i0Il5;
                    OI10i0Il oI10i0Il6;
                    OI10i0Il oI10i0Il7;
                    OI10i0Il oI10i0Il8;
                    OI10i0Il oI10i0Il9;
                    OI10i0Il oI10i0Il10;
                    OI10i0Il oI10i0Il11;
                    OI10i0Il oI10i0Il12;
                    OI10i0Il oI10i0Il13;
                    Ol010000lo00 ol010000lo002;
                    IOO0o0I1l iOO0o0I1l2;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il14;
                    Object obj;
                    String strI0010o;
                    String strI001IO000;
                    String strI0010o2;
                    String strI001i1O0Ol;
/* 9 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 16 */            iloI0lOlll14.I00i0O(-1336894938);
/* 22 */            if ((i2 & 6) == 0) {
/* 33 */                i3 = (iloI0lOlll14.I000OOo1O(ol0o1OiOIIIl) ? 4 : 2) | i2;
                    } else {
/* 35 */                i3 = i2;
                    }
/* 38 */            if ((i2 & 48) == 0) {
/* 51 */                i3 |= iloI0lOlll14.I0000oI00(i) ? 32 : 16;
                    }
/* 54 */            if ((i2 & 384) == 0) {
/* 67 */                i3 |= iloI0lOlll14.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            if ((i2 & 3072) == 0) {
/* 83 */                i3 |= iloI0lOlll14.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 84 */            int i6 = i3;
/* 100 */           if (iloI0lOlll14.I00OIl(i6 & 1, (i6 & 1171) != 1170)) {
/* 104 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(ol0o1OiOIIIl.I0000oI00, iloI0lOlll14);
/* 108 */               Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 112 */               IOO0o0I1l iOO0o0I1l3 = IOl11li.I00000oIO;
/* 114 */               if (objI00O0i0ii == iOO0o0I1l3) {
/* 118 */                   objI00O0i0ii = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 122 */                   iloI0lOlll14.I00iio(objI00O0i0ii);
                        }
/* 125 */               OI10i0Il oI10i0Il15 = (OI10i0Il) objI00O0i0ii;
/* 128 */               Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll14);
/* 132 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
/* 138 */               if (objI00O0i0ii2 == iOO0o0I1l3) {
/* 152 */                   Ol0oI1llIloI ol0oI1llIloI = (Ol0oI1llIloI) IOOi0Ool1i.I00II0oii1o(i, ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I00000oOI);
/* 161 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(ol0oI1llIloI != null ? ol0oI1llIloI.I00000oIO : null);
/* 165 */                   iloI0lOlll14.I00iio(objI00O0i0ii2);
                        }
/* 168 */               OI10i0Il oI10i0Il16 = (OI10i0Il) objI00O0i0ii2;
/* 170 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
/* 174 */               String str = "";
/* 176 */               if (objI00O0i0ii3 == iOO0o0I1l3) {
/* 182 */                   Ol0ioI1iI ol0ioI1iI3 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 184 */                   if (ol0ioI1iI3 == null || (strI001i1O0Ol = ol0ioI1iI3.I001i1O0Ol()) == null) {
/* 174 */                       strI001i1O0Ol = "";
                            }
/* 194 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(strI001i1O0Ol);
/* 198 */                   iloI0lOlll14.I00iio(objI00O0i0ii3);
                        }
/* 201 */               OI10i0Il oI10i0Il17 = (OI10i0Il) objI00O0i0ii3;
/* 203 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
/* 207 */               if (objI00O0i0ii4 == iOO0o0I1l3) {
/* 213 */                   Ol0ioI1iI ol0ioI1iI4 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 215 */                   if (ol0ioI1iI4 == null || (strI0010o2 = ol0ioI1iI4.I0010o()) == null) {
/* 174 */                       strI0010o2 = "";
                            }
/* 225 */                   objI00O0i0ii4 = lOO00IiI0li.I00000oIO(strI0010o2);
/* 229 */                   iloI0lOlll14.I00iio(objI00O0i0ii4);
                        }
/* 232 */               OI10i0Il oI10i0Il18 = (OI10i0Il) objI00O0i0ii4;
/* 234 */               Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
/* 238 */               if (objI00O0i0ii5 == iOO0o0I1l3) {
/* 244 */                   Ol0ioI1iI ol0ioI1iI5 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 246 */                   if (ol0ioI1iI5 == null || (strI001IO000 = ol0ioI1iI5.I001IO000()) == null) {
/* 174 */                       strI001IO000 = "";
                            }
/* 256 */                   objI00O0i0ii5 = lOO00IiI0li.I00000oIO(strI001IO000);
/* 260 */                   iloI0lOlll14.I00iio(objI00O0i0ii5);
                        }
/* 263 */               OI10i0Il oI10i0Il19 = (OI10i0Il) objI00O0i0ii5;
/* 265 */               Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
/* 269 */               if (objI00O0i0ii6 == iOO0o0I1l3) {
/* 273 */                   objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 277 */                   iloI0lOlll14.I00iio(objI00O0i0ii6);
                        }
/* 280 */               OI10i0Il oI10i0Il20 = (OI10i0Il) objI00O0i0ii6;
/* 282 */               Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
/* 286 */               if (objI00O0i0ii7 == iOO0o0I1l3) {
/* 288 */                   objI00O0i0ii7 = lOO00IiI0li.I00000oIO("");
/* 292 */                   iloI0lOlll14.I00iio(objI00O0i0ii7);
                        }
/* 295 */               OI10i0Il oI10i0Il21 = (OI10i0Il) objI00O0i0ii7;
/* 299 */               Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
/* 303 */               if (objI00O0i0ii8 == iOO0o0I1l3) {
/* 307 */                   objI00O0i0ii8 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 311 */                   iloI0lOlll14.I00iio(objI00O0i0ii8);
                        }
/* 314 */               OI10i0Il oI10i0Il22 = (OI10i0Il) objI00O0i0ii8;
/* 318 */               Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
/* 322 */               if (objI00O0i0ii9 == iOO0o0I1l3) {
/* 326 */                   objI00O0i0ii9 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 330 */                   iloI0lOlll14.I00iio(objI00O0i0ii9);
                        }
/* 333 */               OI10i0Il oI10i0Il23 = (OI10i0Il) objI00O0i0ii9;
/* 337 */               Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
/* 341 */               if (objI00O0i0ii10 == iOO0o0I1l3) {
/* 343 */                   objI00O0i0ii10 = iIO0iiOiOl0l.I000II(iloI0lOlll14);
/* 347 */                   iloI0lOlll14.I00iio(objI00O0i0ii10);
                        }
/* 350 */               Ii0110 ii01102 = (Ii0110) objI00O0i0ii10;
/* 354 */               Object objI00O0i0ii11 = iloI0lOlll14.I00O0i0ii();
/* 358 */               if (objI00O0i0ii11 == iOO0o0I1l3) {
/* 362 */                   objI00O0i0ii11 = new Ol1OlloIO();
/* 365 */                   iloI0lOlll14.I00iio(objI00O0i0ii11);
                        }
/* 368 */               Ol1OlloIO ol1OlloIO2 = (Ol1OlloIO) objI00O0i0ii11;
/* 378 */               Ol0ioI1iI ol0ioI1iI6 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 382 */               Object objI00O0i0ii12 = iloI0lOlll14.I00O0i0ii();
/* 386 */               if (objI00O0i0ii12 == iOO0o0I1l3) {
/* 392 */                   Ol0ioI1iI ol0ioI1iI7 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 394 */                   if (ol0ioI1iI7 != null && (strI0010o = ol0ioI1iI7.I0010o()) != null) {
/* 403 */                       str = strI0010o;
                            }
/* 405 */                   objI00O0i0ii12 = lOO00IiI0li.I00000oIO(str);
/* 409 */                   iloI0lOlll14.I00iio(objI00O0i0ii12);
                        }
/* 412 */               OI10i0Il oI10i0Il24 = (OI10i0Il) objI00O0i0ii12;
/* 416 */               Object objI00O0i0ii13 = iloI0lOlll14.I00O0i0ii();
/* 420 */               if (objI00O0i0ii13 == iOO0o0I1l3) {
/* 424 */                   objI00O0i0ii13 = lOO00IiI0li.I00000oIO(I00000oOI);
/* 428 */                   iloI0lOlll14.I00iio(objI00O0i0ii13);
                        }
/* 431 */               OI10i0Il oI10i0Il25 = (OI10i0Il) objI00O0i0ii13;
/* 435 */               Object objI00O0i0ii14 = iloI0lOlll14.I00O0i0ii();
/* 439 */               if (objI00O0i0ii14 == iOO0o0I1l3) {
/* 443 */                   objI00O0i0ii14 = lOO00IiI0li.I00000oIO(I0000Il00O);
/* 447 */                   iloI0lOlll14.I00iio(objI00O0i0ii14);
                        }
/* 450 */               OI10i0Il oI10i0Il26 = (OI10i0Il) objI00O0i0ii14;
/* 454 */               Object objI00O0i0ii15 = iloI0lOlll14.I00O0i0ii();
/* 458 */               if (objI00O0i0ii15 == iOO0o0I1l3) {
/* 462 */                   objI00O0i0ii15 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 466 */                   iloI0lOlll14.I00iio(objI00O0i0ii15);
                        }
/* 469 */               OI10i0Il oI10i0Il27 = (OI10i0Il) objI00O0i0ii15;
/* 473 */               Object objI00O0i0ii16 = iloI0lOlll14.I00O0i0ii();
/* 477 */               if (objI00O0i0ii16 == iOO0o0I1l3) {
/* 481 */                   objI00O0i0ii16 = new Ol1o1llOII();
/* 484 */                   iloI0lOlll14.I00iio(objI00O0i0ii16);
                        }
/* 487 */               Ol1o1llOII ol1o1llOII2 = (Ol1o1llOII) objI00O0i0ii16;
/* 491 */               Object objI00O0i0ii17 = iloI0lOlll14.I00O0i0ii();
/* 495 */               if (objI00O0i0ii17 == iOO0o0I1l3) {
/* 497 */                   objI00O0i0ii17 = lOO00IiI0li.I00000oIO(null);
/* 501 */                   iloI0lOlll14.I00iio(objI00O0i0ii17);
                        }
/* 504 */               OI10i0Il oI10i0Il28 = (OI10i0Il) objI00O0i0ii17;
/* 514 */               Ol0ioI1iI ol0ioI1iI8 = (Ol0ioI1iI) oI10i0Il16.getValue();
/* 516 */               boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(ol0o1OiOIIIl);
/* 522 */               Object objI00O0i0ii18 = iloI0lOlll14.I00O0i0ii();
/* 526 */               if (zI000OOo1O || objI00O0i0ii18 == iOO0o0I1l3) {
/* 577 */                   iOO0o0I1l = iOO0o0I1l3;
/* 579 */                   oI10i0Il = oI10i0Il21;
/* 581 */                   ol0ioI1iI = ol0ioI1iI8;
/* 583 */                   oI10i0Il2 = oI10i0Il22;
/* 585 */                   ii0110 = ii01102;
/* 587 */                   ol1OlloIO = ol1OlloIO2;
/* 589 */                   oI10i0Il3 = oI10i0Il25;
/* 591 */                   oI10i0Il4 = oI10i0Il26;
/* 593 */                   ol1o1llOII = ol1o1llOII2;
/* 595 */                   ol0ioI1iI2 = ol0ioI1iI6;
/* 597 */                   ol010000lo00 = ol010000lo00I00000oOI;
/* 599 */                   i5 = i6;
/* 601 */                   oI10i0Il5 = oI10i0Il17;
/* 603 */                   oI10i0Il6 = oI10i0Il23;
/* 605 */                   oI10i0Il7 = oI10i0Il16;
/* 607 */                   oI10i0Il8 = oI10i0Il15;
/* 609 */                   oI10i0Il9 = oI10i0Il24;
/* 611 */                   oI10i0Il10 = oI10i0Il27;
/* 613 */                   oI10i0Il11 = oI10i0Il20;
/* 615 */                   oI10i0Il12 = oI10i0Il18;
/* 616 */                   oI10i0Il13 = oI10i0Il28;
/* 618 */                   objI00O0i0ii18 = new I0O0Ooi10l(ol0o1OiOIIIl, oI10i0Il7, oI10i0Il10, ol1o1llOII, oI10i0Il13, (IOoil1iiIilo) null);
/* 621 */                   iloI0lOlll14.I00iio(objI00O0i0ii18);
                        } else {
/* 531 */                   iOO0o0I1l = iOO0o0I1l3;
/* 533 */                   ol0ioI1iI = ol0ioI1iI8;
/* 534 */                   i5 = i6;
/* 536 */                   oI10i0Il = oI10i0Il21;
/* 538 */                   oI10i0Il5 = oI10i0Il17;
/* 540 */                   oI10i0Il2 = oI10i0Il22;
/* 542 */                   ii0110 = ii01102;
/* 544 */                   ol1OlloIO = ol1OlloIO2;
/* 546 */                   oI10i0Il3 = oI10i0Il25;
/* 548 */                   oI10i0Il4 = oI10i0Il26;
/* 550 */                   ol1o1llOII = ol1o1llOII2;
/* 552 */                   ol0ioI1iI2 = ol0ioI1iI6;
/* 554 */                   ol010000lo00 = ol010000lo00I00000oOI;
/* 556 */                   oI10i0Il8 = oI10i0Il15;
/* 558 */                   oI10i0Il6 = oI10i0Il23;
/* 560 */                   oI10i0Il7 = oI10i0Il16;
/* 562 */                   oI10i0Il10 = oI10i0Il27;
/* 564 */                   oI10i0Il9 = oI10i0Il24;
/* 566 */                   oI10i0Il11 = oI10i0Il20;
/* 568 */                   oI10i0Il12 = oI10i0Il18;
/* 569 */                   oI10i0Il13 = oI10i0Il28;
                        }
/* 626 */               iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii18, iloI0lOlll14, ol0ioI1iI);
/* 631 */               I0Io10o i0Io10o = new I0Io10o();
/* 634 */               i0Io10o.I00iOIl = ol1OlloIO;
/* 636 */               i0Io10o.I00iiI = ol0ioI1iI2;
/* 638 */               i0Io10o.I00iiO = ii0110;
/* 640 */               i0Io10o.I00iio = ol1o1llOII;
/* 642 */               i0Io10o.I00ilI0I1 = ol0o1OiOIIIl;
/* 644 */               i0Io10o.I00ilO0 = oI10i0Il5;
/* 646 */               i0Io10o.I00io1l = oI10i0Il2;
/* 648 */               i0Io10o.I00ioIO = oI10i0Il12;
/* 650 */               i0Io10o.I00l0I0l0lO1 = oI10i0Il19;
/* 652 */               i0Io10o.I00l0OO0IO = oI10i0Il10;
/* 654 */               i0Io10o.I00li1OI = oI10i0Il13;
/* 658 */               i0Io10o.I00ll1 = oI10i0Il9;
/* 662 */               i0Io10o.I00lli11 = oI10i0Il3;
/* 666 */               i0Io10o.I00lll10 = oI10i0Il4;
/* 668 */               i0Io10o.I00o0iI0io1 = oI10i0Il7;
/* 670 */               Ol010000lo00 ol010000lo003 = ol010000lo00;
/* 672 */               i0Io10o.I00o0l1o1o0 = ol010000lo003;
/* 676 */               i0Io10o.I00o101lO = illOOo00lI;
/* 678 */               OI10i0Il oI10i0Il29 = oI10i0Il8;
/* 680 */               i0Io10o.I00oI0i = oI10i0Il29;
/* 682 */               VarHandle.storeStoreFence();
/* 688 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(803555332, i0Io10o, iloI0lOlll14);
/* 692 */               int i7 = 6;
/* 707 */               OI10i0Il oI10i0Il30 = oI10i0Il11;
/* 711 */               OI10i0Il oI10i0Il31 = oI10i0Il;
/* 734 */               illOOo00lI4 = illOOo00lI2;
/* 737 */               i4 = i2;
/* 739 */               l1OloIOiO01.I00000oIO(illOOo00lI, null, ol010000lo003, 0.0f, false, null, 0L, 0L, 0L, null, null, null, iOii1lI00000oOI, iloI0lOlll14, (i5 >> 6) & 14, 3078, 7162);
/* 744 */               IloI0lOlll1 iloI0lOlll15 = iloI0lOlll14;
/* 756 */               if (((Boolean) oI10i0Il30.getValue()).booleanValue()) {
/* 761 */                   iloI0lOlll15.I00i01iIIliI(-193702521);
/* 764 */                   Object objI00O0i0ii19 = iloI0lOlll15.I00O0i0ii();
/* 768 */                   IOO0o0I1l iOO0o0I1l4 = iOO0o0I1l;
                            Object obj2 = objI00O0i0ii19;
/* 770 */                   if (objI00O0i0ii19 == iOO0o0I1l4) {
/* 774 */                       I0Il0000oli i0Il0000oli = new I0Il0000oli(i7);
/* 777 */                       i0Il0000oli.I00iiI = oI10i0Il30;
/* 779 */                       VarHandle.storeStoreFence();
/* 782 */                       iloI0lOlll15.I00iio(i0Il0000oli);
                                obj2 = i0Il0000oli;
                            }
/* 790 */                   I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(5);
/* 793 */                   i0Il1IoilolI.I00iiI = oI10i0Il30;
/* 795 */                   VarHandle.storeStoreFence();
/* 801 */                   IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-957326727, i0Il1IoilolI, iloI0lOlll15);
/* 807 */                   I0Il1IoilolI i0Il1IoilolI2 = new I0Il1IoilolI(i7);
/* 810 */                   i0Il1IoilolI2.I00iiI = oI10i0Il31;
/* 812 */                   VarHandle.storeStoreFence();
/* 847 */                   iOO0o0I1l2 = iOO0o0I1l4;
/* 849 */                   ol010000lo002 = ol010000lo003;
/* 850 */                   illOOo00lI3 = illOOo00lI;
/* 852 */                   iOIil10l.I00000oIO((IllOOo00lI) obj2, iOii1lI00000oOI2, null, null, null, i1O1i1.I0000Il00O, iiioOl1O.I00000oOI(496867412, i0Il1IoilolI2, iloI0lOlll15), null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1769526, 16284);
/* 855 */                   IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 857 */                   z = false;
/* 858 */                   iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 862 */                   illOOo00lI3 = illOOo00lI;
/* 864 */                   ol010000lo002 = ol010000lo003;
/* 866 */                   iOO0o0I1l2 = iOO0o0I1l;
/* 868 */                   z = false;
/* 872 */                   iloI0lOlll15.I00i01iIIliI(-193405572);
/* 875 */                   iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 888 */               if (((Boolean) oI10i0Il6.getValue()).booleanValue()) {
/* 893 */                   iloI0lOlll13.I00i01iIIliI(-193350516);
/* 896 */                   Object objI00O0i0ii20 = iloI0lOlll13.I00O0i0ii();
/* 900 */                   if (objI00O0i0ii20 == iOO0o0I1l2) {
/* 906 */                       I0Il0000oli i0Il0000oli2 = new I0Il0000oli(16);
/* 909 */                       oI10i0Il14 = oI10i0Il6;
/* 911 */                       i0Il0000oli2.I00iiI = oI10i0Il14;
/* 913 */                       VarHandle.storeStoreFence();
/* 916 */                       iloI0lOlll13.I00iio(i0Il0000oli2);
                                obj = i0Il0000oli2;
                            } else {
/* 920 */                       oI10i0Il14 = oI10i0Il6;
                                obj = objI00O0i0ii20;
                            }
/* 927 */                   O11l0o011lO1 o11l0o011lO1 = new O11l0o011lO1(1);
/* 930 */                   o11l0o011lO1.I00iiI = ii0110;
/* 932 */                   o11l0o011lO1.I00iiO = ol010000lo002;
/* 934 */                   o11l0o011lO1.I00iio = illOOo00lI3;
/* 936 */                   o11l0o011lO1.I00ilI0I1 = oI10i0Il29;
/* 938 */                   o11l0o011lO1.I00ilO0 = oI10i0Il14;
/* 940 */                   VarHandle.storeStoreFence();
/* 946 */                   IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(-293347792, o11l0o011lO1, iloI0lOlll13);
/* 954 */                   I0Il1IoilolI i0Il1IoilolI3 = new I0Il1IoilolI(9);
/* 957 */                   i0Il1IoilolI3.I00iiI = oI10i0Il14;
/* 959 */                   VarHandle.storeStoreFence();
/* 994 */                   boolean z2 = z;
/* 999 */                   iOIil10l.I00000oIO((IllOOo00lI) obj, iOii1lI00000oOI3, null, iiioOl1O.I00000oOI(2071117678, i0Il1IoilolI3, iloI0lOlll13), null, i1O1i1.I0001Ioi1lo, i1O1i1.I000II, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1772598, 16276);
/* 1002 */                  IloI0lOlll1 iloI0lOlll17 = iloI0lOlll1;
/* 1004 */                  iloI0lOlll17.I0010I0i(z2);
                            r4 = z2;
                            iloI0lOlll12 = iloI0lOlll17;
                        } else {
/* 1008 */                  boolean z3 = z;
/* 1012 */                  iloI0lOlll13.I00i01iIIliI(-192474084);
/* 1015 */                  iloI0lOlll13.I0010I0i(z3);
                            r4 = z3;
                            iloI0lOlll12 = iloI0lOlll13;
                        }
                    } else {
/* 1019 */              illOOo00lI3 = illOOo00lI;
/* 1020 */              illOOo00lI4 = illOOo00lI2;
/* 1021 */              i4 = i2;
/* 1022 */              r4 = 0;
/* 1023 */              iloI0lOlll14.I00OilO00Il();
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 1026 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1030 */          if (oOloioIlI001IO000 != null) {
/* 1034 */              I0O0Ol1O0O i0O0Ol1O0O = new I0O0Ol1O0O(r4);
/* 1037 */              i0O0Ol1O0O.I00ilI0I1 = ol0o1OiOIIIl;
/* 1041 */              i0O0Ol1O0O.I00iiO = i;
/* 1043 */              i0O0Ol1O0O.I00iiI = illOOo00lI3;
/* 1045 */              i0O0Ol1O0O.I00ilO0 = illOOo00lI4;
/* 1047 */              i0O0Ol1O0O.I00iio = i4;
/* 1049 */              VarHandle.storeStoreFence();
/* 1052 */              oOloioIlI001IO000.I0000O = i0O0Ol1O0O;
                    }
                }

                public static final boolean I00000oOI(OI10i0Il oI10i0Il) {
/* 7 */             return ((Boolean) oI10i0Il.getValue()).booleanValue();
                }

                public static final void I0000Il00O(Ii0110 ii0110, Map map, String str, Function1 function1, IllOOo00lI illOOo00lI, IlliIl1l11O illiIl1l11O, Function1 function12, Function1 function13, String str2, String str3, Function1 function14, String str4, Function1 function15, String str5, Function1 function16, Ol1OlloIO ol1OlloIO, O1ooiI111i o1ooiI111i, IloI0lOlll1 iloI0lOlll1, int i) {
                    Function1 function17;
                    String str6;
                    O1ooiI111i o1ooiI111i2;
                    Map map2;
                    IloI0lOlll1 iloI0lOlll12;
                    IlliIl1l11O illiIl1l11O2;
                    Ii0110 ii01102;
                    Ol1OlloIO ol1OlloIO2;
                    O1ooiI111i o1ooiI111i3;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    OI10i0Il oI10i0Il;
                    List list;
                    IOioOOi0I iOioOOi0I4;
                    OI10i0Il oI10i0Il2;
                    OI10i0Il oI10i0Il3;
                    OI10i0Il oI10i0Il4;
                    int i2;
                    Map map3;
                    IOO0IOIll iOO0IOIll;
                    int i3;
                    OI10i0Il oI10i0Il5;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il6;
                    Object obj;
                    OI10i0Il oI10i0Il7;
                    Object obj2;
                    OI10i0Il oI10i0Il8;
                    Object obj3;
                    Object obj4;
                    int i4;
                    Object obj5;
                    boolean z;
                    Ol1OlloIO ol1OlloIO3;
                    Object obj6;
                    Function1 function18 = function13;
                    String str7 = str3;
                    String str8 = str4;
                    String str9 = str5;
/* 1 */             IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
                    IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ioIO;
                    IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ilO0;
                    IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00io1l;
                    iloI0lOlll1.I00i0O(528299486);
                    int i5 = i | (iloI0lOlll1.I000OOo1O(ii0110) ? 4 : 2) | (iloI0lOlll1.I000II(str) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(function18) ? 8388608 : 4194304) | (iloI0lOlll1.I000II(str2) ? 67108864 : 33554432) | (iloI0lOlll1.I000II(str7) ? 536870912 : 268435456);
                    int i6 = 221574 | (iloI0lOlll1.I000II(str8) ? 32 : 16) | (iloI0lOlll1.I000II(str9) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000II(o1ooiI111i) ? 1048576 : 524288);
                    if (iloI0lOlll1.I00OIl(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 599187) == 599186) ? false : true)) {
/* 2 */                 List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(map.keySet());
/* 3 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
                        IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        if (objI00O0i0ii == iOO0o0I1l) {
/* 5 */                     String str10 = (String) map.get(str);
                            if (str10 == null) {
/* 4 */                         str10 = "";
                            }
/* 6 */                     objI00O0i0ii = lOO00IiI0li.I00000oIO(str10);
/* 7 */                     iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 8 */                 OI10i0Il oI10i0Il9 = (OI10i0Il) objI00O0i0ii;
/* 9 */                 Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii2 == iOO0o0I1l) {
/* 11 */                    objI00O0i0ii2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 12 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 13 */                OI10i0Il oI10i0Il10 = (OI10i0Il) objI00O0i0ii2;
/* 14 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii3 == iOO0o0I1l) {
/* 16 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 17 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 18 */                OI10i0Il oI10i0Il11 = (OI10i0Il) objI00O0i0ii3;
/* 19 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii4 == iOO0o0I1l) {
/* 21 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 22 */                    iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 23 */                OI10i0Il oI10i0Il12 = (OI10i0Il) objI00O0i0ii4;
/* 24 */                Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii5 == iOO0o0I1l) {
/* 25 */                    objI00O0i0ii5 = lOO00IiI0li.I00000oIO("");
/* 26 */                    iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 27 */                OI10i0Il oI10i0Il13 = (OI10i0Il) objI00O0i0ii5;
/* 30 */                IOO0IOIll iOO0IOIll2 = (IOO0IOIll) iloI0lOlll1.I000iOII(IOlO0o100i1i.I0001Ioi1lo);
/* 31 */                Map mapI000iOII = O1Oii0O0loo.I000iOII(map);
                        int i7 = i5 & 896;
                        boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(map) | (i7 == 256);
/* 32 */                Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        if (zI000OOo1O || objI00O0i0ii6 == iOO0o0I1l) {
                            o1ooiI111i3 = o1ooiI111i;
                            IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
                            iOioOOi0I = iOioOOi0I5;
                            iOioOOi0I2 = iOioOOi0I7;
                            iOioOOi0I3 = iOioOOi0I8;
                            oI10i0Il = oI10i0Il13;
                            list = listI00iIi0i1o;
                            iOioOOi0I4 = iOioOOi0I6;
                            oI10i0Il2 = oI10i0Il11;
                            oI10i0Il3 = oI10i0Il12;
                            oI10i0Il4 = oI10i0Il9;
                            i2 = i5;
                            map3 = mapI000iOII;
                            iOO0IOIll = iOO0IOIll2;
                            i3 = i7;
                            oI10i0Il5 = oI10i0Il10;
/* 33 */                    objI00O0i0ii6 = new I0O0il1iIl(map, str, oI10i0Il4, (IOoil1iiIilo) null, 0);
/* 34 */                    iloI0lOlll14.I00iio(objI00O0i0ii6);
                            iloI0lOlll13 = iloI0lOlll14;
                        } else {
                            o1ooiI111i3 = o1ooiI111i;
                            iloI0lOlll13 = iloI0lOlll1;
                            i3 = i7;
                            i2 = i5;
                            iOioOOi0I = iOioOOi0I5;
                            iOioOOi0I2 = iOioOOi0I7;
                            iOioOOi0I3 = iOioOOi0I8;
                            oI10i0Il = oI10i0Il13;
                            list = listI00iIi0i1o;
                            iOioOOi0I4 = iOioOOi0I6;
                            oI10i0Il2 = oI10i0Il11;
                            oI10i0Il3 = oI10i0Il12;
                            oI10i0Il4 = oI10i0Il9;
                            map3 = mapI000iOII;
                            iOO0IOIll = iOO0IOIll2;
                            oI10i0Il5 = oI10i0Il10;
                        }
/* 35 */                iIO0iiOiOl0l.I0000oI00(str, map3, (IlliIl1l11O) objI00O0i0ii6, iloI0lOlll13);
/* 36 */                boolean zIsEmpty = map.isEmpty();
                        Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
                        if (zIsEmpty) {
                            iloI0lOlll13.I00i01iIIliI(1811128013);
/* 37 */                    O1ooiI111i o1ooiI111iI0000O = o1ooiI111i3.I0000O(Ol0iOOO0.I0000Il00O);
/* 39 */                    O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00io1l, false);
/* 41 */                    int iHashCode = Long.hashCode(iloI0lOlll13.I00OI1);
/* 42 */                    OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll13.I000lI();
/* 43 */                    O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000O);
/* 44 */                    IOl0oi0lOl1.I000lI.getClass();
/* 45 */                    iloI0lOlll13.I00i0oil();
/* 46 */                    if (iloI0lOlll13.I00O10llo) {
/* 47 */                        iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 48 */                        iloI0lOlll13.I00io1l();
                            }
/* 49 */                    li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, o1iOIl0o10I0000Il00O);
/* 50 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI);
/* 51 */                    IIl001iO0Io.I001IIilI0O(iHashCode, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 52 */                    li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1ooiI111iI0000Il00O);
/* 53 */                    iOiO0o0oi.I00000oOI(illOOo00lI, null, false, null, null, null, null, i1O1i1.I000O01llI0, iloI0lOlll13, 805306374, 510);
/* 54 */                    iloI0lOlll13.I0010I0i(true);
/* 55 */                    iloI0lOlll13.I0010I0i(false);
                            ii01102 = ii0110;
                            illiIl1l11O2 = illiIl1l11O;
                            oI10i0Il6 = oI10i0Il5;
                            oI10i0Il7 = oI10i0Il2;
                            oI10i0Il8 = oI10i0Il3;
                            i4 = 4;
                        } else {
/* 56 */                    iloI0lOlll13.I00i01iIIliI(1811532284);
/* 57 */                    O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
                            O1ooiI111i o1ooiI111iI000O01llI0 = iO01II.I000O01llI0(o1ooIo101ll, 0.0f, 16.0f, 1);
                            OI10i0Il oI10i0Il14 = oI10i0Il4;
/* 60 */                    IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll13, 0);
/* 62 */                    int iHashCode2 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 63 */                    OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll13.I000lI();
/* 64 */                    O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI000O01llI0);
/* 65 */                    IOl0oi0lOl1.I000lI.getClass();
/* 66 */                    iloI0lOlll13.I00i0oil();
/* 67 */                    if (iloI0lOlll13.I00O10llo) {
/* 68 */                        iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 69 */                        iloI0lOlll13.I00io1l();
                            }
/* 70 */                    li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, iOOlo1O01OI00000oIO);
/* 71 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI2);
/* 72 */                    IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 73 */                    li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1ooiI111iI0000Il00O2);
/* 74 */                    O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(o1ooIo101ll, 1.0f);
/* 75 */                    II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 77 */                    OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0001Ioi1lo, iI0O000iIl, iloI0lOlll13, 54);
/* 79 */                    int iHashCode3 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 80 */                    OO0lO0l0 oO0lO0l0I000lI3 = iloI0lOlll13.I000lI();
/* 81 */                    O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooiI111iI0000oI00);
/* 82 */                    iloI0lOlll13.I00i0oil();
/* 83 */                    if (iloI0lOlll13.I00O10llo) {
/* 84 */                        iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 85 */                        iloI0lOlll13.I00io1l();
                            }
/* 86 */                    li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO);
/* 87 */                    li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI3);
/* 88 */                    IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 89 */                    li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1ooiI111iI0000Il00O3);
/* 90 */                    Object objI00O0i0ii7 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii7 == iOO0o0I1l) {
/* 92 */                        objI00O0i0ii7 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 93 */                        iloI0lOlll13.I00iio(objI00O0i0ii7);
                            }
/* 94 */                    OI10i0Il oI10i0Il15 = (OI10i0Il) objI00O0i0ii7;
/* 95 */                    boolean zBooleanValue = ((Boolean) oI10i0Il15.getValue()).booleanValue();
/* 96 */                    Object objI00O0i0ii8 = iloI0lOlll13.I00O0i0ii();
                            Object obj7 = objI00O0i0ii8;
                            if (objI00O0i0ii8 == iOO0o0I1l) {
/* 97 */                        I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(7);
                                i0Il0IoIIOll.I00iiI = oI10i0Il15;
                                VarHandle.storeStoreFence();
/* 98 */                        iloI0lOlll13.I00iio(i0Il0IoIIOll);
                                obj7 = i0Il0IoIIOll;
                            }
/* 100 */                   O0io1O o0io1O = new O0io1O(1.0f, true);
/* 101 */                   IO1oIiIi1O01 iO1oIiIi1O01 = new IO1oIiIi1O01(3);
                            iO1oIiIi1O01.I00iiO = str;
                            iO1oIiIi1O01.I00iiI = oI10i0Il15;
                            iO1oIiIi1O01.I00iio = list;
                            iO1oIiIi1O01.I00ilI0I1 = function1;
                            VarHandle.storeStoreFence();
/* 102 */                   ilIoOii1l.I00000oIO(zBooleanValue, (Function1) obj7, o0io1O, iiioOl1O.I00000oOI(-85959606, iO1oIiIi1O01, iloI0lOlll13), iloI0lOlll13, 3120, 0);
/* 103 */                   lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
/* 104 */                   Object objI00O0i0ii9 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii9 == iOO0o0I1l) {
/* 105 */                       I0Il0000oli i0Il0000oli = new I0Il0000oli(9);
                                oI10i0Il6 = oI10i0Il5;
                                i0Il0000oli.I00iiI = oI10i0Il6;
                                VarHandle.storeStoreFence();
/* 106 */                       iloI0lOlll13.I00iio(i0Il0000oli);
                                obj = i0Il0000oli;
                            } else {
                                oI10i0Il6 = oI10i0Il5;
                                obj = objI00O0i0ii9;
                            }
/* 107 */                   iIo1101O.I00000oIO((IllOOo00lI) obj, null, false, null, null, i1O1i1.I000OiO, iloI0lOlll13, 1572870, 62);
/* 108 */                   Object objI00O0i0ii10 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii10 == iOO0o0I1l) {
/* 109 */                       I0Il0000oli i0Il0000oli2 = new I0Il0000oli(10);
                                oI10i0Il7 = oI10i0Il2;
                                i0Il0000oli2.I00iiI = oI10i0Il7;
                                VarHandle.storeStoreFence();
/* 110 */                       iloI0lOlll13.I00iio(i0Il0000oli2);
                                obj2 = i0Il0000oli2;
                            } else {
                                oI10i0Il7 = oI10i0Il2;
                                obj2 = objI00O0i0ii10;
                            }
/* 111 */                   iIo1101O.I00000oIO((IllOOo00lI) obj2, null, false, null, null, i1O1i1.I000iOII, iloI0lOlll13, 1572870, 62);
/* 112 */                   iloI0lOlll13.I0010I0i(true);
/* 113 */                   lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I000II(o1ooIo101ll, 24.0f));
/* 115 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I00000oIO, iI0O000iIl, iloI0lOlll13, 48);
/* 117 */                   int iHashCode4 = Long.hashCode(iloI0lOlll13.I00OI1);
/* 118 */                   OO0lO0l0 oO0lO0l0I000lI4 = iloI0lOlll13.I000lI();
/* 119 */                   O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll13, o1ooIo101ll);
/* 120 */                   iloI0lOlll13.I00i0oil();
/* 121 */                   if (iloI0lOlll13.I00O10llo) {
/* 122 */                       iloI0lOlll13.I000l1(iloi111);
                            } else {
/* 123 */                       iloI0lOlll13.I00io1l();
                            }
/* 124 */                   li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll13, oiI1iiIl1Oi0I00000oIO2);
/* 125 */                   li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll13, oO0lO0l0I000lI4);
/* 126 */                   IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll13, iOioOOi0I4, iloI0lOlll13);
/* 127 */                   li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll13, o1ooiI111iI0000Il00O4);
/* 128 */                   Object objI00O0i0ii11 = iloI0lOlll13.I00O0i0ii();
                            if (objI00O0i0ii11 == iOO0o0I1l) {
/* 129 */                       I0Il0000oli i0Il0000oli3 = new I0Il0000oli(11);
                                oI10i0Il8 = oI10i0Il3;
                                i0Il0000oli3.I00iiI = oI10i0Il8;
                                VarHandle.storeStoreFence();
/* 130 */                       iloI0lOlll13.I00iio(i0Il0000oli3);
                                obj3 = i0Il0000oli3;
                            } else {
                                oI10i0Il8 = oI10i0Il3;
                                obj3 = objI00O0i0ii11;
                            }
/* 132 */                   O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(o1ooIo101ll, 32.0f);
/* 133 */                   OIo1i1 oIo1i1 = Ol0lllilO0Ol.I00000oOI;
/* 134 */                   iOiO0o0oi.I00000oOI((IllOOo00lI) obj3, o1ooiI111iI000II, false, null, null, null, oIo1i1, i1O1i1.I000l1, iloI0lOlll13, 817889334, 380);
/* 135 */                   lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, 8.0f));
                            ii01102 = ii0110;
                            IOO0IOIll iOO0IOIll3 = iOO0IOIll;
                            int i8 = i3;
/* 136 */                   boolean zI000OOo1O2 = iloI0lOlll13.I000OOo1O(ii01102) | iloI0lOlll13.I000OOo1O(iOO0IOIll3) | (i8 == 256);
/* 137 */                   Object objI00O0i0ii12 = iloI0lOlll13.I00O0i0ii();
                            if (zI000OOo1O2 || objI00O0i0ii12 == iOO0o0I1l) {
/* 138 */                       I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(1);
                                i0IoO01lIoO.I00iiI = ii01102;
                                i0IoO01lIoO.I00iiO = iOO0IOIll3;
                                i0IoO01lIoO.I00iio = str;
                                illiIl1l11O2 = illiIl1l11O;
                                i0IoO01lIoO.I00ilI0I1 = illiIl1l11O2;
                                VarHandle.storeStoreFence();
/* 139 */                       iloI0lOlll13.I00iio(i0IoO01lIoO);
                                obj4 = i0IoO01lIoO;
                            } else {
                                illiIl1l11O2 = illiIl1l11O;
                                obj4 = objI00O0i0ii12;
                            }
/* 142 */                   iOiO0o0oi.I00000oOI((IllOOo00lI) obj4, Ol0iOOO0.I000II(o1ooIo101ll, 32.0f), false, null, null, null, oIo1i1, i1O1i1.I000lI, iloI0lOlll13, 817889328, 380);
/* 143 */                   iloI0lOlll13.I0010I0i(true);
/* 144 */                   lOO1OIO00.I00000oIO(iloI0lOlll13, Ol0iOOO0.I000II(o1ooIo101ll, 8.0f));
/* 145 */                   String str11 = (String) oI10i0Il14.getValue();
                            boolean z2 = i8 == 256;
/* 146 */                   Object objI00O0i0ii13 = iloI0lOlll13.I00O0i0ii();
                            if (z2 || objI00O0i0ii13 == iOO0o0I1l) {
                                i4 = 4;
/* 147 */                       I00o101lO i00o101lO = new I00o101lO(i4);
                                i00o101lO.I00iiI = str;
                                i00o101lO.I00iiO = illiIl1l11O2;
                                VarHandle.storeStoreFence();
/* 148 */                       iloI0lOlll13.I00iio(i00o101lO);
                                obj5 = i00o101lO;
                            } else {
                                i4 = 4;
                                obj5 = objI00O0i0ii13;
                            }
/* 150 */                   il0101ii.I00000oIO(null, null, str11, (Function1) obj5, null, false, 16, 0.0f, true, null, iloI0lOlll13, 102236160, 691);
/* 151 */                   iloI0lOlll13.I0010I0i(true);
/* 152 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 153 */               if (((Boolean) oI10i0Il6.getValue()).booleanValue()) {
/* 154 */                   iloI0lOlll13.I00i01iIIliI(1815505244);
/* 155 */                   Object objI00O0i0ii14 = iloI0lOlll13.I00O0i0ii();
                            Object obj8 = objI00O0i0ii14;
                            if (objI00O0i0ii14 == iOO0o0I1l) {
/* 156 */                       I0Il0000oli i0Il0000oli4 = new I0Il0000oli(12);
                                i0Il0000oli4.I00iiI = oI10i0Il6;
                                VarHandle.storeStoreFence();
/* 157 */                       iloI0lOlll13.I00iio(i0Il0000oli4);
                                obj8 = i0Il0000oli4;
                            }
/* 158 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj8;
/* 159 */                   O11iol o11iol = new O11iol(1);
                            function17 = function12;
                            o11iol.I00iiI = function17;
                            map2 = map;
                            o11iol.I00iiO = map2;
                            OI10i0Il oI10i0Il16 = oI10i0Il;
                            o11iol.I00iio = oI10i0Il16;
                            o11iol.I00ilI0I1 = oI10i0Il6;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(796581780, o11iol, iloI0lOlll13);
/* 160 */                   I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(7);
                            i0Il1IoilolI.I00iiI = oI10i0Il6;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(822727574, i0Il1IoilolI, iloI0lOlll13);
/* 161 */                   I0Iol0loO i0Iol0loO = new I0Iol0loO(0);
                            i0Iol0loO.I00iiI = map2;
                            i0Iol0loO.I00iiO = oI10i0Il16;
                            VarHandle.storeStoreFence();
/* 162 */                   iOIil10l.I00000oIO(illOOo00lI2, iOii1lI00000oOI, null, iOii1lI00000oOI2, null, i1O1i1.I00100l0, iiioOl1O.I00000oOI(-1285537383, i0Iol0loO, iloI0lOlll13), null, 0L, 0L, 0L, 0L, null, iloI0lOlll13, 1772598, 16276);
/* 163 */                   iloI0lOlll13.I0010I0i(false);
                        } else {
                            map2 = map;
                            function17 = function12;
/* 164 */                   iloI0lOlll13.I00i01iIIliI(1816712260);
/* 165 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 166 */               if (((Boolean) oI10i0Il7.getValue()).booleanValue()) {
/* 167 */                   iloI0lOlll13.I00i01iIIliI(1816803059);
/* 168 */                   Object objI00O0i0ii15 = iloI0lOlll13.I00O0i0ii();
                            Object obj9 = objI00O0i0ii15;
                            if (objI00O0i0ii15 == iOO0o0I1l) {
/* 169 */                       I0Il0000oli i0Il0000oli5 = new I0Il0000oli(7);
                                i0Il0000oli5.I00iiI = oI10i0Il7;
                                VarHandle.storeStoreFence();
/* 170 */                       iloI0lOlll13.I00iio(i0Il0000oli5);
                                obj9 = i0Il0000oli5;
                            }
/* 171 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj9;
/* 172 */                   I0Iolooi i0Iolooi = new I0Iolooi(0);
                            i0Iolooi.I00iiO = str;
                            function18 = function13;
                            i0Iolooi.I00iiI = function18;
                            i0Iolooi.I00iio = oI10i0Il7;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(1997723123, i0Iolooi, iloI0lOlll13);
/* 173 */                   I0Il1IoilolI i0Il1IoilolI2 = new I0Il1IoilolI(i4);
                            i0Il1IoilolI2.I00iiI = oI10i0Il7;
                            VarHandle.storeStoreFence();
                            IOii1l iOii1lI00000oOI4 = iiioOl1O.I00000oOI(2023868917, i0Il1IoilolI2, iloI0lOlll13);
/* 174 */                   I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(0);
                            i0Iooi0i1l0l.I00iiI = str;
                            VarHandle.storeStoreFence();
/* 175 */                   iOIil10l.I00000oIO(illOOo00lI3, iOii1lI00000oOI3, null, iOii1lI00000oOI4, null, i1O1i1.I00111O, iiioOl1O.I00000oOI(-84396040, i0Iooi0i1l0l, iloI0lOlll13), null, 0L, 0L, 0L, 0L, null, iloI0lOlll13, 1772598, 16276);
                            z = false;
/* 176 */                   iloI0lOlll13.I0010I0i(false);
                        } else {
                            function18 = function13;
                            z = false;
/* 177 */                   iloI0lOlll13.I00i01iIIliI(1817649700);
/* 178 */                   iloI0lOlll13.I0010I0i(false);
                        }
/* 179 */               if (((Boolean) oI10i0Il8.getValue()).booleanValue()) {
/* 180 */                   iloI0lOlll13.I00i01iIIliI(1817751287);
/* 181 */                   String strI00000oOI = lOOoli.I00000oOI(R.string.prompt_copied_message, iloI0lOlll13);
/* 182 */                   Object objI00O0i0ii16 = iloI0lOlll13.I00O0i0ii();
                            Object obj10 = objI00O0i0ii16;
                            if (objI00O0i0ii16 == iOO0o0I1l) {
/* 183 */                       I0Il0000oli i0Il0000oli6 = new I0Il0000oli(8);
                                i0Il0000oli6.I00iiI = oI10i0Il8;
                                VarHandle.storeStoreFence();
/* 184 */                       iloI0lOlll13.I00iio(i0Il0000oli6);
                                obj10 = i0Il0000oli6;
                            }
/* 185 */                   IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj10;
/* 186 */                   boolean zI000OOo1O3 = iloI0lOlll13.I000OOo1O(ii01102) | iloI0lOlll13.I000II(strI00000oOI);
/* 187 */                   Object objI00O0i0ii17 = iloI0lOlll13.I00O0i0ii();
                            if (zI000OOo1O3 || objI00O0i0ii17 == iOO0o0I1l) {
/* 188 */                       I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(1);
                                i01oIoOI01l.I00iiI = ii01102;
                                ol1OlloIO3 = ol1OlloIO;
                                i01oIoOI01l.I00iiO = ol1OlloIO3;
                                i01oIoOI01l.I00iio = strI00000oOI;
                                VarHandle.storeStoreFence();
/* 189 */                       iloI0lOlll13.I00iio(i01oIoOI01l);
                                obj6 = i01oIoOI01l;
                            } else {
                                ol1OlloIO3 = ol1OlloIO;
                                obj6 = objI00O0i0ii17;
                            }
                            int i9 = i2 >> 24;
                            int i10 = i6 << 6;
                            int i11 = (i9 & 112) | (i9 & 14) | 12582912 | 384 | (i10 & 7168) | 24576 | (i10 & 458752) | 1572864;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            o1ooiI111i2 = o1ooiI111i;
                            IloI0lOlll1 iloI0lOlll15 = iloI0lOlll13;
                            ol1OlloIO2 = ol1OlloIO3;
/* 191 */                   ill10o0.I00000oIO(str6, str7, function14, str8, function15, str5, function16, illOOo00lI4, (Function1) obj6, iloI0lOlll15, i11);
                            str9 = str5;
                            iloI0lOlll12 = iloI0lOlll15;
/* 192 */                   iloI0lOlll12.I0010I0i(z);
                        } else {
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            ol1OlloIO2 = ol1OlloIO;
                            o1ooiI111i2 = o1ooiI111i;
                            iloI0lOlll12 = iloI0lOlll13;
                            str9 = str5;
/* 193 */                   iloI0lOlll12.I00i01iIIliI(1818440324);
/* 194 */                   iloI0lOlll12.I0010I0i(z);
                        }
                    } else {
                        function17 = function12;
                        str6 = str2;
                        o1ooiI111i2 = o1ooiI111i;
                        map2 = map;
                        iloI0lOlll12 = iloI0lOlll1;
                        illiIl1l11O2 = illiIl1l11O;
                        ii01102 = ii0110;
                        ol1OlloIO2 = ol1OlloIO;
/* 195 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 196 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        I0O0110 i0o0110 = new I0O0110();
                        i0o0110.I00iOIl = ii01102;
                        i0o0110.I00iiI = map2;
                        i0o0110.I00iiO = str;
                        i0o0110.I00iio = function1;
                        i0o0110.I00ilI0I1 = illOOo00lI;
                        i0o0110.I00ilO0 = illiIl1l11O2;
                        i0o0110.I00io1l = function17;
                        i0o0110.I00ioIO = function18;
                        i0o0110.I00l0I0l0lO1 = str6;
                        i0o0110.I00l0OO0IO = str7;
                        i0o0110.I00li1OI = function14;
                        i0o0110.I00ll1 = str8;
                        i0o0110.I00lli11 = function15;
                        i0o0110.I00lll10 = str9;
                        i0o0110.I00o0iI0io1 = function16;
                        i0o0110.I00o0l1o1o0 = ol1OlloIO2;
                        i0o0110.I00o101lO = o1ooiI111i2;
                        VarHandle.storeStoreFence();
/* 197 */               oOloioIlI001IO000.I0000O = i0o0110;
                    }
                }
            }
