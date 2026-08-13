            package p000;

            import java.util.Objects;
            import java.util.function.Predicate;
            
            public final class il1iO10iO implements Predicate {
                public static final il1iO10iO I00000oOI = new il1iO10iO(0);
                public static final il1iO10iO I0000Il00O = new il1iO10iO(1);
                public final int I00000oIO;

                public il1iO10iO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final boolean test(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 13 */                    return Objects.nonNull(obj);
                        default:
/* 8 */                     ((l0O00I) obj).getClass();
/* 11 */                    return false;
                    }
                }
            }
