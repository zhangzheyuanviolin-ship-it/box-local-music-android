            package p000;
            
            public enum i1iO0oIi10 implements i1ol0il1l0i {
                IAB_TCF_PURPOSE_UNKNOWN(0),
                IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
                IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
                IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
                IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
                IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
                IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
                IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
                IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
                IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
                IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
                IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
                UNRECOGNIZED(-1);

                public final int I00iOIl;

                i1iO0oIi10(int i) {
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
