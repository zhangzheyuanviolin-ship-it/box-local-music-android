            package com.google.mlkit.genai.rewriting;

            import p000.IIl001iO0Io;
            
            final class AutoValue_RewritingRequest extends RewritingRequest {
                private final Integer overrideRequestKind = null;
                private final String zza;

                public AutoValue_RewritingRequest(Integer num, String str, int i, zzd zzdVar) {
/* 7 */             this.zza = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof RewritingRequest) {
/* 10 */                RewritingRequest rewritingRequest = (RewritingRequest) obj;
/* 12 */                Integer num = this.overrideRequestKind;
/* 14 */                if (num != null ? num.equals(rewritingRequest.getOverrideRequestKind()) : rewritingRequest.getOverrideRequestKind() == null) {
/* 43 */                    if (this.zza.equals(rewritingRequest.zzb())) {
/* 45 */                        rewritingRequest.zza();
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
/* 23 */            return (this.zza.hashCode() ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003)) * 1000003;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("RewritingRequest{overrideRequestKind=");
/* 10 */            sb.append(this.overrideRequestKind);
/* 15 */            sb.append(", text=");
/* 22 */            return IIl001iO0Io.I00100l0(sb, this.zza, ", maxDecodeSteps=0}");
                }

                @Override
                public final int zza() {
/* 1 */             return 0;
                }

                @Override
                public final String zzb() {
/* 1 */             return this.zza;
                }
            }
