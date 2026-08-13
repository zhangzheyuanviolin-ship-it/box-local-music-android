            package com.google.mlkit.genai.summarization;

            import com.google.mlkit.genai.summarization.SummarizationRequest;
            import p000.I000II;
            import p000.IOOlIIilOl0;
            
            final class zza extends SummarizationRequest.Builder {
                private String zza;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final SummarizationRequest build() {
/* 1 */             String str = this.zza;
/* 3 */             if (str != null) {
/* 8 */                 return new AutoValue_SummarizationRequest(null, str, 0 == true ? 1 : 0);
                    }
/* 14 */            I000II.I001IO000("Missing required properties: text");
/* 17 */            return null;
                }

                public final SummarizationRequest.Builder zza(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.zza = str;
/* 5 */                 return this;
                    }
/* 8 */             IOOlIIilOl0.I000II("Null text");
/* 11 */            return null;
                }
            }
