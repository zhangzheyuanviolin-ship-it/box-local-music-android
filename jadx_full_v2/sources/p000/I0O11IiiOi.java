            package p000;

            import com.google.ai.edge.gallery.data.AllowedSkill;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class I0O11IiiOi implements IlliOIilI {
                public final int I00iOIl;
                public List I00iiI;
                public Object I00iiO;
                public OI10i0Il I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public I0O11IiiOi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    int i2;
                    int i3;
/* 3 */             int i4 = this.I00iOIl;
/* 5 */             IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 16 */            int i5 = 0;
                    switch (i4) {
                        case 0:
/* 937 */                   O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 943 */                   int iIntValue = ((Number) obj2).intValue();
/* 949 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 955 */                   int iIntValue2 = ((Number) obj4).intValue();
/* 961 */                   if ((iIntValue2 & 6) == 0) {
/* 970 */                       i = iIntValue2 | (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2);
                            } else {
/* 973 */                       i = iIntValue2;
                            }
/* 976 */                   if ((iIntValue2 & 48) == 0) {
/* 989 */                       i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                            }
/* 1003 */                  if (!iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 1097 */                      iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 1013 */                      AllowedSkill allowedSkill = (AllowedSkill) this.I00iiI.get(iIntValue);
/* 1018 */                      iloI0lOlll1.I00i01iIIliI(-81083139);
/* 1087 */                      iOIOOiOiO0O.I00000oOI(allowedSkill, (I101liloIo1) this.I00ilI0I1, (Function1) this.I00iiO, (String) ((Map) this.I00iio.getValue()).get(allowedSkill.getSkillUrl()), ((Set) ((OI10i0Il) this.I00io1l).getValue()).contains(allowedSkill.getSkillUrl()), ((Set) this.I00ilO0).contains(allowedSkill.getName()), iloI0lOlll1, 0);
/* 1092 */                      iloI0lOlll1.I0010I0i(false);
                                break;
                            }
                        case 1:
/* 365 */                   O0l11l1iOO o0l11l1iOO2 = (O0l11l1iOO) obj;
/* 371 */                   int iIntValue3 = ((Number) obj2).intValue();
/* 377 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj3;
/* 383 */                   int iIntValue4 = ((Number) obj4).intValue();
/* 389 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ilO0;
/* 393 */                   Ii0110 ii0110 = (Ii0110) this.I00ilI0I1;
/* 397 */                   Function1 function1 = (Function1) this.I00iiO;
/* 401 */                   if ((iIntValue4 & 6) == 0) {
/* 410 */                       i2 = iIntValue4 | (iloI0lOlll12.I000II(o0l11l1iOO2) ? 4 : 2);
                            } else {
/* 413 */                       i2 = iIntValue4;
                            }
/* 416 */                   if ((iIntValue4 & 48) == 0) {
/* 429 */                       i2 |= iloI0lOlll12.I0000oI00(iIntValue3) ? 32 : 16;
                            }
/* 443 */                   if (!iloI0lOlll12.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 931 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 451 */                       String str = (String) this.I00iiI.get(iIntValue3);
/* 456 */                       iloI0lOlll12.I00i01iIIliI(1551427901);
/* 477 */                       boolean zI000II = iloI0lOlll12.I000II(function1) | iloI0lOlll12.I000II(str) | iloI0lOlll12.I000OOo1O(ii0110) | iloI0lOlll12.I000II(ol010000lo00);
/* 478 */                       Object objI00O0i0ii = iloI0lOlll12.I00O0i0ii();
                                Object obj5 = objI00O0i0ii;
/* 482 */                       if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 488 */                           OI10i0Il oI10i0Il = this.I00iio;
/* 490 */                           II000oliiIO iI000oliiIO = new II000oliiIO(i5);
/* 493 */                           iI000oliiIO.I00iio = function1;
/* 495 */                           iI000oliiIO.I00iiO = str;
/* 497 */                           iI000oliiIO.I00iiI = ii0110;
/* 499 */                           iI000oliiIO.I00ilI0I1 = ol010000lo00;
/* 501 */                           iI000oliiIO.I00ilO0 = oI10i0Il;
/* 503 */                           VarHandle.storeStoreFence();
/* 506 */                           iloI0lOlll12.I00iio(iI000oliiIO);
                                    obj5 = iI000oliiIO;
                                }
/* 513 */                       O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 530 */                       O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(iO01II.I000II(i1Ioo1o0.I00000oOI(o1ooIo101ll, false, null, (IllOOo00lI) obj5, 15), 16.0f, 6.0f), 1.0f);
/* 542 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(16.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll12, 54);
/* 548 */                       int iHashCode = Long.hashCode(iloI0lOlll12.I00OI1);
/* 552 */                       OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll12.I000lI();
/* 556 */                       O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI0000oI00);
/* 562 */                       IOl0oi0lOl1.I000lI.getClass();
/* 565 */                       iloI0lOlll12.I00i0oil();
/* 570 */                       if (iloI0lOlll12.I00O10llo) {
/* 574 */                           iloI0lOlll12.I000l1(O0iiOioolIi.I01101IOlO);
                                } else {
/* 578 */                           iloI0lOlll12.I00io1l();
                                }
/* 583 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 588 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll12, oO0lO0l0I000lI);
/* 597 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll12, Integer.valueOf(iHashCode));
/* 600 */                       li01Ooiio01.I00000oOI(iloI0lOlll12);
/* 605 */                       li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 608 */                       IoiOolO1iOo ioiOolO1iOoI0000O = iOlO01oOOll.I00000oIO;
/* 610 */                       if (ioiOolO1iOoI0000O == null) {
/* 634 */                           IoiOo1iI ioiOo1iI = new IoiOo1iI("Rounded.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 637 */                           int i6 = Ooo1iOO.I00000oIO;
/* 643 */                           OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 650 */                           OO0Ii1 oO0Ii1I000II = IIl001iO0Io.I000II(12.0f, 2.0f);
/* 668 */                           oO0Ii1I000II.I0000O(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
/* 676 */                           oO0Ii1I000II.I000lI(4.48f, 10.0f, 10.0f, 10.0f);
/* 684 */                           oO0Ii1I000II.I000lI(10.0f, -4.48f, 10.0f, -10.0f);
/* 690 */                           oO0Ii1I000II.I000l1(17.52f, 2.0f, 12.0f, 2.0f);
/* 705 */                           IIl001iO0Io.I001i1O0Ol(oO0Ii1I000II, 9.29f, 16.29f, 5.7f, 12.7f);
/* 725 */                           oO0Ii1I000II.I0000oI00(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
/* 742 */                           oO0Ii1I000II.I0000oI00(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
/* 748 */                           oO0Ii1I000II.I000O01llI0(10.0f, 14.17f);
/* 757 */                           oO0Ii1I000II.I000OOo1O(6.88f, -6.88f);
/* 760 */                           oO0Ii1I000II.I0000oI00(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
/* 777 */                           oO0Ii1I000II.I0000oI00(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
/* 786 */                           oO0Ii1I000II.I000OOo1O(-7.59f, 7.59f);
/* 803 */                           oO0Ii1I000II.I0000oI00(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
/* 806 */                           oO0Ii1I000II.I0000Il00O();
/* 811 */                           IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1I000II.I00000oIO, 0, olI00IIlOO);
/* 814 */                           ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 818 */                           iOlO01oOOll.I00000oIO = ioiOolO1iOoI0000O;
                                }
/* 820 */                       OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 857 */                       IoOoiI1II00i.I00000oIO(ioiOolO1iOoI0000O, null, iOIiO1OII1.I00000oIO(o1ooIo101ll, O0000Ioio00.I0000O(str, (String) this.I00io1l) ? 1.0f : 0.0f), ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I0001Ioi1lo, iloI0lOlll12, 48, 0);
/* 920 */                       Oo0i1oIIoOO.I00000oOI(str, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oIO.I00100o1O0lo, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(olO1iIi1ol0)).I00000oOI.I000lI, iloI0lOlll12, 0, 0, 131066);
/* 923 */                       iloI0lOlll12.I0010I0i(true);
/* 926 */                       iloI0lOlll12.I0010I0i(false);
                                break;
                            }
                        default:
/* 22 */                    O0l11l1iOO o0l11l1iOO3 = (O0l11l1iOO) obj;
/* 28 */                    int iIntValue5 = ((Number) obj2).intValue();
/* 34 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj3;
/* 40 */                    int iIntValue6 = ((Number) obj4).intValue();
/* 46 */                    IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00ilI0I1;
/* 50 */                    if ((iIntValue6 & 6) == 0) {
/* 61 */                        i3 = (iloI0lOlll13.I000II(o0l11l1iOO3) ? 4 : 2) | iIntValue6;
                            } else {
/* 63 */                        i3 = iIntValue6;
                            }
/* 66 */                    if ((iIntValue6 & 48) == 0) {
/* 78 */                        i3 |= iloI0lOlll13.I0000oI00(iIntValue5) ? 32 : 16;
                            }
/* 91 */                    if (!iloI0lOlll13.I00OIl(i3 & 1, (i3 & 147) != 146)) {
/* 359 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 99 */                        Conversation conversation = (Conversation) this.I00iiI.get(iIntValue5);
/* 104 */                       iloI0lOlll13.I00i01iIIliI(-141614972);
/* 115 */                       boolean zI000OOo1O = iloI0lOlll13.I000OOo1O(iO1OIo01l1) | iloI0lOlll13.I000II(conversation);
/* 116 */                       Object objI00O0i0ii2 = iloI0lOlll13.I00O0i0ii();
                                Object obj6 = objI00O0i0ii2;
/* 120 */                       if (zI000OOo1O || objI00O0i0ii2 == iOO0o0I1l) {
/* 128 */                           I01i01OoI i01i01OoI = new I01i01OoI(8);
/* 131 */                           i01i01OoI.I00iiI = iO1OIo01l1;
/* 133 */                           i01i01OoI.I00iiO = conversation;
/* 135 */                           VarHandle.storeStoreFence();
/* 138 */                           iloI0lOlll13.I00iio(i01i01OoI);
                                    obj6 = i01i01OoI;
                                }
/* 141 */                       Function1 function12 = (Function1) obj6;
/* 143 */                       Oll1lO oll1lO = Oll1lO.I00iiO;
/* 148 */                       iloI0lOlll13.I00i01iIIliI(-485754360);
/* 151 */                       OlO1iIi1ol0 olO1iIi1ol02 = IOlO0o100i1i.I000O01llI0;
/* 157 */                       IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll13.I000iOII(olO1iIi1ol02);
/* 159 */                       boolean zI000II2 = iloI0lOlll13.I000II(iiIooOOOI);
/* 163 */                       Object objI00O0i0ii3 = iloI0lOlll13.I00O0i0ii();
                                Object obj7 = objI00O0i0ii3;
/* 167 */                       if (zI000II2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 173 */                           Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(4);
/* 176 */                           ol1OiIli00Ii.I00iiI = iiIooOOOI;
/* 178 */                           VarHandle.storeStoreFence();
/* 181 */                           iloI0lOlll13.I00iio(ol1OiIli00Ii);
                                    obj7 = ol1OiIli00Ii;
                                }
/* 184 */                       Function1 function13 = (Function1) obj7;
/* 186 */                       iloI0lOlll13.I0010I0i(false);
/* 193 */                       IiIooOOOI iiIooOOOI2 = (IiIooOOOI) iloI0lOlll13.I000iOII(olO1iIi1ol02);
/* 195 */                       Object[] objArr = new Object[0];
/* 199 */                       Oll1iiOII oll1iiOII = new Oll1iiOII(0);
/* 206 */                       O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(12);
/* 209 */                       o11IOOoiI10i.I00iiI = iiIooOOOI2;
/* 211 */                       o11IOOoiI10i.I00iiO = function12;
/* 213 */                       o11IOOoiI10i.I00iio = function13;
/* 215 */                       VarHandle.storeStoreFence();
/* 218 */                       IoloOio0I ioloOio0II00000oIO = OiIoloOl0.I00000oIO(oll1iiOII, o11IOOoiI10i);
/* 240 */                       boolean zI0000oI00 = iloI0lOlll13.I0000oI00(2) | iloI0lOlll13.I000II(iiIooOOOI2) | iloI0lOlll13.I000II(function12) | iloI0lOlll13.I000II(function13);
/* 241 */                       Object objI00O0i0ii4 = iloI0lOlll13.I00O0i0ii();
                                Object obj8 = objI00O0i0ii4;
/* 245 */                       if (zI0000oI00 || objI00O0i0ii4 == iOO0o0I1l) {
/* 252 */                           OioI1O oioI1O = new OioI1O(3);
/* 255 */                           oioI1O.I00iiI = oll1lO;
/* 257 */                           oioI1O.I00iiO = iiIooOOOI2;
/* 259 */                           oioI1O.I00iio = function12;
/* 261 */                           oioI1O.I00ilI0I1 = function13;
/* 263 */                           VarHandle.storeStoreFence();
/* 266 */                           iloI0lOlll13.I00iio(oioI1O);
                                    obj8 = oioI1O;
                                }
/* 275 */                       Oll1l0IOli oll1l0IOli = (Oll1l0IOli) lIo1lO.I0000Il00O(objArr, ioloOio0II00000oIO, (IllOOo00lI) obj8, iloI0lOlll13, 0);
/* 279 */                       IO1O01l iO1O01l = new IO1O01l(i5);
/* 282 */                       iO1O01l.I00iiI = oll1l0IOli;
/* 284 */                       VarHandle.storeStoreFence();
/* 290 */                       IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(416249438, iO1O01l, iloI0lOlll13);
/* 298 */                       O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 302 */                       OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00ilO0;
/* 304 */                       OI10i0Il oI10i0Il2 = this.I00iio;
/* 308 */                       OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00io1l;
/* 310 */                       IO1O0IoOo1 iO1O0IoOo1 = new IO1O0IoOo1();
/* 313 */                       iO1O0IoOo1.I00iOIl = conversation;
/* 315 */                       iO1O0IoOo1.I00iiI = iO1OIo01l1;
/* 317 */                       iO1O0IoOo1.I00iiO = o1ol100o0O;
/* 319 */                       iO1O0IoOo1.I00iio = oI1o1o1iO1l;
/* 321 */                       iO1O0IoOo1.I00ilI0I1 = oI10i0Il2;
/* 323 */                       iO1O0IoOo1.I00ilO0 = oI10i0Il3;
/* 325 */                       VarHandle.storeStoreFence();
/* 349 */                       lOiOOo1IOol0.I00000oIO(oll1l0IOli, iOii1lI00000oOI, null, false, false, false, null, iiioOl1O.I00000oOI(454632036, iO1O0IoOo1, iloI0lOlll13), iloI0lOlll13, 12586040);
/* 354 */                       iloI0lOlll13.I0010I0i(false);
                                break;
                            }
                    }
/* 362 */           return ooiIlOl1iI;
                }
            }
