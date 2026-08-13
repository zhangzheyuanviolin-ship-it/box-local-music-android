            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Type;
            import java.util.Map;
            import java.util.Set;
            
            public final class O1OiIOlI extends O011ioiO1OI {
                public static final O011lOli FACTORY = new I00000oIO();
                private final O011ioiO1OI keyAdapter;
                private final O011ioiO1OI valueAdapter;

                public class I00000oIO implements O011lOli {
                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
                        Class<?> rawType;
/* 5 */                 if (!set.isEmpty() || (rawType = OoOllol1Io1.getRawType(type)) != Map.class) {
/* 16 */                    return null;
                        }
/* 18 */                Type[] typeArrMapKeyAndValueTypes = OoOllol1Io1.mapKeyAndValueTypes(type, rawType);
/* 33 */                return new O1OiIOlI(oI011oo1, typeArrMapKeyAndValueTypes[0], typeArrMapKeyAndValueTypes[1]).nullSafe();
                    }
                }

                public O1OiIOlI(OI011oo1 oI011oo1, Type type, Type type2) {
/* 8 */             this.keyAdapter = oI011oo1.adapter(type);
/* 14 */            this.valueAdapter = oI011oo1.adapter(type2);
                }

                @Override
                public Map<Object, Object> fromJson(O01lo1il o01lo1il) {
/* 3 */             O100I1lloo o100I1lloo = new O100I1lloo();
/* 6 */             o01lo1il.beginObject();
/* 13 */            while (o01lo1il.hasNext()) {
/* 15 */                o01lo1il.promoteNameToValue();
/* 20 */                Object objFromJson = this.keyAdapter.fromJson(o01lo1il);
/* 26 */                Object objFromJson2 = this.valueAdapter.fromJson(o01lo1il);
/* 30 */                Object objPut = o100I1lloo.put(objFromJson, objFromJson2);
/* 34 */                if (objPut != null) {
/* 43 */                    StringBuilder sb = new StringBuilder("Map key '");
/* 46 */                    sb.append(objFromJson);
/* 49 */                    String path = o01lo1il.getPath();
/* 55 */                    sb.append("' has multiple values at path ");
/* 58 */                    sb.append(path);
/* 63 */                    sb.append(": ");
/* 66 */                    sb.append(objPut);
/* 71 */                    sb.append(" and ");
/* 74 */                    sb.append(objFromJson2);
/* 84 */                    throw new O01IiOo11l1o(sb.toString());
                        }
                    }
/* 85 */            o01lo1il.endObject();
/* 186 */           return o100I1lloo;
                }

                @Override
                public void toJson(O01ooIO00oio o01ooIO00oio, Map<Object, Object> map) {
/* 1 */             o01ooIO00oio.beginObject();
/* 16 */            for (Map.Entry<Object, Object> entry : map.entrySet()) {
/* 28 */                if (entry.getKey() == null) {
/* 58 */                    IoOOl0iOl1io.I000oI1ioi("Map key is null at ", o01ooIO00oio.getPath());
/* 61 */                    return;
                        } else {
/* 30 */                    o01ooIO00oio.promoteValueToName();
/* 39 */                    this.keyAdapter.toJson(o01ooIO00oio, entry.getKey());
/* 48 */                    this.valueAdapter.toJson(o01ooIO00oio, entry.getValue());
                        }
                    }
/* 62 */            o01ooIO00oio.endObject();
                }

                public String toString() {
/* 28 */            return "JsonAdapter(" + this.keyAdapter + "=" + this.valueAdapter + ")";
                }
            }
