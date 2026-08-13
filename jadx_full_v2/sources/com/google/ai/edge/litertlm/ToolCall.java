            package com.google.ai.edge.litertlm;

            import java.util.Map;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.O01l0lO0li;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/google/ai/edge/litertlm/ToolCall;", "", "", "name", "", "arguments", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/google/ai/edge/litertlm/ToolCall;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "getArguments", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ToolCall {
                private final Map<String, Object> arguments;
                private final String name;

                public ToolCall(String str, Map<String, ? extends Object> map) {
/* 4 */             this.name = str;
/* 6 */             this.arguments = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static ToolCall copy$default(ToolCall toolCall, String str, Map map, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = toolCall.name;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                map = toolCall.arguments;
                    }
/* 13 */            return toolCall.copy(str, map);
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final Map<String, Object> component2() {
/* 1 */             return this.arguments;
                }

                public final ToolCall copy(String name, Map<String, ? extends Object> arguments) {
/* 3 */             return new ToolCall(name, arguments);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ToolCall)) {
/* 7 */                 return false;
                    }
/* 11 */            ToolCall toolCall = (ToolCall) other;
                    return O0000Ioio00.I0000O(this.name, toolCall.name) && O0000Ioio00.I0000O(this.arguments, toolCall.arguments);
                }

                public final Map<String, Object> getArguments() {
/* 1 */             return this.arguments;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public int hashCode() {
/* 15 */            return this.arguments.hashCode() + (this.name.hashCode() * 31);
                }

                public final O01l0lO0li m15x6d7146a3() {
/* 3 */             O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */            o01l0lO0li.I0001Ioi1lo("type", "function");
/* 15 */            O01l0lO0li o01l0lO0li2 = new O01l0lO0li();
/* 22 */            o01l0lO0li2.I0001Ioi1lo("name", this.name);
/* 33 */            o01l0lO0li2.I0000oI00("arguments", JsonConvertersKt.toJsonObject(this.arguments));
/* 36 */            o01l0lO0li.I0000oI00("function", o01l0lO0li2);
/* 55 */            return o01l0lO0li;
                }

                public String toString() {
/* 28 */            return "ToolCall(name=" + this.name + ", arguments=" + this.arguments + ")";
                }
            }
