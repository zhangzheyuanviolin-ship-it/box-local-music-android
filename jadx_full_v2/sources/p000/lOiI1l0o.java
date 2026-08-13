            package p000;

            import java.util.Arrays;
            
            public final class lOiI1l0o {
                public final String I00000oIO;
                public final boolean I00000oOI;

                public lOiI1l0o(String str, boolean z) {
/* 4 */             lII0I0I000I.I0000O(str);
/* 7 */             this.I00000oIO = str;
/* 11 */            lII0I0I000I.I0000O("com.google.android.gms");
/* 14 */            this.I00000oOI = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 42 */                return true;
                    }
/* 6 */             if (!(obj instanceof lOiI1l0o)) {
/* 44 */                return false;
                    }
/* 9 */             lOiI1l0o loii1l0o = (lOiI1l0o) obj;
                    return l1ioii1I10Io.I00000oIO(this.I00000oIO, loii1l0o.I00000oIO) && l1ioii1I10Io.I00000oIO("com.google.android.gms", "com.google.android.gms") && l1ioii1I10Io.I00000oIO(null, null) && this.I00000oOI == loii1l0o.I00000oOI;
                }

                public final int hashCode() {
/* 22 */            return Arrays.hashCode(new Object[]{this.I00000oIO, "com.google.android.gms", null, 4225, Boolean.valueOf(this.I00000oOI)});
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 7 */             lII0I0I000I.I000II(null);
/* 20 */            throw null;
                }
            }
