            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iO0Ol0ol extends I01OlIoIl {
                public static final Parcelable.Creator<iO0Ol0ol> CREATOR = new iIlI1lioo0lO(6);
                public final Bundle I00iOIl;

                public iO0Ol0ol(Bundle bundle) {
/* 4 */             this.I00iOIl = bundle;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I00000oIO(parcel, 1, this.I00iOIl);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
