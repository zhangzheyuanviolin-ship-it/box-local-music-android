            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            public final class OI1I0OoOl extends Oil0ll implements OI11ol {
                public static final AtomicReferenceFieldUpdater I000OOo1O = AtomicReferenceFieldUpdater.newUpdater(OI1I0OoOl.class, Object.class, "owner$volatile");
                public static final long I000OiO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(OI1I0OoOl.class.getDeclaredField("owner$volatile"));
                private volatile Object owner$volatile;

                public OI1I0OoOl() {
/* 2 */             super(1);
/* 7 */             this.owner$volatile = OI1I0olIi.I00000oIO;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
                
                    r5 = p000.OI1I0OoOl.I000OOo1O;
                    r2 = r0.I00iiI;
                    r5.set(r2, null);
                    r5 = r0.I00iOIl;
                    r0 = new p000.O0l0IlolloIO(23);
                    r0.I00iiI = r2;
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r2 = r5.I00iiO;
                    r3 = new p000.I0iII1i10I(4);
                    r3.I00iiI = r0;
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r5.I001lllioOl(r1, r2, r3);
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             boolean zI000II = I000II();
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             if (!zI000II) {
/* 14 */                IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iOoil1iiIilo));
                        try {
/* 20 */                    OI1I0II oi1i0ii = new OI1I0II();
/* 23 */                    oi1i0ii.I00iiI = this;
/* 25 */                    oi1i0ii.I00iOIl = iIoOoIol0Io0I00000oOI;
/* 27 */                    VarHandle.storeStoreFence();
                            while (true) {
/* 32 */                        int andDecrement = Oil0ll.I0000oI00.getAndDecrement(this);
/* 38 */                        if (andDecrement <= this.I00000oIO) {
/* 40 */                            if (andDecrement > 0) {
                                        break;
                                    }
/* 85 */                            if (I0000O(oi1i0ii)) {
                                        break;
                                    }
                                }
                            }
/* 87 */                    Object objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 91 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 93 */                    if (objI0010I0i != ii0111o) {
/* 96 */                        objI0010I0i = ooiIlOl1iI;
                            }
/* 97 */                    if (objI0010I0i == ii0111o) {
/* 99 */                        return objI0010I0i;
                            }
                        } catch (Throwable th) {
/* 102 */                   iIoOoIol0Io0I00000oOI.I001lIiIIo1O();
/* 186 */                   throw th;
                        }
                    }
/* 100 */           return ooiIlOl1iI;
                }

                @Override
                public final void I00000oOI(Object obj) {
/* 5 */             while (this.I0001Ioi1lo()) {
/* 11 */                Object objectVolatile = I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I000OiO);
/* 15 */                I0OooiI1I i0OooiI1I = OI1I0olIi.I00000oIO;
/* 17 */                if (objectVolatile != i0OooiI1I) {
/* 19 */                    if (objectVolatile != obj && obj != null) {
/* 60 */                        throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                            }
/* 65 */                    OI1I0OoOl oI1I0OoOl = this;
/* 70 */                    if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(oI1I0OoOl, I000OiO, objectVolatile, i0OooiI1I)) {
/* 72 */                        oI1I0OoOl.I0000oI00();
/* 75 */                        return;
                            }
/* 76 */                    this = oI1I0OoOl;
                        }
                    }
/* 80 */            I000II.I001IO000("This mutex is not locked");
                }

                public final boolean I0001Ioi1lo() {
                    return Math.max(I1Ioolli0l0o.I00000oIO.getIntVolatile(this, Oil0ll.I0001Ioi1lo), 0) == 0;
                }

                public final boolean I000II() {
                    OI1I0OoOl oI1I0OoOl;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = Oil0ll.I0001Ioi1lo;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 11 */                if (intVolatile > this.I00000oIO) {
                            while (true) {
/* 13 */                        Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 15 */                        long j2 = Oil0ll.I0001Ioi1lo;
/* 17 */                        int intVolatile2 = unsafe2.getIntVolatile(this, j2);
/* 21 */                        int i = this.I00000oIO;
/* 23 */                        if (intVolatile2 <= i) {
/* 36 */                            oI1I0OoOl = this;
                                    break;
                                }
/* 25 */                        OI1I0OoOl oI1I0OoOl2 = this;
/* 30 */                        oI1I0OoOl = oI1I0OoOl2;
/* 31 */                        if (unsafe2.compareAndSwapInt(oI1I0OoOl2, j2, intVolatile2, i)) {
                                    break;
                                }
/* 34 */                        this = oI1I0OoOl;
                            }
                        } else {
/* 39 */                    oI1I0OoOl = this;
/* 40 */                    if (intVolatile <= 0) {
/* 42 */                        return false;
                            }
/* 50 */                    if (unsafe.compareAndSwapInt(oI1I0OoOl, j, intVolatile, intVolatile - 1)) {
/* 55 */                        unsafe.putObjectVolatile(oI1I0OoOl, I000OiO, (Object) null);
/* 58 */                        return true;
                            }
                        }
/* 37 */                this = oI1I0OoOl;
                    }
                }

                public final String toString() {
/* 48 */            return "Mutex@" + Ii1Oo1l.I00000oIO(this) + "[isLocked=" + I0001Ioi1lo() + ",owner=" + I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I000OiO) + ']';
                }
            }
