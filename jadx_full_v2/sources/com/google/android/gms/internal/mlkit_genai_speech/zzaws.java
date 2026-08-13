            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            
            public final class zzaws {
                private final List zza;
                private final zzatu zzb;
                private final Object zzc;

                public zzaws(List list, zzatu zzatuVar, Object obj, zzaww zzawwVar) {
/* 8 */             zzgo.zzc(list, "addresses");
/* 20 */            this.zza = Collections.unmodifiableList(new ArrayList(list));
/* 24 */            zzgo.zzc(zzatuVar, "attributes");
/* 27 */            this.zzb = zzatuVar;
/* 29 */            this.zzc = obj;
                }

                public static zzawr zzb() {
/* 3 */             return new zzawr();
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzaws)) {
/* 3 */                 return false;
                    }
/* 7 */             zzaws zzawsVar = (zzaws) obj;
                    return Objects.equals(this.zza, zzawsVar.zza) && Objects.equals(this.zzb, zzawsVar.zzb) && Objects.equals(this.zzc, zzawsVar.zzc);
                }

                public final int hashCode() {
/* 11 */            return Objects.hash(this.zza, this.zzb, this.zzc);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("addresses", this.zza);
/* 16 */            zzgkVarZzb.zzd("attributes", this.zzb);
/* 23 */            zzgkVarZzb.zzd("loadBalancingPolicyConfig", this.zzc);
/* 26 */            return zzgkVarZzb.toString();
                }

                public final zzatu zza() {
/* 1 */             return this.zzb;
                }

                public final Object zzc() {
/* 1 */             return this.zzc;
                }

                public final List zzd() {
/* 1 */             return this.zza;
                }
            }
