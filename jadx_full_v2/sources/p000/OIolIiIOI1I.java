            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 19 */    public final class OIolIiIOI1I implements Parcelable {
                public static final Parcelable.Creator<OIolIiIOI1I> CREATOR = new i1IIiI1OOo(15);
                public final Ii11I1OOII1 I00iOIl;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OIolIiIOI1I(Parcel parcel) {
                    Ii11I1OOII1 ii11I1OOII1I00000oIO;
/* 1 */             byte[] bArrCreateByteArray = parcel.createByteArray();
/* 5 */             if (bArrCreateByteArray != null) {
/* 7 */                 Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 9 */                 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(bArrCreateByteArray);
/* 15 */                ii11I1OOII1I00000oIO = ii11I1OOII1I00000oIO == null ? Ii11I1OOII1.I00000oOI : ii11I1OOII1I00000oIO;
                    }
/* 17 */            this(ii11I1OOII1I00000oIO);
                }

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             Ii11I1OOII1 ii11I1OOII1 = this.I00iOIl;
/* 3 */             ii11I1OOII1.getClass();
/* 6 */             Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 12 */            parcel.writeByteArray(il01ool0o.I0000Il00O(ii11I1OOII1));
                }

/* 20 */        public OIolIiIOI1I(Ii11I1OOII1 ii11I1OOII1) {
                    this.I00iOIl = ii11I1OOII1;
                }
            }
