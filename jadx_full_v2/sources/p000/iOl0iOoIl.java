            package p000;

            import java.lang.invoke.VarHandle;
            import sun.misc.Unsafe;
            
            public abstract class iOl0iOoIl {
                public static final void I00000oIO(IIoOoIol0Io0 iIoOoIol0Io0, IiiOlIiio iiiOlIiio) {
/* 4 */             IIoOIOIIIl iIoOIOIIIl = new IIoOIOIIIl(2);
/* 7 */             iIoOIOIIIl.I00iiI = iiiOlIiio;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            iIoOoIol0Io0.I001i1O0Ol(iIoOIOIIIl);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
                
                    if (r6 == null) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
                
                    r0 = p000.IIoOoIol0Io0.I00ioIO;
                    r3 = r2.getObjectVolatile(r6, r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
                
                    if ((r3 instanceof p000.IOiII0Ii10) == false) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
                
                    if (((p000.IOiII0Ii10) r3).I0000O == null) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
                
                    r6.I000o00OoI0I();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
                
                    r2.putIntVolatile(r6, p000.IIoOoIol0Io0.I00ilO0, 536870911);
                    r2.putObjectVolatile(r6, r0, p000.I0I1lll0O0.I00iOIl);
                    r8 = r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
                
                    if (r8 != null) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
                
                    return r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
                
                    return new p000.IIoOoIol0Io0(2, r9);
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IIoOoIol0Io0 I00000oOI(IOoil1iiIilo iOoil1iiIilo) {
                    IIoOoIol0Io0 iIoOoIol0Io0;
/* 3 */             if (!(iOoil1iiIilo instanceof IiiI1lIo)) {
/* 8 */                 return new IIoOoIol0Io0(1, iOoil1iiIilo);
                    }
/* 13 */            IiiI1lIo iiiI1lIo = (IiiI1lIo) iOoil1iiIilo;
/* 15 */            long j = IiiI1lIo.I00ioIO;
                    while (true) {
/* 17 */                Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 19 */                Object objectVolatile = unsafe.getObjectVolatile(iiiI1lIo, j);
/* 23 */                IIoOoIol0Io0 iIoOoIol0Io02 = null;
/* 24 */                I0OooiI1I i0OooiI1I = IiiIIO0IO.I00000oOI;
/* 26 */                if (objectVolatile == null) {
/* 28 */                    unsafe.putObjectVolatile(iiiI1lIo, j, i0OooiI1I);
/* 31 */                    iIoOoIol0Io0 = null;
                            break;
                        }
/* 35 */                if (objectVolatile instanceof IIoOoIol0Io0) {
/* 43 */                    if (unsafe.compareAndSwapObject(iiiI1lIo, IiiI1lIo.I00ioIO, objectVolatile, i0OooiI1I)) {
/* 45 */                        iIoOoIol0Io0 = (IIoOoIol0Io0) objectVolatile;
                                break;
                            }
                        } else if (objectVolatile != i0OooiI1I && !(objectVolatile instanceof Throwable)) {
/* 103 */                   IOOlIIilOl0.I000lI("Inconsistent state ", objectVolatile);
/* 23 */                    return null;
                        }
                    }
                }
            }
