            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.InputStream;
            import p000.OoOil11Ol1o;
            
/* 12 */    public abstract class zzafh {
                public static final int zzf = 0;
                private static volatile int zzg = 100;
                int zza;
                int zzb;
                final int zzc = zzg;
                int zzd = Integer.MAX_VALUE;
                Object zze;

                private zzafh() {
                }

                public static int zzF(int i) {
/* 6 */             return (i >>> 1) ^ (-(i & 1));
                }

                public static long zzH(long j) {
/* 7 */             return (j >>> 1) ^ (-(1 & j));
                }

                public static zzafh zzI(InputStream inputStream, int i) {
/* 6 */             return new zzaff(inputStream, Barcode.FORMAT_AZTEC, null);
                }

                public static zzafh zzJ(byte[] bArr, int i, int i2) {
/* 2 */             return zzK(bArr, 0, i2, false);
                }

                public static zzafh zzK(byte[] bArr, int i, int i2, boolean z) {
/* 8 */             zzafe zzafeVar = new zzafe(bArr, 0, i2, z, null);
                    try {
/* 11 */                zzafeVar.zze(i2);
/* 14 */                return zzafeVar;
                    } catch (zzagr e) {
/* 204 */               throw new IllegalArgumentException(e);
                    }
                }

                public abstract void zzA(int i);

                public abstract boolean zzC();

                public abstract boolean zzD();

                public abstract boolean zzE(int i);

                public final int zzG(int i) {
/* 1 */             int i2 = this.zzd;
/* 6 */             this.zzd = Integer.MAX_VALUE;
/* 29 */            return i2;
                }

                public final void zzL() throws zzagr {
/* 8 */             if (this.zza + this.zzb < this.zzc) {
/* 10 */                return;
                    }
/* 13 */            OoOil11Ol1o.I001i1O0Ol("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }

                public final void zzM() {
/* 3 */             if (this.zzb == 0) {
/* 6 */                 zzz(0);
                    }
                }

                public final void zzN() throws zzagr {
                    int iZzm;
/* 27 */            do {
/* 1 */                 iZzm = zzm();
/* 5 */                 if (iZzm == 0) {
/* 55 */                    return;
                        }
/* 8 */                 zzL();
                        this.zzb++;
                        this.zzb--;
/* 27 */            } while (zzE(iZzm));
                }

                public abstract double zzb();

                public abstract float zzc();

                public abstract int zzd();

                public abstract int zze(int i);

                public abstract int zzf();

                public abstract int zzg();

                public abstract int zzh();

                public abstract int zzk();

                public abstract int zzl();

                public abstract int zzm();

                public abstract int zzn();

                public abstract long zzo();

                public abstract long zzp();

                public abstract long zzt();

                public abstract long zzu();

                public abstract long zzv();

                public abstract zzafd zzw();

                public abstract String zzx();

                public abstract String zzy();

                public abstract void zzz(int i);

/* 13 */        public zzafh(zzafg zzafgVar) {
                }
            }
