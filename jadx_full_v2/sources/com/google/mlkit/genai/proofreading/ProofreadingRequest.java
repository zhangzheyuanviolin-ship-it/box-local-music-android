            package com.google.mlkit.genai.proofreading;

            import com.google.mlkit.genai.common.BaseRequest;
            
            public abstract class ProofreadingRequest extends BaseRequest {

                public static abstract class Builder {
                    public abstract ProofreadingRequest build();

                    public abstract Builder zza(int i);
                }

                public static Builder builder(String str) {
/* 3 */             zzc zzcVar = new zzc();
/* 6 */             zzcVar.zzb(str);
/* 10 */            zzcVar.zza(0);
/* 49 */            return zzcVar;
                }

                public abstract int zza();

                public abstract String zzb();
            }
