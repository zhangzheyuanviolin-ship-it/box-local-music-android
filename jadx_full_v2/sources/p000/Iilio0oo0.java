            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Iilio0oo0 extends IiIioO0ol1oI implements OO1iloII0lOo, IolI11, IOlIil1, Iill1Iloi0 {
                public OIilII I00o101lO;
                public Function1 I00oI0i;
                public boolean I00oII;
                public OI0lOIiOIOOo I00oIiI10;
                public IIIII1OI1 I00oO101o;
                public IilioOoi1O I00oOio10iI1;
                public boolean I00ol1;
                public boolean I00olI;
                public IilI1IoOOli I00oli;
                public long I00oliIiO01i = 0;
                public Io01I1Olo0 I00oo1iO0ll;
                public Io01I1Olo0 I00ooIo0;
                public IilIIl1 I00ooiO1I;
                public IilIIl0iIO I00oooO;
                public IilI1i I0100i;
                public il1oi11i01iI I0100o111I;
                public O1IOillioo0I I010101Oo1lO;
                public Io1OIO1l0o I010I0;
                public IolI10oO I010II;

                public Iilio0oo0(Function1 function1, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, OIilII oIilII) {
/* 4 */             this.I00o101lO = oIilII;
/* 6 */             this.I00oI0i = function1;
/* 8 */             this.I00oII = z;
/* 10 */            this.I00oIiI10 = oI0lOIiOIOOo;
                }

                public static void I0110OiO(Iilio0oo0 iilio0oo0, OO1il00lI oO1il00lI, long j, long j2, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 j2 = 0;
                    }
/* 7 */             IilIIl0iIO iilIIl0iIO = iilio0oo0.I00oooO;
/* 10 */            if (iilIIl0iIO == null) {
/* 14 */                iilIIl0iIO = new IilIIl0iIO();
/* 18 */                iilIIl0iIO.I00000oIO = null;
/* 25 */                iilIIl0iIO.I00000oOI = Long.MAX_VALUE;
/* 27 */                iilIIl0iIO.I0000Il00O = false;
/* 29 */                iilio0oo0.I00oooO = iilIIl0iIO;
                    }
/* 31 */            iilIIl0iIO.I00000oIO = oO1il00lI;
/* 33 */            iilIIl0iIO.I00000oOI = j;
/* 35 */            Io1OIO1l0o io1OIO1l0o = iilio0oo0.I010I0;
/* 37 */            OIilII oIilII = iilio0oo0.I00o101lO;
/* 39 */            if (io1OIO1l0o == null) {
/* 47 */                iilio0oo0.I010I0 = new Io1OIO1l0o(oIilII, 2);
                    } else {
/* 50 */                io1OIO1l0o.I00iiO = oIilII;
/* 52 */                io1OIO1l0o.I00iiI = j2;
                    }
/* 54 */            iilIIl0iIO.I0000Il00O = false;
/* 56 */            iilio0oo0.I0100o111I = iilIIl0iIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r19v0, types: [IiIioO0ol1oI, Iilio0oo0] */
                /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v21 */
                /* JADX WARN: Type inference failed for: r8v22 */
                /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object] */
                @Override
                public final void I0010o(I00Ol00 i00Ol00, OO1i0l oO1i0l) {
                    Object obj;
                    float f;
                    Object obj2;
                    char c;
                    float fIntBitsToFloat;
                    long jFloatToRawIntBits;
                    int iFloatToRawIntBits;
                    Object obj3;
                    Iol1O1 iol1O1;
                    Iol1O1 iol1O12;
/* 7 */             int i = i00Ol00.I00000oOI;
/* 11 */            ArrayList arrayList = (ArrayList) i00Ol00.I0000Il00O;
/* 15 */            if (this.I00oII) {
/* 17 */                IolI10oO iolI10oO = this.I010II;
/* 19 */                boolean z = false;
/* 19 */                boolean z2 = false;
/* 20 */                if (iolI10oO == null) {
/* 24 */                    iolI10oO = new IolI10oO();
/* 27 */                    iolI10oO.I00iOIl = this;
/* 32 */                    O1I1OO o1i1oo = new O1I1OO(4, (byte) (z2 ? 1 : 0));
/* 40 */                    o1i1oo.I00iiO = new OI0oiiIO0();
/* 42 */                    iolI10oO.I00l0I0l0lO1 = o1i1oo;
/* 48 */                    O1I1OO o1i1oo2 = new O1I1OO(8, (byte) (z ? 1 : 0));
/* 56 */                    o1i1oo2.I00iiO = new OI0llOl1ooO0();
/* 58 */                    iolI10oO.I00l0OO0IO = o1i1oo2;
/* 60 */                    VarHandle.storeStoreFence();
/* 63 */                    this.I010II = iolI10oO;
                        }
/* 67 */                if (this.I00ooIo0 == null) {
/* 71 */                    Io01I1Olo0 io01I1Olo0 = new Io01I1Olo0();
/* 74 */                    io01I1Olo0.I00o0iI0io1 = iolI10oO;
/* 76 */                    VarHandle.storeStoreFence();
/* 79 */                    I010l1O(io01I1Olo0);
/* 82 */                    this.I00ooIo0 = io01I1Olo0;
                        }
/* 84 */                IolI10oO iolI10oO2 = this.I010II;
/* 86 */                if (iolI10oO2 != null) {
/* 88 */                    Iilio0oo0 iilio0oo0 = iolI10oO2.I00iOIl;
/* 90 */                    ioOll0I11I iooll0i11i = iolI10oO2.I00ilO0;
                            ioOll0I11I iooll0i11i2 = iooll0i11i;
/* 92 */                    if (iooll0i11i == null) {
/* 94 */                        Iol1ii0Ol iol1ii0Ol = iolI10oO2.I00iiI;
                                Iol1ii0Ol iol1ii0Ol2 = iol1ii0Ol;
/* 96 */                        if (iol1ii0Ol == null) {
/* 100 */                           Iol1Ooli iol1Ooli = Iol1Ooli.I00iiO;
/* 102 */                           Iol1ii0Ol iol1ii0Ol3 = new Iol1ii0Ol();
/* 105 */                           iol1ii0Ol3.I00000oIO = iol1Ooli;
/* 107 */                           iol1ii0Ol3.I00000oOI = false;
/* 109 */                           iol1ii0Ol3.I0000Il00O = false;
/* 111 */                           iolI10oO2.I00iiI = iol1ii0Ol3;
                                    iol1ii0Ol2 = iol1ii0Ol3;
                                }
/* 113 */                       iolI10oO2.I00ilO0 = iol1ii0Ol2;
                                iooll0i11i2 = iol1ii0Ol2;
                            }
/* 124 */                   boolean z3 = true;
/* 125 */                   if (iooll0i11i2 instanceof Iol1ii0Ol) {
/* 127 */                       Iol1ii0Ol iol1ii0Ol4 = (Iol1ii0Ol) iooll0i11i2;
/* 133 */                       if (arrayList.isEmpty()) {
/* 3380 */                          return;
                                }
/* 137 */                       int size = arrayList.size();
/* 141 */                       for (int i2 = 0; i2 < size; i2++) {
/* 153 */                           if (!ioi000.I00000oIO((Iol1O1) arrayList.get(i2))) {
/* 3380 */                              return;
                                    }
                                }
/* 164 */                       Iol1O1 iol1O13 = (Iol1O1) IOOi0Ool1i.I001lllioOl(arrayList);
/* 190 */                       Iol1Ooli iol1Ooli2 = IolI00OI1i.I00000oIO[iol1ii0Ol4.I00000oIO.ordinal()] == 1 ? !iilio0oo0.I011iiii0i() ? Iol1Ooli.I00iOIl : Iol1Ooli.I00iiI : iol1ii0Ol4.I00000oIO;
/* 192 */                       iol1ii0Ol4.I00000oIO = iol1Ooli2;
/* 196 */                       if (oO1i0l == OO1i0l.I00iOIl) {
/* 200 */                           if (iol1Ooli2 == Iol1Ooli.I00iiI) {
/* 202 */                               iol1O13.I000OOo1O = true;
/* 204 */                               iol1ii0Ol4.I00000oOI = true;
                                    }
/* 206 */                           iol1ii0Ol4.I0000Il00O = true;
                                }
/* 210 */                       if (oO1i0l == OO1i0l.I00iiI) {
/* 214 */                           if (iol1Ooli2 == Iol1Ooli.I00iOIl) {
/* 223 */                               IolI10oO.I0000Il00O(iolI10oO2, iol1O13, iol1O13.I00000oIO, 0L, 12);
/* 226 */                               return;
                                    }
/* 229 */                           if (iol1ii0Ol4.I00000oOI) {
/* 241 */                               iolI10oO2.I0001Ioi1lo(iol1O13, iol1O13, Iol1IlIII10.I00000oIO(i), 0L);
/* 248 */                               iolI10oO2.I0000oI00(iol1O13, Iol1IlIII10.I00000oIO(i), 0L);
/* 251 */                               long j = iol1O13.I00000oIO;
/* 253 */                               Iol1olioO0 iol1olioO0 = iolI10oO2.I00iiO;
/* 255 */                               if (iol1olioO0 == null) {
/* 259 */                                   iol1olioO0 = new Iol1olioO0();
/* 262 */                                   iol1olioO0.I00000oIO = Long.MAX_VALUE;
/* 264 */                                   iolI10oO2.I00iiO = iol1olioO0;
                                        }
/* 266 */                               iol1olioO0.I00000oIO = j;
/* 268 */                               iolI10oO2.I00ilO0 = iol1olioO0;
/* 270 */                               return;
                                    }
/* 3380 */                          return;
                                }
/* 3380 */                      return;
                            }
/* 273 */                   if (iooll0i11i2 instanceof Iol1lo1I1oli) {
/* 275 */                       Iol1lo1I1oli iol1lo1I1oli = (Iol1lo1I1oli) iooll0i11i2;
/* 279 */                       if (oO1i0l == OO1i0l.I00iOIl) {
/* 3380 */                          return;
                                }
/* 283 */                       int size2 = arrayList.size();
/* 287 */                       int i3 = 0;
                                while (true) {
/* 288 */                           if (i3 >= size2) {
/* 314 */                               obj3 = null;
                                        break;
                                    }
/* 290 */                           obj3 = arrayList.get(i3);
/* 299 */                           int i4 = size2;
/* 306 */                           if (lI1ioiO0.I00000oIO(((Iol1O1) obj3).I00000oIO, iol1lo1I1oli.I00000oOI)) {
                                        break;
                                    }
/* 309 */                           i3++;
/* 311 */                           size2 = i4;
                                }
/* 315 */                       Iol1O1 iol1O14 = (Iol1O1) obj3;
/* 317 */                       if (iol1O14 == null) {
/* 319 */                           int size3 = arrayList.size();
/* 323 */                           int i5 = 0;
                                    while (true) {
/* 324 */                               if (i5 >= size3) {
/* 341 */                                   iol1O12 = 0;
                                            break;
                                        }
/* 326 */                               iol1O12 = arrayList.get(i5);
/* 335 */                               if (((Iol1O1) iol1O12).I0000O) {
                                            break;
                                        } else {
/* 338 */                                   i5++;
                                        }
                                    }
/* 343 */                           iol1O14 = iol1O12;
/* 345 */                           if (iol1O14 == null) {
/* 347 */                               iolI10oO2.I00000oIO();
/* 350 */                               return;
                                    }
/* 353 */                           iol1lo1I1oli.I00000oOI = iol1O14.I00000oIO;
                                }
/* 361 */                       if (oO1i0l == OO1i0l.I00iiI) {
/* 365 */                           if (iol1O14.I000OOo1O) {
/* 506 */                               Iol1O1 iol1O15 = iol1lo1I1oli.I00000oIO;
/* 508 */                               if (iol1O15 == null) {
/* 524 */                                   I000II.I000iOII("AwaitTouchSlop.initialDown was not initialized");
/* 527 */                                   return;
                                        }
/* 510 */                               long j2 = iol1lo1I1oli.I00000oOI;
/* 512 */                               Io1OIO1l0o io1OIO1l0o = iolI10oO2.I00ioIO;
/* 514 */                               if (io1OIO1l0o == null) {
/* 520 */                                   I000II.I000iOII("AwaitTouchSlop.touchSlopDetector was not initialized");
/* 523 */                                   return;
                                        }
/* 516 */                               iolI10oO2.I00000oOI(iol1O15, j2, io1OIO1l0o);
                                    } else if (ioi000.I00000oOI(iol1O14)) {
/* 373 */                               int size4 = arrayList.size();
/* 377 */                               int i6 = 0;
                                        while (true) {
/* 378 */                                   if (i6 >= size4) {
/* 396 */                                       iol1O1 = null;
                                                break;
                                            }
/* 380 */                                   ?? r5 = arrayList.get(i6);
/* 389 */                                   if (((Iol1O1) r5).I0000O) {
/* 391 */                                       iol1O1 = r5;
                                                break;
                                            }
/* 393 */                                   i6++;
                                        }
/* 397 */                               Iol1O1 iol1O16 = iol1O1;
/* 399 */                               if (iol1O16 == null) {
/* 401 */                                   iolI10oO2.I00000oIO();
                                        } else {
/* 408 */                                   iol1lo1I1oli.I00000oOI = iol1O16.I00000oIO;
                                        }
                                    } else {
/* 418 */                               Oooii1o1 oooii1o1 = (Oooii1o1) iiliIooIliOo.I00000oIO(iilio0oo0, IOlO0o100i1i.I00111O);
/* 420 */                               float f2 = IilOo0l01l.I00000oIO;
/* 422 */                               float fI0001Ioi1lo = oooii1o1.I0001Ioi1lo();
/* 426 */                               Io1OIO1l0o io1OIO1l0o2 = iolI10oO2.I00ioIO;
/* 428 */                               if (io1OIO1l0o2 == null) {
/* 502 */                                   I000II.I000iOII("Touch slop detector not initialized.");
/* 505 */                                   return;
                                        }
/* 440 */                               long jI00000oOI = Io1OIO1l0o.I00000oOI(io1OIO1l0o2, ioi000.I0000Il00O(iol1O14, iilio0oo0.I00o101lO, Iol1IlIII10.I00000oIO(i), true), fI0001Ioi1lo);
/* 457 */                               if ((9223372034707292159L & jI00000oOI) != 9205357640488583168L) {
/* 459 */                                   iol1O14.I000OOo1O = true;
/* 467 */                                   iolI10oO2.I0001Ioi1lo(iol1lo1I1oli.I00000oIO, iol1O14, Iol1IlIII10.I00000oIO(i), jI00000oOI);
/* 474 */                                   iolI10oO2.I0000oI00(iol1O14, Iol1IlIII10.I00000oIO(i), jI00000oOI);
/* 477 */                                   long j3 = iol1O14.I00000oIO;
/* 479 */                                   Iol1olioO0 iol1olioO02 = iolI10oO2.I00iiO;
/* 481 */                                   if (iol1olioO02 == null) {
/* 485 */                                       iol1olioO02 = new Iol1olioO0();
/* 488 */                                       iol1olioO02.I00000oIO = Long.MAX_VALUE;
/* 490 */                                       iolI10oO2.I00iiO = iol1olioO02;
                                            }
/* 492 */                                   iol1olioO02.I00000oIO = j3;
/* 494 */                                   iolI10oO2.I00ilO0 = iol1olioO02;
                                        } else {
/* 497 */                                   iol1lo1I1oli.I0000Il00O = true;
                                        }
                                    }
                                }
/* 530 */                       if (oO1i0l == OO1i0l.I00iiO && iol1lo1I1oli.I0000Il00O) {
/* 538 */                           if (!iol1O14.I000OOo1O) {
/* 563 */                               iol1lo1I1oli.I0000Il00O = false;
/* 565 */                               return;
                                    }
/* 540 */                           Iol1O1 iol1O17 = iol1lo1I1oli.I00000oIO;
/* 542 */                           if (iol1O17 == null) {
/* 558 */                               I000II.I000iOII("AwaitTouchSlop.initialDown was not initialized");
/* 561 */                               return;
                                    }
/* 544 */                           long j4 = iol1lo1I1oli.I00000oOI;
/* 546 */                           Io1OIO1l0o io1OIO1l0o3 = iolI10oO2.I00ioIO;
/* 548 */                           if (io1OIO1l0o3 != null) {
/* 550 */                               iolI10oO2.I00000oOI(iol1O17, j4, io1OIO1l0o3);
/* 553 */                               return;
                                    } else {
/* 554 */                               I000II.I000iOII("AwaitTouchSlop.touchSlopDetector was not initialized");
/* 557 */                               return;
                                    }
                                }
/* 3380 */                      return;
                            }
/* 568 */                   if (iooll0i11i2 instanceof Iol1l0i0) {
/* 570 */                       Iol1l0i0 iol1l0i0 = (Iol1l0i0) iooll0i11i2;
/* 574 */                       if (oO1i0l != OO1i0l.I00iiO) {
/* 3380 */                          return;
                                }
/* 578 */                       int size5 = arrayList.size();
/* 582 */                       int i7 = 0;
                                while (true) {
/* 583 */                           if (i7 >= size5) {
                                        break;
                                    }
/* 593 */                           if (((Iol1O1) arrayList.get(i7)).I000OOo1O) {
/* 595 */                               z3 = false;
                                        break;
                                    }
/* 597 */                           i7++;
                                }
/* 600 */                       int size6 = arrayList.size();
/* 604 */                       int i8 = 0;
                                while (true) {
/* 605 */                           if (i8 >= size6) {
                                        break;
                                    }
/* 615 */                           if (!((Iol1O1) arrayList.get(i8)).I0000O) {
/* 676 */                               i8++;
                                    } else if (!arrayList.isEmpty()) {
/* 624 */                               if (z3) {
/* 654 */                                   long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(ioi000.I0000O((Iol1O1) IOOi0Ool1i.I001lllioOl(arrayList), iilio0oo0.I00o101lO, Iol1IlIII10.I00000oIO(i)), ioi000.I0000O(iol1l0i0.I00000oIO, iilio0oo0.I00o101lO, Iol1IlIII10.I00000oIO(i)));
/* 658 */                                   Iol1O1 iol1O18 = iol1l0i0.I00000oIO;
/* 660 */                                   if (iol1O18 != null) {
/* 666 */                                       IolI10oO.I0000Il00O(iolI10oO2, iol1O18, iol1l0i0.I00000oOI, jI0001Ioi1lo, 8);
/* 669 */                                       return;
                                            } else {
/* 672 */                                       I000II.I000iOII("AwaitGesturePickup.initialDown was not initialized.");
/* 675 */                                       return;
                                            }
                                        }
/* 3380 */                              return;
                                    }
                                }
/* 679 */                       iolI10oO2.I00000oIO();
/* 682 */                       return;
                            }
/* 685 */                   if (!(iooll0i11i2 instanceof Iol1olioO0)) {
/* 1154 */                      I000II.I00000oIO();
/* 3380 */                      return;
                            }
/* 687 */                   Iol1olioO0 iol1olioO03 = (Iol1olioO0) iooll0i11i2;
/* 691 */                   if (oO1i0l != OO1i0l.I00iiI) {
/* 3380 */                      return;
                            }
/* 695 */                   long j5 = iol1olioO03.I00000oIO;
/* 697 */                   int size7 = arrayList.size();
/* 701 */                   int i9 = 0;
                            while (true) {
/* 702 */                       if (i9 >= size7) {
/* 723 */                           obj = null;
                                    break;
                                }
/* 704 */                       obj = arrayList.get(i9);
/* 717 */                       if (lI1ioiO0.I00000oIO(((Iol1O1) obj).I00000oIO, j5)) {
                                    break;
                                } else {
/* 720 */                           i9++;
                                }
                            }
/* 724 */                   Iol1O1 iol1O19 = (Iol1O1) obj;
/* 726 */                   if (iol1O19 == null) {
/* 3380 */                      return;
                            }
/* 730 */                   long j6 = iol1O19.I0000Il00O;
/* 732 */                   boolean zI00000oOI = ioi000.I00000oOI(iol1O19);
/* 736 */                   IilIi0I iilIi0I = IilIi0I.I00000oIO;
/* 738 */                   if (!zI00000oOI) {
/* 1107 */                      if (iol1O19.I000OOo1O) {
/* 1109 */                          iilio0oo0.I0110o(iilIi0I);
/* 1112 */                          return;
                                } else {
/* 1130 */                          if (OIOlIiiioi.I0000oI00(ioi000.I0000Il00O(iol1O19, iilio0oo0.I00o101lO, Iol1IlIII10.I00000oIO(i), true)) == 0.0f) {
/* 3380 */                              return;
                                    }
/* 1148 */                          iolI10oO2.I0000oI00(iol1O19, Iol1IlIII10.I00000oIO(i), ioi000.I0000Il00O(iol1O19, iilio0oo0.I00o101lO, Iol1IlIII10.I00000oIO(i), false));
/* 1151 */                          iol1O19.I000OOo1O = true;
/* 1153 */                          return;
                                }
                            }
/* 740 */                   int size8 = arrayList.size();
/* 744 */                   int i10 = 0;
                            while (true) {
/* 745 */                       if (i10 >= size8) {
/* 764 */                           f = 0.0f;
/* 766 */                           obj2 = null;
                                    break;
                                } else {
/* 747 */                           obj2 = arrayList.get(i10);
/* 751 */                           f = 0.0f;
/* 758 */                           if (((Iol1O1) obj2).I0000O) {
                                        break;
                                    } else {
/* 761 */                               i10++;
                                    }
                                }
                            }
/* 767 */                   Iol1O1 iol1O110 = (Iol1O1) obj2;
/* 769 */                   if (iol1O110 != null) {
/* 1100 */                      iol1olioO03.I00000oIO = iol1O110.I00000oIO;
/* 1102 */                      return;
                            }
/* 773 */                   if (iol1O19.I000OOo1O || !ioi000.I00000oOI(iol1O19)) {
/* 1091 */                      iilio0oo0.I0110o(iilIi0I);
                            } else {
/* 781 */                       Iol1IlIII10 iol1IlIII10I00000oIO = Iol1IlIII10.I00000oIO(i);
/* 785 */                       OooIoi01IiI oooIoi01IiII0000O = iolI10oO2.I0000O();
/* 789 */                       OIilII oIilII = iilio0oo0.I00o101lO;
/* 791 */                       O1I1OO o1i1oo3 = iolI10oO2.I00l0I0l0lO1;
/* 795 */                       OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) o1i1oo3.I00iiO;
/* 797 */                       char c2 = ' ';
/* 802 */                       float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
/* 813 */                       float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
/* 821 */                       if (ioi000.I00000oIO(iol1O19)) {
/* 824 */                           o1i1oo3.I00iiI = 0;
/* 826 */                           oI0oiiIO0.I0000oI00();
                                }
/* 833 */                       if (ioi000.I00000oOI(iol1O19) || ioi000.I00000oIO(iol1O19)) {
/* 941 */                           c = ' ';
                                } else {
/* 844 */                           if (oI0oiiIO0.I00000oOI == 3) {
/* 846 */                               int i11 = o1i1oo3.I00iiI;
/* 850 */                               o1i1oo3.I00iiI = i11 + 1;
/* 852 */                               oI0oiiIO0.I000oI1ioi(i11, iol1O19);
                                    } else {
/* 856 */                               oI0oiiIO0.I00000oOI(iol1O19);
                                    }
/* 861 */                           if (o1i1oo3.I00iiI == 3) {
/* 864 */                               o1i1oo3.I00iiI = 0;
                                    }
/* 866 */                           Object[] objArr = oI0oiiIO0.I00000oIO;
/* 868 */                           int i12 = oI0oiiIO0.I00000oOI;
/* 870 */                           float fIntBitsToFloat4 = f;
/* 872 */                           int i13 = 0;
/* 873 */                           while (i13 < i12) {
/* 877 */                               char c3 = c2;
/* 892 */                               fIntBitsToFloat4 += Float.intBitsToFloat((int) (((Iol1O1) objArr[i13]).I0000Il00O >> c3));
/* 893 */                               i13++;
/* 895 */                               c2 = c3;
                                    }
/* 900 */                           c = c2;
/* 902 */                           int i14 = oI0oiiIO0.I00000oOI;
/* 905 */                           fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
/* 906 */                           Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 908 */                           float fIntBitsToFloat5 = f;
/* 910 */                           int i15 = 0;
/* 911 */                           while (i15 < i14) {
/* 928 */                               fIntBitsToFloat5 += Float.intBitsToFloat((int) (((Iol1O1) objArr2[i15]).I0000Il00O & 4294967295L));
/* 929 */                               i15++;
/* 931 */                               oI0oiiIO0 = oI0oiiIO0;
                                    }
/* 938 */                           fIntBitsToFloat3 = fIntBitsToFloat5 / oI0oiiIO0.I00000oOI;
                                }
/* 956 */                       long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << c);
/* 957 */                       if (oIilII != null) {
/* 960 */                           int i16 = iol1IlIII10I00000oIO.I00000oIO;
/* 963 */                           if (i16 == 1) {
/* 968 */                               fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c));
                                    } else if (i16 == 2) {
/* 978 */                               fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                                    }
/* 984 */                           if (oIilII == OIilII.I00iiI) {
/* 986 */                               jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
/* 991 */                               iFloatToRawIntBits = Float.floatToRawIntBits(f);
                                    } else {
/* 1002 */                              jFloatToRawIntBits = Float.floatToRawIntBits(f);
/* 1007 */                              iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                                    }
/* 999 */                           jFloatToRawIntBits2 = (jFloatToRawIntBits << c) | (iFloatToRawIntBits & 4294967295L);
                                }
