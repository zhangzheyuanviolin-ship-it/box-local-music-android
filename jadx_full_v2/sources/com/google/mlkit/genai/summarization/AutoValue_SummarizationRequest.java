            package com.google.mlkit.genai.summarization;

            import p000.IIl001iO0Io;
            
            final class AutoValue_SummarizationRequest extends SummarizationRequest {
                private final Integer overrideRequestKind = null;
                private final String zza;

                public AutoValue_SummarizationRequest(Integer num, String str, zzb zzbVar) {
/* 7 */             this.zza = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof SummarizationRequest) {
/* 10 */                SummarizationRequest summarizationRequest = (SummarizationRequest) obj;
/* 12 */                Integer num = this.overrideRequestKind;
/* 14 */                if (num != null ? num.equals(summarizationRequest.getOverrideRequestKind()) : summarizationRequest.getOverrideRequestKind() == null) {
/* 43 */                    if (this.zza.equals(summarizationRequest.zza())) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                @Override
                public Integer getOverrideRequestKind() {
/* 1 */             return this.overrideRequestKind;
                }

                public final int hashCode() {
/* 1 */             Integer num = this.overrideRequestKind;
/* 22 */            return this.zza.hashCode() ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SummarizationRequest{overrideRequestKind=");
/* 10 */            sb.append(this.overrideRequestKind);
/* 15 */            sb.append(", text=");
/* 22 */            return IIl001iO0Io.I00100l0(sb, this.zza, "}");
                }

                @Override
                public final String zza() {
/* 1 */             return this.zza;
                }
            }
