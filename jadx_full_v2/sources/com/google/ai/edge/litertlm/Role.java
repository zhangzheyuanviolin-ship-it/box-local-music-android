            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/litertlm/Role;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SYSTEM", "USER", "MODEL", "TOOL", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Role {
                private static final Il0lIli0 $ENTRIES;
                private static final Role[] $VALUES;
                private final String value;
                public static final Role SYSTEM = new Role("SYSTEM", 0, "system");
                public static final Role USER = new Role("USER", 1, "user");
                public static final Role MODEL = new Role("MODEL", 2, "model");
                public static final Role TOOL = new Role("TOOL", 3, "tool");

                private static final Role[] $values() {
/* 9 */             return new Role[]{SYSTEM, USER, MODEL, TOOL};
                }

                static {
/* 49 */            Role[] roleArr$values = $values();
/* 53 */            $VALUES = roleArr$values;
/* 59 */            $ENTRIES = ilIII1o11.I00000oIO(roleArr$values);
                }

                private Role(String str, int i, String str2) {
/* 4 */             this.value = str2;
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static Role valueOf(String str) {
/* 7 */             return (Role) Enum.valueOf(Role.class, str);
                }

                public static Role[] values() {
/* 7 */             return (Role[]) $VALUES.clone();
                }

                public final String getValue() {
/* 1 */             return this.value;
                }
            }
