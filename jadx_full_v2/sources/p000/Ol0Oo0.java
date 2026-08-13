            package p000;

            import android.app.RemoteAction;
            import android.view.textclassifier.TextClassification;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol0Oo0 implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;

                public Ol0Oo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    Object obj3;
                    Collection collectionI00O10llo;
/* 5 */             int i = this.I00iOIl;
/* 8 */             Oil1IOoo1lI oil1IOoo1lI = null;
/* 11 */            Object obj4 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 548 */                   Ol0OoiI1ioO ol0OoiI1ioO = (Ol0OoiI1ioO) obj4;
/* 550 */                   Set set = (Set) obj;
                            synchronized (ol0OoiI1ioO.I00iOIl) {
                                try {
/* 559 */                           OI10IIO oi10iio = ol0OoiI1ioO.I00iio;
/* 561 */                           if (oi10iio != null) {
/* 578 */                               Object[] objArr = oi10iio.I00000oOI;
/* 580 */                               long[] jArr = oi10iio.I00000oIO;
/* 583 */                               int length = jArr.length - 2;
/* 584 */                               if (length >= 0) {
/* 586 */                                   int i2 = 0;
                                            while (true) {
/* 587 */                                       long j = jArr[i2];
/* 601 */                                       if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 610 */                                           int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 612 */                                           int i4 = 0;
                                                    while (true) {
/* 613 */                                               if (i4 < i3) {
/* 622 */                                                   if ((255 & j) >= 128 || !set.contains(objArr[(i2 << 3) + i4])) {
/* 638 */                                                       j >>= 8;
/* 639 */                                                       i4++;
                                                            } else {
/* 635 */                                                       oil1IOoo1lI = ol0OoiI1ioO.I00ilO0;
                                                            }
                                                        } else if (i3 == 8) {
                                                        }
                                                    }
                                                } else if (i2 != length) {
/* 646 */                                           i2++;
                                                }
                                            }
                                        }
                                    } else if (IOOi0Ool1i.I001i1O0Ol(set, ol0OoiI1ioO.I00iiI)) {
/* 573 */                               oil1IOoo1lI = ol0OoiI1ioO.I00ilO0;
                                    }
                                } catch (Throwable th) {
/* 665 */                           throw th;
                                }
                            }
/* 650 */                   if (oil1IOoo1lI != null) {
/* 658 */                       IO10lIoiO.I00000oIO(oil1IOoo1lI.I000lI(OoiIlOl1iI.I00000oIO));
                            }
/* 661 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 453 */                   Ol1olI0o1I01 ol1olI0o1I01 = (Ol1olI0o1I01) obj4;
/* 455 */                   Collection collection = (Set) obj;
/* 461 */                   AtomicReference atomicReference = ol1olI0o1I01.I00000oOI;
/* 511 */                   do {
/* 463 */                       obj3 = atomicReference.get();
/* 467 */                       if (obj3 == null) {
/* 470 */                           collectionI00O10llo = collection;
                                } else if (obj3 instanceof Set) {
/* 483 */                           collectionI00O10llo = IOOi1I.I000O01llI0(obj3, collection);
                                } else {
/* 492 */                           if (!(obj3 instanceof List)) {
/* 541 */                               IOl1II00.I00000oOI("Unexpected notification");
/* 544 */                               IOOlIIilOl0.I0000Il00O();
/* 8 */                                 return null;
                                    }
/* 503 */                           collectionI00O10llo = IOOi0Ool1i.I00O10llo((Collection) obj3, Collections.singletonList(collection));
                                }
/* 511 */                   } while (!atomicReference.compareAndSet(obj3, collectionI00O10llo));
/* 517 */                   if (ol1olI0o1I01.I0000Il00O()) {
/* 519 */                       Function1 function1 = ol1olI0o1I01.I00000oIO;
/* 525 */                       OIOo1iiI oIOo1iiI = new OIOo1iiI(29);
/* 528 */                       oIOo1iiI.I00iiI = ol1olI0o1I01;
/* 530 */                       VarHandle.storeStoreFence();
/* 533 */                       function1.invoke(oIOo1iiI);
                            }
/* 536 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 447 */                   ((I01O1lIi) obj4).I00OloOo((String) obj, (List) obj2);
/* 450 */                   return OoiIlOl1iI.I00000oIO;
                        case 3:
