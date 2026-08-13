            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import android.media.MediaCodec;
            import android.util.Range;
            import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            
            public final class Oilloi0llol1 extends OilliIlOO {
                public final O1ilIl1l0I I000OiO;
                public boolean I000iOII;
                public final StringBuilder I000l1;
                public boolean I000lI;
                public final ArrayList I000o00OoI0I;

                public Oilloi0llol1() {
/* 7 */             O1ilIl1l0I o1ilIl1l0I = new O1ilIl1l0I(1);
/* 24 */            o1ilIl1l0I.I00iiI = IiOol00iooil.I00000oIO.I00000oOI(SurfaceOrderQuirk.class) != null;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            this.I000OiO = o1ilIl1l0I;
/* 31 */            this.I000iOII = true;
/* 38 */            this.I000l1 = new StringBuilder();
/* 40 */            this.I000lI = false;
/* 47 */            this.I000o00OoI0I = new ArrayList();
                }

                public final void I00000oIO(OillooOlI oillooOlI) {
/* 6 */             I0oiil10Ili i0oiil10Ili = this.I00000oOI;
/* 10 */            HashSet hashSet = (HashSet) i0oiil10Ili.I00iiO;
/* 12 */            IIoo00iOol0 iIoo00iOol0 = oillooOlI.I000II;
/* 14 */            OIil0iio0 oIil0iio0 = iIoo00iOol0.I00000oOI;
/* 16 */            int i = iIoo00iOol0.I0000Il00O;
/* 19 */            if (i != -1) {
/* 22 */                this.I000lI = true;
/* 24 */                int i2 = i0oiil10Ili.I00iiI;
/* 26 */                List list = OillooOlI.I000OiO;
/* 44 */                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
/* 47 */                    i = i2;
                        }
/* 48 */                i0oiil10Ili.I00iiI = i;
                    }
/* 50 */            Range rangeI00000oIO = iIoo00iOol0.I00000oIO();
/* 54 */            Range range = I1lIoOIi.I000O01llI0;
/* 56 */            boolean zEquals = rangeI00000oIO.equals(range);
/* 60 */            StringBuilder sb = this.I000l1;
/* 64 */            if (!zEquals) {
/* 69 */                OI0oiliol10O oI0oiliol10O = (OI0oiliol10O) i0oiil10Ili.I00iio;
/* 71 */                I1ioiI i1ioiI = IIoo00iOol0.I000O01llI0;
/* 79 */                boolean zEquals2 = ((Range) oI0oiliol10O.I00000oOI(i1ioiI, range)).equals(range);
/* 85 */                OI0oiliol10O oI0oiliol10O2 = (OI0oiliol10O) i0oiil10Ili.I00iio;
/* 87 */                if (zEquals2) {
/* 89 */                    oI0oiliol10O2.I0010I0i(i1ioiI, rangeI00000oIO);
                        } else if (!((Range) oI0oiliol10O2.I00000oOI(i1ioiI, range)).equals(rangeI00000oIO)) {
/* 105 */                   this.I000iOII = false;
/* 135 */                   String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((OI0oiliol10O) i0oiil10Ili.I00iio).I00000oOI(i1ioiI, range)) + ", new = " + rangeI00000oIO;
/* 139 */                   l11I11lO.I00000oIO("ValidatingBuilder", str);
/* 142 */                   sb.append(str);
                        }
                    }
