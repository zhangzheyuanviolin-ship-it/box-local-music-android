            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class li1l0Iiiii extends I01OlIoIl {
                public static final Parcelable.Creator<li1l0Iiiii> CREATOR = new iolIll1o(19);
                public final String I00iOIl;
                public final long I00iiI;
                public final int I00iiO;

                public li1l0Iiiii(int i, long j, String str) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = j;
/* 8 */             this.I00iiO = i;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 16 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 8);
/* 21 */            parcel.writeLong(this.I00iiI);
/* 26 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 31 */            parcel.writeInt(this.I00iiO);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
