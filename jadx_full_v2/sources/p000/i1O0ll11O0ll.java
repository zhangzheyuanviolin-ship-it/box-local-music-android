            package p000;

            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            
            public final class i1O0ll11O0ll {
                public final GenerateContentRequest I00000oIO;
                public final O0IOli0o0 I00000oOI;
                public final boolean I0000Il00O;

                public i1O0ll11O0ll(GenerateContentRequest generateContentRequest, O0IOli0o0 o0IOli0o0, boolean z) {
/* 4 */             this.I00000oIO = generateContentRequest;
/* 6 */             this.I00000oOI = o0IOli0o0;
/* 8 */             this.I0000Il00O = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i1O0ll11O0ll)) {
/* 7 */                 return false;
                    }
/* 11 */            i1O0ll11O0ll i1o0ll11o0ll = (i1O0ll11O0ll) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1o0ll11o0ll.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, i1o0ll11o0ll.I00000oOI) && this.I0000Il00O == i1o0ll11o0ll.I0000Il00O;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             O0IOli0o0 o0IOli0o0 = this.I00000oOI;
/* 28 */            return Boolean.hashCode(this.I0000Il00O) + ((iHashCode + (o0IOli0o0 == null ? 0 : o0IOli0o0.hashCode())) * 31);
                }

                public final String toString() {
/* 1 */             GenerateContentRequest generateContentRequest = this.I00000oIO;
/* 7 */             int length = String.valueOf(generateContentRequest).length();
/* 11 */            O0IOli0o0 o0IOli0o0 = this.I00000oOI;
/* 17 */            int length2 = String.valueOf(o0IOli0o0).length();
/* 21 */            boolean z = this.I0000Il00O;
/* 41 */            StringBuilder sb = new StringBuilder(length + 52 + length2 + 24 + String.valueOf(z).length() + 1);
/* 46 */            sb.append("RequestWrapper(generateContentRequest=");
/* 49 */            sb.append(generateContentRequest);
/* 54 */            sb.append(", outputClass=");
/* 57 */            sb.append(o0IOli0o0);
/* 62 */            sb.append(", includeSchemaInPrompt=");
/* 65 */            sb.append(z);
/* 70 */            sb.append(")");
/* 73 */            return sb.toString();
                }
            }
