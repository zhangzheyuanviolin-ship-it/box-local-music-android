            package p000;

            import android.content.ComponentName;
            import android.graphics.Typeface;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function3;
            
/* 12 */    public final class O1oO0lOoI1 implements IOIoiiol, IOllol1io, Illill0o, Ii00l0i1loO, Ii0OIl1OO, i0Ii0I1ll, OoI0o0oiol0l, illlllioii1, iiIi1oo0Io, lIi1Illloi, lo11I0lO {
                public static final O1oO0lOoI1 I00iiI = new O1oO0lOoI1(1);
                public static final O1oO0lOoI1 I00iiO = new O1oO0lOoI1(2);
                public static final O1oO0lOoI1 I00iio = new O1oO0lOoI1(3);
                public static final O1oO0lOoI1 I00ilI0I1 = new O1oO0lOoI1(4);
                public static final O1oO0lOoI1 I00ilO0 = new O1oO0lOoI1(5);
                public static final O1oO0lOoI1 I00io1l = new O1oO0lOoI1(6);
                public static final O1oO0lOoI1 I00ioIO = new O1oO0lOoI1(8);
                public static final O1oO0lOoI1 I00l0I0l0lO1 = new O1oO0lOoI1(19);
                public static final O1oO0lOoI1 I00l0OO0IO = new O1oO0lOoI1(21);
                public static final O1oO0lOoI1 I00li1OI = new O1oO0lOoI1(22);
                public static final O1oO0lOoI1 I00ll1 = new O1oO0lOoI1(23);
                public static final O1oO0lOoI1 I00lli11 = new O1oO0lOoI1(24);
                public static final O1oO0lOoI1 I00lll10 = new O1oO0lOoI1(25);
                public static final O1oO0lOoI1 I00o0iI0io1 = new O1oO0lOoI1(26);
                public static final O1oO0lOoI1 I00o0l1o1o0 = new O1oO0lOoI1(27);
                public final int I00iOIl;

                public O1oO0lOoI1() {
/* 3 */             this.I00iOIl = 9;
/* 10 */            new ConcurrentHashMap();
                }

                public static Typeface I0000O(String str, IlilIIiIiO ililIIiIiO, int i) {
/* 1 */             if (i == 0 && O0000Ioio00.I0000O(ililIIiIiO, IlilIIiIiO.I00ioIO) && (str == null || str.length() == 0)) {
/* 19 */                return Typeface.DEFAULT;
                    }
/* 22 */            if (i == 0 && O0000Ioio00.I0000O(ililIIiIiO, IlilIIiIiO.I00li1OI) && (str == null || str.length() == 0)) {
/* 40 */                return Typeface.DEFAULT_BOLD;
                    }
/* 59 */            return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ililIIiIiO.I00iOIl, i == 1);
                }

                public static OlI1o0ooI I0000oI00(IIiIoIl11IO iIiIoIl11IO) {
/* 3 */             while (iIiIoIl11IO instanceof IIiO00o1o) {
/* 6 */                 IIiO00o1o iIiO00o1o = (IIiO00o1o) iIiIoIl11IO;
/* 13 */                if (iIiO00o1o.I000oI1ioi() != 2) {
                            break;
                        }
/* 26 */                iIiIoIl11IO = (IIiO00o1o) IOOi0Ool1i.I00Oio(iIiO00o1o.I000o00OoI0I());
/* 28 */                if (iIiIoIl11IO == null) {
/* 31 */                    return null;
                        }
                    }
/* 33 */            return iIiIoIl11IO.I0010I0i();
                }

                public static iI1O01I1 I0001Ioi1lo(Object obj) {
/* 1 */             i1oi01OllI i1oi01olli = (i1oi01OllI) obj;
/* 3 */             iI1O01I1 ii1o01i1 = i1oi01olli.zzc;
/* 7 */             if (ii1o01i1 != iI1O01I1.I0001Ioi1lo) {
/* 29 */                return ii1o01i1;
                    }
/* 9 */             iI1O01I1 ii1o01i1I00000oIO = iI1O01I1.I00000oIO();
/* 13 */            i1oi01olli.zzc = ii1o01i1I00000oIO;
/* 29 */            return ii1o01i1I00000oIO;
                }

                public static boolean I000II(int i, IOOOi1 iOOOi1, Object obj) throws iI00lI {
/* 3 */             IOOOIO1O ioooio1o = (IOOOIO1O) iOOOi1.I0000oI00;
/* 5 */             int i2 = iOOOi1.I00000oOI;
/* 7 */             int i3 = i2 >>> 3;
/* 9 */             int i4 = i2 & 7;
/* 14 */            if (i4 == 0) {
/* 151 */               iOOOi1.I011lIilI0lo(0);
/* 166 */               ((iI1O01I1) obj).I0000O(i3 << 3, Long.valueOf(ioooio1o.I00O0o1oo()));
/* 12 */                return true;
                    }
/* 16 */            if (i4 == 1) {
/* 131 */               iOOOi1.I011lIilI0lo(1);
/* 147 */               ((iI1O01I1) obj).I0000O((i3 << 3) | 1, Long.valueOf(ioooio1o.I00OI1()));
/* 12 */                return true;
                    }
/* 19 */            if (i4 == 2) {
/* 127 */               ((iI1O01I1) obj).I0000O((i3 << 3) | 2, iOOOi1.I01OIo());
/* 12 */                return true;
                    }
/* 23 */            if (i4 != 3) {
/* 26 */                if (i4 == 4) {
/* 55 */                    if (i != 0) {
/* 11 */                        return false;
                            }
/* 58 */                    iilo0lOo110.I000II("Protocol message end-group tag did not match expected tag.");
/* 11 */                    return false;
                        }
/* 29 */                if (i4 != 5) {
/* 51 */                    OoOil11Ol1o.I00100l0();
/* 11 */                    return false;
                        }
/* 31 */                iOOOi1.I011lIilI0lo(5);
/* 47 */                ((iI1O01I1) obj).I0000O(5 | (i3 << 3), Integer.valueOf(ioooio1o.I00OIO1()));
/* 12 */                return true;
                    }
/* 62 */            iI1O01I1 ii1o01i1I00000oIO = iI1O01I1.I00000oIO();
/* 66 */            int i5 = i3 << 3;
/* 68 */            int i6 = i + 1;
/* 71 */            if (i6 >= 100) {
/* 114 */               iilo0lOo110.I000II("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
/* 11 */                return false;
                    }
/* 80 */            while (iOOOi1.I01IoO() != Integer.MAX_VALUE && I000II(i6, iOOOi1, ii1o01i1I00000oIO)) {
                    }
/* 92 */            if ((i5 | 4) != iOOOi1.I00000oOI) {
/* 108 */               iilo0lOo110.I000II("Protocol message end-group tag did not match expected tag.");
/* 11 */                return false;
                    }
/* 96 */            if (ii1o01i1I00000oIO.I0000oI00) {
/* 98 */                ii1o01i1I00000oIO.I0000oI00 = false;
                    }
/* 104 */           ((iI1O01I1) obj).I0000O(i5 | 3, ii1o01i1I00000oIO);
/* 12 */            return true;
                }

                public boolean I00000oIO(Ii1Ool1 ii1Ool1, Ii1Ool1 ii1Ool12, boolean z) {
/* 3 */             if ((ii1Ool1 instanceof OI000ilOol) && (ii1Ool12 instanceof OI000ilOol)) {
/* 21 */                return O0000Ioio00.I0000O(((OI000ilOol) ii1Ool1).I000OOo1O(), ((OI000ilOol) ii1Ool12).I000OOo1O());
                    }
/* 28 */            if ((ii1Ool1 instanceof OoOOiO) && (ii1Ool12 instanceof OoOOiO)) {
/* 40 */                return I00000oOI((OoOOiO) ii1Ool1, (OoOOiO) ii1Ool12, z, I00ilI0I1.I00iio);
                    }
/* 47 */            if (!(ii1Ool1 instanceof IIiIoIl11IO) || !(ii1Ool12 instanceof IIiIoIl11IO)) {
                        return ((ii1Ool1 instanceof OIo0il) && (ii1Ool12 instanceof OIo0il)) ? O0000Ioio00.I0000O(((OIo0l0) ((OIo0il) ii1Ool1)).I00ilI0I1, ((OIo0l0) ((OIo0il) ii1Ool12)).I00ilI0I1) : O0000Ioio00.I0000O(ii1Ool1, ii1Ool12);
                    }
/* 53 */            IIiIoIl11IO iIiIoIl11IO = (IIiIoIl11IO) ii1Ool1;
/* 55 */            IIiIoIl11IO iIiIoIl11IO2 = (IIiIoIl11IO) ii1Ool12;
/* 61 */            int i = 1;
/* 62 */            if (!iIiIoIl11IO.equals(iIiIoIl11IO2)) {
/* 79 */                if (O0000Ioio00.I0000O(iIiIoIl11IO.getName(), iIiIoIl11IO2.getName()) && ((!(iIiIoIl11IO instanceof O1ii1i111o0) || !(iIiIoIl11IO2 instanceof O1ii1i111o0) || ((O1ii1i111o0) iIiIoIl11IO).I00IO1() == ((O1ii1i111o0) iIiIoIl11IO2).I00IO1()) && ((!O0000Ioio00.I0000O(iIiIoIl11IO.I000lI(), iIiIoIl11IO2.I000lI()) || (z && O0000Ioio00.I0000O(I0000oI00(iIiIoIl11IO), I0000oI00(iIiIoIl11IO2)))) && !IiOiIO0i1Oil.I000lI(iIiIoIl11IO) && !IiOiIO0i1Oil.I000lI(iIiIoIl11IO2)))) {
/* 154 */                   Ii1Ool1 ii1Ool1I000lI = iIiIoIl11IO.I000lI();
/* 158 */                   Ii1Ool1 ii1Ool1I000lI2 = iIiIoIl11IO2.I000lI();
/* 177 */                   if (((ii1Ool1I000lI instanceof IIiO00o1o) || (ii1Ool1I000lI2 instanceof IIiO00o1o)) ? false : I00000oIO(ii1Ool1I000lI, ii1Ool1I000lI2, z)) {
/* 182 */                       I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(i);
/* 185 */                       i0oO0iO1l0lo.I00iiI = z;
/* 187 */                       i0oO0iO1l0lo.I00iiO = iIiIoIl11IO;
/* 189 */                       i0oO0iO1l0lo.I00iio = iIiIoIl11IO2;
/* 191 */                       VarHandle.storeStoreFence();
/* 196 */                       OIlIlOllioi oIlIlOllioi = new OIlIlOllioi(i0oO0iO1l0lo);
/* 208 */                       if (oIlIlOllioi.I000lI(iIiIoIl11IO, iIiIoIl11IO2, null, true).I00000oOI() != 1 || oIlIlOllioi.I000lI(iIiIoIl11IO2, iIiIoIl11IO, null, true).I00000oOI() != 1) {
                                }
                            }
                        }
/* 78 */                return false;
                    }
/* 61 */            return true;
                }

                public boolean I00000oOI(OoOOiO ooOOiO, OoOOiO ooOOiO2, boolean z, IlliIl1l11O illiIl1l11O) {
/* 5 */             if (ooOOiO.equals(ooOOiO2)) {
/* 68 */                return true;
                    }
/* 20 */            if (O0000Ioio00.I0000O(ooOOiO.I000lI(), ooOOiO2.I000lI())) {
/* 70 */                return false;
                    }
/* 23 */            Ii1Ool1 ii1Ool1I000lI = ooOOiO.I000lI();
/* 27 */            Ii1Ool1 ii1Ool1I000lI2 = ooOOiO2.I000lI();
                    return (((ii1Ool1I000lI instanceof IIiO00o1o) || (ii1Ool1I000lI2 instanceof IIiO00o1o)) ? ((Boolean) illiIl1l11O.invoke(ii1Ool1I000lI, ii1Ool1I000lI2)).booleanValue() : I00000oIO(ii1Ool1I000lI, ii1Ool1I000lI2, z)) && ooOOiO.getIndex() == ooOOiO2.getIndex();
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             i0Iio1OiI i0iio1oii = new i0Iio1OiI();
/* 11 */            i0iio1oii.I00000oIO = new HashSet();
/* 22 */            i0iio1oii.I00000oOI = new Handler(Looper.getMainLooper());
/* 24 */            VarHandle.storeStoreFence();
/* 55 */            return i0iio1oii;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 1:
/* 30 */                    I0OOO1l0IoO i0OOO1l0IoO = new I0OOO1l0IoO("AfterRender", 3);
/* 33 */                    IoO0l0Iiioll ioO0l0Iiioll = ioIlI1oli.I00iio;
/* 35 */                    ioO0l0Iiioll.I0001Ioi1lo(i0OOO1l0IoO);
/* 44 */                    ioO0l0Iiioll.I000II(i0OOO1l0IoO, new I0i11IIo((Function3) oll0io, iOoil1iiIilo, 0));
                            break;
                        default:
/* 19 */                    ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000lI, new I0i1Il((Function3) oll0io, iOoil1iiIilo, 1));
                            break;
                    }
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 12:
                            break;
                        case PoseLandmark.RIGHT_PINKY:
                            break;
                        case PoseLandmark.LEFT_INDEX:
                            break;
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(loo1OOo1O.class, lOli0io.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(o10iloO1l1.class, lloI1OlIl1.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(looI00l10O.class, lOlil01iO0.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(looOIlI1i1.class, lOlooiOIIi.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(looII10lI0Ii.class, lOlllOiOl0oO.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(looIl1lOO.class, lOo0Oo.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(loIiOo1O.class, lO0il1.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(loIi1llIOIoi.class, lO0OII01l.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(loioo1OIO.class, lOi1iOoOi1.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(o0ioi000IO01.class, llIO0ooIIo.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(loIO1l.class, lO0IOo.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(loI1l11O01.class, lO01I01OO1Io.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(o01o0oO1.class, lii01ll.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(o11lI0IO0l.class, lOO1I0O1.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(loiiiO1Io.class, lOOi1oi.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(loiIlioOO.class, lOO0l01.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(o01olo10i.class, lii1Oo1I01.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(o0iiiOlol.class, llI0110I1lOO.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(o0il1l01I.class, llI100i.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(o0ii1llIiooi.class, ll1oioo.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(lool0OO.class, lOoloIoo.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(o11iiI0lO.class, lIiol0lOo1lo.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(loolI0Iil.class, li000lli.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(o0IlIIo0Ool.class, lilIl1o1.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(o0IoI011.class, lillOOl.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(o0Iloo0O0i0.class, lili1O0O.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(o0IlllOo0O0O.class, lilOliO.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(o0OOiI.class, liooO1io0.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(o0Oi10ilI.class, ll001iI01Io.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(o0OiOOl.class, ll01o01.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(o0OiI00oIolO.class, ll011000iO.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(looiOl000o0i.class, lOol0IlOiiO0.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(o0Ol0lOi1.class, ll0Ii11lOi1i.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(o0OlIl0.class, ll0Oi010Iii1.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(o0OlilO0i1I.class, ll0iOi1li.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(o0Oloio00.class, ll0l1Ii0io.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(o0i1IIl.class, ll11000101.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(o0i0Ol00OoI.class, ll11i1I0i.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(o0OOO0IiOIl.class, lioOll0olI0o.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(lolIill11o0O.class, lOioO1OI1iI1.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(o0OIIlI.class, liol10loIiI.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(o0O1oli1IIl.class, lioiII0OIIo.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(o0OIi10O0ii.class, lioo0Ilo.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(o0illOi.class, llIIIOo.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(o110IlOlI1I.class, llooOiI010.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lo110oOilo.class, lIll01oil.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lo0o11OlO1.class, lIlIO0lIo0oo.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lo0lIilo11ll.class, lIl1ilolO.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lo100IoI.class, lIli0IIi1.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lo1I10l0.class, lIlolo110l1O.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lo11Io.class, lIlloo0ilIIO.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lo1IOIl01.class, lIo0il.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lo1OO10.class, lIo1i0lI0IOi.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(lo1iioI1lloO.class, lIoIioO1Oi.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(lo1lIloIolo.class, lIoOll01I.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(lo1o11l0l0.class, lIoiO0OOOOo.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(l1ioio01OI.class, lIiO10i1O.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(l1l101i10io.class, lIiio1i.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(l1l0I1OIOIO1.class, lIiOolo.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(lol1101Oil1.class, lOiiIi1IOOi.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(loIll1I1Io10.class, lO0loo.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(l0o0Oioio1ol.class, l1lO001.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(l0loi0lIII1O.class, l1lOo10o10.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(loi1OoOIOoI.class, lOIlllO10O.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(l0oIlolO.class, l1lilII.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(l0o1I0.class, l1llioIloOo.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(l11I11lO.class, lI0IIiOl.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(l110i1iI.class, lI0OOllli1.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(l0oo01.class, l1loi0lo1i1o.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(l0oi0lOi11i.class, l1o0I10o.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(l1I11i.class, lI1I0o0l.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(l1I0IIOiI.class, lI1Oii.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(l1IilolO1Io.class, lI1o0OO0.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(l1IiOO0Ii1ll.class, lII0001Oi1ii.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(l1iO1oo0Ilo.class, lIOi0IO0I0I.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(l1iIIII1.class, lIOoii100oIO.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(l1Ioi1I0.class, lII10iiOio.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(l1Ilol11.class, lIII0l.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(l1OO11li.class, lIIO0O1i.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(l1O0OOOl1.class, lIIi0o0.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(o11O11IlOloO.class, llIo0lIO.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(o110oil.class, lO100O1i.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(o11I1ilOIOo.class, lOoi1io.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(o111loI11.class, lOoIo0.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(o11110.class, lOOI1iloO0I.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(o11Ili.class, llIioilOO.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(o11IO10.class, llIiI1.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(o11OIl0.class, llIooIoO.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(o111OOll1ll.class, lOiOO01O.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(o11iOooii.class, lo010ioII.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(o11i1llilo.class, lo01l1o.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(o11i0l.class, lo000li11l.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(o0l1IIo0OlI.class, llO11l.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(lol0iIiIO00o.class, lOiOo0.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(lolOIo0III01.class, lOl0OO0I.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lo0i10l.class, lIl0lioOl0Il.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(loil1001.class, lOOlO0.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(lol1l10OoOI.class, lOili11I1OI1.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(loiI1loO.class, lOIoIOIlI.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(loO0i0Iil.class, lO1Ii0O0IIo0.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(loO1oil.class, lO1O1lOolO.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(loIoOl00.class, lO11I0O.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(loOIo1oi1O10.class, lO1i0IlO.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(o01IOOoiil.class, liO0i1Il0iO.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(l1ilIiI0.class, lIi1lIOoooi1.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(l1iOoIO.class, lIi0i0oiO1l.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(looi0IoO.class, lOoI10i0o0O.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(looOOlI.class, lOo11l.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(l0ll1oll.class, l1lI0Io0l0I.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(o10o1Iii10.class, lloi10i0.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(o10olliiO.class, llolll101l.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(o10oiOO011i.class, llol00l00Ioi.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(lo0OII1i0Io.class, lIililI.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(loI100.class, lO00Ii0.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(loI0OI.class, lIooIoOi00i.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(lo1ooIO.class, lIol11.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(o01iii0lI.class, liOiO1l.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(o01lO1.class, liOo1o1l000i.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(o01l10I0o0O.class, liOill0I0o1.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(l10olIi00O0.class, lI00l0Io.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(l10oIiO1Il.class, lI01O1.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(o0I01l.class, liiIOI0.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(o0I1ooiOlil.class, liiolI1IiOl0.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(o0I0OIO.class, liiOOoo.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(o0I1O0O1ii.class, liil1o1Oi.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(l11OliiO.class, lI0ilI11OiiI.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(l11O00IiOiOi.class, lI0li0O1ioo1.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(o10Il1loo1I.class, lllll01Il11.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(o10II1Io0.class, lllill00I.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(o10l10.class, lloIo0010O.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(o10lI00lloiO.class, lloOiiOO.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(o0Ioo1oi.class, liloOilliIi.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(o0O1iO.class, lio1oll0o00i.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(o0O0OiOIlooO.class, lio0Ol1.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(o0O10lilIl00.class, lio111o0lo.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(loioIiOO.class, lOi0iolIII.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(l1IO1o0l0.class, lI1io0Oo.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(l1II0ol.class, lI1lIooil010.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(loillilO1oo.class, lOOo01io0O11.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(loii0oooiO.class, lOOO1iIO1oI.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(o0IIil.class, lil0Iio1l.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(o0IOo11oio01.class, lil1o1oI.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(o0IO1011I.class, lil1I0OiIiOl.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(l11oIO.class, lI0ollI.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(l11l1IooiIo1.class, lI10lio1.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(o01011I.class, liI0iiII.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(o010l0ii0O.class, liI1o01000lO.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(o0110I1i1.class, liIO100ooo.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(l10OI0.class, l1oII1o1.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(l10IOllII.class, l1oOlO0II0I.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(o00lli.class, li1il1il.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(o00oIlIo1Ol.class, li1lOl.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(o00oll0.class, li1o1iIi.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(l101lII0l1ol.class, l1o10O.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(l1000111l0.class, l1o1l1IoiIIo.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(o011IO.class, liIiOOo11.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(o01I0i0Iii0.class, liIl0lOl1i.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(o01I1I1o.class, liIoIi0.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(l10l01oOoii.class, l1ol0O10iOo.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(l10i1O1Ioll.class, l1ooli1.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(o1011IiO1O.class, lllI1iiilOIl.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(o100Io.class, lllIoIl.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(lolOo11i00ol.class, lOl11Il11O.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(lollOllii.class, lOlIiiIO0i.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(loli1I.class, lOl1lO1oio.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(lollo0O10O1.class, lOlOOIlOIOi.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(o0i1l0o0ol.class, ll1Ill0.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(o0iI1o001.class, ll1Oll01II.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(l1OoiIl.class, lIIooOI1IO.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(l1OloIOiO01.class, lIO1O001lOio.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(o10OIoI11lo.class, lllo1O00O0.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(o0OoIO1.class, ll0loi1OlIOI.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(o0i00ooiOo00.class, ll1010i10l.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(l1Ol0I11101.class, lIIioiOO.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(l1OOoi.class, lIIo00Iol1I.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(o101lI.class, lllOolO.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(o00l1i0I0o.class, li01oOiO.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(o00IoiiI.class, li1Oo0i.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(o00110liloOl.class, li10ioiOO.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(o000ilIo.class, li0oOI0olo.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(o00I0IO.class, li1I10o.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(o00I1l1.class, li1Il1.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(o000IIi.class, li0liIO0IIio.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(loolllIIil1.class, li00iOIl1OO.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(loool1101.class, li0OOl.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(looo1oII.class, li0Il0.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(o01OlO.class, liOIO0OOI01.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(loi0ilOo.class, lOIi0IoOilil.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(o01O0oOo.class, liO1ii1llo1.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(o01i1Oll.class, liOOOollOo.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(loi01Io01.class, lOIO1l0oiiI.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(loi110Io1Iii.class, lOIl1oo.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(o0l0oO1oO.class, llO0Il0.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(o0iO0Ii1oo.class, ll1l00o.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(o10i01O.class, llo1OlI.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(o0ii0oi1.class, ll1o0O1l0.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(o0iOii1oIIi.class, ll1ll0111l.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(o10Ol0O10.class, llo00101lOii.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(l1i1IolIOl11.class, lIOIOi.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(l1i0Io1.class, lIOOOIlIOIOI.I00000oIO);
/* 1405 */          il0IIIOll.registerEncoder(o10Olli100ii.class, llo0lOi.I00000oIO);
/* 1412 */          il0IIIOll.registerEncoder(loOol0OOOIl1.class, lOII0O1.I00000oIO);
/* 1419 */          il0IIIOll.registerEncoder(loOo1I.class, lOI0ioOi.I00000oIO);
/* 1426 */          il0IIIOll.registerEncoder(loOlI1o10oOl.class, lO1ooOlol.I00000oIO);
/* 1433 */          il0IIIOll.registerEncoder(loOiOiiOIl.class, lO1l1li1O0.I00000oIO);
/* 1440 */          il0IIIOll.registerEncoder(loOOiIii.class, lO1o01li1.I00000oIO);
/* 1447 */          il0IIIOll.registerEncoder(o0oiol1.class, lll01ii.I00000oIO);
/* 1454 */          il0IIIOll.registerEncoder(o0oolIi0l01.class, lll1IIl0I.I00000oIO);
/* 1461 */          il0IIIOll.registerEncoder(o0lio1i1I.class, llOiOo0.I00000oIO);
/* 1468 */          il0IIIOll.registerEncoder(o0loi1.class, lliI00.I00000oIO);
/* 1475 */          il0IIIOll.registerEncoder(o0ll1lOI.class, llOl1I1I1.I00000oIO);
/* 1482 */          il0IIIOll.registerEncoder(o0o0o1i0o.class, llil0O0l.I00000oIO);
/* 1489 */          il0IIIOll.registerEncoder(o0loll00.class, lliO0101il.I00000oIO);
/* 1496 */          il0IIIOll.registerEncoder(o0oi101lOlo.class, llio1oOIOI1i.I00000oIO);
/* 1503 */          il0IIIOll.registerEncoder(o0oIlOl11.class, llilllIoIl1O.I00000oIO);
/* 1510 */          il0IIIOll.registerEncoder(o0lo1OOiIo.class, lli0IIOI01O.I00000oIO);
/* 1517 */          il0IIIOll.registerEncoder(o0lloiI01011.class, llOo0oli1I0.I00000oIO);
/* 1524 */          il0IIIOll.registerEncoder(o0o0Ooi1IoI.class, lliiili.I00000oIO);
/* 1531 */          il0IIIOll.registerEncoder(o0o0IIi.class, lliOl1Ii1lIi.I00000oIO);
/* 1538 */          il0IIIOll.registerEncoder(o0lIi0lOo10o.class, llOO1Oiiii1.I00000oIO);
/* 1545 */          il0IIIOll.registerEncoder(o0lIO1o.class, iIOo0oiIi1.I000oI1ioi);
/* 1552 */          il0IIIOll.registerEncoder(o0l1li0IIi.class, iIOo0oiIi1.I000o00OoI0I);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 15:
/* 11 */                    int iHashCode = hashCode();
/* 17 */                    iOlI1lIi0.I00000oIO(16);
/* 42 */                    return Oi010OO0.I001IO000("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", OOoOl0i.I00000oIO.I00000oOI(Bundle.class).I000oI1ioi(), ">");
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 128 */                   List list = iol1II1ii1i.I00000oIO;
/* 132 */                   iI1lO0li.I00iiI.get();
/* 152 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 101 */                   List list2 = iol1II1ii1i.I00000oIO;
/* 105 */                   iI1lO0li.I00iiI.get();
/* 125 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
                        case PoseLandmark.LEFT_HIP:
/* 66 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 70 */                    iI1lO0li.I00iiI.get();
/* 96 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(21, 50L, "measurement.experiment.max_ids").get()).longValue());
                        case PoseLandmark.RIGHT_HIP:
/* 31 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 35 */                    iI1lO0li.I00iiI.get();
/* 61 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
                        case PoseLandmark.LEFT_KNEE:
/* 12 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 28 */                    return (Boolean) iIOiil1011I.I00000oIO.get();
                        default:
/* 8 */                     return new ArrayList();
                    }
                }

/* 13 */        public O1oO0lOoI1(int i) {
/* 14 */            this.I00iOIl = i;
                }

                @Override
/* 154 */       public iOiIOO1ll zza() {
/* 155 */           return iOiIOO1ll.I0000Il00O(6, null, "AICore service disconnected");
                }

                @Override
/* 155 */       public ilIoOl zza() {
                    ComponentName componentName = l00Iil.I00ll1;
/* 156 */           return ilIoOl.I00000oIO(6, null, "AICore service disconnected");
                }
            }