/* 1016 */                      oooIoi01IiII0000O.I00000oIO.I0000Il00O(iol1O19.I00000oOI, jFloatToRawIntBits2);
/* 1027 */                      float fI0000oI00 = ((Oooii1o1) iiliIooIliOo.I00000oIO(iilio0oo0, IOlO0o100i1i.I00111O)).I0000oI00();
/* 1039 */                      long jI00000oIO = iolI10oO2.I0000O().I00000oIO(li1OoIii00.I00000oIO(fI0000oI00, fI0000oI00));
/* 1047 */                      O1Il01 o1Il01 = iolI10oO2.I0000O().I00000oIO;
/* 1051 */                      OooIlilo oooIlilo = (OooIlilo) o1Il01.I00iiI;
/* 1056 */                      I1IoiO1l.I00111O(oooIlilo.I0000O, null);
/* 1060 */                      oooIlilo.I0000oI00 = 0;
/* 1064 */                      OooIlilo oooIlilo2 = (OooIlilo) o1Il01.I00iiO;
/* 1068 */                      I1IoiO1l.I00111O(oooIlilo2.I0000O, null);
/* 1071 */                      oooIlilo2.I0000oI00 = 0;
/* 1075 */                      o1Il01.I00iOIl = 0L;
/* 1087 */                      iilio0oo0.I0110o(new IilIoiI1Oo01(IillIi1.I00000oOI(jI00000oIO), true));
                            }
