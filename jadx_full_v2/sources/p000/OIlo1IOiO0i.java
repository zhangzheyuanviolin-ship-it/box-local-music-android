            package p000;

            import android.util.Log;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.RandomAccess;
            
/* 30 */    public class OIlo1IOiO0i implements Iterator {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public OIlo1IOiO0i(i1liliil11 i1liliil11Var, byte b, byte b2) {
/* 3 */             this.I00iOIl = 15;
/* 8 */             this.I00iio = i1liliil11Var;
/* 10 */            Collection collection = i1liliil11Var.I00iiO;
/* 12 */            this.I00iiO = collection;
/* 29 */            this.I00iiI = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
                
                    if (r8.I00iOIl.containsKey(p000.IIi0I0I0o.I01lloolio1l) != false) goto L8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO(IIOoi0ooOoO iIOoi0ooOoO) {
/* 3 */             HashSet hashSet = (HashSet) this.I00iiO;
/* 7 */             if (iIOoi0ooOoO != null) {
/* 17 */                if (iIOoi0ooOoO.I00o0iI0io1(IIi0I0I0o.I0IilI00l) != IIi0I0I0o.I0I11O000oO) {
                        }
/* 31 */                ArrayList arrayList = new ArrayList();
/* 36 */                IIOoIilO iIOoIilOI00lli11 = iIOoi0ooOoO.I00lli11(IIi0I0I0o.I01lloolio1l);
/* 40 */                if (iIOoIilOI00lli11 != null) {
/* 45 */                    int size = iIOoIilOI00lli11.I00iOIl.size();
/* 50 */                    for (int i = 0; i < size; i++) {
/* 52 */                        IIOoOiOI iIOoOiOII00lll10 = iIOoIilOI00lli11.I00lll10(i);
/* 58 */                        if (iIOoOiOII00lll10 instanceof IIOoi0ooOoO) {
/* 62 */                            arrayList.add((IIOoi0ooOoO) iIOoOiOII00lll10);
                                } else {
/* 85 */                            Log.w("PdfBox-Android", "COSDictionary expected, but got ".concat(iIOoOiOII00lll10 == null ? "null" : iIOoOiOII00lll10.getClass().getSimpleName()));
                                }
                            }
                        }
/* 91 */                Iterator it = arrayList.iterator();
/* 99 */                while (it.hasNext()) {
/* 105 */                   IIOoi0ooOoO iIOoi0ooOoO2 = (IIOoi0ooOoO) it.next();
/* 111 */                   if (hashSet.contains(iIOoi0ooOoO2)) {
/* 115 */                       Log.e("PdfBox-Android", "This page tree node has already been visited");
                            } else {
/* 127 */                       if (iIOoi0ooOoO2.I00iOIl.containsKey(IIi0I0I0o.I01lloolio1l)) {
/* 129 */                           hashSet.add(iIOoi0ooOoO2);
                                }
/* 132 */                       I00000oIO(iIOoi0ooOoO2);
                            }
                        }
/* 136 */               return;
                    }
/* 137 */           IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0I1101l0;
/* 139 */           IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I0IilI00l;
/* 149 */           if (iIi0I0I0o.equals(iIOoi0ooOoO.I00o0iI0io1(iIi0I0I0o2))) {
/* 155 */               ((ArrayDeque) this.I00iiI).add(iIOoi0ooOoO);
/* 158 */               return;
                    }
/* 177 */           Log.e("PdfBox-Android", "Page skipped due to an invalid or missing type " + iIOoi0ooOoO.I00o0iI0io1(iIi0I0I0o2));
                }

                public void I00000oOI() {
                    switch (this.I00iOIl) {
                        case 1:
/* 128 */                   i1liliil11 i1liliil11Var = (i1liliil11) this.I00iio;
/* 130 */                   i1liliil11Var.zzb();
/* 139 */                   if (i1liliil11Var.I00iiO != ((Collection) this.I00iiO)) {
/* 142 */                       I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        case 4:
/* 108 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) this.I00iio;
/* 110 */                   i1liliil11Var2.zzb();
/* 119 */                   if (i1liliil11Var2.I00iiO != ((Collection) this.I00iiO)) {
/* 122 */                       I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        case 6:
/* 88 */                    i1liliil11 i1liliil11Var3 = (i1liliil11) this.I00iio;
/* 90 */                    i1liliil11Var3.zzb();
/* 99 */                    if (i1liliil11Var3.I00iiO != ((Collection) this.I00iiO)) {
/* 102 */                       I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        case 9:
/* 68 */                    i1liliil11 i1liliil11Var4 = (i1liliil11) this.I00iio;
/* 70 */                    i1liliil11Var4.zzb();
/* 79 */                    if (i1liliil11Var4.I00iiO != ((Collection) this.I00iiO)) {
/* 82 */                        I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        case 11:
/* 48 */                    i1liliil11 i1liliil11Var5 = (i1liliil11) this.I00iio;
/* 50 */                    i1liliil11Var5.zzb();
/* 59 */                    if (i1liliil11Var5.I00iiO != ((Collection) this.I00iiO)) {
/* 62 */                        I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        case 14:
/* 28 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) this.I00iio;
/* 30 */                    i1liliil11Var6.zzb();
/* 39 */                    if (i1liliil11Var6.I00iiO != ((Collection) this.I00iiO)) {
/* 42 */                        I000II.I001IIilI0O();
                                break;
                            }
                            break;
                        default:
/* 8 */                     i1liliil11 i1liliil11Var7 = (i1liliil11) this.I00iio;
/* 10 */                    i1liliil11Var7.zzb();
/* 19 */                    if (i1liliil11Var7.I00iiO != ((Collection) this.I00iiO)) {
/* 22 */                        I000II.I001IIilI0O();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final boolean hasNext() {
                    switch (this.I00iOIl) {
                        case 1:
/* 159 */                   I00000oOI();
                            break;
                        case 4:
/* 129 */                   I00000oOI();
                            break;
                        case 6:
/* 108 */                   I00000oOI();
                            break;
                        case 9:
/* 78 */                    I00000oOI();
                            break;
                        case 11:
/* 57 */                    I00000oOI();
                            break;
                        case 14:
/* 27 */                    I00000oOI();
                            break;
                        case 15:
/* 15 */                    I00000oOI();
                            break;
                    }
/* 10 */            return ((Iterator) this.I00iiI).hasNext();
                }

                @Override
                public final Object next() {
                    switch (this.I00iOIl) {
                        case 0:
/* 590 */                   if (!hasNext()) {
/* 654 */                       IoOOl0iOl1io.I00000oOI();
/* 4 */                         return null;
                            }
/* 600 */                   IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) ((ArrayDeque) this.I00iiI).poll();
/* 602 */                   IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0IilI00l;
/* 604 */                   IIi0I0I0o iIi0I0I0oI00o0iI0io1 = iIOoi0ooOoO.I00o0iI0io1(iIi0I0I0o);
/* 608 */                   if (iIi0I0I0oI00o0iI0io1 == null) {
/* 612 */                       iIOoi0ooOoO.I010iIIOlo(iIi0I0I0o, IIi0I0I0o.I0I1101l0);
                            } else if (!IIi0I0I0o.I0I1101l0.equals(iIi0I0I0oI00o0iI0io1)) {
/* 650 */                       IoOOl0iOl1io.I000OOo1O("Expected 'Page' but found ", iIi0I0I0oI00o0iI0io1);
/* 4 */                         return null;
                            }
/* 628 */                   OIliOo11 oIliOo11 = ((OIlo1Ioo) this.I00iio).I00iiI;
/* 632 */                   IoIlOo1o0IIl ioIlOo1o0IIl = oIliOo11 != null ? oIliOo11.I00ilI0I1 : null;
/* 636 */                   OIlo0iIOiOI oIlo0iIOiOI = new OIlo0iIOiOI();
/* 639 */                   oIlo0iIOiOI.I00iOIl = iIOoi0ooOoO;
/* 641 */                   oIlo0iIOiOI.I00iiO = ioIlOo1o0IIl;
/* 643 */                   VarHandle.storeStoreFence();
/* 646 */                   return oIlo0iIOiOI;
                        case 1:
/* 574 */                   I00000oOI();
/* 581 */                   return ((Iterator) this.I00iiI).next();
                        case 2:
/* 515 */                   Map.Entry entry = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 523 */                   this.I00iiO = (Collection) entry.getValue();
/* 525 */                   Object key = entry.getKey();
/* 533 */                   Collection collection = (Collection) entry.getValue();
/* 541 */                   iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 543 */                   List list = (List) collection;
/* 557 */                   i1liliil11 ii1i11io0oi = list instanceof RandomAccess ? new iI1I11iO0oi(io0oolioo00, key, list, null) : new i1liliil11(io0oolioo00, key, list, (i1liliil11) null);
/* 563 */                   ii0ll0i ii0ll0iVar = new ii0ll0i(false, 1);
/* 566 */                   ii0ll0iVar.I00iiI = key;
/* 568 */                   ii0ll0iVar.I00iiO = ii1i11io0oi;
/* 570 */                   VarHandle.storeStoreFence();
/* 573 */                   return ii0ll0iVar;
                        case 3:
/* 448 */                   Map.Entry entry2 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 456 */                   this.I00iiO = (Collection) entry2.getValue();
/* 460 */                   i1liloI1Ol1 i1liloi1ol1 = (i1liloI1Ol1) this.I00iio;
/* 462 */                   Object key2 = entry2.getKey();
/* 468 */                   iOIoo1lI ioioo1li = (iOIoo1lI) i1liloi1ol1.I00ilI0I1;
/* 476 */                   List list2 = (List) ((Collection) entry2.getValue());
/* 490 */                   i1liliil11 iiii0o1oii = list2 instanceof RandomAccess ? new iIii0o1OII(ioioo1li, key2, list2, null) : new i1liliil11(ioioo1li, key2, list2, (i1liliil11) null);
/* 496 */                   ii1OOiiOi ii1ooiioi = new ii1OOiiOi(false, 2);
/* 499 */                   ii1ooiioi.I00iiI = key2;
/* 501 */                   ii1ooiioi.I00iiO = iiii0o1oii;
/* 503 */                   VarHandle.storeStoreFence();
/* 506 */                   return ii1ooiioi;
                        case 4:
/* 428 */                   I00000oOI();
/* 435 */                   return ((Iterator) this.I00iiI).next();
                        case 5:
/* 419 */                   Map.Entry entry3 = (Map.Entry) ((Iterator) this.I00iiO).next();
/* 421 */                   this.I00iiI = entry3;
/* 423 */                   return entry3.getKey();
                        case 6:
/* 399 */                   I00000oOI();
/* 406 */                   return ((Iterator) this.I00iiI).next();
                        case 7:
/* 348 */                   Map.Entry entry4 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 356 */                   this.I00iiO = (Collection) entry4.getValue();
/* 358 */                   Object key3 = entry4.getKey();
/* 366 */                   Collection collection2 = (Collection) entry4.getValue();
/* 374 */                   iii1IlooII iii1ilooii = (iii1IlooII) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 376 */                   List list3 = (List) collection2;
/* 395 */                   return new iiolOoolOo(key3, list3 instanceof RandomAccess ? new iiI1Io(iii1ilooii, key3, list3, null) : new i1liliil11(iii1ilooii, key3, list3, (i1liliil11) null));
                        case 8:
/* 331 */                   Map.Entry entry5 = (Map.Entry) ((Iterator) this.I00iiO).next();
/* 333 */                   this.I00iiI = entry5;
/* 335 */                   return entry5.getKey();
                        case 9:
/* 311 */                   I00000oOI();
/* 318 */                   return ((Iterator) this.I00iiI).next();
                        case 10:
/* 252 */                   Map.Entry entry6 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 260 */                   this.I00iiO = (Collection) entry6.getValue();
/* 262 */                   Object key4 = entry6.getKey();
/* 270 */                   Collection collection3 = (Collection) entry6.getValue();
/* 278 */                   loO1I0 loo1i0 = (loO1I0) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 280 */                   List list4 = (List) collection3;
/* 294 */                   i1liliil11 liol0oio = list4 instanceof RandomAccess ? new lIOl0OIo(loo1i0, key4, list4, null) : new i1liliil11(loo1i0, key4, list4, (i1liliil11) null);
/* 300 */                   iIl1I0oioOiO iil1i0oiooio = new iIl1I0oioOiO(false, 4);
/* 303 */                   iil1i0oiooio.I00iiI = key4;
/* 305 */                   iil1i0oiooio.I00iiO = liol0oio;
/* 307 */                   VarHandle.storeStoreFence();
/* 310 */                   return iil1i0oiooio;
                        case 11:
/* 232 */                   I00000oOI();
/* 239 */                   return ((Iterator) this.I00iiI).next();
                        case 12:
/* 173 */                   Map.Entry entry7 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 181 */                   this.I00iiO = (Collection) entry7.getValue();
/* 183 */                   Object key5 = entry7.getKey();
/* 191 */                   Collection collection4 = (Collection) entry7.getValue();
/* 199 */                   o10liooI o10liooi = (o10liooI) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 201 */                   List list5 = (List) collection4;
/* 215 */                   i1liliil11 lli0oiiio0 = list5 instanceof RandomAccess ? new lli0oiIio0(o10liooi, key5, list5, null) : new i1liliil11(o10liooi, key5, list5, (i1liliil11) null);
/* 221 */                   iOI1olO0l ioi1olo0l = new iOI1olO0l(false, 5);
/* 224 */                   ioi1olo0l.I00iiI = key5;
/* 226 */                   ioi1olo0l.I00iiO = lli0oiiio0;
/* 228 */                   VarHandle.storeStoreFence();
/* 231 */                   return ioi1olo0l;
                        case 13:
/* 106 */                   Map.Entry entry8 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 114 */                   this.I00iiO = (Collection) entry8.getValue();
/* 116 */                   Object key6 = entry8.getKey();
/* 124 */                   Collection collection5 = (Collection) entry8.getValue();
/* 132 */                   o10lo0 o10lo0Var = (o10lo0) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 134 */                   List list6 = (List) collection5;
/* 148 */                   i1liliil11 lli1i1l = list6 instanceof RandomAccess ? new lli1I1l(o10lo0Var, key6, list6, null) : new i1liliil11(o10lo0Var, key6, list6, (i1liliil11) null);
/* 154 */                   iOII1IIiiil ioii1iiiiil = new iOII1IIiiil(false, 6);
/* 157 */                   ioii1iiiiil.I00iiI = key6;
/* 159 */                   ioii1iiiiil.I00iiO = lli1i1l;
/* 161 */                   VarHandle.storeStoreFence();
/* 164 */                   return ioii1iiiiil;
                        case 14:
/* 86 */                    I00000oOI();
/* 93 */                    return ((Iterator) this.I00iiI).next();
                        case 15:
/* 74 */                    I00000oOI();
/* 81 */                    return ((Iterator) this.I00iiI).next();
                        default:
/* 16 */                    Map.Entry entry9 = (Map.Entry) ((Iterator) this.I00iiI).next();
/* 24 */                    this.I00iiO = (Collection) entry9.getValue();
/* 26 */                    Object key7 = entry9.getKey();
/* 34 */                    Collection collection6 = (Collection) entry9.getValue();
/* 42 */                    iI1oliOIO ii1olioio = (iI1oliOIO) ((i1liloI1Ol1) this.I00iio).I00ilI0I1;
/* 44 */                    List list7 = (List) collection6;
/* 58 */                    i1liliil11 o10li11li0Var = list7 instanceof RandomAccess ? new o10li11li0(ii1olioio, key7, list7, null) : new i1liliil11(ii1olioio, key7, list7, (i1liliil11) null);
/* 63 */                    iOo0Ooo1ii ioo0ooo1ii = new iOo0Ooo1ii(false, 0);
/* 66 */                    ioo0ooo1ii.I00iiI = key7;
/* 68 */                    ioo0ooo1ii.I00iiO = o10li11li0Var;
/* 70 */                    VarHandle.storeStoreFence();
/* 73 */                    return ioo0ooo1ii;
                    }
                }

                @Override
                public final void remove() {
                    switch (this.I00iOIl) {
                        case 0:
/* 530 */                   throw new UnsupportedOperationException();
                        case 1:
/* 512 */                   ((Iterator) this.I00iiI).remove();
/* 517 */                   i1liliil11 i1liliil11Var = (i1liliil11) this.I00iio;
/* 519 */                   Serializable serializable = i1liliil11Var.I00ilO0;
/* 521 */                   i1liliil11Var.I00000oOI();
/* 524 */                   return;
                        case 2:
/* 478 */                   if (!(((Collection) this.I00iiO) != null)) {
/* 504 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 507 */                       return;
                            }
/* 484 */                   ((Iterator) this.I00iiI).remove();
/* 491 */                   ((Collection) this.I00iiO).size();
/* 498 */                   ((Collection) this.I00iiO).clear();
/* 501 */                   this.I00iiO = null;
/* 507 */                   return;
                        case 3:
/* 427 */                   if (!(((Collection) this.I00iiO) != null)) {
/* 467 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 470 */                       return;
                            }
/* 433 */                   ((Iterator) this.I00iiI).remove();
                            ((iOIoo1lI) ((i1liloI1Ol1) this.I00iio).I00ilI0I1).I00iio -= ((Collection) this.I00iiO).size();
/* 461 */                   ((Collection) this.I00iiO).clear();
/* 464 */                   this.I00iiO = null;
/* 470 */                   return;
                        case 4:
/* 407 */                   ((Iterator) this.I00iiI).remove();
/* 412 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) this.I00iio;
/* 414 */                   Serializable serializable2 = i1liliil11Var2.I00ilO0;
/* 416 */                   i1liliil11Var2.I00000oOI();
/* 419 */                   return;
                        case 5:
/* 358 */                   Map.Entry entry = (Map.Entry) this.I00iiI;
/* 363 */                   if (!(entry != null)) {
/* 399 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 402 */                       return;
                            }
/* 369 */                   Collection collection = (Collection) entry.getValue();
/* 375 */                   ((Iterator) this.I00iiO).remove();
                            ((iIOo111l) this.I00iio).I00iiO.I00iio -= collection.size();
/* 393 */                   collection.clear();
/* 396 */                   this.I00iiI = null;
/* 402 */                   return;
                        case 6:
/* 335 */                   ((Iterator) this.I00iiI).remove();
/* 340 */                   i1liliil11 i1liliil11Var3 = (i1liliil11) this.I00iio;
/* 344 */                   iOIoo1lI ioioo1li = (iOIoo1lI) i1liliil11Var3.I00ilO0;
                            ioioo1li.I00iio--;
/* 352 */                   i1liliil11Var3.I00000oOI();
/* 355 */                   return;
                        case 7:
/* 290 */                   lil0iIo1Oiil.I0000Il00O("no calls to next() since the last call to remove()", ((Collection) this.I00iiO) != null);
/* 297 */                   ((Iterator) this.I00iiI).remove();
                            ((iii1IlooII) ((i1liloI1Ol1) this.I00iio).I00ilI0I1).I00ilI0I1 -= ((Collection) this.I00iiO).size();
/* 325 */                   ((Collection) this.I00iiO).clear();
/* 328 */                   this.I00iiO = null;
/* 330 */                   return;
                        case 8:
/* 242 */                   lil0iIo1Oiil.I0000Il00O("no calls to next() since the last call to remove()", ((Map.Entry) this.I00iiI) != null);
/* 253 */                   Collection collection2 = (Collection) ((Map.Entry) this.I00iiI).getValue();
/* 259 */                   ((Iterator) this.I00iiO).remove();
                            ((ii1oIilolI) this.I00iio).I00iiO.I00ilI0I1 -= collection2.size();
/* 277 */                   collection2.clear();
/* 280 */                   this.I00iiI = null;
/* 282 */                   return;
                        case 9:
/* 214 */                   ((Iterator) this.I00iiI).remove();
/* 219 */                   i1liliil11 i1liliil11Var4 = (i1liliil11) this.I00iio;
/* 223 */                   iii1IlooII iii1ilooii = (iii1IlooII) i1liliil11Var4.I00ilO0;
                            iii1ilooii.I00ilI0I1--;
/* 231 */                   i1liliil11Var4.I00000oOI();
/* 234 */                   return;
                        case 10:
/* 180 */                   if (!(((Collection) this.I00iiO) != null)) {
/* 206 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 209 */                       return;
                            }
/* 186 */                   ((Iterator) this.I00iiI).remove();
/* 193 */                   ((Collection) this.I00iiO).size();
/* 200 */                   ((Collection) this.I00iiO).clear();
/* 203 */                   this.I00iiO = null;
/* 209 */                   return;
                        case 11:
/* 160 */                   ((Iterator) this.I00iiI).remove();
/* 165 */                   i1liliil11 i1liliil11Var5 = (i1liliil11) this.I00iio;
/* 167 */                   Serializable serializable3 = i1liliil11Var5.I00ilO0;
/* 169 */                   i1liliil11Var5.I00000oOI();
/* 172 */                   return;
                        case 12:
/* 126 */                   if (!(((Collection) this.I00iiO) != null)) {
/* 152 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 155 */                       return;
                            }
/* 132 */                   ((Iterator) this.I00iiI).remove();
/* 139 */                   ((Collection) this.I00iiO).size();
/* 146 */                   ((Collection) this.I00iiO).clear();
/* 149 */                   this.I00iiO = null;
/* 155 */                   return;
                        case 13:
/* 89 */                    if (!(((Collection) this.I00iiO) != null)) {
/* 115 */                       I000II.I001IO000("no calls to next() since the last call to remove()");
/* 118 */                       return;
                            }
/* 95 */                    ((Iterator) this.I00iiI).remove();
/* 102 */                   ((Collection) this.I00iiO).size();
/* 109 */                   ((Collection) this.I00iiO).clear();
/* 112 */                   this.I00iiO = null;
/* 118 */                   return;
                        case 14:
/* 69 */                    ((Iterator) this.I00iiI).remove();
/* 74 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) this.I00iio;
/* 76 */                    Serializable serializable4 = i1liliil11Var6.I00ilO0;
/* 78 */                    i1liliil11Var6.I00000oOI();
/* 81 */                    return;
                        case 15:
/* 52 */                    ((Iterator) this.I00iiI).remove();
/* 57 */                    i1liliil11 i1liliil11Var7 = (i1liliil11) this.I00iio;
/* 59 */                    Serializable serializable5 = i1liliil11Var7.I00ilO0;
/* 61 */                    i1liliil11Var7.I00000oOI();
/* 64 */                    return;
                        default:
/* 18 */                    if (!(((Collection) this.I00iiO) != null)) {
/* 44 */                        I000II.I001IO000("no calls to next() since the last call to remove()");
/* 47 */                        return;
                            }
/* 24 */                    ((Iterator) this.I00iiI).remove();
/* 31 */                    ((Collection) this.I00iiO).size();
/* 38 */                    ((Collection) this.I00iiO).clear();
/* 41 */                    this.I00iiO = null;
/* 47 */                    return;
                    }
                }

/* 31 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var) {
                    Object it;
                    this.I00iOIl = 1;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 33 */                it = ((List) collection).listIterator();
                    } else {
/* 34 */                it = collection.iterator();
                    }
/* 35 */            this.I00iiI = it;
                }

/* 35 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var, byte b) {
                    Object it;
                    this.I00iOIl = 4;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 37 */                it = ((List) collection).listIterator();
                    } else {
/* 38 */                it = collection.iterator();
                    }
/* 39 */            this.I00iiI = it;
                }

/* 39 */        public OIlo1IOiO0i(int i) {
/* 40 */            this.I00iOIl = i;
                }

/* 40 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var, byte b, boolean z) {
                    Object it;
                    this.I00iOIl = 14;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 42 */                it = ((List) collection).listIterator();
                    } else {
/* 43 */                it = collection.iterator();
                    }
/* 44 */            this.I00iiI = it;
                }

/* 44 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var, char c) {
                    Object it;
                    this.I00iOIl = 6;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 46 */                it = ((List) collection).listIterator();
                    } else {
/* 47 */                it = collection.iterator();
                    }
/* 48 */            this.I00iiI = it;
                }

/* 48 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var, int i) {
                    Object it;
                    this.I00iOIl = 9;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 50 */                it = ((List) collection).listIterator();
                    } else {
/* 51 */                it = collection.iterator();
                    }
