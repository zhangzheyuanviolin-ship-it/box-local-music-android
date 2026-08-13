            package com.google.mlkit.genai.prompt;

            import kotlin.Metadata;
            import p000.IIlIOloOOO;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/prompt/SystemInstruction;", "Lcom/google/mlkit/genai/prompt/Part;", "textString", "", "<init>", "(Ljava/lang/String;)V", "getTextString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SystemInstruction extends Part {
                private final String zza;

                public SystemInstruction(String str) {
/* 2 */             super(null);
/* 5 */             this.zza = str;
                }

                public final String getZza() {
/* 1 */             return this.zza;
                }

                public final SystemInstruction copy(String textString) {
/* 3 */             return new SystemInstruction(textString);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SystemInstruction) && O0000Ioio00.I0000O(this.zza, ((SystemInstruction) other).zza);
                }

                public final String getTextString() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public String toString() {
/* 1 */             String str = this.zza;
/* 22 */            return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 30), "SystemInstruction(textString=", str, ")");
                }
            }
