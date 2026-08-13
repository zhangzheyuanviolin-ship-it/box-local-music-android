            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.Iterator;
            
/* 8 */     public final class IO0ioo1i0oo extends AbstractCollection implements Collection, O0IlOIOIoOI {
                public final int I00iOIl;
                public final Object I00iiI;

                public IO0ioo1i0oo(IO0l0Il0lO0 iO0l0Il0lO0) {
/* 2 */             this.I00iOIl = 0;
/* 4 */             this.I00iiI = iO0l0Il0lO0;
                }

                @Override
                public final boolean add(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 25 */                    throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override
                public boolean addAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 1:
/* 16 */                    throw new UnsupportedOperationException();
                        default:
/* 6 */                     return super.addAll(collection);
                    }
                }

                @Override
                public void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 1:
/* 20 */                    ((O1OOII) obj).clear();
                            break;
                        case 2:
/* 14 */                    ((OO0lo1Ooo) obj).clear();
                            break;
                        default:
/* 8 */                     super.clear();
                            break;
                    }
                }

                @Override
                public boolean contains(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 1:
/* 22 */                    return ((O1OOII) obj2).containsValue(obj);
                        case 2:
/* 15 */                    return ((OO0lo1Ooo) obj2).containsValue(obj);
                        default:
/* 8 */                     return super.contains(obj);
                    }
                }

                @Override
                public boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 1:
/* 15 */                    return ((O1OOII) this.I00iiI).isEmpty();
                        default:
/* 6 */                     return super.isEmpty();
                    }
                }

                @Override
                public final Iterator iterator() {
                    int i;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             int i3 = 2;
/* 4 */             Object obj = this.I00iiI;
                    switch (i2) {
                        case 0:
/* 46 */                    IO0iOo iO0iOo = new IO0iOo(i3);
/* 49 */                    iO0iOo.I00iio = (IO0l0Il0lO0) obj;
                            while (true) {
/* 51 */                        int i4 = iO0iOo.I00iiI;
/* 53 */                        IO0l0Il0lO0 iO0l0Il0lO0 = iO0iOo.I00iio;
/* 57 */                        if (i4 < iO0l0Il0lO0.I00ilI0I1 && ((i = iO0l0Il0lO0.I00iio[i4]) < 0 || iO0l0Il0lO0.I00iOIl[i] == null)) {
/* 73 */                            iO0iOo.I00iiI = i4 + 1;
                                }
                            }
/* 76 */                    VarHandle.storeStoreFence();
/* 79 */                    return iO0iOo;
                        case 1:
/* 38 */                    return new O1OIoioOO1lo((O1OOII) obj, 2);
                        default:
/* 11 */                    OO0lo1Ooo oO0lo1Ooo = (OO0lo1Ooo) obj;
/* 15 */                    OoIiOIo0i010[] ooIiOIo0i010Arr = new OoIiOIo0i010[8];
/* 18 */                    for (int i5 = 0; i5 < 8; i5++) {
/* 25 */                        ooIiOIo0i010Arr[i5] = new OoIiio1(2);
                            }
/* 30 */                    return new OO0oI01(oO0lo1Ooo, ooIiOIo0i010Arr);
                    }
                }

                @Override
                public boolean remove(Object obj) {
                    int i;
                    switch (this.I00iOIl) {
                        case 1:
/* 13 */                    O1OOII o1ooii = (O1OOII) this.I00iiI;
/* 15 */                    o1ooii.I0000Il00O();
/* 18 */                    int i2 = o1ooii.I00ilO0;
                            while (true) {
/* 20 */                        i = -1;
                                i2--;
/* 22 */                        if (i2 >= 0) {
/* 28 */                            if (o1ooii.I00iiO[i2] >= 0 && O0000Ioio00.I0000O(o1ooii.I00iiI[i2], obj)) {
/* 40 */                                i = i2;
                                    }
                                }
                            }
/* 41 */                    if (i < 0) {
/* 43 */                        return false;
                            }
/* 45 */                    o1ooii.I000iOII(i);
/* 48 */                    return true;
                        default:
/* 6 */                     return super.remove(obj);
                    }
                }

                @Override
                public boolean removeAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 1:
/* 15 */                    ((O1OOII) this.I00iiI).I0000Il00O();
                            break;
                    }
/* 6 */             return super.removeAll(collection);
                }

                @Override
                public boolean retainAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 1:
/* 15 */                    ((O1OOII) this.I00iiI).I0000Il00O();
                            break;
                    }
/* 6 */             return super.retainAll(collection);
                }

                @Override
                public final int size() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return ((IO0l0Il0lO0) obj).I00iiO;
                        case 1:
/* 15 */                    return ((O1OOII) obj).I00l0I0l0lO1;
                        default:
/* 10 */                    return ((OO0lo1Ooo) obj).I00ilO0;
                    }
                }

/* 9 */         public IO0ioo1i0oo(Object obj, int i) {
/* 10 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }
            }
