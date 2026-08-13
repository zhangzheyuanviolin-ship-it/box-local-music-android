            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class I0olOi00O implements Ii0110 {
                public View I00iOIl;
                public Oo0Oo0 I00iiI;
                public Ii0110 I00iiO;
                public AtomicReference I00iio;

                @Override
                public final Ii00l101O I00000oIO() {
/* 3 */             return this.I00iiO.I00000oIO();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(O0oIo1 o0oIo1, IOoilo iOoilo) throws Throwable {
                    I0olOi0 i0olOi0;
/* 3 */             if (iOoilo instanceof I0olOi0) {
/* 6 */                 i0olOi0 = (I0olOi0) iOoilo;
/* 8 */                 int i = i0olOi0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0olOi0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0olOi0 = new I0olOi0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = i0olOi0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0olOi0.I00iiO;
/* 32 */            if (i2 == 0) {
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                AtomicReference atomicReference = this.I00iio;
/* 56 */                I00o101lO i00o101lO = new I00o101lO(11);
/* 59 */                i00o101lO.I00iiI = o0oIo1;
/* 61 */                i00o101lO.I00iiO = this;
/* 63 */                VarHandle.storeStoreFence();
/* 69 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 70 */                I00oI0i i00oI0i = new I00oI0i(this, iOoil1iiIilo, 6);
/* 73 */                i0olOi0.I00iiO = 1;
/* 86 */                if (il001oo1.I0000Il00O(new O1o1iI(i00o101lO, atomicReference, i00oI0i, iOoil1iiIilo, 9), i0olOi0) == ii0111o) {
/* 88 */                    return;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 38 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 89 */            IOOlIIilOl0.I0000Il00O();
                }
            }
