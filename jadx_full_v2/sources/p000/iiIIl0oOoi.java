            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class iiIIl0oOoi {
                public static List I00000oIO(Object... objArr) {
/* 1 */             int length = objArr.length;
                    return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
                }
            }
