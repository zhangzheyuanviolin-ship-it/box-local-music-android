            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class l00l1OOOl extends I1oIol10O {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    return iInterfaceQueryLocalInterface instanceof iolll0ill1i ? (iolll0ill1i) iInterfaceQueryLocalInterface : new iolI000o(iBinder);
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 12451000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.measurement.internal.IMeasurementService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.measurement.START";
                }
            }
