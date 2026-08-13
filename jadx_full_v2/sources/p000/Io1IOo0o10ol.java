            package p000;
            
            public enum Io1IOo0o10ol implements Iooio0II1Io {
                UNKNOWN_HASH(0),
                SHA1(1),
                SHA384(2),
                SHA256(3),
                SHA512(4),
                SHA224(5),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                Io1IOo0o10ol(int i) {
/* 4 */             this.I00iOIl = i;
                }

                public static Io1IOo0o10ol I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 35 */                return UNKNOWN_HASH;
                    }
/* 4 */             if (i == 1) {
/* 32 */                return SHA1;
                    }
/* 7 */             if (i == 2) {
/* 29 */                return SHA384;
                    }
/* 10 */            if (i == 3) {
/* 26 */                return SHA256;
                    }
/* 13 */            if (i == 4) {
/* 23 */                return SHA512;
                    }
/* 16 */            if (i != 5) {
/* 18 */                return null;
                    }
/* 20 */            return SHA224;
                }

                public final int I00000oOI() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.I00iOIl;
                    }
/* 10 */            I000II.I000iOII("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
