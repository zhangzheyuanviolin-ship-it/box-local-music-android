            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Type;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Deque;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
/* 16 */    public final class OI011oo1 {
                static final List<O011lOli> BUILT_IN_FACTORIES;
                private final List<O011lOli> factories;
                private final int lastOffset;
                private final ThreadLocal<I0000oI00> lookupChainThreadLocal = new ThreadLocal<>();
                private final Map<Object, O011ioiO1OI> adapterCache = new LinkedHashMap();

                public class I00000oIO implements O011lOli {
                    final O011ioiO1OI val$jsonAdapter;
                    final Type val$type;

                    public I00000oIO(Type type, O011ioiO1OI o011ioiO1OI) {
/* 1 */                 this.val$type = type;
/* 3 */                 this.val$jsonAdapter = o011ioiO1OI;
                    }

                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 5 */                 if (set.isEmpty() && Ooll10OlIOl0.typesMatch(this.val$type, type)) {
/* 15 */                    return this.val$jsonAdapter;
                        }
/* 18 */                return null;
                    }
                }

                public class I00000oOI implements O011lOli {
                    final Class val$annotation;
                    final O011ioiO1OI val$jsonAdapter;
                    final Type val$type;

                    public I00000oOI(Type type, Class cls, O011ioiO1OI o011ioiO1OI) {
/* 1 */                 this.val$type = type;
/* 3 */                 this.val$annotation = cls;
/* 5 */                 this.val$jsonAdapter = o011ioiO1OI;
                    }

                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 7 */                 if (Ooll10OlIOl0.typesMatch(this.val$type, type) && set.size() == 1 && Ooll10OlIOl0.isAnnotationPresent(set, this.val$annotation)) {
/* 24 */                    return this.val$jsonAdapter;
                        }
/* 27 */                return null;
                    }
                }

                public static final class I0000O extends O011ioiO1OI {
                    O011ioiO1OI adapter;
                    final Object cacheKey;
                    final String fieldName;
                    final Type type;

                    public I0000O(Type type, String str, Object obj) {
/* 4 */                 this.type = type;
/* 6 */                 this.fieldName = str;
/* 8 */                 this.cacheKey = obj;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 1 */                 O011ioiO1OI o011ioiO1OI = this.adapter;
/* 3 */                 if (o011ioiO1OI != null) {
/* 5 */                     return o011ioiO1OI.fromJson(o01lo1il);
                        }
/* 12 */                I000II.I001IO000("JsonAdapter isn't ready");
/* 15 */                return null;
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 O011ioiO1OI o011ioiO1OI = this.adapter;
/* 3 */                 if (o011ioiO1OI != null) {
/* 5 */                     o011ioiO1OI.toJson(o01ooIO00oio, obj);
                        } else {
/* 11 */                    I000II.I001IO000("JsonAdapter isn't ready");
                        }
                    }

                    public String toString() {
/* 1 */                 O011ioiO1OI o011ioiO1OI = this.adapter;
                        return o011ioiO1OI != null ? o011ioiO1OI.toString() : super.toString();
                    }
                }

                public final class I0000oI00 {
                    boolean exceptionAnnotated;
                    final List<I0000O> callLookups = new ArrayList();
                    final Deque<I0000O> stack = new ArrayDeque();

                    public I0000oI00() {
                    }

                    public <T> void adapterFound(O011ioiO1OI o011ioiO1OI) {
/* 9 */                 this.stack.getLast().adapter = o011ioiO1OI;
                    }

                    public IllegalArgumentException exceptionWithLookupStack(IllegalArgumentException illegalArgumentException) {
/* 3 */                 if (!this.exceptionAnnotated) {
/* 7 */                     this.exceptionAnnotated = true;
/* 15 */                    if (this.stack.size() != 1 || this.stack.getFirst().fieldName != null) {
/* 36 */                        StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
/* 41 */                        Iterator<I0000O> itDescendingIterator = this.stack.descendingIterator();
/* 49 */                        while (itDescendingIterator.hasNext()) {
/* 51 */                            I0000O next = itDescendingIterator.next();
/* 59 */                            sb.append("\nfor ");
/* 64 */                            sb.append(next.type);
/* 69 */                            if (next.fieldName != null) {
/* 73 */                                sb.append(' ');
/* 78 */                                sb.append(next.fieldName);
                                    }
                                }
/* 88 */                        return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                            }
                        }
/* 29 */                return illegalArgumentException;
                    }

                    public void pop(boolean z) {
/* 3 */                 this.stack.removeLast();
/* 12 */                if (this.stack.isEmpty()) {
/* 21 */                    OI011oo1.this.lookupChainThreadLocal.remove();
/* 24 */                    if (z) {
                                synchronized (OI011oo1.this.adapterCache) {
                                    try {
/* 35 */                                int size = this.callLookups.size();
/* 40 */                                for (int i = 0; i < size; i++) {
/* 44 */                                    I0000O i0000o = this.callLookups.get(i);
/* 64 */                                    O011ioiO1OI o011ioiO1OI = (O011ioiO1OI) OI011oo1.this.adapterCache.put(i0000o.cacheKey, i0000o.adapter);
/* 66 */                                    if (o011ioiO1OI != null) {
/* 68 */                                        i0000o.adapter = o011ioiO1OI;
/* 78 */                                        OI011oo1.this.adapterCache.put(i0000o.cacheKey, o011ioiO1OI);
                                            }
                                        }
                                    } catch (Throwable th) {
/* 90 */                                throw th;
                                    }
                                }
                            }
                        }
                    }

                    public <T> O011ioiO1OI push(Type type, String str, Object obj) {
/* 3 */                 int size = this.callLookups.size();
/* 8 */                 for (int i = 0; i < size; i++) {
/* 12 */                    I0000O i0000o = this.callLookups.get(i);
/* 24 */                    if (i0000o.cacheKey.equals(obj)) {
/* 28 */                        this.stack.add(i0000o);
/* 31 */                        O011ioiO1OI o011ioiO1OI = i0000o.adapter;
                                return o011ioiO1OI != null ? o011ioiO1OI : i0000o;
                            }
                        }
/* 42 */                I0000O i0000o2 = new I0000O(type, str, obj);
/* 47 */                this.callLookups.add(i0000o2);
/* 52 */                this.stack.add(i0000o2);
/* 55 */                return null;
                    }
                }

                static {
/* 4 */             ArrayList arrayList = new ArrayList(5);
/* 7 */             BUILT_IN_FACTORIES = arrayList;
/* 11 */            arrayList.add(OlIlIiiO0li.FACTORY);
/* 16 */            arrayList.add(IOOOollo0.FACTORY);
/* 21 */            arrayList.add(O1OiIOlI.FACTORY);
/* 26 */            arrayList.add(I1IlIIoI00l1.FACTORY);
/* 31 */            arrayList.add(OOo00011l11.FACTORY);
/* 36 */            arrayList.add(IOIOll.FACTORY);
                }

                public OI011oo1(I0000Il00O i0000Il00O) {
/* 22 */            int size = i0000Il00O.factories.size();
/* 26 */            List<O011lOli> list = BUILT_IN_FACTORIES;
/* 33 */            ArrayList arrayList = new ArrayList(list.size() + size);
/* 38 */            arrayList.addAll(i0000Il00O.factories);
/* 41 */            arrayList.addAll(list);
/* 48 */            this.factories = Collections.unmodifiableList(arrayList);
/* 52 */            this.lastOffset = i0000Il00O.lastOffset;
                }

                private Object cacheKey(Type type, Set<? extends Annotation> set) {
                    return set.isEmpty() ? type : Arrays.asList(type, set);
                }

                public static <T> O011lOli newAdapterFactory(Type type, Class<? extends Annotation> cls, O011ioiO1OI o011ioiO1OI) {
/* 2 */             if (type == null) {
/* 55 */                I000II.I000iOII("type == null");
/* 1 */                 return null;
                    }
/* 4 */             if (cls == null) {
/* 49 */                I000II.I000iOII("annotation == null");
/* 1 */                 return null;
                    }
/* 6 */             if (o011ioiO1OI == null) {
/* 43 */                I000II.I000iOII("jsonAdapter == null");
/* 1 */                 return null;
                    }
/* 14 */            if (!cls.isAnnotationPresent(O01llo0IIo0.class)) {
/* 37 */                IoOOl0iOl1io.I0000O(cls, " does not have @JsonQualifier");
/* 1 */                 return null;
                    }
/* 21 */            if (cls.getDeclaredMethods().length <= 0) {
/* 25 */                return new I00000oOI(type, cls, o011ioiO1OI);
                    }
/* 31 */            I000II.I000iOII("Use JsonAdapter.Factory for annotations with elements");
/* 1 */             return null;
                }

                public <T> O011ioiO1OI adapter(Type type, Set<? extends Annotation> set, String str) {
/* 2 */             if (type == null) {
/* 151 */               IOOlIIilOl0.I000II("type == null");
/* 1 */                 return null;
                    }
/* 4 */             if (set == null) {
/* 145 */               IOOlIIilOl0.I000II("annotations == null");
/* 1 */                 return null;
                    }
/* 10 */            Type typeRemoveSubtypeWildcard = Ooll10OlIOl0.removeSubtypeWildcard(Ooll10OlIOl0.canonicalize(type));
/* 14 */            Object objCacheKey = cacheKey(typeRemoveSubtypeWildcard, set);
                    synchronized (this.adapterCache) {
                        try {
/* 23 */                    O011ioiO1OI o011ioiO1OI = this.adapterCache.get(objCacheKey);
/* 29 */                    if (o011ioiO1OI != null) {
/* 32 */                        return o011ioiO1OI;
                            }
/* 38 */                    I0000oI00 i0000oI00 = this.lookupChainThreadLocal.get();
/* 44 */                    if (i0000oI00 == null) {
/* 48 */                        i0000oI00 = new I0000oI00();
/* 53 */                        this.lookupChainThreadLocal.set(i0000oI00);
                            }
/* 56 */                    O011ioiO1OI o011ioiO1OIPush = i0000oI00.push(typeRemoveSubtypeWildcard, str, objCacheKey);
                            try {
/* 61 */                        if (o011ioiO1OIPush != null) {
/* 66 */                            return o011ioiO1OIPush;
                                }
                                try {
/* 69 */                            int size = this.factories.size();
/* 74 */                            for (int i = 0; i < size; i++) {
/* 84 */                                O011ioiO1OI o011ioiO1OICreate = this.factories.get(i).create(typeRemoveSubtypeWildcard, set, this);
/* 88 */                                if (o011ioiO1OICreate != null) {
/* 93 */                                    i0000oI00.adapterFound(o011ioiO1OICreate);
/* 97 */                                    i0000oI00.pop(true);
/* 100 */                                   return o011ioiO1OICreate;
                                        }
                                    }
/* 131 */                           throw new IllegalArgumentException("No JsonAdapter for " + Ooll10OlIOl0.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
                                } catch (IllegalArgumentException e) {
/* 136 */                           throw i0000oI00.exceptionWithLookupStack(e);
                                }
                            } finally {
/* 137 */                       i0000oI00.pop(false);
                            }
                        } finally {
                        }
                    }
                }

                public I0000Il00O newBuilder() {
/* 3 */             I0000Il00O i0000Il00O = new I0000Il00O();
/* 6 */             int i = this.lastOffset;
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 19 */                i0000Il00O.add(this.factories.get(i2));
                    }
/* 39 */            int size = this.factories.size() - BUILT_IN_FACTORIES.size();
/* 40 */            for (int i3 = this.lastOffset; i3 < size; i3++) {
/* 50 */                i0000Il00O.addLast(this.factories.get(i3));
                    }
/* 113 */           return i0000Il00O;
                }

                public <T> O011ioiO1OI nextAdapter(O011lOli o011lOli, Type type, Set<? extends Annotation> set) {
/* 2 */             if (set == null) {
/* 67 */                IOOlIIilOl0.I000II("annotations == null");
/* 1 */                 return null;
                    }
/* 8 */             Type typeRemoveSubtypeWildcard = Ooll10OlIOl0.removeSubtypeWildcard(Ooll10OlIOl0.canonicalize(type));
/* 14 */            int iIndexOf = this.factories.indexOf(o011lOli);
/* 19 */            if (iIndexOf == -1) {
/* 61 */                IioIoO10iOiI.I000OiO("Unable to skip past unknown factory ", o011lOli);
/* 1 */                 return null;
                    }
/* 25 */            int size = this.factories.size();
/* 29 */            for (int i = iIndexOf + 1; i < size; i++) {
/* 39 */                O011ioiO1OI o011ioiO1OICreate = this.factories.get(i).create(typeRemoveSubtypeWildcard, set, this);
/* 43 */                if (o011ioiO1OICreate != null) {
/* 45 */                    return o011ioiO1OICreate;
                        }
                    }
/* 55 */            IoOOl0iOl1io.I001l0I00("No next JsonAdapter for ", Ooll10OlIOl0.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
/* 1 */             return null;
                }

/* 17 */        public static final class I0000Il00O {
                    final List<O011lOli> factories = new ArrayList();
                    int lastOffset = 0;

                    public I0000Il00O add(O011lOli o011lOli) {
/* 1 */                 if (o011lOli == null) {
/* 17 */                    I000II.I000iOII("factory == null");
/* 20 */                    return null;
                        }
/* 3 */                 List<O011lOli> list = this.factories;
/* 5 */                 int i = this.lastOffset;
/* 9 */                 this.lastOffset = i + 1;
/* 11 */                list.add(i, o011lOli);
/* 14 */                return this;
                    }

                    public I0000Il00O addLast(Object obj) {
/* 1 */                 if (obj != null) {
/* 7 */                     return addLast((O011lOli) I0Iil01il0o.get(obj));
                        }
/* 14 */                I000II.I000iOII("adapter == null");
/* 17 */                return null;
                    }

                    public OI011oo1 build() {
/* 3 */                 return new OI011oo1(this);
                    }

/* 18 */            public <T> I0000Il00O addLast(Type type, Class<? extends Annotation> cls, O011ioiO1OI o011ioiO1OI) {
/* 19 */                return addLast(OI011oo1.newAdapterFactory(type, cls, o011ioiO1OI));
                    }

/* 19 */            public I0000Il00O addLast(O011lOli o011lOli) {
                        if (o011lOli != null) {
/* 20 */                    this.factories.add(o011lOli);
                            return this;
                        }
/* 21 */                I000II.I000iOII("factory == null");
                        return null;
                    }

/* 21 */            public <T> I0000Il00O add(Type type, Class<? extends Annotation> cls, O011ioiO1OI o011ioiO1OI) {
/* 22 */                return add(OI011oo1.newAdapterFactory(type, cls, o011ioiO1OI));
                    }

/* 21 */            public <T> I0000Il00O addLast(Type type, O011ioiO1OI o011ioiO1OI) {
/* 22 */                return addLast(OI011oo1.newAdapterFactory(type, o011ioiO1OI));
                    }

/* 22 */            public <T> I0000Il00O add(Type type, O011ioiO1OI o011ioiO1OI) {
/* 23 */                return add(OI011oo1.newAdapterFactory(type, o011ioiO1OI));
                    }

/* 23 */            public I0000Il00O add(Object obj) {
                        if (obj != null) {
/* 24 */                    return add((O011lOli) I0Iil01il0o.get(obj));
                        }
/* 25 */                I000II.I000iOII("adapter == null");
                        return null;
                    }
                }

/* 58 */        public static <T> O011lOli newAdapterFactory(Type type, O011ioiO1OI o011ioiO1OI) {
                    if (type == null) {
/* 61 */                I000II.I000iOII("type == null");
                        return null;
                    }
                    if (o011ioiO1OI != null) {
/* 59 */                return new I00000oIO(type, o011ioiO1OI);
                    }
/* 60 */            I000II.I000iOII("jsonAdapter == null");
                    return null;
                }

/* 154 */       public <T> O011ioiO1OI adapter(Class<T> cls) {
/* 155 */           return adapter(cls, Ooll10OlIOl0.NO_ANNOTATIONS);
                }

/* 155 */       public <T> O011ioiO1OI adapter(Type type, Class<? extends Annotation> cls) {
                    if (cls != null) {
/* 157 */               return adapter(type, Collections.singleton(OoOllol1Io1.createJsonQualifierImplementation(cls)));
                    }
/* 158 */           IOOlIIilOl0.I000II("annotationType == null");
                    return null;
                }

/* 158 */       public <T> O011ioiO1OI adapter(Type type, Class<? extends Annotation>... clsArr) {
/* 159 */           if (clsArr.length == 1) {
/* 160 */               return adapter(type, clsArr[0]);
                    }
/* 161 */           LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
                    for (Class<? extends Annotation> cls : clsArr) {
/* 163 */               linkedHashSet.add(OoOllol1Io1.createJsonQualifierImplementation(cls));
                    }
/* 164 */           return adapter(type, Collections.unmodifiableSet(linkedHashSet));
                }

/* 164 */       public <T> O011ioiO1OI adapter(Type type, Set<? extends Annotation> set) {
/* 165 */           return adapter(type, set, null);
                }

/* 165 */       public <T> O011ioiO1OI adapter(Type type) {
/* 166 */           return adapter(type, Ooll10OlIOl0.NO_ANNOTATIONS);
                }
            }
