            package p000;

            import android.media.ImageReader;
            import android.util.LongSparseArray;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            
            public final class O1li1Il implements IoiO1ilO, Iliol1ioii0i {
                public final Object I00iOIl;
                public final IIl1i10oO I00iiI;
                public int I00iiO;
                public final I0IOIlIOIII I00iio;
                public boolean I00ilI0I1;
                public final I0oO0iO1l0lo I00ilO0;
                public IoiO1iOOil11 I00io1l;
                public Executor I00ioIO;
                public final LongSparseArray I00l0I0l0lO1;
                public final LongSparseArray I00l0OO0IO;
                public int I00li1OI;
                public final ArrayList I00ll1;
                public final ArrayList I00lli11;

                public O1li1Il(int i, int i2, int i3, int i4) {
/* 7 */             I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(ImageReader.newInstance(i, i2, i3, i4));
/* 18 */            this.I00iOIl = new Object();
/* 23 */            IIl1i10oO iIl1i10oO = new IIl1i10oO(2);
/* 26 */            iIl1i10oO.I00000oOI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            this.I00iiI = iIl1i10oO;
/* 34 */            this.I00iiO = 0;
/* 40 */            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(21);
/* 43 */            i0IOIlIOIII.I00iiI = this;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            this.I00iio = i0IOIlIOIII;
/* 50 */            this.I00ilI0I1 = false;
/* 57 */            this.I00l0I0l0lO1 = new LongSparseArray();
/* 64 */            this.I00l0OO0IO = new LongSparseArray();
/* 71 */            this.I00lli11 = new ArrayList();
/* 73 */            this.I00ilO0 = i0oO0iO1l0lo;
/* 75 */            this.I00li1OI = 0;
/* 86 */            this.I00ll1 = new ArrayList(I000oI1ioi());
                }

                @Override
                public final void I00000oIO(Ilioo0O0O ilioo0O0O) {
                    synchronized (this.I00iOIl) {
/* 4 */                 I000II(ilioo0O0O);
                    }
                }

                @Override
                public final IoiO1IO1I1i I00000oOI() {
                    synchronized (this.I00iOIl) {
                        try {
/* 10 */                    if (this.I00ll1.isEmpty()) {
/* 12 */                        return null;
                            }
/* 25 */                    if (this.I00li1OI >= this.I00ll1.size()) {
/* 123 */                       throw new IllegalStateException("Maximum image number reached.");
                            }
/* 29 */                    ArrayList arrayList = new ArrayList();
/* 41 */                    for (int i = 0; i < this.I00ll1.size() - 1; i++) {
/* 55 */                        if (!this.I00lli11.contains(this.I00ll1.get(i))) {
/* 65 */                            arrayList.add((IoiO1IO1I1i) this.I00ll1.get(i));
                                }
                            }
/* 71 */                    Iterator it = arrayList.iterator();
/* 79 */                    while (it.hasNext()) {
/* 87 */                        ((IoiO1IO1I1i) it.next()).close();
                            }
/* 93 */                    int size = this.I00ll1.size();
/* 99 */                    ArrayList arrayList2 = this.I00ll1;
/* 101 */                   this.I00li1OI = size;
/* 107 */                   IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) arrayList2.get(size - 1);
/* 111 */                   this.I00lli11.add(ioiO1IO1I1i);
/* 115 */                   return ioiO1IO1I1i;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                @Override
                public final int I0000Il00O() {
                    int iI0000Il00O;
                    synchronized (this.I00iOIl) {
/* 6 */                 iI0000Il00O = this.I00ilO0.I0000Il00O();
                    }
/* 11 */            return iI0000Il00O;
                }

                @Override
                public final int I0000O() {
                    int iI0000O;
                    synchronized (this.I00iOIl) {
/* 6 */                 iI0000O = this.I00ilO0.I0000O();
                    }
/* 11 */            return iI0000O;
                }

                @Override
                public final void I0000oI00() {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00ilO0.I0000oI00();
/* 10 */                this.I00io1l = null;
/* 12 */                this.I00ioIO = null;
/* 15 */                this.I00iiO = 0;
                    }
                }

                @Override
                public final int I0001Ioi1lo() {
                    int iI0001Ioi1lo;
                    synchronized (this.I00iOIl) {
/* 6 */                 iI0001Ioi1lo = this.I00ilO0.I0001Ioi1lo();
                    }
/* 11 */            return iI0001Ioi1lo;
                }

                public final void I000II(Ilioo0O0O ilioo0O0O) {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     int iIndexOf = this.I00ll1.indexOf(ilioo0O0O);
/* 10 */                    if (iIndexOf >= 0) {
/* 14 */                        this.I00ll1.remove(iIndexOf);
/* 17 */                        int i = this.I00li1OI;
/* 19 */                        if (iIndexOf <= i) {
/* 23 */                            this.I00li1OI = i - 1;
                                }
                            }
/* 30 */                    this.I00lli11.remove(ilioo0O0O);
/* 35 */                    if (this.I00iiO > 0) {
/* 39 */                        I000OOo1O(this.I00ilO0);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public final void I000O01llI0(Oio0oi11l oio0oi11l) {
                    IoiO1iOOil11 ioiO1iOOil11;
                    Executor executor;
                    synchronized (this.I00iOIl) {
                        try {
/* 14 */                    if (this.I00ll1.size() < I000oI1ioi()) {
/* 16 */                        oio0oi11l.I00000oIO(this);
/* 21 */                        this.I00ll1.add(oio0oi11l);
/* 24 */                        ioiO1iOOil11 = this.I00io1l;
/* 26 */                        executor = this.I00ioIO;
                            } else {
/* 34 */                        l11I11lO.I0000O(3, "TAG");
/* 37 */                        oio0oi11l.close();
/* 40 */                        ioiO1iOOil11 = null;
/* 41 */                        executor = null;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 43 */            if (ioiO1iOOil11 != null) {
/* 45 */                if (executor == null) {
/* 65 */                    ioiO1iOOil11.I0000Il00O(this);
/* 68 */                    return;
                        }
/* 51 */                Io11iII11ll io11iII11ll = new Io11iII11ll(8);
/* 54 */                io11iII11ll.I00iiI = this;
/* 56 */                io11iII11ll.I00iiO = ioiO1iOOil11;
/* 58 */                VarHandle.storeStoreFence();
/* 61 */                executor.execute(io11iII11ll);
                    }
                }

                public final void I000OOo1O(IoiO1ilO ioiO1ilO) {
                    IoiO1IO1I1i ioiO1IO1I1iI00100l0;
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00ilI0I1) {
/* 9 */                         return;
                            }
/* 24 */                    int size = this.I00l0OO0IO.size() + this.I00ll1.size();
/* 30 */                    if (size >= ioiO1ilO.I000oI1ioi()) {
/* 34 */                        l11I11lO.I0000O(3, "MetadataImageReader");
/* 38 */                        return;
                            }
/* 88 */                    do {
                                try {
/* 39 */                            ioiO1IO1I1iI00100l0 = ioiO1ilO.I00100l0();
/* 43 */                            if (ioiO1IO1I1iI00100l0 != null) {
                                        this.I00iiO--;
/* 51 */                                size++;
/* 63 */                                this.I00l0OO0IO.put(ioiO1IO1I1iI00100l0.I00i0oil().I0000oI00(), ioiO1IO1I1iI00100l0);
/* 66 */                                I000OiO();
                                    }
                                } catch (IllegalStateException unused) {
/* 74 */                            l11I11lO.I0000O(3, "MetadataImageReader");
/* 77 */                            ioiO1IO1I1iI00100l0 = null;
                                }
/* 78 */                        if (ioiO1IO1I1iI00100l0 == null || this.I00iiO <= 0) {
                                    break;
                                }
/* 88 */                    } while (size < ioiO1ilO.I000oI1ioi());
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I000OiO() {
                    synchronized (this.I00iOIl) {
                        try {
/* 12 */                    for (int size = this.I00l0I0l0lO1.size() - 1; size >= 0; size--) {
/* 20 */                        IoiIIlOol1 ioiIIlOol1 = (IoiIIlOol1) this.I00l0I0l0lO1.valueAt(size);
/* 22 */                        long jI0000oI00 = ioiIIlOol1.I0000oI00();
/* 32 */                        IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) this.I00l0OO0IO.get(jI0000oI00);
/* 34 */                        if (ioiO1IO1I1i != null) {
/* 38 */                            this.I00l0OO0IO.remove(jI0000oI00);
/* 43 */                            this.I00l0I0l0lO1.removeAt(size);
/* 52 */                            I000O01llI0(new Oio0oi11l(ioiO1IO1I1i, null, ioiIIlOol1));
                                }
                            }
/* 61 */                    I000iOII();
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final void I000iOII() {
                    synchronized (this.I00iOIl) {
                        try {
/* 10 */                    if (this.I00l0OO0IO.size() != 0 && this.I00l0I0l0lO1.size() != 0) {
/* 24 */                        long jKeyAt = this.I00l0OO0IO.keyAt(0);
/* 28 */                        Long lValueOf = Long.valueOf(jKeyAt);
/* 34 */                        long jKeyAt2 = this.I00l0I0l0lO1.keyAt(0);
/* 48 */                        lII1OI11o1I.I00000oOI(!Long.valueOf(jKeyAt2).equals(lValueOf));
/* 53 */                        if (jKeyAt2 > jKeyAt) {
/* 63 */                            for (int size = this.I00l0OO0IO.size() - 1; size >= 0; size--) {
/* 73 */                                if (this.I00l0OO0IO.keyAt(size) < jKeyAt2) {
/* 83 */                                    ((IoiO1IO1I1i) this.I00l0OO0IO.valueAt(size)).close();
/* 88 */                                    this.I00l0OO0IO.removeAt(size);
                                        }
                                    }
                                } else {
/* 105 */                           for (int size2 = this.I00l0I0l0lO1.size() - 1; size2 >= 0; size2--) {
/* 115 */                               if (this.I00l0I0l0lO1.keyAt(size2) < jKeyAt) {
/* 119 */                                   this.I00l0I0l0lO1.removeAt(size2);
                                        }
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }

                @Override
                public final void I000lI(IoiO1iOOil11 ioiO1iOOil11, Executor executor) {
                    synchronized (this.I00iOIl) {
/* 4 */                 ioiO1iOOil11.getClass();
/* 7 */                 this.I00io1l = ioiO1iOOil11;
/* 9 */                 executor.getClass();
/* 12 */                this.I00ioIO = executor;
/* 18 */                this.I00ilO0.I000lI(this.I00iio, executor);
                    }
                }

                @Override
                public final int I000oI1ioi() {
                    int iI000oI1ioi;
                    synchronized (this.I00iOIl) {
/* 6 */                 iI000oI1ioi = this.I00ilO0.I000oI1ioi();
                    }
/* 11 */            return iI000oI1ioi;
                }

                @Override
                public final IoiO1IO1I1i I00100l0() {
                    synchronized (this.I00iOIl) {
                        try {
/* 10 */                    if (this.I00ll1.isEmpty()) {
/* 12 */                        return null;
                            }
/* 25 */                    if (this.I00li1OI >= this.I00ll1.size()) {
/* 55 */                        throw new IllegalStateException("Maximum image number reached.");
                            }
/* 27 */                    ArrayList arrayList = this.I00ll1;
/* 29 */                    int i = this.I00li1OI;
/* 33 */                    this.I00li1OI = i + 1;
/* 39 */                    IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) arrayList.get(i);
/* 43 */                    this.I00lli11.add(ioiO1IO1I1i);
/* 47 */                    return ioiO1IO1I1i;
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                @Override
                public final void close() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     if (this.I00ilI0I1) {
/* 9 */                         return;
                            }
/* 19 */                    Iterator it = new ArrayList(this.I00ll1).iterator();
/* 27 */                    while (it.hasNext()) {
/* 35 */                        ((IoiO1IO1I1i) it.next()).close();
                            }
/* 41 */                    this.I00ll1.clear();
/* 46 */                    this.I00ilO0.close();
/* 50 */                    this.I00ilI0I1 = true;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final Surface getSurface() {
                    Surface surface;
                    synchronized (this.I00iOIl) {
/* 6 */                 surface = this.I00ilO0.getSurface();
                    }
/* 11 */            return surface;
                }
            }
