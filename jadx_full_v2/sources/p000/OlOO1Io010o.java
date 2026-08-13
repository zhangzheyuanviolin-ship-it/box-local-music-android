            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.util.Log;
            import android.util.Pair;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.UUID;
            
            public final class OlOO1Io010o extends Ool10o {
                public final OlOO1OiIIi0 I0010I0i;
                public final Oooo00lI I0010o;
                public final IOlO11lll0l I00111O;
                public final IOlO11lll0l I001IIilI0O;
                public IoIlOo1o0IIl I001IO000;
                public I1ii1o0 I001i1O0Ol;
                public OlioOil I001i1lo1io;
                public OlioOil I001iOo1i0O;
                public OlioOil I001l0I00;
                public OlioOil I001lIiIIo1O;
                public OilliIo0l0OI I001lllioOl;
                public OilliIo0l0OI I001lloI;
                public Oilll1I I00II0Ol1O0l;

                public OlOO1Io010o(IIllOo0 iIllOo0, IIllOo0 iIllOo02, IOlO11lll0l iOlO11lll0l, IOlO11lll0l iOlO11lll0l2, HashSet hashSet, OolO0o0O10I oolO0o0O10I) {
/* 5 */             super(I00Io1lO(hashSet));
/* 12 */            this.I0010I0i = I00Io1lO(hashSet);
/* 14 */            this.I00111O = iOlO11lll0l;
/* 16 */            this.I001IIilI0O = iOlO11lll0l2;
/* 24 */            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(29);
/* 27 */            i0IOIlIOIII.I00iiI = this;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            Oooo00lI oooo00lI = new Oooo00lI();
/* 40 */            oooo00lI.I00iiI = new HashMap();
/* 47 */            oooo00lI.I00iiO = new HashMap();
/* 54 */            oooo00lI.I00iio = new HashMap();
/* 59 */            IIl1i10oO iIl1i10oO = new IIl1i10oO(3);
/* 67 */            iIl1i10oO.I00000oOI = new WeakReference(oooo00lI);
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            oooo00lI.I00ioIO = iIl1i10oO;
/* 74 */            oooo00lI.I00ilO0 = iIllOo0;
/* 76 */            oooo00lI.I00io1l = iIllOo02;
/* 78 */            oooo00lI.I00ilI0I1 = oolO0o0O10I;
/* 80 */            oooo00lI.I00iOIl = hashSet;
/* 84 */            HashMap map = new HashMap();
/* 87 */            Iterator it = hashSet.iterator();
                    while (true) {
/* 97 */                if (!it.hasNext()) {
                            break;
                        }
/* 103 */               Ool10o ool10o = (Ool10o) it.next();
/* 117 */               map.put(ool10o, ool10o.I000oI1ioi(iIllOo0.I0010o(), null, ool10o.I000II(true, oolO0o0O10I)));
                    }
/* 121 */           oooo00lI.I00l0OO0IO = map;
/* 129 */           HashSet hashSet2 = new HashSet(map.values());
/* 132 */           oooo00lI.I00l0I0l0lO1 = hashSet2;
/* 139 */           oooo00lI.I00li1OI = new Oi0Oo1OIoOo(iIllOo0, hashSet2);
/* 141 */           if (iIllOo02 != null) {
/* 148 */               oooo00lI.I00ll1 = new Oi0Oo1OIoOo(iIllOo02, hashSet2);
                    }
/* 150 */           Iterator it2 = hashSet.iterator();
/* 158 */           while (it2.hasNext()) {
/* 164 */               Ool10o ool10o2 = (Ool10o) it2.next();
/* 170 */               oooo00lI.I00iio.put(ool10o2, Boolean.FALSE);
/* 173 */               HashMap map2 = oooo00lI.I00iiO;
/* 177 */               OoolooO ooolooO = new OoolooO();
/* 180 */               ooolooO.I00iOIl = iIllOo0;
/* 182 */               ooolooO.I00iio = oooo00lI;
/* 190 */               I0IiOl0 i0IiOl0 = new I0IiOl0(iIllOo0.I000O01llI0(), 1);
/* 193 */               i0IiOl0.I0000O = i0IOIlIOIII;
/* 195 */               VarHandle.storeStoreFence();
/* 198 */               ooolooO.I00iiI = i0IiOl0;
/* 202 */               IIllOioOlolI iIllOioOlolII0010o = iIllOo0.I0010o();
/* 206 */               Oooo1i1I00o0 oooo1i1I00o0 = new Oooo1i1I00o0(iIllOioOlolII0010o);
/* 243 */               oooo1i1I00o0.I00iiI = "virtual-" + iIllOioOlolII0010o.I0001Ioi1lo() + "-" + UUID.randomUUID().toString();
/* 245 */               VarHandle.storeStoreFence();
/* 248 */               ooolooO.I00iiO = oooo1i1I00o0;
/* 250 */               VarHandle.storeStoreFence();
/* 253 */               map2.put(ool10o2, ooolooO);
                    }
/* 257 */           VarHandle.storeStoreFence();
/* 260 */           this.I0010o = oooo00lI;
/* 272 */           HashSet hashSet3 = ((Ool10o) hashSet.iterator().next()).I000O01llI0;
/* 281 */           this.I000O01llI0 = hashSet3 != null ? new HashSet(hashSet3) : null;
                }

                public static OlOO1OiIIi0 I00Io1lO(HashSet hashSet) {
/* 3 */             OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 8 */             new IIl0lo1oi(oI0oiliol10OI000OOo1O, 2);
/* 19 */            oI0oiliol10OI000OOo1O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 34);
/* 24 */            ArrayList arrayList = new ArrayList();
/* 27 */            Iterator it = hashSet.iterator();
/* 35 */            while (it.hasNext()) {
/* 41 */                Ool10o ool10o = (Ool10o) it.next();
/* 51 */                if (ool10o.I000OOo1O.I000O01llI0(OolIl0ii1.I00OIl)) {
/* 59 */                    arrayList.add(ool10o.I000OOo1O.I0010o());
                        } else {
/* 67 */                    Log.e("StreamSharing", "A child does not have capture type.");
                        }
                    }
/* 73 */            oI0oiliol10OI000OOo1O.I0010I0i(OlOO1OiIIi0.I00iiI, arrayList);
/* 82 */            oI0oiliol10OI000OOo1O.I0010I0i(IoiIli1i0Oil.I001i1O0Ol, 2);
/* 89 */            oI0oiliol10OI000OOo1O.I0010I0i(OolIl0ii1.I00Ol00, OlOOI001.I00ilO0);
/* 98 */            return new OlOO1OiIIi0(OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000OOo1O));
                }

                @Override
                public final OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I) {
/* 1 */             OlOO1OiIIi0 olOO1OiIIi0 = this.I0010I0i;
/* 8 */             IOlOo1ll1l1 iOlOo1ll1l1I00000oIO = oolO0o0O10I.I00000oIO(olOO1OiIIi0.I0010o(), 1);
/* 12 */            if (z) {
/* 16 */                iOlOo1ll1l1I00000oIO = IOlOo1ll1l1.I00100l0(iOlOo1ll1l1I00000oIO, olOO1OiIIi0.I00iOIl);
                    }
/* 20 */            if (iOlOo1ll1l1I00000oIO == null) {
/* 22 */                return null;
                    }
/* 30 */            return ((IIl0lo1oi) I000l1(iOlOo1ll1l1I00000oIO)).I00100o1O0lo();
                }

                @Override
                public final Set I000iOII() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(3);
