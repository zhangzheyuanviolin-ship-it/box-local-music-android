            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.media.Image;
            import android.media.ImageReader;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
/* 68 */    public final class I0oO0iO1l0lo implements IoiO1ilO, O0iIllo {
                public final int I00iOIl;
                public boolean I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public I0oO0iO1l0lo(IIlo0i0ll iIlo0i0ll) {
                    Oi1ol0llI oi1ol0llI;
/* 2 */             this.I00iOIl = 2;
/* 7 */             this.I00iiO = iIlo0i0ll;
/* 11 */            IIioli iIioli = (IIioli) iIlo0i0ll;
/* 17 */            int[] iArr = (int[]) iIioli.I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 29 */            this.I00iiI = iArr != null ? I1IoiO1l.I0000oI00(iArr, 18) : false;
/* 37 */            DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) iIioli.I0000O(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
/* 39 */            if (dynamicRangeProfiles == null) {
/* 41 */                oi1ol0llI = null;
                    } else {
/* 49 */                IIOOoll iIOOoll = new IIOOoll(12);
/* 52 */                iIOOoll.I00iiI = dynamicRangeProfiles;
/* 54 */                VarHandle.storeStoreFence();
/* 59 */                oi1ol0llI = new Oi1ol0llI(iIOOoll, 9);
                    }
/* 67 */            this.I00iio = oi1ol0llI == null ? IioI11.I00iOIl : oi1ol0llI;
                }

                public static boolean I000O01llI0(Iio1oiI iio1oiI, Iio1oiI iio1oiI2) {
                    int i;
/* 1 */             boolean zI00000oOI = iio1oiI2.I00000oOI();
/* 5 */             int i2 = iio1oiI2.I00000oIO;
/* 8 */             if (zI00000oOI) {
/* 10 */                int i3 = iio1oiI.I00000oIO;
                        return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = iio1oiI.I00000oOI) == 0 || i == iio1oiI2.I00000oOI);
                    }
