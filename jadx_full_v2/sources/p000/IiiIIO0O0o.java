            package p000;

            import sun.misc.Unsafe;
            
            public final class IiiIIO0O0o extends OiOOI1I1I101 {
                public static final long I00ilO0 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IiiIIO0O0o.class.getDeclaredField("_decision$volatile"));
                private volatile int _decision$volatile;

                @Override
                public final void I00100o1O0lo(Object obj) throws IiiI1OOll0l1 {
/* 1 */             I0010I0i(obj);
                }

                @Override
                public final void I0010I0i(Object obj) throws IiiI1OOll0l1 {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00ilO0;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 9 */                 if (intVolatile != 0) {
/* 12 */                    if (intVolatile == 1) {
/* 24 */                        IiiIIO0IO.I00000oIO(l00iIoI.I0000Il00O(this.I00ilI0I1), iiiilOoi.I00000oIO(obj));
/* 27 */                        return;
                            } else {
/* 30 */                        I000II.I001IO000("Already resumed");
/* 33 */                        return;
                            }
                        }
/* 36 */                IiiIIO0O0o iiiIIO0O0o = this;
/* 41 */                if (unsafe.compareAndSwapInt(iiiIIO0O0o, j, 0, 2)) {
/* 43 */                    return;
                        } else {
/* 44 */                    this = iiiIIO0O0o;
                        }
                    }
                }
            }
