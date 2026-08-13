            package com.google.ai.edge.litertlm;

            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.Il01100l;
            import p000.Il011I1OiO0I;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0003Js\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0001J\u0014\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/google/ai/edge/litertlm/ConversationConfig;", "", "systemInstruction", "Lcom/google/ai/edge/litertlm/Contents;", "initialMessages", "", "Lcom/google/ai/edge/litertlm/Message;", "tools", "Lcom/google/ai/edge/litertlm/ToolProvider;", "samplerConfig", "Lcom/google/ai/edge/litertlm/SamplerConfig;", "automaticToolCalling", "", "channels", "Lcom/google/ai/edge/litertlm/Channel;", "extraContext", "", "", "<init>", "(Lcom/google/ai/edge/litertlm/Contents;Ljava/util/List;Ljava/util/List;Lcom/google/ai/edge/litertlm/SamplerConfig;ZLjava/util/List;Ljava/util/Map;)V", "getSystemInstruction", "()Lcom/google/ai/edge/litertlm/Contents;", "getInitialMessages", "()Ljava/util/List;", "getTools", "getSamplerConfig", "()Lcom/google/ai/edge/litertlm/SamplerConfig;", "getAutomaticToolCalling", "()Z", "getChannels", "getExtraContext", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 42 */    public final class ConversationConfig {
                private final boolean automaticToolCalling;
                private final List<Channel> channels;
                private final Map<String, Object> extraContext;
                private final List<Message> initialMessages;
                private final SamplerConfig samplerConfig;
                private final Contents systemInstruction;
                private final List<ToolProvider> tools;

                /* JADX WARN: Illegal instructions before constructor call */
                public ConversationConfig(Contents contents, List list, List list2, SamplerConfig samplerConfig, boolean z, List list3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             contents = (i & 1) != 0 ? null : contents;
/* 7 */             int i2 = i & 2;
/* 9 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 40 */            this(contents, i2 != 0 ? il01100l : list, (i & 4) != 0 ? il01100l : list2, (i & 8) != 0 ? null : samplerConfig, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? Il011I1OiO0I.I00iOIl : map);
                }

                public static ConversationConfig copy$default(ConversationConfig conversationConfig, Contents contents, List list, List list2, SamplerConfig samplerConfig, boolean z, List list3, Map map, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 contents = conversationConfig.systemInstruction;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                list = conversationConfig.initialMessages;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                list2 = conversationConfig.tools;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                samplerConfig = conversationConfig.samplerConfig;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                z = conversationConfig.automaticToolCalling;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                list3 = conversationConfig.channels;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                map = conversationConfig.extraContext;
                    }
