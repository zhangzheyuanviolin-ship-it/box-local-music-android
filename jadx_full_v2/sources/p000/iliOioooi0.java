            package p000;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import java.lang.invoke.VarHandle;
            
            public abstract class iliOioooi0 extends Binder implements io0ooloI, IInterface {
                public static io0ooloI I00000oOI(IBinder iBinder) {
/* 3 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
/* 9 */             if (iInterfaceQueryLocalInterface instanceof io0ooloI) {
/* 11 */                return (io0ooloI) iInterfaceQueryLocalInterface;
                    }
/* 16 */            il1I0ii0 il1i0ii0 = new il1I0ii0();
/* 19 */            il1i0ii0.I000II = iBinder;
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return il1i0ii0;
                }
            }
