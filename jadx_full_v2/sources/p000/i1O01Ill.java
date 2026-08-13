            package p000;

            import android.content.Context;
            import android.graphics.PointF;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function3;
            
/* 7 */     public final class i1O01Ill implements IOIoiiol, Ii100OlIo10, O1ll0I0i0OO, IOllol1io, IOoOOI1ii, i0Iilo0, IOiOiIIiii1, iiIi1oo0Io, lo11I0lO, OoI0o0oiol0l {
                public static i1O01Ill I00iiI;
                public static final i1O01Ill I00iiO = new i1O01Ill(1);
                public static final i1O01Ill I00iio = new i1O01Ill(2);
                public static final i1O01Ill I00ilI0I1 = new i1O01Ill(3);
                public static final i1O01Ill I00ilO0 = new i1O01Ill(4);
                public static final i1O01Ill I00io1l = new i1O01Ill(5);
                public static final i1O01Ill I00ioIO = new i1O01Ill(6);
                public static final i1O01Ill I00l0I0l0lO1 = new i1O01Ill(7);
                public static final i1O01Ill I00l0OO0IO = new i1O01Ill(8);
                public static final i1O01Ill I00li1OI = new i1O01Ill(20);
                public static final i1O01Ill I00ll1 = new i1O01Ill(21);
                public static final i1O01Ill I00lli11 = new i1O01Ill(22);
                public static final i1O01Ill I00lll10 = new i1O01Ill(23);
                public static final i1O01Ill I00o0iI0io1 = new i1O01Ill(24);
                public static final i1O01Ill I00o0l1o1o0 = new i1O01Ill(25);
                public static final i1O01Ill I00o101lO = new i1O01Ill(27);
                public final int I00iOIl;

                public i1O01Ill(int i, int i2) {
/* 3 */             this.I00iOIl = 13;
                }

                public static synchronized void I000OOo1O() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new i1O01Ill(0);
                    }
                }

                public static boolean I000OiO(byte[] bArr, int i, int i2) {
                    int iI00000oIO;
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 11 */            if (i >= i2) {
/* 13 */                iI00000oIO = 0;
                    } else {
/* 16 */                while (i < i2) {
/* 19 */                    int i3 = i + 1;
/* 21 */                    iI00000oIO = bArr[i];
/* 23 */                    if (iI00000oIO < 0) {
/* 30 */                        if (iI00000oIO >= -32) {
/* 49 */                            if (iI00000oIO >= -16) {
/* 87 */                                if (i3 < i2 - 2) {
/* 94 */                                    int i4 = i + 2;
/* 96 */                                    int i5 = bArr[i3];
/* 98 */                                    if (i5 <= -65) {
/* 107 */                                       if ((((i5 + 112) + (iI00000oIO << 28)) >> 30) == 0) {
/* 109 */                                           int i6 = i + 3;
/* 113 */                                           if (bArr[i4] <= 65471) {
/* 115 */                                               i += 4;
/* 119 */                                               if (bArr[i6] > 65471) {
                                                        }
                                                    }
                                                }
                                            }
/* 45 */                                    iI00000oIO = -1;
                                            break;
                                        }
/* 89 */                                iI00000oIO = l011IIO.I00000oIO(bArr, i3, i2);
                                        break;
                                    }
/* 53 */                            if (i3 < i2 - 1) {
/* 60 */                                int i7 = i + 2;
/* 62 */                                char c = bArr[i3];
/* 64 */                                if (c <= 65471 && ((iI00000oIO != -32 || c >= 65440) && (iI00000oIO != -19 || c < 65440))) {
/* 78 */                                    i += 3;
/* 82 */                                    if (bArr[i7] > 65471) {
                                            }
                                        }
/* 45 */                                iI00000oIO = -1;
                                        break;
                                    }
/* 55 */                            iI00000oIO = l011IIO.I00000oIO(bArr, i3, i2);
                                    break;
                                }
/* 32 */                        if (i3 >= i2) {
                                    break;
                                }
/* 37 */                        if (iI00000oIO >= -62) {
/* 39 */                            i += 2;
/* 43 */                            if (bArr[i3] > 65471) {
                                    }
                                }
/* 45 */                        iI00000oIO = -1;
                                break;
                            }
/* 127 */                   i = i3;
                        }
/* 13 */                iI00000oIO = 0;
                    }
                    return iI00000oIO == 0;
                }

                public void I00000oIO(I11IlOOO i11IlOOO, I11IlOOO i11IlOOO2) {
/* 3 */             HashSet hashSet = new HashSet();
/* 6 */             Iterator it = i11IlOOO.iterator();
/* 14 */            while (it.hasNext()) {
/* 26 */                hashSet.add(((I111oOiIiO0) it.next()).I0010o());
                    }
/* 30 */            Iterator it2 = i11IlOOO2.iterator();
/* 38 */            while (it2.hasNext()) {
/* 50 */                hashSet.contains(((I111oOiIiO0) it2.next()).I0010o());
                    }
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 36 */            float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
/* 54 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
/* 55 */            int i = OiO101lO.I00000oIO;
/* 106 */           return jFloatToRawIntBits;
                }

                public Ol0O0iI0l0O I0000O(iOliil ioliil, OoOI1i1i ooOI1i1i, boolean z, int i, boolean z2) {
                    I11IlOOO i11IlOOO;
                    OoOI1i1i ooOI1i1iI00ll1;
/* 11 */            Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 15 */            IiOoI0oI iiOoI0oI = (IiOoI0oI) ioliil.I00iiO;
/* 27 */            OoOi1Ol ooOi1OlI0000oI00 = I0000oI00(new OlIo1I(iiOoI0oI.I010l10O(), ooo0Ioii0o0), ioliil, null, i);
/* 35 */            Ol0O0iI0l0O ol0O0iI0l0OI00000oIO = lOoil0Io0Io.I00000oIO(ooOi1OlI0000oI00.I00000oOI());
/* 43 */            if (l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI00000oIO)) {
/* 45 */                return ol0O0iI0l0OI00000oIO;
                    }
