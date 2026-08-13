            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            
/* 15 */    final class zzbau extends InputStream {
                private byte[][] zza;
                private byte[] zzb;
                private int zzc;
                private int zzd;
                private int zze;
                private boolean zzf;

                public zzbau(byte[][] bArr, int i) {
/* 4 */             this.zza = bArr;
/* 6 */             this.zze = i;
/* 9 */             if (bArr.length > 0) {
/* 14 */                this.zzb = bArr[0];
                    }
                }

                private final void zza() {
/* 3 */             int i = this.zzc + 1;
/* 5 */             this.zzc = i;
/* 8 */             this.zzd = 0;
/* 10 */            byte[][] bArr = this.zza;
/* 12 */            if (bArr == null || i >= bArr.length) {
/* 23 */                this.zzb = null;
                    } else {
/* 19 */                this.zzb = bArr[i];
                    }
                }

                @Override
                public final int available() {
/* 1 */             return this.zze;
                }

                @Override
                public final void close() {
/* 3 */             if (this.zzf) {
/* 55 */                return;
                    }
/* 6 */             this.zzf = true;
/* 8 */             byte[][] bArr = this.zza;
/* 10 */            if (bArr != null) {
/* 14 */                for (byte[] bArr2 : bArr) {
/* 18 */                    zzbav.zza(bArr2);
                        }
                    } else {
/* 24 */                byte[] bArr3 = this.zzb;
/* 26 */                if (bArr3 != null) {
/* 28 */                    zzbav.zza(bArr3);
                        }
                    }
/* 32 */            this.zzb = null;
/* 34 */            this.zza = null;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i2;
                    while (true) {
/* 2 */                 byte[] bArr2 = this.zzb;
/* 4 */                 if (bArr2 == null) {
                            break;
                        }
/* 12 */                int[] iArr = {i3, bArr2.length - this.zzd, this.zze};
/* 17 */                int i4 = iArr[0];
/* 21 */                for (int i5 = 1; i5 < 3; i5++) {
/* 23 */                    int i6 = iArr[i5];
/* 25 */                    if (i6 < i4) {
/* 27 */                        i4 = i6;
                            }
                        }
/* 35 */                System.arraycopy(this.zzb, this.zzd, bArr, i, i4);
/* 38 */                i += i4;
/* 39 */                i3 -= i4;
                        this.zze -= i4;
/* 45 */                if (i3 == 0) {
/* 49 */                    int i7 = this.zzd + i4;
/* 50 */                    this.zzd = i7;
/* 55 */                    if (i7 == this.zzb.length) {
/* 57 */                        zza();
                            }
                        } else {
/* 61 */                    zza();
                        }
                    }
/* 65 */            int i8 = i2 - i3;
/* 66 */            if (i8 > 0 || this.zze > 0) {
/* 98 */                return i8;
                    }
/* 73 */            return -1;
                }

/* 16 */        public zzbau(byte[] bArr) {
                    this.zza = null;
                    int length = bArr.length;
                    this.zzb = length <= 0 ? null : bArr;
                    this.zze = length;
                }

                @Override
/* 75 */        public final int read() {
/* 76 */            byte[] bArr = this.zzb;
                    if (bArr == null) {
                        return -1;
                    }
                    int i = this.zzd;
                    int i2 = i + 1;
                    this.zzd = i2;
                    byte b = bArr[i];
                    this.zze--;
                    if (i2 == bArr.length) {
/* 77 */                zza();
                    }
                    return b;
                }
            }
