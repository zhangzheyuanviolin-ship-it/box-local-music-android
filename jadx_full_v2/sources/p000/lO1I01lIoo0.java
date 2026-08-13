            package p000;

            import android.os.Parcel;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lO1I01lIoo0 extends iiI1l0 implements ioo1oIl0i10O {
                public final AtomicReference I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lO1I01lIoo0(lOliOlO1Io loliolo1io, AtomicReference atomicReference) {
/* 5 */             super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
/* 1 */             this.I000II = atomicReference;
                }

                @Override
                public final boolean I00000oOI(int i, Parcel parcel, Parcel parcel2) {
/* 2 */             if (i != 2) {
/* 18 */                return false;
                    }
/* 6 */             ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(li1l0Iiiii.CREATOR);
/* 10 */            iiIIoi1oIO1.I0000O(parcel);
/* 13 */            I001lllioOl(arrayListCreateTypedArrayList);
/* 16 */            return true;
                }

                @Override
                public final void I001lllioOl(List list) {
/* 1 */             AtomicReference atomicReference = this.I000II;
                    synchronized (atomicReference) {
/* 4 */                 atomicReference.set(list);
/* 7 */                 atomicReference.notifyAll();
                    }
                }
            }