/* 46 */            ooOi1OlI0000oI00.I00000oIO();
/* 49 */            I11IlOOO annotations = ol0O0iI0l0OI00000oIO.getAnnotations();
/* 53 */            IIi0oIl iIi0oIl = I11O0o0loi.I00000oOI;
/* 58 */            O0O00I1Ili o0O00I1Ili = I11O0o0loi.I00000oIO[0];
/* 64 */            I11O0Ol i11O0Ol = (I11O0Ol) iIi0oIl.I000O01llI0(ooOI1i1i);
/* 66 */            if (i11O0Ol == null || (i11IlOOO = i11O0Ol.I00000oIO) == null) {
/* 72 */                i11IlOOO = i1i0olI.I00iiO;
                    }
/* 74 */            I00000oIO(annotations, i11IlOOO);
/* 81 */            if (!l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI00000oIO)) {
/* 90 */                if (l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI00000oIO)) {
/* 92 */                    ooOI1i1iI00ll1 = ol0O0iI0l0OI00000oIO.I00OloOo();
                        } else {
/* 98 */                    OoOI1i1i ooOI1i1iI00OloOo = ol0O0iI0l0OI00000oIO.I00OloOo();
/* 102 */                   IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 108 */                   if (ooOI1i1i.isEmpty() && ooOI1i1iI00OloOo.isEmpty()) {
/* 116 */                       ooOI1i1iI00ll1 = ooOI1i1i;
                            } else {
/* 121 */                       ArrayList arrayList = new ArrayList();
/* 132 */                       Iterator it = ((ConcurrentHashMap) iIlio101Io.I00iiI).values().iterator();
/* 140 */                       while (it.hasNext()) {
/* 148 */                           int iIntValue = ((Number) it.next()).intValue();
/* 158 */                           I11O0Ol i11O0Ol2 = (I11O0Ol) ooOI1i1i.I00iOIl.get(iIntValue);
/* 166 */                           I11O0Ol i11O0Ol3 = (I11O0Ol) ooOI1i1iI00OloOo.I00iOIl.get(iIntValue);
/* 169 */                           if (i11O0Ol2 != null) {
/* 216 */                               if (i11O0Ol3 != null) {
/* 221 */                                   I11IlOOO i11Io0oil0i0 = i11O0Ol2.I00000oIO;
/* 223 */                                   I11IlOOO i11IlOOO2 = i11O0Ol3.I00000oIO;
/* 229 */                                   if (i11Io0oil0i0.isEmpty()) {
/* 231 */                                       i11Io0oil0i0 = i11IlOOO2;
                                            } else if (!i11IlOOO2.isEmpty()) {
/* 248 */                                       i11Io0oil0i0 = new I11Io0oil0i0(new I11IlOOO[]{i11Io0oil0i0, i11IlOOO2});
                                            }
/* 252 */                                   i11O0Ol2 = new I11O0Ol(i11Io0oil0i0);
                                        }
/* 256 */                               i11O0Ol3 = i11O0Ol2;
                                    } else if (i11O0Ol3 == null) {
/* 214 */                               i11O0Ol3 = null;
                                    } else if (i11O0Ol2 != null) {
/* 178 */                               I11IlOOO i11Io0oil0i02 = i11O0Ol3.I00000oIO;
/* 180 */                               I11IlOOO i11IlOOO3 = i11O0Ol2.I00000oIO;
/* 186 */                               if (i11Io0oil0i02.isEmpty()) {
/* 188 */                                   i11Io0oil0i02 = i11IlOOO3;
                                        } else if (!i11IlOOO3.isEmpty()) {
/* 205 */                                   i11Io0oil0i02 = new I11Io0oil0i0(new I11IlOOO[]{i11Io0oil0i02, i11IlOOO3});
                                        }
/* 209 */                               i11O0Ol3 = new I11O0Ol(i11Io0oil0i02);
                                    }
/* 257 */                           iiIiiol0.I00000oIO(arrayList, i11O0Ol3);
                                }
/* 261 */                       ooOI1i1iI00ll1 = IIlio101Io.I00ll1(arrayList);
                            }
                        }
/* 265 */               ol0O0iI0l0OI00000oIO = lOoil0Io0Io.I0000O(ol0O0iI0l0OI00000oIO, null, ooOI1i1iI00ll1, 1);
                    }
