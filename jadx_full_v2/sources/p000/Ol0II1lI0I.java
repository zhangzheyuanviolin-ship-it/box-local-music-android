            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class Ol0II1lI0I extends Io0OoIoOo {
                public boolean I001lIiIIo1O;
                public I0Oi111ii I001lllioOl;
                public Bundle I001lloI;
                public Integer I00II0Ol1O0l;

                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
                    return iInterfaceQueryLocalInterface instanceof i0OoOilOo0 ? (i0OoOilOo0) iInterfaceQueryLocalInterface : new i0OoOilOo0(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
                }

                @Override
                public final Bundle I000O01llI0() {
/* 1 */             Bundle bundle = this.I001lloI;
/* 3 */             I0Oi111ii i0Oi111ii = this.I001lllioOl;
/* 19 */            if (!this.I0000Il00O.getPackageName().equals((String) i0Oi111ii.I00iio)) {
/* 27 */                bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) i0Oi111ii.I00iio);
                    }
/* 55 */            return bundle;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 12451000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.signin.internal.ISignInService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.signin.service.START";
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return this.I001lIiIIo1O;
                }
            }
