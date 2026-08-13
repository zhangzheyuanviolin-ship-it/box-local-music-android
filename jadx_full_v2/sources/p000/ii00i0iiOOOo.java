            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class ii00i0iiOOOo extends I01OlIoIl {
                public static final Parcelable.Creator<ii00i0iiOOOo> CREATOR = new iIlI1lioo0lO(12);
                public iiOi1ioO I00iOIl;
                public iiOolIi0 I00iiI;
                public boolean I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 21 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 24 */            parcel.writeInt(1);
/* 27 */            boolean z = this.I00iiO;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 32 */            parcel.writeInt(z ? 1 : 0);
/* 35 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
