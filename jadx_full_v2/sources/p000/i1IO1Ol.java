            package p000;

            import android.graphics.Bitmap;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            
            public final class i1IO1Ol extends I01OlIoIl implements o00ii00OIlo {
                public static final Parcelable.Creator<i1IO1Ol> CREATOR = new i1I1lI001Io0(3);
                public int I00iOIl;
                public String I00iiI;
                public Bitmap I00iiO;
                public int I00iio;
                public ParcelFileDescriptor I00ilI0I1;
                public ParcelFileDescriptor I00ilO0;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            int i3 = this.I00iio;
/* 31 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(i3);
/* 40 */            lO0IioIooIl.I000OOo1O(parcel, 5, this.I00ilI0I1, i);
/* 46 */            lO0IioIooIl.I000OOo1O(parcel, 6, this.I00ilO0, i);
/* 49 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
