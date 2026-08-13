            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            
/* 3 */     final class zzazb implements zzaxo {
                private static final byte[] zza = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

                public zzazb(zzazc zzazcVar) {
                }

                private static boolean zzb(byte b) {
                    return b < 32 || b >= 126 || b == 37;
                }

                @Override
                public final byte[] zza(Object obj) {
/* 5 */             byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
/* 10 */            int i = 0;
                    while (true) {
/* 11 */                int length = bytes.length;
/* 12 */                if (i >= length) {
/* 168 */                   return bytes;
                        }
/* 20 */                if (zzb(bytes[i])) {
/* 26 */                    byte[] bArr = new byte[((length - i) * 3) + i];
/* 28 */                    if (i != 0) {
/* 30 */                        System.arraycopy(bytes, 0, bArr, 0, i);
                            }
/* 33 */                    int i2 = i;
/* 35 */                    while (i < bytes.length) {
/* 37 */                        int i3 = i2 + 1;
/* 39 */                        byte b = bytes[i];
/* 45 */                        if (zzb(b)) {
/* 49 */                            bArr[i2] = 37;
/* 53 */                            byte[] bArr2 = zza;
/* 59 */                            bArr[i3] = bArr2[(b >> 4) & 15];
/* 67 */                            bArr[i2 + 2] = bArr2[b & 15];
/* 69 */                            i2 += 3;
                                } else {
/* 72 */                            bArr[i2] = b;
/* 74 */                            i2 = i3;
                                }
/* 75 */                        i++;
                            }
/* 78 */                    return Arrays.copyOf(bArr, i2);
                        }
/* 83 */                i++;
                    }
                }

/* 4 */         private zzazb() {
/* 5 */             throw null;
                }
            }