/* 269 */           Ol0O0iI0l0O ol0O0iI0l0OI000OiO = OoOilo0Oliii.I000OiO(ol0O0iI0l0OI00000oIO, z);
                    return z2 ? lOOIol01.I0000Il00O(ol0O0iI0l0OI000OiO, l0loOIIo0iOo.I0000O(ooOI1i1i, iiOoI0oI.I00ioIO, (List) ioliil.I00iio, z, O1iii1olO.I00000oOI)) : ol0O0iI0l0OI000OiO;
                }

                public OoOi1Ol I0000oI00(OoOi1Ol ooOi1Ol, iOliil ioliil, OoOOiO ooOOiO, int i) {
                    Ooo0Ioii0o0 ooo0Ioii0o0I000l1;
                    Ooo0Ioii0o0 ooo0Ioii0o0;
                    Ooo0Ioii0o0 ooo0Ioii0o02;
/* 7 */             IiOoI0oI iiOoI0oI = (IiOoI0oI) ioliil.I00iiO;
/* 11 */            if (i > 100) {
/* 1182 */              throw new AssertionError("Too deep recursion while expanding type alias " + iiOoI0oI.getName());
                    }
/* 17 */            if (ooOi1Ol.I0000Il00O()) {
/* 19 */                return OoOilo0Oliii.I000iOII(ooOOiO);
                    }
/* 24 */            O0iIl1 o0iIl1I00000oOI = ooOi1Ol.I00000oOI();
/* 32 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1I00000oOI.I00iOIl().I00100o1O0lo();
/* 52 */            OoOi1Ol ooOi1Ol2 = iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO ? (OoOi1Ol) ((Map) ioliil.I00ilI0I1).get(iOIiO1lIl0lI00100o1O0lo) : null;
/* 53 */            int i2 = 0;
/* 54 */            if (ooOi1Ol2 == null) {
/* 64 */                Ol0O0iI0l0O ol0O0iI0l0OI00000oIO = lOoil0Io0Io.I00000oIO(ooOi1Ol.I00000oOI().I00l0OO0IO());
/* 72 */                if (!l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI00000oIO) && OoOilo0Oliii.I0000Il00O(ol0O0iI0l0OI00000oIO, OoOi1I011O.I00ilO0, null)) {
/* 84 */                    OoOIOoO1I ooOIOoO1II00iOIl = ol0O0iI0l0OI00000oIO.I00iOIl();
/* 88 */                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ooOIOoO1II00iOIl.I00100o1O0lo();
/* 96 */                    ooOIOoO1II00iOIl.I000II().size();
/* 103 */                   ol0O0iI0l0OI00000oIO.I00OIl().size();
/* 108 */                   if (!(iOIiO1lIl0lI00100o1O0lo2 instanceof OoOOiO)) {
/* 114 */                       if (!(iOIiO1lIl0lI00100o1O0lo2 instanceof IiOoI0oI)) {
/* 312 */                           Ol0O0iI0l0O ol0O0iI0l0OI000O01llI0 = I000O01llI0(ol0O0iI0l0OI00000oIO, ioliil, i);
/* 316 */                           OoOilII0.I0000O(ol0O0iI0l0OI000O01llI0);
/* 333 */                           for (Object obj : ol0O0iI0l0OI000O01llI0.I00OIl()) {
/* 339 */                               int i3 = i2 + 1;
/* 341 */                               if (i2 < 0) {
/* 389 */                                   IOOi1I.I000lI();
/* 392 */                                   throw null;
                                        }
/* 343 */                               OoOi1Ol ooOi1Ol3 = (OoOi1Ol) obj;
/* 349 */                               if (!ooOi1Ol3.I0000Il00O() && !OoOilo0Oliii.I0000Il00O(ooOi1Ol3.I00000oOI(), OoOi1I011O.I00ilI0I1, null)) {
                                        }
/* 387 */                               i2 = i3;
                                    }
/* 399 */                           return new OlIo1I(ol0O0iI0l0OI000O01llI0, ooOi1Ol.I00000oIO());
                                }
/* 116 */                       IiOoI0oI iiOoI0oI2 = (IiOoI0oI) iOIiO1lIl0lI00100o1O0lo2;
/* 122 */                       if (ioliil.I001i1lo1io(iiOoI0oI2)) {
/* 144 */                           return new OlIo1I(Il0ooiloI.I00000oOI(Il0ooO1IO.I00ilO0, iiOoI0oI2.getName().I00iOIl), Ooo0Ioii0o0.I00iiO);
                                }
/* 148 */                       List listI00OIl = ol0O0iI0l0OI00000oIO.I00OIl();
/* 162 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00OIl, 10));
/* 173 */                       for (Object obj2 : listI00OIl) {
/* 179 */                           int i4 = i2 + 1;
/* 181 */                           if (i2 < 0) {
/* 206 */                               IOOi1I.I000lI();
/* 209 */                               throw null;
                                    }
/* 201 */                           arrayList.add(I0000oI00((OoOi1Ol) obj2, ioliil, (OoOOiO) ooOIOoO1II00iOIl.I000II().get(i2), i + 1));
/* 204 */                           i2 = i4;
                                }
/* 212 */                       List listI000II = iiOoI0oI2.I00ioIO.I000II();
/* 224 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 227 */                       Iterator it = listI000II.iterator();
/* 235 */                       while (it.hasNext()) {
/* 247 */                           arrayList2.add(((OoOOiO) it.next()).I010i10l());
                                }
/* 255 */                       Map mapI000OiO = O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList2, arrayList));
/* 263 */                       iOliil ioliil2 = new iOliil(13);
/* 266 */                       ioliil2.I00iiI = ioliil;
/* 268 */                       ioliil2.I00iiO = iiOoI0oI2;
/* 270 */                       ioliil2.I00iio = arrayList;
/* 272 */                       ioliil2.I00ilI0I1 = mapI000OiO;
/* 274 */                       VarHandle.storeStoreFence();
/* 308 */                       return new OlIo1I(lOOIol01.I0000Il00O(I0000O(ioliil2, ol0O0iI0l0OI00000oIO.I00OloOo(), ol0O0iI0l0OI00000oIO.I00iiI(), i + 1, false), I000O01llI0(ol0O0iI0l0OI00000oIO, ioliil, i)), ooOi1Ol.I00000oIO());
                            }
                        }
