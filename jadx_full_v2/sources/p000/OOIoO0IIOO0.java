            package p000;

            import java.util.concurrent.CancellationException;
            import sun.misc.Unsafe;
            
            public final class OOIoO0IIOO0 extends I010101Oo1lO implements OOIoOo0O, IO1010 {
                public IIIII1OI1 I00ilI0I1;

                @Override
                public final Object I00000oOI(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 3 */             return this.I00ilI0I1.I00000oOI(iOoil1iiIilo, obj);
                }

                @Override
                public final Object I0000oI00() {
/* 3 */             return this.I00ilI0I1.I0000oI00();
                }

                @Override
                public final boolean I0001Ioi1lo(Throwable th) {
/* 4 */             return this.I00ilI0I1.I0000Il00O(false, th);
                }

                @Override
                public final void I000II(CancellationException cancellationException) {
/* 5 */             if (isCancelled()) {
/* 7 */                 return;
                    }
/* 8 */             if (cancellationException == null) {
/* 17 */                cancellationException = new O010il(I001i1O0Ol(), null, this);
                    }
/* 20 */            I001IIilI0O(cancellationException);
                }

                @Override
                public final Object I000iOII(IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             return this.I00ilI0I1.I000iOII(iOoil1iiIilo);
                }

                @Override
                public final Object I000lI(Object obj) {
/* 3 */             return this.I00ilI0I1.I000lI(obj);
                }

                @Override
                public final Object I000o00OoI0I(IOOo0ll iOOo0ll) throws Throwable {
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I00ilI0I1;
/* 3 */             iiiii1oi1.getClass();
/* 6 */             Object objI00IO1 = IIIII1OI1.I00IO1(iiiii1oi1, iOOo0ll);
/* 10 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 49 */            return objI00IO1;
                }

                @Override
                public final void I001IIilI0O(Throwable th) {
/* 1 */             CancellationException cancellationException = (CancellationException) th;
/* 6 */             this.I00ilI0I1.I0000Il00O(true, cancellationException);
/* 9 */             I00111O(cancellationException);
                }

                @Override
                public final void I00iIO(boolean z, Throwable th) {
/* 8 */             if (this.I00ilI0I1.I0000Il00O(false, th) || z) {
/* 89 */                return;
                    }
/* 14 */            iiooO1ll.I00000oIO(this.I00iio, th);
                }

                @Override
                public final void I00iIi0i1o(Object obj) {
/* 6 */             this.I00ilI0I1.I0001Ioi1lo(null);
                }

                public final void I00iio(I1o1O0loII0 i1o1O0loII0) {
                    Unsafe unsafe;
                    long j;
                    I0OooiI1I i0OooiI1I;
/* 1 */             IIIII1OI1 iiiii1oi1 = this.I00ilI0I1;
/* 3 */             iiiii1oi1.getClass();
/* 16 */            if (I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iiiii1oi1, IIIII1OI1.I00lli11, (Object) null, i1o1O0loII0)) {
/* 18 */                return;
                    }
/* 37 */            do {
/* 19 */                unsafe = I1Ioolli0l0o.I00000oIO;
/* 21 */                j = IIIII1OI1.I00lli11;
/* 23 */                Object objectVolatile = unsafe.getObjectVolatile(iiiii1oi1, j);
/* 27 */                i0OooiI1I = IIIIIoiliIiO.I00100o1O0lo;
/* 29 */                if (objectVolatile != i0OooiI1I) {
/* 49 */                    if (objectVolatile == IIIIIoiliIiO.I0010I0i) {
/* 53 */                        I000II.I001IO000("Another handler was already registered and successfully invoked");
/* 56 */                        return;
                            } else {
/* 59 */                        IOOlIIilOl0.I000lI("Another handler is already registered: ", objectVolatile);
/* 186 */                       return;
                            }
                        }
/* 37 */            } while (!unsafe.compareAndSwapObject(iiiii1oi1, j, i0OooiI1I, IIIIIoiliIiO.I0010I0i));
/* 43 */            i1o1O0loII0.invoke(iiiii1oi1.I00100l0());
                }

                @Override
                public final IIII0iI10 iterator() {
/* 3 */             return this.I00ilI0I1.iterator();
                }
            }
