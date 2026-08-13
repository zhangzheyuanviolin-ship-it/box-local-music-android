            package p000;

            import android.view.MenuItem;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class Oliio001lill implements MenuItem.OnMenuItemClickListener {
                public static final Class[] I0000O = {MenuItem.class};
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public Oliio001lill(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    boolean zBooleanValue;
                    switch (this.I00000oIO) {
                        case 0:
/* 23 */                    Object obj = this.I00000oOI;
/* 27 */                    Method method = (Method) this.I0000Il00O;
                            try {
/* 35 */                        if (method.getReturnType() == Boolean.TYPE) {
/* 47 */                            zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                                } else {
/* 56 */                            method.invoke(obj, menuItem);
/* 59 */                            zBooleanValue = true;
                                }
/* 66 */                        return zBooleanValue;
                            } catch (Exception e) {
/* 62 */                        IioIoO10iOiI.I000lI(e);
/* 65 */                        return false;
                            }
                        default:
/* 18 */                    return ((MenuItem.OnMenuItemClickListener) this.I00000oOI).onMenuItemClick(((O1ioi1oo0Ol) this.I0000Il00O).I000lI(menuItem));
                    }
                }
            }
