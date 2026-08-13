            package p000;

            import android.content.Context;
            import com.box.gallery.R;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.ai.edge.litertlm.ToolKt;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IO0O0o0O1Ol {
                public static final IO1ooOIo I00000oIO = new IO1ooOIo();

                public static final void I00000oIO(OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, IllOOo00lI illOOo00lI, AgentTools agentTools, O11OliOlOII o11OliOlOII, Ol0o1OiOIIIl ol0o1OiOIIIl, O1i1O1I o1i1O1I, IloI0lOlll1 iloI0lOlll1, int i) {
                    OloIl1l1oOii oloIl1l1oOii2;
                    O1ol100o0O o1ol100o0O2;
                    AgentTools agentTools2;
                    O11OliOlOII o11OliOlOII2;
                    Ol0o1OiOIIIl ol0o1OiOIIIl2;
                    O1i1O1I o1i1O1I2;
                    IloI0lOlll1 iloI0lOlll12;
                    char c;
                    int i2;
                    O11OliOlOII o11OliOlOII3;
                    Ol0o1OiOIIIl ol0o1OiOIIIl3;
                    O1i1O1I o1i1O1I3;
                    OI10i0Il oI10i0Il;
                    Object obj;
                    Function1 function1;
                    Object obj2;
                    IllOOo00lI illOOo00lI2;
                    Object obj3;
                    O11OliOlOII o11OliOlOII4;
                    Ol0o1OiOIIIl ol0o1OiOIIIl4;
                    OI10i0Il oI10i0Il2;
                    O11OliOlOII o11OliOlOII5;
                    OI10i0Il oI10i0Il3;
                    Ol0o1OiOIIIl ol0o1OiOIIIl5;
                    boolean z;
                    IloI0lOlll1 iloI0lOlll13;
                    OI10i0Il oI10i0Il4;
                    Object obj4;
                    Object obj5;
                    OI10i0Il oI10i0Il5;
                    Object obj6;
                    OI10i0Il oI10i0Il6;
                    OI10i0Il oI10i0Il7;
                    Object obj7;
                    boolean z2;
                    Object obj8;
/* 9 */             IloI0lOlll1 iloI0lOlll14 = iloI0lOlll1;
/* 14 */            iloI0lOlll14.I00i0O(-1285544052);
/* 67 */            int i3 = i | (iloI0lOlll14.I000OOo1O(oloIl1l1oOii) ? 4 : 2) | (iloI0lOlll14.I000OOo1O(o1ol100o0O) ? 32 : 16) | (iloI0lOlll14.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll14.I000OOo1O(agentTools) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | 598016;
/* 87 */            if (iloI0lOlll14.I00OIl(i3 & 1, (599187 & i3) != 599186)) {
/* 89 */                iloI0lOlll14.I00Ol00();
/* 97 */                if ((i & 1) == 0 || iloI0lOlll14.I001lloI()) {
/* 121 */                   Oool1Ii0I oool1Ii0II00000oIO = O11oIiol.I00000oIO(iloI0lOlll14);
/* 127 */                   if (oool1Ii0II00000oIO == null) {
/* 1665 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1668 */                      return;
                            }
/* 133 */                   Oool0IIIO0o oool0IIIO0oI00000oIO = ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO), iloI0lOlll14);
/* 137 */                   Ii0OO1I1iOo ii0OO1I1iOoI00000oIO = li1iolIo.I00000oIO(oool1Ii0II00000oIO);
/* 141 */                   OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 143 */                   c = ' ';
/* 155 */                   O11OliOlOII o11OliOlOII6 = (O11OliOlOII) li1ilo1Oli.I00000oIO(oOoOl1001II.I00000oOI(O11OliOlOII.class), oool1Ii0II00000oIO, oool0IIIO0oI00000oIO, ii0OO1I1iOoI00000oIO, iloI0lOlll14);
/* 157 */                   Oool1Ii0I oool1Ii0II00000oIO2 = O11oIiol.I00000oIO(iloI0lOlll14);
/* 161 */                   if (oool1Ii0II00000oIO2 == null) {
/* 1661 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1664 */                      return;
                            }
/* 187 */                   Ol0o1OiOIIIl ol0o1OiOIIIl6 = (Ol0o1OiOIIIl) li1ilo1Oli.I00000oIO(oOoOl1001II.I00000oOI(Ol0o1OiOIIIl.class), oool1Ii0II00000oIO2, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO2), iloI0lOlll14), li1iolIo.I00000oIO(oool1Ii0II00000oIO2), iloI0lOlll14);
/* 189 */                   Oool1Ii0I oool1Ii0II00000oIO3 = O11oIiol.I00000oIO(iloI0lOlll14);
/* 193 */                   if (oool1Ii0II00000oIO3 == null) {
/* 1657 */                      I000II.I001IO000("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
/* 1660 */                      return;
                            }
/* 219 */                   i2 = i3 & (-4186113);
/* 223 */                   o11OliOlOII3 = o11OliOlOII6;
/* 224 */                   ol0o1OiOIIIl3 = ol0o1OiOIIIl6;
/* 217 */                   o1i1O1I3 = (O1i1O1I) li1ilo1Oli.I00000oIO(oOoOl1001II.I00000oOI(O1i1O1I.class), oool1Ii0II00000oIO3, ilo0oII1O01.I00000oIO(li1iolIo.I00000oOI(oool1Ii0II00000oIO3), iloI0lOlll14), li1iolIo.I00000oIO(oool1Ii0II00000oIO3), iloI0lOlll14);
                        } else {
/* 106 */                   iloI0lOlll14.I00OilO00Il();
/* 110 */                   ol0o1OiOIIIl3 = ol0o1OiOIIIl;
/* 112 */                   o1i1O1I3 = o1i1O1I;
/* 109 */                   i2 = i3 & (-4186113);
/* 116 */                   c = ' ';
/* 118 */                   o11OliOlOII3 = o11OliOlOII;
                        }
/* 226 */               iloI0lOlll14.I0010o();
/* 235 */               Context context = (Context) iloI0lOlll14.I000iOII(I0lloOI0oio.I00000oOI);
/* 237 */               agentTools.setContext(context);
/* 240 */               agentTools.setSkillManagerViewModel(ol0o1OiOIIIl3);
/* 243 */               agentTools.setMcpManagerViewModel(o1i1O1I3);
/* 248 */               agentTools.setTaskId(oloIl1l1oOii.I00000oIO);
/* 257 */               IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll14.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 265 */               i00Ii11100lo i00ii11100lo = (i00Ii11100lo) iloI0lOlll14.I000iOII(IOlO0o100i1i.I001IIilI0O);
/* 267 */               Object objI00O0i0ii = iloI0lOlll14.I00O0i0ii();
/* 271 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj9 = objI00O0i0ii;
/* 273 */               if (objI00O0i0ii == iOO0o0I1l) {
/* 288 */                   Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(iiIooOOOI.I00O0o1oo((int) (((O0oI1IIioO0) i00ii11100lo).I00000oIO() >> c)));
/* 292 */                   iloI0lOlll14.I00iio(iil1010OI00000oIO);
                            obj9 = iil1010OI00000oIO;
                        }
/* 297 */               float f = ((Iil1010O) obj9).I00iOIl;
/* 299 */               Object objI00O0i0ii2 = iloI0lOlll14.I00O0i0ii();
                        Object obj10 = objI00O0i0ii2;
/* 303 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 307 */                   OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 311 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO);
                            obj10 = oIooliIO0I00000oIO;
                        }
