            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class IlOoil implements OI0Iolo0lIiI, OiI1O1iOoiOI {
                public I1IiiOO0i0io I00000oIO;
                public I1IioI1l10 I00000oOI;
                public float I0000Il00O;
                public Ii0OOlliol0i I0000O;
                public float I0000oI00;
                public IlOoi1ilio00 I0001Ioi1lo;

                @Override
                public final int I00000oIO(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             IlOoi1ilio00 ilOoi1ilio00 = this.I0001Ioi1lo;
/* 10 */            List list2 = (List) IOOi0Ool1i.I00II0oii1o(1, list);
/* 22 */            O1iIo0ll o1iIo0ll = list2 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list2) : null;
/* 28 */            List list3 = (List) IOOi0Ool1i.I00II0oii1o(2, list);
/* 44 */            ilOoi1ilio00.I00000oOI(o1iIo0ll, list3 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list3) : null, IOo0olo.I00000oOI(0, 0, 0, i, 7));
/* 51 */            List list4 = (List) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 53 */            if (list4 == null) {
/* 55 */                list4 = Il01100l.I00iOIl;
                    }
/* 57 */            int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(f);
/* 64 */            int size = list4.size();
/* 68 */            int i2 = 0;
/* 69 */            int iMax = 0;
/* 70 */            int i3 = 0;
/* 71 */            int i4 = 0;
/* 72 */            while (i2 < size) {
/* 84 */                int iI001iOo1i0O = ((O1iIo0ll) list4.get(i2)).I001iOo1i0O(i) + iI00l0OO0IO;
/* 85 */                int i5 = i2 + 1;
/* 92 */                if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
/* 105 */                   iMax = Math.max(iMax, (i4 + iI001iOo1i0O) - iI00l0OO0IO);
/* 109 */                   i3 = i2;
/* 110 */                   i4 = 0;
                        } else {
/* 101 */                   i4 += iI001iOo1i0O;
                        }
/* 111 */               i2 = i5;
                    }
/* 408 */           return iMax;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    float f;
                    O1iIo0ll o1iIo0ll;
                    int i;
                    IooIiOoIIoO iooIiOoIIoOI00000oIO;
                    OO1I0001000i oO1I0001000i;
                    IlOoIo ilOoIo;
                    IlOoIlO0I ilOoIlO0II00000oIO;
                    int i2;
                    char c;
                    O1iIo0ll o1iIo0ll2;
                    O1iIo0ll o1iIo0ll3;
                    long j2;
                    IooIiOoIIoO iooIiOoIIoOI00000oIO2;
                    OO1I0001000i oO1I0001000i2;
                    int i3;
                    IooIiOoIIoO iooIiOoIIoOI00000oIO3;
                    IlOoIo ilOoIo2;
                    long jI00000oOI;
                    OO1I0001000i oO1I0001000iI001lllioOl;
                    long jI00000oOI2;
                    OO1I0001000i oO1I0001000iI001lllioOl2;
/* 9 */             IlOoi1ilio00 ilOoi1ilio00 = this.I0001Ioi1lo;
/* 14 */            boolean zIsEmpty = ((ArrayList) list).isEmpty();
/* 18 */            Map map = Il011I1OiO0I.I00iOIl;
/* 21 */            if (zIsEmpty || (IOo0oO11ll1O.I000OOo1O(j) == 0 && ilOoi1ilio00.I00000oIO != IlOoi0i0.I00iOIl)) {
/* 1157 */              return o1iOIoOiO0.I001i1lo1io(0, 0, map, new Iil0iiOiI(12));
                    }
/* 42 */            List list2 = (List) IOOi0Ool1i.I001lllioOl(list);
/* 48 */            if (list2.isEmpty()) {
/* 57 */                return o1iOIoOiO0.I001i1lo1io(0, 0, map, new Iil0iiOiI(13));
                    }
/* 67 */            List list3 = (List) IOOi0Ool1i.I00II0oii1o(1, list);
/* 78 */            O1iIo0ll o1iIo0ll4 = list3 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list3) : null;
/* 84 */            List list4 = (List) IOOi0Ool1i.I00II0oii1o(2, list);
/* 95 */            O1iIo0ll o1iIo0ll5 = list4 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list4) : null;
/* 96 */            list2.size();
/* 99 */            ilOoi1ilio00.getClass();
/* 102 */           O0io1IOlIOo o0io1IOlIOo = O0io1IOlIOo.I00iOIl;
/* 114 */           long jI0000Il00O = l1lOIl1iIO0.I0000Il00O(l1lOIl1iIO0.I00000oOI(10, l1lOIl1iIO0.I00000oIO(j, o0io1IOlIOo)), o0io1IOlIOo);
/* 124 */           if (o1iIo0ll4 != null) {
/* 136 */               if (lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll4)) == 0.0f) {
/* 138 */                   lIooiiooO.I00000oIO(o1iIo0ll4);
/* 141 */                   OO1I0001000i oO1I0001000iI001lllioOl3 = o1iIo0ll4.I001lllioOl(jI0000Il00O);
/* 145 */                   f = 0.0f;
/* 163 */                   ilOoi1ilio00.I0001Ioi1lo = IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(oO1I0001000iI001lllioOl3.I00Ol10(), oO1I0001000iI001lllioOl3.I00Oio()));
/* 165 */                   ilOoi1ilio00.I0000Il00O = oO1I0001000iI001lllioOl3;
/* 167 */                   oO1I0001000iI001lllioOl3.I00Ol10();
/* 170 */                   oO1I0001000iI001lllioOl3.I00Oio();
                        } else {
/* 174 */                   f = 0.0f;
/* 180 */                   o1iIo0ll4.I00OI1(o1iIo0ll4.I000l1(Integer.MAX_VALUE));
                        }
/* 183 */               ilOoi1ilio00.I00000oOI = o1iIo0ll4;
                    } else {
/* 186 */               f = 0.0f;
                    }
