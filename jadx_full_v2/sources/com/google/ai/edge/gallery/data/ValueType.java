            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/gallery/data/ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "INT", "FLOAT", "DOUBLE", "STRING", "BOOLEAN", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ValueType {
                private static final Il0lIli0 $ENTRIES;
                private static final ValueType[] $VALUES;
                public static final ValueType INT = new ValueType("INT", 0);
                public static final ValueType FLOAT = new ValueType("FLOAT", 1);
                public static final ValueType DOUBLE = new ValueType("DOUBLE", 2);
                public static final ValueType STRING = new ValueType("STRING", 3);
                public static final ValueType BOOLEAN = new ValueType("BOOLEAN", 4);

                private static final ValueType[] $values() {
/* 11 */            return new ValueType[]{INT, FLOAT, DOUBLE, STRING, BOOLEAN};
                }

                static {
/* 51 */            ValueType[] valueTypeArr$values = $values();
/* 55 */            $VALUES = valueTypeArr$values;
/* 61 */            $ENTRIES = ilIII1o11.I00000oIO(valueTypeArr$values);
                }

                private ValueType(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static ValueType valueOf(String str) {
/* 7 */             return (ValueType) Enum.valueOf(ValueType.class, str);
                }

                public static ValueType[] values() {
/* 7 */             return (ValueType[]) $VALUES.clone();
                }
            }
