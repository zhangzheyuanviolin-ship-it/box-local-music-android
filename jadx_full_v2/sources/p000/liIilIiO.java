            package p000;

            import android.os.Build;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            
            public abstract class liIilIiO {
                public static boolean I00000oIO(List list) {
/* 1 */             Iterator it = list.iterator();
/* 10 */            while (it.hasNext()) {
/* 30 */                if (OlOolloIIOl0.I000l1(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
/* 32 */                    return true;
                        }
                    }
/* 9 */             return false;
                }
            }