/* 1094 */                  iolI10oO2.I00000oIO();
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x036f  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x03c3  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x03d4  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x0421  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x0438  */
                /* JADX WARN: Removed duplicated region for block: B:285:0x058d  */
                /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
                    int i;
                    OO1Oooio101 oO1Oooio1012;
                    OO1i0l oO1i0l2;
                    Object obj;
                    int i2;
                    Object obj2;
                    OooIoi01IiI oooIoi01IiI;
                    boolean z;
                    Object obj3;
                    boolean z2;
                    IilIIl1 iilIIl1;
                    Object obj4;
                    Object obj5;
                    O1IOillioo0I o1IOillioo0I;
                    boolean z3;
                    List list;
                    O1IOillioo0I o1IOillioo0I2;
                    int i3;
                    Object obj6;
                    int i4;
                    Object obj7;
/* 7 */             int i5 = 1;
/* 8 */             this.I00olI = true;
/* 12 */            if (!this.I00oII) {
/* 1638 */              return;
                    }
/* 16 */            if (this.I00oo1iO0ll == null) {
/* 20 */                Io01I1Olo0 io01I1Olo0 = new Io01I1Olo0();
/* 23 */                io01I1Olo0.I00o0iI0io1 = this;
/* 25 */                VarHandle.storeStoreFence();
/* 28 */                I010l1O(io01I1Olo0);
/* 31 */                this.I00oo1iO0ll = io01I1Olo0;
                    }
