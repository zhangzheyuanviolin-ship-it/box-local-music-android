            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class iO0i0o1l1Ii extends I01OlIoIl {
                public static final Parcelable.Creator<iO0i0o1l1Ii> CREATOR = new iIlI1lioo0lO(7);
                public io0o00I1ol1o I00iOIl;
                public i1oloIlo0o1o I00iiI;
                public float I00iiO;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             io0o00I1ol1o io0o00i1ol1o = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, io0o00i1ol1o);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 2, this.I00iiI, i);
/* 19 */            float f = this.I00iiO;
/* 23 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 26 */            parcel.writeFloat(f);
/* 29 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
