            package p000;

            import android.os.ParcelFileDescriptor;
            
            public final class i1O0O0O {
                public final String I00000oIO;
                public final ParcelFileDescriptor I00000oOI;
                public final ParcelFileDescriptor I0000Il00O;

                public i1O0O0O(String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, int i) {
/* 4 */             this.I00000oIO = str;
/* 12 */            this.I00000oOI = (i & 2) != 0 ? null : parcelFileDescriptor;
/* 19 */            this.I0000Il00O = (i & 4) != 0 ? null : parcelFileDescriptor2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i1O0O0O)) {
/* 7 */                 return false;
                    }
/* 11 */            i1O0O0O i1o0o0o = (i1O0O0O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1o0o0o.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i1o0o0o.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, i1o0o0o.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            ParcelFileDescriptor parcelFileDescriptor = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode())) * 31;
/* 23 */            ParcelFileDescriptor parcelFileDescriptor2 = this.I0000Il00O;
/* 32 */            return iHashCode2 + (parcelFileDescriptor2 != null ? parcelFileDescriptor2.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 7 */             int length = String.valueOf(str).length();
/* 11 */            ParcelFileDescriptor parcelFileDescriptor = this.I00000oOI;
/* 17 */            int length2 = String.valueOf(parcelFileDescriptor).length();
/* 21 */            ParcelFileDescriptor parcelFileDescriptor2 = this.I0000Il00O;
/* 41 */            StringBuilder sb = new StringBuilder(length + 54 + length2 + 23 + String.valueOf(parcelFileDescriptor2).length() + 1);
/* 46 */            sb.append("PrefixParameters(promptPrefix=");
/* 49 */            sb.append(str);
/* 54 */            sb.append(", fileDescriptorToWrite=");
/* 57 */            sb.append(parcelFileDescriptor);
/* 62 */            sb.append(", fileDescriptorToRead=");
/* 65 */            sb.append(parcelFileDescriptor2);
/* 70 */            sb.append(")");
/* 73 */            return sb.toString();
                }
            }
