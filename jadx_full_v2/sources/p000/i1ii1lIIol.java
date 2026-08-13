            package p000;
            
            public enum i1ii1lIIol implements i1ol0il1l0i {
                UNKNOWN(0),
                SHARED_PREFS(1),
                CONTENT_PROVIDER(2),
                FILE(6),
                TIKTOK(4),
                DEVICE_CONFIG(5),
                PROCESS_STABLE_CONTENT_PROVIDER(3);

                public final int I00iOIl;

                i1ii1lIIol(int i) {
/* 4 */             this.I00iOIl = i;
                }

                public static i1ii1lIIol I00000oIO(int i) {
                    switch (i) {
                        case 0:
/* 24 */                    return UNKNOWN;
                        case 1:
/* 21 */                    return SHARED_PREFS;
                        case 2:
/* 18 */                    return CONTENT_PROVIDER;
                        case 3:
/* 15 */                    return PROCESS_STABLE_CONTENT_PROVIDER;
                        case 4:
/* 12 */                    return TIKTOK;
                        case 5:
/* 9 */                     return DEVICE_CONFIG;
                        case 6:
/* 6 */                     return FILE;
                        default:
/* 4 */                     return null;
                    }
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.I00iOIl);
                }

                @Override
                public final int zza() {
/* 1 */             return this.I00iOIl;
                }
            }
