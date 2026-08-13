            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.HashMap;
            
            public class Il0lo10Ii implements OoO00iO0OOl0 {
                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) throws SecurityException {
/* 1 */             Class superclass = ooOilO.I00000oIO;
/* 10 */            if (Enum.class.isAssignableFrom(superclass) && superclass != Enum.class) {
/* 20 */                if (!superclass.isEnum()) {
/* 22 */                    superclass = superclass.getSuperclass();
                        }
/* 28 */                Il0loIIolo il0loIIolo = new Il0loIIolo();
                        try {
/* 31 */                    Field[] declaredFields = superclass.getDeclaredFields();
/* 38 */                    int i = 0;
/* 39 */                    for (Field field : declaredFields) {
/* 47 */                        if (field.isEnumConstant()) {
/* 51 */                            declaredFields[i] = field;
/* 49 */                            i++;
                                }
                            }
/* 65 */                    Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
/* 76 */                    int iCeil = (int) Math.ceil(i / 0.75f);
/* 79 */                    HashMap map = new HashMap(iCeil);
/* 82 */                    il0loIIolo.I00000oIO = map;
/* 89 */                    il0loIIolo.I00000oOI = new HashMap(iCeil);
/* 96 */                    il0loIIolo.I0000Il00O = new HashMap(iCeil);
/* 99 */                    AccessibleObject.setAccessible(fieldArr, true);
/* 104 */                   for (Field field2 : fieldArr) {
/* 112 */                       Enum r5 = (Enum) field2.get(null);
/* 114 */                       String strName = r5.name();
/* 118 */                       String string = r5.toString();
/* 128 */                       OiliO0I oiliO0I = (OiliO0I) field2.getAnnotation(OiliO0I.class);
/* 130 */                       if (oiliO0I != null) {
/* 132 */                           strName = oiliO0I.value();
/* 142 */                           for (String str : oiliO0I.alternate()) {
/* 146 */                               map.put(str, r5);
                                    }
                                }
/* 152 */                       map.put(strName, r5);
/* 157 */                       il0loIIolo.I00000oOI.put(string, r5);
/* 162 */                       il0loIIolo.I0000Il00O.put(r5, strName);
                            }
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   return il0loIIolo;
                        } catch (IllegalAccessException e) {
/* 172 */                   I000II.I000O01llI0(e);
                        }
                    }
/* 9 */             return null;
                }
            }
