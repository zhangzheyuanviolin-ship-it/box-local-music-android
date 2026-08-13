            package p000;

            import android.content.Context;
            
            public abstract class lIolIIiIOOIl {
                public static final Oi1o1i0 I00000oIO(Context context, Class cls, String str) {
/* 6 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 30 */                I000II.I000iOII("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
/* 5 */                 return null;
                    }
/* 14 */            if (!str.equals(":memory:")) {
/* 18 */                return new Oi1o1i0(context, cls, str);
                    }
/* 24 */            I000II.I000iOII("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
/* 5 */             return null;
                }
            }
