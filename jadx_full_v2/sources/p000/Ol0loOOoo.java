            package p000;

            import android.net.Uri;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class Ol0loOOoo {
                public final boolean I00000oIO;
                public final List I00000oOI;
                public final boolean I0000Il00O;
                public final String I0000O;
                public final Uri I0000oI00;
                public final boolean I0001Ioi1lo;
                public final List I000II;
                public final String I000O01llI0;

                public Ol0loOOoo(boolean z, List list, boolean z2, String str, Uri uri, boolean z3, List list2, String str2) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = list;
/* 8 */             this.I0000Il00O = z2;
/* 10 */            this.I0000O = str;
/* 12 */            this.I0000oI00 = uri;
/* 14 */            this.I0001Ioi1lo = z3;
/* 16 */            this.I000II = list2;
/* 18 */            this.I000O01llI0 = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
                public static Ol0loOOoo I00000oIO(Ol0loOOoo ol0loOOoo, boolean z, ArrayList arrayList, boolean z2, String str, Uri uri, boolean z3, List list, String str2, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 z = ol0loOOoo.I00000oIO;
                    }
/* 9 */             boolean z4 = z;
                    ArrayList arrayList2 = arrayList;
/* 12 */            if ((i & 2) != 0) {
/* 14 */                arrayList2 = ol0loOOoo.I00000oOI;
                    }
/* 16 */            ArrayList arrayList3 = arrayList2;
/* 19 */            if ((i & 4) != 0) {
/* 21 */                z2 = ol0loOOoo.I0000Il00O;
                    }
/* 23 */            boolean z5 = z2;
/* 26 */            if ((i & 8) != 0) {
/* 28 */                str = ol0loOOoo.I0000O;
                    }
/* 30 */            String str3 = str;
/* 33 */            if ((i & 16) != 0) {
/* 35 */                uri = ol0loOOoo.I0000oI00;
                    }
/* 37 */            Uri uri2 = uri;
/* 40 */            if ((i & 32) != 0) {
/* 42 */                z3 = ol0loOOoo.I0001Ioi1lo;
                    }
/* 44 */            boolean z6 = z3;
/* 53 */            List list2 = (i & 64) != 0 ? ol0loOOoo.I000II : list;
/* 63 */            String str4 = (i & Barcode.FORMAT_ITF) != 0 ? ol0loOOoo.I000O01llI0 : str2;
/* 65 */            ol0loOOoo.getClass();
/* 70 */            return new Ol0loOOoo(z4, arrayList3, z5, str3, uri2, z6, list2, str4);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ol0loOOoo)) {
/* 7 */                 return false;
                    }
/* 11 */            Ol0loOOoo ol0loOOoo = (Ol0loOOoo) obj;
                    return this.I00000oIO == ol0loOOoo.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, ol0loOOoo.I00000oOI) && this.I0000Il00O == ol0loOOoo.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, ol0loOOoo.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, ol0loOOoo.I0000oI00) && this.I0001Ioi1lo == ol0loOOoo.I0001Ioi1lo && O0000Ioio00.I0000O(this.I000II, ol0loOOoo.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, ol0loOOoo.I000O01llI0);
                }

                public final int hashCode() {
/* 18 */            int iI000OOo1O = Oi010OO0.I000OOo1O(IIl001iO0Io.I0000oI00(Boolean.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
/* 23 */            String str = this.I0000O;
/* 34 */            int iHashCode = (iI000OOo1O + (str == null ? 0 : str.hashCode())) * 31;
/* 35 */            Uri uri = this.I0000oI00;
/* 55 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(Oi010OO0.I000OOo1O((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.I0001Ioi1lo), 31, this.I000II);
/* 59 */            String str2 = this.I000O01llI0;
/* 68 */            return iI0000oI00 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 88 */            return "SkillManagerUiState(loading=" + this.I00000oIO + ", skills=" + this.I00000oOI + ", validating=" + this.I0000Il00O + ", validationError=" + this.I0000O + ", importDirectoryUri=" + this.I0000oI00 + ", loadingSkillAllowlist=" + this.I0001Ioi1lo + ", featuredSkills=" + this.I000II + ", skillAllowlistError=" + this.I000O01llI0 + ")";
                }
            }