/* 403 */               return ooOi1Ol;
                    }
/* 408 */           if (ooOi1Ol2.I0000Il00O()) {
/* 410 */               return OoOilo0Oliii.I000iOII(ooOOiO);
                    }
/* 419 */           Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = ooOi1Ol2.I00000oOI().I00l0OO0IO();
/* 423 */           Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO = ooOi1Ol2.I00000oIO();
/* 427 */           Ooo0Ioii0o0 ooo0Ioii0o0I00000oIO2 = ooOi1Ol.I00000oIO();
/* 431 */           if (ooo0Ioii0o0I00000oIO2 != ooo0Ioii0o0I00000oIO && ooo0Ioii0o0I00000oIO2 != (ooo0Ioii0o02 = Ooo0Ioii0o0.I00iiO) && ooo0Ioii0o0I00000oIO == ooo0Ioii0o02) {
/* 441 */               ooo0Ioii0o0I00000oIO = ooo0Ioii0o0I00000oIO2;
                    }
/* 442 */           if (ooOOiO == null || (ooo0Ioii0o0I000l1 = ooOOiO.I000l1()) == null) {
/* 450 */               ooo0Ioii0o0I000l1 = Ooo0Ioii0o0.I00iiO;
                    }
/* 452 */           if (ooo0Ioii0o0I000l1 != ooo0Ioii0o0I00000oIO && ooo0Ioii0o0I000l1 != (ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO) && ooo0Ioii0o0I00000oIO == ooo0Ioii0o0) {
/* 462 */               ooo0Ioii0o0I00000oIO = ooo0Ioii0o0;
                    }
/* 471 */           I00000oIO(o0iIl1I00000oOI.getAnnotations(), ooioo0o1l0I00l0OO0IO.getAnnotations());
/* 482 */           Ol0O0iI0l0O ol0O0iI0l0OI000OiO = OoOilo0Oliii.I000OiO(lOoil0Io0Io.I00000oIO(ooioo0o1l0I00l0OO0IO), o0iIl1I00000oOI.I00iiI());
/* 486 */           OoOI1i1i ooOI1i1iI00OloOo = o0iIl1I00000oOI.I00OloOo();
/* 494 */           if (!l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI000OiO)) {
/* 503 */               if (l0loOi1ol11o.I00000oIO(ol0O0iI0l0OI000OiO)) {
/* 505 */                   ooOI1i1iI00OloOo = ol0O0iI0l0OI000OiO.I00OloOo();
                        } else {
/* 511 */                   OoOI1i1i ooOI1i1iI00OloOo2 = ol0O0iI0l0OI000OiO.I00OloOo();
/* 515 */                   IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 521 */                   if (!ooOI1i1iI00OloOo.isEmpty() || !ooOI1i1iI00OloOo2.isEmpty()) {
/* 533 */                       ArrayList arrayList3 = new ArrayList();
/* 544 */                       Iterator it2 = ((ConcurrentHashMap) iIlio101Io.I00iiI).values().iterator();
/* 552 */                       while (it2.hasNext()) {
/* 560 */                           int iIntValue = ((Number) it2.next()).intValue();
/* 570 */                           I11O0Ol i11O0Ol = (I11O0Ol) ooOI1i1iI00OloOo.I00iOIl.get(iIntValue);
/* 578 */                           I11O0Ol i11O0Ol2 = (I11O0Ol) ooOI1i1iI00OloOo2.I00iOIl.get(iIntValue);
/* 581 */                           if (i11O0Ol != null) {
/* 628 */                               if (i11O0Ol2 != null) {
/* 633 */                                   I11IlOOO i11Io0oil0i0 = i11O0Ol.I00000oIO;
/* 635 */                                   I11IlOOO i11IlOOO = i11O0Ol2.I00000oIO;
/* 641 */                                   if (i11Io0oil0i0.isEmpty()) {
/* 643 */                                       i11Io0oil0i0 = i11IlOOO;
                                            } else if (!i11IlOOO.isEmpty()) {
/* 660 */                                       i11Io0oil0i0 = new I11Io0oil0i0(new I11IlOOO[]{i11Io0oil0i0, i11IlOOO});
                                            }
/* 664 */                                   i11O0Ol = new I11O0Ol(i11Io0oil0i0);
                                        }
/* 668 */                               i11O0Ol2 = i11O0Ol;
                                    } else if (i11O0Ol2 == null) {
/* 626 */                               i11O0Ol2 = null;
                                    } else if (i11O0Ol != null) {
/* 590 */                               I11IlOOO i11Io0oil0i02 = i11O0Ol2.I00000oIO;
/* 592 */                               I11IlOOO i11IlOOO2 = i11O0Ol.I00000oIO;
/* 598 */                               if (i11Io0oil0i02.isEmpty()) {
/* 600 */                                   i11Io0oil0i02 = i11IlOOO2;
                                        } else if (!i11IlOOO2.isEmpty()) {
/* 617 */                                   i11Io0oil0i02 = new I11Io0oil0i0(new I11IlOOO[]{i11Io0oil0i02, i11IlOOO2});
                                        }
/* 621 */                               i11O0Ol2 = new I11O0Ol(i11Io0oil0i02);
                                    }
/* 669 */                           iiIiiol0.I00000oIO(arrayList3, i11O0Ol2);
                                }
/* 673 */                       ooOI1i1iI00OloOo = IIlio101Io.I00ll1(arrayList3);
                            }
                        }
/* 677 */               ol0O0iI0l0OI000OiO = lOoil0Io0Io.I0000O(ol0O0iI0l0OI000OiO, null, ooOI1i1iI00OloOo, 1);
                    }
