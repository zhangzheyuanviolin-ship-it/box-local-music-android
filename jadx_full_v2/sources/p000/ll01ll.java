            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class ll01ll {
                public static final ll01ll I00iOIl;
                public static final ll01ll[] I00iiI;

                static {
/* 6 */             ll01ll ll01llVar = new ll01ll("DEFAULT", 0);
/* 9 */             I00iOIl = ll01llVar;
/* 31 */            I00iiI = new ll01ll[]{ll01llVar, new ll01ll("SIGNED", 1), new ll01ll("FIXED", 2)};
                }

                public static ll01ll[] values() {
/* 7 */             return (ll01ll[]) I00iiI.clone();
                }
            }
