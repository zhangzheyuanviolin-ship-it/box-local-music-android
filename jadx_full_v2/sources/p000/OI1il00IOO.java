            package p000;

            import android.os.Bundle;
            
            public final class OI1il00IOO implements Comparable {
                public final OI1ilOI1ioo0 I00iOIl;
                public final Bundle I00iiI;
                public final boolean I00iiO;
                public final int I00iio;
                public final boolean I00ilI0I1;
                public final int I00ilO0;

                public OI1il00IOO(OI1ilOI1ioo0 oI1ilOI1ioo0, Bundle bundle, boolean z, int i, boolean z2, int i2) {
/* 4 */             this.I00iOIl = oI1ilOI1ioo0;
/* 6 */             this.I00iiI = bundle;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = i;
/* 12 */            this.I00ilI0I1 = z2;
/* 14 */            this.I00ilO0 = i2;
                }

                @Override
                public final int compareTo(OI1il00IOO oI1il00IOO) {
/* 1 */             boolean z = oI1il00IOO.I00ilI0I1;
/* 3 */             boolean z2 = oI1il00IOO.I00iiO;
/* 5 */             Bundle bundle = oI1il00IOO.I00iiI;
/* 8 */             boolean z3 = this.I00iiO;
/* 10 */            if (z3 && !z2) {
/* 7 */                 return 1;
                    }
/* 16 */            if (!z3 && z2) {
/* 15 */                return -1;
                    }
/* 25 */            int i = this.I00iio - oI1il00IOO.I00iio;
/* 26 */            if (i > 0) {
/* 7 */                 return 1;
                    }
/* 29 */            if (i < 0) {
/* 15 */                return -1;
                    }
/* 32 */            Bundle bundle2 = this.I00iiI;
/* 34 */            if (bundle2 != null && bundle == null) {
/* 7 */                 return 1;
                    }
/* 39 */            if (bundle2 == null && bundle != null) {
/* 15 */                return -1;
                    }
/* 44 */            if (bundle2 != null) {
/* 54 */                int size = bundle2.size() - bundle.size();
/* 55 */                if (size > 0) {
/* 7 */                     return 1;
                        }
/* 58 */                if (size < 0) {
/* 15 */                    return -1;
                        }
                    }
/* 61 */            boolean z4 = this.I00ilI0I1;
/* 63 */            if (z4 && !z) {
/* 7 */                 return 1;
                    }
/* 68 */            if (z4 || !z) {
/* 77 */                return this.I00ilO0 - oI1il00IOO.I00ilO0;
                    }
/* 15 */            return -1;
                }
            }
