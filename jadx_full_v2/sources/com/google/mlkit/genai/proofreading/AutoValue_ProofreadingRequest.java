            package com.google.mlkit.genai.proofreading;

            import p000.IIl001iO0Io;
            
            final class AutoValue_ProofreadingRequest extends ProofreadingRequest {
                private final Integer overrideRequestKind = null;
                private final String zza;

                public AutoValue_ProofreadingRequest(Integer num, String str, int i, zzd zzdVar) {
/* 7 */             this.zza = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ProofreadingRequest) {
/* 10 */                ProofreadingRequest proofreadingRequest = (ProofreadingRequest) obj;
/* 12 */                Integer num = this.overrideRequestKind;
/* 14 */                if (num != null ? num.equals(proofreadingRequest.getOverrideRequestKind()) : proofreadingRequest.getOverrideRequestKind() == null) {
/* 43 */                    if (this.zza.equals(proofreadingRequest.zzb())) {
/* 45 */                        proofreadingRequest.zza();
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
/* 5 */             StringBuilder sb = new StringBuilder("ProofreadingRequest{overrideRequestKind=");
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
