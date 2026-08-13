            package p000;
            
            public final class i0IlIo00I {
                public static final i0IlIo00I I0000O = new i0IlIo00I(null, 1, null);
                public final int I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;

                public i0IlIo00I(String str, int i, String str2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 47 */                return true;
                    }
/* 6 */             if (!(obj instanceof i0IlIo00I)) {
/* 49 */                return false;
                    }
/* 8 */             i0IlIo00I i0ilio00i = (i0IlIo00I) obj;
/* 14 */            if (this.I00000oIO != i0ilio00i.I00000oIO) {
/* 49 */                return false;
                    }
/* 16 */            String str = i0ilio00i.I00000oOI;
/* 18 */            String str2 = this.I00000oOI;
/* 20 */            if (str2 == null) {
/* 22 */                if (str != null) {
/* 49 */                    return false;
                        }
                    } else if (!str2.equals(str)) {
/* 49 */                return false;
                    }
/* 31 */            String str3 = i0ilio00i.I0000Il00O;
/* 33 */            String str4 = this.I0000Il00O;
                    return str4 == null ? str3 == null : str4.equals(str3);
                }

                public final int hashCode() {
/* 2 */             String str = this.I00000oOI;
/* 8 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 12 */            String str2 = this.I0000Il00O;
/* 30 */            return ((((this.I00000oIO ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AssetPackLocation{packStorageMethod=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", path=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", assetsPath=");
/* 32 */            return IIl001iO0Io.I00100l0(sb, this.I0000Il00O, "}");
                }
            }