/* 145 */           I1ioiI i1ioiI2 = OolIl0ii1.I00OIo;
/* 151 */           Integer num = (Integer) oIil0iio0.I00000oOI(i1ioiI2, 0);
/* 153 */           Objects.requireNonNull(num);
/* 156 */           int iIntValue = num.intValue();
/* 160 */           if (iIntValue != 0 && iIntValue != 0) {
/* 168 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(i1ioiI2, num);
                    }
/* 171 */           I1ioiI i1ioiI3 = OolIl0ii1.I00OOll1;
/* 177 */           Integer num2 = (Integer) oIil0iio0.I00000oOI(i1ioiI3, 0);
/* 179 */           Objects.requireNonNull(num2);
/* 182 */           int iIntValue2 = num2.intValue();
/* 186 */           if (iIntValue2 != 0 && iIntValue2 != 0) {
/* 194 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(i1ioiI3, num2);
                    }
/* 207 */           ((OI10ooIio) i0oiil10Ili.I00ilO0).I00000oIO.putAll((Map) iIoo00iOol0.I0000oI00.I00000oIO);
/* 214 */           this.I0000Il00O.addAll(oillooOlI.I0000Il00O);
/* 221 */           this.I0000O.addAll(oillooOlI.I0000O);
/* 226 */           i0oiil10Ili.I0000Il00O(iIoo00iOol0.I0000O);
/* 233 */           this.I0000oI00.addAll(oillooOlI.I0000oI00);
/* 236 */           OilloOil0 oilloOil0 = oillooOlI.I0001Ioi1lo;
/* 238 */           if (oilloOil0 != null) {
/* 242 */               this.I000o00OoI0I.add(oilloOil0);
                    }
/* 245 */           InputConfiguration inputConfiguration = oillooOlI.I000OOo1O;
/* 247 */           if (inputConfiguration != null) {
/* 249 */               this.I000II = inputConfiguration;
                    }
/* 251 */           ArrayList arrayList = oillooOlI.I00000oIO;
/* 253 */           LinkedHashSet<I1lIlOi1OI0> linkedHashSet = this.I00000oIO;
/* 255 */           linkedHashSet.addAll(arrayList);
/* 264 */           hashSet.addAll(Collections.unmodifiableList(iIoo00iOol0.I00000oIO));
/* 269 */           ArrayList arrayList2 = new ArrayList();
/* 280 */           for (I1lIlOi1OI0 i1lIlOi1OI0 : linkedHashSet) {
/* 290 */               arrayList2.add(i1lIlOi1OI0.I00000oIO);
/* 295 */               Iterator it = i1lIlOi1OI0.I00000oOI.iterator();
/* 303 */               while (it.hasNext()) {
/* 311 */                   arrayList2.add((IiIO1ol1i1o0) it.next());
                        }
                    }
/* 320 */           if (!arrayList2.containsAll(hashSet)) {
/* 322 */               l11I11lO.I0000O(3, "ValidatingBuilder");
/* 325 */               this.I000iOII = false;
/* 329 */               sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
                    }
/* 332 */           int i3 = oillooOlI.I000O01llI0;
/* 334 */           int i4 = this.I000O01llI0;
/* 336 */           if (i3 != i4 && i3 != 0 && i4 != 0) {
/* 342 */               l11I11lO.I0000O(3, "ValidatingBuilder");
/* 345 */               this.I000iOII = false;
/* 349 */               sb.append("Invalid configuration due to that two non-default session types are set");
                    } else if (i3 != 0) {
/* 355 */               this.I000O01llI0 = i3;
                    }
/* 357 */           I1lIlOi1OI0 i1lIlOi1OI02 = oillooOlI.I00000oOI;
/* 359 */           if (i1lIlOi1OI02 != null) {
/* 361 */               I1lIlOi1OI0 i1lIlOi1OI03 = this.I000OOo1O;
/* 363 */               if (i1lIlOi1OI03 == i1lIlOi1OI02 || i1lIlOi1OI03 == null) {
/* 378 */                   this.I000OOo1O = i1lIlOi1OI02;
                        } else {
/* 367 */                   l11I11lO.I0000O(3, "ValidatingBuilder");
/* 370 */                   this.I000iOII = false;
/* 374 */                   sb.append("Invalid configuration due to that two different postview output configs are set");
                        }
                    }
/* 380 */           i0oiil10Ili.I0000oI00(oIil0iio0);
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OillooOlI I00000oOI() {
                    Range range;
/* 3 */             Ioi10lIoII ioi10lIoII = null;
/* 4 */             if (!this.I000iOII) {
/* 261 */               I000II.I000iOII("Unsupported session configuration combination");
/* 3 */                 return null;
                    }
/* 10 */            ArrayList arrayList = new ArrayList(this.I00000oIO);
/* 13 */            O1ilIl1l0I o1ilIl1l0I = this.I000OiO;
/* 17 */            if (o1ilIl1l0I.I00iiI) {
/* 23 */                IOi10O11O iOi10O11O = new IOi10O11O(4);
/* 26 */                iOi10O11O.I00iiI = o1ilIl1l0I;
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                Collections.sort(arrayList, iOi10O11O);
                    }
/* 34 */            int i = this.I000O01llI0;
/* 37 */            int i2 = 2;
/* 38 */            I0oiil10Ili i0oiil10Ili = this.I00000oOI;
/* 40 */            if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
/* 56 */                Iterator it = arrayList.iterator();
                        while (true) {
/* 64 */                    if (!it.hasNext()) {
                                break;
                            }
/* 82 */                    if (O0000Ioio00.I0000O(((I1lIlOi1OI0) it.next()).I00000oIO.I000OiO, MediaCodec.class)) {
/* 86 */                        HashSet hashSet = (HashSet) i0oiil10Ili.I00iiO;
/* 92 */                        if (hashSet.isEmpty()) {
/* 122 */                           OI0oiliol10O oI0oiliol10O = (OI0oiliol10O) i0oiil10Ili.I00iio;
/* 124 */                           I1ioiI i1ioiI = IIoo00iOol0.I000O01llI0;
/* 132 */                           range = (Range) oI0oiliol10O.I00000oOI(i1ioiI, I1lIoOIi.I000O01llI0);
/* 134 */                           if (range != null) {
/* 148 */                               if (((Number) range.getUpper()).intValue() < 120 || !O0000Ioio00.I0000O(range.getLower(), range.getUpper())) {
/* 165 */                                   range = null;
                                        }
/* 166 */                               if (range != null) {
/* 180 */                                   Range range2 = new Range(30, range.getUpper());
/* 183 */                                   range.toString();
/* 186 */                                   range2.toString();
/* 192 */                                   l11I11lO.I0000O(3, "HighSpeedFpsModifier");
/* 199 */                                   ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(i1ioiI, range2);
                                        }
                                    }
                                } else {
/* 95 */                            Iterator it2 = hashSet.iterator();
/* 103 */                           while (it2.hasNext()) {
/* 117 */                               if (O0000Ioio00.I0000O(((IiIO1ol1i1o0) it2.next()).I000OiO, MediaCodec.class)) {
                                            break;
                                        }
                                    }
/* 122 */                           OI0oiliol10O oI0oiliol10O2 = (OI0oiliol10O) i0oiil10Ili.I00iio;
/* 124 */                           I1ioiI i1ioiI2 = IIoo00iOol0.I000O01llI0;
/* 132 */                           range = (Range) oI0oiliol10O2.I00000oOI(i1ioiI2, I1lIoOIi.I000O01llI0);
/* 134 */                           if (range != null) {
                                    }
                                }
                            }
                        }
                    }
/* 208 */           if (!this.I000o00OoI0I.isEmpty()) {
/* 212 */               ioi10lIoII = new Ioi10lIoII(i2);
/* 215 */               ioi10lIoII.I00000oOI = this;
/* 217 */               VarHandle.storeStoreFence();
                    }
/* 255 */           return new OillooOlI(arrayList, new ArrayList(this.I0000Il00O), new ArrayList(this.I0000O), new ArrayList(this.I0000oI00), i0oiil10Ili.I0001Ioi1lo(), ioi10lIoII, this.I000II, this.I000O01llI0, this.I000OOo1O);
                }

                public final boolean I0000Il00O() {
                    return this.I000lI && this.I000iOII;
                }
            }
