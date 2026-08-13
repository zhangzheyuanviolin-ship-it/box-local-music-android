            package com.google.mlkit.genai.proofreading;

            import android.content.Context;
            import p000.IIl001iO0Io;
            
            final class AutoValue_ProofreaderOptions extends ProofreaderOptions {
                private final Integer targetVersion = null;
                private final Context zza;
                private final int zzb;
                private final int zzc;

                public AutoValue_ProofreaderOptions(Integer num, Context context, int i, int i2, zzb zzbVar) {
/* 7 */             this.zza = context;
/* 9 */             this.zzb = i;
/* 11 */            this.zzc = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ProofreaderOptions) {
/* 10 */                ProofreaderOptions proofreaderOptions = (ProofreaderOptions) obj;
/* 12 */                Integer num = this.targetVersion;
/* 14 */                if (num != null ? num.equals(proofreaderOptions.getTargetVersion()) : proofreaderOptions.getTargetVersion() == null) {
/* 43 */                    if (this.zza.equals(proofreaderOptions.zzc()) && this.zzb == proofreaderOptions.zza() && this.zzc == proofreaderOptions.zzb()) {
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
/* 30 */            return this.zzc ^ (((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.zza.hashCode()) * 1000003) ^ this.zzb) * 1000003);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zza);
/* 11 */            StringBuilder sb = new StringBuilder("ProofreaderOptions{targetVersion=");
/* 16 */            sb.append(this.targetVersion);
/* 21 */            sb.append(", context=");
/* 24 */            sb.append(strValueOf);
/* 29 */            sb.append(", inputType=");
/* 34 */            sb.append(this.zzb);
/* 39 */            sb.append(", language=");
/* 46 */            return IIl001iO0Io.I000lI(this.zzc, "}", sb);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzb;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzc;
                }

                @Override
                public final Context zzc() {
/* 1 */             return this.zza;
                }
            }
