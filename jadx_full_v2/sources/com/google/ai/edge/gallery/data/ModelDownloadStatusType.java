            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_DOWNLOADED", "PARTIALLY_DOWNLOADED", "IN_PROGRESS", "UNZIPPING", "SUCCEEDED", "FAILED", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ModelDownloadStatusType {
                private static final Il0lIli0 $ENTRIES;
                private static final ModelDownloadStatusType[] $VALUES;
                public static final ModelDownloadStatusType NOT_DOWNLOADED = new ModelDownloadStatusType("NOT_DOWNLOADED", 0);
                public static final ModelDownloadStatusType PARTIALLY_DOWNLOADED = new ModelDownloadStatusType("PARTIALLY_DOWNLOADED", 1);
                public static final ModelDownloadStatusType IN_PROGRESS = new ModelDownloadStatusType("IN_PROGRESS", 2);
                public static final ModelDownloadStatusType UNZIPPING = new ModelDownloadStatusType("UNZIPPING", 3);
                public static final ModelDownloadStatusType SUCCEEDED = new ModelDownloadStatusType("SUCCEEDED", 4);
                public static final ModelDownloadStatusType FAILED = new ModelDownloadStatusType("FAILED", 5);

                private static final ModelDownloadStatusType[] $values() {
/* 13 */            return new ModelDownloadStatusType[]{NOT_DOWNLOADED, PARTIALLY_DOWNLOADED, IN_PROGRESS, UNZIPPING, SUCCEEDED, FAILED};
                }

                static {
/* 61 */            ModelDownloadStatusType[] modelDownloadStatusTypeArr$values = $values();
/* 65 */            $VALUES = modelDownloadStatusTypeArr$values;
/* 71 */            $ENTRIES = ilIII1o11.I00000oIO(modelDownloadStatusTypeArr$values);
                }

                private ModelDownloadStatusType(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static ModelDownloadStatusType valueOf(String str) {
/* 7 */             return (ModelDownloadStatusType) Enum.valueOf(ModelDownloadStatusType.class, str);
                }

                public static ModelDownloadStatusType[] values() {
/* 7 */             return (ModelDownloadStatusType[]) $VALUES.clone();
                }
            }