/* 35 */            int i6 = 0;
/* 36 */            if (this.I0100o111I == null) {
/* 38 */                IilI1IoOOli iilI1IoOOli = this.I00oli;
/* 40 */                if (iilI1IoOOli == null) {
/* 44 */                    IilI0li iilI0li = IilI0li.I00iiO;
/* 46 */                    iilI1IoOOli = new IilI1IoOOli();
/* 49 */                    iilI1IoOOli.I00000oIO = iilI0li;
/* 51 */                    iilI1IoOOli.I00000oOI = false;
/* 53 */                    iilI1IoOOli.I0000Il00O = false;
/* 55 */                    this.I00oli = iilI1IoOOli;
                        }
/* 57 */                this.I0100o111I = iilI1IoOOli;
                    }
/* 61 */            Object obj8 = null;
/* 62 */            if (oO1i0l == OO1i0l.I00iiI) {
/* 64 */                O1IOillioo0I o1IOillioo0I3 = this.I010101Oo1lO;
/* 66 */                if (o1IOillioo0I3 == null) {
/* 70 */                    o1IOillioo0I3 = new O1IOillioo0I((Object) null);
/* 73 */                    this.I010101Oo1lO = o1IOillioo0I3;
                        }
/* 75 */                List list2 = oO1Oooio101.I00000oIO;
/* 80 */                int size = list2.size();
/* 84 */                int i7 = 0;
/* 85 */                while (i7 < size) {
/* 91 */                    OO1il00lI oO1il00lI = (OO1il00lI) list2.get(i7);
/* 99 */                    if (o1IOillioo0I3.I00000oOI(oO1il00lI.I00000oIO) == null) {
/* 101 */                       long j2 = oO1il00lI.I00000oIO;
/* 105 */                       OooIoi01IiI oooIoi01IiI2 = new OooIoi01IiI();
/* 108 */                       i4 = i5;
/* 110 */                       int i8 = o1IOillioo0I3.I00iio;
/* 112 */                       if (i8 == 0 || j2 > o1IOillioo0I3.I00iiI[i8 - 1]) {
/* 131 */                           if (o1IOillioo0I3.I00iOIl) {
/* 133 */                               long[] jArr = o1IOillioo0I3.I00iiI;
/* 136 */                               if (i8 >= jArr.length) {
/* 138 */                                   Object[] objArr = o1IOillioo0I3.I00iiO;
/* 140 */                                   obj7 = obj8;
/* 142 */                                   int i9 = i6;
/* 143 */                                   int i10 = i9;
/* 144 */                                   while (i10 < i8) {
/* 146 */                                       Object obj9 = objArr[i10];
/* 148 */                                       int i11 = i8;
/* 152 */                                       if (obj9 != iIoOoiIO.I00000oIO) {
/* 154 */                                           if (i10 != i9) {
/* 158 */                                               jArr[i9] = jArr[i10];
/* 160 */                                               objArr[i9] = obj9;
/* 162 */                                               objArr[i10] = obj7;
                                                    }
/* 164 */                                           i9++;
                                                }
/* 166 */                                       i10++;
/* 168 */                                       i8 = i11;
/* 170 */                                       i6 = 0;
                                            }
/* 173 */                                   o1IOillioo0I3.I00iOIl = i6;
/* 175 */                                   o1IOillioo0I3.I00iio = i9;
/* 177 */                                   i8 = i9;
                                        } else {
/* 181 */                                   obj7 = obj8;
                                        }
/* 186 */                               if (i8 >= o1IOillioo0I3.I00iiI.length) {
/* 190 */                                   int i12 = (i8 + 1) * 8;
/* 192 */                                   int i13 = 4;
                                            while (true) {
/* 195 */                                       if (i13 >= 32) {
                                                    break;
                                                }
                                                int i14 = (i4 << i13) - 12;
/* 201 */                                       if (i12 <= i14) {
/* 203 */                                           i12 = i14;
                                                    break;
                                                }
/* 205 */                                       i13++;
                                            }
/* 208 */                                   int i15 = i12 / 8;
/* 216 */                                   o1IOillioo0I3.I00iiI = Arrays.copyOf(o1IOillioo0I3.I00iiI, i15);
/* 224 */                                   o1IOillioo0I3.I00iiO = Arrays.copyOf(o1IOillioo0I3.I00iiO, i15);
                                        }
/* 228 */                               o1IOillioo0I3.I00iiI[i8] = j2;
/* 232 */                               o1IOillioo0I3.I00iiO[i8] = oooIoi01IiI2;
/* 236 */                               o1IOillioo0I3.I00iio = i8 + 1;
                                    }
/* 243 */                           i7++;
/* 245 */                           i5 = i4;
/* 247 */                           obj8 = obj7;
/* 249 */                           i6 = 0;
                                } else {
/* 124 */                           o1IOillioo0I3.I0000O(j2, oooIoi01IiI2);
                                }
                            } else {
/* 239 */                       i4 = i5;
                            }
/* 241 */                   obj7 = obj8;
/* 243 */                   i7++;
/* 245 */                   i5 = i4;
/* 247 */                   obj8 = obj7;
/* 249 */                   i6 = 0;
                        }
/* 252 */               i = i5;
/* 254 */               Object obj10 = obj8;
/* 256 */               List list3 = oO1Oooio101.I00000oIO;
/* 261 */               int size2 = list3.size();
/* 265 */               int i16 = 0;
/* 266 */               while (i16 < size2) {
/* 272 */                   OO1il00lI oO1il00lI2 = (OO1il00lI) list3.get(i16);
/* 282 */                   O1Il01 o1Il01 = ((OooIoi01IiI) o1IOillioo0I3.I00000oOI(oO1il00lI2.I00000oIO)).I00000oIO;
/* 284 */                   o1Il01.getClass();
/* 289 */                   OooIlilo oooIlilo = (OooIlilo) o1Il01.I00iiO;
/* 293 */                   OooIlilo oooIlilo2 = (OooIlilo) o1Il01.I00iiI;
/* 295 */                   boolean zI00000oOI = lI1Ol11OOlll.I00000oOI(oO1il00lI2);
/* 299 */                   long j3 = oO1il00lI2.I00000oOI;
/* 301 */                   if (zI00000oOI) {
/* 305 */                       Object obj11 = obj10;
/* 307 */                       I1IoiO1l.I00111O(oooIlilo2.I0000O, obj11);
/* 311 */                       oooIlilo2.I0000oI00 = 0;
/* 315 */                       I1IoiO1l.I00111O(oooIlilo.I0000O, obj11);
/* 318 */                       oooIlilo.I0000oI00 = 0;
/* 322 */                       o1Il01.I00iOIl = 0L;
                            }
/* 328 */                   if (lI1Ol11OOlll.I0000O(oO1il00lI2)) {
/* 408 */                       list = list3;
/* 410 */                       o1IOillioo0I2 = o1IOillioo0I3;
/* 412 */                       i3 = size2;
                            } else {
/* 330 */                       List listI00000oOI = oO1il00lI2.I00000oOI();
/* 341 */                       int i17 = 0;
/* 342 */                       for (int size3 = listI00000oOI.size(); i17 < size3; size3 = size3) {
/* 348 */                           List list4 = list3;
/* 352 */                           Io1ioI0ioIO io1ioI0ioIO = (Io1ioI0ioIO) listI00000oOI.get(i17);
/* 372 */                           o1Il01.I0000Il00O(io1ioI0ioIO.I00000oIO, OIOlIiiioi.I000II(io1ioI0ioIO.I0000oI00, 0L));
/* 375 */                           i17++;
/* 381 */                           o1IOillioo0I3 = o1IOillioo0I3;
/* 383 */                           list3 = list4;
/* 385 */                           size2 = size2;
                                }
/* 390 */                       list = list3;
/* 392 */                       o1IOillioo0I2 = o1IOillioo0I3;
/* 394 */                       i3 = size2;
/* 404 */                       o1Il01.I0000Il00O(j3, OIOlIiiioi.I000II(oO1il00lI2.I000o00OoI0I, 0L));
                            }
/* 418 */                   if (!lI1Ol11OOlll.I0000O(oO1il00lI2) || j3 - o1Il01.I00iOIl <= 40) {
/* 451 */                       obj6 = null;
                            } else {
/* 432 */                       obj6 = null;
/* 433 */                       I1IoiO1l.I00111O(oooIlilo2.I0000O, null);
/* 437 */                       oooIlilo2.I0000oI00 = 0;
/* 441 */                       I1IoiO1l.I00111O(oooIlilo.I0000O, null);
/* 444 */                       oooIlilo.I0000oI00 = 0;
/* 448 */                       o1Il01.I00iOIl = 0L;
                            }
/* 452 */                   o1Il01.I00iOIl = j3;
/* 454 */                   i16++;
/* 460 */                   obj10 = obj6;
/* 462 */                   o1IOillioo0I3 = o1IOillioo0I2;
/* 464 */                   list3 = list;
/* 466 */                   size2 = i3;
                        }
                    } else {
/* 473 */               i = 1;
                    }
