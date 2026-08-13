            package p000;
            
            public enum OIl1lli implements Iooio0II1Io {
                UNKNOWN_PREFIX(0),
                TINK(1),
                LEGACY(2),
                RAW(3),
                CRUNCHY(4),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                OIl1lli(int i) {
/* 4 */             this.I00iOIl = i;
                }

                public static OIl1lli I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 29 */                return UNKNOWN_PREFIX;
                    }
/* 4 */             if (i == 1) {
/* 26 */                return TINK;
                    }
/* 7 */             if (i == 2) {
/* 23 */                return LEGACY;
                    }
/* 10 */            if (i == 3) {
/* 20 */                return RAW;
                    }
/* 13 */            if (i != 4) {
/* 15 */                return null;
                    }
/* 17 */            return CRUNCHY;
                }

                public final int I00000oOI() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.I00iOIl;
                    }
/* 10 */            I000II.I000iOII("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
