            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class i01OlO1IO implements Function1 {
                public final int I00iOIl;
                public String I00iiI;
                public List I00iiO;
                public i01Ooi0O I00iio;

                /* JADX WARN: Finally extract failed */
                @Override
                public final Object invoke(Object obj) throws Exception {
/* 5 */             int i = 17;
/* 7 */             int i2 = 16;
/* 9 */             int i3 = 15;
/* 11 */            int i4 = 14;
/* 13 */            int i5 = 4;
/* 16 */            int i6 = 1;
/* 17 */            int i7 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 768 */                   String str = this.I00iiI;
/* 770 */                   List list = this.I00iiO;
/* 772 */                   i01Ooi0O i01ooi0o = this.I00iio;
/* 776 */                   Olil0III olil0III = (Olil0III) obj;
/* 778 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(str);
                            try {
/* 782 */                       Iterator it = list.iterator();
/* 786 */                       int i8 = 1;
/* 791 */                       while (it.hasNext()) {
/* 799 */                           oiIIl0O1l0lI00000oIO.I00Io1o110i(i8, (String) it.next());
/* 802 */                           i8++;
                                }
/* 810 */                       int i9 = 0;
/* 811 */                       I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 816 */                       I1Io0i0II i1Io0i0II2 = new I1Io0i0II(0);
/* 823 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 825 */                           String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(i9);
/* 833 */                           if (!i1Io0i0II.containsKey(strI00i0O)) {
/* 840 */                               i1Io0i0II.put(strI00i0O, new ArrayList());
                                    }
/* 844 */                           String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 852 */                           if (!i1Io0i0II2.containsKey(strI00i0O2)) {
/* 859 */                               i1Io0i0II2.put(strI00i0O2, new ArrayList());
                                    }
/* 862 */                           i9 = 0;
                                }
/* 864 */                       oiIIl0O1l0lI00000oIO.reset();
/* 867 */                       i01ooi0o.I00000oOI(olil0III, i1Io0i0II);
/* 870 */                       i01ooi0o.I00000oIO(olil0III, i1Io0i0II2);
/* 875 */                       ArrayList arrayList = new ArrayList();
/* 882 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 885 */                           String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 894 */                           i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(i6));
/* 898 */                           byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(2);
/* 902 */                           Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1129 */                          arrayList.add(new i01Ol11(strI00i0O3, i01ioio1loI000II, il01ool0o.I00000oIO(blob), oiIIl0O1l0lI00000oIO.getLong(14), oiIIl0O1l0lI00000oIO.getLong(15), oiIIl0O1l0lI00000oIO.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(5)), ((int) oiIIl0O1l0lI00000oIO.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(10)) != 0, oiIIl0O1l0lI00000oIO.getLong(11), oiIIl0O1l0lI00000oIO.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(13))), (int) oiIIl0O1l0lI00000oIO.getLong(3), liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(17)), oiIIl0O1l0lI00000oIO.getLong(18), oiIIl0O1l0lI00000oIO.getLong(19), (int) oiIIl0O1l0lI00000oIO.getLong(20), (int) oiIIl0O1l0lI00000oIO.getLong(4), oiIIl0O1l0lI00000oIO.getLong(21), (int) oiIIl0O1l0lI00000oIO.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II2)));
/* 1132 */                          i6 = 1;
                                }
/* 1135 */                      oiIIl0O1l0lI00000oIO.close();
/* 1138 */                      return arrayList;
                            } catch (Throwable th) {
/* 1139 */                      oiIIl0O1l0lI00000oIO.close();
/* 1142 */                      throw th;
                            }
                        case 1:
