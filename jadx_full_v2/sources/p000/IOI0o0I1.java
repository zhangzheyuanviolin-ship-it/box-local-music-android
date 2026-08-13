            package p000;

            import sun.misc.Unsafe;
            
            public final class IOI0o0I1 extends O010olO {
                public IIoOoIol0Io0 I00ilI0I1;

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             return true;
                }

                @Override
                public final void I000oI1ioi(Throwable th) {
/* 1 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00ilI0I1;
/* 7 */             Throwable thI00100o1O0lo = iIoOoIol0Io0.I00100o1O0lo(I000lI());
/* 15 */            if (iIoOoIol0Io0.I001i1lo1io()) {
/* 21 */                IiiI1lIo iiiI1lIo = (IiiI1lIo) iIoOoIol0Io0.I00iio;
                        while (true) {
/* 23 */                    Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 25 */                    long j = IiiI1lIo.I00ioIO;
/* 27 */                    Object objectVolatile = unsafe.getObjectVolatile(iiiI1lIo, j);
/* 31 */                    I0OooiI1I i0OooiI1I = IiiIIO0IO.I00000oOI;
/* 37 */                    if (O0000Ioio00.I0000O(objectVolatile, i0OooiI1I)) {
/* 43 */                        if (unsafe.compareAndSwapObject(iiiI1lIo, j, i0OooiI1I, thI00100o1O0lo)) {
/* 186 */                           return;
                                }
                            } else {
/* 48 */                        if (objectVolatile instanceof Throwable) {
/* 186 */                           return;
                                }
/* 59 */                        if (unsafe.compareAndSwapObject(iiiI1lIo, j, objectVolatile, (Object) null)) {
                                    break;
                                }
                            }
                        }
                    }
/* 61 */            iIoOoIol0Io0.I0000O(thI00100o1O0lo);
/* 68 */            if (iIoOoIol0Io0.I001i1lo1io()) {
/* 186 */               return;
                    }
/* 70 */            iIoOoIol0Io0.I000o00OoI0I();
                }
            }
