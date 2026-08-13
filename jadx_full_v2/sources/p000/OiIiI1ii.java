            package p000;

            import android.app.Activity;
            import android.graphics.Rect;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.util.List;
            
            public final class OiIiI1ii implements IllOOo00lI {
                public final int I00iOIl;
                public OiIiIIOOiO I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Class cls = Integer.TYPE;
/* 14 */            Class<?> clsLoadClass = null;
/* 15 */            boolean z = false;
/* 16 */            OiIiIIOOiO oiIiIIOOiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 448 */                   Method method = oiIiIIOOiO.I0000Il00O.I00000oIO.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
/* 480 */                   return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(oiIiIIOOiO.I00000oIO.loadClass("androidx.window.extensions.layout.WindowLayoutComponent")));
                        case 1:
/* 315 */                   Class<?> clsLoadClass2 = oiIiIIOOiO.I00000oIO.loadClass("androidx.window.extensions.layout.FoldingFeature");
/* 321 */                   Method method2 = clsLoadClass2.getMethod("getBounds", null);
/* 325 */                   Method method3 = clsLoadClass2.getMethod("getType", null);
/* 331 */                   Method method4 = clsLoadClass2.getMethod("getState", null);
/* 335 */                   OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 357 */                   if (method2.getReturnType().equals(((IOIO10iOi1) oOoOl1001II.I00000oOI(Rect.class)).I001l0I00()) && Modifier.isPublic(method2.getModifiers())) {
/* 387 */                       if (method3.getReturnType().equals(((IOIO10iOi1) oOoOl1001II.I00000oOI(cls)).I001l0I00()) && Modifier.isPublic(method3.getModifiers())) {
/* 417 */                           if (!method4.getReturnType().equals(((IOIO10iOi1) oOoOl1001II.I00000oOI(cls)).I001l0I00()) || !Modifier.isPublic(method4.getModifiers())) {
                                    }
                                }
                            } else {
/* 430 */                       z = false;
                            }
/* 431 */                   return Boolean.valueOf(z);
                        case 2:
/* 246 */                   ClassLoader classLoader = oiIiIIOOiO.I00000oIO;
/* 254 */                   Method method5 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures").getMethod("getDisplayFoldFeatures", null);
/* 306 */                   return Boolean.valueOf(Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class) && ((Class) ((ParameterizedType) method5.getGenericReturnType()).getActualTypeArguments()[0]).equals(classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature")));
                        case 3:
/* 147 */                   Class<?> clsLoadClass3 = oiIiIIOOiO.I00000oIO.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
/* 151 */                   Method method6 = clsLoadClass3.getMethod("getType", null);
/* 161 */                   Method method7 = clsLoadClass3.getMethod("hasProperty", cls);
/* 173 */                   Method method8 = clsLoadClass3.getMethod("hasProperties", int[].class);
/* 185 */                   if (Modifier.isPublic(method6.getModifiers()) && method6.getReturnType().equals(cls) && Modifier.isPublic(method7.getModifiers())) {
/* 207 */                       Class<?> returnType = method7.getReturnType();
/* 211 */                       Class cls2 = Boolean.TYPE;
/* 217 */                       if (!returnType.equals(cls2) || !Modifier.isPublic(method8.getModifiers()) || !method8.getReturnType().equals(cls2)) {
                                }
                            } else {
/* 240 */                       z = false;
                            }
/* 241 */                   return Boolean.valueOf(z);
                        case 4:
/* 102 */                   ClassLoader classLoader2 = oiIiIIOOiO.I00000oIO;
/* 110 */                   Method method9 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent").getMethod("getSupportedWindowFeatures", null);
/* 122 */                   if (Modifier.isPublic(method9.getModifiers())) {
/* 136 */                       z = method9.getReturnType().equals(classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures"));
                            }
/* 140 */                   return Boolean.valueOf(z);
                        case 5:
/* 30 */                    IOoI0IIOlolO iOoI0IIOlolO = oiIiIIOOiO.I00000oOI;
/* 32 */                    iOoI0IIOlolO.getClass();
                            try {
/* 39 */                        clsLoadClass = iOoI0IIOlolO.I00000oIO.loadClass("java.util.function.Consumer");
                            } catch (ClassNotFoundException unused) {
                            }
/* 43 */                    if (clsLoadClass != null) {
/* 48 */                        Class<?> clsLoadClass4 = oiIiIIOOiO.I00000oIO.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
/* 82 */                        z = Modifier.isPublic(clsLoadClass4.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass).getModifiers()) && Modifier.isPublic(clsLoadClass4.getMethod("removeWindowLayoutInfoListener", clsLoadClass).getModifiers());
                            }
/* 97 */                    return Boolean.valueOf(z);
                        default:
/* 25 */                    return Boolean.valueOf(OiIiIIOOiO.I0000O(oiIiIIOOiO));
                    }
                }
            }
