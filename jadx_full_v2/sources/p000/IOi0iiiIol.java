            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOi0iiiIol {
                public static final IOi0iiiIol I00000oIO;

                static {
/* 3 */             IOi0iiiIol iOi0iiiIol = new IOi0iiiIol();
/* 6 */             VarHandle.storeStoreFence();
/* 9 */             I00000oIO = iOi0iiiIol;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof IOi0iiiIol);
                }

                public final int hashCode() {
/* 2 */             return Boolean.hashCode(true);
                }

                public final String toString() {
/* 1 */             return "CommonMarkdownParseOptions(autolink=true)";
                }
            }