/* 188 */           if (o1iIo0ll5 != null) {
/* 200 */               if (lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll5)) == f) {
/* 202 */                   lIooiiooO.I00000oIO(o1iIo0ll5);
/* 205 */                   OO1I0001000i oO1I0001000iI001lllioOl4 = o1iIo0ll5.I001lllioOl(jI0000Il00O);
/* 225 */                   ilOoi1ilio00.I000II = IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(oO1I0001000iI001lllioOl4.I00Ol10(), oO1I0001000iI001lllioOl4.I00Oio()));
/* 227 */                   ilOoi1ilio00.I0000oI00 = oO1I0001000iI001lllioOl4;
/* 229 */                   oO1I0001000iI001lllioOl4.I00Ol10();
/* 232 */                   oO1I0001000iI001lllioOl4.I00Oio();
                        } else {
/* 240 */                   o1iIo0ll5.I00OI1(o1iIo0ll5.I000l1(Integer.MAX_VALUE));
                        }
/* 243 */               ilOoi1ilio00.I0000O = o1iIo0ll5;
                    }
/* 245 */           Iterator it = list2.iterator();
/* 249 */           float f2 = this.I0000Il00O;
/* 251 */           float f3 = this.I0000oI00;
/* 253 */           long jI00000oIO = l1lOIl1iIO0.I00000oIO(j, o0io1IOlIOo);
/* 257 */           IlOoi1ilio00 ilOoi1ilio002 = this.I0001Ioi1lo;
/* 265 */           OI110O0 oi110o0 = new OI110O0(new O1iOIo0o0[16]);
/* 268 */           int iI000OiO = IOo0oO11ll1O.I000OiO(jI00000oIO);
/* 272 */           int iI000l1 = IOo0oO11ll1O.I000l1(jI00000oIO);
/* 276 */           int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(jI00000oIO);
/* 280 */           OI0l1oli1I oI0l1oli1I = IooO001.I00000oIO;
/* 284 */           OI0l1oli1I oI0l1oli1I2 = new OI0l1oli1I();
/* 290 */           ArrayList arrayList = new ArrayList();
/* 304 */           int iCeil = (int) Math.ceil(o1iOIoOiO0.I00i0ilIl0i(f2));
/* 315 */           int iCeil2 = (int) Math.ceil(o1iOIoOiO0.I00i0ilIl0i(f3));
/* 321 */           long jI00000oIO2 = IOo0olo.I00000oIO(0, iI000OiO, 0, iI000OOo1O);
/* 331 */           long jI0000Il00O2 = l1lOIl1iIO0.I0000Il00O(l1lOIl1iIO0.I00000oOI(14, jI00000oIO2), o0io1IOlIOo);
/* 339 */           if (it.hasNext()) {
                        try {
/* 347 */                   o1iIo0ll = (O1iIo0ll) it.next();
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    } else {
/* 341 */               o1iIo0ll = null;
                    }
/* 349 */           if (o1iIo0ll != null) {
/* 361 */               if (lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll)) == f) {
/* 363 */                   lIooiiooO.I00000oIO(o1iIo0ll);
/* 366 */                   oO1I0001000iI001lllioOl2 = o1iIo0ll.I001lllioOl(jI0000Il00O2);
/* 374 */                   i = iCeil;
/* 380 */                   jI00000oOI2 = IooIiOoIIoO.I00000oOI(oO1I0001000iI001lllioOl2.I00Ol10(), oO1I0001000iI001lllioOl2.I00Oio());
                        } else {
/* 385 */                   i = iCeil;
/* 388 */                   int iI000l12 = o1iIo0ll.I000l1(Integer.MAX_VALUE);
/* 396 */                   jI00000oOI2 = IooIiOoIIoO.I00000oOI(iI000l12, o1iIo0ll.I00OI1(iI000l12));
/* 400 */                   oO1I0001000iI001lllioOl2 = null;
                        }
/* 402 */               iooIiOoIIoOI00000oIO = IooIiOoIIoO.I00000oIO(jI00000oOI2);
/* 406 */               oO1I0001000i = oO1I0001000iI001lllioOl2;
                    } else {
/* 409 */               i = iCeil;
/* 411 */               iooIiOoIIoOI00000oIO = null;
/* 412 */               oO1I0001000i = null;
                    }
/* 431 */           Integer numValueOf = iooIiOoIIoOI00000oIO != null ? Integer.valueOf((int) (iooIiOoIIoOI00000oIO.I00000oIO >> 32)) : null;
/* 451 */           Integer numValueOf2 = iooIiOoIIoOI00000oIO != null ? Integer.valueOf((int) (iooIiOoIIoOI00000oIO.I00000oIO & 4294967295L)) : null;
/* 454 */           OI0l1iiooO oI0l1iiooO = new OI0l1iiooO();
/* 461 */           OI0l1iiooO oI0l1iiooO2 = new OI0l1iiooO();
/* 466 */           OI0lOIOi1l oI0lOIOi1l = new OI0lOIOi1l();
/* 473 */           i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0(ilOoi1ilio002, jI00000oIO, i, iCeil2);
/* 476 */           int i4 = i;
/* 500 */           IooIiOoIIoO iooIiOoIIoO = iooIiOoIIoOI00000oIO;
/* 502 */           IlOoIo ilOoIoI00000oOI = i1o1ll0i0.I00000oOI(it.hasNext(), 0, IooIiOoIIoO.I00000oOI(iI000OiO, iI000OOo1O), iooIiOoIIoO, 0, 0, 0, false, false);
/* 506 */           Integer num = numValueOf2;
/* 510 */           if (ilOoIoI00000oOI.I00iiI) {
/* 525 */               ilOoIo = ilOoIoI00000oOI;
/* 531 */               ilOoIlO0II00000oIO = i1o1ll0i0.I00000oIO(ilOoIo, iooIiOoIIoO != null, -1, 0, iI000OiO, 0);
                    } else {
/* 536 */               ilOoIo = ilOoIoI00000oOI;
/* 538 */               ilOoIlO0II00000oIO = null;
                    }
