            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.ListIterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            public final class IllI1oI implements AutoCloseable, Oi01Ooii1Ol {
                public OlOO00iI0lI I00iOIl;
                public IllI1OilO0O I00iiI;
                public OIl1l01 I00iiO;
                public LinkedHashMap I00iio;
                public Set I00ilI0I1;
                public IioIoO10iOiI I00ilO0;

                @Override
                public final void I0000Il00O(Oi0Iil oi0Iil, long j, int i, int i2) {
/* 11 */            Map map = (Map) this.I00iio.get(OlOO0I1.I00000oIO(i));
/* 13 */            if (map == null) {
/* 58 */                return;
                    }
/* 22 */            if (this.I00iOIl.I0000Il00O(i) == null) {
/* 67 */                I000II.I001IO000("Required value was null.");
                    } else {
/* 32 */                if (!map.containsKey(OIl1lI0ll101.I00000oIO(i2))) {
/* 61 */                    I000II.I001IO000("Check failed.");
/* 64 */                    return;
                        }
/* 38 */                Iterator it = map.values().iterator();
/* 46 */                while (it.hasNext()) {
/* 54 */                    ((OIl1l01) it.next()).I00000oIO(j);
                        }
                    }
                }

                @Override
                public final void I001i1lo1io(Oi0Iil oi0Iil, long j, long j2) throws Exception {
                    Object next;
/* 5 */             Set set = this.I00ilI0I1;
/* 7 */             IllO00OiO illO00OiO = new IllO00OiO();
/* 12 */            illO00OiO.I00000oIO = j;
/* 16 */            illO00OiO.I00000oOI = j2;
/* 18 */            I1OooI1 i1OooI1 = IllO00OiO.I000OOo1O;
/* 20 */            i1OooI1.getClass();
/* 29 */            illO00OiO.I0000Il00O = I1OooI1.I00000oOI.incrementAndGet(i1OooI1);
/* 36 */            illO00OiO.I0000O = new IllIll(illO00OiO);
/* 38 */            O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 50 */            Iterator it = oi0Iil.I00IoiI().keySet().iterator();
                    while (true) {
/* 59 */                if (!it.hasNext()) {
                            break;
                        }
/* 67 */                int i = ((OlOO0I1) it.next()).I00000oIO;
/* 72 */                Iterator it2 = set.iterator();
                        while (true) {
/* 80 */                    if (it2.hasNext()) {
/* 82 */                        next = it2.next();
/* 91 */                        if (((IIo1loI0) next).I00000oIO == i) {
                                    break;
                                }
                            } else {
/* 94 */                        next = null;
                                break;
                            }
                        }
/* 95 */                IIo1loI0 iIo1loI0 = (IIo1loI0) next;
/* 97 */                if (iIo1loI0 != null) {
/* 99 */                    ArrayList arrayList = iIo1loI0.I00000oOI;
/* 105 */                   I1OollilIo i1OollilIoI00000oOI = iOOOIOoiIlII.I00000oOI(arrayList.size());
/* 109 */                   int size = arrayList.size();
/* 113 */                   for (int i2 = 0; i2 < size; i2++) {
/* 128 */                       o101lO1I0000oI00.add(new IllIll1I1(illO00OiO, i, ((OlOIo0l1O0Ol) arrayList.get(i2)).I00000oIO, i1OollilIoI00000oOI));
                            }
                        }
                    }
/* 134 */           O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 138 */           illO00OiO.I0000oI00 = o101lO1I0000Il00O;
/* 146 */           illO00OiO.I0001Ioi1lo = iOOOIOoiIlII.I0000O(IllIo0.I00iOIl);
/* 156 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(o101lO1I0000Il00O, 10));
/* 159 */           ListIterator listIterator = o101lO1I0000Il00O.listIterator(0);
                    while (true) {
/* 164 */               Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 170 */               if (!io1ioiIIO1lI.hasNext()) {
                            break;
                        } else {
/* 184 */                   arrayList2.add(OlOO0I1.I00000oIO(((IllIll1I1) io1ioiIIO1lI.next()).I0000Il00O));
                        }
                    }
/* 200 */           illO00OiO.I000II = iOOOIOoiIlII.I00000oOI(IOOi0Ool1i.I001i1lo1io(arrayList2).size());
/* 207 */           illO00OiO.I000O01llI0 = new CopyOnWriteArrayList();
/* 209 */           VarHandle.storeStoreFence();
/* 218 */           this.I00iiO.I000II(j, j2, j, illO00OiO.I0000O);
/* 221 */           int iI00000oOI = o101lO1I0000Il00O.I00000oOI();
/* 226 */           for (int i3 = 0; i3 < iI00000oOI; i3++) {
/* 233 */               IllIll1I1 illIll1I1 = (IllIll1I1) o101lO1I0000Il00O.get(i3);
/* 243 */               Object obj = this.I00iio.get(OlOO0I1.I00000oIO(illIll1I1.I0000Il00O));
/* 249 */               if (obj == null) {
/* 308 */                   I000II.I001IO000("Required value was null.");
/* 311 */                   return;
                        }
/* 259 */               Object obj2 = ((Map) obj).get(OIl1lI0ll101.I00000oIO(illIll1I1.I0000O));
/* 263 */               if (obj2 == null) {
/* 304 */                   I000II.I001IO000("Required value was null.");
/* 307 */                   return;
                        }
/* 265 */               OIl1l01 oIl1l01 = (OIl1l01) obj2;
/* 273 */               oIl1l01.I000II(j, j2, j2, illIll1I1);
/* 294 */               if (!oi0Iil.I00IoiI().keySet().contains(OlOO0I1.I00000oIO(illIll1I1.I0000Il00O))) {
/* 298 */                   oIl1l01.I00000oIO(illO00OiO.I00000oIO);
                        }
                    }
/* 320 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(o101lO1I0000Il00O, 10));
/* 323 */           ListIterator listIterator2 = o101lO1I0000Il00O.listIterator(0);
                    while (true) {
/* 328 */               Io1ioiIIO1lI io1ioiIIO1lI2 = (Io1ioiIIO1lI) listIterator2;
/* 334 */               if (!io1ioiIIO1lI2.hasNext()) {
                            break;
                        } else {
/* 348 */                   arrayList3.add(OlOO0I1.I00000oIO(((IllIll1I1) io1ioiIIO1lI2.next()).I0000Il00O));
                        }
                    }
/* 352 */           Set setI00iio = IOOi0Ool1i.I00iio(arrayList3);
/* 356 */           IllIOi illIOi = new IllIOi();
/* 359 */           illIOi.I00iOIl = illO00OiO;
/* 361 */           illIOi.I00iiI = setI00iio;
/* 369 */           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(o101lO1I0000Il00O, 10));
/* 372 */           ListIterator listIterator3 = o101lO1I0000Il00O.listIterator(0);
                    while (true) {
/* 377 */               Io1ioiIIO1lI io1ioiIIO1lI3 = (Io1ioiIIO1lI) listIterator3;
/* 383 */               if (!io1ioiIIO1lI3.hasNext()) {
                            break;
                        } else {
/* 397 */                   arrayList4.add(OIl1lI0ll101.I00000oIO(((IllIll1I1) io1ioiIIO1lI3.next()).I0000O));
                        }
                    }
/* 401 */           IOOi0Ool1i.I00iio(arrayList4);
/* 408 */           illIOi.I00iiO = iOOOIOoiIlII.I00000oIO(false);
/* 410 */           VarHandle.storeStoreFence();
/* 415 */           this.I00ilO0.getClass();
/* 422 */           if (!oi0Iil.I00Ol00()) {
/* 426 */               this.I00iiI.I00000oIO();
                    }
/* 429 */           illIOi.I00000oIO();
                }

                @Override
                public final void I00IoiI(Oi0Iil oi0Iil, long j, Oi0I000 oi0I000) throws Exception {
/* 9 */             this.I00iiO.I0000Il00O(j, OIlI0iOIo.I00000oIO(10));
/* 16 */            if (oi0I000.I00IOO()) {
/* 98 */                return;
                    }
/* 26 */            Iterator it = oi0Iil.I00IoiI().keySet().iterator();
/* 34 */            while (it.hasNext()) {
/* 54 */                Map map = (Map) this.I00iio.get(OlOO0I1.I00000oIO(((OlOO0I1) it.next()).I00000oIO));
/* 56 */                if (map != null) {
/* 63 */                    Iterator it2 = map.values().iterator();
/* 71 */                    while (it2.hasNext()) {
/* 79 */                        ((OIl1l01) it2.next()).I00000oIO(j);
                            }
                        }
                    }
                }

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) throws Exception {
/* 3 */             this.I00iiO.I0000Il00O(j, i0oIili1iI);
                }

                @Override
                public final void I00OOll1(Oi01iIoI oi01iIoI) {
/* 3 */             this.I00iiI.I00000oIO();
                }

                @Override
                public final void close() {
/* 3 */             this.I00iiI.close();
/* 8 */             this.I00iiO.close();
/* 17 */            Iterator it = this.I00iio.values().iterator();
/* 25 */            while (it.hasNext()) {
/* 37 */                Iterator it2 = ((Map) it.next()).values().iterator();
/* 45 */                while (it2.hasNext()) {
/* 53 */                    ((OIl1l01) it2.next()).close();
                        }
                    }
                }
            }
