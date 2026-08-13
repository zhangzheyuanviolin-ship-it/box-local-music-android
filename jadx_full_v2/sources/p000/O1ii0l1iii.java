            package p000;

            import java.nio.charset.Charset;
            import java.util.regex.Pattern;
            
            public final class O1ii0l1iii {
                public static final Pattern I0000Il00O = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
                public static final Pattern I0000O = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
                public String I00000oIO;
                public String[] I00000oOI;

                public final Charset I00000oIO(Charset charset) {
                    String str;
/* 1 */             String[] strArr = this.I00000oOI;
/* 7 */             int i = 0;
/* 8 */             int iI00000oIO = lIO01iiiOOo.I00000oIO(0, strArr.length - 1, 2);
/* 12 */            if (iI00000oIO < 0) {
/* 34 */                str = null;
                        break;
                    }
/* 23 */            while (!OlOolloIIOl0.I000O01llI0(strArr[i], "charset", true)) {
/* 29 */                if (i == iI00000oIO) {
/* 34 */                    str = null;
                            break;
                        }
/* 31 */                i += 2;
                    }
/* 26 */            str = strArr[i + 1];
/* 35 */            if (str == null) {
/* 37 */                return charset;
                    }
                    try {
/* 38 */                return Charset.forName(str);
                    } catch (IllegalArgumentException unused) {
/* 49 */                return charset;
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O1ii0l1iii) && O0000Ioio00.I0000O(((O1ii0l1iii) obj).I00000oIO, this.I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00000oIO;
                }
            }
