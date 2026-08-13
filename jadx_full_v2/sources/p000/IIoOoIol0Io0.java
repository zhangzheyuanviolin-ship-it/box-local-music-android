            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            import sun.misc.Unsafe;
            
            public class IIoOoIol0Io0 extends IiiIIOii implements IIoOo1iIio1l, Ii011lOOlI1, OoooliO1IoI1 {
                public static final long I00ilO0;
                public static final long I00io1l;
                public static final long I00ioIO;
                public final IOoil1iiIilo I00iio;
                public final Ii00l101O I00ilI0I1;
                private volatile int _decisionAndIndex$volatile;
                private volatile Object _parentHandle$volatile;
                private volatile Object _state$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00ilO0 = unsafe.objectFieldOffset(IIoOoIol0Io0.class.getDeclaredField("_decisionAndIndex$volatile"));
/* 27 */            I00ioIO = unsafe.objectFieldOffset(IIoOoIol0Io0.class.getDeclaredField("_state$volatile"));
/* 39 */            I00io1l = unsafe.objectFieldOffset(IIoOoIol0Io0.class.getDeclaredField("_parentHandle$volatile"));
                }

                public IIoOoIol0Io0(int i, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             super(i);
/* 4 */             this.I00iio = iOoil1iiIilo;
/* 10 */            this.I00ilI0I1 = iOoil1iiIilo.getContext();
/* 15 */            this._decisionAndIndex$volatile = 536870911;
/* 19 */            this._state$volatile = I0I1lll0O0.I00iOIl;
                }

                public static void I001iOo1i0O(OIIoiiOIil00 oIIoiiOIil00, Object obj) {
/* 89 */            throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + oIIoiiOIil00 + ", already has " + obj).toString());
                }

                public static Object I00II0Ol1O0l(OIIoiiOIil00 oIIoiiOIil00, Object obj, int i, Function3 function3) {
/* 3 */             if (obj instanceof IOiIII1I) {
/* 5 */                 return obj;
                    }
/* 7 */             if (i != 1 && i != 2) {
/* 13 */                return obj;
                    }
/* 14 */            if (function3 != null || (oIIoiiOIil00 instanceof IIoOOiIO0o1I)) {
/* 38 */                return new IOiII0Ii10(obj, oIIoiiOIil00 instanceof IIoOOiIO0o1I ? (IIoOOiIO0o1I) oIIoiiOIil00 : null, function3, (Throwable) null, 16);
                    }
/* 20 */            return obj;
                }

                @Override
                public final void I00000oIO(Oii1O0I oii1O0I, int i) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 14 */                if ((intVolatile & 536870911) != 536870911) {
/* 37 */                    I000II.I001IO000("invokeOnCancellation should be called at most once");
/* 89 */                    return;
                        }
/* 22 */                IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 27 */                if (unsafe.compareAndSwapInt(iIoOoIol0Io0, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
/* 29 */                    iIoOoIol0Io0.I001i1O0Ol(oii1O0I);
/* 32 */                    return;
                        }
/* 33 */                this = iIoOoIol0Io0;
                    }
                }

                @Override
                public final void I00000oOI(CancellationException cancellationException) {
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    CancellationException cancellationException2;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ioIO;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 11 */                if (objectVolatile instanceof OIIoiiOIil00) {
/* 97 */                    I000II.I001IO000("Not completed");
/* 186 */                   return;
                        }
/* 15 */                if (objectVolatile instanceof IOiIII1I) {
/* 91 */                    return;
                        }
/* 20 */                if (objectVolatile instanceof IOiII0Ii10) {
/* 23 */                    IOiII0Ii10 iOiII0Ii10 = (IOiII0Ii10) objectVolatile;
/* 27 */                    if (iOiII0Ii10.I0000oI00 != null) {
/* 64 */                        I000II.I001IO000("Must be called at most once");
/* 67 */                        return;
                            }
/* 36 */                    iIoOoIol0Io0 = this;
/* 41 */                    if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, IOiII0Ii10.I00000oIO(iOiII0Ii10, null, cancellationException, 15))) {
/* 43 */                        IIoOOiIO0o1I iIoOOiIO0o1I = iOiII0Ii10.I00000oOI;
/* 45 */                        if (iIoOOiIO0o1I != null) {
/* 47 */                            iIoOoIol0Io0.I000iOII(iIoOOiIO0o1I, cancellationException);
                                }
/* 50 */                        Function3 function3 = iOiII0Ii10.I0000Il00O;
/* 52 */                        if (function3 != null) {
/* 56 */                            iIoOoIol0Io0.I000l1(function3, cancellationException, iOiII0Ii10.I00000oIO);
/* 59 */                            return;
                                }
/* 91 */                        return;
                            }
