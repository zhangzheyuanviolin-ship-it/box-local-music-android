            package p000;

            import java.sql.Date;
            import java.sql.Timestamp;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class OlIi0i {
                public static final List I00000oIO;

                static {
                    boolean z;
                    try {
/* 5 */                 Class.forName("java.sql.Date");
/* 8 */                 z = true;
                    } catch (ClassNotFoundException unused) {
/* 10 */                z = false;
                    }
/* 11 */            if (!z) {
/* 56 */                I00000oIO = Collections.EMPTY_LIST;
/* 113 */               return;
                    }
/* 17 */            new OlIOooi0OIIl(0, Date.class);
/* 24 */            new OlIOooi0OIIl(1, Timestamp.class);
/* 51 */            I00000oIO = Collections.unmodifiableList(Arrays.asList(OlIOlOiioI.I00000oOI, OlIOilIIio.I00000oOI, OlIOoIoO1.I00000oOI));
                }
            }
