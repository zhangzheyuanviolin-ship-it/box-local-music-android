            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.media.Image;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IIoo0IllI {
                public OolO1O I00000oIO;
                public i0I11I I00000oOI;
                public OolOi0i I0000Il00O;
                public OloOIoiI1 I0000O;
                public boolean I0000oI00;

                /* JADX WARN: Multi-variable type inference failed */
                public final Oi01iIoI I00000oIO(IIoo00iOol0 iIoo00iOol0, int i, IOlOo1ll1l1 iOlOo1ll1l1, List list) {
                    Ioloo0I1O0l0 ioloo0I1O0l0;
                    IoiO1IO1I1i ioiO1IO1I1iI000II;
                    Ioloo0I1O0l0 ioloo0I1O0l02;
/* 3 */             i0I11I i0i11i = this.I00000oOI;
/* 5 */             int i2 = iIoo00iOol0.I0000Il00O;
/* 9 */             List listUnmodifiableList = Collections.unmodifiableList(iIoo00iOol0.I00000oIO);
/* 20 */            Ioloo0I1O0l0 ioloo0I1O0l03 = null;
/* 21 */            if (listUnmodifiableList.isEmpty()) {
/* 493 */               IoOOl0iOl1io.I001lIiIIo1O("Attempted to issue a capture without surfaces using ", iIoo00iOol0);
/* 20 */                return null;
                    }
/* 23 */            List<IiIO1ol1i1o0> list2 = listUnmodifiableList;
/* 33 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 44 */            for (IiIO1ol1i1o0 iiIO1ol1i1o0 : list2) {
/* 62 */                Object obj = ((Map) this.I00000oIO.I0001Ioi1lo.getValue()).get(iiIO1ol1i1o0);
/* 66 */                if (obj == null) {
/* 82 */                    IoOOl0iOl1io.I001lIiIIo1O("Attempted to issue a capture with an unrecognized surface: ", iiIO1ol1i1o0);
/* 20 */                    return null;
                        }
/* 76 */                arrayList.add(OlOO0I1.I00000oIO(((OlOO0I1) obj).I00000oIO));
                    }
/* 88 */            IIl1Iloio iIl1Iloio = new IIl1Iloio();
/* 95 */            Iterator it = iIoo00iOol0.I0000O.iterator();
/* 103 */           while (it.hasNext()) {
/* 115 */               iIl1Iloio.I00000oIO((IIl1Ol) it.next(), this.I0000Il00O.I0000O);
                    }
/* 119 */           OIil0iio0 oIil0iio0 = iIoo00iOol0.I00000oOI;
/* 121 */           TreeMap treeMap = oIil0iio0.I00iOIl;
/* 123 */           OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 139 */           for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 155 */               oI0oiliol10OI000OOo1O.I000lI(i1ioiI, iOlOo1ll1l1.I000OiO(i1ioiI), iOlOo1ll1l1.I0000O(i1ioiI));
                    }
/* 171 */           for (I1ioiI i1ioiI2 : oIil0iio0.I0000Il00O()) {
/* 187 */               oI0oiliol10OI000OOo1O.I000lI(i1ioiI2, oIil0iio0.I000OiO(i1ioiI2), oIil0iio0.I0000O(i1ioiI2));
                    }
/* 191 */           I1ioiI i1ioiI3 = IIoo00iOol0.I0001Ioi1lo;
/* 197 */           if (treeMap.containsKey(i1ioiI3)) {
/* 209 */               oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(CaptureRequest.JPEG_ORIENTATION), oIil0iio0.I0000O(i1ioiI3));
                    }
/* 212 */           I1ioiI i1ioiI4 = IIoo00iOol0.I000II;
/* 218 */           if (treeMap.containsKey(i1ioiI4)) {
/* 241 */               oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(CaptureRequest.JPEG_QUALITY), Byte.valueOf((byte) ((Number) oIil0iio0.I0000O(i1ioiI4)).intValue()));
                    }
