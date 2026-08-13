            package p000;

            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public abstract class IoIll0l implements Ii0110, Closeable {
                public final OllO00oiil I00iOIl;
                public final OllO00oiil I00iiI;
                public static final long I00iio = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IoIll0l.class.getDeclaredField("closed"));
                public static final AtomicIntegerFieldUpdater I00iiO = AtomicIntegerFieldUpdater.newUpdater(IoIll0l.class, "clientRefCount$internal");
                private volatile int closed = 0;
                public volatile int clientRefCount$internal = 0;

                public IoIll0l() {
/* 11 */            IoIlii1oOiO1 ioIlii1oOiO1 = new IoIlii1oOiO1(0);
/* 14 */            ioIlii1oOiO1.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 24 */            this.I00iOIl = new OllO00oiil(ioIlii1oOiO1);
/* 29 */            IoIlii1oOiO1 ioIlii1oOiO12 = new IoIlii1oOiO1(1);
/* 32 */            ioIlii1oOiO12.I00iiI = this;
/* 34 */            VarHandle.storeStoreFence();
/* 42 */            this.I00iiI = new OllO00oiil(ioIlii1oOiO12);
                }

                @Override
                public final Ii00l101O I00000oIO() {
/* 7 */             return (Ii00l101O) this.I00iiI.getValue();
                }

                public abstract Object I0000Il00O(IOiOol0 iOiOol0, IOoilo iOoilo);

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(IOiOol0 iOiOol0, IOoilo iOoilo) {
                    IoIlii ioIlii;
/* 3 */             if (iOoilo instanceof IoIlii) {
/* 6 */                 ioIlii = (IoIlii) iOoilo;
/* 8 */                 int i = ioIlii.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioIlii.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioIlii = new IoIlii(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00ioIO = ioIlii.I00iiI;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioIlii.I00iio;
/* 33 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 34 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(objI00ioIO);
/* 61 */                Oliiii0 oliiii0 = (Oliiii0) iOiOol0.I00ilO0;
/* 63 */                ioIlii.I00iOIl = iOiOol0;
/* 65 */                ioIlii.I00iio = 1;
/* 67 */                Ii00oll ii00oll = IoIo0oIIl101.I00000oIO;
/* 71 */                O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo(oliiii0);
/* 84 */                objI00ioIO = I00000oIO().I00ioIO(o010loOOi0Oo).I00ioIO(IoIo0oIIl101.I00000oIO);
/* 98 */                O010OIi o010OIi = (O010OIi) ioIlii.getContext().I00lli11(Iioi0lilII.I00iio);
/* 100 */               if (o010OIi != null) {
/* 107 */                   OiI0lII1i oiI0lII1i = new OiI0lII1i(8);
/* 110 */                   oiI0lII1i.I00iiI = o010loOOi0Oo;
/* 112 */                   VarHandle.storeStoreFence();
/* 115 */                   IiiOlIiio iiiOlIiioI00IioO0OiOi = o010OIi.I00IioO0OiOi(true, true, oiI0lII1i);
/* 122 */                   OiI0lII1i oiI0lII1i2 = new OiI0lII1i(7);
/* 125 */                   oiI0lII1i2.I00iiI = iiiOlIiioI00IioO0OiOi;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   o010loOOi0Oo.I00iiI(oiI0lII1i2);
                        }
/* 133 */               if (objI00ioIO != obj) {
                        }
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(objI00ioIO);
/* 43 */                    return objI00ioIO;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 50 */            iOiOol0 = ioIlii.I00iOIl;
/* 52 */            lIoii1l01l0i.I00000oOI(objI00ioIO);
/* 136 */           Ii00l101O ii00l101O = (Ii00l101O) objI00ioIO;
/* 140 */           O0iO0IiIio o0iO0IiIio = new O0iO0IiIio();
/* 143 */           o0iO0IiIio.I00iOIl = ii00l101O;
/* 145 */           VarHandle.storeStoreFence();
/* 159 */           IiIOIO1I iiIOIO1II00000oOI = iOi1II01i0.I00000oOI(this, ii00l101O.I00ioIO(o0iO0IiIio), new Ii1O001loIoO(this, iOiOol0, iOoil1iiIilo, 23), 2);
/* 163 */           ioIlii.I00iOIl = null;
/* 165 */           ioIlii.I00iio = 2;
/* 167 */           Object objI0010o = iiIOIO1II00000oOI.I0010o(ioIlii);
                    return objI0010o == obj ? obj : objI0010o;
                }

                public abstract I0o1io0i1OO0 I000O01llI0();

                @Override
                public final void close() {
/* 12 */            if (I1Ioolli0l0o.I00000oIO.compareAndSwapInt(this, I00iio, 0, 1)) {
/* 21 */                Ii00ilI1 ii00ilI1I00lli11 = I00000oIO().I00lli11(Iioi0lilII.I00iio);
/* 32 */                O010loOOi0Oo o010loOOi0Oo = ii00ilI1I00lli11 instanceof O010loOOi0Oo ? (O010loOOi0Oo) ii00ilI1I00lli11 : null;
/* 33 */                if (o010loOOi0Oo == null) {
/* 35 */                    return;
                        }
/* 36 */                o010loOOi0Oo.I00iIO();
                    }
                }
            }
