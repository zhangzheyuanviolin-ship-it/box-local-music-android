            package com.google.mlkit.genai.summarization;

            import android.content.Context;
            import com.google.mlkit.genai.summarization.SummarizerOptions;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zzd extends SummarizerOptions.Builder {
                private Context zza;
                private int zzb;
                private int zzc;
                private int zzd;
                private boolean zze;
                private byte zzf;

                @Override
                public final SummarizerOptions build() {
                    Context context;
/* 5 */             if (this.zzf == 15 && (context = this.zza) != null) {
/* 24 */                return new AutoValue_SummarizerOptions(null, context, this.zzb, this.zzc, this.zzd, this.zze, null);
                    }
/* 30 */            StringBuilder sb = new StringBuilder();
/* 35 */            if (this.zza == null) {
/* 39 */                sb.append(" context");
                    }
/* 46 */            if ((this.zzf & 1) == 0) {
/* 50 */                sb.append(" inputType");
                    }
/* 57 */            if ((this.zzf & 2) == 0) {
/* 61 */                sb.append(" outputType");
                    }
/* 68 */            if ((this.zzf & 4) == 0) {
/* 72 */                sb.append(" language");
                    }
/* 79 */            if ((this.zzf & 8) == 0) {
/* 83 */                sb.append(" longInputAutoTruncationEnabled");
                    }
/* 96 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 99 */            return null;
                }

                @Override
                public final SummarizerOptions.Builder setInputType(int i) {
/* 1 */             this.zzb = i;
/* 8 */             this.zzf = (byte) (this.zzf | 1);
/* 49 */            return this;
                }

                @Override
                public final SummarizerOptions.Builder setLanguage(int i) {
/* 1 */             this.zzd = i;
/* 8 */             this.zzf = (byte) (this.zzf | 4);
/* 49 */            return this;
                }

                @Override
                public final SummarizerOptions.Builder setLongInputAutoTruncationEnabled(boolean z) {
/* 1 */             this.zze = z;
/* 8 */             this.zzf = (byte) (this.zzf | 8);
/* 49 */            return this;
                }

                @Override
                public final SummarizerOptions.Builder setOutputType(int i) {
/* 1 */             this.zzc = i;
/* 8 */             this.zzf = (byte) (this.zzf | 2);
/* 49 */            return this;
                }

                public final SummarizerOptions.Builder zza(Context context) {
/* 1 */             if (context != null) {
/* 3 */                 this.zza = context;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null context");
/* 11 */            return null;
                }
            }
