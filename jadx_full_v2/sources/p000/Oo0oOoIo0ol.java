            package p000;
            
            public enum Oo0oOoIo0ol {
                THEME_UNSPECIFIED(0),
                THEME_LIGHT(1),
                THEME_DARK(2),
                THEME_AUTO(3),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                Oo0oOoIo0ol(int i) {
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
