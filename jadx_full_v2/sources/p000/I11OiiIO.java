            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.TreeSet;
            
            public final class I11OiiIO extends I01OlIoIl {
                public static final Parcelable.Creator<I11OiiIO> CREATOR = new OO00iO(12);
                public final List I00iOIl;
                public final boolean I00iiI;
                public final String I00iiO;
                public final String I00iio;

                public I11OiiIO(ArrayList arrayList, boolean z, String str, String str2) {
/* 4 */             lII0I0I000I.I000II(arrayList);
/* 7 */             this.I00iOIl = arrayList;
/* 9 */             this.I00iiI = z;
/* 11 */            this.I00iiO = str;
/* 13 */            this.I00iio = str2;
                }

                public static I11OiiIO I00000oOI(List list, boolean z) {
/* 5 */             TreeSet treeSet = new TreeSet(OiOIlO1OII0.I00iiI);
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                Collections.addAll(treeSet, ((OIiiIllOIo) it.next()).getOptionalFeatures());
                    }
/* 40 */            return new I11OiiIO(new ArrayList(treeSet), z, null, null);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || !(obj instanceof I11OiiIO)) {
/* 49 */                return false;
                    }
/* 9 */             I11OiiIO i11OiiIO = (I11OiiIO) obj;
                    return this.I00iiI == i11OiiIO.I00iiI && l1ioii1I10Io.I00000oIO(this.I00iOIl, i11OiiIO.I00iOIl) && l1ioii1I10Io.I00000oIO(this.I00iiO, i11OiiIO.I00iiO) && l1ioii1I10Io.I00000oIO(this.I00iio, i11OiiIO.I00iio);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.I00iiI), this.I00iOIl, this.I00iiO, this.I00iio});
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000o00OoI0I(parcel, 1, this.I00iOIl);
/* 15 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeInt(this.I00iiI ? 1 : 0);
/* 26 */            lO0IioIooIl.I000OiO(parcel, 3, this.I00iiO);
/* 31 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
