            package p000;

            import android.graphics.Bitmap;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            
            public final class iiio1OOIi extends I01OlIoIl implements o00ii00OIlo {
                public static final Parcelable.Creator<iiio1OOIi> CREATOR = new iiiilIIoIi(3);
                public final int I00iOIl;
                public final String I00iiI;
                public final Bitmap I00iiO;
                public final int I00iio;
                public final ParcelFileDescriptor I00ilI0I1;
                public final boolean I00ilO0;
                public final iiOoiOI1Oo I00io1l;
                public final iiiIolO0I I00ioIO;

                public iiio1OOIi(int i, String str, Bitmap bitmap, int i2, ParcelFileDescriptor parcelFileDescriptor, boolean z, iiOoiOI1Oo iiooioi1oo, iiiIolO0I iiiiolo0i) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = bitmap;
/* 10 */            this.I00iio = i2;
/* 12 */            this.I00ilI0I1 = parcelFileDescriptor;
/* 14 */            this.I00ilO0 = z;
/* 16 */            this.I00io1l = iiooioi1oo;
/* 18 */            this.I00ioIO = iiiiolo0i;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(this.I00iio);
/* 40 */            lO0IioIooIl.I000OOo1O(parcel, 5, this.I00ilI0I1, i);
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 49 */            parcel.writeInt(this.I00ilO0 ? 1 : 0);
/* 55 */            lO0IioIooIl.I000OOo1O(parcel, 7, this.I00io1l, i);
/* 62 */            lO0IioIooIl.I000OOo1O(parcel, 8, this.I00ioIO, i);
/* 65 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