/* 60 */                    cancellationException2 = cancellationException;
                        } else {
/* 68 */                    iIoOoIol0Io0 = this;
/* 78 */                    cancellationException2 = cancellationException;
/* 89 */                    if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, new IOiII0Ii10(objectVolatile, (IIoOOiIO0o1I) null, (Function3) null, cancellationException2, 14))) {
/* 91 */                        return;
                            }
                        }
/* 92 */                this = iIoOoIol0Io0;
/* 93 */                cancellationException = cancellationException2;
                    }
                }

                @Override
                public final IOoil1iiIilo I0000Il00O() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean I0000O(Throwable th) {
                    Throwable cancellationException;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ioIO;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 12 */                if (!(objectVolatile instanceof OIIoiiOIil00)) {
/* 11 */                    return false;
                        }
/* 15 */                boolean z = false;
/* 21 */                if ((objectVolatile instanceof IIoOOiIO0o1I) || (objectVolatile instanceof Oii1O0I)) {
/* 27 */                    z = true;
                        }
/* 28 */                if (th == null) {
/* 51 */                    cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
                        } else {
/* 55 */                    cancellationException = th;
                        }
/* 56 */                IIoiii01l0l iIoiii01l0l = new IIoiii01l0l(z, cancellationException);
/* 59 */                IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 64 */                if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, iIoiii01l0l)) {
/* 67 */                    OIIoiiOIil00 oIIoiiOIil00 = (OIIoiiOIil00) objectVolatile;
/* 71 */                    if (oIIoiiOIil00 instanceof IIoOOiIO0o1I) {
/* 75 */                        iIoOoIol0Io0.I000iOII((IIoOOiIO0o1I) objectVolatile, th);
                            } else if (oIIoiiOIil00 instanceof Oii1O0I) {
/* 85 */                        iIoOoIol0Io0.I000lI((Oii1O0I) objectVolatile, th);
                            }
/* 92 */                    if (!iIoOoIol0Io0.I001i1lo1io()) {
/* 94 */                        iIoOoIol0Io0.I000o00OoI0I();
                            }
/* 99 */                    iIoOoIol0Io0.I00100l0(iIoOoIol0Io0.I00iiO);
/* 20 */                    return true;
                        }
