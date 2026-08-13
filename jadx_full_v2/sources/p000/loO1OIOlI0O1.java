            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class loO1OIOlI0O1 extends I01OlIoIl {
                public static final Parcelable.Creator<loO1OIOlI0O1> CREATOR = new i1I1lI001Io0(16);
                public String I00iOIl;
                public String I00iiI;
                public int I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiI);
/* 19 */            int i2 = this.I00iiO;
/* 22 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 25 */            parcel.writeInt(i2);
/* 28 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
