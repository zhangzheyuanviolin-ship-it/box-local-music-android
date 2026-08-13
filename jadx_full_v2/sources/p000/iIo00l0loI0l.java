            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iIo00l0loI0l extends I01OlIoIl {
                public static final Parcelable.Creator<iIo00l0loI0l> CREATOR = new iIlI1lioo0lO(1);
                public final int I00iOIl;
                public final String[] I00iiI;

                public iIo00l0loI0l(int i, String[] strArr) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = strArr;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000iOII(parcel, 2, this.I00iiI);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
