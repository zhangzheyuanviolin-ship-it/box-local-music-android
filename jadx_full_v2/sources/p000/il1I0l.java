            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import java.lang.invoke.VarHandle;
            
            public final class il1I0l extends Io0OoIoOo {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
/* 13 */            if (iInterfaceQueryLocalInterface instanceof ilii00lO1Oo) {
/* 15 */                return (ilii00lO1Oo) iInterfaceQueryLocalInterface;
                    }
/* 20 */            ilii00lO1Oo ilii00lo1oo = new ilii00lO1Oo();
/* 23 */            ilii00lo1oo.I000II = iBinder;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return ilii00lo1oo;
                }

                @Override
                public final IlIII1l[] I0001Ioi1lo() {
/* 1 */             return iO1l1I10.I00000oOI;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 261200000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.cloudmessaging.service.START";
                }

                @Override
                public final boolean I0010o() {
/* 1 */             return true;
                }
            }