/* 41 */            IOOlIIilOl0.I0001Ioi1lo(iio1oiI2, "Fully specified range ", " not actually fully specified.");
/* 7 */             return false;
                }

                public static Iio1oiI I000OOo1O(Iio1oiI iio1oiI, LinkedHashSet linkedHashSet, Set set) {
                    boolean zI000O01llI0;
/* 5 */             if (iio1oiI.I00000oIO != 1) {
/* 8 */                 Iterator it = linkedHashSet.iterator();
                        while (true) {
/* 16 */                    if (!it.hasNext()) {
                                break;
                            }
/* 22 */                    Iio1oiI iio1oiI2 = (Iio1oiI) it.next();
/* 24 */                    int i = iio1oiI2.I00000oIO;
/* 30 */                    if (!iio1oiI2.I00000oOI()) {
/* 67 */                        I000II.I001IO000("Fully specified DynamicRange must have fully defined encoding.");
                                break;
                            }
/* 32 */                    if (i != 1) {
/* 39 */                        if (set.contains(iio1oiI2)) {
/* 58 */                            zI000O01llI0 = I000O01llI0(iio1oiI, iio1oiI2);
                                } else {
/* 48 */                            if (l11I11lO.I0000O(3, "CXCP")) {
/* 50 */                                Objects.toString(iio1oiI);
/* 53 */                                Objects.toString(iio1oiI2);
                                    }
/* 56 */                            zI000O01llI0 = false;
                                }
/* 62 */                        if (zI000O01llI0) {
/* 64 */                            return iio1oiI2;
                                }
                            }
                        }
                    }
/* 3 */             return null;
                }

                public static void I000iOII(Set set, Iio1oiI iio1oiI, Oi1ol0llI oi1ol0llI) {
/* 2 */             Set set2 = set;
/* 12 */            lII1OI11o1I.I0000oI00("Cannot update already-empty constraints.", !set2.isEmpty());
/* 19 */            Set setI00100o1O0lo = ((IioI0ol1O0) oi1ol0llI.I00iiI).I00100o1O0lo(iio1oiI);
/* 24 */            Set set3 = setI00100o1O0lo;
/* 30 */            if (set3.isEmpty()) {
/* 98 */                return;
                    }
/* 35 */            Set setI00iio = IOOi0Ool1i.I00iio(set);
/* 39 */            set.retainAll(set3);
/* 46 */            if (set2.isEmpty()) {
/* 88 */                throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + iio1oiI + "\nConstraints:\n  " + setI00100o1O0lo + "\nExisting constraints:\n  " + setI00iio).toString());
                    }
                }

                public static I0oO0iO1l0lo I00100o1O0lo(String str) {
/* 5 */             if (str.length() == 0) {
/* 66 */                I000II.I000iOII("The separator may not be the empty string.");
/* 69 */                return null;
                    }
/* 12 */            if (str.length() != 1) {
/* 52 */                I0i0io0oOOi i0i0io0oOOi = new I0i0io0oOOi(7);
/* 55 */                i0i0io0oOOi.I00iiI = str;
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                return new I0oO0iO1l0lo(i0i0io0oOOi);
                    }
/* 15 */            char cCharAt = str.charAt(0);
/* 21 */            lIOlll liolll = new lIOlll();
/* 24 */            liolll.I00000oIO = cCharAt;
/* 26 */            VarHandle.storeStoreFence();
/* 35 */            i1Il01 i1il01 = new i1Il01(12);
/* 38 */            i1il01.I00iiI = liolll;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return new I0oO0iO1l0lo(i1il01);
                }

                public boolean I00000oIO(long j) {
                    Object obj;
/* 7 */             ArrayList arrayList = (ArrayList) ((IoloOio0I) this.I00iio).I00iiI;
/* 9 */             int size = arrayList.size();
/* 14 */            int i = 0;
                    while (true) {
/* 15 */                if (i >= size) {
/* 36 */                    obj = null;
                            break;
                        }
/* 17 */                obj = arrayList.get(i);
/* 30 */                if (lI1ioiO0.I00000oIO(((OO1il1IIii) obj).I00000oIO, j)) {
                            break;
                        }
/* 33 */                i++;
                    }
/* 37 */            OO1il1IIii oO1il1IIii = (OO1il1IIii) obj;
/* 39 */            if (oO1il1IIii != null) {
/* 41 */                return oO1il1IIii.I000O01llI0;
                    }
/* 13 */            return false;
                }

                @Override
                public IoiO1IO1I1i I00000oOI() {
                    Image imageAcquireLatestImage;
                    synchronized (this.I00iio) {
                        try {
/* 9 */                     imageAcquireLatestImage = ((ImageReader) this.I00iiO).acquireLatestImage();
                        } catch (RuntimeException e) {
/* 27 */                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
/* 41 */                        throw e;
                            }
/* 29 */                    imageAcquireLatestImage = null;
                        }
/* 30 */                if (imageAcquireLatestImage == null) {
/* 4 */                     return null;
                        }
/* 36 */                return new I0oO01o(imageAcquireLatestImage);
                    }
                }

                @Override
                public int I0000Il00O() {
                    int imageFormat;
                    synchronized (this.I00iio) {
/* 8 */                 imageFormat = ((ImageReader) this.I00iiO).getImageFormat();
                    }
/* 13 */            return imageFormat;
                }

                @Override
                public int I0000O() {
                    int height;
                    synchronized (this.I00iio) {
/* 8 */                 height = ((ImageReader) this.I00iiO).getHeight();
                    }
/* 13 */            return height;
                }

                @Override
                public void I0000oI00() {
                    synchronized (this.I00iio) {
/* 5 */                 this.I00iiI = true;
/* 12 */                ((ImageReader) this.I00iiO).setOnImageAvailableListener(null, null);
                    }
                }

                @Override
                public int I0001Ioi1lo() {
                    int width;
                    synchronized (this.I00iio) {
/* 8 */                 width = ((ImageReader) this.I00iiO).getWidth();
                    }
/* 13 */            return width;
                }

                @Override
                public boolean I000II(OoOIOoO1I ooOIOoO1I, OoOIOoO1I ooOIOoO1I2) {
/* 1 */             boolean z = this.I00iiI;
/* 5 */             IIiIoIl11IO iIiIoIl11IO = (IIiIoIl11IO) this.I00iiO;
/* 9 */             IIiIoIl11IO iIiIoIl11IO2 = (IIiIoIl11IO) this.I00iio;
/* 15 */            int i = 1;
/* 16 */            if (ooOIOoO1I.equals(ooOIOoO1I2)) {
/* 15 */                return true;
                    }
/* 19 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooOIOoO1I.I00100o1O0lo();
/* 23 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ooOIOoO1I2.I00100o1O0lo();
/* 29 */            if (!(iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) || !(iOIiO1lIl0lI00100o1O0lo2 instanceof OoOOiO)) {
/* 59 */                return false;
                    }
/* 44 */            II01l1Oii iI01l1Oii = new II01l1Oii(i);
/* 47 */            iI01l1Oii.I00iiI = iIiIoIl11IO;
/* 49 */            iI01l1Oii.I00iiO = iIiIoIl11IO2;
/* 51 */            VarHandle.storeStoreFence();
/* 54 */            return O1oO0lOoI1.I00iiO.I00000oOI((OoOOiO) iOIiO1lIl0lI00100o1O0lo, (OoOOiO) iOIiO1lIl0lI00100o1O0lo2, z, iI01l1Oii);
                }

                /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public LinkedHashMap I000OiO(ArrayList arrayList, List list, List list2) {
                    Iio1oiI iio1oiI;
                    Iio1oiI iio1oiI2;
                    Iterator it;
                    boolean zI000O01llI0;
/* 5 */             Oi1ol0llI oi1ol0llI = (Oi1ol0llI) this.I00iio;
/* 9 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            Iterator it2 = arrayList.iterator();
/* 20 */            while (it2.hasNext()) {
/* 30 */                linkedHashSet.add(((I1ilio0iOl) it2.next()).I0000O);
                    }
/* 38 */            Set setI0000O = ((IioI0ol1O0) oi1ol0llI.I00iiI).I0000O();
/* 45 */            Set setI00iiO = IOOi0Ool1i.I00iiO(setI0000O);
/* 49 */            Iterator it3 = linkedHashSet.iterator();
/* 57 */            while (it3.hasNext()) {
/* 65 */                I000iOII(setI00iiO, (Iio1oiI) it3.next(), oi1ol0llI);
                    }
/* 71 */            ArrayList arrayList2 = new ArrayList();
/* 76 */            ArrayList arrayList3 = new ArrayList();
/* 81 */            ArrayList arrayList4 = new ArrayList();
/* 84 */            Iterator it4 = list2.iterator();
                    while (true) {
/* 88 */                boolean zHasNext = it4.hasNext();
/* 92 */                iio1oiI = Iio1oiI.I0000Il00O;
/* 95 */                if (!zHasNext) {
                            break;
                        }
/* 113 */               OolIl0ii1 oolIl0ii1 = (OolIl0ii1) list.get(((Number) it4.next()).intValue());
/* 121 */               Iio1oiI iio1oiI3 = (Iio1oiI) oolIl0ii1.I00000oOI(IoiIOIliOIi1.I0010o, iio1oiI);
/* 123 */               iio1oiI3.getClass();
/* 130 */               if (iio1oiI3.equals(iio1oiI)) {
/* 132 */                   arrayList4.add(oolIl0ii1);
                        } else {
/* 136 */                   int i = iio1oiI3.I00000oIO;
/* 138 */                   int i2 = iio1oiI3.I00000oOI;
/* 140 */                   if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
/* 155 */                       arrayList3.add(oolIl0ii1);
                            } else {
/* 151 */                       arrayList2.add(oolIl0ii1);
                            }
                        }
                    }
