            package com.google.mlkit.genai.summarization;

            import android.content.Context;
            import p000.IIlIOloOOO;
            
            final class AutoValue_SummarizerOptions extends SummarizerOptions {
                private final Integer targetVersion = null;
                private final Context zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;
                private final boolean zze;

                public AutoValue_SummarizerOptions(Integer num, Context context, int i, int i2, int i3, boolean z, zze zzeVar) {
/* 7 */             this.zza = context;
/* 9 */             this.zzb = i;
/* 11 */            this.zzc = i2;
/* 13 */            this.zzd = i3;
/* 15 */            this.zze = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof SummarizerOptions) {
/* 10 */                SummarizerOptions summarizerOptions = (SummarizerOptions) obj;
/* 12 */                Integer num = this.targetVersion;
/* 14 */                if (num != null ? num.equals(summarizerOptions.getTargetVersion()) : summarizerOptions.getTargetVersion() == null) {
/* 43 */                    if (this.zza.equals(summarizerOptions.zzd()) && this.zzb == summarizerOptions.zza() && this.zzc == summarizerOptions.zzc() && this.zzd == summarizerOptions.zzb() && this.zze == summarizerOptions.zze()) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public Integer getTargetVersion() {
/* 1 */             return this.targetVersion;
                }

                public final int hashCode() {
/* 1 */             Integer num = this.targetVersion;
/* 22 */            int iHashCode = (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.zza.hashCode();
/* 23 */            int i = this.zzb;
/* 25 */            int i2 = this.zzc;
/* 46 */            return (true != this.zze ? 1237 : 1231) ^ (((((((iHashCode * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.zzd) * 1000003);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zza);
/* 11 */            StringBuilder sb = new StringBuilder("SummarizerOptions{targetVersion=");
/* 16 */            sb.append(this.targetVersion);
/* 21 */            sb.append(", context=");
/* 24 */            sb.append(strValueOf);
/* 29 */            sb.append(", inputType=");
/* 34 */            sb.append(this.zzb);
/* 39 */            sb.append(", outputType=");
/* 44 */            sb.append(this.zzc);
/* 49 */            sb.append(", language=");
/* 54 */            sb.append(this.zzd);
/* 59 */            sb.append(", longInputAutoTruncationEnabled=");
/* 66 */            return IIlIOloOOO.I0010o(sb, this.zze, "}");
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzd;
                }

                @Override
                public final int zzc() {
/* 1 */             return this.zzc;
                }

                @Override
                public final Context zzd() {
/* 1 */             return this.zza;
                }

                @Override
                public final boolean zze() {
/* 1 */             return this.zze;
                }
            }
