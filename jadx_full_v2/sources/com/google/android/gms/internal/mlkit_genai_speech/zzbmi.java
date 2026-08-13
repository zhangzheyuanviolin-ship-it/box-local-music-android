            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            
            final class zzbmi {
                final int zza;
                final int zzb;
                final int zzc;
                final AtomicInteger zzd;

                public zzbmi(float f, float f2) {
/* 6 */             AtomicInteger atomicInteger = new AtomicInteger();
/* 9 */             this.zzd = atomicInteger;
/* 15 */            this.zzc = (int) (f2 * 1000.0f);
/* 18 */            int i = (int) (f * 1000.0f);
/* 19 */            this.zza = i;
/* 23 */            this.zzb = i / 2;
/* 25 */            atomicInteger.set(i);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzbmi)) {
/* 7 */                 return false;
                    }
/* 11 */            zzbmi zzbmiVar = (zzbmi) obj;
                    return this.zza == zzbmiVar.zza && this.zzc == zzbmiVar.zzc;
                }

                public final int hashCode() {
/* 17 */            return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzc));
                }

                public final boolean zza() {
                    return this.zzd.get() > this.zzb;
                }

                public final boolean zzb() {
                    AtomicInteger atomicInteger;
                    int i;
                    int i2;
/* 21 */            do {
/* 1 */                 atomicInteger = this.zzd;
/* 3 */                 i = atomicInteger.get();
/* 8 */                 if (i == 0) {
/* 7 */                     return false;
                        }
                        i2 = i - 1000;
/* 21 */            } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
                    return i2 > this.zzb;
                }
            }