/* 476 */           il1oi11i01iI il1oi11i01ii = this.I0100o111I;
/* 478 */           if (il1oi11i01ii == null) {
/* 1464 */              I000II.I000iOII("currentDragState should not be null");
/* 1638 */              return;
                    }
/* 487 */           if (il1oi11i01ii instanceof IilI1IoOOli) {
/* 489 */               IilI1IoOOli iilI1IoOOli2 = (IilI1IoOOli) il1oi11i01ii;
/* 491 */               oO1Oooio1012 = oO1Oooio101;
/* 499 */               if (!oO1Oooio1012.I00000oIO.isEmpty() && OloI0l1i1oO.I0001Ioi1lo(oO1Oooio1012, false, false)) {
/* 519 */                   OO1il00lI oO1il00lI3 = (OO1il00lI) IOOi0Ool1i.I001lllioOl(oO1Oooio1012.I00000oIO);
/* 547 */                   IilI0li iilI0li2 = IilOo1o0Ioi.I00000oIO[iilI1IoOOli2.I00000oIO.ordinal()] == i ? !I011iiii0i() ? IilI0li.I00iOIl : IilI0li.I00iiI : iilI1IoOOli2.I00000oIO;
/* 549 */                   iilI1IoOOli2.I00000oIO = iilI0li2;
/* 553 */                   oO1i0l2 = oO1i0l;
/* 555 */                   if (oO1i0l2 == OO1i0l.I00iOIl) {
/* 559 */                       if (iilI0li2 == IilI0li.I00iiI) {
/* 561 */                           oO1il00lI3.I00000oIO();
/* 564 */                           z3 = true;
/* 565 */                           iilI1IoOOli2.I00000oOI = true;
                                } else {
/* 568 */                           z3 = true;
                                }
/* 569 */                       iilI1IoOOli2.I0000Il00O = z3;
                            }
/* 573 */                   if (oO1i0l2 == OO1i0l.I00iiI) {
/* 577 */                       if (iilI0li2 == IilI0li.I00iOIl) {
/* 586 */                           I0110OiO(this, oO1il00lI3, oO1il00lI3.I00000oIO, 0L, 12);
                                } else if (iilI1IoOOli2.I00000oOI) {
/* 601 */                           I011iO(oO1il00lI3, oO1il00lI3, 0L);
/* 604 */                           I011iIOio(0L);
/* 607 */                           long j4 = oO1il00lI3.I00000oIO;
/* 609 */                           IilIIl1 iilIIl12 = this.I00ooiO1I;
/* 611 */                           if (iilIIl12 == null) {
/* 615 */                               iilIIl12 = new IilIIl1();
/* 618 */                               iilIIl12.I00000oIO = Long.MAX_VALUE;
/* 620 */                               this.I00ooiO1I = iilIIl12;
                                    }
/* 622 */                           iilIIl12.I00000oIO = j4;
/* 624 */                           this.I0100o111I = iilIIl12;
                                }
                            }
                        } else {
/* 501 */                   oO1i0l2 = oO1i0l;
                        }
                    } else {
/* 629 */               oO1Oooio1012 = oO1Oooio101;
/* 631 */               oO1i0l2 = oO1i0l;
/* 637 */               if (il1oi11i01ii instanceof IilIIl0iIO) {
/* 639 */                   IilIIl0iIO iilIIl0iIO = (IilIIl0iIO) il1oi11i01ii;
/* 643 */                   if (oO1i0l2 != OO1i0l.I00iOIl) {
/* 646 */                       List list5 = oO1Oooio1012.I00000oIO;
/* 649 */                       List list6 = list5;
/* 651 */                       int size4 = list6.size();
/* 655 */                       int i18 = 0;
                                while (true) {
/* 656 */                           if (i18 >= size4) {
/* 681 */                               obj3 = null;
                                        break;
                                    }
/* 658 */                           Object obj12 = list5.get(i18);
/* 673 */                           if (lI1ioiO0.I00000oIO(((OO1il00lI) obj12).I00000oIO, iilIIl0iIO.I00000oOI)) {
/* 675 */                               obj3 = obj12;
                                        break;
                                    }
/* 677 */                           i18++;
                                }
/* 682 */                       OO1il00lI oO1il00lI4 = (OO1il00lI) obj3;
/* 684 */                       if (oO1il00lI4 == null) {
/* 686 */                           int size5 = list6.size();
/* 690 */                           int i19 = 0;
                                    while (true) {
/* 691 */                               if (i19 >= size5) {
/* 708 */                                   obj5 = null;
                                            break;
                                        }
/* 693 */                               obj5 = list5.get(i19);
/* 702 */                               if (((OO1il00lI) obj5).I0000O) {
                                            break;
                                        } else {
/* 705 */                                   i19++;
                                        }
                                    }
/* 709 */                           oO1il00lI4 = (OO1il00lI) obj5;
/* 711 */                           if (oO1il00lI4 == null) {
/* 713 */                               I01101IOlO();
                                    } else {
/* 719 */                               iilIIl0iIO.I00000oOI = oO1il00lI4.I00000oIO;
/* 727 */                               if (oO1i0l2 == OO1i0l.I00iiI) {
/* 733 */                                   if (oO1il00lI4.I0000Il00O()) {
/* 1022 */                                      OO1il00lI oO1il00lI5 = iilIIl0iIO.I00000oIO;
/* 1024 */                                      if (oO1il00lI5 == null) {
/* 1040 */                                          I000II.I000iOII("AwaitTouchSlop.initialDown was not initialized");
/* 1043 */                                          return;
                                                }
/* 1026 */                                      long j5 = iilIIl0iIO.I00000oOI;
/* 1028 */                                      Io1OIO1l0o io1OIO1l0o = this.I010I0;
/* 1030 */                                      if (io1OIO1l0o == null) {
/* 1036 */                                          I000II.I000iOII("AwaitTouchSlop.touchSlopDetector was not initialized");
/* 1039 */                                          return;
                                                }
/* 1032 */                                      I01101olii(oO1il00lI5, j5, io1OIO1l0o);
                                            } else if (lI1Ol11OOlll.I0000O(oO1il00lI4)) {
/* 741 */                                       int size6 = list6.size();
/* 745 */                                       int i20 = 0;
                                                while (true) {
/* 746 */                                           if (i20 >= size6) {
/* 764 */                                               obj4 = null;
                                                        break;
                                                    }
/* 748 */                                           Object obj13 = list5.get(i20);
/* 757 */                                           if (((OO1il00lI) obj13).I0000O) {
/* 759 */                                               obj4 = obj13;
                                                        break;
                                                    }
/* 761 */                                           i20++;
                                                }
/* 765 */                                       OO1il00lI oO1il00lI6 = (OO1il00lI) obj4;
/* 767 */                                       if (oO1il00lI6 == null) {
/* 769 */                                           I01101IOlO();
                                                } else {
/* 776 */                                           iilIIl0iIO.I00000oOI = oO1il00lI6.I00000oIO;
                                                }
                                            } else {
/* 790 */                                       float fI000iOII = IilOo0l01l.I000iOII((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O), oO1il00lI4.I000OOo1O);
/* 794 */                                       Io1OIO1l0o io1OIO1l0o2 = this.I010I0;
/* 796 */                                       if (io1OIO1l0o2 == null) {
/* 1018 */                                          I000II.I000iOII("Touch slop detector not initialized.");
/* 1021 */                                          return;
                                                }
/* 803 */                                       long jI00000oOI = Io1OIO1l0o.I00000oOI(io1OIO1l0o2, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI4, true), fI000iOII);
/* 820 */                                       if ((9223372034707292159L & jI00000oOI) != 9205357640488583168L) {
/* 833 */                                           this.I00oliIiO01i = OIOlIiiioi.I000II(this.I00oliIiO01i, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI4, false));
/* 875 */                                           float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.I00oliIiO01i & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r2 >> 32))))) * 57.29578f;
/* 876 */                                           OIilII oIilII = this.I00o101lO;
/* 878 */                                           if (oIilII == null) {
/* 880 */                                               z2 = true;
/* 910 */                                               OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 916 */                                               II1O00ioi iI1O00ioi = new II1O00ioi(1);
/* 919 */                                               iI1O00ioi.I00iiI = fAtan2;
/* 921 */                                               iI1O00ioi.I00iiO = oOo0l0ii10l;
/* 923 */                                               VarHandle.storeStoreFence();
/* 926 */                                               IillI1lo11l0 iillI1lo11l0 = IillIi1.I00000oIO;
/* 930 */                                               int i21 = 2;
/* 931 */                                               Iil1olo iil1olo = new Iil1olo(i21);
/* 934 */                                               iil1olo.I00iiI = iI1O00ioi;
/* 936 */                                               VarHandle.storeStoreFence();
/* 941 */                                               II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(i21);
/* 944 */                                               iI0O1i0I1.I00iiI = iil1olo;
/* 946 */                                               VarHandle.storeStoreFence();
/* 951 */                                               lOo1ii0o1.I00000oOI(this, Io01I1Olo0.I00o0l1o1o0, iI0O1i0I1);
/* 954 */                                               if (z2 && oOo0l0ii10l.I00iOIl) {
/* 961 */                                                   iilIIl0iIO.I0000Il00O = true;
                                                        } else {
/* 964 */                                                   oO1il00lI4.I00000oIO();
/* 969 */                                                   I011iO(iilIIl0iIO.I00000oIO, oO1il00lI4, jI00000oOI);
/* 972 */                                                   I011iIOio(jI00000oOI);
/* 975 */                                                   long j6 = oO1il00lI4.I00000oIO;
/* 977 */                                                   iilIIl1 = this.I00ooiO1I;
/* 979 */                                                   if (iilIIl1 == null) {
/* 983 */                                                       iilIIl1 = new IilIIl1();
/* 991 */                                                       iilIIl1.I00000oIO = Long.MAX_VALUE;
/* 993 */                                                       this.I00ooiO1I = iilIIl1;
                                                            }
/* 995 */                                                   iilIIl1.I00000oIO = j6;
/* 997 */                                                   this.I0100o111I = iilIIl1;
                                                        }
                                                    } else {
/* 882 */                                               IillI1lo11l0 iillI1lo11l02 = IillIi1.I00000oIO;
/* 888 */                                               if (oIilII != OIilII.I00iiI ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
/* 895 */                                                   z2 = false;
                                                        }
/* 910 */                                               OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 916 */                                               II1O00ioi iI1O00ioi2 = new II1O00ioi(1);
/* 919 */                                               iI1O00ioi2.I00iiI = fAtan2;
/* 921 */                                               iI1O00ioi2.I00iiO = oOo0l0ii10l2;
/* 923 */                                               VarHandle.storeStoreFence();
/* 926 */                                               IillI1lo11l0 iillI1lo11l03 = IillIi1.I00000oIO;
/* 930 */                                               int i212 = 2;
/* 931 */                                               Iil1olo iil1olo2 = new Iil1olo(i212);
/* 934 */                                               iil1olo2.I00iiI = iI1O00ioi2;
/* 936 */                                               VarHandle.storeStoreFence();
/* 941 */                                               II0O1i0I1 iI0O1i0I12 = new II0O1i0I1(i212);
/* 944 */                                               iI0O1i0I12.I00iiI = iil1olo2;
/* 946 */                                               VarHandle.storeStoreFence();
/* 951 */                                               lOo1ii0o1.I00000oOI(this, Io01I1Olo0.I00o0l1o1o0, iI0O1i0I12);
/* 954 */                                               if (z2) {
/* 964 */                                                   oO1il00lI4.I00000oIO();
/* 969 */                                                   I011iO(iilIIl0iIO.I00000oIO, oO1il00lI4, jI00000oOI);
/* 972 */                                                   I011iIOio(jI00000oOI);
/* 975 */                                                   long j62 = oO1il00lI4.I00000oIO;
/* 977 */                                                   iilIIl1 = this.I00ooiO1I;
/* 979 */                                                   if (iilIIl1 == null) {
                                                            }
/* 995 */                                                   iilIIl1.I00000oIO = j62;
/* 997 */                                                   this.I0100o111I = iilIIl1;
                                                        }
                                                    }
                                                } else {
/* 1001 */                                          iilIIl0iIO.I0000Il00O = true;
/* 1013 */                                          this.I00oliIiO01i = OIOlIiiioi.I000II(this.I00oliIiO01i, lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI4, true));
                                                }
                                            }
                                        }
