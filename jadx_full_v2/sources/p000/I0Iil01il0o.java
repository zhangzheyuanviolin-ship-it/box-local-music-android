            package p000;

            import java.io.IOException;
            import java.lang.annotation.Annotation;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Set;
            import p000.O01lo1il;
            
/* 29 */    public final class I0Iil01il0o implements O011lOli {
                private final List<I0001Ioi1lo> fromAdapters;
                private final List<I0001Ioi1lo> toAdapters;

                public class I00000oIO extends O011ioiO1OI {
                    final Set val$annotations;
                    final O011ioiO1OI val$delegate;
                    final I0001Ioi1lo val$fromAdapter;
                    final OI011oo1 val$moshi;
                    final I0001Ioi1lo val$toAdapter;
                    final Type val$type;

                    public I00000oIO(I0001Ioi1lo i0001Ioi1lo, O011ioiO1OI o011ioiO1OI, OI011oo1 oI011oo1, I0001Ioi1lo i0001Ioi1lo2, Set set, Type type) {
/* 3 */                 this.val$toAdapter = i0001Ioi1lo;
/* 5 */                 this.val$delegate = o011ioiO1OI;
/* 7 */                 this.val$moshi = oI011oo1;
/* 9 */                 this.val$fromAdapter = i0001Ioi1lo2;
/* 11 */                this.val$annotations = set;
/* 13 */                this.val$type = type;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) throws IOException {
/* 1 */                 I0001Ioi1lo i0001Ioi1lo = this.val$fromAdapter;
/* 3 */                 if (i0001Ioi1lo == null) {
/* 7 */                     return this.val$delegate.fromJson(o01lo1il);
                        }
/* 14 */                if (!i0001Ioi1lo.nullable && o01lo1il.peek() == O01lo1il.I00000oOI.NULL) {
/* 24 */                    o01lo1il.nextNull();
/* 27 */                    return null;
                        }
                        try {
/* 33 */                    return this.val$fromAdapter.fromJson(this.val$moshi, o01lo1il);
                        } catch (InvocationTargetException e) {
/* 39 */                    Throwable cause = e.getCause();
/* 45 */                    if (cause instanceof IOException) {
/* 49 */                        throw ((IOException) cause);
                            }
/* 54 */                    StringBuilder sb = new StringBuilder();
/* 57 */                    sb.append(cause);
/* 60 */                    String path = o01lo1il.getPath();
/* 66 */                    sb.append(" at ");
/* 69 */                    sb.append(path);
/* 186 */                   throw new O01IiOo11l1o(sb.toString(), cause);
                        }
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) throws IOException {
/* 1 */                 I0001Ioi1lo i0001Ioi1lo = this.val$toAdapter;
/* 3 */                 if (i0001Ioi1lo == null) {
/* 7 */                     this.val$delegate.toJson(o01ooIO00oio, obj);
/* 10 */                    return;
                        }
/* 13 */                if (!i0001Ioi1lo.nullable && obj == null) {
/* 17 */                    o01ooIO00oio.nullValue();
/* 20 */                    return;
                        }
                        try {
/* 23 */                    i0001Ioi1lo.toJson(this.val$moshi, o01ooIO00oio, obj);
                        } catch (InvocationTargetException e) {
/* 28 */                    Throwable cause = e.getCause();
/* 34 */                    if (cause instanceof IOException) {
/* 38 */                        throw ((IOException) cause);
                            }
/* 43 */                    StringBuilder sb = new StringBuilder();
/* 46 */                    sb.append(cause);
/* 49 */                    String path = o01ooIO00oio.getPath();
/* 55 */                    sb.append(" at ");
/* 58 */                    sb.append(path);
/* 89 */                    throw new O01IiOo11l1o(sb.toString(), cause);
                        }
                    }

                    public String toString() {
/* 28 */                return "JsonAdapter" + this.val$annotations + "(" + this.val$type + ")";
                    }
                }

                public class I00000oOI extends I0001Ioi1lo {
                    public I00000oOI(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
/* 1 */                 super(type, set, obj, method, i, i2, z);
                    }

                    @Override
                    public void toJson(OI011oo1 oI011oo1, O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 invoke(o01ooIO00oio, obj);
                    }
                }

                public class I0000Il00O extends I0001Ioi1lo {
                    private O011ioiO1OI delegate;
                    final Type[] val$parameterTypes;
                    final Set val$qualifierAnnotations;
                    final Type val$returnType;
                    final Set val$returnTypeAnnotations;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public I0000Il00O(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
/* 9 */                 super(type, set, obj, method, i, i2, z);
/* 1 */                 this.val$parameterTypes = typeArr;
/* 3 */                 this.val$returnType = type2;
/* 5 */                 this.val$qualifierAnnotations = set2;
/* 7 */                 this.val$returnTypeAnnotations = set3;
                    }

                    @Override
                    public void bind(OI011oo1 oI011oo1, O011lOli o011lOli) {
/* 1 */                 super.bind(oI011oo1, o011lOli);
/* 44 */                this.delegate = (OoOllol1Io1.equals(this.val$parameterTypes[0], this.val$returnType) && this.val$qualifierAnnotations.equals(this.val$returnTypeAnnotations)) ? oI011oo1.nextAdapter(o011lOli, this.val$returnType, this.val$returnTypeAnnotations) : oI011oo1.adapter(this.val$returnType, this.val$returnTypeAnnotations);
                    }

                    @Override
                    public void toJson(OI011oo1 oI011oo1, O01ooIO00oio o01ooIO00oio, Object obj) {
/* 7 */                 this.delegate.toJson(o01ooIO00oio, invoke(obj));
                    }
                }

                public class I0000O extends I0001Ioi1lo {
                    public I0000O(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
/* 1 */                 super(type, set, obj, method, i, i2, z);
                    }

                    @Override
                    public Object fromJson(OI011oo1 oI011oo1, O01lo1il o01lo1il) {
/* 1 */                 return invoke(o01lo1il);
                    }
                }

                public class I0000oI00 extends I0001Ioi1lo {
                    O011ioiO1OI delegate;
                    final Type[] val$parameterTypes;
                    final Set val$qualifierAnnotations;
                    final Type val$returnType;
                    final Set val$returnTypeAnnotations;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public I0000oI00(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
/* 9 */                 super(type, set, obj, method, i, i2, z);
/* 1 */                 this.val$parameterTypes = typeArr;
/* 3 */                 this.val$returnType = type2;
/* 5 */                 this.val$qualifierAnnotations = set2;
/* 7 */                 this.val$returnTypeAnnotations = set3;
                    }

                    @Override
                    public void bind(OI011oo1 oI011oo1, O011lOli o011lOli) {
/* 1 */                 super.bind(oI011oo1, o011lOli);
/* 48 */                this.delegate = (OoOllol1Io1.equals(this.val$parameterTypes[0], this.val$returnType) && this.val$qualifierAnnotations.equals(this.val$returnTypeAnnotations)) ? oI011oo1.nextAdapter(o011lOli, this.val$parameterTypes[0], this.val$qualifierAnnotations) : oI011oo1.adapter(this.val$parameterTypes[0], this.val$qualifierAnnotations);
                    }

                    @Override
                    public Object fromJson(OI011oo1 oI011oo1, O01lo1il o01lo1il) {
/* 7 */                 return invoke(this.delegate.fromJson(o01lo1il));
                    }
                }

                public I0Iil01il0o(List<I0001Ioi1lo> list, List<I0001Ioi1lo> list2) {
/* 4 */             this.toAdapters = list;
/* 6 */             this.fromAdapters = list2;
                }

                public static I0001Ioi1lo fromAdapter(Object obj, Method method) throws SecurityException {
/* 2 */             method.setAccessible(true);
/* 5 */             Type genericReturnType = method.getGenericReturnType();
/* 9 */             Set<? extends Annotation> setJsonAnnotations = Ooll10OlIOl0.jsonAnnotations(method);
/* 13 */            Type[] genericParameterTypes = method.getGenericParameterTypes();
/* 17 */            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
/* 21 */            int length = genericParameterTypes.length;
/* 22 */            Class cls = Void.TYPE;
/* 25 */            if (length >= 1 && genericParameterTypes[0] == O01lo1il.class && genericReturnType != cls && parametersAreJsonAdapters(1, genericParameterTypes)) {
/* 48 */                return new I0000O(genericReturnType, setJsonAnnotations, obj, method, genericParameterTypes.length, 1, true);
                    }
/* 56 */            if (genericParameterTypes.length != 1 || genericReturnType == cls) {
/* 86 */                OoOil11Ol1o.I000OOo1O(method, "Unexpected signature for ", ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
/* 89 */                return null;
                    }
/* 62 */            Set<? extends Annotation> setJsonAnnotations2 = Ooll10OlIOl0.jsonAnnotations(parameterAnnotations[0]);
/* 78 */            return new I0000oI00(genericReturnType, setJsonAnnotations, obj, method, genericParameterTypes.length, 1, Ooll10OlIOl0.hasNullable(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setJsonAnnotations2, setJsonAnnotations);
                }

                public static I0Iil01il0o get(Object obj) throws SecurityException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             ArrayList arrayList2 = new ArrayList();
/* 17 */            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
/* 25 */                for (Method method : superclass.getDeclaredMethods()) {
/* 37 */                    if (method.isAnnotationPresent(Oo1IIIO000o.class)) {
/* 39 */                        I0001Ioi1lo adapter = toAdapter(obj, method);
/* 47 */                        I0001Ioi1lo i0001Ioi1lo = get(arrayList, adapter.type, adapter.annotations);
/* 51 */                        if (i0001Ioi1lo != null) {
/* 63 */                            StringBuilder sb = new StringBuilder("Conflicting @ToJson methods:\n    ");
/* 68 */                            sb.append(i0001Ioi1lo.method);
/* 71 */                            Method method2 = adapter.method;
/* 73 */                            sb.append("\n    ");
/* 76 */                            sb.append(method2);
/* 86 */                            throw new IllegalArgumentException(sb.toString());
                                }
/* 53 */                        arrayList.add(adapter);
                            }
/* 93 */                    if (method.isAnnotationPresent(IllOIi.class)) {
/* 95 */                        I0001Ioi1lo i0001Ioi1loFromAdapter = fromAdapter(obj, method);
/* 103 */                       I0001Ioi1lo i0001Ioi1lo2 = get(arrayList2, i0001Ioi1loFromAdapter.type, i0001Ioi1loFromAdapter.annotations);
/* 107 */                       if (i0001Ioi1lo2 != null) {
/* 119 */                           StringBuilder sb2 = new StringBuilder("Conflicting @FromJson methods:\n    ");
/* 124 */                           sb2.append(i0001Ioi1lo2.method);
/* 127 */                           Method method3 = i0001Ioi1loFromAdapter.method;
/* 129 */                           sb2.append("\n    ");
/* 132 */                           sb2.append(method3);
/* 142 */                           throw new IllegalArgumentException(sb2.toString());
                                }
/* 109 */                       arrayList2.add(i0001Ioi1loFromAdapter);
                            }
                        }
                    }
/* 156 */           if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
/* 186 */               return new I0Iil01il0o(arrayList, arrayList2);
                    }
/* 179 */           I000II.I000iOII("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
/* 182 */           return null;
                }

                private static boolean parametersAreJsonAdapters(int i, Type[] typeArr) {
/* 1 */             int length = typeArr.length;
/* 2 */             while (i < length) {
/* 4 */                 Type type = typeArr[i];
/* 9 */                 if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != O011ioiO1OI.class) {
/* 8 */                     return false;
                        }
/* 23 */                i++;
                    }
/* 26 */            return true;
                }

                public static I0001Ioi1lo toAdapter(Object obj, Method method) throws SecurityException {
/* 2 */             method.setAccessible(true);
/* 5 */             Type genericReturnType = method.getGenericReturnType();
/* 9 */             Type[] genericParameterTypes = method.getGenericParameterTypes();
/* 13 */            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
/* 17 */            int length = genericParameterTypes.length;
/* 18 */            Class cls = Void.TYPE;
/* 22 */            if (length >= 2 && genericParameterTypes[0] == O01ooIO00oio.class && genericReturnType == cls && parametersAreJsonAdapters(2, genericParameterTypes)) {
/* 54 */                return new I00000oOI(genericParameterTypes[1], Ooll10OlIOl0.jsonAnnotations(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
                    }
/* 60 */            if (genericParameterTypes.length != 1 || genericReturnType == cls) {
/* 97 */                OoOil11Ol1o.I000OOo1O(method, "Unexpected signature for ", ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
/* 100 */               return null;
                    }
/* 64 */            Set<? extends Annotation> setJsonAnnotations = Ooll10OlIOl0.jsonAnnotations(method);
/* 70 */            Set<? extends Annotation> setJsonAnnotations2 = Ooll10OlIOl0.jsonAnnotations(parameterAnnotations[0]);
/* 89 */            return new I0000Il00O(genericParameterTypes[0], setJsonAnnotations2, obj, method, genericParameterTypes.length, 1, Ooll10OlIOl0.hasNullable(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setJsonAnnotations2, setJsonAnnotations);
                }

                @Override
                public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 3 */             I0001Ioi1lo i0001Ioi1lo = get(this.toAdapters, type, set);
/* 9 */             I0001Ioi1lo i0001Ioi1lo2 = get(this.fromAdapters, type, set);
/* 13 */            O011ioiO1OI o011ioiO1OINextAdapter = null;
/* 14 */            if (i0001Ioi1lo == null && i0001Ioi1lo2 == null) {
/* 13 */                return null;
                    }
/* 19 */            if (i0001Ioi1lo == null || i0001Ioi1lo2 == null) {
                        try {
/* 26 */                    o011ioiO1OINextAdapter = oI011oo1.nextAdapter(this, type, set);
                        } catch (IllegalArgumentException e) {
/* 68 */                    StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("No ", i0001Ioi1lo == null ? "@ToJson" : "@FromJson", " adapter for ");
/* 76 */                    sbI001IIilI0O.append(Ooll10OlIOl0.typeAnnotatedWithAnnotations(type, set));
/* 215 */                   throw new IllegalArgumentException(sbI001IIilI0O.toString(), e);
                        }
                    }
/* 24 */            O011ioiO1OI o011ioiO1OI = o011ioiO1OINextAdapter;
/* 31 */            if (i0001Ioi1lo != null) {
/* 33 */                i0001Ioi1lo.bind(oI011oo1, this);
                    }
/* 36 */            if (i0001Ioi1lo2 != null) {
/* 38 */                i0001Ioi1lo2.bind(oI011oo1, this);
                    }
/* 47 */            return new I00000oIO(i0001Ioi1lo, o011ioiO1OI, oI011oo1, i0001Ioi1lo2, set, type);
                }

/* 30 */        public static abstract class I0001Ioi1lo {
                    final Object adapter;
                    final int adaptersOffset;
                    final Set<? extends Annotation> annotations;
                    final O011ioiO1OI[] jsonAdapters;
                    final Method method;
                    final boolean nullable;
                    final Type type;

                    public I0001Ioi1lo(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
/* 8 */                 this.type = Ooll10OlIOl0.canonicalize(type);
/* 10 */                this.annotations = set;
/* 12 */                this.adapter = obj;
/* 14 */                this.method = method;
/* 16 */                this.adaptersOffset = i2;
/* 21 */                this.jsonAdapters = new O011ioiO1OI[i - i2];
/* 23 */                this.nullable = z;
                    }

                    public void bind(OI011oo1 oI011oo1, O011lOli o011lOli) {
/* 4 */                 if (this.jsonAdapters.length > 0) {
/* 8 */                     Type[] genericParameterTypes = this.method.getGenericParameterTypes();
/* 14 */                    Annotation[][] parameterAnnotations = this.method.getParameterAnnotations();
/* 20 */                    int length = genericParameterTypes.length;
/* 21 */                    for (int i = this.adaptersOffset; i < length; i++) {
/* 32 */                        Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
/* 36 */                        Set<? extends Annotation> setJsonAnnotations = Ooll10OlIOl0.jsonAnnotations(parameterAnnotations[i]);
/* 71 */                        this.jsonAdapters[i - this.adaptersOffset] = (OoOllol1Io1.equals(this.type, type) && this.annotations.equals(setJsonAnnotations)) ? oI011oo1.nextAdapter(o011lOli, type, setJsonAnnotations) : oI011oo1.adapter(type, setJsonAnnotations);
                            }
                        }
                    }

                    public Object fromJson(OI011oo1 oI011oo1, O01lo1il o01lo1il) {
/* 89 */                throw new AssertionError();
                    }

                    public Object invoke(Object obj, Object obj2) {
/* 1 */                 O011ioiO1OI[] o011ioiO1OIArr = this.jsonAdapters;
/* 6 */                 Object[] objArr = new Object[o011ioiO1OIArr.length + 2];
/* 9 */                 objArr[0] = obj;
/* 12 */                objArr[1] = obj2;
/* 15 */                System.arraycopy(o011ioiO1OIArr, 0, objArr, 2, o011ioiO1OIArr.length);
                        try {
/* 22 */                    return this.method.invoke(this.adapter, objArr);
                        } catch (IllegalAccessException unused) {
/* 27 */                    OoOil11Ol1o.I0000Il00O();
/* 30 */                    return null;
                        }
                    }

                    public void toJson(OI011oo1 oI011oo1, O01ooIO00oio o01ooIO00oio, Object obj) {
/* 215 */               throw new AssertionError();
                    }

/* 31 */            public Object invoke(Object obj) {
/* 32 */                O011ioiO1OI[] o011ioiO1OIArr = this.jsonAdapters;
                        Object[] objArr = new Object[o011ioiO1OIArr.length + 1];
/* 33 */                objArr[0] = obj;
/* 34 */                System.arraycopy(o011ioiO1OIArr, 0, objArr, 1, o011ioiO1OIArr.length);
                        try {
/* 35 */                    return this.method.invoke(this.adapter, objArr);
                        } catch (IllegalAccessException unused) {
/* 36 */                    OoOil11Ol1o.I0000Il00O();
                            return null;
                        }
                    }
                }

/* 189 */       private static I0001Ioi1lo get(List<I0001Ioi1lo> list, Type type, Set<? extends Annotation> set) {
/* 190 */           int size = list.size();
                    for (int i = 0; i < size; i++) {
/* 191 */               I0001Ioi1lo i0001Ioi1lo = list.get(i);
/* 192 */               if (OoOllol1Io1.equals(i0001Ioi1lo.type, type) && i0001Ioi1lo.annotations.equals(set)) {
                            return i0001Ioi1lo;
                        }
                    }
                    return null;
                }
            }
