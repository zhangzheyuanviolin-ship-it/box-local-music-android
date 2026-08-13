            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IIo01iOo implements OIOiOllolii {
                public final int I00000oIO;
                public Object I00000oOI;

                public IIo01iOo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [IIlOoolol0ll] */
                /* JADX WARN: Type inference failed for: r4v0, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
                @Override
                public final void I00000oIO(Object obj) {
                    IIo0IOlilI iIo0IOlilI;
                    ?? r1;
                    IIo0ii1Oi iIo0ii1Oi;
                    IIOo1i iIOo1i;
                    ?? arrayList;
                    switch (this.I00000oIO) {
                        case 0:
/* 14 */                    List list = (List) obj;
/* 26 */                    if (!((IIo0IOlilI) this.I00000oOI).I000l1.get() || (r1 = (iIo0IOlilI = (IIo0IOlilI) this.I00000oOI).I0001Ioi1lo) == 0 || (iIo0ii1Oi = iIo0IOlilI.I000II) == null || (iIOo1i = iIo0IOlilI.I000OOo1O) == null) {
/* 657 */                       return;
                            }
/* 54 */                    if (list != null) {
/* 56 */                        List list2 = list;
/* 64 */                        arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 67 */                        Iterator it = list2.iterator();
/* 75 */                        while (it.hasNext()) {
/* 87 */                            arrayList.add(((IIllII) it.next()).I00000oIO());
                                }
                            } else {
/* 91 */                        arrayList = Il01100l.I00iOIl;
                            }
                            try {
/* 98 */                        List list3 = ((IIo0IOlilI) this.I00000oOI).I000iOII;
/* 117 */                       Iterable iterableI00iIi0i1o = ((AtomicBoolean) r1.I00li1OI).get() ? Il01100l.I00iOIl : IOOi0Ool1i.I00iIi0i1o(r1.I0001Ioi1lo(arrayList));
/* 129 */                       ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iterableI00iIi0i1o, 10));
/* 132 */                       Iterator it2 = iterableI00iIi0i1o.iterator();
/* 140 */                       while (it2.hasNext()) {
/* 152 */                           arrayList2.add(iOillilIolO.I00000oIO((String) it2.next(), null, null));
                                }
