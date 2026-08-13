            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import p000.IIlIOloOOO;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/prompt/CountTokensResponse;", "", "totalTokens", "", "<init>", "(I)V", "getTotalTokens", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class CountTokensResponse {
                private final int zza;

                public CountTokensResponse(int i) {
/* 4 */             this.zza = i;
                }

                public final int getZza() {
/* 1 */             return this.zza;
                }

                public final CountTokensResponse copy(int totalTokens) {
/* 3 */             return new CountTokensResponse(totalTokens);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof CountTokensResponse) && this.zza == ((CountTokensResponse) other).zza;
                }

                public final int getTotalTokens() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 3 */             return Integer.hashCode(this.zza);
                }

                public String toString() {
/* 1 */             int i = this.zza;
/* 22 */            return IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 33), "CountTokensResponse(totalTokens=", i, ")");
                }
            }
