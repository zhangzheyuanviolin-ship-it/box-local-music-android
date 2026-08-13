            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class il0llo0 implements Iterator {
                public static final il0llo0 I00iOIl;
                public static final il0llo0[] I00iiI;

                static {
/* 6 */             il0llo0 il0llo0Var = new il0llo0("INSTANCE", 0);
/* 9 */             I00iOIl = il0llo0Var;
/* 15 */            I00iiI = new il0llo0[]{il0llo0Var};
                }

                public static il0llo0[] values() {
/* 7 */             return (il0llo0[]) I00iiI.clone();
                }

                @Override
                public final boolean hasNext() {
/* 1 */             return false;
                }

                @Override
                public final Object next() {
/* 20 */            throw new NoSuchElementException();
                }

                @Override
                public final void remove() {
/* 4 */             lil0iIo1Oiil.I0000Il00O("no calls to next() since the last call to remove()", false);
                }
            }
