            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0oOOiI0 {
                private static final Il0lIli0 $ENTRIES;
                private static final O0oOOiI0[] $VALUES;
                public static final O0oOI1Ii1Iii Companion;
                public static final O0oOOiI0 ON_ANY;
                public static final O0oOOiI0 ON_CREATE;
                public static final O0oOOiI0 ON_DESTROY;
                public static final O0oOOiI0 ON_PAUSE;
                public static final O0oOOiI0 ON_RESUME;
                public static final O0oOOiI0 ON_START;
                public static final O0oOOiI0 ON_STOP;

                static {
/* 6 */             O0oOOiI0 o0oOOiI0 = new O0oOOiI0("ON_CREATE", 0);
/* 9 */             ON_CREATE = o0oOOiI0;
/* 16 */            O0oOOiI0 o0oOOiI02 = new O0oOOiI0("ON_START", 1);
/* 19 */            ON_START = o0oOOiI02;
/* 26 */            O0oOOiI0 o0oOOiI03 = new O0oOOiI0("ON_RESUME", 2);
/* 29 */            ON_RESUME = o0oOOiI03;
/* 36 */            O0oOOiI0 o0oOOiI04 = new O0oOOiI0("ON_PAUSE", 3);
/* 39 */            ON_PAUSE = o0oOOiI04;
/* 46 */            O0oOOiI0 o0oOOiI05 = new O0oOOiI0("ON_STOP", 4);
/* 49 */            ON_STOP = o0oOOiI05;
/* 56 */            O0oOOiI0 o0oOOiI06 = new O0oOOiI0("ON_DESTROY", 5);
/* 59 */            ON_DESTROY = o0oOOiI06;
/* 66 */            O0oOOiI0 o0oOOiI07 = new O0oOOiI0("ON_ANY", 6);
/* 69 */            ON_ANY = o0oOOiI07;
/* 71 */            O0oOOiI0[] o0oOOiI0Arr = {o0oOOiI0, o0oOOiI02, o0oOOiI03, o0oOOiI04, o0oOOiI05, o0oOOiI06, o0oOOiI07};
/* 75 */            $VALUES = o0oOOiI0Arr;
/* 81 */            $ENTRIES = ilIII1o11.I00000oIO(o0oOOiI0Arr);
/* 88 */            Companion = new O0oOI1Ii1Iii();
                }

                public static O0oOOiI0 valueOf(String str) {
/* 7 */             return (O0oOOiI0) Enum.valueOf(O0oOOiI0.class, str);
                }

                public static O0oOOiI0[] values() {
/* 7 */             return (O0oOOiI0[]) $VALUES.clone();
                }

                public final O0oOi0I I00000oIO() {
                    switch (O0oOIOoo.I00000oIO[ordinal()]) {
                        case 1:
                        case 2:
                            break;
                        case 3:
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
/* 19 */                    IoOOl0iOl1io.I0000O(this, " has no target state");
                            break;
                        default:
/* 13 */                    I000II.I00000oIO();
                            break;
                    }
/* 9 */             return null;
                }
            }
