            package p000;

            import java.io.IOException;
            import java.util.AbstractList;
            import java.util.Iterator;
            import java.util.Objects;
            
            public final class i101oi {
                public static String I00000oIO(AbstractList abstractList) {
/* 1 */             Iterator it = abstractList.iterator();
/* 7 */             StringBuilder sb = new StringBuilder();
                    try {
/* 14 */                if (it.hasNext()) {
/* 16 */                    Object next = it.next();
/* 20 */                    Objects.requireNonNull(next);
/* 34 */                    sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
/* 41 */                    while (it.hasNext()) {
/* 45 */                        sb.append((CharSequence) "\n");
/* 48 */                        Object next2 = it.next();
/* 52 */                        Objects.requireNonNull(next2);
/* 66 */                        sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                            }
                        }
/* 70 */                return sb.toString();
                    } catch (IOException e) {
/* 76 */                I000II.I000O01llI0(e);
/* 79 */                return null;
                    }
                }
            }
