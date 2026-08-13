            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class ii0il0lOolIo extends I01OlIoIl implements Iterable {
                public static final Parcelable.Creator<ii0il0lOolIo> CREATOR = new iIlI1lioo0lO(14);
                public final Bundle I00iOIl;

                public ii0il0lOolIo(Bundle bundle) {
/* 4 */             this.I00iOIl = bundle;
                }

                public final Object I00000oOI(String str) {
/* 3 */             return this.I00iOIl.get(str);
                }

                public final Double I0000O() {
/* 9 */             return Double.valueOf(this.I00iOIl.getDouble("value"));
                }

                public final String I0000oI00() {
/* 5 */             return this.I00iOIl.getString("currency");
                }

                public final Bundle I0001Ioi1lo() {
/* 5 */             return new Bundle(this.I00iOIl);
                }

                @Override
                public final Iterator iterator() {
/* 4 */             OoiOiiiIO ooiOiiiIO = new OoiOiiiIO(5);
/* 17 */            ooiOiiiIO.I00iiI = this.I00iOIl.keySet().iterator();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return ooiOiiiIO;
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 12 */            lO0IioIooIl.I00000oIO(parcel, 2, I0001Ioi1lo());
/* 15 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
