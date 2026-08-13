            package p000;

            import java.lang.invoke.VarHandle;
            import sun.misc.Unsafe;
            
/* 11 */    public abstract class IOoilo extends I1oI1lil {
                private final Ii00l101O _context;
                private transient IOoil1iiIilo intercepted;

                public IOoilo(IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             this(iOoil1iiIilo, iOoil1iiIilo != null ? iOoil1iiIilo.getContext() : null);
                }

                @Override
                public Ii00l101O getContext() {
/* 1 */             return this._context;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final IOoil1iiIilo intercepted() {
                    IOoilo iOoilo;
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.intercepted;
/* 3 */             if (iOoil1iiIilo != null) {
/* 113 */               return iOoil1iiIilo;
                    }
/* 15 */            Ii00lIOoi ii00lIOoi = (Ii00lIOoi) getContext().I00lli11(o0iOli.I00iiO);
/* 17 */            if (ii00lIOoi != null) {
/* 22 */                IiiI1lIo iiiI1lIo = new IiiI1lIo(-1);
/* 25 */                iiiI1lIo.I00iio = ii00lIOoi;
/* 27 */                iiiI1lIo.I00ilI0I1 = this;
/* 31 */                iiiI1lIo.I00ilO0 = IiiIIO0IO.I00000oIO;
/* 48 */                iiiI1lIo.I00io1l = getContext().I00IoiI(Oo0ooOi10I.I00000oOI, 0);
/* 50 */                VarHandle.storeStoreFence();
                        iOoilo = iiiI1lIo;
                    } else {
/* 54 */                iOoilo = this;
                    }
/* 55 */            this.intercepted = iOoilo;
/* 57 */            return iOoilo;
                }

                @Override
                public void releaseIntercepted() {
                    Unsafe unsafe;
                    long j;
/* 1 */             IOoil1iiIilo iOoil1iiIilo = this.intercepted;
/* 3 */             if (iOoil1iiIilo != null && iOoil1iiIilo != this) {
/* 19 */                IiiI1lIo iiiI1lIo = (IiiI1lIo) iOoil1iiIilo;
/* 31 */                do {
/* 21 */                    unsafe = I1Ioolli0l0o.I00000oIO;
/* 23 */                    j = IiiI1lIo.I00ioIO;
/* 31 */                } while (unsafe.getObjectVolatile(iiiI1lIo, j) == IiiIIO0IO.I00000oOI);
/* 33 */                Object objectVolatile = unsafe.getObjectVolatile(iiiI1lIo, j);
/* 44 */                IIoOoIol0Io0 iIoOoIol0Io0 = objectVolatile instanceof IIoOoIol0Io0 ? (IIoOoIol0Io0) objectVolatile : null;
/* 45 */                if (iIoOoIol0Io0 != null) {
/* 47 */                    iIoOoIol0Io0.I000o00OoI0I();
                        }
                    }
/* 52 */            this.intercepted = IOiII1I.I00iiI;
                }

/* 12 */        public IOoilo(IOoil1iiIilo iOoil1iiIilo, Ii00l101O ii00l101O) {
/* 13 */            super(iOoil1iiIilo);
/* 14 */            this._context = ii00l101O;
                }
            }