/* 20 */            return hashSet;
                }

                @Override
                public final OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 8 */             return new IIl0lo1oi(OI0oiliol10O.I000iOII(iOlOo1ll1l1), 2);
                }

                @Override
                public final void I0010o() {
/* 1 */             Oooo00lI oooo00lI = this.I0010o;
/* 5 */             Iterator it = oooo00lI.I00iOIl.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                Ool10o ool10o = (Ool10o) it.next();
/* 27 */                OoolooO ooolooO = (OoolooO) oooo00lI.I00iiO.get(ool10o);
/* 29 */                Objects.requireNonNull(ooolooO);
/* 40 */                ool10o.I00000oOI(ooolooO, null, null, ool10o.I000II(true, oooo00lI.I00ilI0I1));
                    }
                }

                @Override
                public final void I00111O() {
/* 5 */             Iterator it = this.I0010o.I00iOIl.iterator();
/* 13 */            while (it.hasNext()) {
/* 21 */                ((Ool10o) it.next()).I00111O();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
                
                    r17 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
                
                    if (r14 != false) goto L51;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01f8  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x020d  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OolIl0ii1 I001IIilI0O(IIllOioOlolI iIllOioOlolI, OolIii00oi1 oolIii00oi1) {
                    OolIl0ii1 oolIl0ii1;
                    OolIl0ii1 oolIl0ii12;
                    Object iio1oiI;
                    OolIl0ii1 oolIl0ii13;
                    OolIl0ii1 oolIl0ii14;
/* 1 */             OI0oiliol10O oI0oiliol10OI000o00OoI0I = oolIii00oi1.I000o00OoI0I();
/* 7 */             Oooo00lI oooo00lI = this.I0010o;
/* 9 */             HashSet hashSet = oooo00lI.I00l0I0l0lO1;
/* 11 */            Oi0Oo1OIoOo oi0Oo1OIoOo = oooo00lI.I00li1OI;
/* 17 */            List listI00111O = oi0Oo1OIoOo.I0001Ioi1lo.I00111O(34);
/* 26 */            HashSet hashSet2 = oi0Oo1OIoOo.I0000O;
/* 28 */            Iterator it = hashSet2.iterator();
                    while (true) {
/* 36 */                oolIl0ii1 = null;
/* 37 */                if (!it.hasNext()) {
                            break;
                        }
/* 43 */                OolIl0ii1 oolIl0ii15 = (OolIl0ii1) it.next();
/* 59 */                if (!((Boolean) oolIl0ii15.I00000oOI(OolIl0ii1.I00OIO1, Boolean.FALSE)).booleanValue() && (oolIl0ii15 instanceof IoiIli1i0Oil)) {
                        }
                    }
/* 83 */            List list = (List) oI0oiliol10OI000o00OoI0I.I00000oOI(IoiIli1i0Oil.I001lIiIIo1O, null);
/* 85 */            if (list != null) {
/* 87 */                Iterator it2 = list.iterator();
                        while (true) {
/* 95 */                    if (!it2.hasNext()) {
/* 128 */                       listI00111O = new ArrayList();
                                break;
                            }
/* 101 */                   Pair pair = (Pair) it2.next();
/* 115 */                   if (((Integer) pair.first).equals(34)) {
/* 121 */                       listI00111O = Arrays.asList((Size[]) pair.second);
                                break;
                            }
                        }
                    }
/* 131 */           Rational rational = oi0Oo1OIoOo.I0000Il00O;
/* 135 */           ArrayList arrayList = new ArrayList();
/* 140 */           HashSet hashSet3 = new HashSet();
/* 143 */           Iterator it3 = hashSet2.iterator();
/* 151 */           while (it3.hasNext()) {
/* 163 */               hashSet3.addAll(oi0Oo1OIoOo.I0000Il00O((OolIl0ii1) it3.next()));
                    }
/* 167 */           Iterator it4 = hashSet3.iterator();
                    while (true) {
/* 175 */               if (!it4.hasNext()) {
                            break;
                        }
/* 187 */               if (!I1O0oI0ol.I00000oIO(rational, (Size) it4.next())) {
/* 195 */                   arrayList.addAll(oi0Oo1OIoOo.I000II(oi0Oo1OIoOo.I00000oOI, listI00111O, false));
                            break;
                        }
                    }
/* 198 */           int size = arrayList.size();
/* 207 */           if (hashSet2.isEmpty()) {
/* 209 */               oolIl0ii12 = null;
                    } else {
/* 212 */               Iterator it5 = hashSet2.iterator();
                        loop9: while (true) {
/* 220 */                   if (!it5.hasNext()) {
/* 280 */                       oolIl0ii12 = oolIl0ii1;
/* 282 */                       size = 0;
                                break;
                            }
/* 232 */                   Iterator it6 = oi0Oo1OIoOo.I0000Il00O((OolIl0ii1) it5.next()).iterator();
/* 236 */                   boolean z = false;
/* 237 */                   boolean z2 = false;
                            while (true) {
/* 242 */                       if (!it6.hasNext()) {
                                    break;
                                }
/* 248 */                       oolIl0ii12 = oolIl0ii1;
/* 254 */                       boolean zI00000oIO = I1O0oI0ol.I00000oIO(rational, (Size) it6.next());
/* 258 */                       if (zI00000oIO) {
/* 260 */                           z = true;
                                }
/* 261 */                       if (z2 && zI00000oIO) {
                                    break loop9;
                                }
/* 266 */                       if (!zI00000oIO) {
/* 268 */                           z2 = true;
                                }
/* 269 */                       oolIl0ii1 = oolIl0ii12;
                            }
/* 277 */                   oolIl0ii1 = oolIl0ii12;
                        }
                    }
/* 287 */           arrayList.addAll(size, oi0Oo1OIoOo.I000II(rational, listI00111O, false));
/* 294 */           arrayList.addAll(oi0Oo1OIoOo.I0001Ioi1lo(listI00111O, false));
/* 303 */           if (arrayList.isEmpty()) {
/* 307 */               l11I11lO.I0000oI00("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
/* 314 */               arrayList.addAll(oi0Oo1OIoOo.I0001Ioi1lo(listI00111O, true));
                    }
/* 317 */           arrayList.toString();
/* 321 */           l11I11lO.I0000O(3, "ResolutionsMerger");
/* 326 */           oI0oiliol10OI000o00OoI0I.I0010I0i(IoiIli1i0Oil.I001lloI, arrayList);
/* 329 */           I1ioiI i1ioiI = OolIl0ii1.I00IoiI;
/* 331 */           Iterator it7 = hashSet.iterator();
/* 335 */           int iMax = 0;
/* 340 */           while (it7.hasNext()) {
/* 360 */               iMax = Math.max(iMax, ((Integer) ((OolIl0ii1) it7.next()).I00000oOI(OolIl0ii1.I00IoiI, 0)).intValue());
                    }
/* 369 */           oI0oiliol10OI000o00OoI0I.I0010I0i(i1ioiI, Integer.valueOf(iMax));
/* 374 */           ArrayList arrayList2 = new ArrayList();
/* 377 */           Iterator it8 = hashSet.iterator();
/* 385 */           while (it8.hasNext()) {
/* 401 */               Iio1oiI iio1oiI2 = (Iio1oiI) ((OolIl0ii1) it8.next()).I00000oOI(IoiIOIliOIi1.I0010o, Iio1oiI.I0000Il00O);
/* 403 */               iio1oiI2.getClass();
/* 406 */               arrayList2.add(iio1oiI2);
                    }
/* 414 */           if (arrayList2.isEmpty()) {
/* 552 */               iio1oiI = oolIl0ii12;
                        break;
                    }
/* 422 */           Iio1oiI iio1oiI3 = (Iio1oiI) arrayList2.get(0);
/* 426 */           Integer numValueOf = Integer.valueOf(iio1oiI3.I00000oIO);
/* 436 */           int i = 1;
/* 432 */           Integer numValueOf2 = Integer.valueOf(iio1oiI3.I00000oOI);
                    Integer num = numValueOf;
/* 441 */           while (i < arrayList2.size()) {
/* 447 */               Iio1oiI iio1oiI4 = (Iio1oiI) arrayList2.get(i);
/* 451 */               Integer numValueOf3 = Integer.valueOf(iio1oiI4.I00000oIO);
/* 468 */               if (!num.equals(0)) {
                            oolIl0ii13 = num;
/* 476 */                   if (!numValueOf3.equals(0)) {
/* 483 */                       if (!num.equals(2) || numValueOf3.equals(1)) {
/* 496 */                           if (numValueOf3.equals(2)) {
/* 498 */                               boolean zEquals = num.equals(1);
                                        oolIl0ii13 = num;
/* 502 */                               if (zEquals) {
/* 505 */                                   boolean zEquals2 = num.equals(numValueOf3);
                                            oolIl0ii13 = num;
/* 509 */                                   if (!zEquals2) {
/* 512 */                                       oolIl0ii13 = oolIl0ii12;
                                            }
                                        }
                                    }
                                }
                            }
/* 516 */                   Integer numValueOf4 = Integer.valueOf(iio1oiI4.I00000oOI);
/* 524 */                   if (numValueOf2.equals(0)) {
                            }
/* 544 */                   if (oolIl0ii13 != null) {
                            }
/* 552 */                   iio1oiI = oolIl0ii12;
                            break;
                        }
/* 470 */               oolIl0ii13 = numValueOf3;
/* 516 */               Integer numValueOf42 = Integer.valueOf(iio1oiI4.I00000oOI);
/* 524 */               if (numValueOf2.equals(0)) {
                            oolIl0ii14 = numValueOf2;
/* 532 */                   if (!numValueOf42.equals(0)) {
/* 535 */                       boolean zEquals3 = numValueOf2.equals(numValueOf42);
                                oolIl0ii14 = numValueOf2;
/* 539 */                       if (!zEquals3) {
/* 542 */                           oolIl0ii14 = oolIl0ii12;
                                }
                            }
                        } else {
/* 526 */                   oolIl0ii14 = numValueOf42;
                        }
/* 544 */               if (oolIl0ii13 != null || oolIl0ii14 == null) {
/* 552 */                   iio1oiI = oolIl0ii12;
                            break;
                        }
/* 549 */               i++;
                        numValueOf2 = oolIl0ii14;
                        num = oolIl0ii13;
                    }
/* 565 */           iio1oiI = new Iio1oiI(num.intValue(), numValueOf2.intValue());
/* 568 */           if (iio1oiI == null) {
/* 714 */               I000II.I000iOII("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
/* 900 */               return oolIl0ii12;
                    }
/* 572 */           oI0oiliol10OI000o00OoI0I.I0010I0i(IoiIOIliOIi1.I0010o, iio1oiI);
/* 575 */           I1ioiI i1ioiI2 = OolIl0ii1.I00O0i0ii;
/* 577 */           Range rangeExtend = I1lIoOIi.I000O01llI0;
/* 579 */           Iterator it9 = hashSet.iterator();
/* 587 */           while (it9.hasNext()) {
/* 601 */               Range range = (Range) ((OolIl0ii1) it9.next()).I00000oOI(OolIl0ii1.I00O0i0ii, rangeExtend);
/* 603 */               Objects.requireNonNull(range);
/* 612 */               if (I1lIoOIi.I000O01llI0.equals(rangeExtend)) {
/* 614 */                   rangeExtend = range;
                        } else {
                            try {
/* 616 */                       rangeExtend = rangeExtend.intersect(range);
                            } catch (IllegalArgumentException unused) {
/* 621 */                       Objects.toString(rangeExtend);
/* 624 */                       range.toString();
/* 629 */                       l11I11lO.I0000O(3, "VirtualCameraAdapter");
/* 632 */                       rangeExtend = rangeExtend.extend(range);
                            }
                        }
                    }
/* 636 */           oI0oiliol10OI000o00OoI0I.I0010I0i(i1ioiI2, rangeExtend);
/* 641 */           Iterator it10 = oooo00lI.I00iOIl.iterator();
/* 649 */           while (it10.hasNext()) {
/* 663 */               OolIl0ii1 oolIl0ii16 = (OolIl0ii1) oooo00lI.I00l0OO0IO.get((Ool10o) it10.next());
/* 665 */               Objects.requireNonNull(oolIl0ii16);
/* 672 */               if (oolIl0ii16.I00111O() != 0) {
/* 684 */                   oI0oiliol10OI000o00OoI0I.I0010I0i(OolIl0ii1.I00OOll1, Integer.valueOf(oolIl0ii16.I00111O()));
                        }
/* 691 */               if (oolIl0ii16.I001l0I00() != 0) {
/* 703 */                   oI0oiliol10OI000o00OoI0I.I0010I0i(OolIl0ii1.I00OIo, Integer.valueOf(oolIl0ii16.I001l0I00()));
                        }
                    }
/* 707 */           return oolIii00oi1.I00100o1O0lo();
                }

                @Override
                public final void I001IO000() {
/* 2 */             this.I00000oIO = true;
/* 8 */             Iterator it = this.I0010o.I00iOIl.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                ((Ool10o) it.next()).I001IO000();
                    }
                }

                @Override
                public final void I001i1O0Ol() {
/* 2 */             this.I00000oIO = false;
/* 8 */             Iterator it = this.I0010o.I00iOIl.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                ((Ool10o) it.next()).I001i1O0Ol();
                    }
                }

                @Override
                public final I1lIoOIi I001i1lo1io(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 3 */             this.I001lllioOl.I00000oIO(iOlOo1ll1l1);
/* 16 */            I00II0Ol1O0l(List.of(this.I001lllioOl.I0000Il00O()));
/* 21 */            IOiOol0 iOiOol0I00000oOI = this.I000OiO.I00000oOI();
/* 25 */            iOiOol0I00000oOI.I00io1l = iOlOo1ll1l1;
/* 27 */            return iOiOol0I00000oOI.I0000O();
                }

                @Override
                public final I1lIoOIi I001iOo1i0O(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 1 */             Objects.toString(i1lIoOIi);
/* 4 */             Objects.toString(i1lIoOIi2);
/* 10 */            l11I11lO.I0000O(3, "StreamSharing");
/* 48 */            I00II0Ol1O0l(I00IOO(I0001Ioi1lo(), I000OiO() == null ? null : I000OiO().I0010o().I0001Ioi1lo(), this.I000OOo1O, i1lIoOIi, i1lIoOIi2));
/* 51 */            I00100l0();
/* 42 */            return i1lIoOIi;
                }

                @Override
                public final void I001l0I00() {
/* 1 */             I00IO1oi11O();
/* 4 */             Oooo00lI oooo00lI = this.I0010o;
/* 8 */             Iterator it = oooo00lI.I00iOIl.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                Ool10o ool10o = (Ool10o) it.next();
/* 30 */                OoolooO ooolooO = (OoolooO) oooo00lI.I00iiO.get(ool10o);
/* 32 */                Objects.requireNonNull(ooolooO);
/* 35 */                ool10o.I001lloI(ooolooO);
                    }
                }

                public final void I00IO1(OilliIo0l0OI oilliIo0l0OI, String str, String str2, OolIl0ii1 oolIl0ii1, I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 1 */             Oilll1I oilll1I = this.I00II0Ol1O0l;
/* 3 */             if (oilll1I != null) {
/* 5 */                 oilll1I.I00000oOI();
                    }
/* 12 */            OlOO1I olOO1I = new OlOO1I();
/* 15 */            olOO1I.I00000oIO = this;
/* 17 */            olOO1I.I00000oOI = str;
/* 19 */            olOO1I.I0000Il00O = str2;
/* 21 */            olOO1I.I0000O = oolIl0ii1;
/* 23 */            olOO1I.I0000oI00 = i1lIoOIi;
/* 25 */            olOO1I.I0001Ioi1lo = i1lIoOIi2;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            Oilll1I oilll1I2 = new Oilll1I(olOO1I);
/* 33 */            this.I00II0Ol1O0l = oilll1I2;
/* 35 */            oilliIo0l0OI.I0001Ioi1lo = oilll1I2;
                }

                public final void I00IO1oi11O() {
/* 1 */             Oilll1I oilll1I = this.I00II0Ol1O0l;
/* 4 */             if (oilll1I != null) {
/* 6 */                 oilll1I.I00000oOI();
/* 9 */                 this.I00II0Ol1O0l = null;
                    }
/* 11 */            OlioOil olioOil = this.I001i1lo1io;
/* 13 */            if (olioOil != null) {
/* 15 */                olioOil.I00000oOI();
/* 18 */                this.I001i1lo1io = null;
                    }
/* 20 */            OlioOil olioOil2 = this.I001iOo1i0O;
/* 22 */            if (olioOil2 != null) {
/* 24 */                olioOil2.I00000oOI();
/* 27 */                this.I001iOo1i0O = null;
                    }
/* 29 */            OlioOil olioOil3 = this.I001l0I00;
/* 31 */            if (olioOil3 != null) {
/* 33 */                olioOil3.I00000oOI();
/* 36 */                this.I001l0I00 = null;
                    }
/* 38 */            OlioOil olioOil4 = this.I001lIiIIo1O;
/* 40 */            if (olioOil4 != null) {
/* 42 */                olioOil4.I00000oOI();
/* 45 */                this.I001lIiIIo1O = null;
                    }
/* 47 */            IoIlOo1o0IIl ioIlOo1o0IIl = this.I001IO000;
/* 49 */            if (ioIlOo1o0IIl != null) {
/* 55 */                ((Olioli) ioIlOo1o0IIl.I00iiI).I00000oIO();
/* 62 */                OOIl1i1 oOIl1i1 = new OOIl1i1(11);
/* 65 */                oOIl1i1.I00iiI = ioIlOo1o0IIl;
/* 67 */                VarHandle.storeStoreFence();
/* 70 */                lOllIO.I0000Il00O(oOIl1i1);
/* 73 */                this.I001IO000 = null;
                    }
/* 75 */            I1ii1o0 i1ii1o0 = this.I001i1O0Ol;
/* 77 */            if (i1ii1o0 != null) {
/* 83 */                ((Olioli) i1ii1o0.I00iiI).I00000oIO();
/* 90 */                I0100i i0100i = new I0100i(21);
/* 93 */                i0100i.I00iiI = i1ii1o0;
/* 95 */                VarHandle.storeStoreFence();
/* 98 */                lOllIO.I0000Il00O(i0100i);
/* 101 */               this.I001i1O0Ol = null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final List I00IOO(String str, String str2, OolIl0ii1 oolIl0ii1, I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
                    boolean z;
/* 7 */             Iio1oiI iio1oiI = i1lIoOIi.I0000Il00O;
/* 9 */             lOllIO.I00000oIO();
/* 15 */            Oooo00lI oooo00lI = this.I0010o;
/* 17 */            boolean z2 = false;
/* 18 */            if (i1lIoOIi2 == null) {
/* 27 */                OlioOil olioOilI00IioO0OiOi = I00IioO0OiOi(str, str2, oolIl0ii1, i1lIoOIi, null);
/* 32 */                IIllOo0 iIllOo0I0000O = I0000O();
/* 36 */                Objects.requireNonNull(iIllOo0I0000O);
/* 47 */                Olioli olioli = (Olioli) iIIlIiI001Il.I00000oIO.apply(iio1oiI);
/* 51 */                IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(28, z2);
/* 54 */                ioIlOo1o0IIl.I00iiO = iIllOo0I0000O;
/* 56 */                ioIlOo1o0IIl.I00iiI = olioli;
/* 58 */                VarHandle.storeStoreFence();
/* 61 */                this.I001IO000 = ioIlOo1o0IIl;
/* 69 */                boolean z3 = this.I000l1 != null;
/* 74 */                int iI001lloI = ((IoiIli1i0Oil) this.I000OOo1O).I001lloI(0);
/* 78 */                oooo00lI.getClass();
/* 83 */                HashMap map = new HashMap();
/* 88 */                Iterator it = oooo00lI.I00iOIl.iterator();
/* 96 */                while (it.hasNext()) {
/* 102 */                   Ool10o ool10o = (Ool10o) it.next();
/* 104 */                   Oi0Oo1OIoOo oi0Oo1OIoOo = oooo00lI.I00li1OI;
/* 106 */                   IIllOo0 iIllOo0 = oooo00lI.I00ilO0;
/* 108 */                   Oooo00lI oooo00lI2 = oooo00lI;
/* 110 */                   boolean z4 = z3;
/* 113 */                   I1l1llI1 i1l1llI1I001IIilI0O = oooo00lI2.I001IIilI0O(ool10o, oi0Oo1OIoOo, iIllOo0, olioOilI00IioO0OiOi, iI001lloI, z4);
/* 133 */                   int iI000o00OoI0I = oooo00lI2.I00ilO0.I0000Il00O().I000o00OoI0I(((IoiIli1i0Oil) ool10o.I000OOo1O).I001lloI(0));
/* 143 */                   OoolooO ooolooO = (OoolooO) oooo00lI2.I00iiO.get(ool10o);
/* 145 */                   Objects.requireNonNull(ooolooO);
/* 150 */                   ooolooO.I00iiO.I00iiO = iI000o00OoI0I;
/* 152 */                   map.put(ool10o, i1l1llI1I001IIilI0O);
/* 157 */                   oooo00lI = oooo00lI2;
/* 158 */                   z3 = z4;
                        }
/* 161 */               Oooo00lI oooo00lI3 = oooo00lI;
/* 163 */               boolean z5 = z3;
/* 174 */               ArrayList arrayList = new ArrayList(map.values());
/* 177 */               if (olioOilI00IioO0OiOi == null) {
/* 534 */                   IOOlIIilOl0.I000II("Null surfaceEdge");
/* 166 */                   return null;
                        }
/* 181 */               Olioli olioli2 = (Olioli) ioIlOo1o0IIl.I00iiI;
/* 183 */               lOllIO.I00000oIO();
/* 186 */               Objects.toString(olioli2);
/* 189 */               Objects.toString(olioOilI00IioO0OiOi);
/* 192 */               l11I11lO.I0000O(3, "SurfaceProcessorNode");
/* 195 */               Iterator it2 = arrayList.iterator();
/* 203 */               while (it2.hasNext()) {
/* 211 */                   Objects.toString((I1l1llI1) it2.next());
/* 214 */                   l11I11lO.I0000O(3, "SurfaceProcessorNode");
                        }
/* 223 */               ioIlOo1o0IIl.I00iio = new Iio111Ii0();
/* 225 */               Iterator it3 = arrayList.iterator();
/* 233 */               while (it3.hasNext()) {
/* 239 */                   I1l1llI1 i1l1llI1 = (I1l1llI1) it3.next();
/* 243 */                   Iio111Ii0 iio111Ii0 = (Iio111Ii0) ioIlOo1o0IIl.I00iio;
/* 245 */                   Rect rect = i1l1llI1.I0000O;
/* 247 */                   int i = i1l1llI1.I0001Ioi1lo;
/* 249 */                   boolean z6 = i1l1llI1.I000II;
/* 255 */                   Matrix matrix = new Matrix(olioOilI00IioO0OiOi.I00000oOI);
/* 260 */                   RectF rectF = new RectF(rect);
/* 263 */                   Size size = i1l1llI1.I0000oI00;
/* 265 */                   Iterator it4 = it3;
/* 275 */                   matrix.postConcat(OoI0lIiO.I00000oIO(rectF, OoI0lIiO.I000O01llI0(size), i, z6));
/* 291 */                   lII1OI11o1I.I00000oOI(OoI0lIiO.I0000O(OoI0lIiO.I000II(i, OoI0lIiO.I0001Ioi1lo(rect)), false, size));
/* 300 */                   HashMap map2 = map;
/* 306 */                   Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
/* 311 */                   IOiOol0 iOiOol0I00000oOI = olioOilI00IioO0OiOi.I000II.I00000oOI();
/* 315 */                   iOiOol0I00000oOI.I00iiI = size;
/* 357 */                   iio111Ii0.put(i1l1llI1, new OlioOil(i1l1llI1.I00000oOI, i1l1llI1.I0000Il00O, iOiOol0I00000oOI.I0000O(), matrix, false, rect2, olioOilI00IioO0OiOi.I000OOo1O - i, -1, olioOilI00IioO0OiOi.I0000oI00 != z6));
/* 360 */                   it3 = it4;
/* 362 */                   map = map2;
                        }
/* 367 */               HashMap map3 = map;
/* 378 */               olioli2.I00000oOI(olioOilI00IioO0OiOi.I0000O((IIllOo0) ioIlOo1o0IIl.I00iiO, true));
/* 397 */               for (Map.Entry entry : ((Iio111Ii0) ioIlOo1o0IIl.I00iio).entrySet()) {
/* 405 */                   ioIlOo1o0IIl.I000o00OoI0I(olioOilI00IioO0OiOi, entry);
/* 412 */                   OlioOil olioOil = (OlioOil) entry.getValue();
/* 418 */                   I00ioIO i00ioIO = new I00ioIO(14);
/* 421 */                   i00ioIO.I00iiI = ioIlOo1o0IIl;
/* 423 */                   i00ioIO.I00iiO = olioOilI00IioO0OiOi;
/* 425 */                   i00ioIO.I00iio = entry;
/* 427 */                   VarHandle.storeStoreFence();
/* 430 */                   olioOil.getClass();
/* 433 */                   lOllIO.I00000oIO();
/* 436 */                   olioOil.I00000oIO();
/* 441 */                   olioOil.I000lI.add(i00ioIO);
                        }
/* 447 */               Iio111Ii0 iio111Ii02 = (Iio111Ii0) ioIlOo1o0IIl.I00iio;
/* 452 */               Olioo011il1 olioo011il1 = new Olioo011il1(0);
/* 455 */               olioo011il1.I00000oOI = iio111Ii02;
/* 457 */               VarHandle.storeStoreFence();
/* 462 */               olioOilI00IioO0OiOi.I000oI1ioi.add(olioo011il1);
/* 467 */               Iio111Ii0 iio111Ii03 = (Iio111Ii0) ioIlOo1o0IIl.I00iio;
/* 471 */               HashMap map4 = new HashMap();
/* 486 */               for (Map.Entry entry2 : map3.entrySet()) {
/* 510 */                   map4.put((Ool10o) entry2.getKey(), (OlioOil) iio111Ii03.get(entry2.getValue()));
                        }
/* 518 */               oooo00lI3.I001l0I00(map4, oooo00lI3.I001i1lo1io(olioOilI00IioO0OiOi, z5));
/* 527 */               return List.of(this.I001lllioOl.I0000Il00O());
                    }
/* 542 */           OlioOil olioOilI00IioO0OiOi2 = I00IioO0OiOi(str, str2, oolIl0ii1, i1lIoOIi, i1lIoOIi2);
/* 549 */           Matrix matrix2 = this.I000lI;
/* 551 */           IIllOo0 iIllOo0I000OiO = I000OiO();
/* 555 */           Objects.requireNonNull(iIllOo0I000OiO);
/* 558 */           boolean zI00100o1O0lo = iIllOo0I000OiO.I00100o1O0lo();
/* 562 */           Size size2 = i1lIoOIi2.I00000oIO;
/* 564 */           Rect rect3 = this.I000l1;
/* 566 */           if (rect3 != null) {
/* 568 */               z = false;
                    } else {
/* 580 */               z = false;
/* 581 */               rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
                    }
/* 584 */           IIllOo0 iIllOo0I000OiO2 = I000OiO();
/* 588 */           Objects.requireNonNull(iIllOo0I000OiO2);
/* 591 */           int iI000OOo1O = I000OOo1O(iIllOo0I000OiO2, z);
/* 595 */           IIllOo0 iIllOo0I000OiO3 = I000OiO();
/* 599 */           Objects.requireNonNull(iIllOo0I000OiO3);
/* 613 */           Oooo00lI oooo00lI4 = oooo00lI;
/* 616 */           OlioOil olioOil2 = new OlioOil(3, 34, i1lIoOIi2, matrix2, zI00100o1O0lo, rect3, iI000OOo1O, -1, I000o00OoI0I(iIllOo0I000OiO3));
/* 619 */           this.I001iOo1i0O = olioOil2;
/* 625 */           Objects.requireNonNull(I000OiO());
/* 628 */           this.I001lIiIIo1O = olioOil2;
/* 634 */           OilliIo0l0OI oilliIo0l0OII00IlilI0i0i = I00IlilI0i0i(this.I001iOo1i0O, oolIl0ii1, i1lIoOIi2);
/* 638 */           this.I001lloI = oilliIo0l0OII00IlilI0i0i;
/* 648 */           I00IO1(oilliIo0l0OII00IlilI0i0i, str, str2, oolIl0ii1, i1lIoOIi, i1lIoOIi2);
/* 651 */           OlioOil olioOil3 = this.I001lIiIIo1O;
/* 653 */           IIllOo0 iIllOo0I0000O2 = I0000O();
/* 657 */           IIllOo0 iIllOo0I000OiO4 = I000OiO();
/* 673 */           Olioli olioli3 = (Olioli) iIO0Oio.I00000oIO.invoke(iio1oiI, this.I00111O, this.I001IIilI0O);
/* 677 */           I1ii1o0 i1ii1o0 = new I1ii1o0(7, false);
/* 680 */           i1ii1o0.I00iiO = iIllOo0I0000O2;
/* 682 */           i1ii1o0.I00iio = iIllOo0I000OiO4;
/* 684 */           i1ii1o0.I00iiI = olioli3;
/* 686 */           VarHandle.storeStoreFence();
/* 689 */           this.I001i1O0Ol = i1ii1o0;
/* 697 */           boolean z7 = this.I000l1 != null;
/* 703 */           int iI001lloI2 = ((IoiIli1i0Oil) this.I000OOo1O).I001lloI(0);
/* 707 */           oooo00lI4.getClass();
/* 712 */           HashMap map5 = new HashMap();
/* 717 */           Iterator it5 = oooo00lI4.I00iOIl.iterator();
/* 725 */           while (it5.hasNext()) {
/* 732 */               Ool10o ool10o2 = (Ool10o) it5.next();
/* 739 */               Oooo00lI oooo00lI5 = oooo00lI4;
/* 740 */               I1l1llI1 i1l1llI1I001IIilI0O2 = oooo00lI5.I001IIilI0O(ool10o2, oooo00lI4.I00li1OI, oooo00lI4.I00ilO0, olioOilI00IioO0OiOi2, iI001lloI2, z7);
/* 744 */               Oi0Oo1OIoOo oi0Oo1OIoOo2 = oooo00lI5.I00ll1;
/* 746 */               Objects.requireNonNull(oi0Oo1OIoOo2);
/* 749 */               IIllOo0 iIllOo02 = oooo00lI5.I00io1l;
/* 751 */               Objects.requireNonNull(iIllOo02);
/* 754 */               OlioOil olioOil4 = olioOil3;
/* 755 */               I1l1llI1 i1l1llI1I001IIilI0O3 = oooo00lI5.I001IIilI0O(ool10o2, oi0Oo1OIoOo2, iIllOo02, olioOil4, iI001lloI2, z7);
/* 774 */               int iI000o00OoI0I2 = oooo00lI5.I00ilO0.I0000Il00O().I000o00OoI0I(((IoiIli1i0Oil) ool10o2.I000OOo1O).I001lloI(0));
/* 784 */               OoolooO ooolooO2 = (OoolooO) oooo00lI5.I00iiO.get(ool10o2);
/* 786 */               Objects.requireNonNull(ooolooO2);
/* 791 */               ooolooO2.I00iiO.I00iiO = iI000o00OoI0I2;
/* 795 */               I1l011l i1l011l = new I1l011l();
/* 798 */               i1l011l.I00000oIO = i1l1llI1I001IIilI0O2;
/* 800 */               i1l011l.I00000oOI = i1l1llI1I001IIilI0O3;
/* 802 */               VarHandle.storeStoreFence();
/* 805 */               map5.put(ool10o2, i1l011l);
/* 808 */               oooo00lI4 = oooo00lI5;
/* 809 */               olioOil3 = olioOil4;
                    }
/* 811 */           OlioOil olioOil5 = olioOil3;
/* 812 */           Oooo00lI oooo00lI6 = oooo00lI4;
/* 813 */           I1ii1o0 i1ii1o02 = this.I001i1O0Ol;
/* 821 */           ArrayList arrayList2 = new ArrayList(map5.values());
/* 826 */           I1l01I0lo0 i1l01I0lo0 = new I1l01I0lo0();
/* 829 */           if (olioOilI00IioO0OiOi2 == null) {
/* 1263 */              IOOlIIilOl0.I000II("Null primarySurfaceEdge");
/* 540 */               return null;
                    }
/* 831 */           i1l01I0lo0.I00000oIO = olioOilI00IioO0OiOi2;
/* 833 */           if (olioOil5 == null) {
/* 1257 */              IOOlIIilOl0.I000II("Null secondarySurfaceEdge");
/* 540 */               return null;
                    }
/* 835 */           i1l01I0lo0.I00000oOI = olioOil5;
/* 837 */           i1l01I0lo0.I0000Il00O = arrayList2;
/* 839 */           VarHandle.storeStoreFence();
/* 842 */           i1ii1o02.getClass();
/* 845 */           lOllIO.I00000oIO();
/* 850 */           Olioli olioli4 = (Olioli) i1ii1o02.I00iiI;
/* 852 */           Objects.toString(olioli4);
/* 855 */           Objects.toString(olioOilI00IioO0OiOi2);
/* 858 */           Objects.toString(olioOil5);
/* 863 */           l11I11lO.I0000O(3, "DualSurfaceProcessorNode");
/* 866 */           Iterator it6 = arrayList2.iterator();
/* 874 */           while (it6.hasNext()) {
/* 882 */               Objects.toString((I1l011l) it6.next());
/* 885 */               l11I11lO.I0000O(3, "SurfaceProcessorNode");
                    }
/* 889 */           i1ii1o02.I00ilO0 = i1l01I0lo0;
/* 896 */           i1ii1o02.I00ilI0I1 = new Iio111Ii0();
/* 900 */           I1l01I0lo0 i1l01I0lo02 = (I1l01I0lo0) i1ii1o02.I00ilO0;
/* 902 */           OlioOil olioOil6 = i1l01I0lo02.I00000oIO;
/* 904 */           OlioOil olioOil7 = i1l01I0lo02.I00000oOI;
/* 908 */           Iterator it7 = i1l01I0lo02.I0000Il00O.iterator();
/* 916 */           while (it7.hasNext()) {
/* 922 */               I1l011l i1l011l2 = (I1l011l) it7.next();
/* 926 */               Iio111Ii0 iio111Ii04 = (Iio111Ii0) i1ii1o02.I00ilI0I1;
/* 928 */               I1l1llI1 i1l1llI12 = i1l011l2.I00000oIO;
/* 930 */               Rect rect4 = i1l1llI12.I0000O;
/* 932 */               int i2 = i1l1llI12.I0001Ioi1lo;
/* 934 */               boolean z8 = i1l1llI12.I000II;
/* 936 */               Iterator it8 = it7;
/* 940 */               HashMap map6 = map5;
/* 944 */               Matrix matrix3 = new Matrix(olioOil6.I00000oOI);
/* 949 */               RectF rectF2 = new RectF(rect4);
/* 954 */               Size size3 = i1l1llI12.I0000oI00;
/* 964 */               matrix3.postConcat(OoI0lIiO.I00000oIO(rectF2, OoI0lIiO.I000O01llI0(size3), i2, z8));
/* 980 */               lII1OI11o1I.I00000oOI(OoI0lIiO.I0000O(OoI0lIiO.I000II(i2, OoI0lIiO.I0001Ioi1lo(rect4)), false, size3));
/* 997 */               Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
/* 1002 */              IOiOol0 iOiOol0I00000oOI2 = olioOil6.I000II.I00000oOI();
/* 1006 */              iOiOol0I00000oOI2.I00iiI = size3;
/* 1048 */              iio111Ii04.put(i1l011l2, new OlioOil(i1l1llI12.I00000oOI, i1l1llI12.I0000Il00O, iOiOol0I00000oOI2.I0000O(), matrix3, false, rect5, olioOil6.I000OOo1O - i2, -1, olioOil6.I0000oI00 != z8));
/* 1053 */              it7 = it8;
/* 1055 */              map5 = map6;
                    }
/* 1059 */          HashMap map7 = map5;
/* 1070 */          olioli4.I00000oOI(olioOil6.I0000O((IIllOo0) i1ii1o02.I00iiO, true));
/* 1082 */          olioli4.I00000oOI(olioOil7.I0000O((IIllOo0) i1ii1o02.I00iio, false));
/* 1089 */          IIllOo0 iIllOo03 = (IIllOo0) i1ii1o02.I00iiO;
/* 1095 */          IIllOo0 iIllOo04 = (IIllOo0) i1ii1o02.I00iio;
/* 1113 */          for (Map.Entry entry3 : ((Iio111Ii0) i1ii1o02.I00ilI0I1).entrySet()) {
/* 1129 */              i1ii1o02.I001i1O0Ol(iIllOo03, iIllOo04, olioOil6, olioOil7, entry3);
/* 1142 */              OlioOil olioOil8 = (OlioOil) entry3.getValue();
/* 1147 */              Iio1010 iio1010 = new Iio1010(0);
/* 1150 */              iio1010.I00iiI = i1ii1o02;
/* 1152 */              iio1010.I00iiO = iIllOo03;
/* 1154 */              iio1010.I00iio = iIllOo04;
/* 1156 */              iio1010.I00ilI0I1 = olioOil6;
/* 1158 */              iio1010.I00ilO0 = olioOil7;
/* 1160 */              iio1010.I00io1l = entry3;
/* 1162 */              VarHandle.storeStoreFence();
/* 1165 */              olioOil8.getClass();
/* 1168 */              lOllIO.I00000oIO();
/* 1171 */              olioOil8.I00000oIO();
/* 1176 */              olioOil8.I000lI.add(iio1010);
                    }
/* 1182 */          Iio111Ii0 iio111Ii05 = (Iio111Ii0) i1ii1o02.I00ilI0I1;
/* 1186 */          HashMap map8 = new HashMap();
/* 1201 */          for (Map.Entry entry4 : map7.entrySet()) {
/* 1225 */              map8.put((Ool10o) entry4.getKey(), (OlioOil) iio111Ii05.get(entry4.getValue()));
                    }
/* 1233 */          oooo00lI6.I001l0I00(map8, oooo00lI6.I001i1lo1io(olioOilI00IioO0OiOi2, z7));
/* 1250 */          return List.of(this.I001lllioOl.I0000Il00O(), this.I001lloI.I0000Il00O());
                }

                public final OlioOil I00IioO0OiOi(String str, String str2, OolIl0ii1 oolIl0ii1, I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 3 */             Matrix matrix = this.I000lI;
/* 5 */             IIllOo0 iIllOo0I0000O = I0000O();
/* 9 */             Objects.requireNonNull(iIllOo0I0000O);
/* 12 */            boolean zI00100o1O0lo = iIllOo0I0000O.I00100o1O0lo();
/* 16 */            Size size = i1lIoOIi.I00000oIO;
/* 18 */            Rect rect = this.I000l1;
/* 21 */            if (rect == null) {
/* 34 */                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
                    }
/* 37 */            IIllOo0 iIllOo0I0000O2 = I0000O();
/* 41 */            Objects.requireNonNull(iIllOo0I0000O2);
/* 44 */            int iI000OOo1O = I000OOo1O(iIllOo0I0000O2, false);
/* 48 */            IIllOo0 iIllOo0I0000O3 = I0000O();
/* 52 */            Objects.requireNonNull(iIllOo0I0000O3);
/* 65 */            OlioOil olioOil = new OlioOil(3, 34, i1lIoOIi, matrix, zI00100o1O0lo, rect, iI000OOo1O, -1, I000o00OoI0I(iIllOo0I0000O3));
/* 68 */            this.I001i1lo1io = olioOil;
/* 74 */            Objects.requireNonNull(I0000O());
/* 77 */            this.I001l0I00 = olioOil;
/* 81 */            OilliIo0l0OI oilliIo0l0OII00IlilI0i0i = I00IlilI0i0i(this.I001i1lo1io, oolIl0ii1, i1lIoOIi);
/* 85 */            this.I001lllioOl = oilliIo0l0OII00IlilI0i0i;
/* 94 */            I00IO1(oilliIo0l0OII00IlilI0i0i, str, str2, oolIl0ii1, i1lIoOIi, i1lIoOIi2);
/* 97 */            return this.I001l0I00;
                }

                public final OilliIo0l0OI I00IlilI0i0i(OlioOil olioOil, OolIl0ii1 oolIl0ii1, I1lIoOIi i1lIoOIi) {
/* 3 */             OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O(oolIl0ii1, i1lIoOIi.I00000oIO);
/* 7 */             I0oiil10Ili i0oiil10Ili = oilliIo0l0OII0000O.I00000oOI;
/* 9 */             Oooo00lI oooo00lI = this.I0010o;
/* 13 */            Iterator it = oooo00lI.I00iOIl.iterator();
/* 18 */            int i = -1;
/* 23 */            while (it.hasNext()) {
/* 43 */                int i2 = ((OillooOlI) ((Ool10o) it.next()).I000OOo1O.I0000O(OolIl0ii1.I00Io1lO)).I000II.I0000Il00O;
/* 45 */                List list = OillooOlI.I000OiO;
/* 63 */                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
/* 66 */                    i = i2;
                        }
                    }
/* 68 */            if (i != -1) {
/* 70 */                i0oiil10Ili.I00iiI = i;
                    }
/* 72 */            Size size = i1lIoOIi.I00000oIO;
/* 76 */            Iterator it2 = oooo00lI.I00iOIl.iterator();
/* 84 */            while (it2.hasNext()) {
/* 98 */                OillooOlI oillooOlII0000Il00O = OilliIo0l0OI.I0000O(((Ool10o) it2.next()).I000OOo1O, size).I0000Il00O();
/* 102 */               IIoo00iOol0 iIoo00iOol0 = oillooOlII0000Il00O.I000II;
/* 106 */               i0oiil10Ili.I0000Il00O(iIoo00iOol0.I0000O);
/* 109 */               List<IIl1Ol> list2 = oillooOlII0000Il00O.I0000oI00;
/* 111 */               ArrayList arrayList = oilliIo0l0OII0000O.I0000oI00;
/* 121 */               for (IIl1Ol iIl1Ol : list2) {
/* 129 */                   i0oiil10Ili.I0000O(iIl1Ol);
/* 136 */                   if (!arrayList.contains(iIl1Ol)) {
/* 138 */                       arrayList.add(iIl1Ol);
                            }
                        }
/* 152 */               for (CameraCaptureSession.StateCallback stateCallback : oillooOlII0000Il00O.I0000O) {
/* 160 */                   ArrayList arrayList2 = oilliIo0l0OII0000O.I0000O;
/* 166 */                   if (!arrayList2.contains(stateCallback)) {
/* 169 */                       arrayList2.add(stateCallback);
                            }
                        }
/* 185 */               for (CameraDevice.StateCallback stateCallback2 : oillooOlII0000Il00O.I0000Il00O) {
/* 193 */                   ArrayList arrayList3 = oilliIo0l0OII0000O.I0000Il00O;
/* 199 */                   if (!arrayList3.contains(stateCallback2)) {
/* 202 */                       arrayList3.add(stateCallback2);
                            }
                        }
/* 208 */               i0oiil10Ili.I0000oI00(iIoo00iOol0.I00000oOI);
                    }
/* 213 */           olioOil.getClass();
/* 216 */           lOllIO.I00000oIO();
/* 219 */           olioOil.I00000oIO();
/* 228 */           lII1OI11o1I.I0000oI00("Consumer can only be linked once.", !olioOil.I000OiO);
/* 231 */           olioOil.I000OiO = true;
/* 237 */           oilliIo0l0OII0000O.I00000oOI(olioOil.I000l1, i1lIoOIi.I0000Il00O, -1);
/* 242 */           i0oiil10Ili.I0000O(oooo00lI.I00ioIO);
/* 245 */           IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi.I0001Ioi1lo;
/* 247 */           if (iOlOo1ll1l1 != null) {
/* 249 */               i0oiil10Ili.I0000oI00(iOlOo1ll1l1);
                    }
/* 254 */           oilliIo0l0OII0000O.I000O01llI0 = i1lIoOIi.I0000O;
/* 256 */           I00000oIO(oilliIo0l0OII0000O, i1lIoOIi);
/* 408 */           return oilliIo0l0OII0000O;
                }
            }
