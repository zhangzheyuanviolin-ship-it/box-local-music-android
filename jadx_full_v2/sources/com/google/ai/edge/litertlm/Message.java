            package com.google.ai.edge.litertlm;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1IoiO1l;
            import p000.IiO0I1oi0;
            import p000.Il01100l;
            import p000.Il011I1OiO0I;
            import p000.O01I0il01001;
            import p000.O01l0lO0li;
            
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000  2\u00020\u0001:\u0001 BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/google/ai/edge/litertlm/Message;", "", "Lcom/google/ai/edge/litertlm/Role;", "role", "Lcom/google/ai/edge/litertlm/Contents;", "contents", "", "Lcom/google/ai/edge/litertlm/ToolCall;", "toolCalls", "", "", "channels", "<init>", "(Lcom/google/ai/edge/litertlm/Role;Lcom/google/ai/edge/litertlm/Contents;Ljava/util/List;Ljava/util/Map;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "toString", "()Ljava/lang/String;", "Lcom/google/ai/edge/litertlm/Role;", "getRole", "()Lcom/google/ai/edge/litertlm/Role;", "Lcom/google/ai/edge/litertlm/Contents;", "getContents", "()Lcom/google/ai/edge/litertlm/Contents;", "Ljava/util/List;", "getToolCalls", "()Ljava/util/List;", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "Companion", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Message {

                public static final Companion INSTANCE = new Companion(null);
                private final Map<String, String> channels;
                private final Contents contents;
                private final Role role;
                private final List<ToolCall> toolCalls;

                public Message(Role role, Contents contents, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 23 */            this(role, (i & 2) != 0 ? Contents.INSTANCE.m13x642e38ed() : contents, (i & 4) != 0 ? Il01100l.I00iOIl : list, (i & 8) != 0 ? Il011I1OiO0I.I00iOIl : map);
                }

                public final Map<String, String> getChannels() {
/* 1 */             return this.channels;
                }

                public final Contents getContents() {
/* 1 */             return this.contents;
                }

                public final Role getRole() {
/* 1 */             return this.role;
                }

                public final List<ToolCall> getToolCalls() {
/* 1 */             return this.toolCalls;
                }

                public final O01l0lO0li m14x6d7146a3() {
/* 3 */             O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 14 */            o01l0lO0li.I0001Ioi1lo("role", this.role.getValue());
/* 29 */            if (!this.contents.getContents().isEmpty()) {
/* 39 */                o01l0lO0li.I0000oI00("content", this.contents.m12x6d7146a3());
                    }
/* 50 */            if (!this.toolCalls.isEmpty()) {
/* 54 */                O01I0il01001 o01I0il01001 = new O01I0il01001();
/* 59 */                Iterator<ToolCall> it = this.toolCalls.iterator();
/* 67 */                while (it.hasNext()) {
/* 79 */                    o01I0il01001.I0000oI00(it.next().m15x6d7146a3());
                        }
/* 85 */                o01l0lO0li.I0000oI00("tool_calls", o01I0il01001);
                    }
/* 94 */            if (!this.channels.isEmpty()) {
/* 98 */                O01l0lO0li o01l0lO0li2 = new O01l0lO0li();
/* 115 */               for (Map.Entry<String, String> entry : this.channels.entrySet()) {
/* 135 */                   o01l0lO0li2.I0001Ioi1lo(entry.getKey(), entry.getValue());
                        }
/* 141 */               o01l0lO0li.I0000oI00("channels", o01l0lO0li2);
                    }
/* 245 */           return o01l0lO0li;
                }

                public String toString() {
/* 3 */             return this.contents.toString();
                }

                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J6\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J!\u0010\u0012\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\rH\u0007¨\u0006\u0016"}, d2 = {"Lcom/google/ai/edge/litertlm/Message$Companion;", "", "<init>", "()V", "system", "Lcom/google/ai/edge/litertlm/Message;", "text", "", "contents", "Lcom/google/ai/edge/litertlm/Contents;", "user", "model", "toolCalls", "", "Lcom/google/ai/edge/litertlm/ToolCall;", "channels", "", "tool", "of", "", "Lcom/google/ai/edge/litertlm/Content;", "([Lcom/google/ai/edge/litertlm/Content;)Lcom/google/ai/edge/litertlm/Message;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static Message model$default(Companion companion, Contents contents, List list, Map map, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 7 */                     contents = Contents.INSTANCE.m13x642e38ed();
                        }
/* 13 */                if ((i & 2) != 0) {
/* 15 */                    list = Il01100l.I00iOIl;
                        }
/* 19 */                if ((i & 4) != 0) {
/* 21 */                    map = Il011I1OiO0I.I00iOIl;
                        }
/* 23 */                return companion.model(contents, list, map);
                    }

                    public final Message model(String text) {
/* 12 */                return model$default(this, Contents.INSTANCE.of(text), null, null, 6, null);
                    }

                    @IiO0I1oi0
                    public final Message of(Content... contents) {
/* 11 */                return user(Contents.INSTANCE.of(I1IoiO1l.I00IioO0OiOi(contents)));
                    }

                    public final Message system(Contents contents) {
/* 11 */                return new Message(Role.SYSTEM, contents, null, null, 12, null);
                    }

                    public final Message tool(Contents contents) {
/* 11 */                return new Message(Role.TOOL, contents, null, null, 12, null);
                    }

                    public final Message user(Contents contents) {
/* 11 */                return new Message(Role.USER, contents, null, null, 12, null);
                    }

/* 4 */             private Companion() {
                    }

/* 14 */            public final Message system(String text) {
/* 15 */                return system(Contents.INSTANCE.of(text));
                    }

/* 14 */            public final Message user(String text) {
/* 15 */                return user(Contents.INSTANCE.of(text));
                    }

                    @IiO0I1oi0
/* 15 */            public final Message of(String text) {
/* 16 */                return user(text);
                    }

/* 16 */            public final Message model(Contents contents, List<ToolCall> toolCalls, Map<String, String> channels) {
/* 17 */                return new Message(Role.MODEL, contents, toolCalls, channels);
                    }

                    @IiO0I1oi0
/* 16 */            public final Message of(List<? extends Content> contents) {
/* 17 */                return user(Contents.INSTANCE.of(contents));
                    }
                }

/* 26 */        public Message(Role role, Contents contents, List<ToolCall> list, Map<String, String> map) {
/* 28 */            this.role = role;
/* 29 */            this.contents = contents;
/* 30 */            this.toolCalls = list;
/* 31 */            this.channels = map;
                }
            }