/* 1046 */                              if (oO1i0l2 == OO1i0l.I00iiO && iilIIl0iIO.I0000Il00O) {
/* 1056 */                                  if (oO1il00lI4.I0000Il00O()) {
/* 1082 */                                      iilIIl0iIO.I0000Il00O = false;
                                            } else {
/* 1058 */                                      OO1il00lI oO1il00lI7 = iilIIl0iIO.I00000oIO;
/* 1060 */                                      if (oO1il00lI7 == null) {
/* 1077 */                                          I000II.I000iOII("AwaitTouchSlop.initialDown was not initialized");
/* 1080 */                                          return;
                                                }
/* 1062 */                                      long j7 = iilIIl0iIO.I00000oOI;
/* 1064 */                                      Io1OIO1l0o io1OIO1l0o3 = this.I010I0;
/* 1066 */                                      if (io1OIO1l0o3 == null) {
/* 1073 */                                          I000II.I000iOII("AwaitTouchSlop.touchSlopDetector was not initialized");
/* 1076 */                                          return;
                                                }
/* 1068 */                                      I01101olii(oO1il00lI7, j7, io1OIO1l0o3);
                                            }
                                        }
                                    }
                                } else {
/* 727 */                           if (oO1i0l2 == OO1i0l.I00iiI) {
                                    }
/* 1046 */                          if (oO1i0l2 == OO1i0l.I00iiO) {
/* 1056 */                              if (oO1il00lI4.I0000Il00O()) {
                                        }
                                    }
                                }
/* 1420 */                      if (oO1i0l2 == OO1i0l.I00iiI) {
/* 1422 */                          List list7 = oO1Oooio1012.I00000oIO;
/* 1427 */                          int size7 = list7.size();
/* 1432 */                          for (int i22 = i2; i22 < size7; i22++) {
/* 1438 */                              OO1il00lI oO1il00lI8 = (OO1il00lI) list7.get(i22);
/* 1444 */                              if (lI1Ol11OOlll.I0000O(oO1il00lI8) && (o1IOillioo0I = this.I010101Oo1lO) != null) {
/* 1452 */                                  o1IOillioo0I.I0000oI00(oO1il00lI8.I00000oIO);
                                        }
                                    }
/* 1638 */                          return;
                                }
/* 1638 */                      return;
                            }
                        } else if (il1oi11i01ii instanceof IilI1i) {
/* 1090 */                  IilI1i iilI1i = (IilI1i) il1oi11i01ii;
/* 1094 */                  if (oO1i0l2 == OO1i0l.I00iiO) {
/* 1098 */                      List list8 = oO1Oooio1012.I00000oIO;
/* 1101 */                      List list9 = list8;
/* 1103 */                      int size8 = list9.size();
/* 1107 */                      int i23 = 0;
                                while (true) {
/* 1108 */                          if (i23 >= size8) {
/* 1127 */                              z = true;
                                        break;
                                    } else {
/* 1120 */                              if (((OO1il00lI) list8.get(i23)).I0000Il00O()) {
/* 1122 */                                  z = false;
                                            break;
                                        }
/* 1124 */                              i23++;
                                    }
                                }
/* 1128 */                      int size9 = list9.size();
/* 1132 */                      int i24 = 0;
                                while (true) {
/* 1133 */                          if (i24 >= size9) {
                                        break;
                                    }
/* 1143 */                          if (!((OO1il00lI) list8.get(i24)).I0000O) {
/* 1191 */                              i24++;
                                    } else {
/* 1149 */                              if (list8.isEmpty()) {
                                            break;
                                        }
/* 1152 */                              if (z) {
/* 1166 */                                  long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(((OO1il00lI) IOOi0Ool1i.I001lllioOl(list8)).I0000Il00O, iilI1i.I00000oIO.I0000Il00O);
/* 1170 */                                  OO1il00lI oO1il00lI9 = iilI1i.I00000oIO;
/* 1172 */                                  if (oO1il00lI9 == null) {
/* 1187 */                                      I000II.I000iOII("AwaitGesturePickup.initialDown was not initialized.");
/* 1190 */                                      return;
                                            }
/* 1180 */                                  I0110OiO(this, oO1il00lI9, iilI1i.I00000oOI, jI0001Ioi1lo, 8);
                                        }
                                    }
                                }
/* 1194 */                      I01101IOlO();
                            }
                        } else {
/* 1201 */                  if (!(il1oi11i01ii instanceof IilIIl1)) {
/* 1458 */                      I000II.I00000oIO();
/* 1461 */                      return;
                            }
/* 1203 */                  IilIIl1 iilIIl13 = (IilIIl1) il1oi11i01ii;
/* 1207 */                  if (oO1i0l2 == OO1i0l.I00iiI) {
/* 1210 */                      long j8 = iilIIl13.I00000oIO;
/* 1212 */                      List list10 = oO1Oooio1012.I00000oIO;
/* 1217 */                      int size10 = list10.size();
/* 1221 */                      int i25 = 0;
                                while (true) {
/* 1222 */                          if (i25 >= size10) {
/* 1243 */                              obj = null;
                                        break;
                                    }
/* 1224 */                          obj = list10.get(i25);
/* 1237 */                          if (lI1ioiO0.I00000oIO(((OO1il00lI) obj).I00000oIO, j8)) {
                                        break;
                                    } else {
/* 1240 */                              i25++;
                                    }
                                }
/* 1244 */                      OO1il00lI oO1il00lI10 = (OO1il00lI) obj;
/* 1246 */                      if (oO1il00lI10 != null) {
/* 1250 */                          boolean zI0000O = lI1Ol11OOlll.I0000O(oO1il00lI10);
/* 1254 */                          Object obj14 = IilIi0I.I00000oIO;
/* 1256 */                          if (zI0000O) {
/* 1258 */                              List list11 = oO1Oooio1012.I00000oIO;
/* 1263 */                              int size11 = list11.size();
/* 1267 */                              int i26 = 0;
                                        while (true) {
/* 1268 */                                  if (i26 >= size11) {
/* 1285 */                                      obj2 = null;
                                                break;
                                            }
/* 1270 */                                  obj2 = list11.get(i26);
/* 1279 */                                  if (((OO1il00lI) obj2).I0000O) {
                                                break;
                                            } else {
/* 1282 */                                      i26++;
                                            }
                                        }
/* 1286 */                              OO1il00lI oO1il00lI11 = (OO1il00lI) obj2;
/* 1288 */                              if (oO1il00lI11 == null) {
/* 1294 */                                  if (oO1il00lI10.I0000Il00O() || !lI1Ol11OOlll.I0000O(oO1il00lI10)) {
/* 1362 */                                      I011Ol0().I000lI(obj14);
                                            } else {
/* 1310 */                                      float fI0000oI00 = ((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O)).I0000oI00();
/* 1314 */                                      O1IOillioo0I o1IOillioo0I4 = this.I010101Oo1lO;
/* 1352 */                                      I011Ol0().I000lI(new IilIoiI1Oo01(IillIi1.I00000oOI((o1IOillioo0I4 == null || (oooIoi01IiI = (OooIoi01IiI) o1IOillioo0I4.I00000oOI(oO1il00lI10.I00000oIO)) == null) ? 0L : oooIoi01IiI.I00000oIO(li1OoIii00.I00000oIO(fI0000oI00, fI0000oI00))), false));
/* 1355 */                                      this.I00olI = false;
                                            }
/* 1365 */                                  I01101IOlO();
                                        } else {
/* 1372 */                                  iilIIl13.I00000oIO = oO1il00lI11.I00000oIO;
                                        }
                                    } else if (oO1il00lI10.I0000Il00O()) {
/* 1386 */                              I011Ol0().I000lI(obj14);
                                    } else if (OIOlIiiioi.I0000oI00(lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI10, true)) != 0.0f) {
/* 1407 */                              i2 = 0;
/* 1412 */                              I011iIOio(lI1Ol11OOlll.I0001Ioi1lo(oO1il00lI10, false));
/* 1415 */                              oO1il00lI10.I00000oIO();
                                    }
                                }
                            }
