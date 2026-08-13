            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iII0OII implements Parcelable, o00ii00OIlo {
                public static final Parcelable.Creator<iII0OII> CREATOR = new i1I1lI001Io0(21);
                public lOI1lll1l10 I00iOIl;
                public iiOi1illIO1o I00iiI;
                public int I00iiO;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             lOI1lll1l10 loi1lll1l10 = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, loi1lll1l10);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            int i2 = this.I00iiO;
/* 23 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeInt(i2);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
