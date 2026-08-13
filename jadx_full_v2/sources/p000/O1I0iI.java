            package p000;

            import java.lang.invoke.VarHandle;
            import sun.misc.Unsafe;
            
            public abstract class O1I0iI {
                public static final long I00iOIl;
                public static final long I00iiI;
                public static final long I00iiO;
                private volatile Object _next$volatile = this;
                private volatile Object _prev$volatile = this;
                private volatile Object _removedRef$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00iOIl = unsafe.objectFieldOffset(O1I0iI.class.getDeclaredField("_next$volatile"));
/* 27 */            I00iiI = unsafe.objectFieldOffset(O1I0iI.class.getDeclaredField("_prev$volatile"));
/* 39 */            I00iiO = unsafe.objectFieldOffset(O1I0iI.class.getDeclaredField("_removedRef$volatile"));
                }

                public final boolean I0000oI00(O1I0iI o1I0iI, int i) {
                    while (true) {
/* 1 */                 O1I0iI o1I0iII000iOII = this.I000iOII();
/* 8 */                 if (o1I0iII000iOII instanceof O101oIol1I1) {
                            return (((O101oIol1I1) o1I0iII000iOII).I00iio & i) == 0 && o1I0iII000iOII.I0000oI00(o1I0iI, i);
                        }
/* 27 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 31 */                unsafe.putObjectVolatile(o1I0iI, I00iiI, o1I0iII000iOII);
/* 34 */                long j = I00iOIl;
/* 36 */                unsafe.putObjectVolatile(o1I0iI, j, this);
/* 39 */                O1I0iI o1I0iI2 = this;
/* 40 */                O1I0iI o1I0iI3 = o1I0iI;
/* 45 */                if (unsafe.compareAndSwapObject(o1I0iII000iOII, j, o1I0iI2, o1I0iI3)) {
/* 50 */                    o1I0iI3.I000O01llI0(o1I0iI2);
/* 7 */                     return true;
                        }
/* 47 */                this = o1I0iI2;
/* 48 */                o1I0iI = o1I0iI3;
                    }
                }

                public final void I0001Ioi1lo(int i) {
/* 3 */             O101oIol1I1 o101oIol1I1 = new O101oIol1I1();
/* 6 */             o101oIol1I1.I00iio = i;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            I0000oI00(o101oIol1I1, i);
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
                
                    return r8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1I0iI I000II() {
                    O1I0iI o1I0iI;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00iiI;
/* 10 */                O1I0iI o1I0iI2 = (O1I0iI) unsafe.getObjectVolatile(this, j);
/* 13 */                O1I0iI o1I0iI3 = null;
/* 14 */                O1I0iI o1I0iI4 = o1I0iI2;
/* 15 */                while (o1I0iI4 != null) {
/* 17 */                    Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 19 */                    long j2 = I00iOIl;
/* 21 */                    Object objectVolatile = unsafe2.getObjectVolatile(o1I0iI4, j2);
/* 25 */                    if (objectVolatile != this) {
/* 43 */                        O1I0iI o1I0iI5 = o1I0iI4;
/* 45 */                        o1I0iI = this;
/* 50 */                        if (o1I0iI.I000l1()) {
/* 12 */                            return null;
                                }
/* 55 */                        if (!(objectVolatile instanceof Oi00o1O0Io)) {
/* 95 */                            o1I0iI3 = o1I0iI5;
/* 93 */                            o1I0iI4 = (O1I0iI) objectVolatile;
                                } else if (o1I0iI3 != null) {
/* 67 */                            if (!unsafe2.compareAndSwapObject(o1I0iI3, j2, o1I0iI5, ((Oi00o1O0Io) objectVolatile).I00000oIO)) {
                                        break;
                                    }
/* 70 */                            this = o1I0iI;
/* 71 */                            o1I0iI4 = o1I0iI3;
/* 72 */                            o1I0iI3 = null;
                                } else {
/* 76 */                            if (o1I0iI5 == null) {
/* 87 */                                OIiilo1Ool0o.I00000oIO();
/* 12 */                                return null;
                                    }
/* 83 */                            o1I0iI4 = (O1I0iI) unsafe2.getObjectVolatile(o1I0iI5, j);
                                }
/* 85 */                        this = o1I0iI;
                            } else if (o1I0iI2 != o1I0iI4) {
/* 32 */                        O1I0iI o1I0iI6 = this;
/* 33 */                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(o1I0iI6, I00iiI, o1I0iI2, o1I0iI4);
/* 37 */                        o1I0iI = o1I0iI6;
/* 38 */                        if (zCompareAndSwapObject) {
                                    break;
                                }
                            } else {
                                break;
                            }
/* 40 */                    this = o1I0iI;
                        }
/* 98 */                OIiilo1Ool0o.I00000oIO();
/* 12 */                return null;
                    }
                }

                public final void I000O01llI0(O1I0iI o1I0iI) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00iiI;
/* 10 */                O1I0iI o1I0iI2 = (O1I0iI) unsafe.getObjectVolatile(o1I0iI, j);
/* 16 */                if (this.I000OOo1O() != o1I0iI) {
/* 36 */                    return;
                        }
/* 19 */                O1I0iI o1I0iI3 = this;
/* 20 */                O1I0iI o1I0iI4 = o1I0iI;
/* 25 */                if (unsafe.compareAndSwapObject(o1I0iI4, j, o1I0iI2, o1I0iI3)) {
/* 31 */                    if (o1I0iI3.I000l1()) {
/* 33 */                        o1I0iI4.I000II();
/* 36 */                        return;
                            }
/* 36 */                    return;
                        }
/* 37 */                o1I0iI = o1I0iI4;
/* 38 */                this = o1I0iI3;
                    }
                }

                public final Object I000OOo1O() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iOIl);
                }

                public final O1I0iI I000OiO() {
/* 1 */             Object objI000OOo1O = I000OOo1O();
/* 13 */            Oi00o1O0Io oi00o1O0Io = objI000OOo1O instanceof Oi00o1O0Io ? (Oi00o1O0Io) objI000OOo1O : null;
                    return oi00o1O0Io != null ? oi00o1O0Io.I00000oIO : (O1I0iI) objI000OOo1O;
                }

                public final O1I0iI I000iOII() {
/* 1 */             O1I0iI o1I0iII000II = I000II();
/* 5 */             if (o1I0iII000II != null) {
/* 113 */               return o1I0iII000II;
                    }
/* 7 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 9 */             long j = I00iiI;
/* 11 */            Object objectVolatile = unsafe.getObjectVolatile(this, j);
                    while (true) {
/* 15 */                O1I0iI o1I0iI = (O1I0iI) objectVolatile;
/* 21 */                if (!o1I0iI.I000l1()) {
/* 23 */                    return o1I0iI;
                        }
/* 26 */                objectVolatile = I1Ioolli0l0o.I00000oIO.getObjectVolatile(o1I0iI, j);
                    }
                }

                public boolean I000l1() {
/* 5 */             return I000OOo1O() instanceof Oi00o1O0Io;
                }

                public String toString() {
/* 35 */            return new O0l0IOol0(1, 3, Ii1Oo1l.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + Ii1Oo1l.I00000oIO(this);
                }
            }
