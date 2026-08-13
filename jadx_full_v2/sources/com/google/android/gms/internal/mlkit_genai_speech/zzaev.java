            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import p000.IoOOl0iOl1io;
            
            final class zzaev extends zzaew {
                final zzafd zza;
                private int zzb;
                private final int zzc;

                public zzaev(zzafd zzafdVar) {
/* 1 */             Objects.requireNonNull(zzafdVar);
/* 4 */             this.zza = zzafdVar;
/* 10 */            this.zzb = 0;
/* 16 */            this.zzc = zzafdVar.zze();
                }

                @Override
                public final boolean hasNext() {
                    return this.zzb < this.zzc;
                }

                @Override
                public final byte zza() {
/* 1 */             int i = this.zzb;
/* 5 */             if (i < this.zzc) {
/* 9 */                 this.zzb = i + 1;
/* 13 */                return this.zza.zzb(i);
                    }
/* 18 */            IoOOl0iOl1io.I00000oOI();
/* 21 */            return (byte) 0;
                }
            }