/* 161 */           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 166 */           LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 171 */           ArrayList arrayList5 = new ArrayList();
/* 174 */           arrayList5.addAll(arrayList2);
/* 177 */           arrayList5.addAll(arrayList3);
/* 180 */           arrayList5.addAll(arrayList4);
/* 183 */           Iterator it5 = arrayList5.iterator();
/* 191 */           while (it5.hasNext()) {
/* 197 */               OolIl0ii1 oolIl0ii12 = (OolIl0ii1) it5.next();
/* 205 */               Iio1oiI iio1oiI4 = (Iio1oiI) oolIl0ii12.I00000oOI(IoiIOIliOIi1.I0010o, iio1oiI);
/* 207 */               iio1oiI4.getClass();
/* 222 */               if (iio1oiI4.I00000oOI()) {
/* 228 */                   it = it5;
/* 235 */                   iio1oiI2 = setI00iiO.contains(iio1oiI4) ? iio1oiI4 : null;
                        } else {
/* 238 */                   int i3 = iio1oiI4.I00000oIO;
/* 240 */                   int i4 = iio1oiI4.I00000oOI;
/* 245 */                   iio1oiI2 = Iio1oiI.I0000O;
/* 247 */                   if (i3 == 1 && i4 == 0) {
/* 255 */                       if (!setI00iiO.contains(iio1oiI2)) {
/* 261 */                           iio1oiI2 = null;
                                }
/* 257 */                       it = it5;
                            } else {
/* 264 */                       Iio1oiI iio1oiII000OOo1O = I000OOo1O(iio1oiI4, linkedHashSet, setI00iiO);
/* 270 */                       it = it5;
/* 273 */                       if (iio1oiII000OOo1O == null) {
/* 290 */                           iio1oiII000OOo1O = I000OOo1O(iio1oiI4, linkedHashSet2, setI00iiO);
/* 294 */                           if (iio1oiII000OOo1O == null) {
/* 313 */                               if (setI00iiO.contains(iio1oiI2)) {
/* 329 */                                   zI000O01llI0 = I000O01llI0(iio1oiI4, iio1oiI2);
                                        } else {
/* 319 */                                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 321 */                                       Objects.toString(iio1oiI4);
/* 324 */                                       Objects.toString(iio1oiI2);
                                            }
/* 327 */                                   zI000O01llI0 = false;
                                        }
/* 333 */                               if (zI000O01llI0) {
/* 339 */                                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 341 */                                       iio1oiI4.toString();
/* 344 */                                       iio1oiI2.toString();
                                            }
                                        } else if (i3 != 2 || (i4 != 10 && i4 != 0)) {
/* 420 */                                   Iterator it6 = setI00iiO.iterator();
                                            while (true) {
/* 428 */                                       if (!it6.hasNext()) {
/* 475 */                                           iio1oiI2 = null;
                                                    break;
                                                }
/* 434 */                                       Iio1oiI iio1oiI5 = (Iio1oiI) it6.next();
/* 440 */                                       if (!iio1oiI5.I00000oOI()) {
/* 471 */                                           I000II.I001IO000("Candidate dynamic range must be fully specified.");
/* 243 */                                           return null;
                                                }
/* 446 */                                       if (!iio1oiI5.equals(iio1oiI2) && I000O01llI0(iio1oiI4, iio1oiI5)) {
/* 459 */                                           if (l11I11lO.I0000O(3, "CXCP")) {
/* 461 */                                               iio1oiI4.toString();
/* 464 */                                               iio1oiI5.toString();
                                                    }
/* 467 */                                           iio1oiI2 = iio1oiI5;
                                                }
                                            }
                                        } else {
/* 360 */                                   LinkedHashSet linkedHashSet3 = new LinkedHashSet();
/* 375 */                                   Long l = (Long) ((IIioli) ((IIlo0i0ll) this.I00iiO)).I0000O(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
/* 388 */                                   Iio1oiI iio1oiI6 = l != null ? (Iio1oiI) IioI0IoOi.I00000oIO.get(l) : null;
/* 390 */                                   if (iio1oiI6 != null) {
/* 392 */                                       linkedHashSet3.add(iio1oiI6);
                                            }
/* 397 */                                   linkedHashSet3.add(Iio1oiI.I0000oI00);
/* 400 */                                   Iio1oiI iio1oiII000OOo1O2 = I000OOo1O(iio1oiI4, linkedHashSet3, setI00iiO);
/* 404 */                                   if (iio1oiII000OOo1O2 != null) {
/* 410 */                                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 412 */                                           iio1oiI4.toString();
/* 415 */                                           iio1oiII000OOo1O2.toString();
                                                }
/* 418 */                                       iio1oiI2 = iio1oiII000OOo1O2;
                                            }
                                        }
                                    } else if (l11I11lO.I0000O(3, "CXCP")) {
/* 302 */                               iio1oiI4.toString();
/* 305 */                               iio1oiII000OOo1O.toString();
                                    }
                                } else if (l11I11lO.I0000O(3, "CXCP")) {
/* 281 */                           iio1oiI4.toString();
/* 284 */                           iio1oiII000OOo1O.toString();
                                }
/* 287 */                       iio1oiI2 = iio1oiII000OOo1O;
                            }
                        }
