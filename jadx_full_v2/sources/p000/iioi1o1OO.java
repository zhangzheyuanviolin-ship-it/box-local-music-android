            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.util.Log;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class iioi1o1OO extends iiI1l0 implements il0IOO {
                public final AtomicReference I000II;
                public boolean I000O01llI0;

                public iioi1o1OO() {
/* 3 */             super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
/* 11 */            this.I000II = new AtomicReference();
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
                
                    r3 = r3.get("r");
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000oI00(Bundle bundle, Class cls) {
                    Object obj;
/* 1 */             if (bundle == null || obj == null) {
/* 43 */                return null;
                    }
                    try {
/* 11 */                return cls.cast(obj);
                    } catch (ClassCastException e) {
/* 39 */                Log.w("AM", IIl001iO0Io.I000oI1ioi("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
/* 42 */                throw e;
                    }
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) {
/* 2 */             if (i != 1) {
/* 22 */                return false;
                    }
/* 10 */            Bundle bundle = (Bundle) iiIIoi1oIO1.I00000oIO(parcel, Bundle.CREATOR);
/* 12 */            iiIIoi1oIO1.I0000O(parcel);
/* 15 */            I001i1lo1io(bundle);
/* 18 */            parcel2.writeNoException();
/* 1 */             return true;
                }

                public final Bundle I0000O(long j) {
                    Bundle bundle;
/* 1 */             AtomicReference atomicReference = this.I000II;
                    synchronized (atomicReference) {
/* 6 */                 if (!this.I000O01llI0) {
                            try {
/* 8 */                         atomicReference.wait(j);
                            } catch (InterruptedException unused) {
/* 15 */                        return null;
                            }
                        }
/* 23 */                bundle = (Bundle) this.I000II.get();
                    }
/* 26 */            return bundle;
                }

                @Override
                public final void I001i1lo1io(Bundle bundle) {
/* 1 */             AtomicReference atomicReference = this.I000II;
                    synchronized (atomicReference) {
                        try {
                            try {
/* 4 */                         atomicReference.set(bundle);
/* 8 */                         this.I000O01llI0 = true;
                            } finally {
/* 22 */                        this.I000II.notify();
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }
            }
