            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Locale;
            import p000.IIl001iO0Io;
            import p000.IOOlIIilOl0;
            import p000.OIiilo1Ool0o;
            
            final class zzafj extends zzafm {
                private final byte[] zzc;
                private final int zzd;
                private int zze;

                public zzafj(byte[] bArr, int i, int i2) {
/* 2 */             super(null);
/* 5 */             if (bArr == null) {
/* 42 */                IOOlIIilOl0.I000II("buffer");
/* 98 */                throw null;
                    }
/* 9 */             int i3 = i + i2;
/* 11 */            int length = bArr.length;
/* 15 */            if ((i | i2 | (length - i3)) < 0) {
/* 24 */                Locale locale = Locale.US;
/* 36 */                OIiilo1Ool0o.I000o00OoI0I(i2, IIl001iO0Io.I0010I0i("Array range is invalid. Buffer.length=", length, ", offset=", i, ", length="));
/* 39 */                throw null;
                    }
/* 17 */            this.zzc = bArr;
/* 19 */            this.zze = i;
/* 21 */            this.zzd = i3;
                }

                @Override
                public final int zza() {
/* 5 */             return this.zzd - this.zze;
                }

                @Override
                public final void zzb(byte b) throws zzafk {
/* 1 */             int i = this.zze;
                    try {
/* 5 */                 int i2 = i + 1;
                        try {
/* 7 */                     this.zzc[i] = b;
/* 9 */                     this.zze = i2;
                        } catch (IndexOutOfBoundsException e) {
/* 12 */                    e = e;
/* 13 */                    i = i2;
/* 29 */                    throw new zzafk(i, this.zzd, 1, e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 17 */                e = e2;
                    }
                }

                public final void zzc(byte[] bArr, int i, int i2) throws zzafk {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.zzc, this.zze, i2);
                        this.zze += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 98 */                throw new zzafk(this.zze, this.zzd, i2, e);
                    }
                }

                @Override
                public final void zzd(int i, boolean z) throws zzafk {
/* 3 */             zzu(i << 3);
/* 6 */             zzb(z ? (byte) 1 : (byte) 0);
                }

                @Override
                public final void zze(byte[] bArr, int i, int i2) throws zzafk {
/* 1 */             zzu(i2);
/* 5 */             zzc(bArr, 0, i2);
                }

                @Override
                public final void zzf(int i, zzafd zzafdVar) throws zzafk {
/* 5 */             zzu((i << 3) | 2);
/* 8 */             zzg(zzafdVar);
                }

                @Override
                public final void zzg(zzafd zzafdVar) throws zzafk {
/* 5 */             zzu(zzafdVar.zze());
/* 8 */             zzafdVar.zzh(this);
                }

                @Override
                public final void zzh(int i, int i2) throws zzafk {
/* 5 */             zzu((i << 3) | 5);
/* 8 */             zzi(i2);
                }

                @Override
                public final void zzi(int i) throws zzafk {
/* 1 */             int i2 = this.zze;
                    try {
/* 3 */                 byte[] bArr = this.zzc;
/* 6 */                 bArr[i2] = (byte) i;
/* 13 */                bArr[i2 + 1] = (byte) (i >> 8);
/* 20 */                bArr[i2 + 2] = (byte) (i >> 16);
/* 27 */                bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */                this.zze = i2 + 4;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new zzafk(i2, this.zzd, 4, e);
                    }
                }

                @Override
                public final void zzj(int i, long j) throws zzafk {
/* 5 */             zzu((i << 3) | 1);
/* 8 */             zzk(j);
                }

                @Override
                public final void zzk(long j) throws zzafk {
/* 1 */             int i = this.zze;
                    try {
/* 3 */                 byte[] bArr = this.zzc;
/* 7 */                 bArr[i] = (byte) j;
/* 17 */                bArr[i + 1] = (byte) (j >> 8);
/* 27 */                bArr[i + 2] = (byte) (j >> 16);
/* 37 */                bArr[i + 3] = (byte) (j >> 24);
/* 47 */                bArr[i + 4] = (byte) (j >> 32);
/* 57 */                bArr[i + 5] = (byte) (j >> 40);
/* 67 */                bArr[i + 6] = (byte) (j >> 48);
/* 76 */                bArr[i + 7] = (byte) (j >> 56);
/* 79 */                this.zze = i + 8;
                    } catch (IndexOutOfBoundsException e) {
/* 168 */               throw new zzafk(i, this.zzd, 8, e);
                    }
                }

                @Override
                public final void zzl(int i, int i2) throws zzafk {
/* 3 */             zzu(i << 3);
/* 6 */             zzm(i2);
                }

                @Override
                public final void zzm(int i) throws zzafk {
/* 1 */             if (i >= 0) {
/* 3 */                 zzu(i);
                    } else {
/* 8 */                 zzw(i);
                    }
                }

                @Override
                public final void zzn(zzahn zzahnVar) throws zzafk {
/* 5 */             zzu(zzahnVar.zzn());
/* 8 */             zzahnVar.zzJ(this);
                }

                @Override
                public final void zzo(int i, zzahn zzahnVar) throws zzafk {
/* 3 */             zzu(11);
/* 7 */             zzt(2, i);
/* 12 */            zzu(26);
/* 15 */            zzn(zzahnVar);
/* 20 */            zzu(12);
                }

                @Override
                public final void zzp(int i, zzafd zzafdVar) throws zzafk {
/* 3 */             zzu(11);
/* 7 */             zzt(2, i);
/* 11 */            zzf(3, zzafdVar);
/* 16 */            zzu(12);
                }

                @Override
                public final void zzq(int i, String str) throws zzafk {
/* 5 */             zzu((i << 3) | 2);
/* 8 */             zzr(str);
                }

                @Override
                public final void zzr(String str) throws zzafk {
/* 1 */             int i = this.zze;
                    try {
/* 9 */                 int iZzy = zzafm.zzy(str.length() * 3);
/* 17 */                int iZzy2 = zzafm.zzy(str.length());
/* 21 */                if (iZzy2 != iZzy) {
/* 50 */                    zzu(zzaiy.zzb(str));
/* 53 */                    byte[] bArr = this.zzc;
/* 55 */                    int i2 = this.zze;
/* 63 */                    this.zze = zzaiy.zza(str, bArr, i2, bArr.length - i2);
/* 65 */                    return;
                        }
/* 23 */                int i3 = i + iZzy2;
/* 25 */                this.zze = i3;
/* 27 */                byte[] bArr2 = this.zzc;
/* 31 */                int iZza = zzaiy.zza(str, bArr2, i3, bArr2.length - i3);
/* 35 */                this.zze = i;
/* 40 */                zzu((iZza - i) - iZzy2);
/* 43 */                this.zze = iZza;
                    } catch (IndexOutOfBoundsException e) {
/* 77 */                throw new zzafk(e);
                    }
                }

                @Override
                public final void zzs(int i, int i2) throws zzafk {
/* 4 */             zzu((i << 3) | i2);
                }

                @Override
                public final void zzt(int i, int i2) throws zzafk {
/* 3 */             zzu(i << 3);
/* 6 */             zzu(i2);
                }

                @Override
                public final void zzu(int i) throws zzafk {
                    int i2;
/* 1 */             int i3 = this.zze;
                    while (true) {
/* 3 */                 int i4 = i & (-128);
/* 5 */                 byte[] bArr = this.zzc;
/* 7 */                 if (i4 == 0) {
/* 9 */                     i2 = i3 + 1;
/* 12 */                    bArr[i3] = (byte) i;
/* 14 */                    this.zze = i2;
/* 16 */                    return;
                        } else {
/* 21 */                    i2 = i3 + 1;
                            try {
/* 26 */                        bArr[i3] = (byte) (i | Barcode.FORMAT_ITF);
/* 28 */                        i >>>= 7;
/* 30 */                        i3 = i2;
                            } catch (IndexOutOfBoundsException e) {
/* 77 */                        throw new zzafk(i2, this.zzd, 1, e);
                            }
                        }
/* 77 */                throw new zzafk(i2, this.zzd, 1, e);
                    }
                }

                @Override
                public final void zzv(int i, long j) throws zzafk {
/* 3 */             zzu(i << 3);
/* 6 */             zzw(j);
                }

                @Override
                public final void zzw(long j) throws zzafk {
                    byte[] bArr;
                    int i;
                    byte[] bArr2;
/* 1 */             int i2 = this.zze;
/* 12 */            if (!zzafm.zzc || this.zzd - i2 < 10) {
                        while (true) {
/* 51 */                    long j2 = j & (-128);
/* 55 */                    bArr = this.zzc;
/* 57 */                    if (j2 == 0) {
                                break;
                            }
/* 72 */                    i = i2 + 1;
                            try {
/* 78 */                        bArr[i2] = (byte) (((int) j) | Barcode.FORMAT_ITF);
/* 80 */                        j >>>= 7;
/* 81 */                        i2 = i;
                            } catch (IndexOutOfBoundsException e) {
/* 168 */                       throw new zzafk(i, this.zzd, 1, e);
                            }
/* 168 */                   throw new zzafk(i, this.zzd, 1, e);
                        }
/* 59 */                i = i2 + 1;
/* 63 */                bArr[i2] = (byte) j;
                    } else {
                        while (true) {
/* 21 */                    long j3 = j & (-128);
/* 25 */                    bArr2 = this.zzc;
/* 27 */                    if (j3 == 0) {
                                break;
                            }
/* 45 */                    zzait.zzn(bArr2, i2, (byte) (((int) j) | Barcode.FORMAT_ITF));
/* 48 */                    j >>>= 7;
/* 38 */                    i2++;
                        }
/* 29 */                i = i2 + 1;
/* 34 */                zzait.zzn(bArr2, i2, (byte) j);
                    }
/* 65 */            this.zze = i;
                }
            }