/* 540 */           O1iIo0ll o1iIo0ll6 = o1iIo0ll;
/* 541 */           int i5 = iI000l1;
/* 542 */           IlOoIlO0I ilOoIlO0I = ilOoIlO0II00000oIO;
/* 543 */           int i6 = iI000OiO;
/* 547 */           OO1I0001000i oO1I0001000i3 = oO1I0001000i;
/* 548 */           IlOoIo ilOoIo3 = ilOoIo;
/* 550 */           int i7 = 0;
/* 551 */           int i8 = 0;
/* 553 */           int i9 = 0;
/* 555 */           int i10 = 0;
/* 557 */           int i11 = 0;
/* 559 */           Integer num2 = numValueOf;
/* 563 */           int i12 = iI000OOo1O;
/* 565 */           int i13 = 0;
/* 568 */           while (!ilOoIo3.I00iiI && o1iIo0ll6 != null) {
/* 572 */               int iIntValue = num2.intValue();
/* 582 */               OI0lOIOi1l oI0lOIOi1l2 = oI0lOIOi1l;
/* 584 */               int i14 = i9 + iIntValue;
/* 586 */               int iMax = Math.max(i7, num.intValue());
/* 590 */               int i15 = i6 - iIntValue;
/* 592 */               int i16 = i13 + 1;
/* 594 */               ilOoi1ilio002.getClass();
/* 597 */               arrayList.add(o1iIo0ll6);
/* 600 */               oI0l1oli1I2.I000OOo1O(i13, oO1I0001000i3);
/* 603 */               o1iIo0ll6.I00II0Ol1O0l();
/* 606 */               int i17 = i16 - i8;
/* 612 */               if (it.hasNext()) {
                            try {
/* 620 */                       o1iIo0ll2 = (O1iIo0ll) it.next();
                            } catch (IndexOutOfBoundsException unused2) {
/* 623 */                       o1iIo0ll2 = null;
                            }
/* 624 */                   o1iIo0ll3 = o1iIo0ll2;
                        } else {
/* 614 */                   o1iIo0ll3 = null;
                        }
/* 625 */               if (o1iIo0ll3 != null) {
/* 637 */                   if (lIooiiooO.I00000oOI(lIooiiooO.I00000oIO(o1iIo0ll3)) == f) {
/* 639 */                       lIooiiooO.I00000oIO(o1iIo0ll3);
/* 642 */                       oO1I0001000iI001lllioOl = o1iIo0ll3.I001lllioOl(jI0000Il00O2);
/* 650 */                       j2 = jI0000Il00O2;
/* 656 */                       jI00000oOI = IooIiOoIIoO.I00000oOI(oO1I0001000iI001lllioOl.I00Ol10(), oO1I0001000iI001lllioOl.I00Oio());
                            } else {
/* 661 */                       j2 = jI0000Il00O2;
/* 666 */                       int iI000l13 = o1iIo0ll3.I000l1(Integer.MAX_VALUE);
/* 674 */                       jI00000oOI = IooIiOoIIoO.I00000oOI(iI000l13, o1iIo0ll3.I00OI1(iI000l13));
/* 678 */                       oO1I0001000iI001lllioOl = null;
                            }
/* 679 */                   iooIiOoIIoOI00000oIO2 = IooIiOoIIoO.I00000oIO(jI00000oOI);
/* 683 */                   oO1I0001000i2 = oO1I0001000iI001lllioOl;
                        } else {
/* 685 */                   j2 = jI0000Il00O2;
/* 687 */                   iooIiOoIIoOI00000oIO2 = null;
/* 688 */                   oO1I0001000i2 = null;
                        }
/* 689 */               O1iIo0ll o1iIo0ll7 = o1iIo0ll3;
/* 690 */               OO1I0001000i oO1I0001000i4 = oO1I0001000i2;
/* 705 */               Integer numValueOf3 = iooIiOoIIoOI00000oIO2 != null ? Integer.valueOf(((int) (iooIiOoIIoOI00000oIO2.I00000oIO >> 32)) + i4) : null;
/* 720 */               Integer numValueOf4 = iooIiOoIIoOI00000oIO2 != null ? Integer.valueOf((int) (iooIiOoIIoOI00000oIO2.I00000oIO & 4294967295L)) : null;
/* 721 */               boolean zHasNext = it.hasNext();
/* 725 */               int i18 = i10;
/* 727 */               long jI00000oOI3 = IooIiOoIIoO.I00000oOI(i15, i12);
/* 731 */               if (iooIiOoIIoOI00000oIO2 == null) {
/* 733 */                   i3 = i15;
/* 735 */                   iooIiOoIIoOI00000oIO3 = null;
                        } else {
/* 742 */                   i3 = i15;
/* 752 */                   iooIiOoIIoOI00000oIO3 = IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(numValueOf3.intValue(), numValueOf4.intValue()));
                        }
/* 762 */               IlOoIo ilOoIoI00000oOI2 = i1o1ll0i0.I00000oOI(zHasNext, i17, jI00000oOI3, iooIiOoIIoOI00000oIO3, i18, i11, iMax, false, false);
/* 766 */               IooIiOoIIoO iooIiOoIIoO2 = iooIiOoIIoOI00000oIO2;
/* 768 */               int i19 = iMax;
/* 772 */               if (ilOoIoI00000oOI2.I00iOIl) {
/* 778 */                   int iMin = Math.min(Math.max(i5, i14), iI000OiO);
/* 782 */                   int i20 = i11 + i19;
/* 797 */                   boolean z = iooIiOoIIoO2 != null;
/* 792 */                   ilOoIo2 = ilOoIoI00000oOI2;
/* 800 */                   IlOoIlO0I ilOoIlO0II00000oIO2 = i1o1ll0i0.I00000oIO(ilOoIo2, z, i18, i20, i3, i17);
/* 806 */                   oI0l1iiooO2.I00000oIO(i19);
/* 811 */                   i12 = (iI000OOo1O - i20) - iCeil2;
/* 813 */                   oI0l1iiooO.I00000oIO(i16);
/* 830 */                   i10 = i18 + 1;
/* 834 */                   i5 = iMin;
/* 835 */                   i3 = iI000OiO;
/* 829 */                   numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i4) : null;
/* 839 */                   i8 = i16;
/* 832 */                   i11 = i20 + iCeil2;
/* 843 */                   i19 = 0;
/* 844 */                   i14 = 0;
/* 845 */                   ilOoIlO0I = ilOoIlO0II00000oIO2;
                        } else {
/* 847 */                   ilOoIo2 = ilOoIoI00000oOI2;
/* 849 */                   i10 = i18;
                        }
