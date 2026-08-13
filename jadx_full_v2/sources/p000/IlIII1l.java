            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
/* 11 */    public final class IlIII1l extends I01OlIoIl {
                public static final Parcelable.Creator<IlIII1l> CREATOR = new iIlI1lioo0lO(10);
                public final String I00iOIl;
                public final int I00iiI;
                public final long I00iiO;
                public final boolean I00iio;

                public IlIII1l(String str, int i, long j, boolean z) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = j;
/* 10 */            this.I00iio = z;
                }

                public final long I00000oOI() {
/* 3 */             long j = this.I00iiO;
                    return j == -1 ? this.I00iiI : j;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof IlIII1l) {
/* 6 */                 IlIII1l ilIII1l = (IlIII1l) obj;
/* 16 */                if (l1ioii1I10Io.I00000oIO(this.I00iOIl, ilIII1l.I00iOIl) && I00000oOI() == ilIII1l.I00000oOI() && this.I00iio == ilIII1l.I00iio) {
/* 36 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 21 */            return Arrays.hashCode(new Object[]{this.I00iOIl, Long.valueOf(I00000oOI()), Boolean.valueOf(this.I00iio)});
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 9 */             iol01110I00000oOI.I0000Il00O("name", this.I00iOIl);
/* 22 */            iol01110I00000oOI.I0000Il00O("version", Long.valueOf(I00000oOI()));
/* 33 */            iol01110I00000oOI.I0000Il00O("is_fully_rolled_out", Boolean.valueOf(this.I00iio));
/* 36 */            return iol01110I00000oOI.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 10 */            lO0IioIooIl.I000OiO(parcel, 1, this.I00iOIl);
/* 15 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 20 */            parcel.writeInt(this.I00iiI);
/* 23 */            long jI00000oOI = I00000oOI();
/* 30 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 8);
/* 33 */            parcel.writeLong(jI00000oOI);
/* 36 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 4);
/* 41 */            parcel.writeInt(this.I00iio ? 1 : 0);
/* 44 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

/* 12 */        public IlIII1l(String str, long j) {
/* 13 */            this(str, -1, j, false);
                }
            }
