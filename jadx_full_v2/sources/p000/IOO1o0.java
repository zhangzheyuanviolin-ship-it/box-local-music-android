            package p000;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class IOO1o0 extends I01OlIoIl {
                public static final Parcelable.Creator<IOO1o0> CREATOR = new i1I1lI001Io0(0);
                public final Intent I00iOIl;

                public IOO1o0(Intent intent) {
/* 4 */             this.I00iOIl = intent;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 13 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
