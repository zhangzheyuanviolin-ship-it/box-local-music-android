            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.HashMap;
            
            public final class lol1Iiii extends loio01lO {
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
                public final Object I0000Il00O() {
/* 7 */             return (Object[]) this.I0000Il00O.clone();
                }

                @Override
                public final void I0000O(Object obj, o0IlOioo o0iloioo, loill0OOio loill0ooio) {
/* 1 */             HashMap map = this.I0000O;
/* 3 */             String str = loill0ooio.I00000oOI;
/* 5 */             Object[] objArr = (Object[]) obj;
/* 11 */            Integer num = (Integer) map.get(str);
/* 13 */            if (num == null) {
/* 80 */                String strI0000O = o01l0i.I0000O(this.I00000oOI);
/* 84 */                int length = strI0000O.length();
/* 103 */               StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 68 + 310);
/* 110 */               IIl001iO0Io.I001lIiIIo1O(sb, "Could not find the index in the constructor '", strI0000O, "' for field with name '", str);
/* 115 */               sb.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
/* 408 */               throw new IllegalStateException(sb.toString());
                    }
/* 15 */            int iIntValue = num.intValue();
/* 21 */            Object objI00000oIO = loill0ooio.I0000Il00O.I00000oIO(o0iloioo);
/* 25 */            if (objI00000oIO == null && loill0ooio.I0000O) {
/* 35 */                String strI00100l0 = o0iloioo.I00100l0(false);
/* 72 */                throw new IOiIIo1l(IIl001iO0Io.I00100o1O0lo(new StringBuilder(String.valueOf(str).length() + 80 + strI00100l0.length()), "null is not allowed as value for record component '", str, "' of primitive type; at path ", strI00100l0), 25);
                    }
/* 73 */            objArr[iIntValue] = objI00000oIO;
                }

                @Override
                public final Object I0000oI00(Object obj) {
/* 1 */             Object[] objArr = (Object[]) obj;
/* 3 */             Constructor constructor = this.I00000oOI;
                    try {
/* 10 */                return constructor.newInstance(objArr);
                    } catch (IllegalAccessException e) {
/* 94 */                ll1I00l ll1i00l = o01l0i.I00000oIO;
/* 98 */                OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 9 */                 return null;
                    } catch (IllegalArgumentException | InstantiationException e2) {
/* 57 */                String strI0000O = o01l0i.I0000O(constructor);
/* 61 */                String string = Arrays.toString(objArr);
/* 89 */                OIiilo1Ool0o.I000iOII(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI0000O.length() + 42 + String.valueOf(string).length()), "Failed to invoke constructor '", strI0000O, "' with args ", string), e2);
/* 9 */                 return null;
                    } catch (InvocationTargetException e3) {
/* 16 */                String strI0000O2 = o01l0i.I0000O(constructor);
/* 20 */                String string2 = Arrays.toString(objArr);
/* 52 */                OIiilo1Ool0o.I000iOII(IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI0000O2.length() + 42 + String.valueOf(string2).length()), "Failed to invoke constructor '", strI0000O2, "' with args ", string2), e3.getCause());
/* 9 */                 return null;
                    }
                }
            }
