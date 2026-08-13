            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iI0iiII1i extends I01OlIoIl {
                public static final Parcelable.Creator<iI0iiII1i> CREATOR = new i1I1lI001Io0(14);
                public final long I00iOIl;
                public final int I00iiI;
                public final long I00iiO;

                public iI0iiII1i(int i, long j, long j2) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = j2;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 25 */            parcel.writeInt(this.I00iiI);
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 8);
/* 34 */            parcel.writeLong(this.I00iiO);
/* 37 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
