            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I0i1O01o001 {
                public static final I0i1O01o001[] I00iOIl;

                static {
/* 41 */            I0i1O01o001[] i0i1O01o001Arr = {new I0i1O01o001("CALL_JS_SKILL", 0), new I0i1O01o001("SKILL_PROGRESS", 1), new I0i1O01o001("ASK_INFO", 2), new I0i1O01o001("REQUEST_PERMISSION", 3), new I0i1O01o001("ASK_MCP_TOOL_CALL_PERMISSION", 4)};
/* 45 */            I00iOIl = i0i1O01o001Arr;
/* 47 */            ilIII1o11.I00000oIO(i0i1O01o001Arr);
                }

                public static I0i1O01o001 valueOf(String str) {
/* 7 */             return (I0i1O01o001) Enum.valueOf(I0i1O01o001.class, str);
                }

                public static I0i1O01o001[] values() {
/* 7 */             return (I0i1O01o001[]) I00iOIl.clone();
                }
            }
