            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            
/* 3 */     public abstract class zzafm extends zzaeu {
                public static final int zzb = 0;
                private static final boolean zzc = zzait.zzx();
                Object zza;

                public zzafm(zzafl zzaflVar) {
                }

                public static zzafm zzA(byte[] bArr, int i, int i2) {
/* 3 */             return new zzafj(bArr, i, i2);
                }

                public static int zzx(zzahn zzahnVar) {
/* 1 */             int iZzn = zzahnVar.zzn();
/* 9 */             return zzy(iZzn) + iZzn;
                }

                public static int zzy(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int zzz(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public final void zzB() {
/* 5 */             if (zza() > 0) {
/* 22 */                I000II.I001IO000("Did not write as much data as expected.");
                    } else {
/* 11 */                if (zza() >= 0) {
/* 13 */                    return;
                        }
/* 16 */                I000II.I001IO000("Wrote more data than expected.");
                    }
                }

                public abstract int zza();

                public abstract void zzb(byte b);

                public abstract void zzd(int i, boolean z);

                public abstract void zze(byte[] bArr, int i, int i2);

                public abstract void zzf(int i, zzafd zzafdVar);

                public abstract void zzg(zzafd zzafdVar);

                public abstract void zzh(int i, int i2);

                public abstract void zzi(int i);

                public abstract void zzj(int i, long j);

                public abstract void zzk(long j);

                public abstract void zzl(int i, int i2);

                public abstract void zzm(int i);

                public abstract void zzn(zzahn zzahnVar);

                public abstract void zzo(int i, zzahn zzahnVar);

                public abstract void zzp(int i, zzafd zzafdVar);

                public abstract void zzq(int i, String str);

                public abstract void zzr(String str);

                public abstract void zzs(int i, int i2);

                public abstract void zzt(int i, int i2);

                public abstract void zzu(int i);

                public abstract void zzv(int i, long j);

                public abstract void zzw(long j);

/* 4 */         private zzafm() {
/* 5 */             throw null;
                }
            }
