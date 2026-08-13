            package p000;

            import java.util.Iterator;
            
            public class o0oooliI {
                public final String I00000oIO;
                public final Class I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final long I0000oI00;

                public o0oooliI(String str, Class cls, boolean z, boolean z2) {
/* 5 */             char cCharAt = str.charAt(0);
/* 18 */            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
/* 108 */               I000II.I000iOII("identifier must start with an ASCII letter: ".concat(str));
/* 204 */               throw null;
                    }
/* 31 */            for (int i = 1; i < str.length(); i++) {
/* 33 */                char cCharAt2 = str.charAt(i);
/* 37 */                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
/* 67 */                    I000II.I000iOII("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
/* 70 */                    throw null;
                        }
                    }
/* 71 */            this.I00000oIO = str;
/* 73 */            this.I00000oOI = cls;
/* 75 */            this.I0000Il00O = z;
/* 77 */            this.I0000O = z2;
/* 79 */            int iIdentityHashCode = System.identityHashCode(this);
/* 83 */            long j = 0;
/* 86 */            for (int i2 = 0; i2 < 5; i2++) {
/* 93 */                j |= 1 << (iIdentityHashCode & 63);
/* 94 */                iIdentityHashCode >>>= 6;
                    }
/* 99 */            this.I0000oI00 = j;
                }

                public void I00000oIO(Iterator it, o1101OI1l o1101oi1l) {
/* 5 */             while (it.hasNext()) {
/* 11 */                I00000oOI(it.next(), o1101oi1l);
                    }
                }

                public void I00000oOI(Object obj, o1101OI1l o1101oi1l) {
/* 3 */             o1101oi1l.I00000oIO(this.I00000oIO, obj);
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
