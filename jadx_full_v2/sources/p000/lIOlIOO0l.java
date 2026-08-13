            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import java.lang.invoke.VarHandle;
            
            public final class lIOlIOO0l extends Io0OoIoOo {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
/* 13 */            if (iInterfaceQueryLocalInterface instanceof iOoIOo1Ililo) {
/* 15 */                return (iOoIOo1Ililo) iInterfaceQueryLocalInterface;
                    }
/* 20 */            iOoIOo1Ililo iooioo1ililo = new iOoIOo1Ililo();
/* 23 */            iooioo1ililo.I000II = iBinder;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return iooioo1ililo;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 12600000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.oss.licenses.IOSSLicenseService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.oss.licenses.service.START";
                }
            }
