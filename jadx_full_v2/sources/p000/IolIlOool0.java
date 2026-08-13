            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IolIlOool0 {
                public static final IolIlOool0[] I00iOIl;

                static {
/* 41 */            IolIlOool0[] iolIlOool0Arr = {new IolIlOool0("Primary", 0), new IolIlOool0("Secondary", 1), new IolIlOool0("Success", 2), new IolIlOool0("Danger", 3), new IolIlOool0("Warning", 4)};
/* 45 */            I00iOIl = iolIlOool0Arr;
/* 47 */            ilIII1o11.I00000oIO(iolIlOool0Arr);
                }

                public static IolIlOool0 valueOf(String str) {
/* 7 */             return (IolIlOool0) Enum.valueOf(IolIlOool0.class, str);
                }

                public static IolIlOool0[] values() {
/* 7 */             return (IolIlOool0[]) I00iOIl.clone();
                }
            }
