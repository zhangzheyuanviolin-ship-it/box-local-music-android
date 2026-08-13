            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0Ooili1oO1o extends I01OlIoIl {
                public static final Parcelable.Creator<i0Ooili1oO1o> CREATOR = new OO00iO(14);
                public final int I00iOIl;
                public final i0i0iI0O00 I00iiI;

                public i0Ooili1oO1o(int i, i0i0iI0O00 i0i0ii0o00) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i0i0ii0o00;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 23 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