/* 103 */               this = iIoOoIol0Io0;
                    }
                }

                @Override
                public final Throwable I0000oI00(Object obj) {
/* 1 */             Throwable thI0000oI00 = super.I0000oI00(obj);
/* 5 */             if (thI0000oI00 != null) {
/* 7 */                 return thI0000oI00;
                    }
/* 8 */             return null;
                }

                @Override
                public final Object I0001Ioi1lo(Object obj) {
                    return obj instanceof IOiII0Ii10 ? ((IOiII0Ii10) obj).I00000oIO : obj;
                }

                @Override
                public final Object I000O01llI0() {
/* 1 */             return I0010o();
                }

                @Override
                public final I0OooiI1I I000OOo1O(Object obj, Function3 function3) {
/* 1 */             return I00II0oii1o(obj, function3);
                }

                @Override
                public final void I000OiO(Object obj, Function3 function3) throws IiiI1OOll0l1 {
/* 3 */             I001lllioOl(obj, this.I00iiO, function3);
                }

                public final void I000iOII(IIoOOiIO0o1I iIoOOiIO0o1I, Throwable th) {
                    try {
/* 1 */                 iIoOOiIO0o1I.I00000oOI(th);
                    } catch (Throwable th2) {
/* 28 */                iiooO1ll.I00000oIO(this.I00ilI0I1, new IOiIIo1l("Exception in invokeOnCancellation handler for " + this, th2, 0));
                    }
                }

                public final void I000l1(Function3 function3, Throwable th, Object obj) {
/* 1 */             Ii00l101O ii00l101O = this.I00ilI0I1;
                    try {
/* 3 */                 function3.invoke(th, obj, ii00l101O);
                    } catch (Throwable th2) {
/* 28 */                iiooO1ll.I00000oIO(ii00l101O, new IOiIIo1l("Exception in resume onCancellation handler for " + this, th2, 0));
                    }
                }

                public final void I000lI(Oii1O0I oii1O0I, Throwable th) {
/* 1 */             Ii00l101O ii00l101O = this.I00ilI0I1;
/* 14 */            int intVolatile = I1Ioolli0l0o.I00000oIO.getIntVolatile(this, I00ilO0) & 536870911;
/* 15 */            if (intVolatile == 536870911) {
/* 48 */                I000II.I001IO000("The index for Segment.onCancellation(..) is broken");
/* 89 */                return;
                    }
                    try {
/* 17 */                oii1O0I.I000O01llI0(intVolatile, ii00l101O);
                    } catch (Throwable th2) {
/* 42 */                iiooO1ll.I00000oIO(ii00l101O, new IOiIIo1l("Exception in invokeOnCancellation handler for " + this, th2, 0));
                    }
                }

                public final void I000o00OoI0I() {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */             long j = I00io1l;
/* 9 */             IiiOlIiio iiiOlIiio = (IiiOlIiio) unsafe.getObjectVolatile(this, j);
/* 11 */            if (iiiOlIiio == null) {
/* 13 */                return;
                    }
/* 14 */            iiiOlIiio.I00000oOI();
/* 19 */            unsafe.putObjectVolatile(this, j, OIIo00iiOi.I00iOIl);
                }

                @Override
                public final void I000oI1ioi(Object obj) {
/* 3 */             I00100l0(this.I00iiO);
                }

                public final void I00100l0(int i) throws IiiI1OOll0l1 {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 9 */                 int i2 = intVolatile >> 29;
/* 11 */                if (i2 != 0) {
/* 14 */                    if (i2 != 1) {
/* 122 */                       I000II.I001IO000("Already resumed");
/* 125 */                       return;
                            }
/* 22 */                    boolean z = i == 4;
/* 23 */                    IOoil1iiIilo iOoil1iiIilo = this.I00iio;
/* 25 */                    if (!z && (iOoil1iiIilo instanceof IiiI1lIo)) {
/* 39 */                        boolean z2 = i == 1 || i == 2;
/* 40 */                        int i3 = this.I00iiO;
/* 47 */                        if (z2 == (i3 == 1 || i3 == 2)) {
/* 50 */                            IiiI1lIo iiiI1lIo = (IiiI1lIo) iOoil1iiIilo;
/* 52 */                            Ii00lIOoi ii00lIOoi = iiiI1lIo.I00iio;
/* 56 */                            Ii00l101O context = iiiI1lIo.I00ilI0I1.getContext();
/* 64 */                            if (IiiIIO0IO.I0000Il00O(ii00lIOoi, context)) {
/* 66 */                                IiiIIO0IO.I00000oOI(ii00lIOoi, context, this);
/* 69 */                                return;
                                    }
/* 70 */                            Il10o00 il10o00I00000oIO = Oo100i0OO.I00000oIO();
/* 83 */                            if (il10o00I00000oIO.I00iiI >= 4294967296L) {
/* 85 */                                il10o00I00000oIO.I00oooO(this);
/* 88 */                                return;
                                    }
/* 89 */                            il10o00I00000oIO.I010II(true);
                                    try {
/* 92 */                                il1i0O.I00000oIO(this, iOoil1iiIilo, true);
/* 99 */                                do {
/* 99 */                                } while (il10o00I00000oIO.I010iIIOlo());
                                    } finally {
                                        try {
/* 140 */                                   return;
                                        } finally {
                                        }
                                    }
/* 140 */                           return;
                                }
                            }
/* 116 */                   il1i0O.I00000oIO(this, iOoil1iiIilo, z);
/* 119 */                   return;
                        }
/* 133 */               IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 138 */               if (unsafe.compareAndSwapInt(iIoOoIol0Io0, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
/* 140 */                   return;
                        } else {
/* 141 */                   this = iIoOoIol0Io0;
                        }
                    }
                }

                public Throwable I00100o1O0lo(O011OOl11 o011OOl11) {
/* 1 */             return o011OOl11.I00Io1lO();
                }

                public final Object I0010I0i() {
                    O010OIi o010OIi;
/* 1 */             boolean zI001i1lo1io = I001i1lo1io();
                    while (true) {
/* 5 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 7 */                 long j = I00ilO0;
/* 9 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 13 */                int i = intVolatile >> 29;
/* 15 */                if (i != 0) {
/* 18 */                    if (i != 2) {
/* 79 */                        I000II.I001IO000("Already suspended");
/* 82 */                        return null;
                            }
/* 20 */                    if (zI001i1lo1io) {
/* 22 */                        this.I001lIiIIo1O();
                            }
/* 25 */                    Object objI0010o = this.I0010o();
/* 31 */                    if (objI0010o instanceof IOiIII1I) {
/* 76 */                        throw ((IOiIII1I) objI0010o).I00000oIO;
                            }
/* 33 */                    int i2 = this.I00iiO;
/* 36 */                    if ((i2 != 1 && i2 != 2) || (o010OIi = (O010OIi) this.I00ilI0I1.I00lli11(Iioi0lilII.I00iio)) == null || o010OIi.I0000Il00O()) {
/* 67 */                        return this.I0001Ioi1lo(objI0010o);
                            }
/* 59 */                    CancellationException cancellationExceptionI00Io1lO = o010OIi.I00Io1lO();
/* 63 */                    this.I00000oOI(cancellationExceptionI00Io1lO);
/* 66 */                    throw cancellationExceptionI00Io1lO;
                        }
/* 91 */                IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 96 */                if (unsafe.compareAndSwapInt(iIoOoIol0Io0, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
/* 106 */                   if (((IiiOlIiio) unsafe.getObjectVolatile(iIoOoIol0Io0, I00io1l)) == null) {
/* 108 */                       iIoOoIol0Io0.I001IIilI0O();
                            }
/* 111 */                   if (zI001i1lo1io) {
/* 113 */                       iIoOoIol0Io0.I001lIiIIo1O();
                            }
/* 116 */                   return Ii0111o.I00iOIl;
                        }
/* 119 */               this = iIoOoIol0Io0;
                    }
                }

                public final Object I0010o() {
/* 5 */             return I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00ioIO);
                }

                public final void I00111O() {
/* 1 */             IiiOlIiio iiiOlIiioI001IIilI0O = I001IIilI0O();
/* 5 */             if (iiiOlIiioI001IIilI0O == null || (I0010o() instanceof OIIoiiOIil00)) {
/* 29 */                return;
                    }
/* 16 */            iiiOlIiioI001IIilI0O.I00000oOI();
/* 25 */            I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, I00io1l, OIIo00iiOi.I00iOIl);
                }

                public final IiiOlIiio I001IIilI0O() {
/* 9 */             O010OIi o010OIi = (O010OIi) this.I00ilI0I1.I00lli11(Iioi0lilII.I00iio);
/* 11 */            if (o010OIi == null) {
/* 13 */                return null;
                    }
/* 17 */            IOI0o0I1 iOI0o0I1 = new IOI0o0I1();
/* 20 */            iOI0o0I1.I00ilI0I1 = this;
/* 22 */            VarHandle.storeStoreFence();
/* 26 */            IiiOlIiio iiiOlIiioI0001Ioi1lo = l01oO1iOo.I0001Ioi1lo(o010OIi, true, iOI0o0I1);
/* 36 */            I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00io1l, (Object) null, iiiOlIiioI0001Ioi1lo);
/* 113 */           return iiiOlIiioI0001Ioi1lo;
                }

                public final void I001IO000(Function1 function1) {
/* 4 */             IIoOIOIIIl iIoOIOIIIl = new IIoOIOIIIl(1);
/* 7 */             iIoOIOIIIl.I00iiI = function1;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            I001i1O0Ol(iIoOIOIIIl);
                }

                /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
                
                    I001iOo1i0O(r10, r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
                
                    throw null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001i1O0Ol(OIIoiiOIil00 oIIoiiOIil00) {
                    OIIoiiOIil00 oIIoiiOIil002;
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ioIO;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 11 */                if (objectVolatile instanceof I0I1lll0O0) {
/* 13 */                    IIoOoIol0Io0 iIoOoIol0Io02 = this;
/* 14 */                    OIIoiiOIil00 oIIoiiOIil003 = oIIoiiOIil00;
/* 20 */                    oIIoiiOIil002 = oIIoiiOIil003;
/* 21 */                    if (unsafe.compareAndSwapObject(iIoOoIol0Io02, j, objectVolatile, oIIoiiOIil003)) {
/* 163 */                       return;
                            } else {
/* 25 */                        iIoOoIol0Io0 = iIoOoIol0Io02;
                            }
                        } else {
/* 28 */                    oIIoiiOIil002 = oIIoiiOIil00;
/* 29 */                    IIoOoIol0Io0 iIoOoIol0Io03 = this;
/* 34 */                    if ((objectVolatile instanceof IIoOOiIO0o1I) || (objectVolatile instanceof Oii1O0I)) {
                                break;
                            }
/* 42 */                    if (objectVolatile instanceof IOiIII1I) {
/* 45 */                        IOiIII1I iOiIII1I = (IOiIII1I) objectVolatile;
/* 55 */                        if (!unsafe.compareAndSwapInt(iOiIII1I, IOiIII1I.I00000oOI, 0, 1)) {
/* 81 */                            I001iOo1i0O(oIIoiiOIil002, objectVolatile);
/* 84 */                            throw null;
                                }
/* 59 */                        if (objectVolatile instanceof IIoiii01l0l) {
/* 61 */                            Throwable th = iOiIII1I.I00000oIO;
/* 65 */                            if (oIIoiiOIil002 instanceof IIoOOiIO0o1I) {
/* 70 */                                iIoOoIol0Io03.I000iOII((IIoOOiIO0o1I) oIIoiiOIil002, th);
/* 73 */                                return;
                                    } else {
/* 77 */                                iIoOoIol0Io03.I000lI((Oii1O0I) oIIoiiOIil002, th);
/* 80 */                                return;
                                    }
                                }
/* 163 */                       return;
                            }
/* 87 */                    if (objectVolatile instanceof IOiII0Ii10) {
/* 90 */                        IOiII0Ii10 iOiII0Ii10 = (IOiII0Ii10) objectVolatile;
/* 94 */                        if (iOiII0Ii10.I00000oOI != null) {
/* 128 */                           I001iOo1i0O(oIIoiiOIil002, objectVolatile);
/* 131 */                           throw null;
                                }
/* 98 */                        if (oIIoiiOIil002 instanceof Oii1O0I) {
/* 163 */                           return;
                                }
/* 102 */                       IIoOOiIO0o1I iIoOOiIO0o1I = (IIoOOiIO0o1I) oIIoiiOIil002;
/* 104 */                       Throwable th2 = iOiII0Ii10.I0000oI00;
/* 106 */                       if (th2 != null) {
/* 108 */                           iIoOoIol0Io03.I000iOII(iIoOOiIO0o1I, th2);
/* 111 */                           return;
                                }
/* 114 */                       IOiII0Ii10 iOiII0Ii10I00000oIO = IOiII0Ii10.I00000oIO(iOiII0Ii10, iIoOOiIO0o1I, null, 29);
/* 119 */                       iIoOoIol0Io0 = iIoOoIol0Io03;
/* 124 */                       if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, iOiII0Ii10I00000oIO)) {
/* 163 */                           return;
                                }
                            } else {
/* 133 */                       iIoOoIol0Io0 = iIoOoIol0Io03;
/* 136 */                       if (oIIoiiOIil002 instanceof Oii1O0I) {
/* 163 */                           return;
                                }
/* 161 */                       if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, new IOiII0Ii10(objectVolatile, (IIoOOiIO0o1I) oIIoiiOIil002, (Function3) null, (Throwable) null, 28))) {
/* 163 */                           return;
                                }
                            }
                        }
