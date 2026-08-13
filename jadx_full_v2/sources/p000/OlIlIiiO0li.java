            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.O01lo1il;
            
/* 3 */     public final class OlIlIiiO0li {
                private static final String ERROR_FORMAT = "Expected %s but was %s at path %s";
                public static final O011lOli FACTORY = new I00000oOI();
                static final O011ioiO1OI BOOLEAN_JSON_ADAPTER = new I0000Il00O();
                static final O011ioiO1OI BYTE_JSON_ADAPTER = new I0000O();
                static final O011ioiO1OI CHARACTER_JSON_ADAPTER = new I0000oI00();
                static final O011ioiO1OI DOUBLE_JSON_ADAPTER = new I0001Ioi1lo();
                static final O011ioiO1OI FLOAT_JSON_ADAPTER = new I000II();
                static final O011ioiO1OI INTEGER_JSON_ADAPTER = new I000O01llI0();
                static final O011ioiO1OI LONG_JSON_ADAPTER = new I000OOo1O();
                static final O011ioiO1OI SHORT_JSON_ADAPTER = new I000OiO();
                static final O011ioiO1OI STRING_JSON_ADAPTER = new I00000oIO();

                public class I00000oOI implements O011lOli {
                    @Override
                    public O011ioiO1OI create(Type type, Set<? extends Annotation> set, OI011oo1 oI011oo1) {
/* 6 */                 if (!set.isEmpty()) {
/* 5 */                     return null;
                        }
/* 11 */                if (type == Boolean.TYPE) {
/* 13 */                    return OlIlIiiO0li.BOOLEAN_JSON_ADAPTER;
                        }
/* 18 */                if (type == Byte.TYPE) {
/* 20 */                    return OlIlIiiO0li.BYTE_JSON_ADAPTER;
                        }
/* 25 */                if (type == Character.TYPE) {
/* 27 */                    return OlIlIiiO0li.CHARACTER_JSON_ADAPTER;
                        }
/* 32 */                if (type == Double.TYPE) {
/* 34 */                    return OlIlIiiO0li.DOUBLE_JSON_ADAPTER;
                        }
/* 39 */                if (type == Float.TYPE) {
/* 41 */                    return OlIlIiiO0li.FLOAT_JSON_ADAPTER;
                        }
/* 46 */                if (type == Integer.TYPE) {
/* 48 */                    return OlIlIiiO0li.INTEGER_JSON_ADAPTER;
                        }
/* 53 */                if (type == Long.TYPE) {
/* 55 */                    return OlIlIiiO0li.LONG_JSON_ADAPTER;
                        }
/* 60 */                if (type == Short.TYPE) {
/* 62 */                    return OlIlIiiO0li.SHORT_JSON_ADAPTER;
                        }
/* 67 */                if (type == Boolean.class) {
/* 71 */                    return OlIlIiiO0li.BOOLEAN_JSON_ADAPTER.nullSafe();
                        }
/* 78 */                if (type == Byte.class) {
/* 82 */                    return OlIlIiiO0li.BYTE_JSON_ADAPTER.nullSafe();
                        }
/* 89 */                if (type == Character.class) {
/* 93 */                    return OlIlIiiO0li.CHARACTER_JSON_ADAPTER.nullSafe();
                        }
/* 100 */               if (type == Double.class) {
/* 104 */                   return OlIlIiiO0li.DOUBLE_JSON_ADAPTER.nullSafe();
                        }
/* 111 */               if (type == Float.class) {
/* 115 */                   return OlIlIiiO0li.FLOAT_JSON_ADAPTER.nullSafe();
                        }
/* 122 */               if (type == Integer.class) {
/* 126 */                   return OlIlIiiO0li.INTEGER_JSON_ADAPTER.nullSafe();
                        }
/* 133 */               if (type == Long.class) {
/* 137 */                   return OlIlIiiO0li.LONG_JSON_ADAPTER.nullSafe();
                        }
/* 144 */               if (type == Short.class) {
/* 148 */                   return OlIlIiiO0li.SHORT_JSON_ADAPTER.nullSafe();
                        }
/* 155 */               if (type == String.class) {
/* 159 */                   return OlIlIiiO0li.STRING_JSON_ADAPTER.nullSafe();
                        }
/* 166 */               if (type == Object.class) {
/* 173 */                   return new I000l1(oI011oo1).nullSafe();
                        }
/* 178 */               Class<?> rawType = OoOllol1Io1.getRawType(type);
/* 182 */               O011ioiO1OI o011ioiO1OIGeneratedAdapter = Ooll10OlIOl0.generatedAdapter(oI011oo1, type, rawType);
/* 186 */               if (o011ioiO1OIGeneratedAdapter != null) {
/* 188 */                   return o011ioiO1OIGeneratedAdapter;
                        }
/* 193 */               if (rawType.isEnum()) {
/* 200 */                   return new I000iOII(rawType).nullSafe();
                        }
/* 5 */                 return null;
                    }
                }

                public class I0000Il00O extends O011ioiO1OI {
                    @Override
                    public Boolean fromJson(O01lo1il o01lo1il) {
/* 5 */                 return Boolean.valueOf(o01lo1il.nextBoolean());
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Boolean bool) {
/* 5 */                 o01ooIO00oio.value(bool.booleanValue());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Boolean)";
                    }
                }

                public class I0000O extends O011ioiO1OI {
                    @Override
                    public Byte fromJson(O01lo1il o01lo1il) {
/* 12 */                return Byte.valueOf((byte) OlIlIiiO0li.rangeCheckNextInt(o01lo1il, "a byte", -128, 255));
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Byte b) {
/* 8 */                 o01ooIO00oio.value(b.intValue() & 255);
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Byte)";
                    }
                }

                public class I0000oI00 extends O011ioiO1OI {
                    @Override
                    public Character fromJson(O01lo1il o01lo1il) {
/* 1 */                 String strNextString = o01lo1il.nextString();
/* 10 */                if (strNextString.length() <= 1) {
/* 17 */                    return Character.valueOf(strNextString.charAt(0));
                        }
/* 49 */                throw new O01IiOo11l1o(IIl001iO0Io.I000oI1ioi("Expected a char but was ", IIl001iO0Io.I000iOII('\"', "\"", strNextString), " at path ", o01lo1il.getPath()));
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Character ch) {
/* 5 */                 o01ooIO00oio.value(ch.toString());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Character)";
                    }
                }

                public class I0001Ioi1lo extends O011ioiO1OI {
                    @Override
                    public Double fromJson(O01lo1il o01lo1il) {
/* 5 */                 return Double.valueOf(o01lo1il.nextDouble());
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Double d) {
/* 5 */                 o01ooIO00oio.value(d.doubleValue());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Double)";
                    }
                }

                public class I000II extends O011ioiO1OI {
                    @Override
                    public Float fromJson(O01lo1il o01lo1il) {
/* 5 */                 float fNextDouble = (float) o01lo1il.nextDouble();
/* 10 */                if (o01lo1il.isLenient() || !Float.isInfinite(fNextDouble)) {
/* 51 */                    return Float.valueOf(fNextDouble);
                        }
/* 50 */                throw new O01IiOo11l1o("JSON forbids NaN and infinities: " + fNextDouble + " at path " + o01lo1il.getPath());
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Float f) {
/* 1 */                 f.getClass();
/* 4 */                 o01ooIO00oio.value(f);
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Float)";
                    }
                }

                public class I000O01llI0 extends O011ioiO1OI {
                    @Override
                    public Integer fromJson(O01lo1il o01lo1il) {
/* 5 */                 return Integer.valueOf(o01lo1il.nextInt());
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Integer num) {
/* 6 */                 o01ooIO00oio.value(num.intValue());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Integer)";
                    }
                }

                public class I000OOo1O extends O011ioiO1OI {
                    @Override
                    public Long fromJson(O01lo1il o01lo1il) {
/* 5 */                 return Long.valueOf(o01lo1il.nextLong());
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Long l) {
/* 5 */                 o01ooIO00oio.value(l.longValue());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Long)";
                    }
                }

                public class I000OiO extends O011ioiO1OI {
                    @Override
                    public Short fromJson(O01lo1il o01lo1il) {
/* 12 */                return Short.valueOf((short) OlIlIiiO0li.rangeCheckNextInt(o01lo1il, "a short", -32768, 32767));
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Short sh) {
/* 6 */                 o01ooIO00oio.value(sh.intValue());
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Short)";
                    }
                }

                public static final class I000iOII extends O011ioiO1OI {
                    private final Enum<Object>[] constants;
                    private final Class<Enum<Object>> enumType;
                    private final String[] nameStrings;
                    private final O01lo1il.I00000oIO options;

                    public I000iOII(Class<Enum<Object>> cls) {
/* 4 */                 this.enumType = cls;
                        try {
/* 6 */                     Enum<Object>[] enumConstants = cls.getEnumConstants();
/* 12 */                    this.constants = enumConstants;
/* 17 */                    this.nameStrings = new String[enumConstants.length];
/* 19 */                    int i = 0;
                            while (true) {
/* 20 */                        Enum<Object>[] enumArr = this.constants;
/* 23 */                        if (i >= enumArr.length) {
/* 54 */                            this.options = O01lo1il.I00000oIO.of(this.nameStrings);
/* 56 */                            return;
                                } else {
/* 27 */                            String strName = enumArr[i].name();
/* 41 */                            this.nameStrings[i] = Ooll10OlIOl0.jsonName(strName, cls.getField(strName));
/* 43 */                            i++;
                                }
                            }
                        } catch (NoSuchFieldException e) {
/* 186 */                   throw new AssertionError("Missing field in ".concat(cls.getName()), e);
                        }
                    }

                    @Override
                    public Enum<Object> fromJson(O01lo1il o01lo1il) {
/* 3 */                 int iSelectString = o01lo1il.selectString(this.options);
/* 8 */                 if (iSelectString != -1) {
/* 12 */                    return this.constants[iSelectString];
                        }
/* 15 */                String path = o01lo1il.getPath();
/* 19 */                String strNextString = o01lo1il.nextString();
/* 186 */               throw new O01IiOo11l1o("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + strNextString + " at path " + path);
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Enum<Object> r2) {
/* 9 */                 o01ooIO00oio.value(this.nameStrings[r2.ordinal()]);
                    }

                    public String toString() {
/* 22 */                return "JsonAdapter(" + this.enumType.getName() + ")";
                    }
                }

                public static final class I000l1 extends O011ioiO1OI {
                    private final O011ioiO1OI booleanAdapter;
                    private final O011ioiO1OI doubleAdapter;
                    private final O011ioiO1OI listJsonAdapter;
                    private final O011ioiO1OI mapAdapter;
                    private final OI011oo1 moshi;
                    private final O011ioiO1OI stringAdapter;

                    public I000l1(OI011oo1 oI011oo1) {
/* 4 */                 this.moshi = oI011oo1;
/* 12 */                this.listJsonAdapter = oI011oo1.adapter(List.class);
/* 20 */                this.mapAdapter = oI011oo1.adapter(Map.class);
/* 28 */                this.stringAdapter = oI011oo1.adapter(String.class);
/* 36 */                this.doubleAdapter = oI011oo1.adapter(Double.class);
/* 44 */                this.booleanAdapter = oI011oo1.adapter(Boolean.class);
                    }

                    private Class<?> toJsonType(Class<?> cls) {
                        return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
                    }

                    @Override
                    public Object fromJson(O01lo1il o01lo1il) {
                        switch (OlIlIio1.$SwitchMap$com$squareup$moshi$JsonReader$Token[o01lo1il.peek().ordinal()]) {
                            case 1:
/* 76 */                        return this.listJsonAdapter.fromJson(o01lo1il);
                            case 2:
/* 69 */                        return this.mapAdapter.fromJson(o01lo1il);
                            case 3:
/* 62 */                        return this.stringAdapter.fromJson(o01lo1il);
                            case 4:
/* 55 */                        return this.doubleAdapter.fromJson(o01lo1il);
                            case 5:
/* 48 */                        return this.booleanAdapter.fromJson(o01lo1il);
                            case 6:
/* 41 */                        return o01lo1il.nextNull();
                            default:
/* 20 */                        StringBuilder sb = new StringBuilder("Expected a value but was ");
/* 27 */                        sb.append(o01lo1il.peek());
/* 36 */                        IoOOl0iOl1io.I000lI(sb, " at path ", o01lo1il.getPath());
/* 39 */                        return null;
                        }
                    }

                    @Override
                    public void toJson(O01ooIO00oio o01ooIO00oio, Object obj) {
/* 1 */                 Class<?> cls = obj.getClass();
/* 7 */                 if (cls != Object.class) {
/* 28 */                    this.moshi.adapter(toJsonType(cls), Ooll10OlIOl0.NO_ANNOTATIONS).toJson(o01ooIO00oio, obj);
                        } else {
/* 9 */                     o01ooIO00oio.beginObject();
/* 12 */                    o01ooIO00oio.endObject();
                        }
                    }

                    public String toString() {
/* 1 */                 return "JsonAdapter(Object)";
                    }
                }

                private OlIlIiiO0li() {
                }

                public static int rangeCheckNextInt(O01lo1il o01lo1il, String str, int i, int i2) {
/* 1 */             int iNextInt = o01lo1il.nextInt();
/* 5 */             if (iNextInt >= i && iNextInt <= i2) {
/* 9 */                 return iNextInt;
                    }
/* 12 */            String path = o01lo1il.getPath();
/* 22 */            StringBuilder sbI00111O = IIlIOloOOO.I00111O(iNextInt, "Expected ", str, " but was ", " at path ");
/* 26 */            sbI00111O.append(path);
/* 483 */           throw new O01IiOo11l1o(sbI00111O.toString());
                }

/* 4 */         public class I00000oIO extends O011ioiO1OI {
                    public String toString() {
/* 1 */                 return "JsonAdapter(String)";
                    }

                    @Override
/* 5 */             public String fromJson(O01lo1il o01lo1il) {
/* 6 */                 return o01lo1il.nextString();
                    }

                    @Override
/* 6 */             public void toJson(O01ooIO00oio o01ooIO00oio, String str) {
/* 7 */                 o01ooIO00oio.value(str);
                    }
                }
            }