/* 852 */               i13 = i16;
/* 853 */               i7 = i19;
/* 854 */               oO1I0001000i3 = oO1I0001000i4;
/* 855 */               ilOoIo3 = ilOoIo2;
/* 857 */               num = numValueOf4;
/* 859 */               o1iIo0ll6 = o1iIo0ll7;
/* 860 */               jI0000Il00O2 = j2;
/* 862 */               num2 = numValueOf3;
/* 864 */               i6 = i3;
/* 866 */               i9 = i14;
/* 868 */               oI0lOIOi1l = oI0lOIOi1l2;
                    }
/* 872 */           OI0lOIOi1l oI0lOIOi1l3 = oI0lOIOi1l;
/* 874 */           if (ilOoIlO0I != null) {
/* 876 */               long j3 = ilOoIlO0I.I0000Il00O;
/* 880 */               arrayList.add(ilOoIlO0I.I00000oIO);
/* 891 */               oI0l1oli1I2.I000OOo1O(arrayList.size() - 1, ilOoIlO0I.I00000oOI);
                        int i21 = oI0l1iiooO.I00000oOI - 1;
/* 900 */               if (ilOoIlO0I.I0000O) {
/* 913 */                   oI0l1iiooO2.I0001Ioi1lo(i21, Math.max(oI0l1iiooO2.I0000Il00O(i21), (int) (j3 & 4294967295L)));
/* 922 */                   oI0l1iiooO.I0001Ioi1lo(i21, oI0l1iiooO.I0000O() + 1);
                        } else {
/* 929 */                   oI0l1iiooO2.I00000oIO((int) (j3 & 4294967295L));
/* 938 */                   oI0l1iiooO.I00000oIO(oI0l1iiooO.I0000O() + 1);
                        }
                    }
/* 941 */           int size = arrayList.size();
/* 945 */           OO1I0001000i[] oO1I0001000iArr = new OO1I0001000i[size];
/* 948 */           for (int i22 = 0; i22 < size; i22++) {
/* 954 */               oO1I0001000iArr[i22] = oI0l1oli1I2.I00000oOI(i22);
                    }
/* 959 */           int i23 = oI0l1iiooO.I00000oOI;
/* 961 */           int[] iArr = new int[i23];
/* 963 */           int[] iArr2 = new int[i23];
/* 965 */           int[] iArr3 = oI0l1iiooO.I00000oIO;
/* 967 */           int iMax2 = i5;
/* 968 */           int i24 = 0;
/* 969 */           int i25 = 0;
/* 970 */           int i26 = 0;
/* 972 */           while (i25 < i23) {
/* 974 */               int i27 = iArr3[i25];
/* 976 */               int iI0000Il00O = oI0l1iiooO2.I0000Il00O(i25);
/* 980 */               OI0lOIOi1l oI0lOIOi1l4 = oI0lOIOi1l3;
/* 986 */               if (oI0lOIOi1l4.I0000Il00O(i25)) {
/* 988 */                   c = 65535;
                        } else {
/* 996 */                   c = 65535;
/* 1007 */                  iI0000Il00O = IOo0oO11ll1O.I000OOo1O(jI00000oIO2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : IOo0oO11ll1O.I000OOo1O(jI00000oIO2) - i26;
                        }
/* 1013 */              oI0lOIOi1l3 = oI0lOIOi1l4;
/* 1025 */              int i28 = i4;
/* 1031 */              O1iOIo0o0 o1iOIo0o0I00000oIO = lO00IllIl.I00000oIO(this, iMax2, IOo0oO11ll1O.I000iOII(jI00000oIO2), IOo0oO11ll1O.I000OiO(jI00000oIO2), iI0000Il00O, i28, o1iOIoOiO0, arrayList, oO1I0001000iArr, i24, i27, iArr, i25);
/* 1037 */              int iI0001Ioi1lo = o1iOIo0o0I00000oIO.I0001Ioi1lo();
/* 1041 */              int iI0000O = o1iOIo0o0I00000oIO.I0000O();
/* 1045 */              iArr2[i25] = iI0000O;
/* 1047 */              i26 += iI0000O;
/* 1049 */              iMax2 = Math.max(iMax2, iI0001Ioi1lo);
/* 1055 */              oi110o0.I00000oOI(o1iOIo0o0I00000oIO);
/* 1058 */              i25++;
/* 1060 */              i24 = i27;
/* 1061 */              iArr3 = iArr3;
/* 1063 */              i4 = i28;
                    }
/* 1074 */          if (oi110o0.I00iiO == 0) {
/* 1076 */              i2 = 0;
/* 1077 */              i26 = 0;
                    } else {
/* 1080 */              i2 = iMax2;
                    }
/* 1081 */          I1IioI1l10 i1IioI1l10 = this.I00000oOI;
/* 1096 */          int iI00l0OO0IO = ((oi110o0.I00iiO - 1) * o1iOIoOiO0.I00l0OO0IO(i1IioI1l10.I00000oIO())) + i26;
/* 1098 */          int iI000iOII = IOo0oO11ll1O.I000iOII(jI00000oIO);
/* 1102 */          int iI000OOo1O2 = IOo0oO11ll1O.I000OOo1O(jI00000oIO);
/* 1106 */          if (iI00l0OO0IO < iI000iOII) {
/* 1108 */              iI00l0OO0IO = iI000iOII;
                    }
/* 1109 */          if (iI00l0OO0IO <= iI000OOo1O2) {
/* 1112 */              iI000OOo1O2 = iI00l0OO0IO;
                    }
/* 1113 */          i1IioI1l10.I000O01llI0(o1iOIoOiO0, iI000OOo1O2, iArr2, iArr);
/* 1116 */          int iI000l14 = IOo0oO11ll1O.I000l1(jI00000oIO);
/* 1120 */          int iI000OiO2 = IOo0oO11ll1O.I000OiO(jI00000oIO);
/* 1124 */          if (i2 < iI000l14) {
/* 1126 */              i2 = iI000l14;
                    }
/* 1127 */          if (i2 <= iI000OiO2) {
/* 1130 */              iI000OiO2 = i2;
                    }
/* 1134 */          Iil1olo iil1olo = new Iil1olo(6);
/* 1137 */          iil1olo.I00iiI = oi110o0;
/* 1139 */          VarHandle.storeStoreFence();
/* 1144 */          return o1iOIoOiO0.I001i1lo1io(iI000OiO2, iI000OOo1O2, map, iil1olo);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0254  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0258 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:151:0x0246 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000Il00O(IoooOl1001li ioooOl1001li, List list, int i) {
                    int i2;
                    int i3;
                    int[] iArr;
                    int i4;
                    long jI00000oOI;
                    int i5;
                    IlOoi0i0 ilOoi0i0;
/* 9 */             float f = this.I0000oI00;
/* 11 */            float f2 = this.I0000Il00O;
/* 13 */            IlOoi1ilio00 ilOoi1ilio00 = this.I0001Ioi1lo;
/* 15 */            int i6 = 1;
/* 20 */            List list2 = (List) IOOi0Ool1i.I00II0oii1o(1, list);
/* 31 */            O1iIo0ll o1iIo0ll = list2 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list2) : null;
/* 37 */            List list3 = (List) IOOi0Ool1i.I00II0oii1o(2, list);
/* 50 */            int i7 = 0;
/* 55 */            ilOoi1ilio00.I00000oOI(o1iIo0ll, list3 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list3) : null, IOo0olo.I00000oOI(0, 0, 0, i, 7));
/* 62 */            List list4 = (List) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 64 */            if (list4 == null) {
/* 66 */                list4 = Il01100l.I00iOIl;
                    }
