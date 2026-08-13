            package com.google.mlkit.genai.rewriting;

            import android.content.Context;
            import com.google.mlkit.genai.rewriting.RewriterOptions;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zza extends RewriterOptions.Builder {
                private Context zza;
                private int zzb;
                private int zzc;
                private byte zzd;

                @Override
                public final RewriterOptions build() {
                    Context context;
/* 4 */             if (this.zzd == 3 && (context = this.zza) != null) {
/* 19 */                return new AutoValue_RewriterOptions(null, context, this.zzb, this.zzc, null);
                    }
/* 25 */            StringBuilder sb = new StringBuilder();
/* 30 */            if (this.zza == null) {
/* 34 */                sb.append(" context");
                    }
/* 41 */            if ((this.zzd & 1) == 0) {
/* 45 */                sb.append(" outputType");
                    }
/* 52 */            if ((this.zzd & 2) == 0) {
/* 56 */                sb.append(" language");
                    }
/* 69 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 72 */            return null;
                }

                @Override
                public final RewriterOptions.Builder setLanguage(int i) {
/* 1 */             this.zzc = i;
/* 8 */             this.zzd = (byte) (this.zzd | 2);
/* 49 */            return this;
                }

                @Override
                public final RewriterOptions.Builder setOutputType(int i) {
/* 1 */             this.zzb = i;
/* 8 */             this.zzd = (byte) (this.zzd | 1);
/* 49 */            return this;
                }

                public final RewriterOptions.Builder zza(Context context) {
/* 1 */             if (context != null) {
/* 3 */                 this.zza = context;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null context");
/* 11 */            return null;
                }
            }