/* 394 */                   String str2 = this.I00iiI;
/* 396 */                   List list2 = this.I00iiO;
/* 398 */                   i01Ooi0O i01ooi0o2 = this.I00iio;
/* 402 */                   Olil0III olil0III2 = (Olil0III) obj;
/* 404 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = olil0III2.I00000oIO(str2);
                            try {
/* 408 */                       Iterator it2 = list2.iterator();
/* 412 */                       int i10 = 1;
/* 417 */                       while (it2.hasNext()) {
/* 425 */                           oiIIl0O1l0lI00000oIO2.I00Io1o110i(i10, (String) it2.next());
/* 428 */                           i10++;
                                }
/* 436 */                       int i11 = 0;
/* 437 */                       I1Io0i0II i1Io0i0II3 = new I1Io0i0II(0);
/* 442 */                       I1Io0i0II i1Io0i0II4 = new I1Io0i0II(0);
/* 449 */                       while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 451 */                           String strI00i0O4 = oiIIl0O1l0lI00000oIO2.I00i0O(i11);
/* 459 */                           if (!i1Io0i0II3.containsKey(strI00i0O4)) {
/* 466 */                               i1Io0i0II3.put(strI00i0O4, new ArrayList());
                                    }
/* 470 */                           String strI00i0O5 = oiIIl0O1l0lI00000oIO2.I00i0O(0);
/* 478 */                           if (!i1Io0i0II4.containsKey(strI00i0O5)) {
/* 485 */                               i1Io0i0II4.put(strI00i0O5, new ArrayList());
                                    }
/* 488 */                           i11 = 0;
                                }
/* 490 */                       oiIIl0O1l0lI00000oIO2.reset();
/* 493 */                       i01ooi0o2.I00000oOI(olil0III2, i1Io0i0II3);
/* 496 */                       i01ooi0o2.I00000oIO(olil0III2, i1Io0i0II4);
/* 501 */                       ArrayList arrayList2 = new ArrayList();
/* 508 */                       while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 511 */                           String strI00i0O6 = oiIIl0O1l0lI00000oIO2.I00i0O(0);
/* 520 */                           i01IOiO1lO i01ioio1loI000II2 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO2.getLong(1));
/* 524 */                           byte[] blob2 = oiIIl0O1l0lI00000oIO2.getBlob(2);
/* 528 */                           Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 755 */                           arrayList2.add(new i01Ol11(strI00i0O6, i01ioio1loI000II2, il01ool0o.I00000oIO(blob2), oiIIl0O1l0lI00000oIO2.getLong(14), oiIIl0O1l0lI00000oIO2.getLong(15), oiIIl0O1l0lI00000oIO2.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO2.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO2.getLong(5)), ((int) oiIIl0O1l0lI00000oIO2.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(10)) != 0, oiIIl0O1l0lI00000oIO2.getLong(11), oiIIl0O1l0lI00000oIO2.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO2.getBlob(13))), (int) oiIIl0O1l0lI00000oIO2.getLong(3), liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO2.getLong(17)), oiIIl0O1l0lI00000oIO2.getLong(18), oiIIl0O1l0lI00000oIO2.getLong(19), (int) oiIIl0O1l0lI00000oIO2.getLong(20), (int) oiIIl0O1l0lI00000oIO2.getLong(4), oiIIl0O1l0lI00000oIO2.getLong(21), (int) oiIIl0O1l0lI00000oIO2.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO2.I00i0O(0), i1Io0i0II3), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO2.I00i0O(0), i1Io0i0II4)));
                                }
/* 760 */                       oiIIl0O1l0lI00000oIO2.close();
/* 763 */                       return arrayList2;
                            } catch (Throwable th2) {
/* 764 */                       oiIIl0O1l0lI00000oIO2.close();
/* 767 */                       throw th2;
                            }
                        default:
