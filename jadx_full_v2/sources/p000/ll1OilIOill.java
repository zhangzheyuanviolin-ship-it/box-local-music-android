            package p000;
            
            public final class ll1OilIOill {
                public static final ll1OilIOill I0000O = new ll1OilIOill("", "", false);
                public final String I00000oIO;
                public final String I00000oOI;
                public final boolean I0000Il00O;

                static {
/* 18 */            new ll1OilIOill("\n", "  ", true);
                }

                public ll1OilIOill(String str, String str2, boolean z) {
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