/* 416 */                   int iI001iOo1i0O = OlOoOIi0o.I001iOo1i0O((CharSequence) obj, (char[]) obj4, ((Integer) obj2).intValue(), false);
/* 420 */                   if (iI001iOo1i0O < 0) {
/* 8 */                         return null;
                            }
/* 433 */                   return new OIoi0IIoi(Integer.valueOf(iI001iOo1i0O), 1);
                        case 4:
/* 377 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 383 */                   ((Integer) obj2).intValue();
/* 389 */                   iloI0lOlll1.I00i01iIIliI(950061013);
/* 396 */                   String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
/* 400 */                   iloI0lOlll1.I0010I0i(false);
/* 403 */                   return strValueOf;
                        case 5:
/* 348 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 354 */                   ((Integer) obj2).intValue();
/* 360 */                   iloI0lOlll12.I00i01iIIliI(-1376593684);
/* 367 */                   String string = ((RemoteAction) obj4).getTitle().toString();
/* 371 */                   iloI0lOlll12.I0010I0i(false);
/* 374 */                   return string;
                        case 6:
/* 333 */                   ((Integer) obj2).getClass();
/* 340 */                   ((Oo0io0) obj4).I00000oIO(lIill1iOoIO.I00000oIO(1), (IloI0lOlll1) obj);
/* 343 */                   return OoiIlOl1iI.I00000oIO;
                        case 7:
/* 250 */                   OoI1lOl ooI1lOl = (OoI1lOl) obj4;
/* 252 */                   IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 258 */                   int iIntValue = ((Integer) obj2).intValue();
/* 272 */                   if (iloI0lOlll13.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 313 */                       Oo0i1oIIoOO.I00000oOI(ooI1lOl.I00000oIO, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, iloI0lOlll13, 0, 0, 262142);
                            } else {
/* 319 */                       iloI0lOlll13.I00OilO00Il();
                            }
/* 322 */                   return OoiIlOl1iI.I00000oIO;
                        case 8:
/* 244 */                   ((Ooi11l0lI) obj4).I000OOo1O.I00OloOo((String) obj, (List) obj2);
/* 247 */                   return OoiIlOl1iI.I00000oIO;
                        case 9:
/* 226 */                   ((O0o01OIl) obj4).invoke(obj);
/* 229 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 131 */                   iI1I1I ii1i1i = (iI1I1I) obj4;
/* 133 */                   String str = (String) obj;
/* 137 */                   List list = (List) obj2;
/* 139 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 147 */                   if (!"Content-Length".equals(str) && !"Content-Type".equals(str)) {
/* 165 */                       if (Oolloi0i.I00000oIO.contains(str)) {
/* 169 */                           Iterator it = list.iterator();
/* 177 */                           while (it.hasNext()) {
/* 185 */                               ii1i1i.invoke(str, (String) it.next());
                                    }
                                } else {
/* 216 */                           ii1i1i.invoke(str, IOOi0Ool1i.I00IlilI0i0i(list, "Cookie".equals(str) ? "; " : ",", null, null, null, 62));
                                }
                            }
/* 219 */                   return ooiIlOl1iI;
                        case 11:
/* 126 */                   return IooO0O.I00000oIO(((II0IlloOiO0i) obj4).I00000oIO(0, (int) (((IooOl0ol01) obj).I00000oIO >> 32), (O0iOOoiioO) obj2) << 32);
                        case 12:
/* 100 */                   return IooO0O.I00000oIO(((II0O000iIl) obj4).I00000oIO(0, (int) (((IooOl0ol01) obj).I00000oIO & 4294967295L)) & 4294967295L);
                        case 13:
/* 72 */                    return IooO0O.I00000oIO(((I0iolI1I11l1) obj4).I00000oIO(0L, ((IooOl0ol01) obj).I00000oIO, (O0iOOoiioO) obj2));
                        default:
/* 25 */                    float fFloatValue = ((Float) obj2).floatValue();
/* 29 */                    OlO0OIIl1 olO0OIIl1 = ((i0I01lo) obj4).I00000oOI;
/* 49 */                    olO0OIIl1.I000lI(null, i0I01ii.I00000oIO((i0I01ii) olO0OIIl1.getValue(), null, false, (String) obj, fFloatValue, null, null, false, 115));
/* 52 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