/* 68 */            int iI00l0OO0IO = ioooOl1001li.I00l0OO0IO(f2);
/* 72 */            int iI00l0OO0IO2 = ioooOl1001li.I00l0OO0IO(f);
/* 76 */            IlOoi1ilio00 ilOoi1ilio002 = this.I0001Ioi1lo;
/* 82 */            if (list4.isEmpty()) {
/* 50 */                return 0;
                    }
/* 86 */            int size = list4.size();
/* 90 */            int[] iArr2 = new int[size];
/* 92 */            int size2 = list4.size();
/* 96 */            int[] iArr3 = new int[size2];
/* 99 */            List list5 = list4;
/* 101 */           int size3 = list5.size();
/* 106 */           for (int i8 = 0; i8 < size3; i8++) {
/* 112 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list4.get(i8);
/* 114 */               int iI000l1 = o1iIo0ll2.I000l1(i);
/* 118 */               iArr2[i8] = iI000l1;
/* 124 */               iArr3[i8] = o1iIo0ll2.I00OI1(iI000l1);
                    }
/* 133 */           int i9 = Integer.MAX_VALUE;
/* 136 */           if (Integer.MAX_VALUE >= list4.size() || ((ilOoi0i0 = ilOoi1ilio002.I00000oIO) != IlOoi0i0.I00iiO && ilOoi0i0 != IlOoi0i0.I00iio)) {
/* 154 */               if (Integer.MAX_VALUE >= list4.size()) {
/* 156 */                   ilOoi1ilio002.getClass();
/* 163 */                   i2 = ilOoi1ilio002.I00000oIO == IlOoi0i0.I00iio ? 1 : 0;
                        }
                    }
/* 173 */           int iMin = Math.min(Integer.MAX_VALUE - i2, list4.size());
/* 178 */           int i10 = 0;
/* 179 */           for (int i11 = 0; i11 < size; i11++) {
/* 183 */               i10 += iArr2[i11];
                    }
