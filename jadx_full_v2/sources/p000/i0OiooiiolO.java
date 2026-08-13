            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class i0OiooiiolO extends Io0OoIoOo {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
                    return iInterfaceQueryLocalInterface instanceof i0Ool1ooIlII ? (i0Ool1ooIlII) iInterfaceQueryLocalInterface : new i0Ool1ooIlII(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
                }

                @Override
                public final IlIII1l[] I0001Ioi1lo() {
/* 1 */             return iO1i11l.I0000Il00O;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 253600000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.common.telemetry.notification.service.START";
                }

                @Override
                public final boolean I000oI1ioi() {
/* 1 */             return true;
                }
            }
