            package p000;

            import android.graphics.PointF;
            import android.util.Size;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import javax.net.ssl.SSLSocket;
            
/* 47 */    public final class loIOiIO1O1 implements IOiOiIIiii1, O1ll0I0i0OO, Ii00l0i1loO, IOllol1io, IiIOiO1, IIlI0I1li, Ii01l1Ii0i, Ii0OIl1OO, illlli, iiIi1oo0Io, OoI0o0oiol0l {
                public static loIOiIO1O1 I00iiI;
                public static final I000II I00iiO = new I000II(25);
                public static final loIOiIO1O1 I00iio = new loIOiIO1O1(2);
                public static final loIOiIO1O1 I00ilI0I1 = new loIOiIO1O1(3);
                public static final loIOiIO1O1 I00ilO0 = new loIOiIO1O1(4);
                public static final OiiOloi1o I00io1l = new OiiOloi1o(0);
                public static final OiiOloi1o I00ioIO = new OiiOloi1o(1);
                public static final OiiOloi1o I00l0I0l0lO1 = new OiiOloi1o(2);
                public static final OiiOloi1o I00l0OO0IO = new OiiOloi1o(3);
                public static final loIOiIO1O1 I00li1OI = new loIOiIO1O1(6);
                public static final loIOiIO1O1 I00ll1 = new loIOiIO1O1(7);
                public static final loIOiIO1O1 I00lli11 = new loIOiIO1O1(20);
                public static final loIOiIO1O1 I00lll10 = new loIOiIO1O1(21);
                public static final loIOiIO1O1 I00o0iI0io1 = new loIOiIO1O1(22);
                public static final loIOiIO1O1 I00o0l1o1o0 = new loIOiIO1O1(23);
                public static final loIOiIO1O1 I00o101lO = new loIOiIO1O1(24);
                public static final loIOiIO1O1 I00oI0i = new loIOiIO1O1(25);
                public final int I00iOIl;

                public loIOiIO1O1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static Olio00O I000iOII(Olilol olilol, Olill0O0OOIO olill0O0OOIO, OlOOI001 olOOI001) {
/* 3 */             Olio00O olio00O = new Olio00O();
/* 6 */             olio00O.I00000oIO = olilol;
/* 8 */             olio00O.I00000oOI = olill0O0OOIO;
/* 10 */            olio00O.I0000Il00O = olOOI001;
/* 18 */            Integer num = (Integer) Olio00O.I000II.get(olilol);
/* 28 */            olio00O.I0000O = num != null ? num.intValue() : 0;
/* 30 */            VarHandle.storeStoreFence();
/* 215 */           return olio00O;
                }

                public static int I000lI() {
/* 1 */             int i = IiOOioIIO0.I0000O;
/* 5 */             IiOOioIIO0.I0000O = i << 1;
/* 29 */            return i;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Olio00O I000o00OoI0I(int i, Size size, I1lO00O00I1 i1lO00O00I1, int i2, OliloO1OOO oliloO1OOO, OlOOI001 olOOI001) {
/* 1 */             Map map = i1lO00O00I1.I0001Ioi1lo;
/* 13 */            Olilol olilol = (Olilol) Olio00O.I000O01llI0.get(Integer.valueOf(i));
/* 15 */            if (olilol == null) {
/* 17 */                olilol = Olilol.I00iOIl;
                    }
/* 19 */            Olill0O0OOIO olill0O0OOIO = Olill0O0OOIO.I00o101lO;
/* 21 */            Size size2 = Ol0ilIo.I00000oIO;
/* 31 */            int height = size.getHeight() * size.getWidth();
/* 33 */            if (i2 == 1) {
/* 51 */                if (height <= Ol0ilIo.I00000oIO((Size) i1lO00O00I1.I00000oOI.get(Integer.valueOf(i)))) {
/* 53 */                    olill0O0OOIO = Olill0O0OOIO.I00ilI0I1;
                        } else if (height <= Ol0ilIo.I00000oIO((Size) i1lO00O00I1.I0000O.get(Integer.valueOf(i)))) {
/* 75 */                    olill0O0OOIO = Olill0O0OOIO.I00l0I0l0lO1;
                        }
                    } else if (oliloO1OOO == OliloO1OOO.I00iOIl) {
/* 91 */                Size size3 = (Size) map.get(Integer.valueOf(i));
/* 93 */                Olill0O0OOIO[] olill0O0OOIOArr = Olio00O.I0001Ioi1lo;
/* 95 */                int length = olill0O0OOIOArr.length;
/* 96 */                int i3 = 0;
                        while (true) {
/* 97 */                    if (i3 >= length) {
                                break;
                            }
/* 99 */                    Olill0O0OOIO olill0O0OOIO2 = olill0O0OOIOArr[i3];
/* 107 */                   if (size.equals(olill0O0OOIO2.I00iiI)) {
/* 109 */                       olill0O0OOIO = olill0O0OOIO2;
                                break;
                            }
/* 111 */                   i3++;
                        }
/* 116 */               if (olill0O0OOIO == Olill0O0OOIO.I00o101lO && size.equals(size3)) {
/* 124 */                   olill0O0OOIO = Olill0O0OOIO.I00lli11;
                        }
                    } else if (height <= Ol0ilIo.I00000oIO(i1lO00O00I1.I00000oIO)) {
/* 135 */               olill0O0OOIO = Olill0O0OOIO.I00iiO;
                    } else if (height <= Ol0ilIo.I00000oIO(i1lO00O00I1.I0000Il00O)) {
/* 146 */               olill0O0OOIO = Olill0O0OOIO.I00ilO0;
                    } else if (height <= Ol0ilIo.I00000oIO(i1lO00O00I1.I0000oI00)) {
/* 157 */               olill0O0OOIO = Olill0O0OOIO.I00ll1;
                    } else {
/* 168 */               Size size4 = (Size) map.get(Integer.valueOf(i));
/* 180 */               Size size5 = (Size) i1lO00O00I1.I000OOo1O.get(Integer.valueOf(i));
/* 182 */               if (size4 != null) {
/* 193 */                   if (height <= size4.getHeight() * size4.getWidth()) {
/* 196 */                       if (i2 != 2) {
/* 198 */                           olill0O0OOIO = Olill0O0OOIO.I00lli11;
                                } else if (size5 != null) {
/* 212 */                           if (height <= size5.getHeight() * size5.getWidth()) {
/* 214 */                               olill0O0OOIO = Olill0O0OOIO.I00o0l1o1o0;
                                    }
                                }
                            }
                        }
                    }
/* 216 */           return I000iOII(olilol, olill0O0OOIO, olOOI001);
                }

                @Override
                public Olo0o1II0 I00000oOI() {
/* 1 */             return Olo0o1II0.I00000oOI;
                }

                @Override
                public boolean I0000Il00O(SSLSocket sSLSocket) {
/* 12 */            return OlOolloIIOl0.I000l1(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
                }

                @Override
                public int I0000O() {
/* 1 */             return 1;
                }

                @Override
                public long I0000oI00() {
/* 1 */             return -1L;
                }

                @Override
                public IIl1oi I0001Ioi1lo() {
/* 1 */             return IIl1oi.I00iOIl;
                }

                @Override
                public PointF I000II(O1liloIo o1liloIo, int i) {
/* 1 */             float f = o1liloIo.I00000oOI;
/* 3 */             float f2 = o1liloIo.I00000oIO;
                    return i == 1 ? new PointF(1.0f - f2, f) : new PointF(f2, f);
                }

                @Override
                public Ol1olOoi I000O01llI0(SSLSocket sSLSocket) {
/* 1 */             Class<?> cls = sSLSocket.getClass();
/* 5 */             Class<?> superclass = cls;
/* 17 */            while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
/* 19 */                superclass = superclass.getSuperclass();
/* 23 */                if (superclass == null) {
/* 28 */                    IoOOl0iOl1io.I001i1lo1io("No OpenSSLSocketImpl superclass of socket of type ", cls);
/* 16 */                    return null;
                        }
                    }
/* 34 */            I1001I i1001i = new I1001I();
/* 37 */            i1001i.I00000oIO = superclass;
/* 51 */            i1001i.I00000oOI = superclass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
/* 65 */            i1001i.I0000Il00O = superclass.getMethod("setHostname", String.class);
/* 73 */            i1001i.I0000O = superclass.getMethod("getAlpnSelectedProtocol", null);
/* 87 */            i1001i.I0000oI00 = superclass.getMethod("setAlpnProtocols", byte[].class);
/* 89 */            VarHandle.storeStoreFence();
/* 186 */           return i1001i;
                }

                @Override
                public IIl1lO0O I000OOo1O() {
/* 1 */             return IIl1lO0O.I00iOIl;
                }

                @Override
                public IIl1lO0oO I000OiO() {
/* 1 */             return IIl1lO0oO.I00iOIl;
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(li1OiO.class, l0lOiO1OiIO1.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(lo0II1.class, lIlliOliii.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(li1iO1OiiO.class, l0lioII101.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(liI0Oi.class, l0o01oIi0.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(li1l0O0Oil.class, l0loO0OIl.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(li1lo0.class, l0o10l10.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(lOO011Io1.class, l00loOiiIi0.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(lOIo0Iioi.class, l00l1i1ilOi.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(lOo1lI1o1io.class, l0i0IoI0.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(lllloOI1il0.class, lIOI1i.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(lOIli1Ol.class, l00iI1Olio.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(lOIil0OIIOl.class, l00OOO.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(lioioo11.class, l1iI0Oi0OIo.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(loIiO0ii1.class, l0IooO00011.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(lOlOliiol.class, l0OO11oo0ili.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(lOl01i0i00.class, l0IllOO1.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(liolilo.class, l1iO0010l0oO.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(lllOio0OO.class, lIIllIi.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(llliioOoII0o.class, lIIoOIOO1lO.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(lllIiiIIoOi.class, lIIiiOOIO0I.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(liIioOloOi1.class, l10IIOiill.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(loIOi1III1.class, ioilI111iO10.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(liIlli0IIoo.class, l10Ilii.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(ll1loiOo.class, l1lOi1.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(llI0lOli0oi.class, l1lo1Ioi.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(ll1ooOloI.class, l1llO0OO1oli.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(ll1oOloiI0.class, l1li1lOO0iI.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(llO1iO.class, lI0101.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(llOI1lOO1oi.class, lI0I1iOIo11l.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(llOOlOlIll.class, lI0i10IiO.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(llOO0iO.class, lI0OI1oOO1.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(liIOo01oO.class, l101Ioo.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(llOilo10oilO.class, lI0lIO.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(llOloI.class, lI0oi0llio1.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(llOoo1OO.class, lI10OO00iiO0.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(lli1lIOo0I0.class, lI11loIiI10.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(lliilO1O1Io.class, lI1l1oOlI00.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(lliiO1O.class, lI1lllilI1l.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(llO1100010.class, l1oOO1.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(lOollIIio1O.class, l0il0I1o10.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(llIoOiI.class, l1ooOlii.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(llIlo1oO0.class, l1oio00I1o0l.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(llO01oI.class, lI00Il.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(llllIi10O.class, lIO0oO0il.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(lo10O0I0ii.class, lIoiI0IllIO1.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lO10o110O.class, iollloil0l0.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lO0liOi.class, iolII11O10o.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lO0iIII0.class, iol1III1OI.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lO0oioOO.class, ioll0IIlOi.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lO1O0oll.class, ioo0oooIII0.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lO1II0.class, ioo010.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lO1OoI1l1.class, ioo1oO1OOOo.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lO1iiI1Oil.class, iooO1IOl.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(OilOIIlI.class, iooiO10lO.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(lO1oOo10.class, ioolii0oiO.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(lOI0IIIo.class, iooloiolilo.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(ilioiI0ll.class, ioi0iii0i.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(ill10o0.class, ioiIioiO11.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(ill0l1oiiO.class, ioi1iIooO1.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(lOoi00O.class, l0iIioiI101.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(lOO101ooiO.class, l0101I0lOi.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(iioiill1I0.class, illIIi0.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(iioOllll1.class, illOiII0oi.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(lOilIl0.class, l0IOlOl.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(iiooO1ll.class, illio1l1iO.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(iiolOOio1.class, illllO11.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(il1OO11i1O1.class, io001I.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(il1Io00o.class, io01Iioo.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(il011100IO0o.class, illoloIl0I.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(il00OIo0O.class, ilo0Ooii10o.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(ilIOOiloO0.class, io10oOl.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(ilIIill.class, io1I1iIIi.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(ilO0Io0l0oo.class, io1lo01Ii.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(ilIoOii1l.class, io1olOo1OI10.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(ililO0OIOo1I.class, ioOloio0loI.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(iliiiIoIoI.class, ioi00iOo01o.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(ilOI0oi0oi1O.class, ioI110O.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(ilO11lo1O.class, ioIIo0l.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(ilOOoio1lI.class, ioIOiO0o.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(ilOO0iO1ool.class, ioIio0oioi.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(lo1oiiI1.class, lIOoOoI1.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(lo11I0O0I.class, l010l0.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(lo1i10iIl.class, l0ooiIliOI1i.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(lo1O0i.class, l0oloOI110l.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(lo11o1l01i.class, l0O100I.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(lo1llOiiO.class, lIOOo0oiiO0O.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(lo1lI1I0ll0.class, lIOO11Oi.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(loI00OO011.class, lIi0O11Ool0.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(lo1III01O1.class, l0i100llloi.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(loIIlOll1olo.class, lIolooo.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(loI1Il.class, lIoool.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(loI0llolIoo.class, lIol0o1Ol1o.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(llo0iIiiil.class, lIiIOi10ol1.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(lOoIiIll01oO.class, l0i1i0loO0I.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(lOooIO1oiI.class, l0iliI0.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lO0O0Ii0ooIl.class, iol01I1I.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(lOliOoIi.class, l0Oi1li.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(lOoil0Io0Io.class, l0iOoI01o0Ii.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(lOio11O.class, l0Iio1.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(IlII00i10OII.class, l01I0II.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(lOOOliiiOOi.class, l01O1I0.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(lOO1li.class, l011I0iiiii.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(lOOio1.class, l01iOO.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(liIIoi1I0i01.class, l0oOloiOloOl.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(liI1O0I1O0.class, l0oIOoI1OIIo.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(iioIOil0oi.class, illI00oIiO1O.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(lo0l00OlI.class, lIo1Iol.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(lo0oil0Ol.class, lIoOiO.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(lo0loO0oIi.class, lIoIIi0ioI1I.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(lO0I0Io.class, ioiOoIiiIoOI.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(lOIOlliO10l.class, l00Ii0OooI.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(lOIIo0i.class, l001OIi1i0ii.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(lOI1lI0.class, l0000oiIoi.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(lio1l1O0i.class, l1OoIoo1Oo0.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(lioi0olooo.class, l1i11O1iI0l1.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(lioOO0l0Iol.class, l1i00l.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(il110i0l.class, ilooIooliO.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(il0ol10l.class, iloolIiOOO.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(ll00o1ll.class, l1iOlo0oi.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(ll1IO0lOO.class, l1l00loIoIi.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(ll0O0O1Il11I.class, l1il0io.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(ll0lioioI.class, l1ioIo.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(ilI0il.class, io0O00Ooo1.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(il1o0o00O0.class, io0i11101.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(lloi00II0O0.class, lIl0iii.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(lloO1l0l.class, lIio0IioI.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(lo0O1I1lO.class, lIloil1OiOo.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(lo0OloO1ilI.class, lIo0IO.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(llI1o11l.class, l1o01011.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(llIiiIl.class, l1oI0o1oIII.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(llIIoO0.class, l1o0lO.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(llIi0OI1Ol.class, l1o1i1oO.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(lOloIoil00.class, l0Oo1oOl.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(ilIlIliilo1i.class, io1Iol1OlOo.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(ilIilolOlIoO.class, io1iOl.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(o0ilOOi0.class, l0Ol1I0.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(lOl0oo.class, l0O1oi.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(ll1OiOIO0.class, l1l0olIIO.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(ll1lOIliOiI.class, l1lIl0lo0.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(ll1iOi.class, l1l1Oo.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(IOol1o01iII.class, io0l1iollO.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(ilI1iII00oO.class, io0loIoIiOi.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(lil01o.class, l1IIlIo0iOi.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(iO11101I.class, l1IiO1.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(lil1l1oIl.class, l1IilO00I.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(il0l111ll00o.class, iloOiII.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(il0iIill1I.class, iloi1I11lOo.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(liiOI1lOOIOO.class, l1I00lilol.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(liiiol01.class, l1I0ol1IIoo.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(liio1lOi0l0.class, l1II0I.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(il0O10I11O0.class, ilo1Il11I.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(il0I0oo0i.class, iloIII.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(lilIO0i.class, l1IllIOo.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(lilOi0Ol010.class, l1Io1Oo.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(lili0lO0i11O.class, l1O01iOOiO.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(lillI0io.class, l1OIlii01.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(il0o1ll11o.class, iloillli.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(il0liO.class, ilolOi1l0l00.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(llo1oO0ollo.class, lIiOiloo1iI.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(llo1I00IoOl.class, lIiilI.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(li001o.class, l0ioO1.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(li0IOIio0l1I.class, l0l1ooIO.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(li01Ooiio01.class, l0l111l0lIi0.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(li0O10l0.class, l0lIil0OoO.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(lliliI.class, lI1ollo.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(llio0OOli.class, lII0lioi.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(ilOoiO0Ii1.class, ioO01l0.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(ilOli1oOI10l.class, ioO1olO0OliI.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(lloil1I.class, lIl1OOi11o.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(lliIlli0I1Oo.class, lI1O0110.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(lliOOIo1o.class, lI1ii0ool10.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(ilOl0o1O.class, ioIlIi1o.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(ilOiOIIii0lO.class, ioIo1oO.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(lloIIo1o.class, lIil1O.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(liiI1I10II.class, l10ilIIIi.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(lii10iIIooio.class, l11loo.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(liOiiIIoIlI.class, l11IOi0I.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(liOi0o110io.class, l111iliIl.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(liOlo010o0.class, l11Oii1iil.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(liOol01l1lIo.class, l11iol.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(liOO110i.class, l110I01i10l0.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(liO0I1oOII.class, l10i0OO10Oi.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(liOI1I0oIO.class, l10ol1Io1I.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(liO11il.class, l10o00.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(lio011oio0.class, l1Oil11I.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(lOi11iI0o00.class, l0I0IiOl01O1.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(liloI11ilO.class, l1OOlIOll.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(lio0looOIII0.class, l1OliOi1.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(lOi0IIOoOl.class, l01oli0o00i.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(lOiIo0.class, l0I1Iol.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(lllolIIi1I1.class, lIi11liIOiiI.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(lll00ioOOo0I.class, lII1lo.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(llooloIO.class, lIliOl1i.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(lll1o0I.class, lIIOlo1I.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(lll0olIi1I.class, lIIO010O1.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(llolOiol1oO.class, lIlI1I000O1.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(iliIOll0.class, ioOi01l0iOO.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(ili0i1I0iII1.class, ioOiiio0IIo.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(llooiio1.class, lIlOiooOlO.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(lOOlo0i1i0.class, l01lo1O1O.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 18 */            return ilIl1O1ii0Oo.I00000oIO((Executor) ((I1ii1o0) iOiOIoiiO0i).I000iOII(new OOiilOlOOI(O0ol1O.class, Executor.class)));
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 16:
/* 11 */                    int iHashCode = hashCode();
/* 17 */                    iOlI1lIi0.I00000oIO(16);
/* 42 */                    return Oi010OO0.I001IO000("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", OOoOl0i.I00000oIO.I00000oOI(String.class).I000oI1ioi(), ">");
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 123 */                   List list = iol1II1ii1i.I00000oIO;
/* 127 */                   iI1lO0li.I00iiI.get();
/* 153 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
                        case PoseLandmark.LEFT_THUMB:
/* 96 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 100 */                   iI1lO0li.I00iiI.get();
/* 120 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 70 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 74 */                    iI1lO0li.I00iiI.get();
/* 93 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
                        case PoseLandmark.LEFT_HIP:
/* 44 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 48 */                    iI1lO0li.I00iiI.get();
/* 67 */                    return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.rb.attribution.uri_scheme", 60, "https").get();
                        case PoseLandmark.RIGHT_HIP:
/* 25 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 41 */                    return (Boolean) iIIi01I0Ii.I0000Il00O.get();
                        default:
/* 6 */                     List list6 = iol1II1ii1i.I00000oIO;
/* 22 */                    return (Boolean) iIOOO1II.I00000oOI.get();
                    }
                }

                @Override
/* 48 */        public Object I0010I0i(Ii01i1 ii01i1) throws Ii01i1 {
/* 49 */            throw ii01i1;
                }

                @Override
/* 158 */       public iOiI1oOo1l zza() {
/* 159 */           return iOiI1oOo1l.I0000Il00O(6, null, "AICore service disconnected");
                }
            }
