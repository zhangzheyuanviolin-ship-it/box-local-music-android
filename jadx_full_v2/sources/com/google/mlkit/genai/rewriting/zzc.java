            package com.google.mlkit.genai.rewriting;

            import com.google.mlkit.genai.rewriting.RewritingRequest;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zzc extends RewritingRequest.Builder {
                private String zza;
                private byte zzb;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final RewritingRequest build() {
                    String str;
/* 4 */             Integer num = null;
/* 4 */             Object[] objArr = 0;
/* 5 */             if (this.zzb == 1 && (str = this.zza) != null) {
/* 15 */                return new AutoValue_RewritingRequest(num, str, 0, objArr == true ? 1 : 0);
                    }
/* 21 */            StringBuilder sb = new StringBuilder();
/* 26 */            if (this.zza == null) {
/* 30 */                sb.append(" text");
                    }
/* 35 */            if (this.zzb == 0) {
/* 39 */                sb.append(" maxDecodeSteps");
                    }
/* 52 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 4 */             return null;
                }

                @Override
                public final RewritingRequest.Builder zza(int i) {
/* 2 */             this.zzb = (byte) 1;
/* 49 */            return this;
                }

                public final RewritingRequest.Builder zzb(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.zza = str;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null text");
/* 11 */            return null;
                }
            }
