            package p000;

            import java.util.Enumeration;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class Il1I1I1lI1O1 implements Enumeration {
                public Enumeration I00000oIO;

                @Override
                public final boolean hasMoreElements() {
/* 3 */             return this.I00000oIO.hasMoreElements();
                }

                @Override
                public final Object nextElement() {
/* 11 */            return new HashMap((Map) this.I00000oIO.nextElement());
                }
            }
