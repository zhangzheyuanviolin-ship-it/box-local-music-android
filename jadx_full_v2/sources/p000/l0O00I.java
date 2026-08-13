            package p000;

            import android.graphics.Bitmap;
            
            public final class l0O00I {
                public final int I00000oIO;
                public final String I00000oOI;
                public final Bitmap I0000Il00O;
                public final int I0000O;

                public l0O00I(int i, String str, Bitmap bitmap, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = bitmap;
/* 10 */            this.I0000O = i2;
                }

                public static l0O00I I00000oIO(int i, String str) {
/* 5 */             return new l0O00I(i, str, null, 0);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 53 */                return true;
                    }
/* 6 */             if (!(obj instanceof l0O00I)) {
/* 55 */                return false;
                    }
/* 8 */             l0O00I l0o00i = (l0O00I) obj;
/* 14 */            if (this.I00000oIO != l0o00i.I00000oIO) {
/* 55 */                return false;
                    }
/* 16 */            String str = l0o00i.I00000oOI;
/* 18 */            String str2 = this.I00000oOI;
/* 20 */            if (str2 == null) {
/* 22 */                if (str != null) {
/* 55 */                    return false;
                        }
                    } else if (!str2.equals(str)) {
/* 55 */                return false;
                    }
/* 31 */            Bitmap bitmap = l0o00i.I0000Il00O;
/* 33 */            Bitmap bitmap2 = this.I0000Il00O;
/* 35 */            if (bitmap2 == null) {
/* 37 */                if (bitmap != null) {
/* 55 */                    return false;
                        }
                    } else if (!bitmap2.equals(bitmap)) {
/* 55 */                return false;
                    }
                    return this.I0000O == l0o00i.I0000O;
                }

                public final int hashCode() {
/* 2 */             String str = this.I00000oOI;
/* 8 */             int iHashCode = str == null ? 0 : str.hashCode();
/* 12 */            Bitmap bitmap = this.I0000Il00O;
/* 37 */            return this.I0000O ^ (((bitmap != null ? bitmap.hashCode() : 0) ^ ((iHashCode ^ ((this.I00000oIO ^ 1000003) * 1000003)) * 1000003)) * (-429739981));
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I0000Il00O);
/* 7 */             int i = this.I00000oIO;
/* 13 */            int length = String.valueOf(i).length();
/* 17 */            String str = this.I00000oOI;
/* 23 */            int length2 = String.valueOf(str).length();
/* 27 */            int length3 = strValueOf.length();
/* 31 */            int i2 = this.I0000O;
/* 54 */            StringBuilder sb = new StringBuilder(length + 26 + length2 + 9 + length3 + 68 + String.valueOf(i2).length() + 1);
/* 59 */            sb.append("LlmMessage{role=");
/* 62 */            sb.append(i);
/* 67 */            sb.append(", message=");
/* 70 */            sb.append(str);
/* 75 */            sb.append(", bitmap=");
/* 78 */            sb.append(strValueOf);
/* 83 */            sb.append(", imageEmbedding=null, uriToWrite=null, audio=null, blob=null, type=");
/* 86 */            sb.append(i2);
/* 91 */            sb.append("}");
/* 94 */            return sb.toString();
                }
            }
