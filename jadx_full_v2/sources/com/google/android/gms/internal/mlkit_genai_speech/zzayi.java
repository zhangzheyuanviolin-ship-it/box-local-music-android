            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            public final class zzayi {
                private final zzazf zza;
                private final zzatu zzb;
                private final zzaye zzc;

                public zzayi(zzazf zzazfVar, zzatu zzatuVar, zzaye zzayeVar) {
/* 4 */             this.zza = zzazfVar;
/* 8 */             zzgo.zzc(zzatuVar, "attributes");
/* 11 */            this.zzb = zzatuVar;
/* 13 */            this.zzc = zzayeVar;
                }

                public static zzayh zzc() {
/* 3 */             return new zzayh();
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzayi)) {
/* 3 */                 return false;
                    }
/* 7 */             zzayi zzayiVar = (zzayi) obj;
                    return Objects.equals(this.zza, zzayiVar.zza) && Objects.equals(this.zzb, zzayiVar.zzb) && Objects.equals(this.zzc, zzayiVar.zzc);
                }

                public final int hashCode() {
/* 11 */            return Objects.hash(this.zza, this.zzb, this.zzc);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 13 */            zzgkVarZzb.zzd("addressesOrError", this.zza.toString());
/* 20 */            zzgkVarZzb.zzd("attributes", this.zzb);
/* 27 */            zzgkVarZzb.zzd("serviceConfigOrError", this.zzc);
/* 30 */            return zzgkVarZzb.toString();
                }

                public final zzatu zza() {
/* 1 */             return this.zzb;
                }

                public final zzaye zzb() {
/* 1 */             return this.zzc;
                }

                public final zzazf zzd() {
/* 1 */             return this.zza;
                }
            }
