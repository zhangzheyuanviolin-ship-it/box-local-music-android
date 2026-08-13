            package p000;

            import android.text.TextUtils;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public abstract class iOOIoOO1il1i {
                public static String I00000oIO(List list) {
/* 1 */             if (list == null) {
/* 46 */                return null;
                    }
/* 6 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 9 */             Iterator it = list.iterator();
/* 17 */            while (it.hasNext()) {
/* 23 */                String str = (String) it.next();
/* 33 */                lII1IoI.I00000oIO("individual scopes cannot be null or empty", !TextUtils.isEmpty(str));
/* 36 */                linkedHashSet.add(str);
                    }
/* 44 */            if (linkedHashSet.isEmpty()) {
/* 46 */                return null;
                    }
/* 50 */            return TextUtils.join(" ", linkedHashSet);
                }
            }
