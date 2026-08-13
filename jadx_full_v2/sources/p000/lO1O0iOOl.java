            package p000;

            import android.os.Parcel;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lO1O0iOOl extends iiI1l0 implements iooliIoiiOlo {
                public final AtomicReference I000II;
                public final lOliOlO1Io I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lO1O0iOOl(lOliOlO1Io loliolo1io, AtomicReference atomicReference) {
/* 7 */             super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
/* 1 */             this.I000II = atomicReference;
/* 3 */             this.I000O01llI0 = loliolo1io;
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) {
/* 2 */             if (i != 2) {
/* 20 */                return false;
                    }
/* 10 */            liO11Oo1loO lio11oo1loo = (liO11Oo1loO) iiIIoi1oIO1.I00000oIO(parcel, liO11Oo1loO.CREATOR);
/* 12 */            iiIIoi1oIO1.I0000O(parcel);
/* 15 */            I000II(lio11oo1loo);
/* 18 */            return true;
                }

                @Override
                public final void I000II(liO11Oo1loO lio11oo1loo) {
/* 1 */             AtomicReference atomicReference = this.I000II;
                    synchronized (atomicReference) {
/* 10 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I000O01llI0.I00iOIl).I00ilO0;
/* 12 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00lll10.I0000Il00O("[sgtm] Got upload batches from service. count", Integer.valueOf(lio11oo1loo.I00iOIl.size()));
/* 32 */                atomicReference.set(lio11oo1loo);
/* 35 */                atomicReference.notifyAll();
                    }
                }
            }
