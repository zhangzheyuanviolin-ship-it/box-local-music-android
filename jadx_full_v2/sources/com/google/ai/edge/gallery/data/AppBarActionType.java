            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/gallery/data/AppBarActionType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "APP_SETTING", "DOWNLOAD_MANAGER", "NAVIGATE_UP", "MENU", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class AppBarActionType {
                private static final Il0lIli0 $ENTRIES;
                private static final AppBarActionType[] $VALUES;
                public static final AppBarActionType NO_ACTION = new AppBarActionType("NO_ACTION", 0);
                public static final AppBarActionType APP_SETTING = new AppBarActionType("APP_SETTING", 1);
                public static final AppBarActionType DOWNLOAD_MANAGER = new AppBarActionType("DOWNLOAD_MANAGER", 2);
                public static final AppBarActionType NAVIGATE_UP = new AppBarActionType("NAVIGATE_UP", 3);
                public static final AppBarActionType MENU = new AppBarActionType("MENU", 4);

                private static final AppBarActionType[] $values() {
/* 11 */            return new AppBarActionType[]{NO_ACTION, APP_SETTING, DOWNLOAD_MANAGER, NAVIGATE_UP, MENU};
                }

                static {
/* 51 */            AppBarActionType[] appBarActionTypeArr$values = $values();
/* 55 */            $VALUES = appBarActionTypeArr$values;
/* 61 */            $ENTRIES = ilIII1o11.I00000oIO(appBarActionTypeArr$values);
                }

                private AppBarActionType(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static AppBarActionType valueOf(String str) {
/* 7 */             return (AppBarActionType) Enum.valueOf(AppBarActionType.class, str);
                }

                public static AppBarActionType[] values() {
/* 7 */             return (AppBarActionType[]) $VALUES.clone();
                }
            }
