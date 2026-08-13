            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            
/* 22 */    public final class ii0oooi0IO0l extends I01OlIoIl {
                public static final Parcelable.Creator<ii0oooi0IO0l> CREATOR = new iIlI1lioo0lO(17);
                public final String I00iOIl;
                public final ii0il0lOolIo I00iiI;
                public final String I00iiO;
                public final long I00iio;
                public final long I00ilI0I1;

                public ii0oooi0IO0l(ii0oooi0IO0l ii0oooi0io0l, long j, long j2) {
/* 4 */             lII0I0I000I.I000II(ii0oooi0io0l);
/* 9 */             this.I00iOIl = ii0oooi0io0l.I00iOIl;
/* 13 */            this.I00iiI = ii0oooi0io0l.I00iiI;
/* 17 */            this.I00iiO = ii0oooi0io0l.I00iiO;
/* 19 */            this.I00iio = j;
/* 21 */            this.I00ilI0I1 = j2;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I00iiI);
/* 7 */             String str = this.I00iiO;
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            String str2 = this.I00iOIl;
/* 39 */            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
/* 46 */            IIl001iO0Io.I001lIiIIo1O(sb, "origin=", str, ",name=", str2);
/* 51 */            return IIl001iO0Io.I00100l0(sb, ",params=", strValueOf);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             iIlI1lioo0lO.I00000oIO(this, parcel, i);
                }

/* 23 */        public ii0oooi0IO0l(String str, ii0il0lOolIo ii0il0loolio, String str2, long j, long j2) {
/* 25 */            this.I00iOIl = str;
                    this.I00iiI = ii0il0loolio;
                    this.I00iiO = str2;
                    this.I00iio = j;
                    this.I00ilI0I1 = j2;
                }
            }
