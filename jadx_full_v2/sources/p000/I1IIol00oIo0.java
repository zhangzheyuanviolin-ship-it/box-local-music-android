            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class I1IIol00oIo0 implements IlliIl1l11O {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;

                public I1IIol00oIo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    IoiOolO1iOo ioiOolO1iOoI0000O;
                    long j;
                    long j2;
/* 3 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 777 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 779 */                   boolean z = this.I00iiI;
/* 783 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 789 */                   int iIntValue = ((Integer) obj2).intValue();
/* 804 */                   if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 808 */                       OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(28.0f);
/* 814 */                       I0oooI i0oooI = new I0oooI(i2);
/* 817 */                       i0oooI.I00iiI = illOOo00lI;
/* 819 */                       i0oooI.I00iiO = z;
/* 821 */                       VarHandle.storeStoreFence();
/* 839 */                       iOl111l1l.I00000oOI(null, oiI111II00000oOI, null, null, null, iiioOl1O.I00000oOI(892718723, i0oooI, iloI0lOlll1), iloI0lOlll1, 196608, 29);
                            } else {
/* 843 */                       iloI0lOlll1.I00OilO00Il();
                            }
/* 846 */                   return ooiIlOl1iI;
                        case 1:
/* 468 */                   boolean z2 = this.I00iiI;
/* 472 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 476 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 482 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 498 */                   if (iloI0lOlll12.I00OIl(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
/* 510 */                       if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 512 */                           ioiOolO1iOoI0000O = lOOio1.I00000oIO();
                                } else {
/* 519 */                           ioiOolO1iOoI0000O = lI10ooii.I00000oIO;
/* 521 */                           if (ioiOolO1iOoI0000O == null) {
/* 544 */                               IoiOo1iI ioiOo1iI = new IoiOo1iI("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 547 */                               int i3 = Ooo1iOO.I00000oIO;
/* 553 */                               OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 560 */                               ArrayList arrayList = new ArrayList(32);
/* 573 */                               arrayList.add(new OO0OIl1l10O(8.0f, 6.82f));
/* 584 */                               arrayList.add(new OO0iIOIioOI(10.36f));
/* 608 */                               arrayList.add(new OO0Oi1loOoi0(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
/* 622 */                               arrayList.add(new OO0Oo0lIiIl(8.14f, -5.18f));
/* 647 */                               arrayList.add(new OO0Oi1loOoi0(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
/* 661 */                               arrayList.add(new OO0OIioIIl(9.54f, 5.98f));
/* 685 */                               arrayList.add(new OO0O0iIOOOo(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
/* 690 */                               arrayList.add(OO0IooOI.I0000Il00O);
/* 693 */                               IoiOo1iI.I00000oOI(ioiOo1iI, arrayList, 0, olI00IIlOO);
/* 696 */                               ioiOolO1iOoI0000O = ioiOo1iI.I0000O();
/* 700 */                               lI10ooii.I00000oIO = ioiOolO1iOoI0000O;
                                    }
                                }
/* 516 */                       IoiOolO1iOo ioiOolO1iOo = ioiOolO1iOoI0000O;
/* 723 */                       String strI00000oOI = lOOoli.I00000oOI(((Boolean) oI10i0Il.getValue()).booleanValue() ? R.string.cd_stop_playback_icon : R.string.cd_play_audio_icon, iloI0lOlll12);
/* 727 */                       if (z2) {
/* 732 */                           iloI0lOlll12.I00i01iIIliI(-2030419566);
/* 735 */                           iloI0lOlll12.I0010I0i(false);
/* 738 */                           j = IOOiio0i.I0001Ioi1lo;
                                } else {
/* 745 */                           iloI0lOlll12.I00i01iIIliI(-2030418380);
/* 758 */                           j = ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00000oIO;
/* 760 */                           iloI0lOlll12.I0010I0i(false);
                                }
/* 767 */                       IoOoiI1II00i.I00000oIO(ioiOolO1iOo, strI00000oOI, null, j, iloI0lOlll12, 0, 4);
                            } else {
/* 771 */                       iloI0lOlll12.I00OilO00Il();
                            }
/* 774 */                   return ooiIlOl1iI;
                        case 2:
/* 457 */                   ((Integer) obj2).getClass();
/* 464 */                   i01IoIoO00oO.I00000oOI(this.I00iiI, (O1oOl0) this.I00iiO, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 467 */                   return ooiIlOl1iI;
                        case 3:
/* 432 */                   ((Integer) obj2).getClass();
/* 439 */                   iioii1oiO01i.I0000Il00O((Oo0IOoOi01) this.I00iiO, this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 442 */                   return ooiIlOl1iI;
                        case 4:
/* 331 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiO;
/* 333 */                   boolean z3 = this.I00iiI;
/* 337 */                   Ii00l101O ii00l101O = (Ii00l101O) obj;
/* 341 */                   Ii00ilI1 ii00ilI1 = (Ii00ilI1) obj2;
/* 345 */                   if (!(ii00ilI1 instanceof ii0iioiOi)) {
/* 347 */                       return ii00l101O.I00ioIO(ii00ilI1);
                            }
/* 354 */                   Ii00l101O ii00l101O2 = (Ii00l101O) oOo0ooi.I00iOIl;
/* 356 */                   lOOlOoll loolooll = ii0iioiOi.I00iiO;
/* 358 */                   Ii00ilI1 ii00ilI1I00lli11 = ii00l101O2.I00lli11(loolooll);
/* 362 */                   if (ii00ilI1I00lli11 == null) {
/* 381 */                       return ii00l101O.I00ioIO(z3 ? new ii0iioiOi(((ii0iioiOi) ii00ilI1).I00iiI, iIl1i1i11.I00000oIO) : (ii0iioiOi) ii00ilI1);
                            }
/* 394 */                   oOo0ooi.I00iOIl = ((Ii00l101O) oOo0ooi.I00iOIl).I00OIl(loolooll);
/* 413 */                   return ii00l101O.I00ioIO(new ii0iioiOi(((ii0iioiOi) ii00ilI1).I00iiI, iIl1i1i11.I00000oIO));
                        case 5:
/* 191 */                   boolean z4 = this.I00iiI;
/* 196 */                   String str = (String) this.I00iiO;
/* 200 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 206 */                   int iIntValue3 = ((Integer) obj2).intValue();
/* 222 */                   if (iloI0lOlll13.I00OIl(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
/* 224 */                       OlO1iIi1ol0 olO1iIi1ol0 = O1OoilIO.I00000oOI;
/* 234 */                       Oo0lloOiiIOI oo0lloOiiIOI = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oOI.I000o00OoI0I;
/* 242 */                       O1ooiI111i o1ooiI111iI000II = iO01II.I000II(O1ooIo101ll.I00000oIO, 10.0f, 6.0f);
/* 246 */                       if (z4) {
/* 251 */                           iloI0lOlll13.I00i01iIIliI(1863325801);
/* 262 */                           j2 = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I0000O;
                                } else {
/* 272 */                           iloI0lOlll13.I00i01iIIliI(1863327392);
/* 283 */                           j2 = ((O1OoiOIi1ooi) iloI0lOlll13.I000iOII(olO1iIi1ol0)).I00000oIO.I00100o1O0lo;
                                }
/* 264 */                       iloI0lOlll13.I0010I0i(false);
/* 319 */                       Oo0i1oIIoOO.I00000oOI(str, o1ooiI111iI000II, j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, oo0lloOiiIOI, iloI0lOlll13, 48, 0, 131064);
                            } else {
/* 325 */                       iloI0lOlll13.I00OilO00Il();
                            }
/* 328 */                   return ooiIlOl1iI;
                        case 6:
/* 180 */                   ((Integer) obj2).getClass();
/* 187 */                   l1IoI0oIOOlI.I00000oIO((IO1i10ilI) this.I00iiO, this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 190 */                   return ooiIlOl1iI;
                        case 7:
/* 155 */                   ((Integer) obj2).getClass();
/* 162 */                   l1IoiI11I.I00000oIO((IO1iI1i) this.I00iiO, this.I00iiI, (IloI0lOlll1) obj, lIill1iOoIO.I00000oIO(1));
/* 165 */                   return ooiIlOl1iI;
                        case 8:
/* 104 */                   Ol0ooOiloO1 ol0ooOiloO1 = (Ol0ooOiloO1) this.I00iiO;
/* 106 */                   boolean z5 = this.I00iiI;
/* 110 */                   IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 116 */                   Ol10Oo ol10Oo = Ol10Oo.I00000oIO;
/* 137 */                   IilloIOOO0i.I00iiO(iilloIOOO0i, ol0ooOiloO1.I00000oIO(z5, true), iilloIOOO0i.I00i0ilIl0i(Ol10Oo.I00000oOI) / 2.0f, ((OIOlIiiioi) obj2).I00000oIO, null, 120);
/* 140 */                   return ooiIlOl1iI;
                        default:
/* 15 */                    Oll1l0IOli oll1l0IOli = (Oll1l0IOli) this.I00iiO;
/* 17 */                    boolean z6 = this.I00iiI;
/* 30 */                    I1loII i1loII = new I1loII(5);
/* 33 */                    i1loII.I00iiO = (IooOl0ol01) obj;
/* 35 */                    i1loII.I00iiI = z6;
/* 37 */                    VarHandle.storeStoreFence();
/* 40 */                    Ii1loIll001 ii1loIll001I00000oIO = I0l0lIoOIoIi.I00000oIO(i1loII);
/* 44 */                    I0l1OOl1l10 i0l1OOl1l10 = oll1l0IOli.I00000oIO;
/* 46 */                    I0l1OOl1l10 i0l1OOl1l102 = oll1l0IOli.I00000oIO;
/* 54 */                    boolean z7 = i0l1OOl1l10.I0000Il00O().I0000Il00O > 0;
/* 65 */                    Oll1lO oll1lO = (Oll1lO) ((OIooliIO0) i0l1OOl1l102.I000II).getValue();
/* 75 */                    Oll1lO oll1lO2 = (Oll1lO) ((IiO0o1I) i0l1OOl1l102.I000iOII).getValue();
/* 77 */                    if (z7 || !ii1loIll001I00000oIO.I0000Il00O(oll1lO)) {
/* 94 */                        oll1lO = ii1loIll001I00000oIO.I0000Il00O(oll1lO2) ? oll1lO2 : Oll1lO.I00iiO;
                            }
/* 98 */                    return new OIoi0IIoi(ii1loIll001I00000oIO, oll1lO);
                    }
                }
            }