/* 195 */           int size4 = ((list4.size() - 1) * iI00l0OO0IO) + i10;
/* 196 */           if (size2 != 0) {
/* 198 */               int i12 = iArr3[0];
/* 200 */               int i13 = size2 - 1;
/* 201 */               if (1 <= i13) {
/* 203 */                   int i14 = 1;
                            while (true) {
/* 206 */                       int i15 = iArr3[i14];
/* 208 */                       if (i12 < i15) {
/* 210 */                           i12 = i15;
                                }
/* 211 */                       if (i14 == i13) {
                                    break;
                                }
/* 213 */                       i14++;
                            }
                        }
/* 218 */               if (size != 0) {
/* 220 */                   int i16 = iArr2[0];
/* 222 */                   int i17 = size - 1;
/* 223 */                   if (1 <= i17) {
/* 225 */                       int i18 = 1;
                                while (true) {
/* 226 */                           int i19 = iArr2[i18];
/* 228 */                           if (i16 < i19) {
/* 230 */                               i16 = i19;
                                    }
/* 231 */                           if (i18 == i17) {
                                        break;
                                    }
/* 233 */                           i18++;
                                }
                            }
/* 236 */                   int i20 = size4;
/* 237 */                   while (i16 <= size4 && i12 != i) {
/* 245 */                       int i21 = (i16 + size4) / 2;
/* 256 */                       if (list4.isEmpty()) {
/* 258 */                           jI00000oOI = IooIiOoIIoO.I00000oOI(i7, i7);
                                } else {
/* 276 */                           i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0(ilOoi1ilio002, IOo0olo.I00000oIO(i7, i21, i7, i9), iI00l0OO0IO, iI00l0OO0IO2);
/* 283 */                           O1iIo0ll o1iIo0ll3 = (O1iIo0ll) IOOi0Ool1i.I00II0oii1o(i7, list4);
/* 290 */                           int i22 = o1iIo0ll3 != null ? iArr3[i7] : i7;
/* 296 */                           int i23 = o1iIo0ll3 != null ? iArr2[i7] : i7;
/* 333 */                           int i24 = 0;
/* 335 */                           int i25 = 0;
/* 345 */                           if (i1o1ll0i0.I00000oOI(list4.size() > i6 ? i6 : 0, 0, IooIiOoIIoO.I00000oOI(i21, i9), o1iIo0ll3 == null ? null : IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(i23, i22)), 0, 0, 0, false, false).I00iiI) {
/* 354 */                               IooIiOoIIoO iooIiOoIIoOI00000oIO = ilOoi1ilio002.I00000oIO(0, 0, o1iIo0ll3 != null ? i6 : 0);
/* 367 */                               jI00000oOI = IooIiOoIIoO.I00000oOI(iooIiOoIIoOI00000oIO != null ? (int) (iooIiOoIIoOI00000oIO.I00000oIO & 4294967295L) : 0, 0);
                                    } else {
/* 372 */                               int i26 = 0;
/* 373 */                               int size5 = list5.size();
/* 377 */                               int i27 = i21;
/* 379 */                               int i28 = 0;
/* 381 */                               int i29 = 0;
/* 383 */                               int i30 = 0;
                                        while (true) {
/* 385 */                                   if (i26 >= size5) {
/* 554 */                                       i3 = i21;
/* 556 */                                       iArr = iArr2;
/* 558 */                                       i4 = i28;
                                                break;
                                            }
/* 387 */                                   int i31 = i27 - i23;
/* 389 */                                   i4 = i26 + 1;
/* 391 */                                   int iMax = Math.max(i30, i22);
/* 399 */                                   O1iIo0ll o1iIo0ll4 = (O1iIo0ll) IOOi0Ool1i.I00II0oii1o(i4, list4);
/* 406 */                                   i22 = o1iIo0ll4 != null ? iArr3[i4] : 0;
/* 407 */                                   if (o1iIo0ll4 != null) {
/* 413 */                                       i3 = i21;
/* 411 */                                       i5 = iArr2[i4] + iI00l0OO0IO;
                                            } else {
/* 418 */                                       i3 = i21;
/* 420 */                                       i5 = 0;
                                            }
/* 423 */                                   iArr = iArr2;
/* 436 */                                   int i32 = i4 - i29;
/* 464 */                                   IlOoIo ilOoIoI00000oOI = i1o1ll0i0.I00000oOI(i26 + 2 < list4.size(), i32, IooIiOoIIoO.I00000oOI(i31, Integer.MAX_VALUE), o1iIo0ll4 == null ? null : IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(i5, i22)), i24, i25, iMax, false, false);
/* 470 */                                   if (ilOoIoI00000oOI.I00iOIl) {
/* 474 */                                       int i33 = iMax + iI00l0OO0IO2 + i25;
/* 476 */                                       int i34 = i24;
/* 492 */                                       IlOoIlO0I ilOoIlO0II00000oIO = i1o1ll0i0.I00000oIO(ilOoIoI00000oOI, o1iIo0ll4 != null, i34, i33, i31, i32);
/* 500 */                                       i5 -= iI00l0OO0IO;
/* 502 */                                       i24 = i34 + 1;
/* 506 */                                       if (ilOoIoI00000oOI.I00iiI) {
/* 508 */                                           if (ilOoIlO0II00000oIO != null) {
/* 510 */                                               long j = ilOoIlO0II00000oIO.I0000Il00O;
/* 514 */                                               if (!ilOoIlO0II00000oIO.I0000O) {
/* 521 */                                                   i33 = ((int) (j & 4294967295L)) + iI00l0OO0IO2 + i33;
                                                        }
                                                    }
/* 523 */                                           i25 = i33;
                                                } else {
/* 526 */                                           i27 = i3;
/* 528 */                                           i29 = i4;
/* 530 */                                           i25 = i33;
/* 532 */                                           i30 = 0;
                                                }
                                            } else {
/* 537 */                                       i27 = i31;
/* 539 */                                       i30 = iMax;
                                            }
/* 533 */                                   i23 = i5;
/* 542 */                                   i21 = i3;
/* 544 */                                   iArr2 = iArr;
/* 546 */                                   i26 = i4;
/* 547 */                                   i28 = i26;
                                        }
/* 562 */                               jI00000oOI = IooIiOoIIoO.I00000oOI(i25 - iI00l0OO0IO2, i4);
/* 570 */                               i12 = (int) (jI00000oOI >> 32);
/* 573 */                               int i35 = (int) (jI00000oOI & 4294967295L);
/* 574 */                               if (i12 <= i || i35 < iMin) {
/* 597 */                                   i16 = i3 + 1;
/* 599 */                                   if (i16 <= size4) {
/* 601 */                                       return i16;
                                            }
                                        } else {
/* 579 */                                   if (i12 >= i) {
/* 594 */                                       return i3;
                                            }
                                            size4 = i3 - 1;
                                        }
/* 583 */                               i20 = i3;
/* 585 */                               iArr2 = iArr;
/* 587 */                               i6 = 1;
/* 588 */                               i9 = Integer.MAX_VALUE;
/* 591 */                               i7 = 0;
                                    }
                                }
/* 262 */                       i3 = i21;
/* 264 */                       iArr = iArr2;
/* 570 */                       i12 = (int) (jI00000oOI >> 32);
/* 573 */                       int i352 = (int) (jI00000oOI & 4294967295L);
/* 574 */                       if (i12 <= i) {
/* 597 */                           i16 = i3 + 1;
/* 599 */                           if (i16 <= size4) {
                                    }
                                }
/* 583 */                       i20 = i3;
/* 585 */                       iArr2 = iArr;
/* 587 */                       i6 = 1;
/* 588 */                       i9 = Integer.MAX_VALUE;
/* 591 */                       i7 = 0;
                            }