/* 245 */           if (i2 != 5 || i0i11i.I00000oIO() || i0i11i.I0000O() || (ioiO1IO1I1iI000II = i0i11i.I000II()) == null) {
/* 395 */               ioloo0I1O0l0 = null;
                    } else {
/* 265 */               IoiIIlOol1 ioiIIlOol1I00i0oil = ioiO1IO1I1iI000II.I00i0oil();
/* 278 */               IIlI0I1li iIlI0I1li = ioiIIlOol1I00i0oil instanceof IIlI0lO ? ((IIlI0lO) ioiIIlOol1I00i0oil).I00000oIO : null;
/* 279 */               if (iIlI0I1li == null) {
/* 391 */                   ioloo0I1O0l02 = null;
                        } else {
/* 283 */                   if (!(iIlI0I1li instanceof IO01oO)) {
/* 387 */                       IoOOl0iOl1io.I001lIiIIo1O("Unexpected capture result type: ", iIlI0I1li.getClass());
/* 20 */                        return null;
                            }
/* 287 */                   Image imageI00ll1 = ioiO1IO1I1iI000II.I00ll1();
/* 293 */                   if (imageI00ll1 == null) {
/* 377 */                       I000II.I001IO000("Required value was null.");
/* 20 */                        return null;
                            }
/* 295 */                   I0oIollOil0 i0oIollOil0 = new I0oIollOil0();
/* 298 */                   i0oIollOil0.I00iOIl = imageI00ll1;
/* 304 */                   i0oIollOil0.I00iiI = imageI00ll1.getFormat();
/* 310 */                   i0oIollOil0.I00iiO = imageI00ll1.getWidth();
/* 316 */                   i0oIollOil0.I00iio = imageI00ll1.getHeight();
/* 322 */                   i0oIollOil0.I00ilI0I1 = imageI00ll1.getTimestamp();
/* 324 */                   VarHandle.storeStoreFence();
/* 337 */                   Object objI00l0I0l0lO1 = ((IO01oO) iIlI0I1li).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(IllIi0lI.class));
/* 341 */                   if (objI00l0I0l0lO1 == null) {
/* 373 */                       I000II.I001IO000("Required value was null.");
/* 20 */                        return null;
                            }
/* 347 */                   ioloo0I1O0l03 = new Ioloo0I1O0l0();
/* 350 */                   ioloo0I1O0l03.I00000oIO = i0oIollOil0;
/* 352 */                   ioloo0I1O0l03.I00000oOI = (IllIi0lI) objI00l0I0l0lO1;
/* 354 */                   VarHandle.storeStoreFence();
/* 359 */                   AtomicReference atomicReference = new AtomicReference(ioiO1IO1I1iI000II);
/* 364 */                   IIoo0Ii iIoo0Ii = new IIoo0Ii();
/* 367 */                   iIoo0Ii.I00iOIl = atomicReference;
/* 369 */                   VarHandle.storeStoreFence();
                            ioloo0I1O0l02 = iIoo0Ii;
                        }
/* 392 */               ioloo0I1O0l0 = ioloo0I1O0l03;
/* 393 */               ioloo0I1O0l03 = ioloo0I1O0l02;
                    }
/* 396 */           if (ioloo0I1O0l0 == null) {
/* 417 */               int i3 = (i != 3 || this.I0000oI00) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
/* 418 */               if (i3 != -1) {
/* 420 */                   i2 = i3;
                        }
                    }
/* 446 */           LinkedHashMap linkedHashMapI0001Ioi1lo = O1Oii0O0loo.I0001Ioi1lo(this.I0000O.I00000oIO(Oi0OO1IIl1.I00000oIO(i2)), iOil1io0i00.I00000oOI(new IIl0oI(OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000OOo1O), 8)));
/* 450 */           O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 454 */           o101lO1I0000oI00.add(iIl1Iloio);
/* 457 */           if (ioloo0I1O0l03 != null) {
/* 459 */               o101lO1I0000oI00.add(ioloo0I1O0l03);
                    }
/* 466 */           o101lO1I0000oI00.addAll(list);
/* 487 */           return new Oi01iIoI(arrayList, linkedHashMapI0001Ioi1lo, Collections.singletonMap(Olo10o10.I00000oIO, iIoo00iOol0.I0000oI00), IOOi1I.I0000Il00O(o101lO1I0000oI00), Oi0OO1IIl1.I00000oIO(i2), ioloo0I1O0l0);
                }
            }