/* 43 */            List list4 = list3;
/* 44 */            Map map2 = map;
/* 46 */            boolean z2 = z;
/* 48 */            List list5 = list2;
/* 51 */            return conversationConfig.copy(contents, list, list5, samplerConfig, z2, list4, map2);
                }

                public final Contents getSystemInstruction() {
/* 1 */             return this.systemInstruction;
                }

                public final List<Message> component2() {
/* 1 */             return this.initialMessages;
                }

                public final List<ToolProvider> component3() {
/* 1 */             return this.tools;
                }

                public final SamplerConfig getSamplerConfig() {
/* 1 */             return this.samplerConfig;
                }

                public final boolean getAutomaticToolCalling() {
/* 1 */             return this.automaticToolCalling;
                }

                public final List<Channel> component6() {
/* 1 */             return this.channels;
                }

                public final Map<String, Object> component7() {
/* 1 */             return this.extraContext;
                }

                public final ConversationConfig copy(Contents systemInstruction, List<Message> initialMessages, List<? extends ToolProvider> tools, SamplerConfig samplerConfig, boolean automaticToolCalling, List<Channel> channels, Map<String, ? extends Object> extraContext) {
/* 3 */             return new ConversationConfig(systemInstruction, initialMessages, tools, samplerConfig, automaticToolCalling, channels, extraContext);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ConversationConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            ConversationConfig conversationConfig = (ConversationConfig) other;
                    return O0000Ioio00.I0000O(this.systemInstruction, conversationConfig.systemInstruction) && O0000Ioio00.I0000O(this.initialMessages, conversationConfig.initialMessages) && O0000Ioio00.I0000O(this.tools, conversationConfig.tools) && O0000Ioio00.I0000O(this.samplerConfig, conversationConfig.samplerConfig) && this.automaticToolCalling == conversationConfig.automaticToolCalling && O0000Ioio00.I0000O(this.channels, conversationConfig.channels) && O0000Ioio00.I0000O(this.extraContext, conversationConfig.extraContext);
                }

                public final boolean getAutomaticToolCalling() {
/* 1 */             return this.automaticToolCalling;
                }

                public final List<Channel> getChannels() {
/* 1 */             return this.channels;
                }

                public final Map<String, Object> getExtraContext() {
/* 1 */             return this.extraContext;
                }

                public final List<Message> getInitialMessages() {
/* 1 */             return this.initialMessages;
                }

                public final SamplerConfig getSamplerConfig() {
/* 1 */             return this.samplerConfig;
                }

                public final Contents getSystemInstruction() {
/* 1 */             return this.systemInstruction;
                }

                public final List<ToolProvider> getTools() {
/* 1 */             return this.tools;
                }

                public int hashCode() {
/* 1 */             Contents contents = this.systemInstruction;
/* 23 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000oI00((contents == null ? 0 : contents.hashCode()) * 31, 31, this.initialMessages), 31, this.tools);
/* 27 */            SamplerConfig samplerConfig = this.samplerConfig;
/* 41 */            int iI000OOo1O = Oi010OO0.I000OOo1O((iI0000oI00 + (samplerConfig == null ? 0 : samplerConfig.hashCode())) * 31, 31, this.automaticToolCalling);
/* 45 */            List<Channel> list = this.channels;
/* 62 */            return this.extraContext.hashCode() + ((iI000OOo1O + (list != null ? list.hashCode() : 0)) * 31);
                }

                public String toString() {
/* 78 */            return "ConversationConfig(systemInstruction=" + this.systemInstruction + ", initialMessages=" + this.initialMessages + ", tools=" + this.tools + ", samplerConfig=" + this.samplerConfig + ", automaticToolCalling=" + this.automaticToolCalling + ", channels=" + this.channels + ", extraContext=" + this.extraContext + ")";
                }

/* 43 */        public ConversationConfig(Contents contents) {
/* 44 */            this(contents, null, null, null, false, null, null, 126, null);
                }

/* 44 */        public ConversationConfig(Contents contents, List<Message> list) {
/* 45 */            this(contents, list, null, null, false, null, null, 124, null);
                }

/* 45 */        public ConversationConfig(Contents contents, List<Message> list, List<? extends ToolProvider> list2) {
/* 46 */            this(contents, list, list2, null, false, null, null, 120, null);
                }

/* 46 */        public ConversationConfig(Contents contents, List<Message> list, List<? extends ToolProvider> list2, SamplerConfig samplerConfig) {
/* 47 */            this(contents, list, list2, samplerConfig, false, null, null, 112, null);
                }

/* 47 */        public ConversationConfig(Contents contents, List<Message> list, List<? extends ToolProvider> list2, SamplerConfig samplerConfig, boolean z) {
/* 48 */            this(contents, list, list2, samplerConfig, z, null, null, 96, null);
                }

/* 48 */        public ConversationConfig(Contents contents, List<Message> list, List<? extends ToolProvider> list2, SamplerConfig samplerConfig, boolean z, List<Channel> list3) {
/* 49 */            this(contents, list, list2, samplerConfig, z, list3, null, 64, null);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 49 */        public ConversationConfig(Contents contents, List<Message> list, List<? extends ToolProvider> list2, SamplerConfig samplerConfig, boolean z, List<Channel> list3, Map<String, ? extends Object> map) {
/* 51 */            this.systemInstruction = contents;
/* 52 */            this.initialMessages = list;
/* 53 */            this.tools = list2;
/* 54 */            this.samplerConfig = samplerConfig;
/* 55 */            this.automaticToolCalling = z;
/* 56 */            this.channels = list3;
/* 57 */            this.extraContext = map;
                }

/* 57 */        public ConversationConfig() {
/* 58 */            this(null, null, null, null, false, null, null, 127, null);
                }
            }
