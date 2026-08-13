            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class lli0oio0 extends I01OlIoIl {
                public static final Parcelable.Creator<lli0oio0> CREATOR = new lli1OIlOOOI(1);
                public lOiI01[] I00iOIl;
                public io0oOoOi0o I00iiI;
                public io0oOoOi0o I00iiO;
                public String I00iio;
                public float I00ilI0I1;
                public String I00ilO0;
                public boolean I00io1l;

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             lOiI01[] loii01Arr = this.I00iOIl;
/* 5 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000lI(parcel, 2, loii01Arr, i);
/* 16 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiI, i);
/* 22 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iiO, i);
/* 28 */            lO0IioIooIl.I000OiO(parcel, 5, this.I00iio);
/* 31 */            float f = this.I00ilI0I1;
/* 34 */            lO0IioIooIl.I000oI1ioi(parcel, 6, 4);
/* 37 */            parcel.writeFloat(f);
/* 43 */            lO0IioIooIl.I000OiO(parcel, 7, this.I00ilO0);
/* 46 */            boolean z = this.I00io1l;
/* 50 */            lO0IioIooIl.I000oI1ioi(parcel, 8, 4);
/* 53 */            parcel.writeInt(z ? 1 : 0);
/* 56 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
