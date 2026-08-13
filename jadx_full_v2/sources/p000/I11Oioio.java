            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Arrays;
            
            public final class I11Oioio extends I01OlIoIl {
                public static final Parcelable.Creator<I11Oioio> CREATOR = i1IIiI1OOo.I00000oOI;
                public static final I11Oioio I00iio;
                public final IOiIOIII0io I00iOIl;
                public final boolean I00iiI;
                public boolean I00iiO;

                static {
/* 9 */             I11Oioio i11Oioio = new I11Oioio(null, false);
/* 12 */            i11Oioio.I00iiO = false;
/* 14 */            I00iio = i11Oioio;
                }

                public I11Oioio(IOiIOIII0io iOiIOIII0io, boolean z) {
/* 4 */             this.I00iOIl = iOiIOIII0io;
/* 6 */             this.I00iiI = z;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof I11Oioio)) {
/* 32 */                return false;
                    }
/* 6 */             I11Oioio i11Oioio = (I11Oioio) obj;
                    return l1ioii1I10Io.I00000oIO(this.I00iOIl, i11Oioio.I00iOIl) && this.I00iiO == i11Oioio.I00iiO && this.I00iiI == i11Oioio.I00iiI;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.I00iOIl, Boolean.valueOf(this.I00iiO), Boolean.valueOf(this.I00iiI)});
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I00iOIl);
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             if (this.I00iiO) {
/* 11 */                parcel.setDataPosition(parcel.dataPosition() - 4);
/* 20 */                parcel.setDataSize(parcel.dataSize() - 4);
/* 23 */                return;
                    }
/* 27 */            parcel.writeInt(-204102970);
/* 32 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 39 */            lO0IioIooIl.I000OOo1O(parcel, 1, this.I00iOIl, i);
/* 44 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 49 */            parcel.writeInt(this.I00iiI ? 1 : 0);
/* 52 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
