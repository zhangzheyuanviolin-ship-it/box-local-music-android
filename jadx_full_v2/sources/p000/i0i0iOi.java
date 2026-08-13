            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class i0i0iOi extends Io0OoIoOo {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
                    return iInterfaceQueryLocalInterface instanceof i0OoOOOI00l ? (i0OoOOOI00l) iInterfaceQueryLocalInterface : new i0OoOOOI00l(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 1);
                }

                @Override
                public final IlIII1l[] I0001Ioi1lo() {
/* 1 */             return iO1iIl1I0.I00000oOI;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 17895000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
                }

                @Override
                public final boolean I000oI1ioi() {
/* 1 */             return true;
                }
            }
