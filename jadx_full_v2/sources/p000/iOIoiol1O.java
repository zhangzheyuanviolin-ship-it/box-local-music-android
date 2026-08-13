            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iOIoiol1O extends I01OlIoIl {
                public static final Parcelable.Creator<iOIoiol1O> CREATOR = new iIlI1lioo0lO(21);
                public final double I00iOIl;
                public final double I00iiI;

                public iOIoiol1O(double d, double d2) {
/* 4 */             this.I00iOIl = d;
/* 6 */             this.I00iiI = d2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 8);
/* 15 */            parcel.writeDouble(this.I00iOIl);
/* 19 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 8);
/* 24 */            parcel.writeDouble(this.I00iiI);
/* 27 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
