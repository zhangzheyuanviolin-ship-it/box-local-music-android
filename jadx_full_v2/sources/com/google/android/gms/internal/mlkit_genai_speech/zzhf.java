            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.OooioIOo1;
            
            public abstract class zzhf {
                public static int zzd(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 26 */                I000II.I000iOII("cannot store more than Integer.MAX_VALUE elements");
/* 29 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 11 */            if (iI0000Il00O < i2) {
/* 14 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 18 */            if (iI0000Il00O < 0) {
/* 20 */                return Integer.MAX_VALUE;
                    }
/* 23 */            return iI0000Il00O;
                }

                public abstract zzhf zzb(Object obj);
            }