/* 52 */            this.I00iiI = it;
                }

/* 52 */        public OIlo1IOiO0i(i1liliil11 i1liliil11Var, short s) {
                    Object it;
                    this.I00iOIl = 11;
                    this.I00iio = i1liliil11Var;
                    Collection collection = i1liliil11Var.I00iiO;
                    this.I00iiO = collection;
                    if (collection instanceof List) {
/* 54 */                it = ((List) collection).listIterator();
                    } else {
/* 55 */                it = collection.iterator();
                    }
/* 56 */            this.I00iiI = it;
                }

/* 56 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1) {
                    this.I00iOIl = 2;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 57 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, byte b) {
                    this.I00iOIl = 3;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 58 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, byte b, byte b2) {
                    this.I00iOIl = 16;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 59 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, byte b, boolean z) {
                    this.I00iOIl = 13;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 60 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, char c) {
                    this.I00iOIl = 7;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 61 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, int i) {
                    this.I00iOIl = 10;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }

/* 62 */        public OIlo1IOiO0i(i1liloI1Ol1 i1liloi1ol1, short s) {
                    this.I00iOIl = 12;
                    this.I00iio = i1liloi1ol1;
                    this.I00iiI = i1liloi1ol1.I00iiI.entrySet().iterator();
                }
            }
