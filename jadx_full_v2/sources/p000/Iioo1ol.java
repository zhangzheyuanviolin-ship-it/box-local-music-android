            package p000;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            
            public abstract class Iioo1ol {
                public static Set<int[]> I00000oIO() {
                    try {
/* 14 */                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
/* 18 */                if (objInvoke == null) {
/* 20 */                    return Collections.EMPTY_SET;
                        }
/* 23 */                Set<int[]> set = (Set) objInvoke;
/* 25 */                Iterator<int[]> it = set.iterator();
/* 33 */                while (it.hasNext()) {
/* 41 */                    if (!(it.next() instanceof int[])) {
/* 43 */                        return Collections.EMPTY_SET;
                            }
                        }
/* 45 */                return set;
                    } catch (Throwable unused) {
/* 46 */                return Collections.EMPTY_SET;
                    }
                }
            }
