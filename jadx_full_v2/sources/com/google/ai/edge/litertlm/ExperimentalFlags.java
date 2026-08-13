            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/google/ai/edge/litertlm/ExperimentalFlags;", "", "<init>", "()V", "enableBenchmark", "", "getEnableBenchmark", "()Z", "setEnableBenchmark", "(Z)V", "enableSpeculativeDecoding", "getEnableSpeculativeDecoding", "()Ljava/lang/Boolean;", "setEnableSpeculativeDecoding", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableConversationConstrainedDecoding", "getEnableConversationConstrainedDecoding", "setEnableConversationConstrainedDecoding", "convertCamelToSnakeCaseInToolDescription", "getConvertCamelToSnakeCaseInToolDescription", "setConvertCamelToSnakeCaseInToolDescription", "filterChannelContentFromKvCache", "getFilterChannelContentFromKvCache", "setFilterChannelContentFromKvCache", "overwritePromptTemplate", "", "getOverwritePromptTemplate", "()Ljava/lang/String;", "setOverwritePromptTemplate", "(Ljava/lang/String;)V", "visualTokenBudget", "", "getVisualTokenBudget", "()Ljava/lang/Integer;", "setVisualTokenBudget", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ExperimentalFlags {
                public static final ExperimentalFlags INSTANCE = new ExperimentalFlags();
                private static boolean convertCamelToSnakeCaseInToolDescription = true;
                private static boolean enableBenchmark;
                private static boolean enableConversationConstrainedDecoding;
                private static Boolean enableSpeculativeDecoding;
                private static boolean filterChannelContentFromKvCache;
                private static String overwritePromptTemplate;
                private static Integer visualTokenBudget;

                private ExperimentalFlags() {
                }

                public final boolean getConvertCamelToSnakeCaseInToolDescription() {
/* 1 */             return convertCamelToSnakeCaseInToolDescription;
                }

                public final boolean getEnableBenchmark() {
/* 1 */             return enableBenchmark;
                }

                public final boolean getEnableConversationConstrainedDecoding() {
/* 1 */             return enableConversationConstrainedDecoding;
                }

                public final Boolean getEnableSpeculativeDecoding() {
/* 1 */             return enableSpeculativeDecoding;
                }

                public final boolean getFilterChannelContentFromKvCache() {
/* 1 */             return filterChannelContentFromKvCache;
                }

                public final String getOverwritePromptTemplate() {
/* 1 */             return overwritePromptTemplate;
                }

                public final Integer getVisualTokenBudget() {
/* 1 */             return visualTokenBudget;
                }

                public final void setConvertCamelToSnakeCaseInToolDescription(boolean z) {
/* 1 */             convertCamelToSnakeCaseInToolDescription = z;
                }

                public final void setEnableBenchmark(boolean z) {
/* 1 */             enableBenchmark = z;
                }

                public final void setEnableConversationConstrainedDecoding(boolean z) {
/* 1 */             enableConversationConstrainedDecoding = z;
                }

                public final void setEnableSpeculativeDecoding(Boolean bool) {
/* 1 */             enableSpeculativeDecoding = bool;
                }

                public final void setFilterChannelContentFromKvCache(boolean z) {
/* 1 */             filterChannelContentFromKvCache = z;
                }

                public final void setOverwritePromptTemplate(String str) {
/* 1 */             overwritePromptTemplate = str;
                }

                public final void setVisualTokenBudget(Integer num) {
/* 1 */             visualTokenBudget = num;
                }
            }
