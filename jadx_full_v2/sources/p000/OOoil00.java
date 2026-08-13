            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.HashMap;
            
            public final class OOoil00 extends OOoiOooI {
                public static final HashMap I0000oI00;
                public Constructor I00000oOI;
                public Object[] I0000Il00O;
                public HashMap I0000O;

                static {
/* 3 */             HashMap map = new HashMap();
/* 13 */            map.put(Byte.TYPE, (byte) 0);
/* 22 */            map.put(Short.TYPE, (short) 0);
/* 31 */            map.put(Integer.TYPE, 0);
/* 42 */            map.put(Long.TYPE, 0L);
/* 52 */            map.put(Float.TYPE, Float.valueOf(0.0f));
/* 63 */            map.put(Double.TYPE, Double.valueOf(0.0d));
/* 72 */            map.put(Character.TYPE, (char) 0);
/* 79 */            map.put(Boolean.TYPE, Boolean.FALSE);
/* 82 */            I0000oI00 = map;
                }

                @Override
                public final Object I0000O() {
/* 7 */             return (Object[]) this.I0000Il00O.clone();
                }

                @Override
                public final Object I0000oI00(Object obj) {
/* 1 */             Object[] objArr = (Object[]) obj;
/* 7 */             Constructor constructor = this.I00000oOI;
                    try {
/* 10 */                return constructor.newInstance(objArr);
                    } catch (IllegalAccessException e) {
/* 84 */                lIo000I lio000i = OOoi0l1.I00000oIO;
/* 88 */                OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 9 */                 return null;
                    } catch (IllegalArgumentException | InstantiationException e2) {
/* 82 */                throw new RuntimeException("Failed to invoke constructor '" + OOoi0l1.I00000oOI(constructor) + "' with args " + Arrays.toString(objArr), e2);
                    } catch (InvocationTargetException e3) {
/* 46 */                OIiilo1Ool0o.I000iOII("Failed to invoke constructor '" + OOoi0l1.I00000oOI(constructor) + "' with args " + Arrays.toString(objArr), e3.getCause());
/* 9 */                 return null;
                    }
                }

                @Override
                public final void I0001Ioi1lo(Object obj, O01loll1loll o01loll1loll, OOoiOl101 oOoiOl101) {
/* 1 */             Object[] objArr = (Object[]) obj;
/* 3 */             HashMap map = this.I0000O;
/* 5 */             String str = oOoiOl101.I0000Il00O;
/* 11 */            Integer num = (Integer) map.get(str);
/* 13 */            if (num == null) {
/* 215 */               throw new IllegalStateException("Could not find the index in the constructor '" + OOoi0l1.I00000oOI(this.I00000oOI) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                    }
/* 15 */            int iIntValue = num.intValue();
/* 21 */            Object objI00000oOI = oOoiOl101.I0001Ioi1lo.I00000oOI(o01loll1loll);
/* 25 */            if (objI00000oOI != null || !oOoiOl101.I000II) {
/* 58 */                objArr[iIntValue] = objI00000oOI;
                    } else {
/* 38 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("null is not allowed as value for record component '", str, "' of primitive type; at path ");
/* 47 */                sbI001IIilI0O.append(o01loll1loll.I001l0I00(false));
/* 57 */                throw new O01l1oO(sbI001IIilI0O.toString());
                    }
                }
            }
