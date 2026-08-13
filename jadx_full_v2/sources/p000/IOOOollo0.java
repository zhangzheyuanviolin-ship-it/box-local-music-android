            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
/* 5 */     public abstract class IOOOollo0 extends O011ioiO1OI {
                public static final O011lOli FACTORY = new I00000oIO();
                private final O011ioiO1OI elementAdapter;

                public class I00000oIO implements O011lOli {
                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 1 */                 Class<?> rawType = OoOllol1Io1.getRawType(type);
/* 10 */                if (!set.isEmpty()) {
/* 9 */                     return null;
                        }
/* 15 */                if (rawType == List.class || rawType == Collection.class) {
/* 40 */                    return IOOOollo0.newArrayListAdapter(type, oI011oo1).nullSafe();
                        }
/* 24 */                if (rawType == Set.class) {
/* 30 */                    return IOOOollo0.newLinkedHashSetAdapter(type, oI011oo1).nullSafe();
                        }
/* 9 */                 return null;
                    }
                }

                public class I00000oOI extends IOOOollo0 {
                    public I00000oOI(O011ioiO1OI o011ioiO1OI) {
/* 2 */                 super(o011ioiO1OI, null);
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 1 */                 return super.fromJson(o01lo1il);
                    }

                    @Override
                    public Collection<Object> newCollection() {
/* 3 */                 return new ArrayList();
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 3 */                 super.toJson(o01ooIO00oio, (Collection<Object>) obj);
                    }
                }

                public class I0000Il00O extends IOOOollo0 {
                    public I0000Il00O(O011ioiO1OI o011ioiO1OI) {
/* 2 */                 super(o011ioiO1OI, null);
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
/* 1 */                 return super.fromJson(o01lo1il);
                    }

                    @Override
                    public Set<Object> newCollection() {
/* 3 */                 return new LinkedHashSet();
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 3 */                 super.toJson(o01ooIO00oio, (Collection<Object>) obj);
                    }
                }

                private IOOOollo0(O011ioiO1OI o011ioiO1OI) {
/* 4 */             this.elementAdapter = o011ioiO1OI;
                }

                public static <T> O011ioiO1OI newArrayListAdapter(Type type, OI011oo1 oI011oo1) {
/* 13 */            return new I00000oOI(oI011oo1.adapter(OoOllol1Io1.collectionElementType(type, Collection.class)));
                }

                public static <T> O011ioiO1OI newLinkedHashSetAdapter(Type type, OI011oo1 oI011oo1) {
/* 13 */            return new I0000Il00O(oI011oo1.adapter(OoOllol1Io1.collectionElementType(type, Collection.class)));
                }

                @Override
                public Collection<Object> fromJson(O01lo1il o01lo1il) {
/* 1 */             Collection<Object> collectionNewCollection = newCollection();
/* 5 */             o01lo1il.beginArray();
/* 12 */            while (o01lo1il.hasNext()) {
/* 20 */                collectionNewCollection.add(this.elementAdapter.fromJson(o01lo1il));
                    }
/* 24 */            o01lo1il.endArray();
/* 49 */            return collectionNewCollection;
                }

                public abstract Collection<Object> newCollection();

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Collection<Object> collection) {
/* 1 */             o01ooIO00oio.beginArray();
/* 4 */             Iterator<Object> it = collection.iterator();
/* 12 */            while (it.hasNext()) {
/* 20 */                this.elementAdapter.toJson(o01ooIO00oio, it.next());
                    }
/* 24 */            o01ooIO00oio.endArray();
                }

                public String toString() {
/* 16 */            return this.elementAdapter + ".collection()";
                }

/* 6 */         public IOOOollo0(O011ioiO1OI o011ioiO1OI, I00000oIO i00000oIO) {
/* 7 */             this(o011ioiO1OI);
                }
            }
