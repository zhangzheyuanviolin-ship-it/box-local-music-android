            package p000;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0OioIil extends I01OlIoIl {
                public static final Parcelable.Creator<i0OioIil> CREATOR = new OO00iO(8);
                public int I00iOIl;
                public int I00iiI;
                public Intent I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.I00iiI;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 29 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 32 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
