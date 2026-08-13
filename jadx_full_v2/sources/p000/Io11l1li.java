            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            
/* 21 */    public final class Io11l1li extends Ii00lIOoi implements IiIiOllooO {
                public final Handler I00iiI;
                public final String I00iiO;
                public final boolean I00iio;
                public final Io11l1li I00ilI0I1;

                public Io11l1li(Handler handler, String str, boolean z) {
/* 4 */             this.I00iiI = handler;
/* 6 */             this.I00iiO = str;
/* 8 */             this.I00iio = z;
/* 20 */            this.I00ilI0I1 = z ? this : new Io11l1li(handler, str, true);
                }

                @Override
                public final IiiOlIiio I00000oIO(long j, Runnable runnable, Ii00l101O ii00l101O) {
/* 8 */             if (j > 4611686018427387903L) {
/* 10 */                j = 4611686018427387903L;
                    }
/* 17 */            if (!this.I00iiI.postDelayed(runnable, j)) {
/* 32 */                I00ooiO1I(ii00l101O, runnable);
/* 35 */                return OIIo00iiOi.I00iOIl;
                    }
/* 21 */            Io11iOo1O io11iOo1O = new Io11iOo1O();
/* 24 */            io11iOo1O.I00iOIl = this;
/* 26 */            io11iOo1O.I00iiI = runnable;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            return io11iOo1O;
                }

                @Override
                public final void I000l1(long j, IIoOoIol0Io0 iIoOoIol0Io0) {
/* 4 */             Io11iII11ll io11iII11ll = new Io11iII11ll(0);
/* 7 */             io11iII11ll.I00iiI = iIoOoIol0Io0;
/* 9 */             io11iII11ll.I00iiO = this;
/* 11 */            VarHandle.storeStoreFence();
/* 21 */            if (j > 4611686018427387903L) {
/* 23 */                j = 4611686018427387903L;
                    }
/* 30 */            if (!this.I00iiI.postDelayed(io11iII11ll, j)) {
/* 52 */                I00ooiO1I(iIoOoIol0Io0.I00ilI0I1, io11iII11ll);
/* 89 */                return;
                    }
/* 36 */            IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(15);
/* 39 */            iiioilIl1Il.I00iiI = this;
/* 41 */            iiioilIl1Il.I00iiO = io11iII11ll;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            iIoOoIol0Io0.I001IO000(iiioilIl1Il);
                }

                @Override
                public final void I00iOIl(Ii00l101O ii00l101O, Runnable runnable) {
/* 7 */             if (this.I00iiI.post(runnable)) {
/* 89 */                return;
                    }
/* 9 */             I00ooiO1I(ii00l101O, runnable);
                }

                @Override
                public final boolean I00oo1iO0ll(Ii00l101O ii00l101O) {
                    return (this.I00iio && O0000Ioio00.I0000O(Looper.myLooper(), this.I00iiI.getLooper())) ? false : true;
                }

                public final void I00ooiO1I(Ii00l101O ii00l101O, Runnable runnable) {
/* 25 */            l01oO1iOo.I00000oOI(ii00l101O, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
/* 28 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 32 */            Ii1oo1ooill0.I00iiI.I00iOIl(ii00l101O, runnable);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Io11l1li)) {
/* 21 */                return false;
                    }
/* 5 */             Io11l1li io11l1li = (Io11l1li) obj;
                    return io11l1li.I00iiI == this.I00iiI && io11l1li.I00iio == this.I00iio;
                }

                public final int hashCode() {
/* 16 */            return (this.I00iio ? 1231 : 1237) ^ System.identityHashCode(this.I00iiI);
                }

                @Override
                public final String toString() {
                    Io11l1li io11l1li;
                    String str;
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 3 */             Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 5 */             if (this == io11l1li2) {
/* 7 */                 str = "Dispatchers.Main";
                    } else {
                        try {
/* 11 */                    io11l1li = io11l1li2.I00ilI0I1;
                        } catch (UnsupportedOperationException unused) {
/* 14 */                    io11l1li = null;
                        }
/* 20 */                str = this == io11l1li ? "Dispatchers.Main.immediate" : null;
                    }
/* 21 */            if (str != null) {
/* 113 */               return str;
                    }
/* 23 */            String string = this.I00iiO;
/* 25 */            if (string == null) {
/* 29 */                string = this.I00iiI.toString();
                    }
                    return this.I00iio ? Oi010OO0.I00111O(string, ".immediate") : string;
                }

/* 22 */        public Io11l1li(Handler handler) {
/* 23 */            this(handler, null, false);
                }
            }
