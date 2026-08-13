            package p000;
            
            public enum O0OIII11 implements Iooio0II1Io {
                UNKNOWN_STATUS(0),
                ENABLED(1),
                DISABLED(2),
                DESTROYED(3),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                O0OIII11(int i) {
/* 4 */             this.I00iOIl = i;
                }

                public final int I00000oIO() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.I00iOIl;
                    }
/* 10 */            I000II.I000iOII("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
