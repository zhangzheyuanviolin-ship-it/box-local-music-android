            package p000;
            
            public final class il0Ili1ioiiO {
                public static final il0Ili1ioiiO I0000O = new il0Ili1ioiiO("", "", false);
                public final String I00000oIO;
                public final String I00000oOI;
                public final boolean I0000Il00O;

                static {
/* 18 */            new il0Ili1ioiiO("\n", "  ", true);
                }

                public il0Ili1ioiiO(String str, String str2, boolean z) {
/* 11 */            if (!str.matches("[\r\n]*")) {
/* 36 */                I000II.I000iOII("Only combinations of \\n and \\r are allowed in newline.");
/* 98 */                throw null;
                    }
/* 19 */            if (!str2.matches("[ \t]*")) {
/* 30 */                I000II.I000iOII("Only combinations of spaces and tabs are allowed in indent.");
/* 33 */                throw null;
                    }
/* 21 */            this.I00000oIO = str;
/* 23 */            this.I00000oOI = str2;
/* 25 */            this.I0000Il00O = z;
                }
            }