/* 314 */               OI10i0Il oI10i0Il8 = (OI10i0Il) obj10;
/* 316 */               Object objI00O0i0ii3 = iloI0lOlll14.I00O0i0ii();
                        Object obj11 = objI00O0i0ii3;
/* 320 */               if (objI00O0i0ii3 == iOO0o0I1l) {
/* 324 */                   OIooliIO0 oIooliIO0I00000oIO2 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 328 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO2);
                            obj11 = oIooliIO0I00000oIO2;
                        }
/* 331 */               OI10i0Il oI10i0Il9 = (OI10i0Il) obj11;
/* 333 */               Object objI00O0i0ii4 = iloI0lOlll14.I00O0i0ii();
                        Object obj12 = objI00O0i0ii4;
/* 339 */               if (objI00O0i0ii4 == iOO0o0I1l) {
/* 341 */                   OIooliIO0 oIooliIO0I00000oIO3 = lOO00IiI0li.I00000oIO(null);
/* 345 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO3);
                            obj12 = oIooliIO0I00000oIO3;
                        }
/* 348 */               OI10i0Il oI10i0Il10 = (OI10i0Il) obj12;
/* 350 */               Object objI00O0i0ii5 = iloI0lOlll14.I00O0i0ii();
                        Object obj13 = objI00O0i0ii5;
/* 356 */               if (objI00O0i0ii5 == iOO0o0I1l) {
/* 358 */                   OIooliIO0 oIooliIO0I00000oIO4 = lOO00IiI0li.I00000oIO("");
/* 362 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO4);
                            obj13 = oIooliIO0I00000oIO4;
                        }
/* 365 */               OI10i0Il oI10i0Il11 = (OI10i0Il) obj13;
/* 367 */               Object objI00O0i0ii6 = iloI0lOlll14.I00O0i0ii();
                        Object obj14 = objI00O0i0ii6;
/* 371 */               if (objI00O0i0ii6 == iOO0o0I1l) {
/* 373 */                   OIooliIO0 oIooliIO0I00000oIO5 = lOO00IiI0li.I00000oIO(null);
/* 377 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO5);
                            obj14 = oIooliIO0I00000oIO5;
                        }
/* 380 */               OI10i0Il oI10i0Il12 = (OI10i0Il) obj14;
/* 382 */               Object objI00O0i0ii7 = iloI0lOlll14.I00O0i0ii();
                        Object obj15 = objI00O0i0ii7;
/* 386 */               if (objI00O0i0ii7 == iOO0o0I1l) {
/* 390 */                   IO1oli0i011 iO1oli0i011 = new IO1oli0i011(context);
/* 393 */                   iloI0lOlll14.I00iio(iO1oli0i011);
                            obj15 = iO1oli0i011;
                        }
/* 396 */               IO1oli0i011 iO1oli0i0112 = (IO1oli0i011) obj15;
/* 398 */               Object objI00O0i0ii8 = iloI0lOlll14.I00O0i0ii();
                        Object obj16 = objI00O0i0ii8;
/* 402 */               if (objI00O0i0ii8 == iOO0o0I1l) {
/* 406 */                   OIooliIO0 oIooliIO0I00000oIO6 = lOO00IiI0li.I00000oIO(oloIl1l1oOii.I000oI1ioi);
/* 410 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO6);
                            obj16 = oIooliIO0I00000oIO6;
                        }
/* 413 */               OI10i0Il oI10i0Il13 = (OI10i0Il) obj16;
/* 415 */               O1i1O1I o1i1O1I4 = o1i1O1I3;
/* 420 */               String strI00000oOI = lOOoli.I00000oOI(R.string.system_prompt_updated, iloI0lOlll14);
/* 426 */               Object objI00O0i0ii9 = iloI0lOlll14.I00O0i0ii();
                        Object obj17 = objI00O0i0ii9;
/* 430 */               if (objI00O0i0ii9 == iOO0o0I1l) {
/* 432 */                   OIooliIO0 oIooliIO0I00000oIO7 = lOO00IiI0li.I00000oIO(null);
/* 436 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO7);
                            obj17 = oIooliIO0I00000oIO7;
                        }
/* 439 */               OI10i0Il oI10i0Il14 = (OI10i0Il) obj17;
/* 443 */               Object objI00O0i0ii10 = iloI0lOlll14.I00O0i0ii();
                        Object obj18 = objI00O0i0ii10;
/* 447 */               if (objI00O0i0ii10 == iOO0o0I1l) {
/* 451 */                   OIooliIO0 oIooliIO0I00000oIO8 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 455 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO8);
                            obj18 = oIooliIO0I00000oIO8;
                        }
/* 458 */               OI10i0Il oI10i0Il15 = (OI10i0Il) obj18;
/* 462 */               Object objI00O0i0ii11 = iloI0lOlll14.I00O0i0ii();
                        Object obj19 = objI00O0i0ii11;
/* 466 */               if (objI00O0i0ii11 == iOO0o0I1l) {
/* 468 */                   OIooliIO0 oIooliIO0I00000oIO9 = lOO00IiI0li.I00000oIO("");
/* 472 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO9);
                            obj19 = oIooliIO0I00000oIO9;
                        }
/* 475 */               OI10i0Il oI10i0Il16 = (OI10i0Il) obj19;
/* 481 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(O1i1oIi1il.I00000oOI, iloI0lOlll14);
/* 487 */               Object objI00O0i0ii12 = iloI0lOlll14.I00O0i0ii();
                        Object obj20 = objI00O0i0ii12;
/* 491 */               if (objI00O0i0ii12 == iOO0o0I1l) {
/* 495 */                   OIooliIO0 oIooliIO0I00000oIO10 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 499 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO10);
                            obj20 = oIooliIO0I00000oIO10;
                        }
/* 502 */               OI10i0Il oI10i0Il17 = (OI10i0Il) obj20;
/* 506 */               Object objI00O0i0ii13 = iloI0lOlll14.I00O0i0ii();
                        Object obj21 = objI00O0i0ii13;
/* 510 */               if (objI00O0i0ii13 == iOO0o0I1l) {
/* 512 */                   OIooliIO0 oIooliIO0I00000oIO11 = lOO00IiI0li.I00000oIO(null);
/* 516 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO11);
                            obj21 = oIooliIO0I00000oIO11;
                        }
/* 519 */               OI10i0Il oI10i0Il18 = (OI10i0Il) obj21;
/* 521 */               Object objI00O0i0ii14 = iloI0lOlll14.I00O0i0ii();
                        Object obj22 = objI00O0i0ii14;
/* 525 */               if (objI00O0i0ii14 == iOO0o0I1l) {
/* 527 */                   OIooliIO0 oIooliIO0I00000oIO12 = lOO00IiI0li.I00000oIO(null);
/* 531 */                   iloI0lOlll14.I00iio(oIooliIO0I00000oIO12);
                            obj22 = oIooliIO0I00000oIO12;
                        }
/* 534 */               OI10i0Il oI10i0Il19 = (OI10i0Il) obj22;
/* 543 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 546 */               Object objI00O0i0ii15 = iloI0lOlll14.I00O0i0ii();
/* 550 */               if (objI00O0i0ii15 == iOO0o0I1l) {
/* 554 */                   oI10i0Il = oI10i0Il11;
/* 558 */                   I0Il0IoIIOll i0Il0IoIIOll = new I0Il0IoIIOll(11);
/* 561 */                   i0Il0IoIIOll.I00iiI = oI10i0Il19;
/* 563 */                   VarHandle.storeStoreFence();
/* 566 */                   iloI0lOlll14.I00iio(i0Il0IoIIOll);
                            obj = i0Il0IoIIOll;
                        } else {
/* 570 */                   oI10i0Il = oI10i0Il11;
                            obj = objI00O0i0ii15;
                        }
/* 576 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) obj, iloI0lOlll14, 48);
/* 584 */               String str = (String) oI10i0Il13.getValue();
/* 590 */               Oil1Oil1i01l oil1Oil1i01l = (Oil1Oil1i01l) oI10i0Il14.getValue();
/* 600 */               boolean zI000OOo1O = iloI0lOlll14.I000OOo1O(o11OliOlOII3) | iloI0lOlll14.I000OOo1O(agentTools);
/* 604 */               Object objI00O0i0ii16 = iloI0lOlll14.I00O0i0ii();
/* 610 */               int i4 = 9;
                        Object obj23 = objI00O0i0ii16;
/* 612 */               if (zI000OOo1O || objI00O0i0ii16 == iOO0o0I1l) {
/* 618 */                   I00o101lO i00o101lO = new I00o101lO(i4);
/* 621 */                   i00o101lO.I00iiI = o11OliOlOII3;
/* 623 */                   i00o101lO.I00iiO = agentTools;
/* 625 */                   VarHandle.storeStoreFence();
/* 628 */                   iloI0lOlll14.I00iio(i00o101lO);
                            obj23 = i00o101lO;
                        }
/* 631 */               Function1 function12 = (Function1) obj23;
/* 641 */               boolean zI000OOo1O2 = iloI0lOlll14.I000OOo1O(agentTools) | iloI0lOlll14.I000OOo1O(o11OliOlOII3);
/* 643 */               Object objI00O0i0ii17 = iloI0lOlll14.I00O0i0ii();
/* 647 */               if (zI000OOo1O2 || objI00O0i0ii17 == iOO0o0I1l) {
/* 658 */                   function1 = function12;
/* 661 */                   I0i1l00llOi1 i0i1l00llOi1 = new I0i1l00llOi1(0);
/* 664 */                   i0i1l00llOi1.I00iiO = agentTools;
/* 666 */                   i0i1l00llOi1.I00iio = o11OliOlOII3;
/* 668 */                   i0i1l00llOi1.I00iiI = f;
/* 670 */                   VarHandle.storeStoreFence();
/* 673 */                   iloI0lOlll14.I00iio(i0i1l00llOi1);
                            obj2 = i0i1l00llOi1;
                        } else {
/* 652 */                   function1 = function12;
                            obj2 = objI00O0i0ii17;
                        }
/* 676 */               Function1 function13 = (Function1) obj2;
/* 678 */               Object objI00O0i0ii18 = iloI0lOlll14.I00O0i0ii();
                        Object obj24 = objI00O0i0ii18;
/* 682 */               if (objI00O0i0ii18 == iOO0o0I1l) {
/* 688 */                   I0Il0000oli i0Il0000oli = new I0Il0000oli(23);
/* 691 */                   i0Il0000oli.I00iiI = oI10i0Il8;
/* 693 */                   VarHandle.storeStoreFence();
/* 696 */                   iloI0lOlll14.I00iio(i0Il0000oli);
                            obj24 = i0Il0000oli;
                        }
/* 699 */               IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj24;
/* 721 */               boolean zI000OOo1O3 = iloI0lOlll14.I000OOo1O(o11OliOlOII3) | iloI0lOlll14.I000OOo1O(o1ol100o0O) | iloI0lOlll14.I000OOo1O(ol0o1OiOIIIl3) | iloI0lOlll14.I000OOo1O(agentTools);
/* 725 */               Object objI00O0i0ii19 = iloI0lOlll14.I00O0i0ii();
/* 729 */               if (zI000OOo1O3 || objI00O0i0ii19 == iOO0o0I1l) {
/* 739 */                   illOOo00lI2 = illOOo00lI3;
/* 742 */                   O11l0o011lO1 o11l0o011lO1 = new O11l0o011lO1(2);
/* 745 */                   o11l0o011lO1.I00iiI = o11OliOlOII3;
/* 747 */                   o11l0o011lO1.I00ilI0I1 = o1ol100o0O;
/* 749 */                   o11l0o011lO1.I00iiO = ol0o1OiOIIIl3;
/* 751 */                   o11l0o011lO1.I00iio = agentTools;
/* 753 */                   o11l0o011lO1.I00ilO0 = oI10i0Il13;
/* 755 */                   VarHandle.storeStoreFence();
/* 758 */                   iloI0lOlll14.I00iio(o11l0o011lO1);
                            obj3 = o11l0o011lO1;
                        } else {
/* 734 */                   illOOo00lI2 = illOOo00lI3;
                            obj3 = objI00O0i0ii19;
                        }
/* 761 */               IlliIl1l11O illiIl1l11O = (IlliIl1l11O) obj3;
/* 765 */               I0i1lolii i0i1lolii = new I0i1lolii();
/* 768 */               i0i1lolii.I00iOIl = agentTools;
/* 770 */               i0i1lolii.I00iiI = o11OliOlOII3;
/* 772 */               i0i1lolii.I00iiO = iO1oli0i0112;
/* 774 */               i0i1lolii.I00iio = o1OIi1I00000oIO;
/* 776 */               i0i1lolii.I00ilI0I1 = oI10i0Il12;
/* 778 */               i0i1lolii.I00ilO0 = oI10i0Il10;
/* 780 */               OI10i0Il oI10i0Il20 = oI10i0Il;
/* 782 */               i0i1lolii.I00io1l = oI10i0Il20;
/* 786 */               i0i1lolii.I00ioIO = oI10i0Il9;
/* 788 */               i0i1lolii.I00l0I0l0lO1 = oI10i0Il19;
/* 792 */               i0i1lolii.I00l0OO0IO = oI10i0Il18;
/* 794 */               VarHandle.storeStoreFence();
/* 800 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-361571653, i0i1lolii, iloI0lOlll14);
/* 844 */               boolean zI000OOo1O4 = iloI0lOlll14.I000OOo1O(o11OliOlOII3) | iloI0lOlll14.I000OOo1O(o1ol100o0O) | iloI0lOlll14.I000OOo1O(ol0o1OiOIIIl3) | iloI0lOlll14.I000OOo1O(oloIl1l1oOii) | iloI0lOlll14.I000OOo1O(agentTools) | iloI0lOlll14.I000II(strI00000oOI);
/* 848 */               Object objI00O0i0ii20 = iloI0lOlll14.I00O0i0ii();
                        Object obj25 = objI00O0i0ii20;
/* 852 */               if (zI000OOo1O4 || objI00O0i0ii20 == iOO0o0I1l) {
/* 859 */                   I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(1);
/* 862 */                   i0O0o00OlIoi.I00iiO = o11OliOlOII3;
/* 864 */                   i0O0o00OlIoi.I00iio = o1ol100o0O;
/* 866 */                   i0O0o00OlIoi.I00ilI0I1 = ol0o1OiOIIIl3;
/* 868 */                   i0O0o00OlIoi.I00ilO0 = agentTools;
/* 870 */                   i0O0o00OlIoi.I00iiI = oI10i0Il13;
/* 872 */                   i0O0o00OlIoi.I00io1l = strI00000oOI;
/* 874 */                   VarHandle.storeStoreFence();
/* 877 */                   iloI0lOlll14.I00iio(i0O0o00OlIoi);
                            obj25 = i0O0o00OlIoi;
                        }
/* 885 */               IO1IlI1 iO1IlI1 = new IO1IlI1(1);
/* 888 */               iO1IlI1.I00io1l = o11OliOlOII3;
/* 890 */               iO1IlI1.I00iiI = o1ol100o0O;
/* 892 */               iO1IlI1.I00ioIO = ol0o1OiOIIIl3;
/* 896 */               iO1IlI1.I00iiO = oI10i0IlI00000oOI;
/* 900 */               iO1IlI1.I00iio = oI10i0Il17;
/* 904 */               iO1IlI1.I00ilI0I1 = oI10i0Il14;
/* 908 */               iO1IlI1.I00ilO0 = oI10i0Il16;
/* 912 */               iO1IlI1.I00l0I0l0lO1 = oI10i0Il15;
/* 914 */               VarHandle.storeStoreFence();
/* 924 */               int i5 = i2 >> 3;
/* 948 */               O11OliOlOII o11OliOlOII7 = o11OliOlOII3;
/* 957 */               Ol0o1OiOIIIl ol0o1OiOIIIl7 = ol0o1OiOIIIl3;
/* 1018 */              O11Oio.I000OOo1O(o1ol100o0O, illOOo00lI, null, "llm_agent_chat", function1, function13, illOOo00lI2, illiIl1l11O, iOii1lI00000oOI, null, true, str, (Function1) obj25, i1OI1I0ll1I.I00000oIO, iiioOl1O.I00000oOI(-944539308, iO1IlI1, iloI0lOlll14), oil1Oil1i01l, true, true, null, false, false, iloI0lOlll14, (i5 & 14) | 102239232 | (i5 & 112), 819489798, 3408388);
/* 1022 */              IloI0lOlll1 iloI0lOlll15 = iloI0lOlll14;
/* 1034 */              int i6 = 12;
/* 1036 */              if (!((Boolean) oI10i0Il9.getValue()).booleanValue() || ((I1O01ol) oI10i0Il10.getValue()) == null) {
/* 1188 */                  iloI0lOlll15.I00i01iIIliI(594603766);
/* 1191 */                  iloI0lOlll15.I0010I0i(false);
                        } else {
/* 1049 */                  iloI0lOlll15.I00i01iIIliI(594113656);
/* 1056 */                  I1O01ol i1O01ol = (I1O01ol) oI10i0Il10.getValue();
/* 1058 */                  String str2 = i1O01ol.I00000oIO;
/* 1064 */                  String str3 = (String) oI10i0Il20.getValue();
/* 1066 */                  Object objI00O0i0ii21 = iloI0lOlll15.I00O0i0ii();
/* 1070 */                  if (objI00O0i0ii21 == iOO0o0I1l) {
/* 1074 */                      I0Il0IoIIOll i0Il0IoIIOll2 = new I0Il0IoIIOll(i6);
/* 1077 */                      oI10i0Il5 = oI10i0Il20;
/* 1079 */                      i0Il0IoIIOll2.I00iiI = oI10i0Il5;
/* 1081 */                      VarHandle.storeStoreFence();
/* 1084 */                      iloI0lOlll15.I00iio(i0Il0IoIIOll2);
                                obj6 = i0Il0IoIIOll2;
                            } else {
/* 1088 */                      oI10i0Il5 = oI10i0Il20;
                                obj6 = objI00O0i0ii21;
                            }
/* 1090 */                  Function1 function14 = (Function1) obj6;
/* 1092 */                  boolean zI000OOo1O5 = iloI0lOlll15.I000OOo1O(i1O01ol);
/* 1096 */                  Object objI00O0i0ii22 = iloI0lOlll15.I00O0i0ii();
/* 1100 */                  if (zI000OOo1O5 || objI00O0i0ii22 == iOO0o0I1l) {
/* 1113 */                      I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(3);
/* 1116 */                      i0IoO01lIoO.I00iiI = i1O01ol;
/* 1118 */                      i0IoO01lIoO.I00iiO = oI10i0Il5;
/* 1120 */                      oI10i0Il6 = oI10i0Il9;
/* 1122 */                      i0IoO01lIoO.I00iio = oI10i0Il6;
/* 1124 */                      oI10i0Il7 = oI10i0Il10;
/* 1126 */                      i0IoO01lIoO.I00ilI0I1 = oI10i0Il7;
/* 1128 */                      VarHandle.storeStoreFence();
/* 1131 */                      iloI0lOlll15.I00iio(i0IoO01lIoO);
                                obj7 = i0IoO01lIoO;
                            } else {
/* 1105 */                      oI10i0Il6 = oI10i0Il9;
/* 1107 */                      oI10i0Il7 = oI10i0Il10;
                                obj7 = objI00O0i0ii22;
                            }
/* 1134 */                  IllOOo00lI illOOo00lI4 = (IllOOo00lI) obj7;
/* 1136 */                  boolean zI000OOo1O6 = iloI0lOlll15.I000OOo1O(i1O01ol);
/* 1140 */                  Object objI00O0i0ii23 = iloI0lOlll15.I00O0i0ii();
/* 1144 */                  if (zI000OOo1O6 || objI00O0i0ii23 == iOO0o0I1l) {
/* 1153 */                      z2 = false;
/* 1154 */                      I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(false ? 1 : 0);
/* 1157 */                      i0iI0O1IoIoI.I00iiI = i1O01ol;
/* 1159 */                      i0iI0O1IoIoI.I00iiO = oI10i0Il6;
/* 1161 */                      i0iI0O1IoIoI.I00iio = oI10i0Il7;
/* 1163 */                      VarHandle.storeStoreFence();
/* 1166 */                      iloI0lOlll15.I00iio(i0iI0O1IoIoI);
                                obj8 = i0iI0O1IoIoI;
                            } else {
/* 1149 */                      z2 = false;
                                obj8 = objI00O0i0ii23;
                            }
/* 1177 */                  lO11IlilOl1.I00000oIO("Enter secret", str2, str3, function14, illOOo00lI4, (IllOOo00lI) obj8, iloI0lOlll15, 3072);
/* 1180 */                  iloI0lOlll15.I0010I0i(z2);
                        }
/* 1204 */              if (((Boolean) oI10i0Il8.getValue()).booleanValue()) {
/* 1209 */                  iloI0lOlll15.I00i01iIIliI(594660217);
/* 1212 */                  o11OliOlOII4 = o11OliOlOII7;
/* 1223 */                  ol0o1OiOIIIl4 = ol0o1OiOIIIl7;
/* 1243 */                  boolean zI000OOo1O7 = iloI0lOlll15.I000OOo1O(o11OliOlOII4) | iloI0lOlll15.I000OOo1O(o1ol100o0O) | iloI0lOlll15.I000OOo1O(ol0o1OiOIIIl4) | iloI0lOlll15.I000OOo1O(oloIl1l1oOii) | iloI0lOlll15.I000OOo1O(agentTools);
/* 1244 */                  Object objI00O0i0ii24 = iloI0lOlll15.I00O0i0ii();
/* 1248 */                  if (zI000OOo1O7 || objI00O0i0ii24 == iOO0o0I1l) {
/* 1259 */                      I0iII1llolIl i0iII1llolIl = new I0iII1llolIl(0);
/* 1262 */                      i0iII1llolIl.I00iiI = o11OliOlOII4;
/* 1264 */                      i0iII1llolIl.I00iiO = o1ol100o0O;
/* 1266 */                      i0iII1llolIl.I00iio = ol0o1OiOIIIl4;
/* 1268 */                      i0iII1llolIl.I00ilI0I1 = agentTools;
/* 1272 */                      i0iII1llolIl.I00ilO0 = oI10i0Il8;
/* 1274 */                      oI10i0Il2 = oI10i0Il13;
/* 1276 */                      i0iII1llolIl.I00io1l = oI10i0Il2;
/* 1278 */                      VarHandle.storeStoreFence();
/* 1281 */                      iloI0lOlll15.I00iio(i0iII1llolIl);
                                obj5 = i0iII1llolIl;
                            } else {
/* 1253 */                      oI10i0Il2 = oI10i0Il13;
                                obj5 = objI00O0i0ii24;
                            }
/* 1290 */                  Ol0lllilO0Ol.I0000Il00O(agentTools, ol0o1OiOIIIl4, (Function1) obj5, iloI0lOlll15, (i2 >> 9) & 14);
/* 1294 */                  iloI0lOlll15.I0010I0i(false);
                        } else {
/* 1302 */                  o11OliOlOII4 = o11OliOlOII7;
/* 1304 */                  ol0o1OiOIIIl4 = ol0o1OiOIIIl7;
/* 1306 */                  oI10i0Il2 = oI10i0Il13;
/* 1312 */                  iloI0lOlll15.I00i01iIIliI(595272374);
/* 1315 */                  iloI0lOlll15.I0010I0i(false);
                        }
/* 1328 */              if (((Boolean) oI10i0Il15.getValue()).booleanValue()) {
/* 1333 */                  iloI0lOlll15.I00i01iIIliI(595319618);
/* 1336 */                  Object objI00O0i0ii25 = iloI0lOlll15.I00O0i0ii();
/* 1340 */                  if (objI00O0i0ii25 == iOO0o0I1l) {
/* 1346 */                      I0Il0000oli i0Il0000oli2 = new I0Il0000oli(26);
/* 1349 */                      oI10i0Il4 = oI10i0Il15;
/* 1351 */                      i0Il0000oli2.I00iiI = oI10i0Il4;
/* 1353 */                      VarHandle.storeStoreFence();
/* 1356 */                      iloI0lOlll15.I00iio(i0Il0000oli2);
                                obj4 = i0Il0000oli2;
                            } else {
/* 1360 */                      oI10i0Il4 = oI10i0Il15;
                                obj4 = objI00O0i0ii25;
                            }
/* 1366 */                  I0Il1IoilolI i0Il1IoilolI = new I0Il1IoilolI(i6);
/* 1369 */                  i0Il1IoilolI.I00iiI = oI10i0Il4;
/* 1371 */                  VarHandle.storeStoreFence();
/* 1377 */                  IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(-1194463007, i0Il1IoilolI, iloI0lOlll15);
/* 1385 */                  I0Il1IoilolI i0Il1IoilolI2 = new I0Il1IoilolI(13);
/* 1390 */                  i0Il1IoilolI2.I00iiI = oI10i0Il16;
/* 1392 */                  VarHandle.storeStoreFence();
/* 1434 */                  o11OliOlOII5 = o11OliOlOII4;
/* 1436 */                  ol0o1OiOIIIl5 = ol0o1OiOIIIl4;
/* 1438 */                  oI10i0Il3 = oI10i0Il2;
/* 1440 */                  iOIil10l.I00000oIO((IllOOo00lI) obj4, iOii1lI00000oOI2, null, null, null, iiioOl1O.I00000oOI(-489149979, i0Il1IoilolI2, iloI0lOlll15), i1OI1I0ll1I.I0000O, null, 0L, 0L, 0L, 0L, null, iloI0lOlll1, 1769526, 16284);
/* 1443 */                  IloI0lOlll1 iloI0lOlll16 = iloI0lOlll1;
/* 1445 */                  z = false;
/* 1446 */                  iloI0lOlll16.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll16;
                        } else {
/* 1450 */                  o11OliOlOII5 = o11OliOlOII4;
/* 1452 */                  oI10i0Il3 = oI10i0Il2;
/* 1454 */                  ol0o1OiOIIIl5 = ol0o1OiOIIIl4;
/* 1456 */                  z = false;
/* 1460 */                  iloI0lOlll15.I00i01iIIliI(595707862);
/* 1463 */                  iloI0lOlll15.I0010I0i(false);
                            iloI0lOlll13 = iloI0lOlll15;
                        }
/* 1470 */              I1O0IlI1 i1O0IlI1 = (I1O0IlI1) oI10i0Il18.getValue();
/* 1472 */              if (i1O0IlI1 == null) {
/* 1477 */                  iloI0lOlll13.I00i01iIIliI(595881120);
/* 1480 */                  iloI0lOlll13.I0010I0i(z);
                        } else {
/* 1487 */                  iloI0lOlll13.I00i01iIIliI(595881121);
/* 1490 */                  String str4 = i1O0IlI1.I00000oIO;
/* 1492 */                  String str5 = i1O0IlI1.I00000oOI;
/* 1494 */                  boolean zI000OOo1O8 = iloI0lOlll13.I000OOo1O(i1O0IlI1);
/* 1498 */                  Object objI00O0i0ii26 = iloI0lOlll13.I00O0i0ii();
                            Object obj26 = objI00O0i0ii26;
/* 1502 */                  if (zI000OOo1O8 || objI00O0i0ii26 == iOO0o0I1l) {
/* 1510 */                      I00o101lO i00o101lO2 = new I00o101lO(8);
/* 1513 */                      i00o101lO2.I00iiI = i1O0IlI1;
/* 1517 */                      i00o101lO2.I00iiO = oI10i0Il18;
/* 1519 */                      VarHandle.storeStoreFence();
/* 1522 */                      iloI0lOlll13.I00iio(i00o101lO2);
                                obj26 = i00o101lO2;
                            }
/* 1528 */                  l1IO0iooIIll.I00000oIO(str4, str5, (Function1) obj26, iloI0lOlll13, 0);
/* 1531 */                  iloI0lOlll13.I0010I0i(false);
                        }
/* 1544 */              if (((Boolean) oI10i0Il17.getValue()).booleanValue()) {
/* 1549 */                  iloI0lOlll13.I00i01iIIliI(596387816);
/* 1552 */                  o11OliOlOII2 = o11OliOlOII5;
/* 1558 */                  o1ol100o0O2 = o1ol100o0O;
/* 1565 */                  ol0o1OiOIIIl2 = ol0o1OiOIIIl5;
/* 1572 */                  oloIl1l1oOii2 = oloIl1l1oOii;
/* 1579 */                  agentTools2 = agentTools;
/* 1585 */                  boolean zI000OOo1O9 = iloI0lOlll13.I000OOo1O(o11OliOlOII2) | iloI0lOlll13.I000OOo1O(o1ol100o0O2) | iloI0lOlll13.I000OOo1O(ol0o1OiOIIIl2) | iloI0lOlll13.I000OOo1O(oloIl1l1oOii2) | iloI0lOlll13.I000OOo1O(agentTools2);
/* 1586 */                  Object objI00O0i0ii27 = iloI0lOlll13.I00O0i0ii();
                            Object obj27 = objI00O0i0ii27;
/* 1590 */                  if (zI000OOo1O9 || objI00O0i0ii27 == iOO0o0I1l) {
/* 1597 */                      I0iII1llolIl i0iII1llolIl2 = new I0iII1llolIl(1);
/* 1600 */                      i0iII1llolIl2.I00iiI = o11OliOlOII2;
/* 1602 */                      i0iII1llolIl2.I00iiO = o1ol100o0O2;
/* 1604 */                      i0iII1llolIl2.I00iio = ol0o1OiOIIIl2;
/* 1606 */                      i0iII1llolIl2.I00ilI0I1 = agentTools2;
/* 1610 */                      i0iII1llolIl2.I00ilO0 = oI10i0Il17;
/* 1614 */                      i0iII1llolIl2.I00io1l = oI10i0Il3;
/* 1616 */                      VarHandle.storeStoreFence();
/* 1619 */                      iloI0lOlll13.I00iio(i0iII1llolIl2);
                                obj27 = i0iII1llolIl2;
                            }
/* 1624 */                  o1i1O1I2 = o1i1O1I4;
/* 1627 */                  iIoiiil.I00000oOI(o1i1O1I2, (Function1) obj27, iloI0lOlll13, 0);
/* 1630 */                  iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll13;
                        } else {
/* 1634 */                  oloIl1l1oOii2 = oloIl1l1oOii;
/* 1636 */                  o1ol100o0O2 = o1ol100o0O;
/* 1638 */                  agentTools2 = agentTools;
/* 1640 */                  o1i1O1I2 = o1i1O1I4;
/* 1642 */                  ol0o1OiOIIIl2 = ol0o1OiOIIIl5;
/* 1644 */                  o11OliOlOII2 = o11OliOlOII5;
/* 1650 */                  iloI0lOlll13.I00i01iIIliI(596893302);
/* 1653 */                  iloI0lOlll13.I0010I0i(false);
                            iloI0lOlll12 = iloI0lOlll13;
                        }
                    } else {
/* 1669 */              oloIl1l1oOii2 = oloIl1l1oOii;
/* 1670 */              o1ol100o0O2 = o1ol100o0O;
/* 1671 */              agentTools2 = agentTools;
/* 1672 */              iloI0lOlll14.I00OilO00Il();
/* 1675 */              o11OliOlOII2 = o11OliOlOII;
/* 1677 */              ol0o1OiOIIIl2 = ol0o1OiOIIIl;
/* 1679 */              o1i1O1I2 = o1i1O1I;
                        iloI0lOlll12 = iloI0lOlll14;
                    }
/* 1681 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 1685 */          if (oOloioIlI001IO000 != null) {
/* 1690 */              I0iIo0oII i0iIo0oII = new I0iIo0oII(0);
/* 1693 */              i0iIo0oII.I00iiO = oloIl1l1oOii2;
/* 1695 */              i0iIo0oII.I00iio = o1ol100o0O2;
/* 1699 */              i0iIo0oII.I00iiI = illOOo00lI;
/* 1701 */              i0iIo0oII.I00ilI0I1 = agentTools2;
/* 1703 */              i0iIo0oII.I00ilO0 = o11OliOlOII2;
/* 1705 */              i0iIo0oII.I00io1l = ol0o1OiOIIIl2;
/* 1707 */              i0iIo0oII.I00ioIO = o1i1O1I2;
/* 1709 */              VarHandle.storeStoreFence();
/* 1712 */              oOloioIlI001IO000.I0000O = i0iIo0oII;
                    }
                }

                public static final List I00000oOI(O0IOli0o0 o0IOli0o0) {
/* 16 */            return OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I000OiO(o0IOli0o0, I0ollliOo0.I00lli11), I0ollliOo0.I00lll10, OilOOii.I00ioIO));
                }

                public static final void I0000Il00O(O11OliOlOII o11OliOlOII, O1ol100o0O o1ol100o0O, Ol0o1OiOIIIl ol0o1OiOIIIl, String str, AgentTools agentTools, Function1 function1) {
/* 1 */             String str2 = str;
/* 13 */            O1oIOiI11o0 o1oIOiI11o0 = ((O1oiOloOo) o1ol100o0O.I000OOo1O.I00iOIl.getValue()).I000II;
/* 15 */            ArrayList arrayListI000OiO = ol0o1OiOIIIl.I000OiO();
/* 44 */            String strI000O01llI0 = ((Boolean) O1i1oIi1il.I00000oOI.I00iOIl.getValue()).booleanValue() ? agentTools.getMcpManagerViewModel().I000O01llI0() : "";
/* 55 */            boolean z = strI000O01llI0.length() > 0;
/* 64 */            if (str2.equals("You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill.") || str2.equals("You are an AI assistant that helps users by answering questions and completing tasks using skills and tools. For EVERY new task, request, or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. EVALUATE AND ROUTE:\n   Determine if the request should be handled by a \"Skill\" (requires loading instructions) or directly by an \"MCP Tool\".\n   - If it is a Skill: Go to Step 2.\n   - If it is an MCP Tool: Go to Step 4.\n   - If nothing is found, output \"No skills or tools found\" and stop.\n\n--- SKILLS ---\n___SKILLS___\n\n--- MCP TOOLS ---\n___TOOLS___\n\n==================================================\nFLOW A: SKILL EXECUTION\n==================================================\n\n2. Find the most relevant skill from the --- SKILLS --- list. You MUST NOT use `run_intent` or `runMcpTool` under any circumstances at this step.\n\n3. Use the `load_skill` tool to read its instructions. Follow the skill's instructions exactly to complete the task.\n   - You MUST NOT output any intermediate thoughts or status updates. No exceptions!\n   - Output ONLY the final result when successful. It should contain a one-sentence summary of the action taken and the final result of the skill.\n   - Stop here once Flow A is complete.\n\n==================================================\nFLOW B: MCP TOOL DIRECT EXECUTION\n==================================================\n\n4. Find the most relevant tool from the --- MCP TOOLS --- list.\n\n5. Call the `runMcpTool` tool with the following parameters:\n   - `toolName`: The name of the tool to run. Use the exact name from the list above. Do not hallucinate the name. Pay attention to casing and plurals.\n   - `input`: The input JSON object that matches the tool's expected input schema.\n\n6. Output ONLY the final result returned by the tool. You MUST NOT output any intermediate thoughts or status updates. No exceptions!")) {
/* 72 */                str2 = z ? "You are an AI assistant that helps users by answering questions and completing tasks using skills and tools. For EVERY new task, request, or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. EVALUATE AND ROUTE:\n   Determine if the request should be handled by a \"Skill\" (requires loading instructions) or directly by an \"MCP Tool\".\n   - If it is a Skill: Go to Step 2.\n   - If it is an MCP Tool: Go to Step 4.\n   - If nothing is found, output \"No skills or tools found\" and stop.\n\n--- SKILLS ---\n___SKILLS___\n\n--- MCP TOOLS ---\n___TOOLS___\n\n==================================================\nFLOW A: SKILL EXECUTION\n==================================================\n\n2. Find the most relevant skill from the --- SKILLS --- list. You MUST NOT use `run_intent` or `runMcpTool` under any circumstances at this step.\n\n3. Use the `load_skill` tool to read its instructions. Follow the skill's instructions exactly to complete the task.\n   - You MUST NOT output any intermediate thoughts or status updates. No exceptions!\n   - Output ONLY the final result when successful. It should contain a one-sentence summary of the action taken and the final result of the skill.\n   - Stop here once Flow A is complete.\n\n==================================================\nFLOW B: MCP TOOL DIRECT EXECUTION\n==================================================\n\n4. Find the most relevant tool from the --- MCP TOOLS --- list.\n\n5. Call the `runMcpTool` tool with the following parameters:\n   - `toolName`: The name of the tool to run. Use the exact name from the list above. Do not hallucinate the name. Pay attention to casing and plurals.\n   - `input`: The input JSON object that matches the tool's expected input schema.\n\n6. Output ONLY the final result returned by the tool. You MUST NOT output any intermediate thoughts or status updates. No exceptions!" : "You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill.";
                    }
/* 92 */            Contents contentsI00000oIO = (arrayListI000OiO.isEmpty() && strI000O01llI0.length() == 0) ? null : I0iOOlloo.I00000oIO(str2, strI000O01llI0, arrayListI000OiO);
/* 101 */           List listSingletonList = Collections.singletonList(ToolKt.tool(agentTools));
/* 105 */           boolean z2 = o1oIOiI11o0.I001i1O0Ol;
/* 107 */           boolean z3 = o1oIOiI11o0.I001i1lo1io;
/* 111 */           I0iII1llo i0iII1llo = new I0iII1llo(0);
/* 116 */           i0iII1llo.I00iiI = function1;
/* 118 */           i0iII1llo.I00iiO = o1oIOiI11o0;
/* 120 */           VarHandle.storeStoreFence();
/* 123 */           o11OliOlOII.getClass();
/* 142 */           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o11OliOlOII), IiiIil1lOIO.I00000oIO, null, new O11iIIiO(o11OliOlOII, o1oIOiI11o0, z2, z3, contentsI00000oIO, listSingletonList, true, i0iII1llo, null), 2);
                }

                public static final void I0000oI00(O11OliOlOII o11OliOlOII, O1oIOiI11o0 o1oIOiI11o0, AgentTools agentTools) {
/* 1 */             IO1iIoo iO1iIoo = IO1iIoo.I00iOIl;
/* 3 */             IO1OO01i0 iO1OO01i0I000II = o11OliOlOII.I000II(o1oIOiI11o0);
/* 7 */             if (iO1OO01i0I000II == null || !(iO1OO01i0I000II instanceof IO1OioOO1III)) {
/* 408 */               return;
                    }
/* 15 */            String str = ((IO1OioOO1III) iO1OO01i0I000II).I000II;
/* 24 */            if (OlOolloIIOl0.I000l1(str, "Loading", false)) {
/* 42 */                agentTools.sendAgentAction(new Ol0oI0(OlOolloIIOl0.I000iOII(str, "Loading", "Loaded"), (String) null, 28, false, (String) null));
                    } else if (OlOolloIIOl0.I000l1(str, "Calling", false)) {
/* 70 */                agentTools.sendAgentAction(new Ol0oI0(OlOolloIIOl0.I000iOII(str, "Calling", "Called"), (String) null, 28, false, (String) null));
                    } else if (OlOolloIIOl0.I000l1(str, "Executing", false)) {
/* 98 */                agentTools.sendAgentAction(new Ol0oI0(OlOolloIIOl0.I000iOII(str, "Executing", "Executed"), (String) null, 28, false, (String) null));
                    }
                }
            }
