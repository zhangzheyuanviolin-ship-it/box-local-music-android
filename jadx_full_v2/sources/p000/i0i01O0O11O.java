            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class i0i01O0O11O extends Io0OoIoOo {
                public OloOII1ioI1l I001lIiIIo1O;

                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
                    return iInterfaceQueryLocalInterface instanceof i0i00i01I ? (i0i00i01I) iInterfaceQueryLocalInterface : new i0i00i01I(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
                }

                @Override
                public final IlIII1l[] I0001Ioi1lo() {
/* 1 */             return iO1i11l.I0000Il00O;
                }

                @Override
                public final Bundle I000O01llI0() {
/* 1 */             OloOII1ioI1l oloOII1ioI1l = this.I001lIiIIo1O;
/* 3 */             oloOII1ioI1l.getClass();
/* 8 */             Bundle bundle = new Bundle();
/* 11 */            String str = oloOII1ioI1l.I00000oOI;
/* 13 */            if (str != null) {
/* 17 */                bundle.putString("api", str);
                    }
/* 20 */            return bundle;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 203400000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.common.internal.service.IClientTelemetryService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.common.telemetry.service.START";
                }

                @Override
                public final boolean I000oI1ioi() {
/* 1 */             return true;
                }
            }
