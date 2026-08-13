            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/ai/edge/litertlm/SessionConfig;", "", "samplerConfig", "Lcom/google/ai/edge/litertlm/SamplerConfig;", "<init>", "(Lcom/google/ai/edge/litertlm/SamplerConfig;)V", "getSamplerConfig", "()Lcom/google/ai/edge/litertlm/SamplerConfig;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 8 */     public final class SessionConfig {
                private final SamplerConfig samplerConfig;

                public SessionConfig(SamplerConfig samplerConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this((i & 1) != 0 ? null : samplerConfig);
                }

                public static SessionConfig copy$default(SessionConfig sessionConfig, SamplerConfig samplerConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 samplerConfig = sessionConfig.samplerConfig;
                    }
/* 7 */             return sessionConfig.copy(samplerConfig);
                }

                public final SamplerConfig getSamplerConfig() {
/* 1 */             return this.samplerConfig;
                }

                public final SessionConfig copy(SamplerConfig samplerConfig) {
/* 3 */             return new SessionConfig(samplerConfig);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof SessionConfig) && O0000Ioio00.I0000O(this.samplerConfig, ((SessionConfig) other).samplerConfig);
                }

                public final SamplerConfig getSamplerConfig() {
/* 1 */             return this.samplerConfig;
                }

                public int hashCode() {
/* 1 */             SamplerConfig samplerConfig = this.samplerConfig;
/* 3 */             if (samplerConfig == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return samplerConfig.hashCode();
                }

                public String toString() {
/* 18 */            return "SessionConfig(samplerConfig=" + this.samplerConfig + ")";
                }

/* 9 */         public SessionConfig(SamplerConfig samplerConfig) {
                    this.samplerConfig = samplerConfig;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 10 */        public SessionConfig() {
/* 11 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
