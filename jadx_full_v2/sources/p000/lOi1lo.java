            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lOi1lo extends I01OlIoIl {
                public static final Parcelable.Creator<lOi1lo> CREATOR = new i1I1lI001Io0(2);
                public int I00iOIl;
                public String I00iiI;
                public String I00iiO;
                public String I00iio;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiI);
/* 25 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iiO);
/* 31 */            lO0IioIooIl.I000OiO(parcel, 5, this.I00iio);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
