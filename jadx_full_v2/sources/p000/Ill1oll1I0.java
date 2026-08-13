            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Ill1oll1I0 implements Parcelable {
                public static final Parcelable.Creator<Ill1oll1I0> CREATOR = new i1IIiI1OOo(8);
                public String I00iOIl;
                public String I00iiI;
                public boolean I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public String I00ilO0;
                public boolean I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;
                public Bundle I00l0OO0IO;
                public boolean I00li1OI;
                public int I00ll1;
                public Bundle I00lli11;

                @Override
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final String toString() {
/* 1 */             String str = this.I00ilO0;
/* 3 */             int i = this.I00ilI0I1;
/* 9 */             StringBuilder sb = new StringBuilder(Barcode.FORMAT_ITF);
/* 14 */            sb.append("FragmentState{");
/* 19 */            sb.append(this.I00iOIl);
/* 24 */            sb.append(" (");
/* 29 */            sb.append(this.I00iiI);
/* 34 */            sb.append(")}:");
/* 39 */            if (this.I00iiO) {
/* 43 */                sb.append(" fromLayout");
                    }
/* 46 */            if (i != 0) {
/* 50 */                sb.append(" id=0x");
/* 57 */                sb.append(Integer.toHexString(i));
                    }
/* 60 */            if (str != null && !str.isEmpty()) {
/* 70 */                sb.append(" tag=");
/* 73 */                sb.append(str);
                    }
/* 78 */            if (this.I00io1l) {
/* 82 */                sb.append(" retainInstance");
                    }
/* 87 */            if (this.I00ioIO) {
/* 91 */                sb.append(" removing");
                    }
/* 96 */            if (this.I00l0I0l0lO1) {
/* 100 */               sb.append(" detached");
                    }
/* 105 */           if (this.I00li1OI) {
/* 109 */               sb.append(" hidden");
                    }
/* 112 */           return sb.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.I00iOIl);
/* 8 */             parcel.writeString(this.I00iiI);
/* 13 */            parcel.writeInt(this.I00iiO ? 1 : 0);
/* 18 */            parcel.writeInt(this.I00iio);
/* 23 */            parcel.writeInt(this.I00ilI0I1);
/* 28 */            parcel.writeString(this.I00ilO0);
/* 33 */            parcel.writeInt(this.I00io1l ? 1 : 0);
/* 38 */            parcel.writeInt(this.I00ioIO ? 1 : 0);
/* 43 */            parcel.writeInt(this.I00l0I0l0lO1 ? 1 : 0);
/* 48 */            parcel.writeBundle(this.I00l0OO0IO);
/* 53 */            parcel.writeInt(this.I00li1OI ? 1 : 0);
/* 58 */            parcel.writeBundle(this.I00lli11);
/* 63 */            parcel.writeInt(this.I00ll1);
                }
            }
