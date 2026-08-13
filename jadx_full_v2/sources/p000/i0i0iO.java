            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            public final class i0i0iO extends I01OlIoIl {
                public static final Parcelable.Creator<i0i0iO> CREATOR = new OO00iO(18);
                public int I00iOIl;
                public IBinder I00iiI;
                public IOlo10lO1iOl I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;

                public final boolean equals(Object obj) {
                    Object loo1iool0;
/* 1 */             if (obj == null) {
/* 85 */                return false;
                    }
/* 4 */             if (this == obj) {
/* 83 */                return true;
                    }
/* 9 */             if (!(obj instanceof i0i0iO)) {
/* 85 */                return false;
                    }
/* 12 */            i0i0iO i0i0io = (i0i0iO) obj;
/* 22 */            if (!this.I00iiO.equals(i0i0io.I00iiO)) {
/* 85 */                return false;
                    }
/* 24 */            IBinder iBinder = this.I00iiI;
/* 30 */            Object loo1iool02 = null;
/* 31 */            if (iBinder == null) {
/* 33 */                loo1iool0 = null;
                    } else {
/* 35 */                int i = I0I0Oollll1i.I000O01llI0;
/* 37 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 50 */                loo1iool0 = iInterfaceQueryLocalInterface instanceof IoOiO1o1oI ? (IoOiO1o1oI) iInterfaceQueryLocalInterface : new loO1Iool0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 10);
                    }
/* 53 */            IBinder iBinder2 = i0i0io.I00iiI;
/* 55 */            if (iBinder2 != null) {
/* 58 */                int i2 = I0I0Oollll1i.I000O01llI0;
/* 60 */                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 74 */                loo1iool02 = iInterfaceQueryLocalInterface2 instanceof IoOiO1o1oI ? (IoOiO1o1oI) iInterfaceQueryLocalInterface2 : new loO1Iool0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 10);
                    }
                    return l1ioii1I10Io.I00000oIO(loo1iool0, loo1iool02);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.I00iOIl;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 20 */            lO0IioIooIl.I0001Ioi1lo(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 29 */            boolean z = this.I00iio;
/* 31 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 34 */            parcel.writeInt(z ? 1 : 0);
/* 37 */            boolean z2 = this.I00ilI0I1;
/* 40 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 43 */            parcel.writeInt(z2 ? 1 : 0);
/* 46 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
