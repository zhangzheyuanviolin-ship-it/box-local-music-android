            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            import p000.IIl001iO0Io;
            
            public final class zzbkr extends zzawq {
                private final zzatz zza;
                private final zzaxq zzb;
                private final zzaxv zzc;
                private final zzawo zzd;

                public zzbkr(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzawo zzawoVar) {
/* 6 */             zzgo.zzc(zzaxvVar, "method");
/* 9 */             this.zzc = zzaxvVar;
/* 13 */            zzgo.zzc(zzaxqVar, "headers");
/* 16 */            this.zzb = zzaxqVar;
/* 20 */            zzgo.zzc(zzatzVar, "callOptions");
/* 23 */            this.zza = zzatzVar;
/* 27 */            zzgo.zzc(zzawoVar, "pickDetailsConsumer");
/* 30 */            this.zzd = zzawoVar;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && zzbkr.class == obj.getClass()) {
/* 17 */                zzbkr zzbkrVar = (zzbkr) obj;
/* 23 */                if (this.zza == zzbkrVar.zza && this.zzb == zzbkrVar.zzb && this.zzc == zzbkrVar.zzc && Objects.equals(this.zzd, zzbkrVar.zzd)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 13 */            return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd);
                }

                public final String toString() {
/* 1 */             zzatz zzatzVar = this.zza;
/* 3 */             zzaxq zzaxqVar = this.zzb;
/* 7 */             String string = this.zzc.toString();
/* 11 */            String string2 = zzaxqVar.toString();
/* 31 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("[method=", string, " headers=", string2, " callOptions="), zzatzVar.toString(), "]");
                }

                @Override
                public final zzatz zza() {
/* 1 */             return this.zza;
                }

                @Override
                public final zzaxq zzb() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzaxv zzc() {
/* 1 */             return this.zzc;
                }
            }
