            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.math.RoundingMode;
            import java.util.Arrays;
            import p000.Oi010OO0;
            
/* 79 */    final class zzid {
                final int zza;
                final int zzb;
                final int zzc;
                final int zzd;
                private final String zze;
                private final char[] zzf;
                private final byte[] zzg;
                private final boolean zzh;

                private zzid(String str, char[] cArr, byte[] bArr, boolean z) {
/* 4 */             this.zze = str;
/* 6 */             cArr.getClass();
/* 9 */             this.zzf = cArr;
                    try {
/* 11 */                int length = cArr.length;
/* 14 */                int iZzb = zzil.zzb(length, RoundingMode.UNNECESSARY);
/* 18 */                this.zzb = iZzb;
/* 20 */                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
/* 27 */                int i = 1 << (3 - iNumberOfTrailingZeros);
/* 29 */                this.zzc = i;
/* 33 */                this.zzd = iZzb >> iNumberOfTrailingZeros;
/* 37 */                this.zza = length - 1;
/* 39 */                this.zzg = bArr;
/* 41 */                boolean[] zArr = new boolean[i];
/* 47 */                for (int i2 = 0; i2 < this.zzd; i2++) {
/* 59 */                    zArr[zzil.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                        }
/* 64 */                this.zzh = false;
                    } catch (ArithmeticException e) {
/* 204 */               throw new IllegalArgumentException(Oi010OO0.I000oI1ioi(cArr.length, "Illegal alphabet length "), e);
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzid) && Arrays.equals(this.zzf, ((zzid) obj).zzf);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(this.zzf) + 1237;
                }

                public final String toString() {
/* 1 */             return this.zze;
                }

                public final char zza(int i) {
/* 3 */             return this.zzf[i];
                }

                public final boolean zzb(char c) {
                    return this.zzg[61] != -1;
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 80 */        public zzid(String str, char[] cArr) {
/* 81 */            byte[] bArr = new byte[Barcode.FORMAT_ITF];
                    Arrays.fill(bArr, (byte) -1);
/* 82 */            for (int i = 0; i < cArr.length; i++) {
/* 83 */                char c = cArr[i];
                        boolean z = true;
/* 84 */                zzgo.zzg(c < 128, "Non-ASCII character: %s", c);
/* 85 */                if (bArr[c] != -1) {
                            z = false;
                        }
                        zzgo.zzg(z, "Duplicate character: %s", c);
/* 86 */                bArr[c] = (byte) i;
                    }
/* 87 */            this(str, cArr, bArr, false);
                }
            }
