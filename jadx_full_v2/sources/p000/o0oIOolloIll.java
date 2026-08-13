            package p000;

            import android.util.Log;
            import com.google.mlkit.genai.common.DownloadCallback;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class o0oIOolloIll extends Oll0io implements IlliIl1l11O {
                public AtomicInteger I00iOIl;
                public Object I00iiI;
                public Collection I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public iOil1lO10l I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public Object I00l0I0l0lO1;
                public final o0oi0ioiO I00l0OO0IO;
                public final DownloadCallback I00li1OI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0oIOolloIll(o0oi0ioiO o0oi0ioio, DownloadCallback downloadCallback, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00l0OO0IO = o0oi0ioio;
/* 3 */             this.I00li1OI = downloadCallback;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             o0oIOolloIll o0oioolloill = new o0oIOolloIll(this.I00l0OO0IO, this.I00li1OI, iOoil1iiIilo);
/* 10 */            o0oioolloill.I00l0I0l0lO1 = obj;
/* 37 */            return o0oioolloill;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((o0oIOolloIll) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
                
                    if (r10 != r2) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
                
                    if (r6 == r2) goto L71;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x01b9 A[LOOP:1: B:60:0x01b3->B:62:0x01b9, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
                /* JADX WARN: Type inference failed for: r6v17, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v5 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d1 -> B:27:0x00d5). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    AtomicInteger atomicInteger;
                    Object objI00IOO;
                    AtomicInteger atomicInteger2;
                    o0oi0ioiO o0oi0ioio;
                    int i;
                    Collection arrayList;
                    Iterator it;
                    iOil1lO10l ioil1lo10l;
                    List listI001iOo1i0O;
                    iOil1lO10l ioil1lo10l2;
                    AtomicInteger atomicInteger3;
                    ArrayList arrayListI000OiO;
                    List list;
                    int i2;
                    ?? r6;
                    Ii0110 ii01102;
                    Object objI0010o;
                    int i3;
                    ArrayList arrayList2;
                    AtomicInteger atomicInteger4;
                    Iterator it2;
                    Iterator it3;
                    ArrayList arrayList3;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i4 = this.I00ioIO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 11 */            int i5 = 0;
/* 12 */            o0oi0ioiO o0oi0ioio2 = this.I00l0OO0IO;
/* 16 */            if (i4 == 0) {
/* 114 */               lIoii1l01l0i.I00000oOI(obj);
/* 120 */               ii0110 = (Ii0110) this.I00l0I0l0lO1;
/* 124 */               atomicInteger = new AtomicInteger(0);
/* 127 */               i1IoO0OlII i1ioo0olii = o0oi0ioio2.I00000oIO;
/* 129 */               this.I00l0I0l0lO1 = ii0110;
/* 131 */               this.I00iOIl = atomicInteger;
/* 133 */               this.I00ioIO = 1;
/* 135 */               objI00IOO = iOil1lO10l.I00IOO(i1ioo0olii, this);
                    } else {
/* 18 */                if (i4 != 1) {
/* 20 */                    if (i4 != 2) {
/* 22 */                        if (i4 != 3) {
/* 26 */                            it2 = (Iterator) this.I00l0I0l0lO1;
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 485 */                           while (it2.hasNext()) {
/* 491 */                               O010OIi o010OIi = (O010OIi) it2.next();
/* 493 */                               this.I00l0I0l0lO1 = it2;
/* 495 */                               this.I00iOIl = null;
/* 497 */                               this.I00iiI = null;
/* 499 */                               this.I00iiO = null;
/* 501 */                               this.I00iio = null;
/* 503 */                               this.I00ilI0I1 = null;
/* 505 */                               this.I00ilO0 = null;
/* 508 */                               this.I00ioIO = 4;
/* 514 */                               if (o010OIi.I001l0I00(this) == ii0111o) {
/* 1261 */                                  return ii0111o;
                                        }
                                    }
/* 517 */                           return ooiIlOl1iI;
                                }
/* 33 */                        i2 = this.I00io1l;
/* 38 */                        r6 = (List) this.I00iio;
/* 43 */                        list = (List) this.I00iiO;
/* 48 */                        ioil1lo10l2 = (iOil1lO10l) this.I00iiI;
/* 50 */                        atomicInteger3 = this.I00iOIl;
/* 55 */                        ii01102 = (Ii0110) this.I00l0I0l0lO1;
                                try {
/* 57 */                            lIoii1l01l0i.I00000oOI(obj);
                                    arrayList3 = r6;
                                } catch (Exception e) {
/* 66 */                            e = e;
/* 401 */                           Log.w("DownloadManager", "Primary download start failed: ".concat(String.valueOf(e.getMessage())));
                                    arrayList3 = r6;
/* 410 */                           if (O0000Ioio00.I0000O(ioil1lo10l2, o0oi0ioio2.I00000oIO)) {
                                    }
/* 60 */                            i3 = i2;
/* 62 */                            atomicInteger4 = atomicInteger3;
                                    arrayList2 = arrayList3;
/* 432 */                           it3 = list.iterator();
/* 440 */                           while (it3.hasNext()) {
                                    }
/* 476 */                           arrayListI000OiO = arrayList2;
/* 477 */                           it2 = arrayListI000OiO.iterator();
/* 485 */                           while (it2.hasNext()) {
                                    }
/* 517 */                           return ooiIlOl1iI;
                                }
/* 60 */                        i3 = i2;
/* 62 */                        atomicInteger4 = atomicInteger3;
                                arrayList2 = arrayList3;
/* 432 */                       it3 = list.iterator();
/* 440 */                       while (it3.hasNext()) {
/* 472 */                           arrayList2.add(iOi1II01i0.I0000O(ii01102, null, null, new I1iI1o(this.I00l0OO0IO, (iOil1lO10l) it3.next(), this.I00li1OI, atomicInteger4, i3, (IOoil1iiIilo) null), 3));
                                }
/* 476 */                       arrayListI000OiO = arrayList2;
/* 477 */                       it2 = arrayListI000OiO.iterator();
/* 485 */                       while (it2.hasNext()) {
                                }
/* 517 */                       return ooiIlOl1iI;
                            }
/* 69 */                    i = this.I00io1l;
/* 71 */                    iOil1lO10l ioil1lo10l3 = this.I00ilO0;
/* 73 */                    Object next = this.I00ilI0I1;
/* 77 */                    it = (Iterator) this.I00iio;
/* 79 */                    arrayList = this.I00iiO;
/* 85 */                    o0oi0ioio = (o0oi0ioiO) this.I00iiI;
/* 87 */                    atomicInteger2 = this.I00iOIl;
/* 91 */                    ii0110 = (Ii0110) this.I00l0I0l0lO1;
/* 93 */                    lIoii1l01l0i.I00000oOI(obj);
/* 96 */                    int i6 = 0;
/* 98 */                    Object objI00OIl = obj;
/* 220 */                   if (((Number) objI00OIl).intValue() == 1 && !O0000Ioio00.I0000O(o0oi0ioio.I0000Il00O.get(ioil1lo10l3), Boolean.TRUE)) {
/* 236 */                       arrayList.add(next);
                            }
/* 239 */                   i5 = i6;
/* 174 */                   if (it.hasNext()) {
/* 242 */                       int i7 = i5;
/* 244 */                       List list2 = (List) arrayList;
/* 256 */                       int size = list2.size() + (i != 0 ? 1 : i7);
/* 258 */                       if (size == 0) {
/* 262 */                           this.I00li1OI.onDownloadCompleted();
/* 265 */                           return ooiIlOl1iI;
                                }
/* 268 */                       IOi10loi iOi10loi = new IOi10loi();
/* 271 */                       if (i != 0) {
/* 273 */                           ioil1lo10l = o0oi0ioio2.I00000oIO;
/* 275 */                           listI001iOo1i0O = list2;
                                } else {
/* 283 */                           ioil1lo10l = (iOil1lO10l) IOOi0Ool1i.I001lllioOl(list2);
/* 287 */                           listI001iOo1i0O = IOOi0Ool1i.I001iOo1i0O(list2, 1);
                                }
/* 276 */                       iOil1lO10l ioil1lo10l4 = ioil1lo10l;
/* 304 */                       AtomicInteger atomicInteger5 = atomicInteger2;
/* 311 */                       ioil1lo10l2 = ioil1lo10l4;
/* 315 */                       atomicInteger3 = atomicInteger5;
/* 324 */                       O010OIi[] o010OIiArr = new O010OIi[1];
/* 326 */                       o010OIiArr[i7] = iOi1II01i0.I0000O(ii0110, null, null, new OilIll01(this.I00l0OO0IO, ioil1lo10l4, this.I00li1OI, iOi10loi, atomicInteger5, size, null), 3);
/* 328 */                       arrayListI000OiO = IOOi1I.I000OiO(o010OIiArr);
/* 339 */                       if (!listI001iOo1i0O.isEmpty()) {
                                    try {
/* 341 */                               this.I00l0I0l0lO1 = ii0110;
/* 343 */                               this.I00iOIl = atomicInteger3;
/* 345 */                               this.I00iiI = ioil1lo10l2;
/* 350 */                               this.I00iiO = listI001iOo1i0O;
/* 352 */                               this.I00iio = arrayListI000OiO;
/* 354 */                               this.I00ilI0I1 = null;
/* 356 */                               this.I00ilO0 = null;
/* 358 */                               this.I00io1l = size;
/* 361 */                               this.I00ioIO = 3;
/* 363 */                               objI0010o = iOi10loi.I0010o(this);
/* 367 */                               Ii0111o ii0111o2 = Ii0111o.I00iOIl;
                                    } catch (Exception e2) {
/* 379 */                               e = e2;
/* 381 */                               list = listI001iOo1i0O;
/* 382 */                               i2 = size;
/* 383 */                               r6 = arrayListI000OiO;
/* 384 */                               ii01102 = ii0110;
/* 401 */                               Log.w("DownloadManager", "Primary download start failed: ".concat(String.valueOf(e.getMessage())));
                                        arrayList3 = r6;
/* 410 */                               if (O0000Ioio00.I0000O(ioil1lo10l2, o0oi0ioio2.I00000oIO)) {
/* 412 */                                   Iterator it4 = r6.iterator();
/* 420 */                                   while (it4.hasNext()) {
/* 428 */                                       ((O010OIi) it4.next()).I000II(null);
                                            }
/* 517 */                                   return ooiIlOl1iI;
                                        }
/* 60 */                                i3 = i2;
/* 62 */                                atomicInteger4 = atomicInteger3;
                                        arrayList2 = arrayList3;
/* 432 */                               it3 = list.iterator();
/* 440 */                               while (it3.hasNext()) {
                                        }
/* 476 */                               arrayListI000OiO = arrayList2;
/* 477 */                               it2 = arrayListI000OiO.iterator();
/* 485 */                               while (it2.hasNext()) {
                                        }
/* 517 */                               return ooiIlOl1iI;
                                    }
/* 369 */                           if (objI0010o != ii0111o) {
/* 371 */                               ii01102 = ii0110;
/* 372 */                               i3 = size;
/* 374 */                               arrayList2 = arrayListI000OiO;
/* 375 */                               atomicInteger4 = atomicInteger3;
/* 377 */                               list = listI001iOo1i0O;
/* 432 */                               it3 = list.iterator();
/* 440 */                               while (it3.hasNext()) {
                                        }
/* 476 */                               arrayListI000OiO = arrayList2;
                                    }
                                }
/* 477 */                       it2 = arrayListI000OiO.iterator();
/* 485 */                       while (it2.hasNext()) {
                                }
/* 517 */                       return ooiIlOl1iI;
                            }
/* 176 */                   next = it.next();
/* 181 */                   ioil1lo10l3 = (iOil1lO10l) next;
/* 183 */                   this.I00l0I0l0lO1 = ii0110;
/* 185 */                   this.I00iOIl = atomicInteger2;
/* 187 */                   this.I00iiI = o0oi0ioio;
/* 189 */                   i6 = i5;
/* 194 */                   this.I00iiO = arrayList;
/* 196 */                   this.I00iio = it;
/* 198 */                   this.I00ilI0I1 = next;
/* 200 */                   this.I00ilO0 = ioil1lo10l3;
/* 202 */                   this.I00io1l = i;
/* 204 */                   this.I00ioIO = 2;
/* 206 */                   objI00OIl = ioil1lo10l3.I00OIl(this);
/* 1261 */                  return ii0111o;
                        }
/* 102 */               atomicInteger = this.I00iOIl;
/* 106 */               ii0110 = (Ii0110) this.I00l0I0l0lO1;
/* 108 */               lIoii1l01l0i.I00000oOI(obj);
/* 111 */               objI00IOO = obj;
                    }
/* 151 */           int i8 = ((Number) objI00IOO).intValue() == 1 ? 1 : 0;
/* 152 */           List list3 = o0oi0ioio2.I00000oOI;
/* 165 */           atomicInteger2 = atomicInteger;
/* 166 */           o0oi0ioio = o0oi0ioio2;
/* 167 */           i = i8;
/* 158 */           arrayList = new ArrayList();
/* 161 */           it = list3.iterator();
/* 174 */           if (it.hasNext()) {
                    }
/* 1261 */          return ii0111o;
                }
            }
