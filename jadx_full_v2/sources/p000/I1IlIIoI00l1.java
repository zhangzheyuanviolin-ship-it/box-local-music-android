            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Array;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Set;
            
            public final class I1IlIIoI00l1 extends O011ioiO1OI {
                public static final O011lOli FACTORY = new I00000oIO();
                private final O011ioiO1OI elementAdapter;
                private final Class<?> elementClass;

                public class I00000oIO implements O011lOli {
                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 1 */                 Type typeArrayComponentType = OoOllol1Io1.arrayComponentType(type);
/* 5 */                 if (typeArrayComponentType != null && set.isEmpty()) {
/* 29 */                    return new I1IlIIoI00l1(OoOllol1Io1.getRawType(typeArrayComponentType), oI011oo1.adapter(typeArrayComponentType)).nullSafe();
                        }
/* 14 */                return null;
                    }
                }

                public I1IlIIoI00l1(Class<?> cls, O011ioiO1OI o011ioiO1OI) {
/* 4 */             this.elementClass = cls;
/* 6 */             this.elementAdapter = o011ioiO1OI;
                }

                @Override
                public Object fromJson(O01lo1il o01lo1il) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             o01lo1il.beginArray();
/* 13 */            while (o01lo1il.hasNext()) {
/* 21 */                arrayList.add(this.elementAdapter.fromJson(o01lo1il));
                    }
/* 25 */            o01lo1il.endArray();
/* 34 */            Object objNewInstance = Array.newInstance(this.elementClass, arrayList.size());
/* 43 */            for (int i = 0; i < arrayList.size(); i++) {
/* 49 */                Array.set(objNewInstance, i, arrayList.get(i));
                    }
/* 186 */           return objNewInstance;
                }

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */             o01ooIO00oio.beginArray();
/* 4 */             int length = Array.getLength(obj);
/* 9 */             for (int i = 0; i < length; i++) {
/* 17 */                this.elementAdapter.toJson(o01ooIO00oio, Array.get(obj, i));
                    }
/* 23 */            o01ooIO00oio.endArray();
                }

                public String toString() {
/* 16 */            return this.elementAdapter + ".array()";
                }
            }