/* 164 */               this = iIoOoIol0Io0;
/* 165 */               oIIoiiOIil00 = oIIoiiOIil002;
                    }
                }

                public final boolean I001i1lo1io() {
/* 4 */             if (this.I00iiO == 2) {
                        return I1Ioolli0l0o.I00000oIO.getObjectVolatile((IiiI1lIo) this.I00iio, IiiI1lIo.I00ioIO) != null;
                    }
/* 22 */            return false;
                }

                public String I001l0I00() {
/* 1 */             return "CancellableContinuation";
                }

                public final void I001lIiIIo1O() {
                    IIoOoIol0Io0 iIoOoIol0Io0;
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.I00iio;
/* 5 */             Throwable th = null;
/* 12 */            IiiI1lIo iiiI1lIo = iOoil1iiIilo instanceof IiiI1lIo ? (IiiI1lIo) iOoil1iiIilo : null;
/* 13 */            if (iiiI1lIo != null) {
                        while (true) {
/* 15 */                    Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 17 */                    long j = IiiI1lIo.I00ioIO;
/* 19 */                    Object objectVolatile = unsafe.getObjectVolatile(iiiI1lIo, j);
/* 23 */                    I0OooiI1I i0OooiI1I = IiiIIO0IO.I00000oOI;
/* 25 */                    if (objectVolatile == i0OooiI1I) {
/* 27 */                        IIoOoIol0Io0 iIoOoIol0Io02 = this;
/* 32 */                        iIoOoIol0Io0 = iIoOoIol0Io02;
/* 33 */                        if (unsafe.compareAndSwapObject(iiiI1lIo, j, i0OooiI1I, iIoOoIol0Io02)) {
                                    break;
                                } else {
/* 36 */                            this = iIoOoIol0Io0;
                                }
                            } else {
/* 38 */                        iIoOoIol0Io0 = this;
/* 41 */                        if (!(objectVolatile instanceof Throwable)) {
/* 73 */                            IOOlIIilOl0.I000lI("Inconsistent state ", objectVolatile);
/* 113 */                           return;
                                } else {
/* 49 */                            if (!unsafe.compareAndSwapObject(iiiI1lIo, j, objectVolatile, (Object) null)) {
/* 66 */                                I000II.I000iOII("Failed requirement.");
/* 69 */                                return;
                                    }
/* 52 */                            th = (Throwable) objectVolatile;
                                }
                            }
                        }
/* 54 */                if (th == null) {
/* 113 */                   return;
                        }
/* 57 */                iIoOoIol0Io0.I000o00OoI0I();
/* 60 */                iIoOoIol0Io0.I0000O(th);
                    }
                }

                public final void I001lllioOl(Object obj, int i, Function3 function3) throws IiiI1OOll0l1 {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ioIO;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 11 */                if (!(objectVolatile instanceof OIIoiiOIil00)) {
/* 43 */                    IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 46 */                    if (objectVolatile instanceof IIoiii01l0l) {
/* 49 */                        IIoiii01l0l iIoiii01l0l = (IIoiii01l0l) objectVolatile;
/* 59 */                        if (unsafe.compareAndSwapInt(iIoiii01l0l, IIoiii01l0l.I0000Il00O, 0, 1)) {
/* 61 */                            if (function3 != null) {
/* 65 */                                iIoOoIol0Io0.I000l1(function3, iIoiii01l0l.I00000oIO, obj);
/* 68 */                                return;
                                    }
/* 68 */                            return;
                                }
                            }
/* 71 */                    IOOlIIilOl0.I000lI("Already resumed, but proposed with update ", obj);
/* 215 */                   return;
                        }
/* 20 */                IIoOoIol0Io0 iIoOoIol0Io02 = this;
/* 26 */                if (unsafe.compareAndSwapObject(iIoOoIol0Io02, j, objectVolatile, I00II0Ol1O0l((OIIoiiOIil00) objectVolatile, obj, i, function3))) {
/* 32 */                    if (!iIoOoIol0Io02.I001i1lo1io()) {
/* 34 */                        iIoOoIol0Io02.I000o00OoI0I();
                            }
/* 37 */                    iIoOoIol0Io02.I00100l0(i);
/* 40 */                    return;
                        }
/* 41 */                this = iIoOoIol0Io02;
                    }
                }

                public final void I001lloI(Ii00lIOoi ii00lIOoi, Object obj) {
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.I00iio;
/* 11 */            IiiI1lIo iiiI1lIo = iOoil1iiIilo instanceof IiiI1lIo ? (IiiI1lIo) iOoil1iiIilo : null;
/* 24 */            I001lllioOl(obj, (iiiI1lIo != null ? iiiI1lIo.I00iio : null) == ii00lIOoi ? 4 : this.I00iiO, null);
                }

                public final I0OooiI1I I00II0oii1o(Object obj, Function3 function3) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ioIO;
