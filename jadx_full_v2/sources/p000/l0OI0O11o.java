            package p000;

            import android.os.ParcelFileDescriptor;
            
            public final class l0OI0O11o {
                public lOI1lll1l10 I00000oIO;
                public ParcelFileDescriptor I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof l0OI0O11o) {
/* 10 */                l0OI0O11o l0oi0o11o = (l0OI0O11o) obj;
/* 20 */                if (this.I00000oIO.equals(l0oi0o11o.I00000oIO)) {
/* 22 */                    ParcelFileDescriptor parcelFileDescriptor = this.I00000oOI;
/* 24 */                    ParcelFileDescriptor parcelFileDescriptor2 = l0oi0o11o.I00000oOI;
/* 26 */                    if (parcelFileDescriptor != null ? parcelFileDescriptor.equals(parcelFileDescriptor2) : parcelFileDescriptor2 == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            ParcelFileDescriptor parcelFileDescriptor = this.I00000oOI;
/* 22 */            return (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.I00000oIO.toString();
/* 7 */             int length = string.length();
/* 13 */            String strValueOf = String.valueOf(this.I00000oOI);
/* 28 */            StringBuilder sb = new StringBuilder(length + 46 + strValueOf.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "LlmPrefixParam{promptPrefix=", string, ", cacheFileToRead=", strValueOf);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
