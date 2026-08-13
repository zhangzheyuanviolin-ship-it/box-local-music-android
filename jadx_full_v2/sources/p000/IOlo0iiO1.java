            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.ProtocolException;
            import java.util.ArrayList;
            
            public final class IOlo0iiO1 implements IooilIO1I {
                public static final IOlo0iiO1 I00000oOI = new IOlo0iiO1(0);
                public final int I00000oIO;

                public IOlo0iiO1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: IOException -> 0x00cf, TryCatch #8 {IOException -> 0x00cf, blocks: (B:52:0x00ca, B:55:0x00d2, B:63:0x00f5, B:64:0x010d, B:69:0x0133, B:71:0x0149, B:74:0x0152, B:81:0x0167, B:83:0x016b, B:87:0x017a, B:89:0x018d, B:90:0x0195, B:91:0x019f, B:76:0x0158, B:94:0x01a2, B:95:0x01a5, B:65:0x0111, B:68:0x011c), top: B:207:0x00ca, inners: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0158 A[Catch: IOException -> 0x00cf, TryCatch #8 {IOException -> 0x00cf, blocks: (B:52:0x00ca, B:55:0x00d2, B:63:0x00f5, B:64:0x010d, B:69:0x0133, B:71:0x0149, B:74:0x0152, B:81:0x0167, B:83:0x016b, B:87:0x017a, B:89:0x018d, B:90:0x0195, B:91:0x019f, B:76:0x0158, B:94:0x01a2, B:95:0x01a5, B:65:0x0111, B:68:0x011c), top: B:207:0x00ca, inners: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0167 A[Catch: IOException -> 0x00cf, TryCatch #8 {IOException -> 0x00cf, blocks: (B:52:0x00ca, B:55:0x00d2, B:63:0x00f5, B:64:0x010d, B:69:0x0133, B:71:0x0149, B:74:0x0152, B:81:0x0167, B:83:0x016b, B:87:0x017a, B:89:0x018d, B:90:0x0195, B:91:0x019f, B:76:0x0158, B:94:0x01a2, B:95:0x01a5, B:65:0x0111, B:68:0x011c), top: B:207:0x00ca, inners: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x016b A[Catch: IOException -> 0x00cf, TryCatch #8 {IOException -> 0x00cf, blocks: (B:52:0x00ca, B:55:0x00d2, B:63:0x00f5, B:64:0x010d, B:69:0x0133, B:71:0x0149, B:74:0x0152, B:81:0x0167, B:83:0x016b, B:87:0x017a, B:89:0x018d, B:90:0x0195, B:91:0x019f, B:76:0x0158, B:94:0x01a2, B:95:0x01a5, B:65:0x0111, B:68:0x011c), top: B:207:0x00ca, inners: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x017a A[Catch: IOException -> 0x00cf, TryCatch #8 {IOException -> 0x00cf, blocks: (B:52:0x00ca, B:55:0x00d2, B:63:0x00f5, B:64:0x010d, B:69:0x0133, B:71:0x0149, B:74:0x0152, B:81:0x0167, B:83:0x016b, B:87:0x017a, B:89:0x018d, B:90:0x0195, B:91:0x019f, B:76:0x0158, B:94:0x01a2, B:95:0x01a5, B:65:0x0111, B:68:0x011c), top: B:207:0x00ca, inners: #6 }] */
                /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v21 */
                /* JADX WARN: Type inference failed for: r2v22 */
                /* JADX WARN: Type inference failed for: r2v27 */
                /* JADX WARN: Type inference failed for: r2v28 */
                /* JADX WARN: Type inference failed for: r2v29 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oi1001l0Il I00000oIO(OOlli0I oOlli0I) throws Throwable {
                    Io1Io0OOi011 io1Io0OOi011;
                    Oi10001 oi10001;
                    IOException iOException;
                    Oi10001 oi10001I0000oI00;
                    Oi1001l0Il oi1001l0IlI00000oIO;
                    int i;
                    String strI00000oOI;
                    Oi1001l0Il oi1001l0IlI00000oIO2;
                    IoiOloi ioiOloi;
                    ?? I00000oIO;
/* 7 */             boolean z = true;
                    switch (this.I00000oIO) {
                        case 0:
/* 807 */                   OOlioiIOOO1 oOlioiIOOO1 = oOlli0I.I00000oIO;
                            synchronized (oOlioiIOOO1) {
                                try {
/* 812 */                           if (!oOlioiIOOO1.I00ll1) {
/* 963 */                               throw new IllegalStateException("released");
                                    }
/* 816 */                           if (oOlioiIOOO1.I00li1OI) {
/* 955 */                               throw new IllegalStateException("Check failed.");
                                    }
/* 820 */                           if (oOlioiIOOO1.I00l0OO0IO) {
/* 945 */                               throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th) {
/* 965 */                           throw th;
                                }
                            }
/* 823 */                   Il11O1o il11O1o = oOlioiIOOO1.I00io1l;
/* 825 */                   OIOlo0OloOi oIOlo0OloOi = oOlioiIOOO1.I00iOIl;
                            try {
/* 853 */                       Il111ol il111olI000O01llI0 = il11O1o.I00000oIO(oOlli0I.I0001Ioi1lo, oOlli0I.I000II, oOlli0I.I000O01llI0, oIOlo0OloOi.I00ilO0, !O0000Ioio00.I0000O((String) oOlli0I.I0000oI00.I00iiO, "GET")).I000O01llI0(oIOlo0OloOi, oOlli0I);
/* 859 */                       IOI0oloi01 iOI0oloi01 = new IOI0oloi01();
/* 862 */                       iOI0oloi01.I00000oOI = oOlioiIOOO1;
/* 864 */                       iOI0oloi01.I0000Il00O = il11O1o;
/* 866 */                       iOI0oloi01.I0000O = il111olI000O01llI0;
/* 872 */                       iOI0oloi01.I0000oI00 = il111olI000O01llI0.I0001Ioi1lo();
/* 874 */                       VarHandle.storeStoreFence();
/* 877 */                       oOlioiIOOO1.I00l0I0l0lO1 = iOI0oloi01;
/* 879 */                       oOlioiIOOO1.I00lll10 = iOI0oloi01;
                                synchronized (oOlioiIOOO1) {
/* 882 */                           oOlioiIOOO1.I00l0OO0IO = true;
/* 884 */                           oOlioiIOOO1.I00li1OI = true;
                                }
/* 889 */                       if (!oOlioiIOOO1.I00lli11) {
/* 902 */                           return OOlli0I.I00000oIO(oOlli0I, 0, iOI0oloi01, null, 61).I00000oOI(oOlli0I.I0000oI00);
                                }
/* 911 */                       IioIoO10iOiI.I000OOo1O("Canceled");
/* 8 */                         return null;
                            } catch (OiI1Ii e) {
/* 934 */                       il11O1o.I00000oOI(e.I00iiI);
/* 937 */                       throw e;
                            } catch (IOException e2) {
/* 923 */                       il11O1o.I00000oOI(e2);
/* 931 */                       throw new OiI1Ii(e2);
                            }
                        case 1:
/* 442 */                   System.currentTimeMillis();
/* 445 */                   I0Oi111ii i0Oi111ii = oOlli0I.I0000oI00;
/* 449 */                   int i2 = 5;
/* 450 */                   IIlio101Io iIlio101Io = new IIlio101Io(i2, i0Oi111ii, l);
/* 459 */                   if (i0Oi111ii.I000oI1ioi().I000OiO) {
/* 463 */                       iIlio101Io = new IIlio101Io(i2, l, l);
                            }
/* 468 */                   I0Oi111ii i0Oi111ii2 = (I0Oi111ii) iIlio101Io.I00iiI;
/* 472 */                   Oi1001l0Il oi1001l0Il = (Oi1001l0Il) iIlio101Io.I00iiO;
/* 474 */                   if (i0Oi111ii2 == null && oi1001l0Il == null) {
/* 480 */                       Oi10001 oi100012 = new Oi10001();
/* 483 */                       oi100012.I00000oIO = i0Oi111ii;
/* 487 */                       oi100012.I00000oOI = OOiIO0oi.HTTP_1_1;
/* 491 */                       oi100012.I0000Il00O = 504;
/* 495 */                       oi100012.I0000O = "Unsatisfiable Request (only-if-cached)";
/* 499 */                       oi100012.I000II = OollIoI001lo.I0000Il00O;
/* 503 */                       oi100012.I000iOII = -1L;
/* 509 */                       oi100012.I000l1 = System.currentTimeMillis();
/* 511 */                       return oi100012.I00000oIO();
                            }
/* 517 */                   if (i0Oi111ii2 == null) {
/* 519 */                       Oi10001 oi10001I00000oIO = oi1001l0Il.I00000oIO();
/* 523 */                       Oi1001l0Il oi1001l0IlI00000oOI = iOiiOO0iI1IO.I00000oOI(oi1001l0Il);
/* 527 */                       Oi10001.I00000oOI("cacheResponse", oi1001l0IlI00000oOI);
/* 530 */                       oi10001I00000oIO.I000OOo1O = oi1001l0IlI00000oOI;
/* 532 */                       return oi10001I00000oIO.I00000oIO();
                            }
/* 538 */                   Oi1001l0Il oi1001l0IlI00000oOI2 = oOlli0I.I00000oOI(i0Oi111ii2);
/* 542 */                   if (oi1001l0Il != null) {
/* 548 */                       if (oi1001l0IlI00000oOI2.I00iio == 304) {
/* 550 */                           Oi10001 oi10001I00000oIO2 = oi1001l0Il.I00000oIO();
/* 554 */                           Io1Io0OOi011 io1Io0OOi0112 = oi1001l0Il.I00ilO0;
/* 556 */                           Io1Io0OOi011 io1Io0OOi0113 = oi1001l0IlI00000oOI2.I00ilO0;
/* 562 */                           ArrayList arrayList = new ArrayList(20);
/* 565 */                           int size = io1Io0OOi0112.size();
/* 569 */                           int i3 = 0;
/* 570 */                           while (i3 < size) {
/* 572 */                               String strI0000O = io1Io0OOi0112.I0000O(i3);
/* 576 */                               String strI000OiO = io1Io0OOi0112.I000OiO(i3);
/* 580 */                               Long l = l;
/* 588 */                               if ("Warning".equalsIgnoreCase(strI0000O)) {
/* 592 */                                   io1Io0OOi011 = io1Io0OOi0112;
/* 599 */                                   if (OlOolloIIOl0.I000l1(strI000OiO, "1", false)) {
                                            }
/* 649 */                                   i3++;
/* 651 */                                   l = l;
/* 653 */                                   io1Io0OOi0112 = io1Io0OOi011;
                                        } else {
/* 602 */                                   io1Io0OOi011 = io1Io0OOi0112;
                                        }
/* 608 */                               if ("Content-Length".equalsIgnoreCase(strI0000O) || "Content-Encoding".equalsIgnoreCase(strI0000O) || "Content-Type".equalsIgnoreCase(strI0000O) || !iOiiOO0iI1IO.I00000oIO(strI0000O) || io1Io0OOi0113.I00000oOI(strI0000O) == null) {
/* 635 */                                   arrayList.add(strI0000O);
/* 646 */                                   arrayList.add(OlOoOIi0o.I00OIo(strI000OiO).toString());
                                        }
/* 649 */                               i3++;
/* 651 */                               l = l;
/* 653 */                               io1Io0OOi0112 = io1Io0OOi011;
                                    }
/* 656 */                           ?? r16 = l;
/* 658 */                           int size2 = io1Io0OOi0113.size();
/* 663 */                           for (int i4 = 0; i4 < size2; i4++) {
/* 665 */                               String strI0000O2 = io1Io0OOi0113.I0000O(i4);
/* 673 */                               if (!"Content-Length".equalsIgnoreCase(strI0000O2) && !"Content-Encoding".equalsIgnoreCase(strI0000O2) && !"Content-Type".equalsIgnoreCase(strI0000O2) && iOiiOO0iI1IO.I00000oIO(strI0000O2)) {
/* 694 */                                   String strI000OiO2 = io1Io0OOi0113.I000OiO(i4);
/* 698 */                                   arrayList.add(strI0000O2);
/* 709 */                                   arrayList.add(OlOoOIi0o.I00OIo(strI000OiO2).toString());
                                        }
                                    }
/* 722 */                           String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 726 */                           Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 731 */                           IOOii0O10Io0.I00100o1O0lo(io1IlO1I1i.I00000oIO, strArr);
/* 734 */                           oi10001I00000oIO2.I0001Ioi1lo = io1IlO1I1i;
/* 738 */                           oi10001I00000oIO2.I000iOII = oi1001l0IlI00000oOI2.I00li1OI;
/* 742 */                           oi10001I00000oIO2.I000l1 = oi1001l0IlI00000oOI2.I00ll1;
/* 744 */                           Oi1001l0Il oi1001l0IlI00000oOI3 = iOiiOO0iI1IO.I00000oOI(oi1001l0Il);
/* 748 */                           Oi10001.I00000oOI("cacheResponse", oi1001l0IlI00000oOI3);
/* 751 */                           oi10001I00000oIO2.I000OOo1O = oi1001l0IlI00000oOI3;
/* 753 */                           Oi1001l0Il oi1001l0IlI00000oOI4 = iOiiOO0iI1IO.I00000oOI(oi1001l0IlI00000oOI2);
/* 757 */                           Oi10001.I00000oOI("networkResponse", oi1001l0IlI00000oOI4);
/* 760 */                           oi10001I00000oIO2.I000O01llI0 = oi1001l0IlI00000oOI4;
/* 762 */                           oi10001I00000oIO2.I00000oIO();
/* 767 */                           oi1001l0IlI00000oOI2.I00io1l.close();
/* 770 */                           throw r16;
                                }
/* 771 */                       IoiOloi ioiOloi2 = oi1001l0Il.I00io1l;
/* 773 */                       if (ioiOloi2 != null) {
/* 775 */                           OollIoI001lo.I0000O(ioiOloi2);
                                }
                            }
/* 778 */                   Oi10001 oi10001I00000oIO3 = oi1001l0IlI00000oOI2.I00000oIO();
/* 782 */                   Oi1001l0Il oi1001l0IlI00000oOI5 = iOiiOO0iI1IO.I00000oOI(oi1001l0Il);
/* 786 */                   Oi10001.I00000oOI("cacheResponse", oi1001l0IlI00000oOI5);
/* 789 */                   oi10001I00000oIO3.I000OOo1O = oi1001l0IlI00000oOI5;
/* 791 */                   Oi1001l0Il oi1001l0IlI00000oOI6 = iOiiOO0iI1IO.I00000oOI(oi1001l0IlI00000oOI2);
/* 795 */                   Oi10001.I00000oOI("networkResponse", oi1001l0IlI00000oOI6);
/* 798 */                   oi10001I00000oIO3.I000O01llI0 = oi1001l0IlI00000oOI6;
/* 800 */                   return oi10001I00000oIO3.I00000oIO();
                        default:
/* 18 */                    IOI0oloi01 iOI0oloi012 = oOlli0I.I0000O;
/* 22 */                    OOlioiIOOO1 oOlioiIOOO12 = (OOlioiIOOO1) iOI0oloi012.I00000oOI;
/* 26 */                    Il111ol il111ol = (Il111ol) iOI0oloi012.I0000O;
/* 30 */                    OOll1O oOll1O = (OOll1O) iOI0oloi012.I0000oI00;
/* 32 */                    I0Oi111ii i0Oi111ii3 = oOlli0I.I0000oI00;
/* 36 */                    I00Ol00 i00Ol00 = (I00Ol00) i0Oi111ii3.I00ilI0I1;
/* 38 */                    long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                try {
/* 42 */                            il111ol.I000O01llI0(i0Oi111ii3);
/* 49 */                            I00000oIO = io0IoloO1.I00000oIO((String) i0Oi111ii3.I00iiO);
                                    try {
/* 53 */                                if (I00000oIO == 0 || i00Ol00 == null) {
/* 167 */                                   oOlioiIOOO12.I000O01llI0(iOI0oloi012, true, false, null);
/* 170 */                                   I00000oIO = 0;
                                        } else {
/* 73 */                                    if ("100-continue".equalsIgnoreCase(((Io1Io0OOi011) i0Oi111ii3.I00iio).I00000oOI("Expect"))) {
                                                try {
/* 75 */                                            il111ol.I000II();
/* 78 */                                            I00000oIO = iOI0oloi012.I0000oI00(true);
                                                } catch (IOException e3) {
/* 87 */                                            iOI0oloi012.I0001Ioi1lo(e3);
/* 90 */                                            throw e3;
                                                }
                                            } else {
/* 91 */                                        I00000oIO = 0;
                                            }
/* 92 */                                    if (I00000oIO == 0) {
/* 98 */                                        long j = ((I00Ol00) i0Oi111ii3.I00ilI0I1).I00000oOI;
/* 110 */                                       OOliIlo01o oOliIlo01oI00000oIO = l1l0I1OIOIO1.I00000oIO(new Il111i010lO(iOI0oloi012, il111ol.I0000O(i0Oi111ii3, j), j));
/* 116 */                                       byte[] bArr = (byte[]) i00Ol00.I0000O;
/* 118 */                                       int i5 = i00Ol00.I00000oOI;
/* 122 */                                       if (oOliIlo01oI00000oIO.I00iiO) {
/* 145 */                                           throw new IllegalStateException("closed");
                                                }
/* 126 */                                       oOliIlo01oI00000oIO.I00iiI.I00ioIO(i5, bArr);
/* 129 */                                       oOliIlo01oI00000oIO.I00000oIO();
/* 132 */                                       oOliIlo01oI00000oIO.close();
                                            } else {
/* 147 */                                       oOlioiIOOO12.I000O01llI0(iOI0oloi012, true, false, null);
/* 152 */                                       if (oOll1O.I0001Ioi1lo == null) {
/* 155 */                                           z = false;
                                                }
/* 156 */                                       if (!z) {
/* 162 */                                           il111ol.I0001Ioi1lo().I000OOo1O();
                                                }
                                            }
                                        }
                                    } catch (IOException e4) {
/* 136 */                               e = e4;
                                        oi10001 = I00000oIO;
/* 189 */                               if (!(e instanceof IOlo1oo) || !iOI0oloi012.I00000oIO) {
/* 430 */                                   throw e;
                                        }
/* 195 */                               Oi10001 oi100013 = oi10001;
/* 197 */                               iOException = e;
/* 198 */                               oi10001I0000oI00 = oi100013;
/* 200 */                               if (oi10001I0000oI00 == null) {
                                        }
/* 211 */                               oi10001I0000oI00.I00000oIO = i0Oi111ii3;
/* 215 */                               oi10001I0000oI00.I0000oI00 = oOll1O.I0000O;
/* 217 */                               oi10001I0000oI00.I000iOII = jCurrentTimeMillis;
/* 223 */                               oi10001I0000oI00.I000l1 = System.currentTimeMillis();
/* 225 */                               oi1001l0IlI00000oIO = oi10001I0000oI00.I00000oIO();
/* 229 */                               i = oi1001l0IlI00000oIO.I00iio;
/* 233 */                               if (i != 100) {
/* 246 */                                   Oi10001 oi10001I0000oI002 = iOI0oloi012.I0000oI00(false);
/* 250 */                                   oi10001I0000oI002.I00000oIO = i0Oi111ii3;
/* 254 */                                   oi10001I0000oI002.I0000oI00 = oOll1O.I0000O;
/* 256 */                                   oi10001I0000oI002.I000iOII = jCurrentTimeMillis;
/* 262 */                                   oi10001I0000oI002.I000l1 = System.currentTimeMillis();
/* 264 */                                   oi1001l0IlI00000oIO = oi10001I0000oI002.I00000oIO();
/* 268 */                                   i = oi1001l0IlI00000oIO.I00iio;
                                        }
/* 270 */                               Oi10001 oi10001I00000oIO4 = oi1001l0IlI00000oIO.I00000oIO();
                                        try {
/* 278 */                                   strI00000oOI = oi1001l0IlI00000oIO.I00ilO0.I00000oOI("Content-Type");
/* 282 */                                   if (strI00000oOI == null) {
                                            }
/* 285 */                                   long jI0000Il00O = il111ol.I0000Il00O(oi1001l0IlI00000oIO);
/* 308 */                                   oi10001I00000oIO4.I000II = new OOllioO00i1(strI00000oOI, jI0000Il00O, new OOliO0(new Il111lI1l0(iOI0oloi012, il111ol.I00000oIO(oi1001l0IlI00000oIO), jI0000Il00O)));
/* 310 */                                   oi1001l0IlI00000oIO2 = oi10001I00000oIO4.I00000oIO();
/* 328 */                                   if ("close".equalsIgnoreCase(((Io1Io0OOi011) oi1001l0IlI00000oIO2.I00iOIl.I00iio).I00000oOI("Connection"))) {
                                            }
/* 354 */                                   if (i != 204) {
/* 360 */                                       ioiOloi = oi1001l0IlI00000oIO2.I00io1l;
/* 377 */                                       if ((ioiOloi == null ? ioiOloi.I00000oIO() : -1L) > 0) {
                                                }
                                            }
/* 417 */                                   return oi1001l0IlI00000oIO2;
                                        } catch (IOException e5) {
/* 419 */                                   iOI0oloi012.I0001Ioi1lo(e5);
/* 422 */                                   throw e5;
                                        }
                                    }
                                } catch (IOException e6) {
/* 183 */                           iOI0oloi012.I0001Ioi1lo(e6);
/* 186 */                           throw e6;
                                }
                            } catch (IOException e7) {
/* 83 */                        e = e7;
/* 84 */                        oi10001 = null;
/* 189 */                       if (!(e instanceof IOlo1oo)) {
/* 430 */                           throw e;
                                }
/* 431 */                       throw e;
                            }
                            try {
/* 171 */                       il111ol.I00000oOI();
/* 174 */                       oi10001I0000oI00 = I00000oIO;
/* 175 */                       iOException = null;
/* 200 */                       if (oi10001I0000oI00 == null) {
                                    try {
/* 203 */                               oi10001I0000oI00 = iOI0oloi012.I0000oI00(false);
                                    } catch (IOException e8) {
/* 423 */                               if (iOException == null) {
/* 429 */                                   throw e8;
                                        }
/* 425 */                               ilIilolOlIoO.I00000oIO(iOException, e8);
/* 428 */                               throw iOException;
                                    }
                                }
/* 211 */                       oi10001I0000oI00.I00000oIO = i0Oi111ii3;
/* 215 */                       oi10001I0000oI00.I0000oI00 = oOll1O.I0000O;
/* 217 */                       oi10001I0000oI00.I000iOII = jCurrentTimeMillis;
/* 223 */                       oi10001I0000oI00.I000l1 = System.currentTimeMillis();
/* 225 */                       oi1001l0IlI00000oIO = oi10001I0000oI00.I00000oIO();
/* 229 */                       i = oi1001l0IlI00000oIO.I00iio;
/* 233 */                       if (i != 100 || (102 <= i && i < 200)) {
/* 246 */                           Oi10001 oi10001I0000oI0022 = iOI0oloi012.I0000oI00(false);
/* 250 */                           oi10001I0000oI0022.I00000oIO = i0Oi111ii3;
/* 254 */                           oi10001I0000oI0022.I0000oI00 = oOll1O.I0000O;
/* 256 */                           oi10001I0000oI0022.I000iOII = jCurrentTimeMillis;
/* 262 */                           oi10001I0000oI0022.I000l1 = System.currentTimeMillis();
/* 264 */                           oi1001l0IlI00000oIO = oi10001I0000oI0022.I00000oIO();
/* 268 */                           i = oi1001l0IlI00000oIO.I00iio;
                                }
/* 270 */                       Oi10001 oi10001I00000oIO42 = oi1001l0IlI00000oIO.I00000oIO();
/* 278 */                       strI00000oOI = oi1001l0IlI00000oIO.I00ilO0.I00000oOI("Content-Type");
/* 282 */                       if (strI00000oOI == null) {
/* 284 */                           strI00000oOI = null;
                                }
/* 285 */                       long jI0000Il00O2 = il111ol.I0000Il00O(oi1001l0IlI00000oIO);
/* 308 */                       oi10001I00000oIO42.I000II = new OOllioO00i1(strI00000oOI, jI0000Il00O2, new OOliO0(new Il111lI1l0(iOI0oloi012, il111ol.I00000oIO(oi1001l0IlI00000oIO), jI0000Il00O2)));
/* 310 */                       oi1001l0IlI00000oIO2 = oi10001I00000oIO42.I00000oIO();
/* 328 */                       if ("close".equalsIgnoreCase(((Io1Io0OOi011) oi1001l0IlI00000oIO2.I00iOIl.I00iio).I00000oOI("Connection"))) {
/* 349 */                           il111ol.I0001Ioi1lo().I000OOo1O();
                                } else {
/* 332 */                           String strI00000oOI2 = oi1001l0IlI00000oIO2.I00ilO0.I00000oOI("Connection");
/* 336 */                           if (strI00000oOI2 == null) {
/* 338 */                               strI00000oOI2 = null;
                                    }
/* 343 */                           if ("close".equalsIgnoreCase(strI00000oOI2)) {
                                    }
                                }
/* 354 */                       if (i != 204 || i == 205) {
/* 360 */                           ioiOloi = oi1001l0IlI00000oIO2.I00io1l;
/* 377 */                           if ((ioiOloi == null ? ioiOloi.I00000oIO() : -1L) > 0) {
/* 383 */                               StringBuilder sb = new StringBuilder("HTTP ");
/* 386 */                               sb.append(i);
/* 391 */                               sb.append(" had non-zero Content-Length: ");
/* 394 */                               IoiOloi ioiOloi3 = oi1001l0IlI00000oIO2.I00io1l;
/* 406 */                               sb.append(ioiOloi3 != null ? Long.valueOf(ioiOloi3.I00000oIO()) : null);
/* 416 */                               throw new ProtocolException(sb.toString());
                                    }
                                }
/* 417 */                       return oi1001l0IlI00000oIO2;
                            } catch (IOException e9) {
/* 178 */                       iOI0oloi012.I0001Ioi1lo(e9);
/* 181 */                       throw e9;
                            }
                    }
                }
            }