/* 683 */           return new OlIo1I(ol0O0iI0l0OI000OiO, ooo0Ioii0o0I00000oIO);
                }

                @Override
                public Iterable I0001Ioi1lo(Object obj) {
                    switch (this.I00iOIl) {
                        case 2:
/* 23 */                    int i = IiOiOOIo.I00000oIO;
/* 25 */                    Collection collectionI000o00OoI0I = ((Ooo00oi0O) obj).I000o00OoI0I();
/* 37 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI000o00OoI0I, 10));
/* 42 */                    Iterator it = ((ArrayList) collectionI000o00OoI0I).iterator();
/* 50 */                    while (it.hasNext()) {
/* 62 */                        arrayList.add(((Ooo00oi0O) it.next()).I010i10l());
                            }
/* 66 */                    return arrayList;
                        default:
/* 8 */                     O0O00I1Ili[] o0O00I1IliArr = O0I0iO0I1iI.I00ioIO;
/* 14 */                    return ((IIiO00o1o) obj).I010i10l().I000o00OoI0I();
                    }
                }

                @Override
                public PointF I000II(O1liloIo o1liloIo, int i) {
/* 7 */             return new PointF(o1liloIo.I00000oIO, o1liloIo.I00000oOI);
                }

                public Ol0O0iI0l0O I000O01llI0(Ol0O0iI0l0O ol0O0iI0l0O, iOliil ioliil, int i) {
/* 1 */             OoOIOoO1I ooOIOoO1II00iOIl = ol0O0iI0l0O.I00iOIl();
/* 5 */             List listI00OIl = ol0O0iI0l0O.I00OIl();
/* 19 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00OIl, 10));
/* 26 */            int i2 = 0;
/* 32 */            for (Object obj : listI00OIl) {
/* 38 */                int i3 = i2 + 1;
/* 40 */                if (i2 < 0) {
/* 98 */                    IOOi1I.I000lI();
/* 101 */                   throw null;
                        }
/* 42 */                OoOi1Ol ooOi1Ol = (OoOi1Ol) obj;
/* 56 */                OoOi1Ol ooOi1OlI0000oI00 = I0000oI00(ooOi1Ol, ioliil, (OoOOiO) ooOIOoO1II00iOIl.I000II().get(i2), i + 1);
/* 64 */                if (!ooOi1OlI0000oI00.I0000Il00O()) {
/* 89 */                    ooOi1OlI0000oI00 = new OlIo1I(OoOilo0Oliii.I000OOo1O(ooOi1OlI0000oI00.I00000oOI(), ooOi1Ol.I00000oOI().I00iiI()), ooOi1OlI0000oI00.I00000oIO());
                        }
/* 93 */                arrayList.add(ooOi1OlI0000oI00);
/* 96 */                i2 = i3;
                    }
/* 103 */           return lOoil0Io0Io.I0000O(ol0O0iI0l0O, arrayList, null, 2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 3 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 1:
/* 30 */                    I0OOO1l0IoO i0OOO1l0IoO = new I0OOO1l0IoO("ObservableContent", 3);
/* 33 */                    IoO0l0Iiioll ioO0l0Iiioll = ioIlI1oli.I00iio;
/* 35 */                    ioO0l0Iiioll.I0001Ioi1lo(i0OOO1l0IoO);
/* 44 */                    ioO0l0Iiioll.I000II(i0OOO1l0IoO, new I0i1Il((Function3) oll0io, iOoil1iiIilo, 0));
                            break;
                        default:
/* 19 */                    ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000OiO, new OOlo0IiOl1i((Function3) oll0io, iOoil1iiIilo, 1));
                            break;
                    }
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(iO0O0li111.class, iI1Oo01Il10.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(iOOlIOiOl.class, iIlOIo10.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(iO0O1Io0.class, iI1OoiiiIIOl.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(iO0iOI0.class, iI1Oooo0liO.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(iO0OI01loOo.class, iI1Oooio0.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(iO0OIlII0.class, iI1i1o0O0l.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(iIoI0lOo.class, iI0O0oOo.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(iIo1llOOlOI.class, iI0Iol0Ol1O.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(iO010ilOIO.class, iI11l10Ilo.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(iOI1O1I1O.class, iIiI0il.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(iIo1li.class, iI0Io10I1.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(iIo1OOi0Ii1.class, iI0IilO.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(iO1I0I0i0Oo.class, iIIl0I.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(iOi1II01i0.class, iI110O.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(iO0011o0iIIl.class, iI11i1.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(iIooOO0ll000.class, iI1100O0o.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(iO1I0llIoi.class, iIIlI0.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(iOI0ooi.class, iIi1lI010I1.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(iOI10OoOlOl.class, iIi1lo0i.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(iOI0lOI1.class, iIi1O1.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(iO0ioilo.class, iI1l0loIio.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(iOi11I.class, i1oloii1O.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(iO0l01l.class, iI1l1o.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(iO1O00Oo0.class, iIO0IoIIOOOi.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(iO1OO0i0i.class, iIO0oIIIII0.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(iO1OIlOO.class, iIO0lol.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(iO1O101oi.class, iIO0lOI0.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(iO1l0i0I0I.class, iIOOOIi.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(iO1l1I10.class, iIOi0O1.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(iO1lI0lo110.class, iIOi1l.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(iO1l1oi.class, iIOi0l0OOIIi.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(iO0ilIl.class, iI1l0O0O0.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(iO1lilOi.class, iIOiO110iOiO.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(iO1loiilii.class, iIOiOlll.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(iO1o0OlO01I.class, iIOiioiI0.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(iO1o1O.class, iIOioolo0i.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(iO1oilio0i.class, iIOlIi11.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(iO1oOlIIo10.class, iIOlOil0il.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(iO1iiliIOi.class, iIOIi1oo.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(iO01iIiOIl.class, iI1O0lioI.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(iO1i0iI.class, iIOIoIO.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(iO1OoolI.class, iIOIlIii.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(iO1i11l.class, iIOIoOo01.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(iOI110IOi11i.class, iIi1oI11OI.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(iOOoIil.class, iIli0o1loO.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(iIllIoiiIO.class, iI00I1lII0I.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(iIll0I00Ol0.class, i1ooo0OOOi.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(iIlioo.class, i1ooO0IOo1IO.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(iIllIIO1IIO.class, iI000iol0l.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(iIlll1lo.class, iI00l10.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(iIllOoI.class, iI00IlIOI0I0.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(iIllolOO.class, iI00oI.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(iIloOoO.class, iI011IiI0I.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(iIo0Ioi1lIl.class, iI011lIlI.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(iIo0loiilI.class, iI01Oo1io1I.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(iIo0o11I.class, iI0I00OIi.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(i1io00.class, i1oiIIIloo.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(i1l0011li1oI.class, i1oili1ol.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(i1ioI0ilOi.class, i1oii0iloi.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(iO01II.class, iI11oo1II00.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(iIoIOo00o.class, iI0OI1Oo.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(i1OI1I0ll1I.class, i1l0OO1.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(i1O1ll.class, i1l0oO0lI0o.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(iIoo10I.class, iI10OI0I.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(i1OO0Ol.class, i1l10oil.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(i1OIli1.class, i1l111oioo11.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(i1OliO1.class, i1lOi0li.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(i1OlOi1oilo.class, i1lOl0lI1i.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(i1OOI0i0Ol.class, i1l1I0.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(i1OO1IlO.class, i1l1O0O1oiO.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(i1i011II.class, i1loil.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(i1OooooO0.class, i1o01Iio.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(i1i11ioIIlOl.class, i1o0llOo0o0.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(i1i10Oi.class, i1o1IlO.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(i1ilI1Oiio.class, i1oOI11iIIl.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(i1il1IIIo0.class, i1oOOo.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(i1i1oI01.class, i1o1OlOlO.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(i1i1ll10oi.class, i1o1oi1oo.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(i1iI1IiII.class, i1o1oo0I.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(i1i1ooOIOi.class, i1oIIi11lI.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(iOi0i1l1i0IO.class, iIiIIoiO.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(iOOoIoliliOO.class, iI0OIl1lO.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(iOOoooll0l.class, iI1io0.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(iOOolo0i0.class, iI1ili10I.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(iOOoi1OOlo.class, iI111i.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(iOi00i0iIl0O.class, iIiI1liI1.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(iOi001OI1.class, iIiI1Iio.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(iOi0ilOl10I.class, iIiIiIO00.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(iOOol1iOiIO.class, iI11oOliil.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(iOi10ioilO0.class, iIliIIOO1Ii.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(iOi0ollol.class, iIliOIol0oi1.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(iOi0ol.class, iIli1Oo0Oi0i.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(iOI1Oiloo0i.class, iIiIlIioOI.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(iO0111o.class, iI11oiIiIiiI.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(iO01loO1l.class, iI1O1Ol1.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(iIlilo.class, i1oo00I0.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(iO001lollO1l.class, iI11iOi1O0.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(iO01O00o.class, iI1Il1.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(iIooIioI1Oo0.class, iI10l0.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(iIoIo1lll0lI.class, iI0Ol0oO.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(iIoIoOi00.class, iI0Ol1ooo.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(iIoIl1ioI1.class, iI0OiO1iOOl.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(iIoO10loI.class, iI0i1o0IIIlO.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(iO10lIIill0.class, iIIOOoiIlI.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(i1ilo1.class, i1oi1OO.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(i1ilO0Oi1l0I.class, i1oOoI01o1l.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(iO0iil1loOI0.class, iI1iilIilo.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(iO0ii0001iio.class, iI1iIoI.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(i1O1i1I0il.class, i1l01ii1OOl.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(I1o1o00oi0I.class, iIlOl0OliI.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(iOOoI10.class, iIlOoIlII.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(iOOo1li.class, iIlOlii1i1.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(iIlilIl011l.class, i1ol1io.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(iIo1Iiloo.class, iI0IO1oo.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(iIo1101O.class, iI0IIiiI.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(iIo0oilo.class, iI0I10IOo.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(iO11lloI0.class, iIIi01oIIOII.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(iO1I00OOol.class, iIIiI01IOI.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(iO11lolO0lo.class, iIIi100llOO.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(i1OlIOi.class, i1lIo0O.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(i1Ol0Oo0OI.class, i1lO110Oi.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(iO1I10lioi.class, iIIlII.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(iO1IOIoilO.class, iIIloIOlo1O.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(iO1I1Oo.class, iIIli1l.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(iO1IIloiOoiO.class, iIIlllooOi.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(i1Oo1IIO.class, i1lOooiO1i.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(i1Olol.class, i1li10I1IIo.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(iOOI1oI0I.class, iIl0Iiooil.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(iOOI0Oli1.class, iIl0I0Ilo.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(iOOlOiI.class, iIlOO0oi1O1.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(iOOloioiO.class, iIlOilo1l.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(iO1OiO1lo1o.class, iIO10ooli.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(iO1Oo1o0OOio.class, iIOIi010I.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(iO1Oii0i.class, iIO1iio0i.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(iO1OlI011Oo1.class, iIO1lOiOilO.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(iO0100loIol.class, iI11ioiI0il.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(i1i0ii1oO.class, i1o0O0l.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(i1i0IooiOOI.class, i1o0O0ol.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(iO00l1ollO.class, iI11io.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(iO000OI0lOl.class, iI11IOI001.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(iO1Ill0.class, iIIo0il0I.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(iO1Ioll.class, iIO01OoOi0li.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(iO1Ioi0.class, iIIooiIo0l.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(i1OolO1i0OOI.class, i1lliI1lIo.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(i1Ooi1Il.class, i1lo1O11i.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(iO100OlI00o.class, iII1ool0.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(iO1010o.class, iIIII0ll.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(iO10II1oIll0.class, iIIIiOI1i1.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(i1OOlO1O0i.class, i1lI00ooilI.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(i1OOl00lO.class, i1lIIO1i.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(iO0oiO10O.class, iII1I0oOOO.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(iO0oioo0loli.class, iII1l0l0lI.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(iO0oloi1IO0.class, iII1oo1l.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(i1OOiOiI1lI.class, i1l1lo10Il0o.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(i1OOO0o0ioO.class, i1l1oO1Oo1O.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(iO10OIiI0i.class, iIIIilOii0l.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(iO10Oii01l.class, iIIO010ol1oI.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(iO10iI0oOi1.class, iIIOOO1ol10l.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(i1OiooO.class, i1lIIli0iOOI.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(i1Oio1l.class, i1lIl1.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(iOO1iOiOl.class, iIioolOIiii0.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(iOO1OO.class, iIl00I10O00.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(iO0I01oOl1O.class, iI1O1io1IOOO.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(iO0IIIo.class, iI1OIIi1Ii.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(iO0I0I0O0.class, iI1OI1l.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(iO0IO0O.class, iI1Oi1iO.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(iO1oioi.class, iIi0011lO.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(iOI00o11.class, iIi0Oi0I.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(i1iO101.class, i1oIliioOO.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(i1iIiI1O.class, i1oIo10lIOo.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(iOOOloIOiI0.class, iIlIiloi.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(iO1oO0lio.class, iIOiooo.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(iO1oO1OoOoii.class, iIOl1Ii1Ii.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(i1iIOO1.class, i1oIO11.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(i1iIO1i.class, i1oIlI1l1101.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(iOO1o0io.class, iIl01iO1.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(iO0oOllOli.class, iI1lOi.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(iO0oO0Io0O1.class, iII1I0iO11.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(iO0o00ili.class, iI1oi0ioi.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(iO0loiii.class, iI1o1iII0100.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(iO0o0l0oOo0.class, iII0o1lo1i.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(iO0oI1oIoli0.class, iII110.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(iO0lOII0il.class, iI1lll1iii.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(iO0l0I1O.class, iI1lOIO.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(iO0lIo11i11O.class, iI1llIoI.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(iO0l10O.class, iI1lio1.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(iO11i1liO1l.class, iIIOoOi.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(iIoiiil.class, iI0ooOi00lo.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(iO11OIIOIoo0.class, iIIOiil0O.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(iO11ilOI.class, iIIOooII10l1.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(iIoiO1l.class, iI0oii.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(iIolooiOI.class, iI10II1i.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(iOI1OIiO1.class, iIiIl01o1011.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(iIoi0io.class, iI0olll010.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(iIoOoiIO.class, iI0oil0lOoO1.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(iIoOlloI.class, iI0oIllii.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(iIoOoli.class, iI0oioI1.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(iOI0I0o1o.class, iIi0OiO0iOI.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(iOOi00o0.class, iIlIoiOIi.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(iOI0iOOiOoO.class, iIi1IIoiioi.I00000oIO);
/* 1405 */          il0IIIOll.registerEncoder(iOI0OiiiOl1.class, iIi0oli1lO.I00000oIO);
/* 1412 */          il0IIIOll.registerEncoder(iOOOoO.class, iIlIlIio0I.I00000oIO);
/* 1419 */          il0IIIOll.registerEncoder(i1iOol1iiill.class, i1oO0OiOO11.I00000oIO);
/* 1426 */          il0IIIOll.registerEncoder(i1iOIo0Oil.class, i1oO1oOiO.I00000oIO);
/* 1433 */          il0IIIOll.registerEncoder(iOOOoio.class, iIlIloo.I00000oIO);
/* 1440 */          il0IIIOll.registerEncoder(iIoOl1.class, iI0o0Oii1oO1.I00000oIO);
/* 1447 */          il0IIIOll.registerEncoder(iIoOi111I1lI.class, iI0ll1O.I00000oIO);
/* 1454 */          il0IIIOll.registerEncoder(iIoOIl1il.class, iI0lioO1OIil.I00000oIO);
/* 1461 */          il0IIIOll.registerEncoder(iIoOII.class, iI0lIo1lIllo.I00000oIO);
/* 1468 */          il0IIIOll.registerEncoder(iIoO1101ooO1.class, iI0lOII.I00000oIO);
/* 1475 */          il0IIIOll.registerEncoder(iOO0lI.class, iIioO001o.I00000oIO);
/* 1482 */          il0IIIOll.registerEncoder(iOO0oo0lIIO.class, iIioOllioIO.I00000oIO);
/* 1489 */          il0IIIOll.registerEncoder(iOIli0.class, iIiillOl1li.I00000oIO);
/* 1496 */          il0IIIOll.registerEncoder(iOIo11.class, iIilIIl1Oool.I00000oIO);
/* 1503 */          il0IIIOll.registerEncoder(iOIliO1I1i.class, iIiioi1l.I00000oIO);
/* 1510 */          il0IIIOll.registerEncoder(iOO01lio0.class, iIiloi.I00000oIO);
/* 1517 */          il0IIIOll.registerEncoder(iOIo1I0O.class, iIilOii00IlO.I00000oIO);
/* 1524 */          il0IIIOll.registerEncoder(i0Oio1.class, iIioII10O.I00000oIO);
/* 1531 */          il0IIIOll.registerEncoder(iOO0I0o1i0Il.class, iIio0lOOII.I00000oIO);
/* 1538 */          il0IIIOll.registerEncoder(iOIloO1oiO.class, iIil0oI.I00000oIO);
/* 1545 */          il0IIIOll.registerEncoder(iOIlil0Il1i.class, iIil0i11ioOO.I00000oIO);
/* 1552 */          il0IIIOll.registerEncoder(iOO0100o.class, iIillOiOI01o.I00000oIO);
/* 1559 */          il0IIIOll.registerEncoder(iOIoIi0o.class, iIilill.I00000oIO);
/* 1566 */          il0IIIOll.registerEncoder(iOIl1O.class, iIii0Oil.I00000oIO);
/* 1573 */          il0IIIOll.registerEncoder(iOIl0OoO.class, iIOo0oiIi1.I0000O);
/* 1580 */          il0IIIOll.registerEncoder(iOIl0IIo00l.class, iIOo0oiIi1.I0000Il00O);
/* 1587 */          il0IIIOll.registerEncoder(iOIiOil.class, iIiOi1oIO0O.I00000oIO);
/* 1594 */          il0IIIOll.registerEncoder(iOIl01.class, iIiOioii.I00000oIO);
/* 1601 */          il0IIIOll.registerEncoder(iOIilIo.class, iIiOii1Io.I00000oIO);
/* 1608 */          il0IIIOll.registerEncoder(iOIOii0OI00O.class, iIiIoli.I00000oIO);
/* 1615 */          il0IIIOll.registerEncoder(iOO11o0o11o1.class, iIioo1ioiiI.I00000oIO);
/* 1622 */          il0IIIOll.registerEncoder(iOIi0li1l.class, iIiOOI00i.I00000oIO);
/* 1629 */          il0IIIOll.registerEncoder(iOIOloiliO.class, iIiO111io.I00000oIO);
/* 1636 */          il0IIIOll.registerEncoder(iOIOoO0.class, iIiOI1Io.I00000oIO);
/* 1643 */          il0IIIOll.registerEncoder(iOOIOl1llO.class, iIl0lI1.I00000oIO);
/* 1650 */          il0IIIOll.registerEncoder(iOOIlolo00O.class, iIl0oI1O1i.I00000oIO);
/* 1657 */          il0IIIOll.registerEncoder(iOOIlIo.class, iIl0o000.I00000oIO);
/* 1664 */          il0IIIOll.registerEncoder(iOOIIoOOoo.class, iIl0Oo10.I00000oIO);
/* 1671 */          il0IIIOll.registerEncoder(iOOOI0OI.class, iIl11i.I00000oIO);
/* 1678 */          il0IIIOll.registerEncoder(iOOOillOoi0.class, iIlIO0.I00000oIO);
/* 1685 */          il0IIIOll.registerEncoder(iOOOOI.class, iIl1I0i1i0.I00000oIO);
/* 1692 */          il0IIIOll.registerEncoder(iOOIoOoO0il1.class, iIl10o0.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 13 */            return new iOliloiooo((Context) ((I1ii1o0) iOiOIoiiO0i).I00000oIO(Context.class));
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 168 */                   List list = iol1II1ii1i.I00000oIO;
/* 172 */                   iI1lO0li.I00iiI.get();
/* 191 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
                        case PoseLandmark.LEFT_THUMB:
/* 144 */                   List list2 = iol1II1ii1i.I00000oIO;
/* 148 */                   iI1lO0li.I00iiI.get();
/* 165 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 120 */                   List list3 = iol1II1ii1i.I00000oIO;
/* 124 */                   iI1lO0li.I00iiI.get();
/* 141 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
                        case PoseLandmark.LEFT_HIP:
/* 85 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 89 */                    iI1lO0li.I00iiI.get();
/* 115 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
                        case PoseLandmark.RIGHT_HIP:
/* 50 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 54 */                    iI1lO0li.I00iiI.get();
/* 80 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
                        case PoseLandmark.LEFT_KNEE:
/* 15 */                    List list6 = iol1II1ii1i.I00000oIO;
/* 19 */                    iI1lO0li.I00iiI.get();
/* 45 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
                        default:
/* 11 */                    return new ConcurrentHashMap();
                    }
                }

/* 8 */         public i1O01Ill(int i) {
/* 9 */             this.I00iOIl = i;
                }

                @Override
/* 28 */        public int I0000Il00O(int i) {
/* 29 */            return i;
                }
            }
