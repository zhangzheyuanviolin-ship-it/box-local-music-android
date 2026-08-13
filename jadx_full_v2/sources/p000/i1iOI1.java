            package p000;
            
            public enum i1iOI1 implements i1ol0il1l0i {
                PURPOSE_RESTRICTION_NOT_ALLOWED(0),
                PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
                PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
                PURPOSE_RESTRICTION_UNDEFINED(3),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                i1iOI1(int i) {
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final String toString() {
/* 3 */             return Integer.toString(this.I00iOIl);
                }

                @Override
                public final int zza() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.I00iOIl;
                    }
/* 10 */            I000II.I000iOII("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
