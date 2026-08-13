            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.OoOil11Ol1o;
            
            class zzaiv {
                public static final int zza(String str, byte[] bArr, int i, int i2) {
/* 3 */             byte[] bytes = str.getBytes(zzagp.zza);
/* 7 */             int length = bytes.length;
/* 11 */            if (length - i <= i2) {
/* 13 */                System.arraycopy(bytes, 0, bArr, i, length);
/* 16 */                return i + length;
                    }
/* 20 */            OoOil11Ol1o.I0010I0i("Not enough space in output buffer to encode UTF-8 string");
/* 10 */            return 0;
                }
            }
