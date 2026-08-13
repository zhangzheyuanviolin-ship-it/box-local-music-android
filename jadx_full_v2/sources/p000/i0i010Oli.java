            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0i010Oli extends I01OlIoIl {
                public static final Parcelable.Creator<i0i010Oli> CREATOR = new OO00iO(15);
                public final int I00iOIl;
                public final IOlo10lO1iOl I00iiI;
                public final i0i0iO I00iiO;

                public i0i010Oli(int i, IOlo10lO1iOl iOlo10lO1iOl, i0i0iO i0i0io) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = iOlo10lO1iOl;
/* 8 */             this.I00iiO = i0i0io;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
