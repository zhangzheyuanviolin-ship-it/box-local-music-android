            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.view.View;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class I1II1lO implements View.OnClickListener {
                public View I00iOIl;
                public String I00iiI;
                public Method I00iiO;
                public Context I00iio;

                @Override
                public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    String str;
                    Method method;
/* 1 */             View view2 = this.I00iOIl;
/* 3 */             Method method2 = this.I00iiO;
/* 5 */             if (method2 == null) {
/* 7 */                 Context context = view2.getContext();
/* 11 */                String str2 = this.I00iiI;
/* 13 */                while (context != null) {
                            try {
/* 19 */                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
/* 37 */                            this.I00iiO = method;
/* 39 */                            this.I00iio = context;
/* 41 */                            method2 = method;
                                }
                            } catch (NoSuchMethodException unused) {
                            }
/* 54 */                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                        }
/* 56 */                int id = view2.getId();
/* 61 */                if (id == -1) {
/* 63 */                    str = "";
                        } else {
/* 93 */                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
/* 109 */               IoOOl0iOl1io.I000lI(IIlIOloOOO.I001IIilI0O("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view2.getClass(), str);
/* 112 */               return;
                    }
                    try {
/* 119 */               method2.invoke(this.I00iio, view);
                    } catch (IllegalAccessException e) {
/* 133 */               IoOOl0iOl1io.I000l1("Could not execute non-public method for android:onClick", e);
                    } catch (InvocationTargetException e2) {
/* 126 */               IoOOl0iOl1io.I000l1("Could not execute method for android:onClick", e2);
                    }
                }
            }