/* 5 */                 Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 11 */                if (!(objectVolatile instanceof OIIoiiOIil00)) {
/* 43 */                    return null;
                        }
/* 22 */                IIoOoIol0Io0 iIoOoIol0Io0 = this;
/* 27 */                if (unsafe.compareAndSwapObject(iIoOoIol0Io0, j, objectVolatile, I00II0Ol1O0l((OIIoiiOIil00) objectVolatile, obj, this.I00iiO, function3))) {
/* 29 */                    boolean zI001i1lo1io = iIoOoIol0Io0.I001i1lo1io();
/* 33 */                    I0OooiI1I i0OooiI1I = IIoOoi0o.I00000oIO;
/* 35 */                    if (!zI001i1lo1io) {
/* 37 */                        iIoOoIol0Io0.I000o00OoI0I();
                            }
/* 40 */                    return i0OooiI1I;
                        }
/* 41 */                this = iIoOoIol0Io0;
                    }
                }

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.I00iio;
/* 5 */             if (iOoil1iiIilo instanceof Ii011lOOlI1) {
/* 7 */                 return (Ii011lOOlI1) iOoil1iiIilo;
                    }
/* 10 */            return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 1 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 5 */             if (thI00000oOI != null) {
/* 11 */                obj = new IOiIII1I(false, thI00000oOI);
                    }
/* 17 */            I001lllioOl(obj, this.I00iiO, null);
                }

                public final String toString() {
/* 7 */             StringBuilder sb = new StringBuilder(I001l0I00());
/* 12 */            sb.append('(');
/* 21 */            sb.append(Ii1Oo1l.I00000oOI(this.I00iio));
/* 26 */            sb.append("){");
/* 29 */            Object objI0010o = I0010o();
/* 49 */            sb.append(objI0010o instanceof OIIoiiOIil00 ? "Active" : objI0010o instanceof IIoiii01l0l ? "Cancelled" : "Completed");
/* 54 */            sb.append("}@");
/* 61 */            sb.append(Ii1Oo1l.I00000oIO(this));
/* 64 */            return sb.toString();
                }
            }