/* 170 */                       Set setI0000Il00O = Oio0lI.I0000Il00O(IOOi0Ool1i.I00iio(list3), IOOi0Ool1i.I00iio(arrayList2));
/* 181 */                       if (!setI0000Il00O.isEmpty() && iIOo1i.I000OOo1O(iIo0ii1Oi.I0000Il00O(), setI0000Il00O)) {
/* 197 */                           l11I11lO.I0000oI00("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
/* 657 */                           return;
                                }
                            } catch (Exception e) {
/* 206 */                       l11I11lO.I0001Ioi1lo("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                            }
                            try {
/* 209 */                       r1.I000l1(arrayList);
/* 212 */                       Set setI000OOo1O = r1.I000OOo1O();
/* 224 */                       ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(setI000OOo1O, 10));
/* 227 */                       Iterator it3 = setI000OOo1O.iterator();
/* 235 */                       while (it3.hasNext()) {
/* 247 */                           arrayList3.add(iOillilIolO.I00000oIO((String) it3.next(), null, null));
                                }
/* 261 */                       if (arrayList3.equals(((IIo0IOlilI) this.I00000oOI).I000iOII)) {
/* 657 */                           return;
                                }
/* 267 */                       IIo0IOlilI iIo0IOlilI2 = (IIo0IOlilI) this.I00000oOI;
/* 273 */                       List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(iIo0IOlilI2.I000iOII);
/* 281 */                       if (arrayList3.equals(listI00iIi0i1o)) {
/* 657 */                           return;
                                }
                                synchronized (iIo0IOlilI2.I0000O) {
/* 292 */                           if (iIo0IOlilI2.I0000oI00 != null) {
/* 296 */                               l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 301 */                               iIo0IOlilI2.I0000oI00.cancel(false);
/* 304 */                               iIo0IOlilI2.I0000oI00 = null;
                                    }
                                }
/* 311 */                       List list4 = listI00iIi0i1o;
/* 313 */                       Set setI00iio = IOOi0Ool1i.I00iio(list4);
/* 317 */                       Set setI00iio2 = IOOi0Ool1i.I00iio(arrayList3);
/* 324 */                       Set setI0000Il00O2 = Oio0lI.I0000Il00O(setI00iio2, setI00iio);
/* 330 */                       Set setI0000Il00O3 = Oio0lI.I0000Il00O(setI00iio, setI00iio2);
/* 336 */                       ArrayList arrayList4 = new ArrayList();
/* 345 */                       ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 348 */                       Iterator it4 = arrayList3.iterator();
/* 356 */                       while (it4.hasNext()) {
/* 368 */                           arrayList5.add(((IIllII) it4.next()).I00000oIO());
                                }
                                try {
/* 375 */                           Iterator it5 = setI0000Il00O3.iterator();
/* 383 */                           while (it5.hasNext()) {
/* 395 */                               iIo0IOlilI2.I0000Il00O(((IIllII) it5.next()).I00000oIO());
                                    }
/* 401 */                           IIo0ii1Oi iIo0ii1Oi2 = iIo0IOlilI2.I000II;
/* 403 */                           if (iIo0ii1Oi2 != null) {
/* 407 */                               l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 410 */                               iIo0ii1Oi2.I00000oIO(arrayList5);
/* 413 */                               arrayList4.add(iIo0ii1Oi2);
/* 418 */                               l11I11lO.I0000O(3, "CameraPresencePrvdr");
                                    }
/* 427 */                           if (!iIo0IOlilI2.I000lI.isEmpty()) {
/* 433 */                               iIo0IOlilI2.I000lI.size();
/* 436 */                               l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 441 */                               Iterator it6 = iIo0IOlilI2.I000lI.iterator();
/* 449 */                               while (it6.hasNext()) {
/* 455 */                                   IoolOI ioolOI = (IoolOI) it6.next();
/* 457 */                                   ioolOI.I00000oIO(arrayList5);
/* 460 */                                   arrayList4.add(ioolOI);
                                        }
                                    }
/* 464 */                           iIo0IOlilI2.I000iOII = arrayList3;
/* 469 */                           Iterator it7 = setI0000Il00O2.iterator();
/* 477 */                           while (it7.hasNext()) {
/* 489 */                               iIo0IOlilI2.I00000oIO(((IIllII) it7.next()).I00000oIO());
                                    }
/* 493 */                           iIo0IOlilI2.I00000oOI(setI0000Il00O2, setI0000Il00O3);
/* 657 */                           return;
                                } catch (Exception e2) {
/* 502 */                           l11I11lO.I00000oOI("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
/* 511 */                           ArrayList arrayList6 = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 514 */                           Iterator it8 = list4.iterator();
/* 522 */                           while (it8.hasNext()) {
/* 534 */                               arrayList6.add(((IIllII) it8.next()).I00000oIO());
                                    }
/* 543 */                           ListIterator listIterator = new Oi11oOI(arrayList4).listIterator(0);
                                    while (true) {
/* 548 */                               Oi11lo1liI0l oi11lo1liI0l = (Oi11lo1liI0l) listIterator;
/* 558 */                               if (!((ListIterator) oi11lo1liI0l.I00iiI).hasPrevious()) {
/* 597 */                                   Iterator it9 = setI0000Il00O3.iterator();
/* 605 */                                   while (it9.hasNext()) {
/* 617 */                                       iIo0IOlilI2.I00000oIO(((IIllII) it9.next()).I00000oIO());
                                            }
/* 623 */                                   Iterator it10 = setI0000Il00O2.iterator();
/* 631 */                                   while (it10.hasNext()) {
/* 643 */                                       iIo0IOlilI2.I0000Il00O(((IIllII) it10.next()).I00000oIO());
                                            }
/* 657 */                                   return;
                                        }
/* 568 */                               IoolOI ioolOI2 = (IoolOI) ((ListIterator) oi11lo1liI0l.I00iiI).previous();
                                        try {
/* 570 */                                   ioolOI2.I00000oIO(arrayList6);
                                        } catch (Exception e3) {
/* 591 */                                   l11I11lO.I00000oOI("CameraPresencePrvdr", "Failed to rollback listener: " + ioolOI2, e3);
                                        }
                                    }
                                }
                            } catch (Exception e4) {
/* 654 */                       l11I11lO.I0001Ioi1lo("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
/* 657 */                       return;
                            }
                            break;
                        default:
/* 10 */                    ((IOo1llI) this.I00000oOI).accept(obj);
/* 13 */                    return;
                    }
                }

                @Override
                public final void onError(Throwable th) {
                    switch (this.I00000oIO) {
                        case 0:
/* 16 */                    IIo0IOlilI iIo0IOlilI = (IIo0IOlilI) this.I00000oOI;
/* 24 */                    if (iIo0IOlilI.I000l1.get()) {
/* 31 */                        l11I11lO.I00000oOI("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
/* 34 */                        OoIlIoo1oiOo ooIlIoo1oiOo = iIo0IOlilI.I000O01llI0;
/* 36 */                        if (ooIlIoo1oiOo != null) {
/* 42 */                            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(23);
/* 45 */                            i0IOIlIOIII.I00iiI = ooIlIoo1oiOo;
/* 47 */                            VarHandle.storeStoreFence();
/* 50 */                            iOiiloIII0O.I00000oIO(i0IOIlIOIII);
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    l11I11lO.I00000oOI("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                            break;
                    }
                }
            }
