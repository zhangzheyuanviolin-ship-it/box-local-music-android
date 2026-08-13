            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class o0o0IiO0IoOo extends I01OlIoIl {
                public static final Parcelable.Creator<o0o0IiO0IoOo> CREATOR = new o0olIOlOI(3);
                public double I00iOIl;
                public double I00iiI;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             double d = this.I00iOIl;
/* 12 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 8);
/* 15 */            parcel.writeDouble(d);
/* 18 */            double d2 = this.I00iiI;
/* 21 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 8);
/* 24 */            parcel.writeDouble(d2);
/* 27 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
