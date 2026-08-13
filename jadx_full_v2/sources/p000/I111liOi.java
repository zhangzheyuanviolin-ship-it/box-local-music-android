            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            
            public final class I111liOi implements InvocationHandler {
                public Class I00000oIO;
                public Map I00000oOI;
                public OllO00oiil I0000Il00O;
                public OllO00oiil I0000O;
                public List I0000oI00;

                @Override
                public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             Class cls = this.I00000oIO;
/* 3 */             Map map = this.I00000oOI;
/* 5 */             OllO00oiil ollO00oiil = this.I0000Il00O;
/* 7 */             OllO00oiil ollO00oiil2 = this.I0000O;
/* 9 */             List list = this.I0000oI00;
/* 11 */            String name = method.getName();
/* 15 */            if (name != null) {
/* 17 */                int iHashCode = name.hashCode();
/* 24 */                if (iHashCode != -1776922004) {
/* 29 */                    if (iHashCode != 147696667) {
/* 34 */                        if (iHashCode == 1444986633 && name.equals("annotationType")) {
/* 46 */                            return cls;
                                }
                            } else if (name.equals("hashCode")) {
/* 66 */                        return Integer.valueOf(((Number) ollO00oiil2.getValue()).intValue());
                            }
                        } else if (name.equals("toString")) {
/* 84 */                    return (String) ollO00oiil.getValue();
                        }
                    }
/* 93 */            boolean z = false;
/* 94 */            if (!O0000Ioio00.I0000O(name, "equals") || objArr == null || objArr.length != 1) {
/* 316 */               if (map.containsKey(name)) {
/* 318 */                   return map.get(name);
                        }
/* 329 */               StringBuilder sb = new StringBuilder("Method is not supported: ");
/* 332 */               sb.append(method);
/* 337 */               sb.append(" (args: ");
/* 340 */               if (objArr == null) {
/* 342 */                   objArr = new Object[0];
                        }
/* 348 */               sb.append(I1IoiO1l.I00IioO0OiOi(objArr));
/* 353 */               sb.append(')');
/* 2160 */              throw new Ii01OOool(sb.toString());
                    }
/* 102 */           Object objI00II0oii1o = I1IoiO1l.I00II0oii1o(objArr);
/* 115 */           Annotation annotation = objI00II0oii1o instanceof Annotation ? (Annotation) objI00II0oii1o : null;
/* 134 */           if (O0000Ioio00.I0000O(annotation != null ? ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00() : null, cls)) {
/* 136 */               List<Method> list2 = list;
/* 140 */               if ((list2 instanceof Collection) && list2.isEmpty()) {
/* 306 */                   z = true;
                        } else {
/* 161 */                   for (Method method2 : list2) {
/* 173 */                       Object obj2 = map.get(method2.getName());
/* 177 */                       Object objInvoke = method2.invoke(objI00II0oii1o, null);
/* 303 */                       if (!(obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke) : obj2 instanceof char[] ? Arrays.equals((char[]) obj2, (char[]) objInvoke) : obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) objInvoke) : obj2 instanceof short[] ? Arrays.equals((short[]) obj2, (short[]) objInvoke) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) objInvoke) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) objInvoke) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) objInvoke) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) objInvoke) : obj2 instanceof Object[] ? Arrays.equals((Object[]) obj2, (Object[]) objInvoke) : O0000Ioio00.I0000O(obj2, objInvoke))) {
                                    break;
                                }
                            }
/* 306 */                   z = true;
                        }
                    }
/* 307 */           return Boolean.valueOf(z);
                }
            }
