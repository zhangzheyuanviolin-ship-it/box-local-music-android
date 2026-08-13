            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/k2fsa/sherpa/onnx/EndpointConfig;", "", "rule1", "Lcom/k2fsa/sherpa/onnx/EndpointRule;", "rule2", "rule3", "(Lcom/k2fsa/sherpa/onnx/EndpointRule;Lcom/k2fsa/sherpa/onnx/EndpointRule;Lcom/k2fsa/sherpa/onnx/EndpointRule;)V", "getRule1", "()Lcom/k2fsa/sherpa/onnx/EndpointRule;", "setRule1", "(Lcom/k2fsa/sherpa/onnx/EndpointRule;)V", "getRule2", "setRule2", "getRule3", "setRule3", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 41 */    public final class EndpointConfig {
                private EndpointRule rule1;
                private EndpointRule rule2;
                private EndpointRule rule3;

                public EndpointConfig(EndpointRule endpointRule, EndpointRule endpointRule2, EndpointRule endpointRule3, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 39 */            this((i & 1) != 0 ? new EndpointRule(false, 2.4f, 0.0f) : endpointRule, (i & 2) != 0 ? new EndpointRule(true, 1.4f, 0.0f) : endpointRule2, (i & 4) != 0 ? new EndpointRule(false, 0.0f, 20.0f) : endpointRule3);
                }

                public static EndpointConfig copy$default(EndpointConfig endpointConfig, EndpointRule endpointRule, EndpointRule endpointRule2, EndpointRule endpointRule3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 endpointRule = endpointConfig.rule1;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                endpointRule2 = endpointConfig.rule2;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                endpointRule3 = endpointConfig.rule3;
                    }
/* 19 */            return endpointConfig.copy(endpointRule, endpointRule2, endpointRule3);
                }

                public final EndpointRule getRule1() {
/* 1 */             return this.rule1;
                }

                public final EndpointRule getRule2() {
/* 1 */             return this.rule2;
                }

                public final EndpointRule getRule3() {
/* 1 */             return this.rule3;
                }

                public final EndpointConfig copy(EndpointRule rule1, EndpointRule rule2, EndpointRule rule3) {
/* 3 */             return new EndpointConfig(rule1, rule2, rule3);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof EndpointConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            EndpointConfig endpointConfig = (EndpointConfig) other;
                    return O0000Ioio00.I0000O(this.rule1, endpointConfig.rule1) && O0000Ioio00.I0000O(this.rule2, endpointConfig.rule2) && O0000Ioio00.I0000O(this.rule3, endpointConfig.rule3);
                }

                public final EndpointRule getRule1() {
/* 1 */             return this.rule1;
                }

                public final EndpointRule getRule2() {
/* 1 */             return this.rule2;
                }

                public final EndpointRule getRule3() {
/* 1 */             return this.rule3;
                }

                public int hashCode() {
/* 24 */            return this.rule3.hashCode() + ((this.rule2.hashCode() + (this.rule1.hashCode() * 31)) * 31);
                }

                public final void setRule1(EndpointRule endpointRule) {
/* 1 */             this.rule1 = endpointRule;
                }

                public final void setRule2(EndpointRule endpointRule) {
/* 1 */             this.rule2 = endpointRule;
                }

                public final void setRule3(EndpointRule endpointRule) {
/* 1 */             this.rule3 = endpointRule;
                }

                public String toString() {
/* 38 */            return "EndpointConfig(rule1=" + this.rule1 + ", rule2=" + this.rule2 + ", rule3=" + this.rule3 + ')';
                }

/* 42 */        public EndpointConfig(EndpointRule endpointRule, EndpointRule endpointRule2, EndpointRule endpointRule3) {
/* 44 */            this.rule1 = endpointRule;
/* 45 */            this.rule2 = endpointRule2;
/* 46 */            this.rule3 = endpointRule3;
                }

/* 46 */        public EndpointConfig() {
/* 47 */            this(null, null, null, 7, null);
                }
            }