/* 603 */                   return i20;
                        }
/* 605 */               IoOOl0iOl1io.I00000oOI();
                    } else {
/* 610 */               IoOOl0iOl1io.I00000oOI();
                    }
/* 608 */           return 0;
                }

                @Override
                public final int I0000O(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             float f = this.I0000Il00O;
/* 3 */             IlOoi1ilio00 ilOoi1ilio00 = this.I0001Ioi1lo;
/* 10 */            List list2 = (List) IOOi0Ool1i.I00II0oii1o(1, list);
/* 22 */            O1iIo0ll o1iIo0ll = list2 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list2) : null;
/* 28 */            List list3 = (List) IOOi0Ool1i.I00II0oii1o(2, list);
/* 45 */            ilOoi1ilio00.I00000oOI(o1iIo0ll, list3 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list3) : null, IOo0olo.I00000oOI(0, i, 0, 0, 13));
/* 52 */            List list4 = (List) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 54 */            if (list4 == null) {
/* 56 */                list4 = Il01100l.I00iOIl;
                    }
/* 73 */            return I000iOII(list4, i, ioooOl1001li.I00l0OO0IO(f), ioooOl1001li.I00l0OO0IO(this.I0000oI00), this.I0001Ioi1lo);
                }

                @Override
                public final int I0000oI00(IoooOl1001li ioooOl1001li, List list, int i) {
/* 1 */             float f = this.I0000oI00;
/* 3 */             float f2 = this.I0000Il00O;
/* 5 */             IlOoi1ilio00 ilOoi1ilio00 = this.I0001Ioi1lo;
/* 12 */            List list2 = (List) IOOi0Ool1i.I00II0oii1o(1, list);
/* 24 */            O1iIo0ll o1iIo0ll = list2 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list2) : null;
/* 30 */            List list3 = (List) IOOi0Ool1i.I00II0oii1o(2, list);
/* 47 */            ilOoi1ilio00.I00000oOI(o1iIo0ll, list3 != null ? (O1iIo0ll) IOOi0Ool1i.I00II0Ol1O0l(list3) : null, IOo0olo.I00000oOI(0, i, 0, 0, 13));
/* 54 */            List list4 = (List) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 56 */            if (list4 == null) {
/* 58 */                list4 = Il01100l.I00iOIl;
                    }