/* 477 */               if (iio1oiI2 == null) {
/* 550 */                   throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) oolIl0ii12.I0000O(OloIIlI1o10.I00IOO)) + "\nRequested dynamic range:\n  " + iio1oiI4 + "\nSupported dynamic ranges:\n  " + setI0000O + "\nConstrained set of concurrent dynamic ranges:\n  " + setI00iiO);
                        }
/* 479 */               I000iOII(setI00iiO, iio1oiI2, oi1ol0llI);
/* 482 */               linkedHashMap.put(oolIl0ii12, iio1oiI2);
/* 489 */               if (!linkedHashSet.contains(iio1oiI2)) {
/* 491 */                   linkedHashSet2.add(iio1oiI2);
                        }
/* 494 */               it5 = it;
                    }
/* 1638 */          return linkedHashMap;
                }

                public void I000l1(ll0o111o0 ll0o111o0Var) {
                    synchronized (this.I00iio) {
                        try {
/* 6 */                     ArrayDeque arrayDeque = (ArrayDeque) this.I00iiO;
/* 8 */                     if (arrayDeque == null) {
/* 12 */                        arrayDeque = new ArrayDeque();
/* 15 */                        this.I00iiO = arrayDeque;
                            }
/* 20 */                    arrayDeque.add(ll0o111o0Var);
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                @Override
                public void I000lI(IoiO1iOOil11 ioiO1iOOil11, Executor executor) {
                    Handler handler;
                    synchronized (this.I00iio) {
/* 5 */                 this.I00iiI = false;
/* 9 */                 I0oO0iII0iO1 i0oO0iII0iO1 = new I0oO0iII0iO1();
/* 12 */                i0oO0iII0iO1.I00iOIl = this;
/* 14 */                i0oO0iII0iO1.I00iiI = executor;
/* 16 */                i0oO0iII0iO1.I00iiO = ioiO1iOOil11;
/* 18 */                VarHandle.storeStoreFence();
/* 23 */                ImageReader imageReader = (ImageReader) this.I00iiO;
/* 27 */                if (O1OI1ll1Il0i.I00000oIO != null) {
/* 29 */                    handler = O1OI1ll1Il0i.I00000oIO;
                        } else {
                            synchronized (O1OI1ll1Il0i.class) {
                                try {
/* 37 */                            if (O1OI1ll1Il0i.I00000oIO == null) {
/* 47 */                                O1OI1ll1Il0i.I00000oIO = Handler.createAsync(Looper.getMainLooper());
                                    }
                                } finally {
                                }
                            }
/* 53 */                    handler = O1OI1ll1Il0i.I00000oIO;
                        }
/* 55 */                imageReader.setOnImageAvailableListener(i0oO0iII0iO1, handler);
                    }
                }

                public void I000o00OoI0I(OloIIoII1oo oloIIoII1oo) {
                    ll0o111o0 ll0o111o0Var;
                    synchronized (this.I00iio) {
/* 8 */                 if (((ArrayDeque) this.I00iiO) != null && !this.I00iiI) {
/* 16 */                    this.I00iiI = true;
                            while (true) {
                                synchronized (this.I00iio) {
                                    try {
/* 30 */                                ll0o111o0Var = (ll0o111o0) ((ArrayDeque) this.I00iiO).poll();
/* 32 */                                if (ll0o111o0Var == null) {
/* 35 */                                    this.I00iiI = false;
/* 38 */                                    return;
                                        }
                                    } finally {
                                    }
                                }
/* 42 */                        ll0o111o0Var.I00000oIO(oloIIoII1oo);
                            }
                        }
                    }
                }

                @Override
                public int I000oI1ioi() {
                    int maxImages;
                    synchronized (this.I00iio) {
/* 8 */                 maxImages = ((ImageReader) this.I00iiO).getMaxImages();
                    }
/* 13 */            return maxImages;
                }

                @Override
                public IoiO1IO1I1i I00100l0() {
                    Image imageAcquireNextImage;
                    synchronized (this.I00iio) {
                        try {
/* 9 */                     imageAcquireNextImage = ((ImageReader) this.I00iiO).acquireNextImage();
                        } catch (RuntimeException e) {
/* 27 */                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
/* 41 */                        throw e;
                            }
/* 29 */                    imageAcquireNextImage = null;
                        }
/* 30 */                if (imageAcquireNextImage == null) {
/* 4 */                     return null;
                        }
/* 36 */                return new I0oO01o(imageAcquireNextImage);
                    }
                }

                @Override
                public void close() {
                    synchronized (this.I00iio) {
/* 8 */                 ((ImageReader) this.I00iiO).close();
                    }
                }

                @Override
                public Surface getSurface() {
                    Surface surface;
                    synchronized (this.I00iio) {
/* 8 */                 surface = ((ImageReader) this.I00iiO).getSurface();
                    }
/* 13 */            return surface;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 4:
/* 42 */                    return "JavaTypeEnhancementState(jsr305=" + ((O0I00OIIo) this.I00iiO) + ", getReportLevelForAnnotation=" + ((I00iiI) this.I00iio) + ')';
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 69 */        public I0oO0iO1l0lo(i1olliOl i1olliol, boolean z, ll0IioI0 ll0iioi0) {
                    this.I00iOIl = 5;
                    this.I00iio = i1olliol;
                    this.I00iiI = z;
                    this.I00iiO = ll0iioi0;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 70 */        public I0oO0iO1l0lo(i1olliOl i1olliol) {
/* 71 */            this(i1olliol, false, lOiIO1oOO.I00000oIO);
                    this.I00iOIl = 5;
                }

/* 71 */        public I0oO0iO1l0lo(int i) {
/* 72 */            this.I00iOIl = i;
                }

/* 72 */        public I0oO0iO1l0lo(ImageReader imageReader) {
                    this.I00iOIl = 0;
/* 74 */            this.I00iio = new Object();
/* 75 */            this.I00iiI = true;
/* 76 */            this.I00iiO = imageReader;
                }
            }
