            package p000;

            import com.google.mlkit.genai.prompt.GenerativeModel;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class I001i1lo1io {
                public final GenerativeModel I00000oIO;
                public final List I00000oOI;
                public OlIl0i I0000Il00O;

                public I001i1lo1io(GenerativeModel generativeModel) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.I00000oIO = generativeModel;
/* 11 */            this.I00000oOI = arrayList;
/* 14 */            this.I0000Il00O = null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof I001i1lo1io)) {
/* 43 */                return false;
                    }
/* 9 */             I001i1lo1io i001i1lo1io = (I001i1lo1io) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i001i1lo1io.I00000oIO) && this.I00000oOI.equals(i001i1lo1io.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, i001i1lo1io.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            OlIl0i olIl0i = this.I0000Il00O;
/* 26 */            return iI0000oI00 + (olIl0i == null ? 0 : olIl0i.hashCode());
                }

                public final String toString() {
/* 38 */            return "AICoreModelInstance(generativeModel=" + this.I00000oIO + ", chatHistory=" + this.I00000oOI + ", inferenceJob=" + this.I0000Il00O + ")";
                }
            }
