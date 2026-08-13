            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IlIi0I0;
            
            final class zzgc extends zzgb {
                public zzgc(char c) {
                }

                public final String toString() {
/* 2 */             char[] cArr = new char[6];
/* 7 */             cArr[0] = '\\';
/* 12 */            cArr[1] = 'u';
/* 15 */            cArr[2] = 0;
/* 18 */            cArr[3] = 0;
/* 21 */            cArr[4] = 0;
/* 24 */            cArr[5] = 0;
/* 26 */            int i = 44;
/* 28 */            for (int i2 = 0; i2 < 4; i2++) {
/* 40 */                cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
/* 42 */                i >>= 4;
                    }
/* 54 */            return IlIi0I0.I000lI("CharMatcher.is('", String.copyValueOf(cArr), "')");
                }
            }
