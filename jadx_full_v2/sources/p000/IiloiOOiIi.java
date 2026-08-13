            package p000;

            import android.view.View;
            import android.widget.AbsListView;
            import android.widget.AdapterView;
            import java.lang.reflect.Method;
            
            public abstract class IiloiOOiIi {
                public static final Method I00000oIO;
                public static final Method I00000oOI;
                public static final Method I0000Il00O;
                public static final boolean I0000O;

                static {
                    try {
/* 5 */                 Class cls = Integer.TYPE;
/* 9 */                 Class cls2 = Boolean.TYPE;
/* 11 */                Class cls3 = Float.TYPE;
/* 17 */                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
/* 21 */                I00000oIO = declaredMethod;
/* 24 */                declaredMethod.setAccessible(true);
/* 35 */                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
/* 39 */                I00000oOI = declaredMethod2;
/* 41 */                declaredMethod2.setAccessible(true);
/* 50 */                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
/* 54 */                I0000Il00O = declaredMethod3;
/* 56 */                declaredMethod3.setAccessible(true);
/* 59 */                I0000O = true;
                    } catch (NoSuchMethodException e) {
/* 63 */                e.printStackTrace();
                    }
                }
            }