/* 21 */                    String str3 = this.I00iiI;
/* 23 */                    List list3 = this.I00iiO;
/* 25 */                    i01Ooi0O i01ooi0o3 = this.I00iio;
/* 29 */                    Olil0III olil0III3 = (Olil0III) obj;
/* 31 */                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO3 = olil0III3.I00000oIO(str3);
                            try {
/* 35 */                        Iterator it3 = list3.iterator();
/* 39 */                        int i12 = 1;
/* 44 */                        while (it3.hasNext()) {
/* 54 */                            oiIIl0O1l0lI00000oIO3.I00Io1o110i(i12, (String) it3.next());
/* 57 */                            i12++;
                                }
/* 65 */                        I1Io0i0II i1Io0i0II5 = new I1Io0i0II(0);
/* 70 */                        I1Io0i0II i1Io0i0II6 = new I1Io0i0II(0);
/* 77 */                        while (oiIIl0O1l0lI00000oIO3.I00ol1()) {
/* 79 */                            String strI00i0O7 = oiIIl0O1l0lI00000oIO3.I00i0O(0);
/* 87 */                            if (!i1Io0i0II5.containsKey(strI00i0O7)) {
/* 94 */                                i1Io0i0II5.put(strI00i0O7, new ArrayList());
                                    }
/* 97 */                            String strI00i0O8 = oiIIl0O1l0lI00000oIO3.I00i0O(0);
/* 105 */                           if (!i1Io0i0II6.containsKey(strI00i0O8)) {
/* 112 */                               i1Io0i0II6.put(strI00i0O8, new ArrayList());
                                    }
                                }
/* 116 */                       oiIIl0O1l0lI00000oIO3.reset();
/* 119 */                       i01ooi0o3.I00000oOI(olil0III3, i1Io0i0II5);
/* 122 */                       i01ooi0o3.I00000oIO(olil0III3, i1Io0i0II6);
/* 127 */                       ArrayList arrayList3 = new ArrayList();
/* 134 */                       while (oiIIl0O1l0lI00000oIO3.I00ol1()) {
/* 136 */                           String strI00i0O9 = oiIIl0O1l0lI00000oIO3.I00i0O(i7);
/* 145 */                           i01IOiO1lO i01ioio1loI000II3 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO3.getLong(1));
/* 149 */                           byte[] blob3 = oiIIl0O1l0lI00000oIO3.getBlob(2);
/* 153 */                           Ii11I1OOII1 ii11I1OOII13 = Ii11I1OOII1.I00000oOI;
/* 371 */                           arrayList3.add(new i01Ol11(strI00i0O9, i01ioio1loI000II3, il01ool0o.I00000oIO(blob3), oiIIl0O1l0lI00000oIO3.getLong(i4), oiIIl0O1l0lI00000oIO3.getLong(i3), oiIIl0O1l0lI00000oIO3.getLong(i2), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO3.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO3.getLong(5)), ((int) oiIIl0O1l0lI00000oIO3.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(10)) != 0, oiIIl0O1l0lI00000oIO3.getLong(11), oiIIl0O1l0lI00000oIO3.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO3.getBlob(13))), (int) oiIIl0O1l0lI00000oIO3.getLong(3), liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO3.getLong(i)), oiIIl0O1l0lI00000oIO3.getLong(18), oiIIl0O1l0lI00000oIO3.getLong(19), (int) oiIIl0O1l0lI00000oIO3.getLong(20), (int) oiIIl0O1l0lI00000oIO3.getLong(i5), oiIIl0O1l0lI00000oIO3.getLong(21), (int) oiIIl0O1l0lI00000oIO3.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO3.I00i0O(0), i1Io0i0II5), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO3.I00i0O(0), i1Io0i0II6)));
/* 374 */                           i = 17;
/* 376 */                           i2 = 16;
/* 378 */                           i3 = 15;
/* 380 */                           i4 = 14;
/* 382 */                           i7 = 0;
/* 383 */                           i5 = 4;
                                }
/* 386 */                       oiIIl0O1l0lI00000oIO3.close();
/* 389 */                       return arrayList3;
                            } catch (Throwable th3) {
/* 390 */                       oiIIl0O1l0lI00000oIO3.close();
/* 393 */                       throw th3;
                            }
                    }
                }
            }