/* 73 */            return I000iOII(list4, i, ioooOl1001li.I00l0OO0IO(f2), ioooOl1001li.I00l0OO0IO(f), this.I0001Ioi1lo);
                }

                @Override
                public final void I0001Ioi1lo(int i, int[] iArr, int[] iArr2, O1iOIoOiO0 o1iOIoOiO0) {
/* 11 */            this.I00000oIO.I0001Ioi1lo(o1iOIoOiO0, i, iArr, o1iOIoOiO0.getLayoutDirection(), iArr2);
                }

                @Override
                public final long I000II(int i, int i2, int i3, boolean z) {
/* 1 */             OiI1iiIl1Oi0 oiI1iiIl1Oi0 = OiI1iOo.I00000oIO;
                    return !z ? IOo0olo.I00000oIO(i, i2, 0, i3) : iio0lo1i.I00000oOI(i, i2, 0, i3);
                }

                @Override
                public final O1iOIo0o0 I000O01llI0(OO1I0001000i[] oO1I0001000iArr, O1iOIoOiO0 o1iOIoOiO0, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
/* 1 */             O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 5 */             IlOoiiIO ilOoiiIO = new IlOoiiIO();
/* 8 */             ilOoiiIO.I00iOIl = iArr2;
/* 10 */            ilOoiiIO.I00iiI = i3;
/* 12 */            ilOoiiIO.I00iiO = i4;
/* 14 */            ilOoiiIO.I00iio = i5;
/* 16 */            ilOoiiIO.I00ilI0I1 = oO1I0001000iArr;
/* 18 */            ilOoiiIO.I00ilO0 = this;
/* 20 */            ilOoiiIO.I00io1l = i2;
/* 22 */            ilOoiiIO.I00ioIO = o0iOOoiioO;
/* 24 */            ilOoiiIO.I00l0I0l0lO1 = iArr;
/* 26 */            VarHandle.storeStoreFence();
/* 31 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, ilOoiiIO);
                }

                @Override
                public final int I000OOo1O(OO1I0001000i oO1I0001000i) {
/* 1 */             return oO1I0001000i.I00Oio();
                }

                @Override
                public final int I000OiO(OO1I0001000i oO1I0001000i) {
/* 1 */             return oO1I0001000i.I00Ol10();
                }

                public final int I000iOII(List list, int i, int i2, int i3, IlOoi1ilio00 ilOoi1ilio00) {
                    boolean z;
                    long jI00000oOI;
/* 10 */            if (list.isEmpty()) {
/* 12 */                jI00000oOI = IooIiOoIIoO.I00000oOI(0, 0);
                    } else {
/* 34 */                i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0(ilOoi1ilio00, IOo0olo.I00000oIO(0, i, 0, Integer.MAX_VALUE), i2, i3);
/* 42 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) IOOi0Ool1i.I00II0oii1o(0, list);
/* 51 */                int iI00OI1 = o1iIo0ll != null ? o1iIo0ll.I00OI1(i) : 0;
/* 59 */                int iI000l1 = o1iIo0ll != null ? o1iIo0ll.I000l1(iI00OI1) : 0;
/* 64 */                boolean z2 = true;
/* 65 */                if (list.size() > 1) {
/* 67 */                    z = true;
                        } else {
/* 69 */                    z = true;
/* 70 */                    z2 = false;
                        }
/* 97 */                int i4 = 0;
/* 111 */               if (i1o1ll0i0.I00000oOI(z2, 0, IooIiOoIIoO.I00000oOI(i, Integer.MAX_VALUE), o1iIo0ll == null ? null : IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(iI000l1, iI00OI1)), 0, 0, 0, false, false).I00iiI) {
/* 121 */                   IooIiOoIIoO iooIiOoIIoOI00000oIO = ilOoi1ilio00.I00000oIO(0, 0, o1iIo0ll != null ? z : false);
/* 134 */                   jI00000oOI = IooIiOoIIoO.I00000oOI(iooIiOoIIoOI00000oIO != null ? (int) (iooIiOoIIoOI00000oIO.I00000oIO & 4294967295L) : 0, 0);
                        } else {
/* 143 */                   int size = list.size();
/* 147 */                   int i5 = i;
/* 148 */                   int i6 = 0;
/* 149 */                   int i7 = 0;
/* 150 */                   int i8 = 0;
/* 152 */                   int i9 = 0;
/* 153 */                   int i10 = 0;
                            while (true) {
/* 155 */                       if (i6 >= size) {
                                    break;
                                }
/* 157 */                       int i11 = i5 - iI000l1;
/* 159 */                       int i12 = i6 + 1;
/* 161 */                       int iMax = Math.max(i10, iI00OI1);
/* 169 */                       O1iIo0ll o1iIo0ll2 = (O1iIo0ll) IOOi0Ool1i.I00II0oii1o(i12, list);
/* 178 */                       int iI00OI12 = o1iIo0ll2 != null ? o1iIo0ll2.I00OI1(i) : 0;
/* 188 */                       int iI000l12 = o1iIo0ll2 != null ? o1iIo0ll2.I000l1(iI00OI12) + i2 : 0;
/* 200 */                       int i13 = i12 - i8;
/* 207 */                       int i14 = i9;
/* 230 */                       int i15 = iI00OI12;
/* 238 */                       int i16 = iI000l12;
/* 242 */                       IlOoIo ilOoIoI00000oOI = i1o1ll0i0.I00000oOI(i6 + 2 < list.size() ? z : false, i13, IooIiOoIIoO.I00000oOI(i11, Integer.MAX_VALUE), o1iIo0ll2 == null ? null : IooIiOoIIoO.I00000oIO(IooIiOoIIoO.I00000oOI(iI000l12, iI00OI12)), i14, i4, iMax, false, false);
/* 248 */                       if (ilOoIoI00000oOI.I00iOIl) {
/* 252 */                           int i17 = iMax + i3 + i4;
/* 263 */                           IlOoIlO0I ilOoIlO0II00000oIO = i1o1ll0i0.I00000oIO(ilOoIoI00000oOI, o1iIo0ll2 != null ? z : false, i14, i17, i11, i13);
/* 268 */                           int i18 = i16 - i2;
/* 270 */                           i9 = i14 + 1;
/* 274 */                           if (ilOoIoI00000oOI.I00iiI) {
/* 276 */                               if (ilOoIlO0II00000oIO != null) {
/* 278 */                                   long j = ilOoIlO0II00000oIO.I0000Il00O;
/* 282 */                                   if (!ilOoIlO0II00000oIO.I0000O) {
/* 289 */                                       i17 += ((int) (j & 4294967295L)) + i3;
                                            }
                                        }
/* 290 */                               i4 = i17;
/* 291 */                               i7 = i12;
                                    } else {
/* 294 */                               i10 = 0;
/* 295 */                               i4 = i17;
/* 296 */                               iI000l1 = i18;
/* 297 */                               i8 = i12;
/* 299 */                               i5 = i;
                                    }
                                } else {
/* 302 */                           i5 = i11;
/* 303 */                           i9 = i14;
/* 304 */                           i10 = iMax;
/* 306 */                           iI000l1 = i16;
                                }
/* 308 */                       i6 = i12;
/* 310 */                       i7 = i6;
/* 311 */                       iI00OI1 = i15;
                            }
/* 317 */                   jI00000oOI = IooIiOoIIoO.I00000oOI(i4 - i3, i7);
                        }
                    }
/* 324 */           return (int) (jI00000oOI >> 32);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 78 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlOoil)) {
/* 76 */                return false;
                    }
/* 9 */             IlOoil ilOoil = (IlOoil) obj;
                    return this.I00000oIO.equals(ilOoil.I00000oIO) && this.I00000oOI.equals(ilOoil.I00000oOI) && Iil1010O.I0000Il00O(this.I0000Il00O, ilOoil.I0000Il00O) && this.I0000O.equals(ilOoil.I0000O) && Iil1010O.I0000Il00O(this.I0000oI00, ilOoil.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, ilOoil.I0001Ioi1lo);
                }

                public final int hashCode() {
/* 64 */            return this.I0001Ioi1lo.hashCode() + IIl001iO0Io.I0000O(Integer.MAX_VALUE, IIl001iO0Io.I0000O(Integer.MAX_VALUE, OooioIOo1.I0000O((this.I0000O.I00000oIO.hashCode() + OooioIOo1.I0000O((this.I00000oOI.hashCode() + ((this.I00000oIO.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31, this.I0000Il00O)) * 31, 31, this.I0000oI00), 31), 31);
                }

                public final String toString() {
/* 76 */            return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.I00000oIO + ", verticalArrangement=" + this.I00000oOI + ", mainAxisSpacing=" + Iil1010O.I0000O(this.I0000Il00O) + ", crossAxisAlignment=" + this.I0000O + ", crossAxisArrangementSpacing=" + Iil1010O.I0000O(this.I0000oI00) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.I0001Ioi1lo + ")";
                }
            }