/* 1420 */                  if (oO1i0l2 == OO1i0l.I00iiI) {
                            }
                        }
                    }
/* 626 */           i2 = 0;
/* 1420 */          if (oO1i0l2 == OO1i0l.I00iiI) {
                    }
                }

                @Override
                public final void I00IO1oi11O() {
/* 3 */             if (this.I00olI) {
/* 5 */                 I01101IOlO();
/* 10 */                if (this.I00ol1) {
/* 18 */                    I011Ol0().I000lI(IilIi0I.I00000oIO);
                        }
/* 22 */                this.I010101Oo1lO = null;
                    }
/* 25 */            this.I00olI = false;
                }

                @Override
                public final String I00O0i0ii() {
/* 3 */             if (!this.I00oII) {
/* 37 */                return "idle";
                    }
/* 5 */             il1oi11i01iI il1oi11i01ii = this.I0100o111I;
                    return il1oi11i01ii instanceof IilI1IoOOli ? ((IilI1IoOOli) il1oi11i01ii).I0000Il00O ? "waiting" : "idle" : ((il1oi11i01ii instanceof IilIIl0iIO) || (il1oi11i01ii instanceof IilI1i)) ? "waiting" : il1oi11i01ii instanceof IilIIl1 ? "recognized" : "idle";
                }

                @Override
                public final OIilII I00Oio() {
/* 1 */             return this.I00o101lO;
                }

                @Override
                public final void I00iIi0i1o() {
/* 1 */             IolI10oO iolI10oO = this.I010II;
/* 3 */             if (iolI10oO != null) {
/* 5 */                 iolI10oO.I00000oIO();
/* 8 */                 Iilio0oo0 iilio0oo0 = iolI10oO.I00iOIl;
/* 12 */                if (iilio0oo0.I00ol1) {
/* 16 */                    iilio0oo0.I0110o(IilIi0I.I00000oIO);
                        }
/* 20 */                iolI10oO.I00io1l = null;
/* 22 */                O1I1OO o1i1oo = iolI10oO.I00l0OO0IO;
/* 25 */                o1i1oo.I00iiI = 0;
/* 31 */                ((OI0llOl1ooO0) o1i1oo.I00iiO).I00000oOI = 0;
                    }
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00ol1 = false;
/* 4 */             I010o0o0oO();
/* 7 */             Io01I1Olo0 io01I1Olo0 = this.I00ooIo0;
/* 9 */             if (io01I1Olo0 != null) {
/* 11 */                I010l1ol111(io01I1Olo0);
                    }
/* 14 */            Io01I1Olo0 io01I1Olo02 = this.I00oo1iO0ll;
/* 16 */            if (io01I1Olo02 != null) {
/* 18 */                I010l1ol111(io01I1Olo02);
                    }
/* 22 */            this.I00ooIo0 = null;
/* 24 */            this.I00oo1iO0ll = null;
                }

                public final void I010o0o0oO() {
/* 1 */             IilioOoi1O iilioOoi1O = this.I00oOio10iI1;
/* 3 */             if (iilioOoi1O != null) {
/* 5 */                 OI0lOIiOIOOo oI0lOIiOIOOo = this.I00oIiI10;
/* 7 */                 if (oI0lOIiOIOOo != null) {
/* 14 */                    oI0lOIiOIOOo.I00000oOI(new IilioI1iol(iilioOoi1O));
                        }
/* 18 */                this.I00oOio10iI1 = null;
                    }
                }

                public abstract Object I010oio1OO0(Iililo00OiO iililo00OiO, Iililo00OiO iililo00OiO2);

                public final void I01101IOlO() {
/* 3 */             this.I00oliIiO01i = 0L;
/* 5 */             IilI1IoOOli iilI1IoOOli = this.I00oli;
/* 8 */             if (iilI1IoOOli == null) {
/* 12 */                IilI0li iilI0li = IilI0li.I00iiO;
/* 14 */                iilI1IoOOli = new IilI1IoOOli();
/* 17 */                iilI1IoOOli.I00000oIO = iilI0li;
/* 19 */                iilI1IoOOli.I00000oOI = false;
/* 21 */                iilI1IoOOli.I0000Il00O = false;
/* 23 */                this.I00oli = iilI1IoOOli;
                    }
/* 27 */            iilI1IoOOli.I00000oIO = IilI0li.I00iiO;
/* 29 */            iilI1IoOOli.I00000oOI = false;
/* 31 */            iilI1IoOOli.I0000Il00O = false;
/* 33 */            this.I0100o111I = iilI1IoOOli;
                }

                public final void I01101olii(OO1il00lI oO1il00lI, long j, Io1OIO1l0o io1OIO1l0o) {
/* 1 */             IilI1i iilI1i = this.I0100i;
/* 3 */             if (iilI1i == null) {
/* 7 */                 iilI1i = new IilI1i();
/* 11 */                iilI1i.I00000oIO = null;
/* 18 */                iilI1i.I00000oOI = Long.MAX_VALUE;
/* 20 */                this.I0100i = iilI1i;
                    }
/* 22 */            iilI1i.I00000oIO = oO1il00lI;
/* 24 */            iilI1i.I00000oOI = j;
/* 28 */            io1OIO1l0o.I00iiI = 0L;
/* 30 */            this.I0100o111I = iilI1i;
                }

                public final void I0110o(IilIol11Ii iilIol11Ii) {
/* 3 */             if ((iilIol11Ii instanceof IilIli) && !this.I00ol1) {
/* 10 */                this.I00ol1 = true;
/* 12 */                I011lIilI0lo();
                    }
/* 19 */            I011Ol0().I000lI(iilIol11Ii);
                }

                public abstract void I0111i(long j);

                public abstract void I011IO1I11OI(IilIoiI1Oo01 iilIoiI1Oo01);

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I011IOil(IOoilo iOoilo) throws Throwable {
                    IilOoIlO01oI iilOoIlO01oI;
/* 3 */             if (iOoilo instanceof IilOoIlO01oI) {
/* 6 */                 iilOoIlO01oI = (IilOoIlO01oI) iOoilo;
/* 8 */                 int i = iilOoIlO01oI.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iilOoIlO01oI.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iilOoIlO01oI = new IilOoIlO01oI(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iilOoIlO01oI.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iilOoIlO01oI.I00iiO;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                IilioOoi1O iilioOoi1O = this.I00oOio10iI1;
/* 52 */                if (iilioOoi1O != null) {
/* 54 */                    OI0lOIiOIOOo oI0lOIiOIOOo = this.I00oIiI10;
/* 56 */                    if (oI0lOIiOIOOo != null) {
/* 60 */                        IilioI1iol iilioI1iol = new IilioI1iol(iilioOoi1O);
/* 63 */                        iilOoIlO01oI.I00iiO = 1;
/* 69 */                        if (oI0lOIiOIOOo.I00000oIO(iilioI1iol, iilOoIlO01oI) == ii0111o) {
/* 71 */                            return ii0111o;
                                }
                            }
                        }
/* 82 */                I011IO1I11OI(new IilIoiI1Oo01(0L, false));
/* 85 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 35 */            if (i2 != 1) {
/* 43 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 37 */            lIoii1l01l0i.I00000oOI(obj);
/* 72 */            this.I00oOio10iI1 = null;
/* 82 */            I011IO1I11OI(new IilIoiI1Oo01(0L, false));
/* 85 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I011Ill(IilIli iilIli, IOoilo iOoilo) throws Throwable {
                    Iili0iO iili0iO;
                    OI0lOIiOIOOo oI0lOIiOIOOo;
                    IilioOoi1O iilioOoi1O;
                    IilIli iilIli2;
                    IilioOoi1O iilioOoi1O2;
/* 3 */             if (iOoilo instanceof Iili0iO) {
/* 6 */                 iili0iO = (Iili0iO) iOoilo;
/* 8 */                 int i = iili0iO.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iili0iO.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iili0iO = new Iili0iO(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iili0iO.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iili0iO.I00ilI0I1;
/* 33 */            if (i2 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                IilioOoi1O iilioOoi1O3 = this.I00oOio10iI1;
/* 65 */                if (iilioOoi1O3 != null && (oI0lOIiOIOOo = this.I00oIiI10) != null) {
/* 73 */                    IilioI1iol iilioI1iol = new IilioI1iol(iilioOoi1O3);
/* 76 */                    iili0iO.I00iOIl = iilIli;
/* 78 */                    iili0iO.I00ilI0I1 = 1;
/* 84 */                    if (oI0lOIiOIOOo.I00000oIO(iilioI1iol, iili0iO) != ii0111o) {
                            }
/* 108 */                   return ii0111o;
                        }
/* 113 */               this.I00oOio10iI1 = iilioOoi1O;
/* 117 */               I0111i(iilIli.I00000oIO);
/* 120 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 != 2) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 39 */                iilioOoi1O2 = iili0iO.I00iiI;
/* 41 */                iilIli2 = iili0iO.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(obj);
/* 111 */               iilioOoi1O = iilioOoi1O2;
/* 112 */               iilIli = iilIli2;
/* 113 */               this.I00oOio10iI1 = iilioOoi1O;
/* 117 */               I0111i(iilIli.I00000oIO);
/* 120 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 54 */            iilIli = iili0iO.I00iOIl;
/* 56 */            lIoii1l01l0i.I00000oOI(obj);
/* 89 */            iilioOoi1O = new IilioOoi1O();
/* 92 */            OI0lOIiOIOOo oI0lOIiOIOOo2 = this.I00oIiI10;
/* 94 */            if (oI0lOIiOIOOo2 != null) {
/* 96 */                iili0iO.I00iOIl = iilIli;
/* 98 */                iili0iO.I00iiI = iilioOoi1O;
/* 100 */               iili0iO.I00ilI0I1 = 2;
/* 106 */               if (oI0lOIiOIOOo2.I00000oIO(iilioOoi1O, iili0iO) != ii0111o) {
/* 109 */                   iilIli2 = iilIli;
/* 110 */                   iilioOoi1O2 = iilioOoi1O;
/* 111 */                   iilioOoi1O = iilioOoi1O2;
/* 112 */                   iilIli = iilIli2;
                        }
/* 108 */               return ii0111o;
                    }
/* 113 */           this.I00oOio10iI1 = iilioOoi1O;
/* 117 */           I0111i(iilIli.I00000oIO);
/* 120 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I011Io0I1ioi(IilIoiI1Oo01 iilIoiI1Oo01, IOoilo iOoilo) throws Throwable {
                    IiliIl10i0 iiliIl10i0;
/* 3 */             if (iOoilo instanceof IiliIl10i0) {
/* 6 */                 iiliIl10i0 = (IiliIl10i0) iOoilo;
/* 8 */                 int i = iiliIl10i0.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iiliIl10i0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iiliIl10i0 = new IiliIl10i0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iiliIl10i0.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iiliIl10i0.I00iio;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                IilioOoi1O iilioOoi1O = this.I00oOio10iI1;
/* 54 */                if (iilioOoi1O != null) {
/* 56 */                    OI0lOIiOIOOo oI0lOIiOIOOo = this.I00oIiI10;
/* 58 */                    if (oI0lOIiOIOOo != null) {
/* 62 */                        Iilioi iilioi = new Iilioi();
/* 65 */                        iilioi.I00000oIO = iilioOoi1O;
/* 67 */                        VarHandle.storeStoreFence();
/* 70 */                        iiliIl10i0.I00iOIl = iilIoiI1Oo01;
/* 72 */                        iiliIl10i0.I00iio = 1;
/* 78 */                        if (oI0lOIiOIOOo.I00000oIO(iilioi, iiliIl10i0) == ii0111o) {
/* 80 */                            return ii0111o;
                                }
                            }
                        }
/* 83 */                I011IO1I11OI(iilIoiI1Oo01);
/* 86 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 35 */            if (i2 != 1) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 37 */            iilIoiI1Oo01 = iiliIl10i0.I00iOIl;
/* 39 */            lIoii1l01l0i.I00000oOI(obj);
/* 81 */            this.I00oOio10iI1 = null;
/* 83 */            I011IO1I11OI(iilIoiI1Oo01);
/* 86 */            return OoiIlOl1iI.I00000oIO;
                }

                public final IO1010 I011Ol0() {
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I00oO101o;
/* 3 */             if (iiiii1oi1 != null) {
/* 5 */                 return iiiii1oi1;
                    }
/* 8 */             I000II.I000iOII("Events channel not initialized.");
/* 11 */            return null;
                }

                public final void I011iIOio(long j) {
/* 7 */             this.I00oliIiO01i = OIOlIiiioi.I000II(this.I00oliIiO01i, j);
/* 19 */            I011Ol0().I000lI(new IilIiOlii(j, false));
                }

                public final void I011iO(OO1il00lI oO1il00lI, OO1il00lI oO1il00lI2, long j) {
/* 3 */             long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(oO1il00lI2.I0000Il00O, j);
/* 7 */             Function1 function1 = this.I00oI0i;
/* 9 */             int i = oO1il00lI.I000OOo1O;
/* 13 */            OO1l0oO oO1l0oO = new OO1l0oO();
/* 16 */            oO1l0oO.I00000oIO = i;
/* 18 */            VarHandle.storeStoreFence();
/* 31 */            if (((Boolean) function1.invoke(oO1l0oO)).booleanValue()) {
/* 35 */                if (!this.I00ol1) {
/* 39 */                    if (this.I00oO101o == null) {
/* 50 */                        this.I00oO101o = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, null, 6);
                            }
/* 52 */                    I011lIilI0lo();
                        }
/* 64 */                I011Ol0().I000lI(new IilIli(jI0001Ioi1lo));
                    }
                }

                public abstract boolean I011iiii0i();

                public final void I011lIilI0lo() {
/* 2 */             this.I00ol1 = true;
/* 7 */             if (this.I00oO101o == null) {
/* 17 */                this.I00oO101o = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, null, 6);
                    }
/* 29 */            iOi1II01i0.I0000O(I00ooiO1I(), null, null, new Iililo00OiO(this, null), 3);
                }

                public final void I011lO1liO1O(Function1 function1, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, OIilII oIilII, boolean z2) {
/* 1 */             this.I00oI0i = function1;
/* 6 */             boolean z3 = true;
/* 7 */             if (this.I00oII != z) {
/* 9 */                 this.I00oII = z;
/* 11 */                if (!z) {
/* 13 */                    Io01I1Olo0 io01I1Olo0 = this.I00ooIo0;
/* 15 */                    if (io01I1Olo0 != null) {
/* 17 */                        I010l1ol111(io01I1Olo0);
                            }
/* 20 */                    Io01I1Olo0 io01I1Olo02 = this.I00oo1iO0ll;
/* 22 */                    if (io01I1Olo02 != null) {
/* 24 */                        I010l1ol111(io01I1Olo02);
                            }
/* 27 */                    this.I00ooIo0 = null;
/* 29 */                    this.I00oo1iO0ll = null;
/* 31 */                    I010o0o0oO();
/* 34 */                    this.I010II = null;
                        }
/* 36 */                z2 = true;
                    }
/* 43 */            if (!O0000Ioio00.I0000O(this.I00oIiI10, oI0lOIiOIOOo)) {
/* 45 */                I010o0o0oO();
/* 48 */                this.I00oIiI10 = oI0lOIiOIOOo;
                    }
/* 52 */            if (this.I00o101lO != oIilII) {
/* 54 */                this.I00o101lO = oIilII;
                    } else {
/* 57 */                z3 = z2;
                    }
/* 58 */            if (z3) {
/* 60 */                boolean z4 = this.I00olI;
/* 62 */                IilIi0I iilIi0I = IilIi0I.I00000oIO;
/* 64 */                if (z4) {
/* 66 */                    I01101IOlO();
/* 71 */                    if (this.I00ol1) {
/* 77 */                        I011Ol0().I000lI(iilIi0I);
                            }
/* 80 */                    this.I010101Oo1lO = null;
                        }
/* 82 */                IolI10oO iolI10oO = this.I010II;
/* 84 */                if (iolI10oO != null) {
/* 86 */                    iolI10oO.I00000oIO();
/* 89 */                    Iilio0oo0 iilio0oo0 = iolI10oO.I00iOIl;
/* 93 */                    if (iilio0oo0.I00ol1) {
/* 95 */                        iilio0oo0.I0110o(iilIi0I);
                            }
/* 98 */                    iolI10oO.I00io1l = null;
/* 100 */                   O1I1OO o1i1oo = iolI10oO.I00l0OO0IO;
/* 103 */                   o1i1oo.I00iiI = 0;
/* 109 */                   ((OI0llOl1ooO0) o1i1oo.I00iiO).I00000oOI = 0;
                        }
                    }
                }
            }
