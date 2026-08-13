            package p000;

            import java.util.Iterator;
            
            public class iIIoI1 {
                public final String I00000oIO;
                public final Class I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final long I0000oI00;

                public iIIoI1(String str, Class cls, boolean z, boolean z2) {
/* 9 */             if (str.isEmpty()) {
/* 120 */               I000II.I000iOII("identifier must not be empty");
/* 204 */               throw null;
                    }
/* 12 */            char cCharAt = str.charAt(0);
/* 24 */            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
/* 114 */               I000II.I000iOII("identifier must start with an ASCII letter: ".concat(str));
/* 117 */               throw null;
                    }
/* 37 */            for (int i = 1; i < str.length(); i++) {
/* 39 */                char cCharAt2 = str.charAt(i);
/* 43 */                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
/* 73 */                    I000II.I000iOII("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
/* 76 */                    throw null;
                        }
                    }
/* 77 */            this.I00000oIO = str;
/* 79 */            this.I00000oOI = cls;
/* 81 */            this.I0000Il00O = z;
/* 83 */            this.I0000O = z2;
/* 85 */            int iIdentityHashCode = System.identityHashCode(this);
/* 89 */            long j = 0;
/* 92 */            for (int i2 = 0; i2 < 5; i2++) {
/* 99 */                j |= 1 << (iIdentityHashCode & 63);
/* 100 */               iIdentityHashCode >>>= 6;
                    }
/* 105 */           this.I0000oI00 = j;
                }

                public void I00000oIO(Iterator it, iOoO1O iooo1o) {
/* 5 */             while (it.hasNext()) {
/* 11 */                I00000oOI(it.next(), iooo1o);
                    }
                }

                public void I00000oOI(Object obj, iOoO1O iooo1o) {
/* 3 */             iooo1o.I00000oIO(this.I00000oIO, obj);
                }

                public final String toString() {
/* 5 */             String name = getClass().getName();
/* 11 */            String name2 = this.I00000oOI.getName();
/* 17 */            StringBuilder sb = new StringBuilder(name);
/* 22 */            sb.append("/");
/* 31 */            return IIl001iO0Io.I00100o1O0lo(sb, this.I00000oIO, "[", name2, "]");
                }
            }
