            package com.google.mlkit.genai.summarization;

            import com.google.mlkit.genai.common.BaseRequest;
            
            public abstract class SummarizationRequest extends BaseRequest {

                public static abstract class Builder {
                    public abstract SummarizationRequest build();
                }

                public static Builder builder(String str) {
/* 3 */             zza zzaVar = new zza();
/* 6 */             zzaVar.zza(str);
/* 49 */            return zzaVar;
                }

                public abstract String zza();
            }
