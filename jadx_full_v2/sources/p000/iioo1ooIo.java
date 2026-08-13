            package p000;
            
            public class iioo1ooIo {
                public final String I00000oIO;
                public final Class I00000oOI;
                public final boolean I0000Il00O;

                public iioo1ooIo(String str, Class cls, boolean z, int i) {
/* 5 */             char cCharAt = str.charAt(0);
/* 18 */            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
/* 93 */                I000II.I000iOII("identifier must start with an ASCII letter: ".concat(str));
/* 204 */               throw null;
                    }
/* 31 */            for (int i2 = 1; i2 < str.length(); i2++) {
/* 33 */                char cCharAt2 = str.charAt(i2);
/* 37 */                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
/* 67 */                    I000II.I000iOII("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
/* 70 */                    throw null;
                        }
                    }
/* 71 */            this.I00000oIO = str;
/* 73 */            this.I00000oOI = cls;
/* 75 */            this.I0000Il00O = z;
/* 77 */            System.identityHashCode(this);
/* 81 */            for (int i3 = 0; i3 < 5; i3++) {
                    }
                }

                public final String toString() {
/* 5 */             String name = getClass().getName();
/* 11 */            String name2 = this.I00000oOI.getName();
/* 15 */            int length = name.length();
/* 19 */            int length2 = name2.length();
/* 27 */            String str = this.I00000oIO;
/* 39 */            StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
/* 46 */            IIl001iO0Io.I001lIiIIo1O(sb, name, "/", str, "[");
/* 51 */            return IIl001iO0Io.I00100l0(sb, name2, "]");
                }
            }
