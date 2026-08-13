            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            
/* 18 */    final class zzif extends zzig {
                private zzif(zzid zzidVar, Character ch) {
/* 1 */             super(zzidVar, ch);
/* 16 */            zzgo.zze(zzidVar.zzf.length == 64);
                }

                @Override
                public final zzih zza(zzid zzidVar, Character ch) {
/* 4 */             return new zzif(zzidVar, null);
                }

                @Override
                public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzgo.zzl(0, i2, bArr.length);
/* 8 */             for (int i4 = i2; i4 >= 3; i4 -= 3) {
/* 14 */                int i5 = bArr[i3] & 255;
/* 18 */                int i6 = bArr[i3 + 1] & 255;
/* 24 */                int i7 = bArr[i3 + 2] & 255;
/* 26 */                zzid zzidVar = this.zzb;
/* 33 */                int i8 = (i6 << 8) | (i5 << 16) | i7;
/* 40 */                appendable.append(zzidVar.zza(i8 >>> 18));
/* 51 */                appendable.append(zzidVar.zza((i8 >>> 12) & 63));
/* 62 */                appendable.append(zzidVar.zza((i8 >>> 6) & 63));
/* 71 */                appendable.append(zzidVar.zza(i8 & 63));
/* 74 */                i3 += 3;
                    }
/* 79 */            if (i3 < i2) {
/* 82 */                zze(appendable, bArr, i3, i2 - i3);
                    }
                }

/* 19 */        public zzif(String str, String str2, Character ch) {
/* 20 */            this(new zzid(str, str2.toCharArray()), ch);
                }
            }
