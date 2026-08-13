            package p000;

            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public interface OlOo0II {
                static {
/* 1 */             int i = OlOloolI.I00000oIO;
                }

                Set I000II();

                boolean I000O01llI0();

                default void I000OOo1O(IlliIl1l11O illiIl1l11O) {
/* 15 */            for (Map.Entry entry : I000II()) {
/* 35 */                illiIl1l11O.invoke((String) entry.getKey(), (List) entry.getValue());
                    }
                }

                List I000OiO(String str);

                default String I000iOII(String str) {
/* 1 */             List listI000OiO = I000OiO(str);
/* 5 */             if (listI000OiO != null) {
/* 11 */                return (String) IOOi0Ool1i.I00II0Ol1O0l(listI000OiO);
                    }
/* 14 */            return null;
                }

                boolean isEmpty();
            }
