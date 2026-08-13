            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import p000.I000II;
            
            public abstract class zzih {
                private static final zzih zza = new zzif("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

                static {
/* 24 */            new zzif("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
/* 33 */            new zzig("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
/* 42 */            new zzig("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
/* 51 */            new zzie("base16()", "0123456789ABCDEF");
                }

                public static zzih zzf() {
/* 1 */             return zza;
                }

                public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2);

                public abstract int zzc(int i);

                public abstract zzih zzd();

                public final String zzg(byte[] bArr, int i, int i2) {
/* 3 */             zzgo.zzl(0, i2, bArr.length);
/* 12 */            StringBuilder sb = new StringBuilder(zzc(i2));
                    try {
/* 15 */                zzb(sb, bArr, 0, i2);
/* 18 */                return sb.toString();
                    } catch (IOException e) {
/* 24 */                I000II.I000O01llI0(e);
/* 27 */                return null;
                    }
                }
            }
